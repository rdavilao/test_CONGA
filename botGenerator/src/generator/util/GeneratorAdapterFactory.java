/**
 */
package generator.util;

import generator.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see generator.GeneratorPackage
 * @generated
 */
public class GeneratorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorSwitch<Adapter> modelSwitch =
		new GeneratorSwitch<Adapter>() {
			@Override
			public Adapter caseBot(Bot object) {
				return createBotAdapter();
			}
			@Override
			public Adapter caseInteraction(Interaction object) {
				return createInteractionAdapter();
			}
			@Override
			public Adapter caseBotInteraction(BotInteraction object) {
				return createBotInteractionAdapter();
			}
			@Override
			public Adapter caseUserInteraction(UserInteraction object) {
				return createUserInteractionAdapter();
			}
			@Override
			public Adapter caseBackToBot(BackToBot object) {
				return createBackToBotAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseLanguageInput(LanguageInput object) {
				return createLanguageInputAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseLanguageEntity(LanguageEntity object) {
				return createLanguageEntityAdapter();
			}
			@Override
			public Adapter caseEntityInput(EntityInput object) {
				return createEntityInputAdapter();
			}
			@Override
			public Adapter caseSimpleInput(SimpleInput object) {
				return createSimpleInputAdapter();
			}
			@Override
			public Adapter caseCompositeInput(CompositeInput object) {
				return createCompositeInputAdapter();
			}
			@Override
			public Adapter caseRegexInput(RegexInput object) {
				return createRegexInputAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseEntityToken(EntityToken object) {
				return createEntityTokenAdapter();
			}
			@Override
			public Adapter caseParameterToken(ParameterToken object) {
				return createParameterTokenAdapter();
			}
			@Override
			public Adapter caseParameterReferenceToken(ParameterReferenceToken object) {
				return createParameterReferenceTokenAdapter();
			}
			@Override
			public Adapter caseHTTPRequestToke(HTTPRequestToke object) {
				return createHTTPRequestTokeAdapter();
			}
			@Override
			public Adapter caseIntent(Intent object) {
				return createIntentAdapter();
			}
			@Override
			public Adapter caseLanguageIntent(LanguageIntent object) {
				return createLanguageIntentAdapter();
			}
			@Override
			public Adapter caseTrainingPhrase(TrainingPhrase object) {
				return createTrainingPhraseAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseLanguagePrompt(LanguagePrompt object) {
				return createLanguagePromptAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseEmpty(Empty object) {
				return createEmptyAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseButtonAction(ButtonAction object) {
				return createButtonActionAdapter();
			}
			@Override
			public Adapter caseLanguageButton(LanguageButton object) {
				return createLanguageButtonAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseLanguageText(LanguageText object) {
				return createLanguageTextAdapter();
			}
			@Override
			public Adapter caseTextInput(TextInput object) {
				return createTextInputAdapter();
			}
			@Override
			public Adapter caseHTTPRequest(HTTPRequest object) {
				return createHTTPRequestAdapter();
			}
			@Override
			public Adapter caseHTTPResponse(HTTPResponse object) {
				return createHTTPResponseAdapter();
			}
			@Override
			public Adapter caseKeyValue(KeyValue object) {
				return createKeyValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link generator.Bot <em>Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Bot
	 * @generated
	 */
	public Adapter createBotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.BotInteraction <em>Bot Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.BotInteraction
	 * @generated
	 */
	public Adapter createBotInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.UserInteraction <em>User Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.UserInteraction
	 * @generated
	 */
	public Adapter createUserInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.BackToBot <em>Back To Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.BackToBot
	 * @generated
	 */
	public Adapter createBackToBotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LanguageEntity <em>Language Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LanguageEntity
	 * @generated
	 */
	public Adapter createLanguageEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LanguageInput <em>Language Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LanguageInput
	 * @generated
	 */
	public Adapter createLanguageInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.EntityInput <em>Entity Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.EntityInput
	 * @generated
	 */
	public Adapter createEntityInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.SimpleInput <em>Simple Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.SimpleInput
	 * @generated
	 */
	public Adapter createSimpleInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.CompositeInput <em>Composite Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.CompositeInput
	 * @generated
	 */
	public Adapter createCompositeInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.RegexInput <em>Regex Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.RegexInput
	 * @generated
	 */
	public Adapter createRegexInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.EntityToken <em>Entity Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.EntityToken
	 * @generated
	 */
	public Adapter createEntityTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ParameterToken <em>Parameter Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ParameterToken
	 * @generated
	 */
	public Adapter createParameterTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ParameterReferenceToken <em>Parameter Reference Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ParameterReferenceToken
	 * @generated
	 */
	public Adapter createParameterReferenceTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.HTTPRequestToke <em>HTTP Request Toke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.HTTPRequestToke
	 * @generated
	 */
	public Adapter createHTTPRequestTokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Intent
	 * @generated
	 */
	public Adapter createIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LanguageIntent <em>Language Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LanguageIntent
	 * @generated
	 */
	public Adapter createLanguageIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.TrainingPhrase <em>Training Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.TrainingPhrase
	 * @generated
	 */
	public Adapter createTrainingPhraseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LanguagePrompt <em>Language Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LanguagePrompt
	 * @generated
	 */
	public Adapter createLanguagePromptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Empty
	 * @generated
	 */
	public Adapter createEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.ButtonAction <em>Button Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.ButtonAction
	 * @generated
	 */
	public Adapter createButtonActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LanguageButton <em>Language Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LanguageButton
	 * @generated
	 */
	public Adapter createLanguageButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.LanguageText <em>Language Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.LanguageText
	 * @generated
	 */
	public Adapter createLanguageTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.TextInput
	 * @generated
	 */
	public Adapter createTextInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.HTTPRequest <em>HTTP Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.HTTPRequest
	 * @generated
	 */
	public Adapter createHTTPRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.HTTPResponse <em>HTTP Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.HTTPResponse
	 * @generated
	 */
	public Adapter createHTTPResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.KeyValue
	 * @generated
	 */
	public Adapter createKeyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeneratorAdapterFactory
