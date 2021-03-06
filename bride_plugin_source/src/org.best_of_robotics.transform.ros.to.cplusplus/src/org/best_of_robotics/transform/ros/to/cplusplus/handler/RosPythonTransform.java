/**
 * 
 */
package org.best_of_robotics.transform.ros.to.cplusplus.handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.best_of_robotics.transform.service.ITransformService;
import org.best_of_robotics.transform.service.access.TransformAccessActivator;
import org.best_of_robotics.transform.service.parameter.IEglTransformParameter;
import org.best_of_robotics.transform.service.parameter.TransformParameterFactory;
import org.best_of_robotics.transform.ros.to.cplusplus.Activator;
import org.best_of_robotics.transform.ros.to.cplusplus.EGLTransformer;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;

/**
 * @author Alex
 *
 */
public class RosPythonTransform extends AbstractHandler {
	
	public RosPythonTransform() {		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile sourcefile = null;
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor != null) {
            IEditorInput input = editor.getEditorInput();
            if (input instanceof IFileEditorInput) {
            	sourcefile = ((IFileEditorInput)input).getFile();
            	System.out.println("File from editor: " + sourcefile.getLocation().toOSString());
            	if(sourcefile.getFileExtension().compareTo("ros_package") != 0 && sourcefile.getFileExtension().compareTo("ros_package_diagram")!=0)
            	{
            		sourcefile = null;
            		MessageDialog
					.openError(
							PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getShell(),
							"Error on Editor Selection 2",
							"Please select the editor from which you want to generate code and execute command again.");
            	}
            	try {
					int errors = sourcefile.getProject().findMaxProblemSeverity(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
					if(errors != -1)
					{
						sourcefile = null;
	            		MessageDialog
						.openError(
								PlatformUI.getWorkbench()
										.getActiveWorkbenchWindow().getShell(),
								"Model problem found",
								"Your model is not valid yet. Please fix the issues you find in the Problems tab before generating code out of this model.");
					}
                } catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                
            }
        }
		
		
		if(sourcefile == null)
			return null;
		
		//configure new transform parameter
		String cmd = "rospack find bride_templates";
		String template_dir = "";
		Runtime run = Runtime.getRuntime();
		Process pr;
		try {
			pr = run.exec(cmd);
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			template_dir = buf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(template_dir.length() == 0)
		{
			System.out.println("Couldn't find template package");
			return null;
		}
		
		System.out.println("Taking transformation: " + template_dir + "/python/package/package.egl");
		
		IEglTransformParameter eglTransformParameter = TransformParameterFactory.createEglTransformParameter();
		eglTransformParameter.setTransformName("ROS Package to python implementation");
		eglTransformParameter.setEglTransform("file://" + template_dir + "/python/package/package.egl");
		eglTransformParameter.setPluginID(Activator.PLUGIN_ID);
		eglTransformParameter.setSourceMetaModelURI("http://ros/1.0");
		eglTransformParameter.setSourceModelFilePath(sourcefile.getLocation().removeFileExtension().toOSString() + ".ros_package");
		eglTransformParameter.setSourceName("Source");
		eglTransformParameter.setSourceReadOnLoad(true);
		eglTransformParameter.setSourceStoreOnDisposal(false);
		
		eglTransformParameter.setOutputRoot("file:" + sourcefile.getProject().getLocation().toOSString());
		
		//get transform service
		
		
		//do transform
		EGLTransformer transformer = new EGLTransformer(eglTransformParameter);
		transformer.transform();
		
		return null;
	}

}
