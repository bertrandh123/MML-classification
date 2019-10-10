/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.mml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.mml.FormulaItem;
import org.xtext.example.mydsl.mml.MmlPackage;
import org.xtext.example.mydsl.mml.RFormula;
import org.xtext.example.mydsl.mml.XFormula;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RFormula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.RFormulaImpl#getPredictive <em>Predictive</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mml.impl.RFormulaImpl#getPredictors <em>Predictors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RFormulaImpl extends MinimalEObjectImpl.Container implements RFormula
{
  /**
   * The cached value of the '{@link #getPredictive() <em>Predictive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredictive()
   * @generated
   * @ordered
   */
  protected FormulaItem predictive;

  /**
   * The cached value of the '{@link #getPredictors() <em>Predictors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredictors()
   * @generated
   * @ordered
   */
  protected XFormula predictors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RFormulaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MmlPackage.Literals.RFORMULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormulaItem getPredictive()
  {
    return predictive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredictive(FormulaItem newPredictive, NotificationChain msgs)
  {
    FormulaItem oldPredictive = predictive;
    predictive = newPredictive;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmlPackage.RFORMULA__PREDICTIVE, oldPredictive, newPredictive);
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
  public void setPredictive(FormulaItem newPredictive)
  {
    if (newPredictive != predictive)
    {
      NotificationChain msgs = null;
      if (predictive != null)
        msgs = ((InternalEObject)predictive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MmlPackage.RFORMULA__PREDICTIVE, null, msgs);
      if (newPredictive != null)
        msgs = ((InternalEObject)newPredictive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MmlPackage.RFORMULA__PREDICTIVE, null, msgs);
      msgs = basicSetPredictive(newPredictive, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.RFORMULA__PREDICTIVE, newPredictive, newPredictive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XFormula getPredictors()
  {
    return predictors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredictors(XFormula newPredictors, NotificationChain msgs)
  {
    XFormula oldPredictors = predictors;
    predictors = newPredictors;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmlPackage.RFORMULA__PREDICTORS, oldPredictors, newPredictors);
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
  public void setPredictors(XFormula newPredictors)
  {
    if (newPredictors != predictors)
    {
      NotificationChain msgs = null;
      if (predictors != null)
        msgs = ((InternalEObject)predictors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MmlPackage.RFORMULA__PREDICTORS, null, msgs);
      if (newPredictors != null)
        msgs = ((InternalEObject)newPredictors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MmlPackage.RFORMULA__PREDICTORS, null, msgs);
      msgs = basicSetPredictors(newPredictors, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MmlPackage.RFORMULA__PREDICTORS, newPredictors, newPredictors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MmlPackage.RFORMULA__PREDICTIVE:
        return basicSetPredictive(null, msgs);
      case MmlPackage.RFORMULA__PREDICTORS:
        return basicSetPredictors(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MmlPackage.RFORMULA__PREDICTIVE:
        return getPredictive();
      case MmlPackage.RFORMULA__PREDICTORS:
        return getPredictors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MmlPackage.RFORMULA__PREDICTIVE:
        setPredictive((FormulaItem)newValue);
        return;
      case MmlPackage.RFORMULA__PREDICTORS:
        setPredictors((XFormula)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MmlPackage.RFORMULA__PREDICTIVE:
        setPredictive((FormulaItem)null);
        return;
      case MmlPackage.RFORMULA__PREDICTORS:
        setPredictors((XFormula)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MmlPackage.RFORMULA__PREDICTIVE:
        return predictive != null;
      case MmlPackage.RFORMULA__PREDICTORS:
        return predictors != null;
    }
    return super.eIsSet(featureID);
  }

} //RFormulaImpl
