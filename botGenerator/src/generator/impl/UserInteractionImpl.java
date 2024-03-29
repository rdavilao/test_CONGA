/**
 */
package generator.impl;

import generator.Action;
import generator.BackToBot;
import generator.BotInteraction;
import generator.GeneratorPackage;
import generator.Intent;
import generator.UserInteraction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.UserInteractionImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link generator.impl.UserInteractionImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link generator.impl.UserInteractionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link generator.impl.UserInteractionImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.UserInteractionImpl#getBackTo <em>Back To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInteractionImpl extends InteractionImpl implements UserInteraction {
	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Intent intent;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected BotInteraction target;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBackTo() <em>Back To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackTo()
	 * @generated
	 * @ordered
	 */
	protected BackToBot backTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.USER_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Intent getIntent() {
		if (intent != null && intent.eIsProxy()) {
			InternalEObject oldIntent = (InternalEObject)intent;
			intent = (Intent)eResolveProxy(oldIntent);
			if (intent != oldIntent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.USER_INTERACTION__INTENT, oldIntent, intent));
			}
		}
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intent basicGetIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntent(Intent newIntent) {
		Intent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.USER_INTERACTION__INTENT, oldIntent, intent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BotInteraction getSrc() {
		if (eContainerFeatureID() != GeneratorPackage.USER_INTERACTION__SRC) return null;
		return (BotInteraction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(BotInteraction newSrc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSrc, GeneratorPackage.USER_INTERACTION__SRC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc(BotInteraction newSrc) {
		if (newSrc != eInternalContainer() || (eContainerFeatureID() != GeneratorPackage.USER_INTERACTION__SRC && newSrc != null)) {
			if (EcoreUtil.isAncestor(this, newSrc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSrc != null)
				msgs = ((InternalEObject)newSrc).eInverseAdd(this, GeneratorPackage.BOT_INTERACTION__OUTCOMING, BotInteraction.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.USER_INTERACTION__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BotInteraction getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(BotInteraction newTarget, NotificationChain msgs) {
		BotInteraction oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.USER_INTERACTION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(BotInteraction newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, GeneratorPackage.BOT_INTERACTION__INCOMING, BotInteraction.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GeneratorPackage.BOT_INTERACTION__INCOMING, BotInteraction.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.USER_INTERACTION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.USER_INTERACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackToBot getBackTo() {
		return backTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackTo(BackToBot newBackTo, NotificationChain msgs) {
		BackToBot oldBackTo = backTo;
		backTo = newBackTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.USER_INTERACTION__BACK_TO, oldBackTo, newBackTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackTo(BackToBot newBackTo) {
		if (newBackTo != backTo) {
			NotificationChain msgs = null;
			if (backTo != null)
				msgs = ((InternalEObject)backTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.USER_INTERACTION__BACK_TO, null, msgs);
			if (newBackTo != null)
				msgs = ((InternalEObject)newBackTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.USER_INTERACTION__BACK_TO, null, msgs);
			msgs = basicSetBackTo(newBackTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.USER_INTERACTION__BACK_TO, newBackTo, newBackTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.USER_INTERACTION__SRC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSrc((BotInteraction)otherEnd, msgs);
			case GeneratorPackage.USER_INTERACTION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.USER_INTERACTION__TARGET, null, msgs);
				return basicSetTarget((BotInteraction)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.USER_INTERACTION__SRC:
				return basicSetSrc(null, msgs);
			case GeneratorPackage.USER_INTERACTION__TARGET:
				return basicSetTarget(null, msgs);
			case GeneratorPackage.USER_INTERACTION__BACK_TO:
				return basicSetBackTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GeneratorPackage.USER_INTERACTION__SRC:
				return eInternalContainer().eInverseRemove(this, GeneratorPackage.BOT_INTERACTION__OUTCOMING, BotInteraction.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorPackage.USER_INTERACTION__INTENT:
				if (resolve) return getIntent();
				return basicGetIntent();
			case GeneratorPackage.USER_INTERACTION__SRC:
				return getSrc();
			case GeneratorPackage.USER_INTERACTION__TARGET:
				return getTarget();
			case GeneratorPackage.USER_INTERACTION__NAME:
				return getName();
			case GeneratorPackage.USER_INTERACTION__BACK_TO:
				return getBackTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratorPackage.USER_INTERACTION__INTENT:
				setIntent((Intent)newValue);
				return;
			case GeneratorPackage.USER_INTERACTION__SRC:
				setSrc((BotInteraction)newValue);
				return;
			case GeneratorPackage.USER_INTERACTION__TARGET:
				setTarget((BotInteraction)newValue);
				return;
			case GeneratorPackage.USER_INTERACTION__NAME:
				setName((String)newValue);
				return;
			case GeneratorPackage.USER_INTERACTION__BACK_TO:
				setBackTo((BackToBot)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeneratorPackage.USER_INTERACTION__INTENT:
				setIntent((Intent)null);
				return;
			case GeneratorPackage.USER_INTERACTION__SRC:
				setSrc((BotInteraction)null);
				return;
			case GeneratorPackage.USER_INTERACTION__TARGET:
				setTarget((BotInteraction)null);
				return;
			case GeneratorPackage.USER_INTERACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeneratorPackage.USER_INTERACTION__BACK_TO:
				setBackTo((BackToBot)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeneratorPackage.USER_INTERACTION__INTENT:
				return intent != null;
			case GeneratorPackage.USER_INTERACTION__SRC:
				return getSrc() != null;
			case GeneratorPackage.USER_INTERACTION__TARGET:
				return target != null;
			case GeneratorPackage.USER_INTERACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GeneratorPackage.USER_INTERACTION__BACK_TO:
				return backTo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intent == null) ? 0 : intent.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInteractionImpl other = (UserInteractionImpl) obj;
		if (intent == null) {
			if (other.intent != null)
				return false;
		} else if (!intent.equals(other.intent))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		return true;
	}

	@Override
	public boolean flowHasAction(Action action) {
		if (this.getTarget() == null) {
			return false;
		}
		return this.target.flowHasAction(action);
	}
	
} //UserInteractionImpl
