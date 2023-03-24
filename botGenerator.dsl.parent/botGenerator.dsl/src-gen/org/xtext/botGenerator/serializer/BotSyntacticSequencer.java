/*
 * generated by Xtext 2.23.0
 */
package org.xtext.botGenerator.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.botGenerator.services.BotGrammarAccess;

@SuppressWarnings("all")
public class BotSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BotGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Image_ImageKeyword_0_0_or_MageKeyword_0_1;
	protected AbstractElementAlias match_LanguageButton_InputsKeyword_0_0_q;
	protected AbstractElementAlias match_LanguageIntent_InputsKeyword_0_0_q;
	protected AbstractElementAlias match_LanguageText_InputsKeyword_0_0_q;
	protected AbstractElementAlias match_Text_TextKeyword_0_0_or_TextKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BotGrammarAccess) access;
		match_Image_ImageKeyword_0_0_or_MageKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImageAccess().getImageKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getImageAccess().getMageKeyword_0_1()));
		match_LanguageButton_InputsKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getLanguageButtonAccess().getInputsKeyword_0_0());
		match_LanguageIntent_InputsKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getLanguageIntentAccess().getInputsKeyword_0_0());
		match_LanguageText_InputsKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getLanguageTextAccess().getInputsKeyword_0_0());
		match_Text_TextKeyword_0_0_or_TextKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTextAccess().getTextKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getTextAccess().getTextKeyword_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Image_ImageKeyword_0_0_or_MageKeyword_0_1.equals(syntax))
				emit_Image_ImageKeyword_0_0_or_MageKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LanguageButton_InputsKeyword_0_0_q.equals(syntax))
				emit_LanguageButton_InputsKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LanguageIntent_InputsKeyword_0_0_q.equals(syntax))
				emit_LanguageIntent_InputsKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LanguageText_InputsKeyword_0_0_q.equals(syntax))
				emit_LanguageText_InputsKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Text_TextKeyword_0_0_or_TextKeyword_0_1.equals(syntax))
				emit_Text_TextKeyword_0_0_or_TextKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'Image' | 'mage'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'response' name=EString
	 */
	protected void emit_Image_ImageKeyword_0_0_or_MageKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'inputs'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' 'buttons:' buttons+=Button
	 *     (rule start) (ambiguity) '{' 'text:' '-' inputs+=TextInputText
	 */
	protected void emit_LanguageButton_InputsKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'inputs'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' inputs+=TrainingPhrase
	 */
	protected void emit_LanguageIntent_InputsKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'inputs'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '{' inputs+=TextInputText
	 */
	protected void emit_LanguageText_InputsKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Text' | 'text'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'response' name=EString
	 */
	protected void emit_Text_TextKeyword_0_0_or_TextKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
