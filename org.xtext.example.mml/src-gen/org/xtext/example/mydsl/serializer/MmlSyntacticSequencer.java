/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.serializer;

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
import org.xtext.example.mydsl.services.MmlGrammarAccess;

@SuppressWarnings("all")
public class MmlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MmlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DT_DTKeyword_1_0_or_DecisionTreeKeyword_1_1;
	protected AbstractElementAlias match_RandomForest_RFKeyword_1_1_or_RandomForestKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MmlGrammarAccess) access;
		match_DT_DTKeyword_1_0_or_DecisionTreeKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDTAccess().getDTKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDTAccess().getDecisionTreeKeyword_1_1()));
		match_RandomForest_RFKeyword_1_1_or_RandomForestKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRandomForestAccess().getRFKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getRandomForestAccess().getRandomForestKeyword_1_0()));
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
			if (match_DT_DTKeyword_1_0_or_DecisionTreeKeyword_1_1.equals(syntax))
				emit_DT_DTKeyword_1_0_or_DecisionTreeKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForest_RFKeyword_1_1_or_RandomForestKeyword_1_0.equals(syntax))
				emit_RandomForest_RFKeyword_1_1_or_RandomForestKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'DT' | 'DecisionTree'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) max_depth=INT
	 */
	protected void emit_DT_DTKeyword_1_0_or_DecisionTreeKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'RandomForest' | 'RF'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_RandomForest_RFKeyword_1_1_or_RandomForestKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
