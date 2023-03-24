/*
 * generated by Xtext 2.23.0
 */
package org.xtext.botGenerator.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.botGenerator.ide.contentassist.antlr.internal.InternalBotParser;
import org.xtext.botGenerator.services.BotGrammarAccess;

public class BotParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BotGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BotGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getTokenAccess().getAlternatives(), "rule__Token__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getIntentAccess().getAlternatives(), "rule__Intent__Alternatives");
			builder.put(grammarAccess.getTransitionAccess().getAlternatives_3_1(), "rule__Transition__Alternatives_3_1");
			builder.put(grammarAccess.getTransitionAccess().getTargetAlternatives_3_1_0_0(), "rule__Transition__TargetAlternatives_3_1_0_0");
			builder.put(grammarAccess.getState2Access().getAlternatives_4_1_1(), "rule__State2__Alternatives_4_1_1");
			builder.put(grammarAccess.getStateAccess().getAlternatives_4_1(), "rule__State__Alternatives_4_1");
			builder.put(grammarAccess.getTrainingPhraseAccess().getTokensAlternatives_1_0(), "rule__TrainingPhrase__TokensAlternatives_1_0");
			builder.put(grammarAccess.getParameterAccess().getAlternatives_3(), "rule__Parameter__Alternatives_3");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
			builder.put(grammarAccess.getCompositeInputAccess().getExpresionAlternatives_3_0(), "rule__CompositeInput__ExpresionAlternatives_3_0");
			builder.put(grammarAccess.getTextAccess().getAlternatives_0(), "rule__Text__Alternatives_0");
			builder.put(grammarAccess.getImageAccess().getAlternatives_0(), "rule__Image__Alternatives_0");
			builder.put(grammarAccess.getTextInputHttpResponseAccess().getTokensAlternatives_0(), "rule__TextInputHttpResponse__TokensAlternatives_0");
			builder.put(grammarAccess.getTextInputTextAccess().getTokensAlternatives_0(), "rule__TextInputText__TokensAlternatives_0");
			builder.put(grammarAccess.getDataAccess().getValueAlternatives_2_0(), "rule__Data__ValueAlternatives_2_0");
			builder.put(grammarAccess.getDefaultEntityAccess().getAlternatives(), "rule__DefaultEntity__Alternatives");
			builder.put(grammarAccess.getHTTPReturnTypeAccess().getAlternatives(), "rule__HTTPReturnType__Alternatives");
			builder.put(grammarAccess.getLanguageAccess().getAlternatives(), "rule__Language__Alternatives");
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
			builder.put(grammarAccess.getBotAccess().getGroup(), "rule__Bot__Group__0");
			builder.put(grammarAccess.getBotAccess().getGroup_5(), "rule__Bot__Group_5__0");
			builder.put(grammarAccess.getBotAccess().getGroup_10(), "rule__Bot__Group_10__0");
			builder.put(grammarAccess.getBotAccess().getGroup_11(), "rule__Bot__Group_11__0");
			builder.put(grammarAccess.getBotAccess().getGroup_14(), "rule__Bot__Group_14__0");
			builder.put(grammarAccess.getIntent2Access().getGroup(), "rule__Intent2__Group__0");
			builder.put(grammarAccess.getIntent2Access().getGroup_4(), "rule__Intent2__Group_4__0");
			builder.put(grammarAccess.getIntent2Access().getGroup_4_2(), "rule__Intent2__Group_4_2__0");
			builder.put(grammarAccess.getIntent1Access().getGroup(), "rule__Intent1__Group__0");
			builder.put(grammarAccess.getLanguageIntentAccess().getGroup(), "rule__LanguageIntent__Group__0");
			builder.put(grammarAccess.getLanguageIntentAccess().getGroup_0(), "rule__LanguageIntent__Group_0__0");
			builder.put(grammarAccess.getLanguageIntentAccess().getGroup_0_1(), "rule__LanguageIntent__Group_0_1__0");
			builder.put(grammarAccess.getLanguageIntentAccess().getGroup_3(), "rule__LanguageIntent__Group_3__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_0(), "rule__Transition__Group_0__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_3(), "rule__Transition__Group_3__0");
			builder.put(grammarAccess.getBackToBotAccess().getGroup(), "rule__BackToBot__Group__0");
			builder.put(grammarAccess.getBackToBotAccess().getGroup_0(), "rule__BackToBot__Group_0__0");
			builder.put(grammarAccess.getState2Access().getGroup(), "rule__State2__Group__0");
			builder.put(grammarAccess.getState2Access().getGroup_0(), "rule__State2__Group_0__0");
			builder.put(grammarAccess.getState2Access().getGroup_3(), "rule__State2__Group_3__0");
			builder.put(grammarAccess.getState2Access().getGroup_4(), "rule__State2__Group_4__0");
			builder.put(grammarAccess.getState2Access().getGroup_4_1(), "rule__State2__Group_4_1__0");
			builder.put(grammarAccess.getState2Access().getGroup_4_1_1_1(), "rule__State2__Group_4_1_1_1__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup_0(), "rule__State__Group_0__0");
			builder.put(grammarAccess.getStateAccess().getGroup_3(), "rule__State__Group_3__0");
			builder.put(grammarAccess.getStateAccess().getGroup_4(), "rule__State__Group_4__0");
			builder.put(grammarAccess.getStateAccess().getGroup_4_1_1(), "rule__State__Group_4_1_1__0");
			builder.put(grammarAccess.getTrainingPhraseAccess().getGroup(), "rule__TrainingPhrase__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_4(), "rule__Parameter__Group_4__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_5(), "rule__Parameter__Group_5__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_6(), "rule__Parameter__Group_6__0");
			builder.put(grammarAccess.getParameter2Access().getGroup(), "rule__Parameter2__Group__0");
			builder.put(grammarAccess.getLanguagePromptAccess().getGroup(), "rule__LanguagePrompt__Group__0");
			builder.put(grammarAccess.getLanguagePromptAccess().getGroup_1(), "rule__LanguagePrompt__Group_1__0");
			builder.put(grammarAccess.getLanguagePromptAccess().getGroup_4(), "rule__LanguagePrompt__Group_4__0");
			builder.put(grammarAccess.getEntityTokenAccess().getGroup(), "rule__EntityToken__Group__0");
			builder.put(grammarAccess.getParameterTokenAccess().getGroup(), "rule__ParameterToken__Group__0");
			builder.put(grammarAccess.getParameterTokenAccess().getGroup_3(), "rule__ParameterToken__Group_3__0");
			builder.put(grammarAccess.getParameterRefenceTokenAccess().getGroup(), "rule__ParameterRefenceToken__Group__0");
			builder.put(grammarAccess.getHTTPRequestTokenAccess().getGroup(), "rule__HTTPRequestToken__Group__0");
			builder.put(grammarAccess.getHTTPRequestTokenAccess().getGroup_2(), "rule__HTTPRequestToken__Group_2__0");
			builder.put(grammarAccess.getSimpleEntityAccess().getGroup(), "rule__SimpleEntity__Group__0");
			builder.put(grammarAccess.getComplexEntityAccess().getGroup(), "rule__ComplexEntity__Group__0");
			builder.put(grammarAccess.getRegexEntityAccess().getGroup(), "rule__RegexEntity__Group__0");
			builder.put(grammarAccess.getSLanguageEntityAccess().getGroup(), "rule__SLanguageEntity__Group__0");
			builder.put(grammarAccess.getSLanguageEntityAccess().getGroup_0(), "rule__SLanguageEntity__Group_0__0");
			builder.put(grammarAccess.getSLanguageEntityAccess().getGroup_2(), "rule__SLanguageEntity__Group_2__0");
			builder.put(grammarAccess.getCLanguageEntityAccess().getGroup(), "rule__CLanguageEntity__Group__0");
			builder.put(grammarAccess.getCLanguageEntityAccess().getGroup_0(), "rule__CLanguageEntity__Group_0__0");
			builder.put(grammarAccess.getCLanguageEntityAccess().getGroup_2(), "rule__CLanguageEntity__Group_2__0");
			builder.put(grammarAccess.getRLanguageEntityAccess().getGroup(), "rule__RLanguageEntity__Group__0");
			builder.put(grammarAccess.getRLanguageEntityAccess().getGroup_0(), "rule__RLanguageEntity__Group_0__0");
			builder.put(grammarAccess.getRLanguageEntityAccess().getGroup_2(), "rule__RLanguageEntity__Group_2__0");
			builder.put(grammarAccess.getRegexInputAccess().getGroup(), "rule__RegexInput__Group__0");
			builder.put(grammarAccess.getCompositeInputAccess().getGroup(), "rule__CompositeInput__Group__0");
			builder.put(grammarAccess.getSimpleInputAccess().getGroup(), "rule__SimpleInput__Group__0");
			builder.put(grammarAccess.getSimpleInputAccess().getGroup_2(), "rule__SimpleInput__Group_2__0");
			builder.put(grammarAccess.getSimpleInputAccess().getGroup_2_2(), "rule__SimpleInput__Group_2_2__0");
			builder.put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
			builder.put(grammarAccess.getLanguageTextAccess().getGroup(), "rule__LanguageText__Group__0");
			builder.put(grammarAccess.getLanguageTextAccess().getGroup_0(), "rule__LanguageText__Group_0__0");
			builder.put(grammarAccess.getLanguageTextAccess().getGroup_0_1(), "rule__LanguageText__Group_0_1__0");
			builder.put(grammarAccess.getLanguageTextAccess().getGroup_3(), "rule__LanguageText__Group_3__0");
			builder.put(grammarAccess.getHTTPResponseAccess().getGroup(), "rule__HTTPResponse__Group__0");
			builder.put(grammarAccess.getHTTPRequestAccess().getGroup(), "rule__HTTPRequest__Group__0");
			builder.put(grammarAccess.getHTTPRequestAccess().getGroup_8(), "rule__HTTPRequest__Group_8__0");
			builder.put(grammarAccess.getHTTPRequestAccess().getGroup_9(), "rule__HTTPRequest__Group_9__0");
			builder.put(grammarAccess.getHTTPRequestAccess().getGroup_9_3(), "rule__HTTPRequest__Group_9_3__0");
			builder.put(grammarAccess.getHTTPRequestAccess().getGroup_10(), "rule__HTTPRequest__Group_10__0");
			builder.put(grammarAccess.getHTTPRequestAccess().getGroup_10_3(), "rule__HTTPRequest__Group_10_3__0");
			builder.put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
			builder.put(grammarAccess.getImageAccess().getGroup_7(), "rule__Image__Group_7__0");
			builder.put(grammarAccess.getEmptyAccess().getGroup(), "rule__Empty__Group__0");
			builder.put(grammarAccess.getEmptyAccess().getGroup_3(), "rule__Empty__Group_3__0");
			builder.put(grammarAccess.getButtonActionAccess().getGroup(), "rule__ButtonAction__Group__0");
			builder.put(grammarAccess.getLanguageButtonAccess().getGroup(), "rule__LanguageButton__Group__0");
			builder.put(grammarAccess.getLanguageButtonAccess().getGroup_0(), "rule__LanguageButton__Group_0__0");
			builder.put(grammarAccess.getLanguageButtonAccess().getGroup_0_1(), "rule__LanguageButton__Group_0_1__0");
			builder.put(grammarAccess.getLanguageButtonAccess().getGroup_2(), "rule__LanguageButton__Group_2__0");
			builder.put(grammarAccess.getLanguageButtonAccess().getGroup_2_3(), "rule__LanguageButton__Group_2_3__0");
			builder.put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
			builder.put(grammarAccess.getButtonAccess().getGroup_3(), "rule__Button__Group_3__0");
			builder.put(grammarAccess.getLanguageTextHttpResponseAccess().getGroup(), "rule__LanguageTextHttpResponse__Group__0");
			builder.put(grammarAccess.getLanguageTextHttpResponseAccess().getGroup_1(), "rule__LanguageTextHttpResponse__Group_1__0");
			builder.put(grammarAccess.getLanguageTextHttpResponseAccess().getGroup_4(), "rule__LanguageTextHttpResponse__Group_4__0");
			builder.put(grammarAccess.getKeyValueAccess().getGroup(), "rule__KeyValue__Group__0");
			builder.put(grammarAccess.getDataAccess().getGroup(), "rule__Data__Group__0");
			builder.put(grammarAccess.getBotAccess().getNameAssignment_1(), "rule__Bot__NameAssignment_1");
			builder.put(grammarAccess.getBotAccess().getLanguagesAssignment_4(), "rule__Bot__LanguagesAssignment_4");
			builder.put(grammarAccess.getBotAccess().getLanguagesAssignment_5_1(), "rule__Bot__LanguagesAssignment_5_1");
			builder.put(grammarAccess.getBotAccess().getIntentsAssignment_8(), "rule__Bot__IntentsAssignment_8");
			builder.put(grammarAccess.getBotAccess().getIntentsAssignment_9(), "rule__Bot__IntentsAssignment_9");
			builder.put(grammarAccess.getBotAccess().getEntitiesAssignment_10_2(), "rule__Bot__EntitiesAssignment_10_2");
			builder.put(grammarAccess.getBotAccess().getEntitiesAssignment_10_3(), "rule__Bot__EntitiesAssignment_10_3");
			builder.put(grammarAccess.getBotAccess().getActionsAssignment_11_2(), "rule__Bot__ActionsAssignment_11_2");
			builder.put(grammarAccess.getBotAccess().getActionsAssignment_11_3(), "rule__Bot__ActionsAssignment_11_3");
			builder.put(grammarAccess.getBotAccess().getFlowsAssignment_14_1(), "rule__Bot__FlowsAssignment_14_1");
			builder.put(grammarAccess.getIntent2Access().getNameAssignment_0(), "rule__Intent2__NameAssignment_0");
			builder.put(grammarAccess.getIntent2Access().getFallbackIntentAssignment_1(), "rule__Intent2__FallbackIntentAssignment_1");
			builder.put(grammarAccess.getIntent2Access().getInputsAssignment_3(), "rule__Intent2__InputsAssignment_3");
			builder.put(grammarAccess.getIntent2Access().getParametersAssignment_4_2_0(), "rule__Intent2__ParametersAssignment_4_2_0");
			builder.put(grammarAccess.getIntent2Access().getParametersAssignment_4_2_1(), "rule__Intent2__ParametersAssignment_4_2_1");
			builder.put(grammarAccess.getIntent1Access().getNameAssignment_0(), "rule__Intent1__NameAssignment_0");
			builder.put(grammarAccess.getIntent1Access().getFallbackIntentAssignment_1(), "rule__Intent1__FallbackIntentAssignment_1");
			builder.put(grammarAccess.getLanguageIntentAccess().getLanguageAssignment_0_1_1(), "rule__LanguageIntent__LanguageAssignment_0_1_1");
			builder.put(grammarAccess.getLanguageIntentAccess().getInputsAssignment_2(), "rule__LanguageIntent__InputsAssignment_2");
			builder.put(grammarAccess.getLanguageIntentAccess().getInputsAssignment_3_1(), "rule__LanguageIntent__InputsAssignment_3_1");
			builder.put(grammarAccess.getTransitionAccess().getNameAssignment_0_0(), "rule__Transition__NameAssignment_0_0");
			builder.put(grammarAccess.getTransitionAccess().getIntentAssignment_2(), "rule__Transition__IntentAssignment_2");
			builder.put(grammarAccess.getTransitionAccess().getTargetAssignment_3_1_0(), "rule__Transition__TargetAssignment_3_1_0");
			builder.put(grammarAccess.getTransitionAccess().getBackToAssignment_3_1_1(), "rule__Transition__BackToAssignment_3_1_1");
			builder.put(grammarAccess.getBackToBotAccess().getPreviousAssignment_0_1(), "rule__BackToBot__PreviousAssignment_0_1");
			builder.put(grammarAccess.getBackToBotAccess().getBackToAssignment_3(), "rule__BackToBot__BackToAssignment_3");
			builder.put(grammarAccess.getState2Access().getNameAssignment_0_0(), "rule__State2__NameAssignment_0_0");
			builder.put(grammarAccess.getState2Access().getActionsAssignment_2(), "rule__State2__ActionsAssignment_2");
			builder.put(grammarAccess.getState2Access().getActionsAssignment_3_1(), "rule__State2__ActionsAssignment_3_1");
			builder.put(grammarAccess.getState2Access().getOutcomingAssignment_4_1_1_0(), "rule__State2__OutcomingAssignment_4_1_1_0");
			builder.put(grammarAccess.getState2Access().getBackToAssignment_4_1_1_1_2(), "rule__State2__BackToAssignment_4_1_1_1_2");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_0_0(), "rule__State__NameAssignment_0_0");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_2(), "rule__State__ActionsAssignment_2");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_3_1(), "rule__State__ActionsAssignment_3_1");
			builder.put(grammarAccess.getStateAccess().getOutcomingAssignment_4_1_0(), "rule__State__OutcomingAssignment_4_1_0");
			builder.put(grammarAccess.getStateAccess().getBackToAssignment_4_1_1_2(), "rule__State__BackToAssignment_4_1_1_2");
			builder.put(grammarAccess.getTrainingPhraseAccess().getTokensAssignment_1(), "rule__TrainingPhrase__TokensAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getEntityAssignment_3_0(), "rule__Parameter__EntityAssignment_3_0");
			builder.put(grammarAccess.getParameterAccess().getDefaultEntityAssignment_3_1(), "rule__Parameter__DefaultEntityAssignment_3_1");
			builder.put(grammarAccess.getParameterAccess().getIsListAssignment_4_1(), "rule__Parameter__IsListAssignment_4_1");
			builder.put(grammarAccess.getParameterAccess().getRequiredAssignment_5_1(), "rule__Parameter__RequiredAssignment_5_1");
			builder.put(grammarAccess.getParameterAccess().getPromptsAssignment_6_1(), "rule__Parameter__PromptsAssignment_6_1");
			builder.put(grammarAccess.getParameter2Access().getNameAssignment_0(), "rule__Parameter2__NameAssignment_0");
			builder.put(grammarAccess.getLanguagePromptAccess().getLanguageAssignment_1_1(), "rule__LanguagePrompt__LanguageAssignment_1_1");
			builder.put(grammarAccess.getLanguagePromptAccess().getPromptsAssignment_3(), "rule__LanguagePrompt__PromptsAssignment_3");
			builder.put(grammarAccess.getLanguagePromptAccess().getPromptsAssignment_4_1(), "rule__LanguagePrompt__PromptsAssignment_4_1");
			builder.put(grammarAccess.getLiteralAccess().getTextAssignment(), "rule__Literal__TextAssignment");
			builder.put(grammarAccess.getEntityTokenAccess().getEntityAssignment_1(), "rule__EntityToken__EntityAssignment_1");
			builder.put(grammarAccess.getParameterTokenAccess().getParameterAssignment_1(), "rule__ParameterToken__ParameterAssignment_1");
			builder.put(grammarAccess.getParameterTokenAccess().getInfoAssignment_3_1(), "rule__ParameterToken__InfoAssignment_3_1");
			builder.put(grammarAccess.getParameterRefenceTokenAccess().getTextReferenceAssignment_1(), "rule__ParameterRefenceToken__TextReferenceAssignment_1");
			builder.put(grammarAccess.getParameterRefenceTokenAccess().getParameterAssignment_4(), "rule__ParameterRefenceToken__ParameterAssignment_4");
			builder.put(grammarAccess.getHTTPRequestTokenAccess().getTypeAssignment_1(), "rule__HTTPRequestToken__TypeAssignment_1");
			builder.put(grammarAccess.getHTTPRequestTokenAccess().getDataKeyAssignment_2_1(), "rule__HTTPRequestToken__DataKeyAssignment_2_1");
			builder.put(grammarAccess.getSimpleEntityAccess().getNameAssignment_2(), "rule__SimpleEntity__NameAssignment_2");
			builder.put(grammarAccess.getSimpleEntityAccess().getInputsAssignment_4(), "rule__SimpleEntity__InputsAssignment_4");
			builder.put(grammarAccess.getComplexEntityAccess().getNameAssignment_2(), "rule__ComplexEntity__NameAssignment_2");
			builder.put(grammarAccess.getComplexEntityAccess().getInputsAssignment_4(), "rule__ComplexEntity__InputsAssignment_4");
			builder.put(grammarAccess.getRegexEntityAccess().getNameAssignment_2(), "rule__RegexEntity__NameAssignment_2");
			builder.put(grammarAccess.getRegexEntityAccess().getInputsAssignment_4(), "rule__RegexEntity__InputsAssignment_4");
			builder.put(grammarAccess.getSLanguageEntityAccess().getLanguageAssignment_0_2(), "rule__SLanguageEntity__LanguageAssignment_0_2");
			builder.put(grammarAccess.getSLanguageEntityAccess().getInputsAssignment_2_0(), "rule__SLanguageEntity__InputsAssignment_2_0");
			builder.put(grammarAccess.getSLanguageEntityAccess().getInputsAssignment_2_1(), "rule__SLanguageEntity__InputsAssignment_2_1");
			builder.put(grammarAccess.getCLanguageEntityAccess().getLanguageAssignment_0_2(), "rule__CLanguageEntity__LanguageAssignment_0_2");
			builder.put(grammarAccess.getCLanguageEntityAccess().getInputsAssignment_2_0(), "rule__CLanguageEntity__InputsAssignment_2_0");
			builder.put(grammarAccess.getCLanguageEntityAccess().getInputsAssignment_2_1(), "rule__CLanguageEntity__InputsAssignment_2_1");
			builder.put(grammarAccess.getRLanguageEntityAccess().getLanguageAssignment_0_2(), "rule__RLanguageEntity__LanguageAssignment_0_2");
			builder.put(grammarAccess.getRLanguageEntityAccess().getInputsAssignment_2_0(), "rule__RLanguageEntity__InputsAssignment_2_0");
			builder.put(grammarAccess.getRLanguageEntityAccess().getInputsAssignment_2_1(), "rule__RLanguageEntity__InputsAssignment_2_1");
			builder.put(grammarAccess.getRegexInputAccess().getExpresionAssignment_3(), "rule__RegexInput__ExpresionAssignment_3");
			builder.put(grammarAccess.getCompositeInputAccess().getExpresionAssignment_3(), "rule__CompositeInput__ExpresionAssignment_3");
			builder.put(grammarAccess.getSimpleInputAccess().getNameAssignment_1(), "rule__SimpleInput__NameAssignment_1");
			builder.put(grammarAccess.getSimpleInputAccess().getValuesAssignment_2_1(), "rule__SimpleInput__ValuesAssignment_2_1");
			builder.put(grammarAccess.getSimpleInputAccess().getValuesAssignment_2_2_1(), "rule__SimpleInput__ValuesAssignment_2_2_1");
			builder.put(grammarAccess.getTextAccess().getNameAssignment_2(), "rule__Text__NameAssignment_2");
			builder.put(grammarAccess.getTextAccess().getInputsAssignment_4(), "rule__Text__InputsAssignment_4");
			builder.put(grammarAccess.getLanguageTextAccess().getLanguageAssignment_0_1_1(), "rule__LanguageText__LanguageAssignment_0_1_1");
			builder.put(grammarAccess.getLanguageTextAccess().getInputsAssignment_2(), "rule__LanguageText__InputsAssignment_2");
			builder.put(grammarAccess.getLanguageTextAccess().getInputsAssignment_3_1(), "rule__LanguageText__InputsAssignment_3_1");
			builder.put(grammarAccess.getHTTPResponseAccess().getNameAssignment_1(), "rule__HTTPResponse__NameAssignment_1");
			builder.put(grammarAccess.getHTTPResponseAccess().getHTTPRequestAssignment_5(), "rule__HTTPResponse__HTTPRequestAssignment_5");
			builder.put(grammarAccess.getHTTPResponseAccess().getInputsAssignment_7(), "rule__HTTPResponse__InputsAssignment_7");
			builder.put(grammarAccess.getHTTPRequestAccess().getMethodAssignment_1(), "rule__HTTPRequest__MethodAssignment_1");
			builder.put(grammarAccess.getHTTPRequestAccess().getNameAssignment_2(), "rule__HTTPRequest__NameAssignment_2");
			builder.put(grammarAccess.getHTTPRequestAccess().getURLAssignment_6(), "rule__HTTPRequest__URLAssignment_6");
			builder.put(grammarAccess.getHTTPRequestAccess().getBasicAuthAssignment_8_2(), "rule__HTTPRequest__BasicAuthAssignment_8_2");
			builder.put(grammarAccess.getHTTPRequestAccess().getHeadersAssignment_9_2(), "rule__HTTPRequest__HeadersAssignment_9_2");
			builder.put(grammarAccess.getHTTPRequestAccess().getHeadersAssignment_9_3_1(), "rule__HTTPRequest__HeadersAssignment_9_3_1");
			builder.put(grammarAccess.getHTTPRequestAccess().getDataAssignment_10_2(), "rule__HTTPRequest__DataAssignment_10_2");
			builder.put(grammarAccess.getHTTPRequestAccess().getDataAssignment_10_3_1(), "rule__HTTPRequest__DataAssignment_10_3_1");
			builder.put(grammarAccess.getHTTPRequestAccess().getDataTypeAssignment_10_7(), "rule__HTTPRequest__DataTypeAssignment_10_7");
			builder.put(grammarAccess.getImageAccess().getNameAssignment_2(), "rule__Image__NameAssignment_2");
			builder.put(grammarAccess.getImageAccess().getURLAssignment_6(), "rule__Image__URLAssignment_6");
			builder.put(grammarAccess.getImageAccess().getCaptionAssignment_7_2(), "rule__Image__CaptionAssignment_7_2");
			builder.put(grammarAccess.getEmptyAccess().getNameAssignment_2(), "rule__Empty__NameAssignment_2");
			builder.put(grammarAccess.getEmptyAccess().getDescriptionAssignment_3_2(), "rule__Empty__DescriptionAssignment_3_2");
			builder.put(grammarAccess.getButtonActionAccess().getNameAssignment_2(), "rule__ButtonAction__NameAssignment_2");
			builder.put(grammarAccess.getButtonActionAccess().getInputsAssignment_4(), "rule__ButtonAction__InputsAssignment_4");
			builder.put(grammarAccess.getLanguageButtonAccess().getLanguageAssignment_0_1_1(), "rule__LanguageButton__LanguageAssignment_0_1_1");
			builder.put(grammarAccess.getLanguageButtonAccess().getInputsAssignment_2_2(), "rule__LanguageButton__InputsAssignment_2_2");
			builder.put(grammarAccess.getLanguageButtonAccess().getInputsAssignment_2_3_2(), "rule__LanguageButton__InputsAssignment_2_3_2");
			builder.put(grammarAccess.getLanguageButtonAccess().getButtonsAssignment_4(), "rule__LanguageButton__ButtonsAssignment_4");
			builder.put(grammarAccess.getButtonAccess().getValueAssignment_2(), "rule__Button__ValueAssignment_2");
			builder.put(grammarAccess.getButtonAccess().getActionAssignment_3_1(), "rule__Button__ActionAssignment_3_1");
			builder.put(grammarAccess.getLanguageTextHttpResponseAccess().getLanguageAssignment_1_1(), "rule__LanguageTextHttpResponse__LanguageAssignment_1_1");
			builder.put(grammarAccess.getLanguageTextHttpResponseAccess().getInputsAssignment_3(), "rule__LanguageTextHttpResponse__InputsAssignment_3");
			builder.put(grammarAccess.getLanguageTextHttpResponseAccess().getInputsAssignment_4_1(), "rule__LanguageTextHttpResponse__InputsAssignment_4_1");
			builder.put(grammarAccess.getTextInputHttpResponseAccess().getTokensAssignment(), "rule__TextInputHttpResponse__TokensAssignment");
			builder.put(grammarAccess.getTextInputTextAccess().getTokensAssignment(), "rule__TextInputText__TokensAssignment");
			builder.put(grammarAccess.getKeyValueAccess().getKeyAssignment_0(), "rule__KeyValue__KeyAssignment_0");
			builder.put(grammarAccess.getKeyValueAccess().getValueAssignment_2(), "rule__KeyValue__ValueAssignment_2");
			builder.put(grammarAccess.getDataAccess().getKeyAssignment_0(), "rule__Data__KeyAssignment_0");
			builder.put(grammarAccess.getDataAccess().getValueAssignment_2(), "rule__Data__ValueAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BotGrammarAccess grammarAccess;

	@Override
	protected InternalBotParser createParser() {
		InternalBotParser result = new InternalBotParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}