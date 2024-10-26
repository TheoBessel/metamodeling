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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'proc'", "'{'", "','", "'}'", "'guid'", "'('", "')'", "'text'", "'wd'", "'need'", "'ws'", "'type'", "'pred'", "'suc'", "'res'", "':'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimplePDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplePDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplePDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimplePDL.g"; }



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




    // $ANTLR start "entryRuleProcess"
    // InternalSimplePDL.g:64:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSimplePDL.g:64:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSimplePDL.g:65:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSimplePDL.g:71:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) ) (otherlv_4= ',' ( (lv_processElements_5_0= ruleProcessElement ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_processElements_3_0 = null;

        EObject lv_processElements_5_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:77:2: ( (otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) ) (otherlv_4= ',' ( (lv_processElements_5_0= ruleProcessElement ) ) )* otherlv_6= '}' ) )
            // InternalSimplePDL.g:78:2: (otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) ) (otherlv_4= ',' ( (lv_processElements_5_0= ruleProcessElement ) ) )* otherlv_6= '}' )
            {
            // InternalSimplePDL.g:78:2: (otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) ) (otherlv_4= ',' ( (lv_processElements_5_0= ruleProcessElement ) ) )* otherlv_6= '}' )
            // InternalSimplePDL.g:79:3: otherlv_0= 'proc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_processElements_3_0= ruleProcessElement ) ) (otherlv_4= ',' ( (lv_processElements_5_0= ruleProcessElement ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcKeyword_0());
            		
            // InternalSimplePDL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplePDL.g:105:3: ( (lv_processElements_3_0= ruleProcessElement ) )
            // InternalSimplePDL.g:106:4: (lv_processElements_3_0= ruleProcessElement )
            {
            // InternalSimplePDL.g:106:4: (lv_processElements_3_0= ruleProcessElement )
            // InternalSimplePDL.g:107:5: lv_processElements_3_0= ruleProcessElement
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_processElements_3_0=ruleProcessElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessRule());
            					}
            					add(
            						current,
            						"processElements",
            						lv_processElements_3_0,
            						"simplepdl.xtext.SimplePDL.ProcessElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimplePDL.g:124:3: (otherlv_4= ',' ( (lv_processElements_5_0= ruleProcessElement ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimplePDL.g:125:4: otherlv_4= ',' ( (lv_processElements_5_0= ruleProcessElement ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSimplePDL.g:129:4: ( (lv_processElements_5_0= ruleProcessElement ) )
            	    // InternalSimplePDL.g:130:5: (lv_processElements_5_0= ruleProcessElement )
            	    {
            	    // InternalSimplePDL.g:130:5: (lv_processElements_5_0= ruleProcessElement )
            	    // InternalSimplePDL.g:131:6: lv_processElements_5_0= ruleProcessElement
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_processElements_5_0=ruleProcessElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"processElements",
            	    							lv_processElements_5_0,
            	    							"simplepdl.xtext.SimplePDL.ProcessElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalSimplePDL.g:157:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // InternalSimplePDL.g:157:55: (iv_ruleProcessElement= ruleProcessElement EOF )
            // InternalSimplePDL.g:158:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalSimplePDL.g:164:1: ruleProcessElement returns [EObject current=null] : (this_Guidance_0= ruleGuidance | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence | this_Resource_3= ruleResource ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_Guidance_0 = null;

        EObject this_WorkDefinition_1 = null;

        EObject this_WorkSequence_2 = null;

        EObject this_Resource_3 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:170:2: ( (this_Guidance_0= ruleGuidance | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence | this_Resource_3= ruleResource ) )
            // InternalSimplePDL.g:171:2: (this_Guidance_0= ruleGuidance | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence | this_Resource_3= ruleResource )
            {
            // InternalSimplePDL.g:171:2: (this_Guidance_0= ruleGuidance | this_WorkDefinition_1= ruleWorkDefinition | this_WorkSequence_2= ruleWorkSequence | this_Resource_3= ruleResource )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimplePDL.g:172:3: this_Guidance_0= ruleGuidance
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Guidance_0=ruleGuidance();

                    state._fsp--;


                    			current = this_Guidance_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:181:3: this_WorkDefinition_1= ruleWorkDefinition
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkDefinition_1=ruleWorkDefinition();

                    state._fsp--;


                    			current = this_WorkDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:190:3: this_WorkSequence_2= ruleWorkSequence
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkSequence_2=ruleWorkSequence();

                    state._fsp--;


                    			current = this_WorkSequence_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimplePDL.g:199:3: this_Resource_3= ruleResource
                    {

                    			newCompositeNode(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resource_3=ruleResource();

                    state._fsp--;


                    			current = this_Resource_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleGuidance"
    // InternalSimplePDL.g:211:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // InternalSimplePDL.g:211:49: (iv_ruleGuidance= ruleGuidance EOF )
            // InternalSimplePDL.g:212:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalSimplePDL.g:218:1: ruleGuidance returns [EObject current=null] : (otherlv_0= 'guid' (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? otherlv_6= '{' otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_text_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:224:2: ( (otherlv_0= 'guid' (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? otherlv_6= '{' otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalSimplePDL.g:225:2: (otherlv_0= 'guid' (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? otherlv_6= '{' otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalSimplePDL.g:225:2: (otherlv_0= 'guid' (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? otherlv_6= '{' otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalSimplePDL.g:226:3: otherlv_0= 'guid' (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )? otherlv_6= '{' otherlv_7= 'text' ( (lv_text_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getGuidanceAccess().getGuidKeyword_0());
            		
            // InternalSimplePDL.g:230:3: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimplePDL.g:231:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSimplePDL.g:235:4: ( (otherlv_2= RULE_ID ) )
                    // InternalSimplePDL.g:236:5: (otherlv_2= RULE_ID )
                    {
                    // InternalSimplePDL.g:236:5: (otherlv_2= RULE_ID )
                    // InternalSimplePDL.g:237:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGuidanceRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalSimplePDL.g:248:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSimplePDL.g:249:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalSimplePDL.g:253:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalSimplePDL.g:254:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalSimplePDL.g:254:6: (otherlv_4= RULE_ID )
                    	    // InternalSimplePDL.g:255:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getGuidanceRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_1_3());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getGuidanceAccess().getTextKeyword_3());
            		
            // InternalSimplePDL.g:280:3: ( (lv_text_8_0= RULE_STRING ) )
            // InternalSimplePDL.g:281:4: (lv_text_8_0= RULE_STRING )
            {
            // InternalSimplePDL.g:281:4: (lv_text_8_0= RULE_STRING )
            // InternalSimplePDL.g:282:5: lv_text_8_0= RULE_STRING
            {
            lv_text_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_text_8_0, grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGuidanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalSimplePDL.g:306:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalSimplePDL.g:306:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalSimplePDL.g:307:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalSimplePDL.g:313:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'need' ( (lv_resources_4_0= ruleACResource ) ) (otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_resources_4_0 = null;

        EObject lv_resources_7_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:319:2: ( (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'need' ( (lv_resources_4_0= ruleACResource ) ) (otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) ) )* otherlv_8= '}' )? ) )
            // InternalSimplePDL.g:320:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'need' ( (lv_resources_4_0= ruleACResource ) ) (otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) ) )* otherlv_8= '}' )? )
            {
            // InternalSimplePDL.g:320:2: (otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'need' ( (lv_resources_4_0= ruleACResource ) ) (otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) ) )* otherlv_8= '}' )? )
            // InternalSimplePDL.g:321:3: otherlv_0= 'wd' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' otherlv_3= 'need' ( (lv_resources_4_0= ruleACResource ) ) (otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
            		
            // InternalSimplePDL.g:325:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDL.g:326:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDL.g:326:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDL.g:327:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSimplePDL.g:343:3: (otherlv_2= '{' otherlv_3= 'need' ( (lv_resources_4_0= ruleACResource ) ) (otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimplePDL.g:344:4: otherlv_2= '{' otherlv_3= 'need' ( (lv_resources_4_0= ruleACResource ) ) (otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getNeedKeyword_2_1());
                    			
                    // InternalSimplePDL.g:352:4: ( (lv_resources_4_0= ruleACResource ) )
                    // InternalSimplePDL.g:353:5: (lv_resources_4_0= ruleACResource )
                    {
                    // InternalSimplePDL.g:353:5: (lv_resources_4_0= ruleACResource )
                    // InternalSimplePDL.g:354:6: lv_resources_4_0= ruleACResource
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getResourcesACResourceParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_resources_4_0=ruleACResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"resources",
                    							lv_resources_4_0,
                    							"simplepdl.xtext.SimplePDL.ACResource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSimplePDL.g:371:4: (otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalSimplePDL.g:372:5: otherlv_5= ',' otherlv_6= 'need' ( (lv_resources_7_0= ruleACResource ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_13); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getWorkDefinitionAccess().getNeedKeyword_2_3_1());
                    	    				
                    	    // InternalSimplePDL.g:380:5: ( (lv_resources_7_0= ruleACResource ) )
                    	    // InternalSimplePDL.g:381:6: (lv_resources_7_0= ruleACResource )
                    	    {
                    	    // InternalSimplePDL.g:381:6: (lv_resources_7_0= ruleACResource )
                    	    // InternalSimplePDL.g:382:7: lv_resources_7_0= ruleACResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getResourcesACResourceParserRuleCall_2_3_2_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_resources_7_0=ruleACResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resources",
                    	    								lv_resources_7_0,
                    	    								"simplepdl.xtext.SimplePDL.ACResource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalSimplePDL.g:409:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalSimplePDL.g:409:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalSimplePDL.g:410:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalSimplePDL.g:416:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' otherlv_1= '{' otherlv_2= 'type' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'pred' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'suc' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_linkType_3_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:422:2: ( (otherlv_0= 'ws' otherlv_1= '{' otherlv_2= 'type' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'pred' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'suc' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalSimplePDL.g:423:2: (otherlv_0= 'ws' otherlv_1= '{' otherlv_2= 'type' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'pred' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'suc' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalSimplePDL.g:423:2: (otherlv_0= 'ws' otherlv_1= '{' otherlv_2= 'type' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'pred' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'suc' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalSimplePDL.g:424:3: otherlv_0= 'ws' otherlv_1= '{' otherlv_2= 'type' ( (lv_linkType_3_0= ruleWorkSequenceType ) ) otherlv_4= 'pred' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'suc' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getTypeKeyword_2());
            		
            // InternalSimplePDL.g:436:3: ( (lv_linkType_3_0= ruleWorkSequenceType ) )
            // InternalSimplePDL.g:437:4: (lv_linkType_3_0= ruleWorkSequenceType )
            {
            // InternalSimplePDL.g:437:4: (lv_linkType_3_0= ruleWorkSequenceType )
            // InternalSimplePDL.g:438:5: lv_linkType_3_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_linkType_3_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"linkType",
            						lv_linkType_3_0,
            						"simplepdl.xtext.SimplePDL.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getPredKeyword_4());
            		
            // InternalSimplePDL.g:459:3: ( (otherlv_5= RULE_ID ) )
            // InternalSimplePDL.g:460:4: (otherlv_5= RULE_ID )
            {
            // InternalSimplePDL.g:460:4: (otherlv_5= RULE_ID )
            // InternalSimplePDL.g:461:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getSucKeyword_6());
            		
            // InternalSimplePDL.g:476:3: ( (otherlv_7= RULE_ID ) )
            // InternalSimplePDL.g:477:4: (otherlv_7= RULE_ID )
            {
            // InternalSimplePDL.g:477:4: (otherlv_7= RULE_ID )
            // InternalSimplePDL.g:478:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_7, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleResource"
    // InternalSimplePDL.g:497:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalSimplePDL.g:497:49: (iv_ruleResource= ruleResource EOF )
            // InternalSimplePDL.g:498:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSimplePDL.g:504:1: ruleResource returns [EObject current=null] : (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_quantity_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:510:2: ( (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalSimplePDL.g:511:2: (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalSimplePDL.g:511:2: (otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalSimplePDL.g:512:3: otherlv_0= 'res' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_quantity_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResKeyword_0());
            		
            // InternalSimplePDL.g:516:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDL.g:517:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDL.g:517:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDL.g:518:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSimplePDL.g:538:3: ( (lv_quantity_3_0= RULE_INT ) )
            // InternalSimplePDL.g:539:4: (lv_quantity_3_0= RULE_INT )
            {
            // InternalSimplePDL.g:539:4: (lv_quantity_3_0= RULE_INT )
            // InternalSimplePDL.g:540:5: lv_quantity_3_0= RULE_INT
            {
            lv_quantity_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_quantity_3_0, grammarAccess.getResourceAccess().getQuantityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"quantity",
            						lv_quantity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleACResource"
    // InternalSimplePDL.g:564:1: entryRuleACResource returns [EObject current=null] : iv_ruleACResource= ruleACResource EOF ;
    public final EObject entryRuleACResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleACResource = null;


        try {
            // InternalSimplePDL.g:564:51: (iv_ruleACResource= ruleACResource EOF )
            // InternalSimplePDL.g:565:2: iv_ruleACResource= ruleACResource EOF
            {
             newCompositeNode(grammarAccess.getACResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleACResource=ruleACResource();

            state._fsp--;

             current =iv_ruleACResource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACResource"


    // $ANTLR start "ruleACResource"
    // InternalSimplePDL.g:571:1: ruleACResource returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_resourceQuantity_2_0= RULE_INT ) ) ) ;
    public final EObject ruleACResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_resourceQuantity_2_0=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:577:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_resourceQuantity_2_0= RULE_INT ) ) ) )
            // InternalSimplePDL.g:578:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_resourceQuantity_2_0= RULE_INT ) ) )
            {
            // InternalSimplePDL.g:578:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_resourceQuantity_2_0= RULE_INT ) ) )
            // InternalSimplePDL.g:579:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_resourceQuantity_2_0= RULE_INT ) )
            {
            // InternalSimplePDL.g:579:3: ( (otherlv_0= RULE_ID ) )
            // InternalSimplePDL.g:580:4: (otherlv_0= RULE_ID )
            {
            // InternalSimplePDL.g:580:4: (otherlv_0= RULE_ID )
            // InternalSimplePDL.g:581:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getACResourceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getACResourceAccess().getResourceResourceCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getACResourceAccess().getColonKeyword_1());
            		
            // InternalSimplePDL.g:596:3: ( (lv_resourceQuantity_2_0= RULE_INT ) )
            // InternalSimplePDL.g:597:4: (lv_resourceQuantity_2_0= RULE_INT )
            {
            // InternalSimplePDL.g:597:4: (lv_resourceQuantity_2_0= RULE_INT )
            // InternalSimplePDL.g:598:5: lv_resourceQuantity_2_0= RULE_INT
            {
            lv_resourceQuantity_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_resourceQuantity_2_0, grammarAccess.getACResourceAccess().getResourceQuantityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getACResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"resourceQuantity",
            						lv_resourceQuantity_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACResource"


    // $ANTLR start "entryRuleWorkSequenceType"
    // InternalSimplePDL.g:618:1: entryRuleWorkSequenceType returns [EObject current=null] : iv_ruleWorkSequenceType= ruleWorkSequenceType EOF ;
    public final EObject entryRuleWorkSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequenceType = null;


        try {
            // InternalSimplePDL.g:618:57: (iv_ruleWorkSequenceType= ruleWorkSequenceType EOF )
            // InternalSimplePDL.g:619:2: iv_ruleWorkSequenceType= ruleWorkSequenceType EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequenceType=ruleWorkSequenceType();

            state._fsp--;

             current =iv_ruleWorkSequenceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkSequenceType"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalSimplePDL.g:625:1: ruleWorkSequenceType returns [EObject current=null] : ( ( (lv_startToStart_0_0= 's2s' ) ) | ( (lv_finishToStart_1_0= 'f2s' ) ) | ( (lv_startToFinish_2_0= 's2f' ) ) | ( (lv_finishToFinish_3_0= 'f2f' ) ) ) ;
    public final EObject ruleWorkSequenceType() throws RecognitionException {
        EObject current = null;

        Token lv_startToStart_0_0=null;
        Token lv_finishToStart_1_0=null;
        Token lv_startToFinish_2_0=null;
        Token lv_finishToFinish_3_0=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:631:2: ( ( ( (lv_startToStart_0_0= 's2s' ) ) | ( (lv_finishToStart_1_0= 'f2s' ) ) | ( (lv_startToFinish_2_0= 's2f' ) ) | ( (lv_finishToFinish_3_0= 'f2f' ) ) ) )
            // InternalSimplePDL.g:632:2: ( ( (lv_startToStart_0_0= 's2s' ) ) | ( (lv_finishToStart_1_0= 'f2s' ) ) | ( (lv_startToFinish_2_0= 's2f' ) ) | ( (lv_finishToFinish_3_0= 'f2f' ) ) )
            {
            // InternalSimplePDL.g:632:2: ( ( (lv_startToStart_0_0= 's2s' ) ) | ( (lv_finishToStart_1_0= 'f2s' ) ) | ( (lv_startToFinish_2_0= 's2f' ) ) | ( (lv_finishToFinish_3_0= 'f2f' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 28:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            case 30:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSimplePDL.g:633:3: ( (lv_startToStart_0_0= 's2s' ) )
                    {
                    // InternalSimplePDL.g:633:3: ( (lv_startToStart_0_0= 's2s' ) )
                    // InternalSimplePDL.g:634:4: (lv_startToStart_0_0= 's2s' )
                    {
                    // InternalSimplePDL.g:634:4: (lv_startToStart_0_0= 's2s' )
                    // InternalSimplePDL.g:635:5: lv_startToStart_0_0= 's2s'
                    {
                    lv_startToStart_0_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_startToStart_0_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartS2sKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceTypeRule());
                    					}
                    					setWithLastConsumed(current, "startToStart", lv_startToStart_0_0, "s2s");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:648:3: ( (lv_finishToStart_1_0= 'f2s' ) )
                    {
                    // InternalSimplePDL.g:648:3: ( (lv_finishToStart_1_0= 'f2s' ) )
                    // InternalSimplePDL.g:649:4: (lv_finishToStart_1_0= 'f2s' )
                    {
                    // InternalSimplePDL.g:649:4: (lv_finishToStart_1_0= 'f2s' )
                    // InternalSimplePDL.g:650:5: lv_finishToStart_1_0= 'f2s'
                    {
                    lv_finishToStart_1_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_finishToStart_1_0, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartF2sKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceTypeRule());
                    					}
                    					setWithLastConsumed(current, "finishToStart", lv_finishToStart_1_0, "f2s");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:663:3: ( (lv_startToFinish_2_0= 's2f' ) )
                    {
                    // InternalSimplePDL.g:663:3: ( (lv_startToFinish_2_0= 's2f' ) )
                    // InternalSimplePDL.g:664:4: (lv_startToFinish_2_0= 's2f' )
                    {
                    // InternalSimplePDL.g:664:4: (lv_startToFinish_2_0= 's2f' )
                    // InternalSimplePDL.g:665:5: lv_startToFinish_2_0= 's2f'
                    {
                    lv_startToFinish_2_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_startToFinish_2_0, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishS2fKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceTypeRule());
                    					}
                    					setWithLastConsumed(current, "startToFinish", lv_startToFinish_2_0, "s2f");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSimplePDL.g:678:3: ( (lv_finishToFinish_3_0= 'f2f' ) )
                    {
                    // InternalSimplePDL.g:678:3: ( (lv_finishToFinish_3_0= 'f2f' ) )
                    // InternalSimplePDL.g:679:4: (lv_finishToFinish_3_0= 'f2f' )
                    {
                    // InternalSimplePDL.g:679:4: (lv_finishToFinish_3_0= 'f2f' )
                    // InternalSimplePDL.g:680:5: lv_finishToFinish_3_0= 'f2f'
                    {
                    lv_finishToFinish_3_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_finishToFinish_3_0, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishF2fKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getWorkSequenceTypeRule());
                    					}
                    					setWithLastConsumed(current, "finishToFinish", lv_finishToFinish_3_0, "f2f");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002288000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}