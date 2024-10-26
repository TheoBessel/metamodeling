package simplepdl.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import simplepdl.xtext.services.SimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'proc'", "'{'", "'}'", "','", "'guid'", "'text'", "'('", "')'", "'wd'", "'need'", "'ws'", "'type'", "'pred'", "'suc'", "'res'", "':'", "'s2s'", "'f2s'", "'s2f'", "'f2f'"
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

    	public void setGrammarAccess(SimplePDLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProcess"
    // InternalSimplePDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalSimplePDL.g:54:1: ( ruleProcess EOF )
            // InternalSimplePDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSimplePDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalSimplePDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalSimplePDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalSimplePDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalSimplePDL.g:69:3: ( rule__Process__Group__0 )
            // InternalSimplePDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalSimplePDL.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalSimplePDL.g:79:1: ( ruleProcessElement EOF )
            // InternalSimplePDL.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalSimplePDL.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalSimplePDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalSimplePDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalSimplePDL.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalSimplePDL.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalSimplePDL.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleGuidance"
    // InternalSimplePDL.g:103:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalSimplePDL.g:104:1: ( ruleGuidance EOF )
            // InternalSimplePDL.g:105:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalSimplePDL.g:112:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:116:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalSimplePDL.g:117:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalSimplePDL.g:117:2: ( ( rule__Guidance__Group__0 ) )
            // InternalSimplePDL.g:118:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalSimplePDL.g:119:3: ( rule__Guidance__Group__0 )
            // InternalSimplePDL.g:119:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalSimplePDL.g:128:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalSimplePDL.g:129:1: ( ruleWorkDefinition EOF )
            // InternalSimplePDL.g:130:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalSimplePDL.g:137:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:141:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalSimplePDL.g:142:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalSimplePDL.g:142:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalSimplePDL.g:143:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalSimplePDL.g:144:3: ( rule__WorkDefinition__Group__0 )
            // InternalSimplePDL.g:144:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalSimplePDL.g:153:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalSimplePDL.g:154:1: ( ruleWorkSequence EOF )
            // InternalSimplePDL.g:155:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalSimplePDL.g:162:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:166:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalSimplePDL.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalSimplePDL.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalSimplePDL.g:168:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalSimplePDL.g:169:3: ( rule__WorkSequence__Group__0 )
            // InternalSimplePDL.g:169:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleResource"
    // InternalSimplePDL.g:178:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalSimplePDL.g:179:1: ( ruleResource EOF )
            // InternalSimplePDL.g:180:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSimplePDL.g:187:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:191:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalSimplePDL.g:192:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalSimplePDL.g:192:2: ( ( rule__Resource__Group__0 ) )
            // InternalSimplePDL.g:193:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalSimplePDL.g:194:3: ( rule__Resource__Group__0 )
            // InternalSimplePDL.g:194:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleACResource"
    // InternalSimplePDL.g:203:1: entryRuleACResource : ruleACResource EOF ;
    public final void entryRuleACResource() throws RecognitionException {
        try {
            // InternalSimplePDL.g:204:1: ( ruleACResource EOF )
            // InternalSimplePDL.g:205:1: ruleACResource EOF
            {
             before(grammarAccess.getACResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleACResource();

            state._fsp--;

             after(grammarAccess.getACResourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleACResource"


    // $ANTLR start "ruleACResource"
    // InternalSimplePDL.g:212:1: ruleACResource : ( ( rule__ACResource__Group__0 ) ) ;
    public final void ruleACResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:216:2: ( ( ( rule__ACResource__Group__0 ) ) )
            // InternalSimplePDL.g:217:2: ( ( rule__ACResource__Group__0 ) )
            {
            // InternalSimplePDL.g:217:2: ( ( rule__ACResource__Group__0 ) )
            // InternalSimplePDL.g:218:3: ( rule__ACResource__Group__0 )
            {
             before(grammarAccess.getACResourceAccess().getGroup()); 
            // InternalSimplePDL.g:219:3: ( rule__ACResource__Group__0 )
            // InternalSimplePDL.g:219:4: rule__ACResource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ACResource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACResource"


    // $ANTLR start "entryRuleWorkSequenceType"
    // InternalSimplePDL.g:228:1: entryRuleWorkSequenceType : ruleWorkSequenceType EOF ;
    public final void entryRuleWorkSequenceType() throws RecognitionException {
        try {
            // InternalSimplePDL.g:229:1: ( ruleWorkSequenceType EOF )
            // InternalSimplePDL.g:230:1: ruleWorkSequenceType EOF
            {
             before(grammarAccess.getWorkSequenceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkSequenceType"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalSimplePDL.g:237:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:241:2: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalSimplePDL.g:242:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalSimplePDL.g:242:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalSimplePDL.g:243:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalSimplePDL.g:244:3: ( rule__WorkSequenceType__Alternatives )
            // InternalSimplePDL.g:244:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalSimplePDL.g:252:1: rule__ProcessElement__Alternatives : ( ( ruleGuidance ) | ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleResource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:256:1: ( ( ruleGuidance ) | ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleResource ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSimplePDL.g:257:2: ( ruleGuidance )
                    {
                    // InternalSimplePDL.g:257:2: ( ruleGuidance )
                    // InternalSimplePDL.g:258:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:263:2: ( ruleWorkDefinition )
                    {
                    // InternalSimplePDL.g:263:2: ( ruleWorkDefinition )
                    // InternalSimplePDL.g:264:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:269:2: ( ruleWorkSequence )
                    {
                    // InternalSimplePDL.g:269:2: ( ruleWorkSequence )
                    // InternalSimplePDL.g:270:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplePDL.g:275:2: ( ruleResource )
                    {
                    // InternalSimplePDL.g:275:2: ( ruleResource )
                    // InternalSimplePDL.g:276:3: ruleResource
                    {
                     before(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getResourceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalSimplePDL.g:285:1: rule__WorkSequenceType__Alternatives : ( ( ( rule__WorkSequenceType__StartToStartAssignment_0 ) ) | ( ( rule__WorkSequenceType__FinishToStartAssignment_1 ) ) | ( ( rule__WorkSequenceType__StartToFinishAssignment_2 ) ) | ( ( rule__WorkSequenceType__FinishToFinishAssignment_3 ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:289:1: ( ( ( rule__WorkSequenceType__StartToStartAssignment_0 ) ) | ( ( rule__WorkSequenceType__FinishToStartAssignment_1 ) ) | ( ( rule__WorkSequenceType__StartToFinishAssignment_2 ) ) | ( ( rule__WorkSequenceType__FinishToFinishAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
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
                    // InternalSimplePDL.g:290:2: ( ( rule__WorkSequenceType__StartToStartAssignment_0 ) )
                    {
                    // InternalSimplePDL.g:290:2: ( ( rule__WorkSequenceType__StartToStartAssignment_0 ) )
                    // InternalSimplePDL.g:291:3: ( rule__WorkSequenceType__StartToStartAssignment_0 )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartAssignment_0()); 
                    // InternalSimplePDL.g:292:3: ( rule__WorkSequenceType__StartToStartAssignment_0 )
                    // InternalSimplePDL.g:292:4: rule__WorkSequenceType__StartToStartAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkSequenceType__StartToStartAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:296:2: ( ( rule__WorkSequenceType__FinishToStartAssignment_1 ) )
                    {
                    // InternalSimplePDL.g:296:2: ( ( rule__WorkSequenceType__FinishToStartAssignment_1 ) )
                    // InternalSimplePDL.g:297:3: ( rule__WorkSequenceType__FinishToStartAssignment_1 )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartAssignment_1()); 
                    // InternalSimplePDL.g:298:3: ( rule__WorkSequenceType__FinishToStartAssignment_1 )
                    // InternalSimplePDL.g:298:4: rule__WorkSequenceType__FinishToStartAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkSequenceType__FinishToStartAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:302:2: ( ( rule__WorkSequenceType__StartToFinishAssignment_2 ) )
                    {
                    // InternalSimplePDL.g:302:2: ( ( rule__WorkSequenceType__StartToFinishAssignment_2 ) )
                    // InternalSimplePDL.g:303:3: ( rule__WorkSequenceType__StartToFinishAssignment_2 )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishAssignment_2()); 
                    // InternalSimplePDL.g:304:3: ( rule__WorkSequenceType__StartToFinishAssignment_2 )
                    // InternalSimplePDL.g:304:4: rule__WorkSequenceType__StartToFinishAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkSequenceType__StartToFinishAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplePDL.g:308:2: ( ( rule__WorkSequenceType__FinishToFinishAssignment_3 ) )
                    {
                    // InternalSimplePDL.g:308:2: ( ( rule__WorkSequenceType__FinishToFinishAssignment_3 ) )
                    // InternalSimplePDL.g:309:3: ( rule__WorkSequenceType__FinishToFinishAssignment_3 )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishAssignment_3()); 
                    // InternalSimplePDL.g:310:3: ( rule__WorkSequenceType__FinishToFinishAssignment_3 )
                    // InternalSimplePDL.g:310:4: rule__WorkSequenceType__FinishToFinishAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkSequenceType__FinishToFinishAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalSimplePDL.g:318:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:322:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalSimplePDL.g:323:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalSimplePDL.g:330:1: rule__Process__Group__0__Impl : ( 'proc' ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:334:1: ( ( 'proc' ) )
            // InternalSimplePDL.g:335:1: ( 'proc' )
            {
            // InternalSimplePDL.g:335:1: ( 'proc' )
            // InternalSimplePDL.g:336:2: 'proc'
            {
             before(grammarAccess.getProcessAccess().getProcKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalSimplePDL.g:345:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:349:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalSimplePDL.g:350:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalSimplePDL.g:357:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:361:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalSimplePDL.g:362:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalSimplePDL.g:362:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalSimplePDL.g:363:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalSimplePDL.g:364:2: ( rule__Process__NameAssignment_1 )
            // InternalSimplePDL.g:364:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalSimplePDL.g:372:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:376:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalSimplePDL.g:377:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalSimplePDL.g:384:1: rule__Process__Group__2__Impl : ( '{' ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:388:1: ( ( '{' ) )
            // InternalSimplePDL.g:389:1: ( '{' )
            {
            // InternalSimplePDL.g:389:1: ( '{' )
            // InternalSimplePDL.g:390:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalSimplePDL.g:399:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:403:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalSimplePDL.g:404:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalSimplePDL.g:411:1: rule__Process__Group__3__Impl : ( ( rule__Process__ProcessElementsAssignment_3 ) ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:415:1: ( ( ( rule__Process__ProcessElementsAssignment_3 ) ) )
            // InternalSimplePDL.g:416:1: ( ( rule__Process__ProcessElementsAssignment_3 ) )
            {
            // InternalSimplePDL.g:416:1: ( ( rule__Process__ProcessElementsAssignment_3 ) )
            // InternalSimplePDL.g:417:2: ( rule__Process__ProcessElementsAssignment_3 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 
            // InternalSimplePDL.g:418:2: ( rule__Process__ProcessElementsAssignment_3 )
            // InternalSimplePDL.g:418:3: rule__Process__ProcessElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalSimplePDL.g:426:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:430:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalSimplePDL.g:431:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalSimplePDL.g:438:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )* ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:442:1: ( ( ( rule__Process__Group_4__0 )* ) )
            // InternalSimplePDL.g:443:1: ( ( rule__Process__Group_4__0 )* )
            {
            // InternalSimplePDL.g:443:1: ( ( rule__Process__Group_4__0 )* )
            // InternalSimplePDL.g:444:2: ( rule__Process__Group_4__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // InternalSimplePDL.g:445:2: ( rule__Process__Group_4__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimplePDL.g:445:3: rule__Process__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalSimplePDL.g:453:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:457:1: ( rule__Process__Group__5__Impl )
            // InternalSimplePDL.g:458:2: rule__Process__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalSimplePDL.g:464:1: rule__Process__Group__5__Impl : ( '}' ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:468:1: ( ( '}' ) )
            // InternalSimplePDL.g:469:1: ( '}' )
            {
            // InternalSimplePDL.g:469:1: ( '}' )
            // InternalSimplePDL.g:470:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // InternalSimplePDL.g:480:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:484:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalSimplePDL.g:485:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // InternalSimplePDL.g:492:1: rule__Process__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:496:1: ( ( ',' ) )
            // InternalSimplePDL.g:497:1: ( ',' )
            {
            // InternalSimplePDL.g:497:1: ( ',' )
            // InternalSimplePDL.g:498:2: ','
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // InternalSimplePDL.g:507:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:511:1: ( rule__Process__Group_4__1__Impl )
            // InternalSimplePDL.g:512:2: rule__Process__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // InternalSimplePDL.g:518:1: rule__Process__Group_4__1__Impl : ( ( rule__Process__ProcessElementsAssignment_4_1 ) ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:522:1: ( ( ( rule__Process__ProcessElementsAssignment_4_1 ) ) )
            // InternalSimplePDL.g:523:1: ( ( rule__Process__ProcessElementsAssignment_4_1 ) )
            {
            // InternalSimplePDL.g:523:1: ( ( rule__Process__ProcessElementsAssignment_4_1 ) )
            // InternalSimplePDL.g:524:2: ( rule__Process__ProcessElementsAssignment_4_1 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_1()); 
            // InternalSimplePDL.g:525:2: ( rule__Process__ProcessElementsAssignment_4_1 )
            // InternalSimplePDL.g:525:3: rule__Process__ProcessElementsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ProcessElementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalSimplePDL.g:534:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:538:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalSimplePDL.g:539:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalSimplePDL.g:546:1: rule__Guidance__Group__0__Impl : ( 'guid' ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:550:1: ( ( 'guid' ) )
            // InternalSimplePDL.g:551:1: ( 'guid' )
            {
            // InternalSimplePDL.g:551:1: ( 'guid' )
            // InternalSimplePDL.g:552:2: 'guid'
            {
             before(grammarAccess.getGuidanceAccess().getGuidKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getGuidKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalSimplePDL.g:561:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:565:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalSimplePDL.g:566:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalSimplePDL.g:573:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__Group_1__0 )? ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:577:1: ( ( ( rule__Guidance__Group_1__0 )? ) )
            // InternalSimplePDL.g:578:1: ( ( rule__Guidance__Group_1__0 )? )
            {
            // InternalSimplePDL.g:578:1: ( ( rule__Guidance__Group_1__0 )? )
            // InternalSimplePDL.g:579:2: ( rule__Guidance__Group_1__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_1()); 
            // InternalSimplePDL.g:580:2: ( rule__Guidance__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimplePDL.g:580:3: rule__Guidance__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalSimplePDL.g:588:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:592:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalSimplePDL.g:593:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalSimplePDL.g:600:1: rule__Guidance__Group__2__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:604:1: ( ( '{' ) )
            // InternalSimplePDL.g:605:1: ( '{' )
            {
            // InternalSimplePDL.g:605:1: ( '{' )
            // InternalSimplePDL.g:606:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalSimplePDL.g:615:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:619:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalSimplePDL.g:620:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalSimplePDL.g:627:1: rule__Guidance__Group__3__Impl : ( 'text' ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:631:1: ( ( 'text' ) )
            // InternalSimplePDL.g:632:1: ( 'text' )
            {
            // InternalSimplePDL.g:632:1: ( 'text' )
            // InternalSimplePDL.g:633:2: 'text'
            {
             before(grammarAccess.getGuidanceAccess().getTextKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalSimplePDL.g:642:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:646:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // InternalSimplePDL.g:647:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalSimplePDL.g:654:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__TextAssignment_4 ) ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:658:1: ( ( ( rule__Guidance__TextAssignment_4 ) ) )
            // InternalSimplePDL.g:659:1: ( ( rule__Guidance__TextAssignment_4 ) )
            {
            // InternalSimplePDL.g:659:1: ( ( rule__Guidance__TextAssignment_4 ) )
            // InternalSimplePDL.g:660:2: ( rule__Guidance__TextAssignment_4 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_4()); 
            // InternalSimplePDL.g:661:2: ( rule__Guidance__TextAssignment_4 )
            // InternalSimplePDL.g:661:3: rule__Guidance__TextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group__5"
    // InternalSimplePDL.g:669:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:673:1: ( rule__Guidance__Group__5__Impl )
            // InternalSimplePDL.g:674:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5"


    // $ANTLR start "rule__Guidance__Group__5__Impl"
    // InternalSimplePDL.g:680:1: rule__Guidance__Group__5__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:684:1: ( ( '}' ) )
            // InternalSimplePDL.g:685:1: ( '}' )
            {
            // InternalSimplePDL.g:685:1: ( '}' )
            // InternalSimplePDL.g:686:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group_1__0"
    // InternalSimplePDL.g:696:1: rule__Guidance__Group_1__0 : rule__Guidance__Group_1__0__Impl rule__Guidance__Group_1__1 ;
    public final void rule__Guidance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:700:1: ( rule__Guidance__Group_1__0__Impl rule__Guidance__Group_1__1 )
            // InternalSimplePDL.g:701:2: rule__Guidance__Group_1__0__Impl rule__Guidance__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Guidance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1__0"


    // $ANTLR start "rule__Guidance__Group_1__0__Impl"
    // InternalSimplePDL.g:708:1: rule__Guidance__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Guidance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:712:1: ( ( '(' ) )
            // InternalSimplePDL.g:713:1: ( '(' )
            {
            // InternalSimplePDL.g:713:1: ( '(' )
            // InternalSimplePDL.g:714:2: '('
            {
             before(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1__0__Impl"


    // $ANTLR start "rule__Guidance__Group_1__1"
    // InternalSimplePDL.g:723:1: rule__Guidance__Group_1__1 : rule__Guidance__Group_1__1__Impl rule__Guidance__Group_1__2 ;
    public final void rule__Guidance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:727:1: ( rule__Guidance__Group_1__1__Impl rule__Guidance__Group_1__2 )
            // InternalSimplePDL.g:728:2: rule__Guidance__Group_1__1__Impl rule__Guidance__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Guidance__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1__1"


    // $ANTLR start "rule__Guidance__Group_1__1__Impl"
    // InternalSimplePDL.g:735:1: rule__Guidance__Group_1__1__Impl : ( ( rule__Guidance__ElementsAssignment_1_1 ) ) ;
    public final void rule__Guidance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:739:1: ( ( ( rule__Guidance__ElementsAssignment_1_1 ) ) )
            // InternalSimplePDL.g:740:1: ( ( rule__Guidance__ElementsAssignment_1_1 ) )
            {
            // InternalSimplePDL.g:740:1: ( ( rule__Guidance__ElementsAssignment_1_1 ) )
            // InternalSimplePDL.g:741:2: ( rule__Guidance__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_1_1()); 
            // InternalSimplePDL.g:742:2: ( rule__Guidance__ElementsAssignment_1_1 )
            // InternalSimplePDL.g:742:3: rule__Guidance__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1__1__Impl"


    // $ANTLR start "rule__Guidance__Group_1__2"
    // InternalSimplePDL.g:750:1: rule__Guidance__Group_1__2 : rule__Guidance__Group_1__2__Impl rule__Guidance__Group_1__3 ;
    public final void rule__Guidance__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:754:1: ( rule__Guidance__Group_1__2__Impl rule__Guidance__Group_1__3 )
            // InternalSimplePDL.g:755:2: rule__Guidance__Group_1__2__Impl rule__Guidance__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__Guidance__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1__2"


    // $ANTLR start "rule__Guidance__Group_1__2__Impl"
    // InternalSimplePDL.g:762:1: rule__Guidance__Group_1__2__Impl : ( ( rule__Guidance__Group_1_2__0 )* ) ;
    public final void rule__Guidance__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:766:1: ( ( ( rule__Guidance__Group_1_2__0 )* ) )
            // InternalSimplePDL.g:767:1: ( ( rule__Guidance__Group_1_2__0 )* )
            {
            // InternalSimplePDL.g:767:1: ( ( rule__Guidance__Group_1_2__0 )* )
            // InternalSimplePDL.g:768:2: ( rule__Guidance__Group_1_2__0 )*
            {
             before(grammarAccess.getGuidanceAccess().getGroup_1_2()); 
            // InternalSimplePDL.g:769:2: ( rule__Guidance__Group_1_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimplePDL.g:769:3: rule__Guidance__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Guidance__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1__2__Impl"


    // $ANTLR start "rule__Guidance__Group_1__3"
    // InternalSimplePDL.g:777:1: rule__Guidance__Group_1__3 : rule__Guidance__Group_1__3__Impl ;
    public final void rule__Guidance__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:781:1: ( rule__Guidance__Group_1__3__Impl )
            // InternalSimplePDL.g:782:2: rule__Guidance__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1__3"


    // $ANTLR start "rule__Guidance__Group_1__3__Impl"
    // InternalSimplePDL.g:788:1: rule__Guidance__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Guidance__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:792:1: ( ( ')' ) )
            // InternalSimplePDL.g:793:1: ( ')' )
            {
            // InternalSimplePDL.g:793:1: ( ')' )
            // InternalSimplePDL.g:794:2: ')'
            {
             before(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_1_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1__3__Impl"


    // $ANTLR start "rule__Guidance__Group_1_2__0"
    // InternalSimplePDL.g:804:1: rule__Guidance__Group_1_2__0 : rule__Guidance__Group_1_2__0__Impl rule__Guidance__Group_1_2__1 ;
    public final void rule__Guidance__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:808:1: ( rule__Guidance__Group_1_2__0__Impl rule__Guidance__Group_1_2__1 )
            // InternalSimplePDL.g:809:2: rule__Guidance__Group_1_2__0__Impl rule__Guidance__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Guidance__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1_2__0"


    // $ANTLR start "rule__Guidance__Group_1_2__0__Impl"
    // InternalSimplePDL.g:816:1: rule__Guidance__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Guidance__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:820:1: ( ( ',' ) )
            // InternalSimplePDL.g:821:1: ( ',' )
            {
            // InternalSimplePDL.g:821:1: ( ',' )
            // InternalSimplePDL.g:822:2: ','
            {
             before(grammarAccess.getGuidanceAccess().getCommaKeyword_1_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1_2__0__Impl"


    // $ANTLR start "rule__Guidance__Group_1_2__1"
    // InternalSimplePDL.g:831:1: rule__Guidance__Group_1_2__1 : rule__Guidance__Group_1_2__1__Impl ;
    public final void rule__Guidance__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:835:1: ( rule__Guidance__Group_1_2__1__Impl )
            // InternalSimplePDL.g:836:2: rule__Guidance__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1_2__1"


    // $ANTLR start "rule__Guidance__Group_1_2__1__Impl"
    // InternalSimplePDL.g:842:1: rule__Guidance__Group_1_2__1__Impl : ( ( rule__Guidance__ElementsAssignment_1_2_1 ) ) ;
    public final void rule__Guidance__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:846:1: ( ( ( rule__Guidance__ElementsAssignment_1_2_1 ) ) )
            // InternalSimplePDL.g:847:1: ( ( rule__Guidance__ElementsAssignment_1_2_1 ) )
            {
            // InternalSimplePDL.g:847:1: ( ( rule__Guidance__ElementsAssignment_1_2_1 ) )
            // InternalSimplePDL.g:848:2: ( rule__Guidance__ElementsAssignment_1_2_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_1_2_1()); 
            // InternalSimplePDL.g:849:2: ( rule__Guidance__ElementsAssignment_1_2_1 )
            // InternalSimplePDL.g:849:3: rule__Guidance__ElementsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_1_2__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalSimplePDL.g:858:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:862:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalSimplePDL.g:863:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalSimplePDL.g:870:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:874:1: ( ( 'wd' ) )
            // InternalSimplePDL.g:875:1: ( 'wd' )
            {
            // InternalSimplePDL.g:875:1: ( 'wd' )
            // InternalSimplePDL.g:876:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalSimplePDL.g:885:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:889:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalSimplePDL.g:890:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalSimplePDL.g:897:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:901:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // InternalSimplePDL.g:902:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // InternalSimplePDL.g:902:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // InternalSimplePDL.g:903:2: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // InternalSimplePDL.g:904:2: ( rule__WorkDefinition__NameAssignment_1 )
            // InternalSimplePDL.g:904:3: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalSimplePDL.g:912:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:916:1: ( rule__WorkDefinition__Group__2__Impl )
            // InternalSimplePDL.g:917:2: rule__WorkDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalSimplePDL.g:923:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__Group_2__0 )? ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:927:1: ( ( ( rule__WorkDefinition__Group_2__0 )? ) )
            // InternalSimplePDL.g:928:1: ( ( rule__WorkDefinition__Group_2__0 )? )
            {
            // InternalSimplePDL.g:928:1: ( ( rule__WorkDefinition__Group_2__0 )? )
            // InternalSimplePDL.g:929:2: ( rule__WorkDefinition__Group_2__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_2()); 
            // InternalSimplePDL.g:930:2: ( rule__WorkDefinition__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimplePDL.g:930:3: rule__WorkDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__0"
    // InternalSimplePDL.g:939:1: rule__WorkDefinition__Group_2__0 : rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1 ;
    public final void rule__WorkDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:943:1: ( rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1 )
            // InternalSimplePDL.g:944:2: rule__WorkDefinition__Group_2__0__Impl rule__WorkDefinition__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__0"


    // $ANTLR start "rule__WorkDefinition__Group_2__0__Impl"
    // InternalSimplePDL.g:951:1: rule__WorkDefinition__Group_2__0__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:955:1: ( ( '{' ) )
            // InternalSimplePDL.g:956:1: ( '{' )
            {
            // InternalSimplePDL.g:956:1: ( '{' )
            // InternalSimplePDL.g:957:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__1"
    // InternalSimplePDL.g:966:1: rule__WorkDefinition__Group_2__1 : rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2 ;
    public final void rule__WorkDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:970:1: ( rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2 )
            // InternalSimplePDL.g:971:2: rule__WorkDefinition__Group_2__1__Impl rule__WorkDefinition__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__1"


    // $ANTLR start "rule__WorkDefinition__Group_2__1__Impl"
    // InternalSimplePDL.g:978:1: rule__WorkDefinition__Group_2__1__Impl : ( 'need' ) ;
    public final void rule__WorkDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:982:1: ( ( 'need' ) )
            // InternalSimplePDL.g:983:1: ( 'need' )
            {
            // InternalSimplePDL.g:983:1: ( 'need' )
            // InternalSimplePDL.g:984:2: 'need'
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedKeyword_2_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNeedKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__2"
    // InternalSimplePDL.g:993:1: rule__WorkDefinition__Group_2__2 : rule__WorkDefinition__Group_2__2__Impl rule__WorkDefinition__Group_2__3 ;
    public final void rule__WorkDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:997:1: ( rule__WorkDefinition__Group_2__2__Impl rule__WorkDefinition__Group_2__3 )
            // InternalSimplePDL.g:998:2: rule__WorkDefinition__Group_2__2__Impl rule__WorkDefinition__Group_2__3
            {
            pushFollow(FOLLOW_6);
            rule__WorkDefinition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__2"


    // $ANTLR start "rule__WorkDefinition__Group_2__2__Impl"
    // InternalSimplePDL.g:1005:1: rule__WorkDefinition__Group_2__2__Impl : ( ( rule__WorkDefinition__ResourcesAssignment_2_2 ) ) ;
    public final void rule__WorkDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1009:1: ( ( ( rule__WorkDefinition__ResourcesAssignment_2_2 ) ) )
            // InternalSimplePDL.g:1010:1: ( ( rule__WorkDefinition__ResourcesAssignment_2_2 ) )
            {
            // InternalSimplePDL.g:1010:1: ( ( rule__WorkDefinition__ResourcesAssignment_2_2 ) )
            // InternalSimplePDL.g:1011:2: ( rule__WorkDefinition__ResourcesAssignment_2_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getResourcesAssignment_2_2()); 
            // InternalSimplePDL.g:1012:2: ( rule__WorkDefinition__ResourcesAssignment_2_2 )
            // InternalSimplePDL.g:1012:3: rule__WorkDefinition__ResourcesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__ResourcesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getResourcesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__3"
    // InternalSimplePDL.g:1020:1: rule__WorkDefinition__Group_2__3 : rule__WorkDefinition__Group_2__3__Impl rule__WorkDefinition__Group_2__4 ;
    public final void rule__WorkDefinition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1024:1: ( rule__WorkDefinition__Group_2__3__Impl rule__WorkDefinition__Group_2__4 )
            // InternalSimplePDL.g:1025:2: rule__WorkDefinition__Group_2__3__Impl rule__WorkDefinition__Group_2__4
            {
            pushFollow(FOLLOW_6);
            rule__WorkDefinition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__3"


    // $ANTLR start "rule__WorkDefinition__Group_2__3__Impl"
    // InternalSimplePDL.g:1032:1: rule__WorkDefinition__Group_2__3__Impl : ( ( rule__WorkDefinition__Group_2_3__0 )* ) ;
    public final void rule__WorkDefinition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1036:1: ( ( ( rule__WorkDefinition__Group_2_3__0 )* ) )
            // InternalSimplePDL.g:1037:1: ( ( rule__WorkDefinition__Group_2_3__0 )* )
            {
            // InternalSimplePDL.g:1037:1: ( ( rule__WorkDefinition__Group_2_3__0 )* )
            // InternalSimplePDL.g:1038:2: ( rule__WorkDefinition__Group_2_3__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_2_3()); 
            // InternalSimplePDL.g:1039:2: ( rule__WorkDefinition__Group_2_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimplePDL.g:1039:3: rule__WorkDefinition__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WorkDefinition__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2__4"
    // InternalSimplePDL.g:1047:1: rule__WorkDefinition__Group_2__4 : rule__WorkDefinition__Group_2__4__Impl ;
    public final void rule__WorkDefinition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1051:1: ( rule__WorkDefinition__Group_2__4__Impl )
            // InternalSimplePDL.g:1052:2: rule__WorkDefinition__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__4"


    // $ANTLR start "rule__WorkDefinition__Group_2__4__Impl"
    // InternalSimplePDL.g:1058:1: rule__WorkDefinition__Group_2__4__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1062:1: ( ( '}' ) )
            // InternalSimplePDL.g:1063:1: ( '}' )
            {
            // InternalSimplePDL.g:1063:1: ( '}' )
            // InternalSimplePDL.g:1064:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_3__0"
    // InternalSimplePDL.g:1074:1: rule__WorkDefinition__Group_2_3__0 : rule__WorkDefinition__Group_2_3__0__Impl rule__WorkDefinition__Group_2_3__1 ;
    public final void rule__WorkDefinition__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1078:1: ( rule__WorkDefinition__Group_2_3__0__Impl rule__WorkDefinition__Group_2_3__1 )
            // InternalSimplePDL.g:1079:2: rule__WorkDefinition__Group_2_3__0__Impl rule__WorkDefinition__Group_2_3__1
            {
            pushFollow(FOLLOW_13);
            rule__WorkDefinition__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_2_3__0__Impl"
    // InternalSimplePDL.g:1086:1: rule__WorkDefinition__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1090:1: ( ( ',' ) )
            // InternalSimplePDL.g:1091:1: ( ',' )
            {
            // InternalSimplePDL.g:1091:1: ( ',' )
            // InternalSimplePDL.g:1092:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_3__1"
    // InternalSimplePDL.g:1101:1: rule__WorkDefinition__Group_2_3__1 : rule__WorkDefinition__Group_2_3__1__Impl rule__WorkDefinition__Group_2_3__2 ;
    public final void rule__WorkDefinition__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1105:1: ( rule__WorkDefinition__Group_2_3__1__Impl rule__WorkDefinition__Group_2_3__2 )
            // InternalSimplePDL.g:1106:2: rule__WorkDefinition__Group_2_3__1__Impl rule__WorkDefinition__Group_2_3__2
            {
            pushFollow(FOLLOW_3);
            rule__WorkDefinition__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_2_3__1__Impl"
    // InternalSimplePDL.g:1113:1: rule__WorkDefinition__Group_2_3__1__Impl : ( 'need' ) ;
    public final void rule__WorkDefinition__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1117:1: ( ( 'need' ) )
            // InternalSimplePDL.g:1118:1: ( 'need' )
            {
            // InternalSimplePDL.g:1118:1: ( 'need' )
            // InternalSimplePDL.g:1119:2: 'need'
            {
             before(grammarAccess.getWorkDefinitionAccess().getNeedKeyword_2_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNeedKeyword_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_2_3__2"
    // InternalSimplePDL.g:1128:1: rule__WorkDefinition__Group_2_3__2 : rule__WorkDefinition__Group_2_3__2__Impl ;
    public final void rule__WorkDefinition__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1132:1: ( rule__WorkDefinition__Group_2_3__2__Impl )
            // InternalSimplePDL.g:1133:2: rule__WorkDefinition__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_2_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_3__2"


    // $ANTLR start "rule__WorkDefinition__Group_2_3__2__Impl"
    // InternalSimplePDL.g:1139:1: rule__WorkDefinition__Group_2_3__2__Impl : ( ( rule__WorkDefinition__ResourcesAssignment_2_3_2 ) ) ;
    public final void rule__WorkDefinition__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1143:1: ( ( ( rule__WorkDefinition__ResourcesAssignment_2_3_2 ) ) )
            // InternalSimplePDL.g:1144:1: ( ( rule__WorkDefinition__ResourcesAssignment_2_3_2 ) )
            {
            // InternalSimplePDL.g:1144:1: ( ( rule__WorkDefinition__ResourcesAssignment_2_3_2 ) )
            // InternalSimplePDL.g:1145:2: ( rule__WorkDefinition__ResourcesAssignment_2_3_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getResourcesAssignment_2_3_2()); 
            // InternalSimplePDL.g:1146:2: ( rule__WorkDefinition__ResourcesAssignment_2_3_2 )
            // InternalSimplePDL.g:1146:3: rule__WorkDefinition__ResourcesAssignment_2_3_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__ResourcesAssignment_2_3_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getResourcesAssignment_2_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_2_3__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalSimplePDL.g:1155:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1159:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalSimplePDL.g:1160:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalSimplePDL.g:1167:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1171:1: ( ( 'ws' ) )
            // InternalSimplePDL.g:1172:1: ( 'ws' )
            {
            // InternalSimplePDL.g:1172:1: ( 'ws' )
            // InternalSimplePDL.g:1173:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalSimplePDL.g:1182:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1186:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalSimplePDL.g:1187:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalSimplePDL.g:1194:1: rule__WorkSequence__Group__1__Impl : ( '{' ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1198:1: ( ( '{' ) )
            // InternalSimplePDL.g:1199:1: ( '{' )
            {
            // InternalSimplePDL.g:1199:1: ( '{' )
            // InternalSimplePDL.g:1200:2: '{'
            {
             before(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalSimplePDL.g:1209:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1213:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalSimplePDL.g:1214:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalSimplePDL.g:1221:1: rule__WorkSequence__Group__2__Impl : ( 'type' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1225:1: ( ( 'type' ) )
            // InternalSimplePDL.g:1226:1: ( 'type' )
            {
            // InternalSimplePDL.g:1226:1: ( 'type' )
            // InternalSimplePDL.g:1227:2: 'type'
            {
             before(grammarAccess.getWorkSequenceAccess().getTypeKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalSimplePDL.g:1236:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1240:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalSimplePDL.g:1241:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalSimplePDL.g:1248:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1252:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_3 ) ) )
            // InternalSimplePDL.g:1253:1: ( ( rule__WorkSequence__LinkTypeAssignment_3 ) )
            {
            // InternalSimplePDL.g:1253:1: ( ( rule__WorkSequence__LinkTypeAssignment_3 ) )
            // InternalSimplePDL.g:1254:2: ( rule__WorkSequence__LinkTypeAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_3()); 
            // InternalSimplePDL.g:1255:2: ( rule__WorkSequence__LinkTypeAssignment_3 )
            // InternalSimplePDL.g:1255:3: rule__WorkSequence__LinkTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalSimplePDL.g:1263:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1267:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalSimplePDL.g:1268:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalSimplePDL.g:1275:1: rule__WorkSequence__Group__4__Impl : ( 'pred' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1279:1: ( ( 'pred' ) )
            // InternalSimplePDL.g:1280:1: ( 'pred' )
            {
            // InternalSimplePDL.g:1280:1: ( 'pred' )
            // InternalSimplePDL.g:1281:2: 'pred'
            {
             before(grammarAccess.getWorkSequenceAccess().getPredKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalSimplePDL.g:1290:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1294:1: ( rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6 )
            // InternalSimplePDL.g:1295:2: rule__WorkSequence__Group__5__Impl rule__WorkSequence__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalSimplePDL.g:1302:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__PredecessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1306:1: ( ( ( rule__WorkSequence__PredecessorAssignment_5 ) ) )
            // InternalSimplePDL.g:1307:1: ( ( rule__WorkSequence__PredecessorAssignment_5 ) )
            {
            // InternalSimplePDL.g:1307:1: ( ( rule__WorkSequence__PredecessorAssignment_5 ) )
            // InternalSimplePDL.g:1308:2: ( rule__WorkSequence__PredecessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_5()); 
            // InternalSimplePDL.g:1309:2: ( rule__WorkSequence__PredecessorAssignment_5 )
            // InternalSimplePDL.g:1309:3: rule__WorkSequence__PredecessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__WorkSequence__Group__6"
    // InternalSimplePDL.g:1317:1: rule__WorkSequence__Group__6 : rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 ;
    public final void rule__WorkSequence__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1321:1: ( rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7 )
            // InternalSimplePDL.g:1322:2: rule__WorkSequence__Group__6__Impl rule__WorkSequence__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__WorkSequence__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__6"


    // $ANTLR start "rule__WorkSequence__Group__6__Impl"
    // InternalSimplePDL.g:1329:1: rule__WorkSequence__Group__6__Impl : ( 'suc' ) ;
    public final void rule__WorkSequence__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1333:1: ( ( 'suc' ) )
            // InternalSimplePDL.g:1334:1: ( 'suc' )
            {
            // InternalSimplePDL.g:1334:1: ( 'suc' )
            // InternalSimplePDL.g:1335:2: 'suc'
            {
             before(grammarAccess.getWorkSequenceAccess().getSucKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSucKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__6__Impl"


    // $ANTLR start "rule__WorkSequence__Group__7"
    // InternalSimplePDL.g:1344:1: rule__WorkSequence__Group__7 : rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8 ;
    public final void rule__WorkSequence__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1348:1: ( rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8 )
            // InternalSimplePDL.g:1349:2: rule__WorkSequence__Group__7__Impl rule__WorkSequence__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__WorkSequence__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__7"


    // $ANTLR start "rule__WorkSequence__Group__7__Impl"
    // InternalSimplePDL.g:1356:1: rule__WorkSequence__Group__7__Impl : ( ( rule__WorkSequence__SuccessorAssignment_7 ) ) ;
    public final void rule__WorkSequence__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1360:1: ( ( ( rule__WorkSequence__SuccessorAssignment_7 ) ) )
            // InternalSimplePDL.g:1361:1: ( ( rule__WorkSequence__SuccessorAssignment_7 ) )
            {
            // InternalSimplePDL.g:1361:1: ( ( rule__WorkSequence__SuccessorAssignment_7 ) )
            // InternalSimplePDL.g:1362:2: ( rule__WorkSequence__SuccessorAssignment_7 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_7()); 
            // InternalSimplePDL.g:1363:2: ( rule__WorkSequence__SuccessorAssignment_7 )
            // InternalSimplePDL.g:1363:3: rule__WorkSequence__SuccessorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__7__Impl"


    // $ANTLR start "rule__WorkSequence__Group__8"
    // InternalSimplePDL.g:1371:1: rule__WorkSequence__Group__8 : rule__WorkSequence__Group__8__Impl ;
    public final void rule__WorkSequence__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1375:1: ( rule__WorkSequence__Group__8__Impl )
            // InternalSimplePDL.g:1376:2: rule__WorkSequence__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__8"


    // $ANTLR start "rule__WorkSequence__Group__8__Impl"
    // InternalSimplePDL.g:1382:1: rule__WorkSequence__Group__8__Impl : ( '}' ) ;
    public final void rule__WorkSequence__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1386:1: ( ( '}' ) )
            // InternalSimplePDL.g:1387:1: ( '}' )
            {
            // InternalSimplePDL.g:1387:1: ( '}' )
            // InternalSimplePDL.g:1388:2: '}'
            {
             before(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__8__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalSimplePDL.g:1398:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1402:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalSimplePDL.g:1403:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalSimplePDL.g:1410:1: rule__Resource__Group__0__Impl : ( 'res' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1414:1: ( ( 'res' ) )
            // InternalSimplePDL.g:1415:1: ( 'res' )
            {
            // InternalSimplePDL.g:1415:1: ( 'res' )
            // InternalSimplePDL.g:1416:2: 'res'
            {
             before(grammarAccess.getResourceAccess().getResKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalSimplePDL.g:1425:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1429:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalSimplePDL.g:1430:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalSimplePDL.g:1437:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1441:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // InternalSimplePDL.g:1442:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // InternalSimplePDL.g:1442:1: ( ( rule__Resource__NameAssignment_1 ) )
            // InternalSimplePDL.g:1443:2: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // InternalSimplePDL.g:1444:2: ( rule__Resource__NameAssignment_1 )
            // InternalSimplePDL.g:1444:3: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalSimplePDL.g:1452:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1456:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalSimplePDL.g:1457:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalSimplePDL.g:1464:1: rule__Resource__Group__2__Impl : ( '(' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1468:1: ( ( '(' ) )
            // InternalSimplePDL.g:1469:1: ( '(' )
            {
            // InternalSimplePDL.g:1469:1: ( '(' )
            // InternalSimplePDL.g:1470:2: '('
            {
             before(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalSimplePDL.g:1479:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1483:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalSimplePDL.g:1484:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalSimplePDL.g:1491:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__QuantityAssignment_3 ) ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1495:1: ( ( ( rule__Resource__QuantityAssignment_3 ) ) )
            // InternalSimplePDL.g:1496:1: ( ( rule__Resource__QuantityAssignment_3 ) )
            {
            // InternalSimplePDL.g:1496:1: ( ( rule__Resource__QuantityAssignment_3 ) )
            // InternalSimplePDL.g:1497:2: ( rule__Resource__QuantityAssignment_3 )
            {
             before(grammarAccess.getResourceAccess().getQuantityAssignment_3()); 
            // InternalSimplePDL.g:1498:2: ( rule__Resource__QuantityAssignment_3 )
            // InternalSimplePDL.g:1498:3: rule__Resource__QuantityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Resource__QuantityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getQuantityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // InternalSimplePDL.g:1506:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1510:1: ( rule__Resource__Group__4__Impl )
            // InternalSimplePDL.g:1511:2: rule__Resource__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // InternalSimplePDL.g:1517:1: rule__Resource__Group__4__Impl : ( ')' ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1521:1: ( ( ')' ) )
            // InternalSimplePDL.g:1522:1: ( ')' )
            {
            // InternalSimplePDL.g:1522:1: ( ')' )
            // InternalSimplePDL.g:1523:2: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__ACResource__Group__0"
    // InternalSimplePDL.g:1533:1: rule__ACResource__Group__0 : rule__ACResource__Group__0__Impl rule__ACResource__Group__1 ;
    public final void rule__ACResource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1537:1: ( rule__ACResource__Group__0__Impl rule__ACResource__Group__1 )
            // InternalSimplePDL.g:1538:2: rule__ACResource__Group__0__Impl rule__ACResource__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ACResource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACResource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACResource__Group__0"


    // $ANTLR start "rule__ACResource__Group__0__Impl"
    // InternalSimplePDL.g:1545:1: rule__ACResource__Group__0__Impl : ( ( rule__ACResource__ResourceAssignment_0 ) ) ;
    public final void rule__ACResource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1549:1: ( ( ( rule__ACResource__ResourceAssignment_0 ) ) )
            // InternalSimplePDL.g:1550:1: ( ( rule__ACResource__ResourceAssignment_0 ) )
            {
            // InternalSimplePDL.g:1550:1: ( ( rule__ACResource__ResourceAssignment_0 ) )
            // InternalSimplePDL.g:1551:2: ( rule__ACResource__ResourceAssignment_0 )
            {
             before(grammarAccess.getACResourceAccess().getResourceAssignment_0()); 
            // InternalSimplePDL.g:1552:2: ( rule__ACResource__ResourceAssignment_0 )
            // InternalSimplePDL.g:1552:3: rule__ACResource__ResourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ACResource__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getACResourceAccess().getResourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACResource__Group__0__Impl"


    // $ANTLR start "rule__ACResource__Group__1"
    // InternalSimplePDL.g:1560:1: rule__ACResource__Group__1 : rule__ACResource__Group__1__Impl rule__ACResource__Group__2 ;
    public final void rule__ACResource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1564:1: ( rule__ACResource__Group__1__Impl rule__ACResource__Group__2 )
            // InternalSimplePDL.g:1565:2: rule__ACResource__Group__1__Impl rule__ACResource__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ACResource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACResource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACResource__Group__1"


    // $ANTLR start "rule__ACResource__Group__1__Impl"
    // InternalSimplePDL.g:1572:1: rule__ACResource__Group__1__Impl : ( ':' ) ;
    public final void rule__ACResource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1576:1: ( ( ':' ) )
            // InternalSimplePDL.g:1577:1: ( ':' )
            {
            // InternalSimplePDL.g:1577:1: ( ':' )
            // InternalSimplePDL.g:1578:2: ':'
            {
             before(grammarAccess.getACResourceAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getACResourceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACResource__Group__1__Impl"


    // $ANTLR start "rule__ACResource__Group__2"
    // InternalSimplePDL.g:1587:1: rule__ACResource__Group__2 : rule__ACResource__Group__2__Impl ;
    public final void rule__ACResource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1591:1: ( rule__ACResource__Group__2__Impl )
            // InternalSimplePDL.g:1592:2: rule__ACResource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ACResource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACResource__Group__2"


    // $ANTLR start "rule__ACResource__Group__2__Impl"
    // InternalSimplePDL.g:1598:1: rule__ACResource__Group__2__Impl : ( ( rule__ACResource__ResourceQuantityAssignment_2 ) ) ;
    public final void rule__ACResource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1602:1: ( ( ( rule__ACResource__ResourceQuantityAssignment_2 ) ) )
            // InternalSimplePDL.g:1603:1: ( ( rule__ACResource__ResourceQuantityAssignment_2 ) )
            {
            // InternalSimplePDL.g:1603:1: ( ( rule__ACResource__ResourceQuantityAssignment_2 ) )
            // InternalSimplePDL.g:1604:2: ( rule__ACResource__ResourceQuantityAssignment_2 )
            {
             before(grammarAccess.getACResourceAccess().getResourceQuantityAssignment_2()); 
            // InternalSimplePDL.g:1605:2: ( rule__ACResource__ResourceQuantityAssignment_2 )
            // InternalSimplePDL.g:1605:3: rule__ACResource__ResourceQuantityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ACResource__ResourceQuantityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getACResourceAccess().getResourceQuantityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACResource__Group__2__Impl"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalSimplePDL.g:1614:1: rule__Process__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1618:1: ( ( RULE_ID ) )
            // InternalSimplePDL.g:1619:2: ( RULE_ID )
            {
            // InternalSimplePDL.g:1619:2: ( RULE_ID )
            // InternalSimplePDL.g:1620:3: RULE_ID
            {
             before(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_3"
    // InternalSimplePDL.g:1629:1: rule__Process__ProcessElementsAssignment_3 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1633:1: ( ( ruleProcessElement ) )
            // InternalSimplePDL.g:1634:2: ( ruleProcessElement )
            {
            // InternalSimplePDL.g:1634:2: ( ruleProcessElement )
            // InternalSimplePDL.g:1635:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_3"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4_1"
    // InternalSimplePDL.g:1644:1: rule__Process__ProcessElementsAssignment_4_1 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1648:1: ( ( ruleProcessElement ) )
            // InternalSimplePDL.g:1649:2: ( ruleProcessElement )
            {
            // InternalSimplePDL.g:1649:2: ( ruleProcessElement )
            // InternalSimplePDL.g:1650:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_1_1"
    // InternalSimplePDL.g:1659:1: rule__Guidance__ElementsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1663:1: ( ( ( RULE_ID ) ) )
            // InternalSimplePDL.g:1664:2: ( ( RULE_ID ) )
            {
            // InternalSimplePDL.g:1664:2: ( ( RULE_ID ) )
            // InternalSimplePDL.g:1665:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_1_1_0()); 
            // InternalSimplePDL.g:1666:3: ( RULE_ID )
            // InternalSimplePDL.g:1667:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_1_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_1_2_1"
    // InternalSimplePDL.g:1678:1: rule__Guidance__ElementsAssignment_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1682:1: ( ( ( RULE_ID ) ) )
            // InternalSimplePDL.g:1683:2: ( ( RULE_ID ) )
            {
            // InternalSimplePDL.g:1683:2: ( ( RULE_ID ) )
            // InternalSimplePDL.g:1684:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_1_2_1_0()); 
            // InternalSimplePDL.g:1685:3: ( RULE_ID )
            // InternalSimplePDL.g:1686:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_1_2_1"


    // $ANTLR start "rule__Guidance__TextAssignment_4"
    // InternalSimplePDL.g:1697:1: rule__Guidance__TextAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1701:1: ( ( RULE_STRING ) )
            // InternalSimplePDL.g:1702:2: ( RULE_STRING )
            {
            // InternalSimplePDL.g:1702:2: ( RULE_STRING )
            // InternalSimplePDL.g:1703:3: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TextAssignment_4"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // InternalSimplePDL.g:1712:1: rule__WorkDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1716:1: ( ( RULE_ID ) )
            // InternalSimplePDL.g:1717:2: ( RULE_ID )
            {
            // InternalSimplePDL.g:1717:2: ( RULE_ID )
            // InternalSimplePDL.g:1718:3: RULE_ID
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__ResourcesAssignment_2_2"
    // InternalSimplePDL.g:1727:1: rule__WorkDefinition__ResourcesAssignment_2_2 : ( ruleACResource ) ;
    public final void rule__WorkDefinition__ResourcesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1731:1: ( ( ruleACResource ) )
            // InternalSimplePDL.g:1732:2: ( ruleACResource )
            {
            // InternalSimplePDL.g:1732:2: ( ruleACResource )
            // InternalSimplePDL.g:1733:3: ruleACResource
            {
             before(grammarAccess.getWorkDefinitionAccess().getResourcesACResourceParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleACResource();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getResourcesACResourceParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__ResourcesAssignment_2_2"


    // $ANTLR start "rule__WorkDefinition__ResourcesAssignment_2_3_2"
    // InternalSimplePDL.g:1742:1: rule__WorkDefinition__ResourcesAssignment_2_3_2 : ( ruleACResource ) ;
    public final void rule__WorkDefinition__ResourcesAssignment_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1746:1: ( ( ruleACResource ) )
            // InternalSimplePDL.g:1747:2: ( ruleACResource )
            {
            // InternalSimplePDL.g:1747:2: ( ruleACResource )
            // InternalSimplePDL.g:1748:3: ruleACResource
            {
             before(grammarAccess.getWorkDefinitionAccess().getResourcesACResourceParserRuleCall_2_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleACResource();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getResourcesACResourceParserRuleCall_2_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__ResourcesAssignment_2_3_2"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_3"
    // InternalSimplePDL.g:1757:1: rule__WorkSequence__LinkTypeAssignment_3 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1761:1: ( ( ruleWorkSequenceType ) )
            // InternalSimplePDL.g:1762:2: ( ruleWorkSequenceType )
            {
            // InternalSimplePDL.g:1762:2: ( ruleWorkSequenceType )
            // InternalSimplePDL.g:1763:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_3"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_5"
    // InternalSimplePDL.g:1772:1: rule__WorkSequence__PredecessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1776:1: ( ( ( RULE_ID ) ) )
            // InternalSimplePDL.g:1777:2: ( ( RULE_ID ) )
            {
            // InternalSimplePDL.g:1777:2: ( ( RULE_ID ) )
            // InternalSimplePDL.g:1778:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0()); 
            // InternalSimplePDL.g:1779:3: ( RULE_ID )
            // InternalSimplePDL.g:1780:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_5"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_7"
    // InternalSimplePDL.g:1791:1: rule__WorkSequence__SuccessorAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1795:1: ( ( ( RULE_ID ) ) )
            // InternalSimplePDL.g:1796:2: ( ( RULE_ID ) )
            {
            // InternalSimplePDL.g:1796:2: ( ( RULE_ID ) )
            // InternalSimplePDL.g:1797:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0()); 
            // InternalSimplePDL.g:1798:3: ( RULE_ID )
            // InternalSimplePDL.g:1799:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_7"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // InternalSimplePDL.g:1810:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1814:1: ( ( RULE_ID ) )
            // InternalSimplePDL.g:1815:2: ( RULE_ID )
            {
            // InternalSimplePDL.g:1815:2: ( RULE_ID )
            // InternalSimplePDL.g:1816:3: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__QuantityAssignment_3"
    // InternalSimplePDL.g:1825:1: rule__Resource__QuantityAssignment_3 : ( RULE_INT ) ;
    public final void rule__Resource__QuantityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1829:1: ( ( RULE_INT ) )
            // InternalSimplePDL.g:1830:2: ( RULE_INT )
            {
            // InternalSimplePDL.g:1830:2: ( RULE_INT )
            // InternalSimplePDL.g:1831:3: RULE_INT
            {
             before(grammarAccess.getResourceAccess().getQuantityINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getQuantityINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__QuantityAssignment_3"


    // $ANTLR start "rule__ACResource__ResourceAssignment_0"
    // InternalSimplePDL.g:1840:1: rule__ACResource__ResourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ACResource__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1844:1: ( ( ( RULE_ID ) ) )
            // InternalSimplePDL.g:1845:2: ( ( RULE_ID ) )
            {
            // InternalSimplePDL.g:1845:2: ( ( RULE_ID ) )
            // InternalSimplePDL.g:1846:3: ( RULE_ID )
            {
             before(grammarAccess.getACResourceAccess().getResourceResourceCrossReference_0_0()); 
            // InternalSimplePDL.g:1847:3: ( RULE_ID )
            // InternalSimplePDL.g:1848:4: RULE_ID
            {
             before(grammarAccess.getACResourceAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getACResourceAccess().getResourceResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getACResourceAccess().getResourceResourceCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACResource__ResourceAssignment_0"


    // $ANTLR start "rule__ACResource__ResourceQuantityAssignment_2"
    // InternalSimplePDL.g:1859:1: rule__ACResource__ResourceQuantityAssignment_2 : ( RULE_INT ) ;
    public final void rule__ACResource__ResourceQuantityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1863:1: ( ( RULE_INT ) )
            // InternalSimplePDL.g:1864:2: ( RULE_INT )
            {
            // InternalSimplePDL.g:1864:2: ( RULE_INT )
            // InternalSimplePDL.g:1865:3: RULE_INT
            {
             before(grammarAccess.getACResourceAccess().getResourceQuantityINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getACResourceAccess().getResourceQuantityINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACResource__ResourceQuantityAssignment_2"


    // $ANTLR start "rule__WorkSequenceType__StartToStartAssignment_0"
    // InternalSimplePDL.g:1874:1: rule__WorkSequenceType__StartToStartAssignment_0 : ( ( 's2s' ) ) ;
    public final void rule__WorkSequenceType__StartToStartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1878:1: ( ( ( 's2s' ) ) )
            // InternalSimplePDL.g:1879:2: ( ( 's2s' ) )
            {
            // InternalSimplePDL.g:1879:2: ( ( 's2s' ) )
            // InternalSimplePDL.g:1880:3: ( 's2s' )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartS2sKeyword_0_0()); 
            // InternalSimplePDL.g:1881:3: ( 's2s' )
            // InternalSimplePDL.g:1882:4: 's2s'
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartS2sKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartS2sKeyword_0_0()); 

            }

             after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartS2sKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__StartToStartAssignment_0"


    // $ANTLR start "rule__WorkSequenceType__FinishToStartAssignment_1"
    // InternalSimplePDL.g:1893:1: rule__WorkSequenceType__FinishToStartAssignment_1 : ( ( 'f2s' ) ) ;
    public final void rule__WorkSequenceType__FinishToStartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1897:1: ( ( ( 'f2s' ) ) )
            // InternalSimplePDL.g:1898:2: ( ( 'f2s' ) )
            {
            // InternalSimplePDL.g:1898:2: ( ( 'f2s' ) )
            // InternalSimplePDL.g:1899:3: ( 'f2s' )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartF2sKeyword_1_0()); 
            // InternalSimplePDL.g:1900:3: ( 'f2s' )
            // InternalSimplePDL.g:1901:4: 'f2s'
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartF2sKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartF2sKeyword_1_0()); 

            }

             after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartF2sKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__FinishToStartAssignment_1"


    // $ANTLR start "rule__WorkSequenceType__StartToFinishAssignment_2"
    // InternalSimplePDL.g:1912:1: rule__WorkSequenceType__StartToFinishAssignment_2 : ( ( 's2f' ) ) ;
    public final void rule__WorkSequenceType__StartToFinishAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1916:1: ( ( ( 's2f' ) ) )
            // InternalSimplePDL.g:1917:2: ( ( 's2f' ) )
            {
            // InternalSimplePDL.g:1917:2: ( ( 's2f' ) )
            // InternalSimplePDL.g:1918:3: ( 's2f' )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishS2fKeyword_2_0()); 
            // InternalSimplePDL.g:1919:3: ( 's2f' )
            // InternalSimplePDL.g:1920:4: 's2f'
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishS2fKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishS2fKeyword_2_0()); 

            }

             after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishS2fKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__StartToFinishAssignment_2"


    // $ANTLR start "rule__WorkSequenceType__FinishToFinishAssignment_3"
    // InternalSimplePDL.g:1931:1: rule__WorkSequenceType__FinishToFinishAssignment_3 : ( ( 'f2f' ) ) ;
    public final void rule__WorkSequenceType__FinishToFinishAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimplePDL.g:1935:1: ( ( ( 'f2f' ) ) )
            // InternalSimplePDL.g:1936:2: ( ( 'f2f' ) )
            {
            // InternalSimplePDL.g:1936:2: ( ( 'f2f' ) )
            // InternalSimplePDL.g:1937:3: ( 'f2f' )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishF2fKeyword_3_0()); 
            // InternalSimplePDL.g:1938:3: ( 'f2f' )
            // InternalSimplePDL.g:1939:4: 'f2f'
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishF2fKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishF2fKeyword_3_0()); 

            }

             after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishF2fKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__FinishToFinishAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002288000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}