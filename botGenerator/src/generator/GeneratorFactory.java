/**
 */
package generator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage
 * @generated
 */
public interface GeneratorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorFactory eINSTANCE = generator.impl.GeneratorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bot</em>'.
	 * @generated
	 */
	Bot createBot();

	/**
	 * Returns a new object of class '<em>Bot Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bot Interaction</em>'.
	 * @generated
	 */
	BotInteraction createBotInteraction();

	/**
	 * Returns a new object of class '<em>User Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Interaction</em>'.
	 * @generated
	 */
	UserInteraction createUserInteraction();

	/**
	 * Returns a new object of class '<em>Back To Bot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Back To Bot</em>'.
	 * @generated
	 */
	BackToBot createBackToBot();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Language Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Entity</em>'.
	 * @generated
	 */
	LanguageEntity createLanguageEntity();

	/**
	 * Returns a new object of class '<em>Simple Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Input</em>'.
	 * @generated
	 */
	SimpleInput createSimpleInput();

	/**
	 * Returns a new object of class '<em>Composite Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Input</em>'.
	 * @generated
	 */
	CompositeInput createCompositeInput();

	/**
	 * Returns a new object of class '<em>Regex Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regex Input</em>'.
	 * @generated
	 */
	RegexInput createRegexInput();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Entity Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Token</em>'.
	 * @generated
	 */
	EntityToken createEntityToken();

	/**
	 * Returns a new object of class '<em>Parameter Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Token</em>'.
	 * @generated
	 */
	ParameterToken createParameterToken();

	/**
	 * Returns a new object of class '<em>Parameter Reference Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Reference Token</em>'.
	 * @generated
	 */
	ParameterReferenceToken createParameterReferenceToken();

	/**
	 * Returns a new object of class '<em>HTTP Request Toke</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Request Toke</em>'.
	 * @generated
	 */
	HTTPRequestToke createHTTPRequestToke();

	/**
	 * Returns a new object of class '<em>Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intent</em>'.
	 * @generated
	 */
	Intent createIntent();

	/**
	 * Returns a new object of class '<em>Language Intent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Intent</em>'.
	 * @generated
	 */
	LanguageIntent createLanguageIntent();

	/**
	 * Returns a new object of class '<em>Training Phrase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Training Phrase</em>'.
	 * @generated
	 */
	TrainingPhrase createTrainingPhrase();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Language Prompt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Prompt</em>'.
	 * @generated
	 */
	LanguagePrompt createLanguagePrompt();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty</em>'.
	 * @generated
	 */
	Empty createEmpty();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Button Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Action</em>'.
	 * @generated
	 */
	ButtonAction createButtonAction();

	/**
	 * Returns a new object of class '<em>Language Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Button</em>'.
	 * @generated
	 */
	LanguageButton createLanguageButton();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Language Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Text</em>'.
	 * @generated
	 */
	LanguageText createLanguageText();

	/**
	 * Returns a new object of class '<em>Text Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Input</em>'.
	 * @generated
	 */
	TextInput createTextInput();

	/**
	 * Returns a new object of class '<em>HTTP Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Request</em>'.
	 * @generated
	 */
	HTTPRequest createHTTPRequest();

	/**
	 * Returns a new object of class '<em>HTTP Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Response</em>'.
	 * @generated
	 */
	HTTPResponse createHTTPResponse();

	/**
	 * Returns a new object of class '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value</em>'.
	 * @generated
	 */
	KeyValue createKeyValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorPackage getGeneratorPackage();

} //GeneratorFactory
