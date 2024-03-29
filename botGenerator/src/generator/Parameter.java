/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Parameter#getEntity <em>Entity</em>}</li>
 *   <li>{@link generator.Parameter#getDefaultEntity <em>Default Entity</em>}</li>
 *   <li>{@link generator.Parameter#isRequired <em>Required</em>}</li>
 *   <li>{@link generator.Parameter#isIsList <em>Is List</em>}</li>
 *   <li>{@link generator.Parameter#getPrompts <em>Prompts</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getParameter()
 * @model
 * @generated NOT
 */
public interface Parameter extends Element, Comparable {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see generator.GeneratorPackage#getParameter_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link generator.Parameter#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Default Entity</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.DefaultEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Entity</em>' attribute.
	 * @see generator.DefaultEntity
	 * @see #setDefaultEntity(DefaultEntity)
	 * @see generator.GeneratorPackage#getParameter_DefaultEntity()
	 * @model
	 * @generated
	 */
	DefaultEntity getDefaultEntity();

	/**
	 * Sets the value of the '{@link generator.Parameter#getDefaultEntity <em>Default Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Entity</em>' attribute.
	 * @see generator.DefaultEntity
	 * @see #getDefaultEntity()
	 * @generated
	 */
	void setDefaultEntity(DefaultEntity value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see generator.GeneratorPackage#getParameter_Required()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link generator.Parameter#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Is List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is List</em>' attribute.
	 * @see #setIsList(boolean)
	 * @see generator.GeneratorPackage#getParameter_IsList()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsList();

	/**
	 * Sets the value of the '{@link generator.Parameter#isIsList <em>Is List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is List</em>' attribute.
	 * @see #isIsList()
	 * @generated
	 */
	void setIsList(boolean value);

	/**
	 * Returns the value of the '<em><b>Prompts</b></em>' containment reference list.
	 * The list contents are of type {@link generator.PromptLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompts</em>' containment reference list.
	 * @see generator.GeneratorPackage#getParameter_Prompts()
	 * @model containment="true"
	 * @generated
	 */
	EList<LanguagePrompt> getPrompts();

	LanguagePrompt getPrompt(Language language);

} // Parameter
