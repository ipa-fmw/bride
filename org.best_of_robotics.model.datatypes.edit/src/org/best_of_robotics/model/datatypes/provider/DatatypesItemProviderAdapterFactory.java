/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.best_of_robotics.model.datatypes.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.best_of_robotics.model.datatypes.util.DatatypesAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesItemProviderAdapterFactory extends DatatypesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.TypesLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesLibraryItemProvider typesLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.TypesLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypesLibraryAdapter() {
		if (typesLibraryItemProvider == null) {
			typesLibraryItemProvider = new TypesLibraryItemProvider(this);
		}

		return typesLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.RosIDLReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosIDLReferenceItemProvider rosIDLReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.RosIDLReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRosIDLReferenceAdapter() {
		if (rosIDLReferenceItemProvider == null) {
			rosIDLReferenceItemProvider = new RosIDLReferenceItemProvider(this);
		}

		return rosIDLReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.VectorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorTypeItemProvider vectorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.VectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVectorTypeAdapter() {
		if (vectorTypeItemProvider == null) {
			vectorTypeItemProvider = new VectorTypeItemProvider(this);
		}

		return vectorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.CustomType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomTypeItemProvider customTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.CustomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomTypeAdapter() {
		if (customTypeItemProvider == null) {
			customTypeItemProvider = new CustomTypeItemProvider(this);
		}

		return customTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.Field} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldItemProvider fieldItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFieldAdapter() {
		if (fieldItemProvider == null) {
			fieldItemProvider = new FieldItemProvider(this);
		}

		return fieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.Int} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntItemProvider intItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.Int}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntAdapter() {
		if (intItemProvider == null) {
			intItemProvider = new IntItemProvider(this);
		}

		return intItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.Double} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleItemProvider doubleItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoubleAdapter() {
		if (doubleItemProvider == null) {
			doubleItemProvider = new DoubleItemProvider(this);
		}

		return doubleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.Char} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharItemProvider charItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.Char}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharAdapter() {
		if (charItemProvider == null) {
			charItemProvider = new CharItemProvider(this);
		}

		return charItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.Float} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatItemProvider floatItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFloatAdapter() {
		if (floatItemProvider == null) {
			floatItemProvider = new FloatItemProvider(this);
		}

		return floatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.Short} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortItemProvider shortItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.Short}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShortAdapter() {
		if (shortItemProvider == null) {
			shortItemProvider = new ShortItemProvider(this);
		}

		return shortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.String} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringItemProvider stringItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringAdapter() {
		if (stringItemProvider == null) {
			stringItemProvider = new StringItemProvider(this);
		}

		return stringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.Long} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongItemProvider longItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLongAdapter() {
		if (longItemProvider == null) {
			longItemProvider = new LongItemProvider(this);
		}

		return longItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.UnsignedInt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsignedIntItemProvider unsignedIntItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnsignedIntAdapter() {
		if (unsignedIntItemProvider == null) {
			unsignedIntItemProvider = new UnsignedIntItemProvider(this);
		}

		return unsignedIntItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.UnsignedChar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsignedCharItemProvider unsignedCharItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.UnsignedChar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnsignedCharAdapter() {
		if (unsignedCharItemProvider == null) {
			unsignedCharItemProvider = new UnsignedCharItemProvider(this);
		}

		return unsignedCharItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.UnsignedShort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsignedShortItemProvider unsignedShortItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.UnsignedShort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnsignedShortAdapter() {
		if (unsignedShortItemProvider == null) {
			unsignedShortItemProvider = new UnsignedShortItemProvider(this);
		}

		return unsignedShortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.UnsignedLong} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsignedLongItemProvider unsignedLongItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.UnsignedLong}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnsignedLongAdapter() {
		if (unsignedLongItemProvider == null) {
			unsignedLongItemProvider = new UnsignedLongItemProvider(this);
		}

		return unsignedLongItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.best_of_robotics.model.datatypes.Bool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolItemProvider boolItemProvider;

	/**
	 * This creates an adapter for a {@link org.best_of_robotics.model.datatypes.Bool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoolAdapter() {
		if (boolItemProvider == null) {
			boolItemProvider = new BoolItemProvider(this);
		}

		return boolItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (typesLibraryItemProvider != null) typesLibraryItemProvider.dispose();
		if (rosIDLReferenceItemProvider != null) rosIDLReferenceItemProvider.dispose();
		if (vectorTypeItemProvider != null) vectorTypeItemProvider.dispose();
		if (customTypeItemProvider != null) customTypeItemProvider.dispose();
		if (fieldItemProvider != null) fieldItemProvider.dispose();
		if (intItemProvider != null) intItemProvider.dispose();
		if (doubleItemProvider != null) doubleItemProvider.dispose();
		if (charItemProvider != null) charItemProvider.dispose();
		if (floatItemProvider != null) floatItemProvider.dispose();
		if (shortItemProvider != null) shortItemProvider.dispose();
		if (stringItemProvider != null) stringItemProvider.dispose();
		if (longItemProvider != null) longItemProvider.dispose();
		if (unsignedIntItemProvider != null) unsignedIntItemProvider.dispose();
		if (unsignedCharItemProvider != null) unsignedCharItemProvider.dispose();
		if (unsignedShortItemProvider != null) unsignedShortItemProvider.dispose();
		if (unsignedLongItemProvider != null) unsignedLongItemProvider.dispose();
		if (boolItemProvider != null) boolItemProvider.dispose();
	}

}
