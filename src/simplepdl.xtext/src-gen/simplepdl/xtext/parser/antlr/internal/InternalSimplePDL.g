/*
 * generated by Xtext 2.36.0
 */
grammar InternalSimplePDL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package simplepdl.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package simplepdl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import simplepdl.xtext.services.SimplePDLGrammarAccess;

}

@parser::members {

 	private SimplePDLGrammarAccess grammarAccess;

    public InternalSimplePDLParser(TokenStream input, SimplePDLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Process";
   	}

   	@Override
   	protected SimplePDLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProcess
entryRuleProcess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessRule()); }
	iv_ruleProcess=ruleProcess
	{ $current=$iv_ruleProcess.current; }
	EOF;

// Rule Process
ruleProcess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='proc'
		{
			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcessRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
				}
				lv_processElements_3_0=ruleProcessElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessRule());
					}
					add(
						$current,
						"processElements",
						lv_processElements_3_0,
						"simplepdl.xtext.SimplePDL.ProcessElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_1_0());
					}
					lv_processElements_5_0=ruleProcessElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProcessRule());
						}
						add(
							$current,
							"processElements",
							lv_processElements_5_0,
							"simplepdl.xtext.SimplePDL.ProcessElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleProcessElement
entryRuleProcessElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessElementRule()); }
	iv_ruleProcessElement=ruleProcessElement
	{ $current=$iv_ruleProcessElement.current; }
	EOF;

// Rule ProcessElement
ruleProcessElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_0());
		}
		this_Guidance_0=ruleGuidance
		{
			$current = $this_Guidance_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1());
		}
		this_WorkDefinition_1=ruleWorkDefinition
		{
			$current = $this_WorkDefinition_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2());
		}
		this_WorkSequence_2=ruleWorkSequence
		{
			$current = $this_WorkSequence_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3());
		}
		this_Resource_3=ruleResource
		{
			$current = $this_Resource_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGuidance
entryRuleGuidance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuidanceRule()); }
	iv_ruleGuidance=ruleGuidance
	{ $current=$iv_ruleGuidance.current; }
	EOF;

// Rule Guidance
ruleGuidance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='guid'
		{
			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getGuidKeyword_0());
		}
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGuidanceRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_1_1_0());
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getCommaKeyword_1_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getGuidanceRule());
							}
						}
						otherlv_4=RULE_ID
						{
							newLeafNode(otherlv_4, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_1_2_1_0());
						}
					)
				)
			)*
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_1_3());
			}
		)?
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_7='text'
		{
			newLeafNode(otherlv_7, grammarAccess.getGuidanceAccess().getTextKeyword_3());
		}
		(
			(
				lv_text_8_0=RULE_STRING
				{
					newLeafNode(lv_text_8_0, grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGuidanceRule());
					}
					setWithLastConsumed(
						$current,
						"text",
						lv_text_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkDefinitionRule()); }
	iv_ruleWorkDefinition=ruleWorkDefinition
	{ $current=$iv_ruleWorkDefinition.current; }
	EOF;

// Rule WorkDefinition
ruleWorkDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='wd'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkDefinitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='{'
			{
				newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
			}
			otherlv_3='need'
			{
				newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getNeedKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getResourcesACResourceParserRuleCall_2_2_0());
					}
					lv_resources_4_0=ruleACResource
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
						}
						add(
							$current,
							"resources",
							lv_resources_4_0,
							"simplepdl.xtext.SimplePDL.ACResource");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_3_0());
				}
				otherlv_6='need'
				{
					newLeafNode(otherlv_6, grammarAccess.getWorkDefinitionAccess().getNeedKeyword_2_3_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getResourcesACResourceParserRuleCall_2_3_2_0());
						}
						lv_resources_7_0=ruleACResource
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
							}
							add(
								$current,
								"resources",
								lv_resources_7_0,
								"simplepdl.xtext.SimplePDL.ACResource");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_2_4());
			}
		)?
	)
;

// Entry rule entryRuleWorkSequence
entryRuleWorkSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkSequenceRule()); }
	iv_ruleWorkSequence=ruleWorkSequence
	{ $current=$iv_ruleWorkSequence.current; }
	EOF;

// Rule WorkSequence
ruleWorkSequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ws'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getTypeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeParserRuleCall_3_0());
				}
				lv_linkType_3_0=ruleWorkSequenceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
					}
					set(
						$current,
						"linkType",
						lv_linkType_3_0,
						"simplepdl.xtext.SimplePDL.WorkSequenceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='pred'
		{
			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getPredKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0());
				}
			)
		)
		otherlv_6='suc'
		{
			newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getSucKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0());
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleResource
entryRuleResource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getResourceRule()); }
	iv_ruleResource=ruleResource
	{ $current=$iv_ruleResource.current; }
	EOF;

// Rule Resource
ruleResource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='res'
		{
			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResourceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				lv_quantity_3_0=RULE_INT
				{
					newLeafNode(lv_quantity_3_0, grammarAccess.getResourceAccess().getQuantityINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getResourceRule());
					}
					setWithLastConsumed(
						$current,
						"quantity",
						lv_quantity_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleACResource
entryRuleACResource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getACResourceRule()); }
	iv_ruleACResource=ruleACResource
	{ $current=$iv_ruleACResource.current; }
	EOF;

// Rule ACResource
ruleACResource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getACResourceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getACResourceAccess().getResourceResourceCrossReference_0_0());
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getACResourceAccess().getColonKeyword_1());
		}
		(
			(
				lv_resourceQuantity_2_0=RULE_INT
				{
					newLeafNode(lv_resourceQuantity_2_0, grammarAccess.getACResourceAccess().getResourceQuantityINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getACResourceRule());
					}
					setWithLastConsumed(
						$current,
						"resourceQuantity",
						lv_resourceQuantity_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleWorkSequenceType
entryRuleWorkSequenceType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkSequenceTypeRule()); }
	iv_ruleWorkSequenceType=ruleWorkSequenceType
	{ $current=$iv_ruleWorkSequenceType.current; }
	EOF;

// Rule WorkSequenceType
ruleWorkSequenceType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_startToStart_0_0='s2s'
				{
					newLeafNode(lv_startToStart_0_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartS2sKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceTypeRule());
					}
					setWithLastConsumed($current, "startToStart", lv_startToStart_0_0, "s2s");
				}
			)
		)
		    |
		(
			(
				lv_finishToStart_1_0='f2s'
				{
					newLeafNode(lv_finishToStart_1_0, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartF2sKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceTypeRule());
					}
					setWithLastConsumed($current, "finishToStart", lv_finishToStart_1_0, "f2s");
				}
			)
		)
		    |
		(
			(
				lv_startToFinish_2_0='s2f'
				{
					newLeafNode(lv_startToFinish_2_0, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishS2fKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceTypeRule());
					}
					setWithLastConsumed($current, "startToFinish", lv_startToFinish_2_0, "s2f");
				}
			)
		)
		    |
		(
			(
				lv_finishToFinish_3_0='f2f'
				{
					newLeafNode(lv_finishToFinish_3_0, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishF2fKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceTypeRule());
					}
					setWithLastConsumed($current, "finishToFinish", lv_finishToFinish_3_0, "f2f");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
