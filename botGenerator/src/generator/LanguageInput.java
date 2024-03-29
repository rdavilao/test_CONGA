/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LanguageInput#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLanguageInput()
 * @model abstract="true"
 * @generated
 */
public interface LanguageInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"EMPTY"</code>.
	 * The literals are from the enumeration {@link generator.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see generator.Language
	 * @see #setLanguage(Language)
	 * @see generator.GeneratorPackage#getLanguageInput_Language()
	 * @model default="EMPTY"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link generator.LanguageInput#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see generator.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

} // LanguageInput
