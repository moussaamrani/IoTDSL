package be.unamur.iotdevice.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import be.unamur.iotdevice.services.IoTDeviceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIoTDeviceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'false'", "'IP'", "'ZWAVE'", "'ZIGBEE'", "'MQTT'", "'DDS'", "'enumeration'", "'{'", "'}'", "';'", "'cloud'", "'gateway'", "'router'", "'device'", "'property'", "':'", "'sensing'", "'('", "')'", "','", "'actuating'", "'configuration'", "'node'", "'from'", "'to'", "'via'", "'var'", "'='", "'rule'", "'when'", "'do'", "'||'", "'.'", "'::'", "'['", "']'", "'integer'", "'boolean'", "'string'", "'real'", "'or'", "'and'", "'not'", "'true'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIoTDeviceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIoTDeviceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIoTDeviceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIoTDevice.g"; }


     
     	private IoTDeviceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(IoTDeviceGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleIoTModel"
    // InternalIoTDevice.g:61:1: entryRuleIoTModel : ruleIoTModel EOF ;
    public final void entryRuleIoTModel() throws RecognitionException {
        try {
            // InternalIoTDevice.g:62:1: ( ruleIoTModel EOF )
            // InternalIoTDevice.g:63:1: ruleIoTModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIoTModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIoTModel"


    // $ANTLR start "ruleIoTModel"
    // InternalIoTDevice.g:70:1: ruleIoTModel : ( ( rule__IoTModel__Group__0 ) ) ;
    public final void ruleIoTModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:74:2: ( ( ( rule__IoTModel__Group__0 ) ) )
            // InternalIoTDevice.g:75:1: ( ( rule__IoTModel__Group__0 ) )
            {
            // InternalIoTDevice.g:75:1: ( ( rule__IoTModel__Group__0 ) )
            // InternalIoTDevice.g:76:1: ( rule__IoTModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getGroup()); 
            }
            // InternalIoTDevice.g:77:1: ( rule__IoTModel__Group__0 )
            // InternalIoTDevice.g:77:2: rule__IoTModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IoTModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleIoTModel"


    // $ANTLR start "entryRuleType"
    // InternalIoTDevice.g:89:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalIoTDevice.g:90:1: ( ruleType EOF )
            // InternalIoTDevice.g:91:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalIoTDevice.g:98:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:102:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalIoTDevice.g:103:1: ( ( rule__Type__Alternatives ) )
            {
            // InternalIoTDevice.g:103:1: ( ( rule__Type__Alternatives ) )
            // InternalIoTDevice.g:104:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:105:1: ( rule__Type__Alternatives )
            // InternalIoTDevice.g:105:2: rule__Type__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDeclaredType"
    // InternalIoTDevice.g:117:1: entryRuleDeclaredType : ruleDeclaredType EOF ;
    public final void entryRuleDeclaredType() throws RecognitionException {
        try {
            // InternalIoTDevice.g:118:1: ( ruleDeclaredType EOF )
            // InternalIoTDevice.g:119:1: ruleDeclaredType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDeclaredType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredTypeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeclaredType"


    // $ANTLR start "ruleDeclaredType"
    // InternalIoTDevice.g:126:1: ruleDeclaredType : ( ( rule__DeclaredType__Alternatives ) ) ;
    public final void ruleDeclaredType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:130:2: ( ( ( rule__DeclaredType__Alternatives ) ) )
            // InternalIoTDevice.g:131:1: ( ( rule__DeclaredType__Alternatives ) )
            {
            // InternalIoTDevice.g:131:1: ( ( rule__DeclaredType__Alternatives ) )
            // InternalIoTDevice.g:132:1: ( rule__DeclaredType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredTypeAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:133:1: ( rule__DeclaredType__Alternatives )
            // InternalIoTDevice.g:133:2: rule__DeclaredType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DeclaredType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredTypeAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleDeclaredType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalIoTDevice.g:145:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalIoTDevice.g:146:1: ( ruleEnumeration EOF )
            // InternalIoTDevice.g:147:1: ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalIoTDevice.g:154:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:158:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalIoTDevice.g:159:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalIoTDevice.g:159:1: ( ( rule__Enumeration__Group__0 ) )
            // InternalIoTDevice.g:160:1: ( rule__Enumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup()); 
            }
            // InternalIoTDevice.g:161:1: ( rule__Enumeration__Group__0 )
            // InternalIoTDevice.g:161:2: rule__Enumeration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalIoTDevice.g:173:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalIoTDevice.g:174:1: ( ruleEnumerationLiteral EOF )
            // InternalIoTDevice.g:175:1: ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalIoTDevice.g:182:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:186:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalIoTDevice.g:187:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalIoTDevice.g:187:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalIoTDevice.g:188:1: ( rule__EnumerationLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            }
            // InternalIoTDevice.g:189:1: ( rule__EnumerationLiteral__Group__0 )
            // InternalIoTDevice.g:189:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleNode"
    // InternalIoTDevice.g:201:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalIoTDevice.g:202:1: ( ruleNode EOF )
            // InternalIoTDevice.g:203:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalIoTDevice.g:210:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:214:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalIoTDevice.g:215:1: ( ( rule__Node__Alternatives ) )
            {
            // InternalIoTDevice.g:215:1: ( ( rule__Node__Alternatives ) )
            // InternalIoTDevice.g:216:1: ( rule__Node__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:217:1: ( rule__Node__Alternatives )
            // InternalIoTDevice.g:217:2: rule__Node__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleCloud"
    // InternalIoTDevice.g:229:1: entryRuleCloud : ruleCloud EOF ;
    public final void entryRuleCloud() throws RecognitionException {
        try {
            // InternalIoTDevice.g:230:1: ( ruleCloud EOF )
            // InternalIoTDevice.g:231:1: ruleCloud EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloudRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCloud();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloudRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCloud"


    // $ANTLR start "ruleCloud"
    // InternalIoTDevice.g:238:1: ruleCloud : ( ( rule__Cloud__Group__0 ) ) ;
    public final void ruleCloud() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:242:2: ( ( ( rule__Cloud__Group__0 ) ) )
            // InternalIoTDevice.g:243:1: ( ( rule__Cloud__Group__0 ) )
            {
            // InternalIoTDevice.g:243:1: ( ( rule__Cloud__Group__0 ) )
            // InternalIoTDevice.g:244:1: ( rule__Cloud__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloudAccess().getGroup()); 
            }
            // InternalIoTDevice.g:245:1: ( rule__Cloud__Group__0 )
            // InternalIoTDevice.g:245:2: rule__Cloud__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cloud__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloudAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCloud"


    // $ANTLR start "entryRuleGateway"
    // InternalIoTDevice.g:257:1: entryRuleGateway : ruleGateway EOF ;
    public final void entryRuleGateway() throws RecognitionException {
        try {
            // InternalIoTDevice.g:258:1: ( ruleGateway EOF )
            // InternalIoTDevice.g:259:1: ruleGateway EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleGateway();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGatewayRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalIoTDevice.g:266:1: ruleGateway : ( ( rule__Gateway__Group__0 ) ) ;
    public final void ruleGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:270:2: ( ( ( rule__Gateway__Group__0 ) ) )
            // InternalIoTDevice.g:271:1: ( ( rule__Gateway__Group__0 ) )
            {
            // InternalIoTDevice.g:271:1: ( ( rule__Gateway__Group__0 ) )
            // InternalIoTDevice.g:272:1: ( rule__Gateway__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getGroup()); 
            }
            // InternalIoTDevice.g:273:1: ( rule__Gateway__Group__0 )
            // InternalIoTDevice.g:273:2: rule__Gateway__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Gateway__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGatewayAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleRouter"
    // InternalIoTDevice.g:285:1: entryRuleRouter : ruleRouter EOF ;
    public final void entryRuleRouter() throws RecognitionException {
        try {
            // InternalIoTDevice.g:286:1: ( ruleRouter EOF )
            // InternalIoTDevice.g:287:1: ruleRouter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRouterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRouter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRouterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRouter"


    // $ANTLR start "ruleRouter"
    // InternalIoTDevice.g:294:1: ruleRouter : ( ( rule__Router__Group__0 ) ) ;
    public final void ruleRouter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:298:2: ( ( ( rule__Router__Group__0 ) ) )
            // InternalIoTDevice.g:299:1: ( ( rule__Router__Group__0 ) )
            {
            // InternalIoTDevice.g:299:1: ( ( rule__Router__Group__0 ) )
            // InternalIoTDevice.g:300:1: ( rule__Router__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRouterAccess().getGroup()); 
            }
            // InternalIoTDevice.g:301:1: ( rule__Router__Group__0 )
            // InternalIoTDevice.g:301:2: rule__Router__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Router__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRouterAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRouter"


    // $ANTLR start "entryRuleDevice"
    // InternalIoTDevice.g:313:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalIoTDevice.g:314:1: ( ruleDevice EOF )
            // InternalIoTDevice.g:315:1: ruleDevice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDevice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIoTDevice.g:322:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:326:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalIoTDevice.g:327:1: ( ( rule__Device__Group__0 ) )
            {
            // InternalIoTDevice.g:327:1: ( ( rule__Device__Group__0 ) )
            // InternalIoTDevice.g:328:1: ( rule__Device__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getGroup()); 
            }
            // InternalIoTDevice.g:329:1: ( rule__Device__Group__0 )
            // InternalIoTDevice.g:329:2: rule__Device__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleFeature"
    // InternalIoTDevice.g:341:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalIoTDevice.g:342:1: ( ruleFeature EOF )
            // InternalIoTDevice.g:343:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalIoTDevice.g:350:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:354:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalIoTDevice.g:355:1: ( ( rule__Feature__Alternatives ) )
            {
            // InternalIoTDevice.g:355:1: ( ( rule__Feature__Alternatives ) )
            // InternalIoTDevice.g:356:1: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:357:1: ( rule__Feature__Alternatives )
            // InternalIoTDevice.g:357:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleProperty"
    // InternalIoTDevice.g:369:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalIoTDevice.g:370:1: ( ruleProperty EOF )
            // InternalIoTDevice.g:371:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalIoTDevice.g:378:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:382:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalIoTDevice.g:383:1: ( ( rule__Property__Group__0 ) )
            {
            // InternalIoTDevice.g:383:1: ( ( rule__Property__Group__0 ) )
            // InternalIoTDevice.g:384:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // InternalIoTDevice.g:385:1: ( rule__Property__Group__0 )
            // InternalIoTDevice.g:385:2: rule__Property__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleCapability"
    // InternalIoTDevice.g:397:1: entryRuleCapability : ruleCapability EOF ;
    public final void entryRuleCapability() throws RecognitionException {
        try {
            // InternalIoTDevice.g:398:1: ( ruleCapability EOF )
            // InternalIoTDevice.g:399:1: ruleCapability EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCapability();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilityRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalIoTDevice.g:406:1: ruleCapability : ( ( rule__Capability__Alternatives ) ) ;
    public final void ruleCapability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:410:2: ( ( ( rule__Capability__Alternatives ) ) )
            // InternalIoTDevice.g:411:1: ( ( rule__Capability__Alternatives ) )
            {
            // InternalIoTDevice.g:411:1: ( ( rule__Capability__Alternatives ) )
            // InternalIoTDevice.g:412:1: ( rule__Capability__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilityAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:413:1: ( rule__Capability__Alternatives )
            // InternalIoTDevice.g:413:2: rule__Capability__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Capability__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilityAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleSensing"
    // InternalIoTDevice.g:425:1: entryRuleSensing : ruleSensing EOF ;
    public final void entryRuleSensing() throws RecognitionException {
        try {
            // InternalIoTDevice.g:426:1: ( ruleSensing EOF )
            // InternalIoTDevice.g:427:1: ruleSensing EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSensing();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSensing"


    // $ANTLR start "ruleSensing"
    // InternalIoTDevice.g:434:1: ruleSensing : ( ( rule__Sensing__Group__0 ) ) ;
    public final void ruleSensing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:438:2: ( ( ( rule__Sensing__Group__0 ) ) )
            // InternalIoTDevice.g:439:1: ( ( rule__Sensing__Group__0 ) )
            {
            // InternalIoTDevice.g:439:1: ( ( rule__Sensing__Group__0 ) )
            // InternalIoTDevice.g:440:1: ( rule__Sensing__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getGroup()); 
            }
            // InternalIoTDevice.g:441:1: ( rule__Sensing__Group__0 )
            // InternalIoTDevice.g:441:2: rule__Sensing__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSensing"


    // $ANTLR start "entryRuleActuating"
    // InternalIoTDevice.g:453:1: entryRuleActuating : ruleActuating EOF ;
    public final void entryRuleActuating() throws RecognitionException {
        try {
            // InternalIoTDevice.g:454:1: ( ruleActuating EOF )
            // InternalIoTDevice.g:455:1: ruleActuating EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleActuating();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleActuating"


    // $ANTLR start "ruleActuating"
    // InternalIoTDevice.g:462:1: ruleActuating : ( ( rule__Actuating__Group__0 ) ) ;
    public final void ruleActuating() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:466:2: ( ( ( rule__Actuating__Group__0 ) ) )
            // InternalIoTDevice.g:467:1: ( ( rule__Actuating__Group__0 ) )
            {
            // InternalIoTDevice.g:467:1: ( ( rule__Actuating__Group__0 ) )
            // InternalIoTDevice.g:468:1: ( rule__Actuating__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getGroup()); 
            }
            // InternalIoTDevice.g:469:1: ( rule__Actuating__Group__0 )
            // InternalIoTDevice.g:469:2: rule__Actuating__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleActuating"


    // $ANTLR start "entryRuleParameter"
    // InternalIoTDevice.g:481:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalIoTDevice.g:482:1: ( ruleParameter EOF )
            // InternalIoTDevice.g:483:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalIoTDevice.g:490:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:494:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalIoTDevice.g:495:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalIoTDevice.g:495:1: ( ( rule__Parameter__Group__0 ) )
            // InternalIoTDevice.g:496:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalIoTDevice.g:497:1: ( rule__Parameter__Group__0 )
            // InternalIoTDevice.g:497:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeReference"
    // InternalIoTDevice.g:509:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalIoTDevice.g:510:1: ( ruleTypeReference EOF )
            // InternalIoTDevice.g:511:1: ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalIoTDevice.g:518:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:522:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // InternalIoTDevice.g:523:1: ( ( rule__TypeReference__Alternatives ) )
            {
            // InternalIoTDevice.g:523:1: ( ( rule__TypeReference__Alternatives ) )
            // InternalIoTDevice.g:524:1: ( rule__TypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:525:1: ( rule__TypeReference__Alternatives )
            // InternalIoTDevice.g:525:2: rule__TypeReference__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeReference__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalIoTDevice.g:537:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalIoTDevice.g:538:1: ( rulePrimitiveType EOF )
            // InternalIoTDevice.g:539:1: rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalIoTDevice.g:546:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:550:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalIoTDevice.g:551:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalIoTDevice.g:551:1: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalIoTDevice.g:552:1: ( rule__PrimitiveType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:553:1: ( rule__PrimitiveType__Alternatives )
            // InternalIoTDevice.g:553:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalIoTDevice.g:565:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalIoTDevice.g:566:1: ( ruleIntegerType EOF )
            // InternalIoTDevice.g:567:1: ruleIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerTypeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalIoTDevice.g:574:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:578:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalIoTDevice.g:579:1: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalIoTDevice.g:579:1: ( ( rule__IntegerType__Group__0 ) )
            // InternalIoTDevice.g:580:1: ( rule__IntegerType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            }
            // InternalIoTDevice.g:581:1: ( rule__IntegerType__Group__0 )
            // InternalIoTDevice.g:581:2: rule__IntegerType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerTypeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalIoTDevice.g:593:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalIoTDevice.g:594:1: ( ruleBooleanType EOF )
            // InternalIoTDevice.g:595:1: ruleBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBooleanType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanTypeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalIoTDevice.g:602:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:606:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalIoTDevice.g:607:1: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalIoTDevice.g:607:1: ( ( rule__BooleanType__Group__0 ) )
            // InternalIoTDevice.g:608:1: ( rule__BooleanType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            }
            // InternalIoTDevice.g:609:1: ( rule__BooleanType__Group__0 )
            // InternalIoTDevice.g:609:2: rule__BooleanType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanTypeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // InternalIoTDevice.g:621:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalIoTDevice.g:622:1: ( ruleStringType EOF )
            // InternalIoTDevice.g:623:1: ruleStringType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTypeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalIoTDevice.g:630:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:634:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalIoTDevice.g:635:1: ( ( rule__StringType__Group__0 ) )
            {
            // InternalIoTDevice.g:635:1: ( ( rule__StringType__Group__0 ) )
            // InternalIoTDevice.g:636:1: ( rule__StringType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getGroup()); 
            }
            // InternalIoTDevice.g:637:1: ( rule__StringType__Group__0 )
            // InternalIoTDevice.g:637:2: rule__StringType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTypeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleRealType"
    // InternalIoTDevice.g:649:1: entryRuleRealType : ruleRealType EOF ;
    public final void entryRuleRealType() throws RecognitionException {
        try {
            // InternalIoTDevice.g:650:1: ( ruleRealType EOF )
            // InternalIoTDevice.g:651:1: ruleRealType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRealType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealTypeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // InternalIoTDevice.g:658:1: ruleRealType : ( ( rule__RealType__Group__0 ) ) ;
    public final void ruleRealType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:662:2: ( ( ( rule__RealType__Group__0 ) ) )
            // InternalIoTDevice.g:663:1: ( ( rule__RealType__Group__0 ) )
            {
            // InternalIoTDevice.g:663:1: ( ( rule__RealType__Group__0 ) )
            // InternalIoTDevice.g:664:1: ( rule__RealType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getGroup()); 
            }
            // InternalIoTDevice.g:665:1: ( rule__RealType__Group__0 )
            // InternalIoTDevice.g:665:2: rule__RealType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RealType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealTypeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleNetworkConfiguration"
    // InternalIoTDevice.g:677:1: entryRuleNetworkConfiguration : ruleNetworkConfiguration EOF ;
    public final void entryRuleNetworkConfiguration() throws RecognitionException {
        try {
            // InternalIoTDevice.g:678:1: ( ruleNetworkConfiguration EOF )
            // InternalIoTDevice.g:679:1: ruleNetworkConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNetworkConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNetworkConfiguration"


    // $ANTLR start "ruleNetworkConfiguration"
    // InternalIoTDevice.g:686:1: ruleNetworkConfiguration : ( ( rule__NetworkConfiguration__Group__0 ) ) ;
    public final void ruleNetworkConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:690:2: ( ( ( rule__NetworkConfiguration__Group__0 ) ) )
            // InternalIoTDevice.g:691:1: ( ( rule__NetworkConfiguration__Group__0 ) )
            {
            // InternalIoTDevice.g:691:1: ( ( rule__NetworkConfiguration__Group__0 ) )
            // InternalIoTDevice.g:692:1: ( rule__NetworkConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getGroup()); 
            }
            // InternalIoTDevice.g:693:1: ( rule__NetworkConfiguration__Group__0 )
            // InternalIoTDevice.g:693:2: rule__NetworkConfiguration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNetworkConfiguration"


    // $ANTLR start "entryRuleNodeInstance"
    // InternalIoTDevice.g:705:1: entryRuleNodeInstance : ruleNodeInstance EOF ;
    public final void entryRuleNodeInstance() throws RecognitionException {
        try {
            // InternalIoTDevice.g:706:1: ( ruleNodeInstance EOF )
            // InternalIoTDevice.g:707:1: ruleNodeInstance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNodeInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNodeInstance"


    // $ANTLR start "ruleNodeInstance"
    // InternalIoTDevice.g:714:1: ruleNodeInstance : ( ( rule__NodeInstance__Group__0 ) ) ;
    public final void ruleNodeInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:718:2: ( ( ( rule__NodeInstance__Group__0 ) ) )
            // InternalIoTDevice.g:719:1: ( ( rule__NodeInstance__Group__0 ) )
            {
            // InternalIoTDevice.g:719:1: ( ( rule__NodeInstance__Group__0 ) )
            // InternalIoTDevice.g:720:1: ( rule__NodeInstance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceAccess().getGroup()); 
            }
            // InternalIoTDevice.g:721:1: ( rule__NodeInstance__Group__0 )
            // InternalIoTDevice.g:721:2: rule__NodeInstance__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeInstance__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNodeInstance"


    // $ANTLR start "entryRuleCommunicationPath"
    // InternalIoTDevice.g:733:1: entryRuleCommunicationPath : ruleCommunicationPath EOF ;
    public final void entryRuleCommunicationPath() throws RecognitionException {
        try {
            // InternalIoTDevice.g:734:1: ( ruleCommunicationPath EOF )
            // InternalIoTDevice.g:735:1: ruleCommunicationPath EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCommunicationPath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCommunicationPath"


    // $ANTLR start "ruleCommunicationPath"
    // InternalIoTDevice.g:742:1: ruleCommunicationPath : ( ( rule__CommunicationPath__Group__0 ) ) ;
    public final void ruleCommunicationPath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:746:2: ( ( ( rule__CommunicationPath__Group__0 ) ) )
            // InternalIoTDevice.g:747:1: ( ( rule__CommunicationPath__Group__0 ) )
            {
            // InternalIoTDevice.g:747:1: ( ( rule__CommunicationPath__Group__0 ) )
            // InternalIoTDevice.g:748:1: ( rule__CommunicationPath__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getGroup()); 
            }
            // InternalIoTDevice.g:749:1: ( rule__CommunicationPath__Group__0 )
            // InternalIoTDevice.g:749:2: rule__CommunicationPath__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCommunicationPath"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalIoTDevice.g:761:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalIoTDevice.g:762:1: ( ruleVariableDeclaration EOF )
            // InternalIoTDevice.g:763:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalIoTDevice.g:770:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:774:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalIoTDevice.g:775:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalIoTDevice.g:775:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalIoTDevice.g:776:1: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // InternalIoTDevice.g:777:1: ( rule__VariableDeclaration__Group__0 )
            // InternalIoTDevice.g:777:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleRule"
    // InternalIoTDevice.g:789:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalIoTDevice.g:790:1: ( ruleRule EOF )
            // InternalIoTDevice.g:791:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalIoTDevice.g:798:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:802:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalIoTDevice.g:803:1: ( ( rule__Rule__Group__0 ) )
            {
            // InternalIoTDevice.g:803:1: ( ( rule__Rule__Group__0 ) )
            // InternalIoTDevice.g:804:1: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // InternalIoTDevice.g:805:1: ( rule__Rule__Group__0 )
            // InternalIoTDevice.g:805:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleReaction"
    // InternalIoTDevice.g:817:1: entryRuleReaction : ruleReaction EOF ;
    public final void entryRuleReaction() throws RecognitionException {
        try {
            // InternalIoTDevice.g:818:1: ( ruleReaction EOF )
            // InternalIoTDevice.g:819:1: ruleReaction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReactionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReaction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReactionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalIoTDevice.g:826:1: ruleReaction : ( ruleParallelComposition ) ;
    public final void ruleReaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:830:2: ( ( ruleParallelComposition ) )
            // InternalIoTDevice.g:831:1: ( ruleParallelComposition )
            {
            // InternalIoTDevice.g:831:1: ( ruleParallelComposition )
            // InternalIoTDevice.g:832:1: ruleParallelComposition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReactionAccess().getParallelCompositionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParallelComposition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReactionAccess().getParallelCompositionParserRuleCall()); 
            }

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
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleParallelComposition"
    // InternalIoTDevice.g:845:1: entryRuleParallelComposition : ruleParallelComposition EOF ;
    public final void entryRuleParallelComposition() throws RecognitionException {
        try {
            // InternalIoTDevice.g:846:1: ( ruleParallelComposition EOF )
            // InternalIoTDevice.g:847:1: ruleParallelComposition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelCompositionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParallelComposition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelCompositionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParallelComposition"


    // $ANTLR start "ruleParallelComposition"
    // InternalIoTDevice.g:854:1: ruleParallelComposition : ( ( rule__ParallelComposition__Group__0 ) ) ;
    public final void ruleParallelComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:858:2: ( ( ( rule__ParallelComposition__Group__0 ) ) )
            // InternalIoTDevice.g:859:1: ( ( rule__ParallelComposition__Group__0 ) )
            {
            // InternalIoTDevice.g:859:1: ( ( rule__ParallelComposition__Group__0 ) )
            // InternalIoTDevice.g:860:1: ( rule__ParallelComposition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelCompositionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:861:1: ( rule__ParallelComposition__Group__0 )
            // InternalIoTDevice.g:861:2: rule__ParallelComposition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParallelComposition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelCompositionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleParallelComposition"


    // $ANTLR start "entryRuleSeqComposition"
    // InternalIoTDevice.g:873:1: entryRuleSeqComposition : ruleSeqComposition EOF ;
    public final void entryRuleSeqComposition() throws RecognitionException {
        try {
            // InternalIoTDevice.g:874:1: ( ruleSeqComposition EOF )
            // InternalIoTDevice.g:875:1: ruleSeqComposition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeqCompositionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSeqComposition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeqCompositionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSeqComposition"


    // $ANTLR start "ruleSeqComposition"
    // InternalIoTDevice.g:882:1: ruleSeqComposition : ( ( rule__SeqComposition__Group__0 ) ) ;
    public final void ruleSeqComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:886:2: ( ( ( rule__SeqComposition__Group__0 ) ) )
            // InternalIoTDevice.g:887:1: ( ( rule__SeqComposition__Group__0 ) )
            {
            // InternalIoTDevice.g:887:1: ( ( rule__SeqComposition__Group__0 ) )
            // InternalIoTDevice.g:888:1: ( rule__SeqComposition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeqCompositionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:889:1: ( rule__SeqComposition__Group__0 )
            // InternalIoTDevice.g:889:2: rule__SeqComposition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SeqComposition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeqCompositionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSeqComposition"


    // $ANTLR start "entryRuleSimpleReaction"
    // InternalIoTDevice.g:901:1: entryRuleSimpleReaction : ruleSimpleReaction EOF ;
    public final void entryRuleSimpleReaction() throws RecognitionException {
        try {
            // InternalIoTDevice.g:902:1: ( ruleSimpleReaction EOF )
            // InternalIoTDevice.g:903:1: ruleSimpleReaction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReactionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSimpleReaction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReactionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleReaction"


    // $ANTLR start "ruleSimpleReaction"
    // InternalIoTDevice.g:910:1: ruleSimpleReaction : ( ( rule__SimpleReaction__ExpAssignment ) ) ;
    public final void ruleSimpleReaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:914:2: ( ( ( rule__SimpleReaction__ExpAssignment ) ) )
            // InternalIoTDevice.g:915:1: ( ( rule__SimpleReaction__ExpAssignment ) )
            {
            // InternalIoTDevice.g:915:1: ( ( rule__SimpleReaction__ExpAssignment ) )
            // InternalIoTDevice.g:916:1: ( rule__SimpleReaction__ExpAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReactionAccess().getExpAssignment()); 
            }
            // InternalIoTDevice.g:917:1: ( rule__SimpleReaction__ExpAssignment )
            // InternalIoTDevice.g:917:2: rule__SimpleReaction__ExpAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SimpleReaction__ExpAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReactionAccess().getExpAssignment()); 
            }

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
    // $ANTLR end "ruleSimpleReaction"


    // $ANTLR start "entryRuleExpression"
    // InternalIoTDevice.g:929:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:930:1: ( ruleExpression EOF )
            // InternalIoTDevice.g:931:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalIoTDevice.g:938:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:942:2: ( ( ruleOrExpression ) )
            // InternalIoTDevice.g:943:1: ( ruleOrExpression )
            {
            // InternalIoTDevice.g:943:1: ( ruleOrExpression )
            // InternalIoTDevice.g:944:1: ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalIoTDevice.g:957:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:958:1: ( ruleOrExpression EOF )
            // InternalIoTDevice.g:959:1: ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOrExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalIoTDevice.g:966:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:970:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalIoTDevice.g:971:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalIoTDevice.g:971:1: ( ( rule__OrExpression__Group__0 ) )
            // InternalIoTDevice.g:972:1: ( rule__OrExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:973:1: ( rule__OrExpression__Group__0 )
            // InternalIoTDevice.g:973:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalIoTDevice.g:985:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:986:1: ( ruleAndExpression EOF )
            // InternalIoTDevice.g:987:1: ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalIoTDevice.g:994:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:998:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalIoTDevice.g:999:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalIoTDevice.g:999:1: ( ( rule__AndExpression__Group__0 ) )
            // InternalIoTDevice.g:1000:1: ( rule__AndExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:1001:1: ( rule__AndExpression__Group__0 )
            // InternalIoTDevice.g:1001:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalIoTDevice.g:1013:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1014:1: ( ruleEqualityExpression EOF )
            // InternalIoTDevice.g:1015:1: ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalIoTDevice.g:1022:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1026:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // InternalIoTDevice.g:1027:1: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // InternalIoTDevice.g:1027:1: ( ( rule__EqualityExpression__Group__0 ) )
            // InternalIoTDevice.g:1028:1: ( rule__EqualityExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:1029:1: ( rule__EqualityExpression__Group__0 )
            // InternalIoTDevice.g:1029:2: rule__EqualityExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalIoTDevice.g:1041:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1042:1: ( ruleRelationalExpression EOF )
            // InternalIoTDevice.g:1043:1: ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalIoTDevice.g:1050:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1054:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // InternalIoTDevice.g:1055:1: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // InternalIoTDevice.g:1055:1: ( ( rule__RelationalExpression__Group__0 ) )
            // InternalIoTDevice.g:1056:1: ( rule__RelationalExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:1057:1: ( rule__RelationalExpression__Group__0 )
            // InternalIoTDevice.g:1057:2: rule__RelationalExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalIoTDevice.g:1069:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1070:1: ( ruleAdditiveExpression EOF )
            // InternalIoTDevice.g:1071:1: ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalIoTDevice.g:1078:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1082:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalIoTDevice.g:1083:1: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalIoTDevice.g:1083:1: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalIoTDevice.g:1084:1: ( rule__AdditiveExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:1085:1: ( rule__AdditiveExpression__Group__0 )
            // InternalIoTDevice.g:1085:2: rule__AdditiveExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalIoTDevice.g:1097:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1098:1: ( ruleMultiplicativeExpression EOF )
            // InternalIoTDevice.g:1099:1: ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalIoTDevice.g:1106:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1110:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalIoTDevice.g:1111:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalIoTDevice.g:1111:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalIoTDevice.g:1112:1: ( rule__MultiplicativeExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:1113:1: ( rule__MultiplicativeExpression__Group__0 )
            // InternalIoTDevice.g:1113:2: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalIoTDevice.g:1125:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1126:1: ( ruleUnaryExpression EOF )
            // InternalIoTDevice.g:1127:1: ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalIoTDevice.g:1134:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1138:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // InternalIoTDevice.g:1139:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // InternalIoTDevice.g:1139:1: ( ( rule__UnaryExpression__Alternatives ) )
            // InternalIoTDevice.g:1140:1: ( rule__UnaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:1141:1: ( rule__UnaryExpression__Alternatives )
            // InternalIoTDevice.g:1141:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleCapabilitySelection"
    // InternalIoTDevice.g:1153:1: entryRuleCapabilitySelection : ruleCapabilitySelection EOF ;
    public final void entryRuleCapabilitySelection() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1154:1: ( ruleCapabilitySelection EOF )
            // InternalIoTDevice.g:1155:1: ruleCapabilitySelection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCapabilitySelection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCapabilitySelection"


    // $ANTLR start "ruleCapabilitySelection"
    // InternalIoTDevice.g:1162:1: ruleCapabilitySelection : ( ( rule__CapabilitySelection__Group__0 ) ) ;
    public final void ruleCapabilitySelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1166:2: ( ( ( rule__CapabilitySelection__Group__0 ) ) )
            // InternalIoTDevice.g:1167:1: ( ( rule__CapabilitySelection__Group__0 ) )
            {
            // InternalIoTDevice.g:1167:1: ( ( rule__CapabilitySelection__Group__0 ) )
            // InternalIoTDevice.g:1168:1: ( rule__CapabilitySelection__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:1169:1: ( rule__CapabilitySelection__Group__0 )
            // InternalIoTDevice.g:1169:2: rule__CapabilitySelection__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleCapabilitySelection"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalIoTDevice.g:1181:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1182:1: ( rulePrimaryExpression EOF )
            // InternalIoTDevice.g:1183:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalIoTDevice.g:1190:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1194:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalIoTDevice.g:1195:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalIoTDevice.g:1195:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalIoTDevice.g:1196:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:1197:1: ( rule__PrimaryExpression__Alternatives )
            // InternalIoTDevice.g:1197:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // InternalIoTDevice.g:1209:1: entryRuleParenthesizedExpression : ruleParenthesizedExpression EOF ;
    public final void entryRuleParenthesizedExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1210:1: ( ruleParenthesizedExpression EOF )
            // InternalIoTDevice.g:1211:1: ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // InternalIoTDevice.g:1218:1: ruleParenthesizedExpression : ( ( rule__ParenthesizedExpression__Group__0 ) ) ;
    public final void ruleParenthesizedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1222:2: ( ( ( rule__ParenthesizedExpression__Group__0 ) ) )
            // InternalIoTDevice.g:1223:1: ( ( rule__ParenthesizedExpression__Group__0 ) )
            {
            // InternalIoTDevice.g:1223:1: ( ( rule__ParenthesizedExpression__Group__0 ) )
            // InternalIoTDevice.g:1224:1: ( rule__ParenthesizedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
            }
            // InternalIoTDevice.g:1225:1: ( rule__ParenthesizedExpression__Group__0 )
            // InternalIoTDevice.g:1225:2: rule__ParenthesizedExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleTarget"
    // InternalIoTDevice.g:1237:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1238:1: ( ruleTarget EOF )
            // InternalIoTDevice.g:1239:1: ruleTarget EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTarget();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalIoTDevice.g:1246:1: ruleTarget : ( ( rule__Target__RefAssignment ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1250:2: ( ( ( rule__Target__RefAssignment ) ) )
            // InternalIoTDevice.g:1251:1: ( ( rule__Target__RefAssignment ) )
            {
            // InternalIoTDevice.g:1251:1: ( ( rule__Target__RefAssignment ) )
            // InternalIoTDevice.g:1252:1: ( rule__Target__RefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetAccess().getRefAssignment()); 
            }
            // InternalIoTDevice.g:1253:1: ( rule__Target__RefAssignment )
            // InternalIoTDevice.g:1253:2: rule__Target__RefAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Target__RefAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetAccess().getRefAssignment()); 
            }

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
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalIoTDevice.g:1265:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1266:1: ( ruleLiteralExpression EOF )
            // InternalIoTDevice.g:1267:1: ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalIoTDevice.g:1274:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1278:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalIoTDevice.g:1279:1: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalIoTDevice.g:1279:1: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalIoTDevice.g:1280:1: ( rule__LiteralExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:1281:1: ( rule__LiteralExpression__Alternatives )
            // InternalIoTDevice.g:1281:2: rule__LiteralExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIoTDevice.g:1293:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1294:1: ( ruleQualifiedName EOF )
            // InternalIoTDevice.g:1295:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalIoTDevice.g:1302:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1306:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalIoTDevice.g:1307:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalIoTDevice.g:1307:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalIoTDevice.g:1308:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalIoTDevice.g:1309:1: ( rule__QualifiedName__Group__0 )
            // InternalIoTDevice.g:1309:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // InternalIoTDevice.g:1321:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalIoTDevice.g:1322:1: ( ruleValidID EOF )
            // InternalIoTDevice.g:1323:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalIoTDevice.g:1330:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1334:2: ( ( RULE_ID ) )
            // InternalIoTDevice.g:1335:1: ( RULE_ID )
            {
            // InternalIoTDevice.g:1335:1: ( RULE_ID )
            // InternalIoTDevice.g:1336:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleProtocol"
    // InternalIoTDevice.g:1350:1: ruleProtocol : ( ( rule__Protocol__Alternatives ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1354:1: ( ( ( rule__Protocol__Alternatives ) ) )
            // InternalIoTDevice.g:1355:1: ( ( rule__Protocol__Alternatives ) )
            {
            // InternalIoTDevice.g:1355:1: ( ( rule__Protocol__Alternatives ) )
            // InternalIoTDevice.g:1356:1: ( rule__Protocol__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getAlternatives()); 
            }
            // InternalIoTDevice.g:1357:1: ( rule__Protocol__Alternatives )
            // InternalIoTDevice.g:1357:2: rule__Protocol__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Protocol__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalIoTDevice.g:1368:1: rule__Type__Alternatives : ( ( ruleDeclaredType ) | ( rulePrimitiveType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1372:1: ( ( ruleDeclaredType ) | ( rulePrimitiveType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27||(LA1_0>=31 && LA1_0<=34)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=57 && LA1_0<=60)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalIoTDevice.g:1373:1: ( ruleDeclaredType )
                    {
                    // InternalIoTDevice.g:1373:1: ( ruleDeclaredType )
                    // InternalIoTDevice.g:1374:1: ruleDeclaredType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDeclaredTypeParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDeclaredType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getDeclaredTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1379:6: ( rulePrimitiveType )
                    {
                    // InternalIoTDevice.g:1379:6: ( rulePrimitiveType )
                    // InternalIoTDevice.g:1380:1: rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DeclaredType__Alternatives"
    // InternalIoTDevice.g:1390:1: rule__DeclaredType__Alternatives : ( ( ruleNode ) | ( ruleEnumeration ) );
    public final void rule__DeclaredType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1394:1: ( ( ruleNode ) | ( ruleEnumeration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=31 && LA2_0<=34)) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalIoTDevice.g:1395:1: ( ruleNode )
                    {
                    // InternalIoTDevice.g:1395:1: ( ruleNode )
                    // InternalIoTDevice.g:1396:1: ruleNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaredTypeAccess().getNodeParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclaredTypeAccess().getNodeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1401:6: ( ruleEnumeration )
                    {
                    // InternalIoTDevice.g:1401:6: ( ruleEnumeration )
                    // InternalIoTDevice.g:1402:1: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaredTypeAccess().getEnumerationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclaredTypeAccess().getEnumerationParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__DeclaredType__Alternatives"


    // $ANTLR start "rule__Node__Alternatives"
    // InternalIoTDevice.g:1412:1: rule__Node__Alternatives : ( ( ruleCloud ) | ( ruleGateway ) | ( ruleRouter ) | ( ruleDevice ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1416:1: ( ( ruleCloud ) | ( ruleGateway ) | ( ruleRouter ) | ( ruleDevice ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalIoTDevice.g:1417:1: ( ruleCloud )
                    {
                    // InternalIoTDevice.g:1417:1: ( ruleCloud )
                    // InternalIoTDevice.g:1418:1: ruleCloud
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getCloudParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCloud();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getCloudParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1423:6: ( ruleGateway )
                    {
                    // InternalIoTDevice.g:1423:6: ( ruleGateway )
                    // InternalIoTDevice.g:1424:1: ruleGateway
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getGatewayParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleGateway();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getGatewayParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTDevice.g:1429:6: ( ruleRouter )
                    {
                    // InternalIoTDevice.g:1429:6: ( ruleRouter )
                    // InternalIoTDevice.g:1430:1: ruleRouter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getRouterParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRouter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getRouterParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTDevice.g:1435:6: ( ruleDevice )
                    {
                    // InternalIoTDevice.g:1435:6: ( ruleDevice )
                    // InternalIoTDevice.g:1436:1: ruleDevice
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getDeviceParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDevice();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getDeviceParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalIoTDevice.g:1446:1: rule__Feature__Alternatives : ( ( ruleProperty ) | ( ruleCapability ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1450:1: ( ( ruleProperty ) | ( ruleCapability ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==37||LA4_0==41) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIoTDevice.g:1451:1: ( ruleProperty )
                    {
                    // InternalIoTDevice.g:1451:1: ( ruleProperty )
                    // InternalIoTDevice.g:1452:1: ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1457:6: ( ruleCapability )
                    {
                    // InternalIoTDevice.g:1457:6: ( ruleCapability )
                    // InternalIoTDevice.g:1458:1: ruleCapability
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getCapabilityParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCapability();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getCapabilityParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__Capability__Alternatives"
    // InternalIoTDevice.g:1468:1: rule__Capability__Alternatives : ( ( ruleSensing ) | ( ruleActuating ) );
    public final void rule__Capability__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1472:1: ( ( ruleSensing ) | ( ruleActuating ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==37) ) {
                alt5=1;
            }
            else if ( (LA5_0==41) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoTDevice.g:1473:1: ( ruleSensing )
                    {
                    // InternalIoTDevice.g:1473:1: ( ruleSensing )
                    // InternalIoTDevice.g:1474:1: ruleSensing
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCapabilityAccess().getSensingParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleSensing();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCapabilityAccess().getSensingParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1479:6: ( ruleActuating )
                    {
                    // InternalIoTDevice.g:1479:6: ( ruleActuating )
                    // InternalIoTDevice.g:1480:1: ruleActuating
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCapabilityAccess().getActuatingParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleActuating();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCapabilityAccess().getActuatingParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Capability__Alternatives"


    // $ANTLR start "rule__TypeReference__Alternatives"
    // InternalIoTDevice.g:1490:1: rule__TypeReference__Alternatives : ( ( ( rule__TypeReference__PtypeAssignment_0 ) ) | ( ( rule__TypeReference__DtypeAssignment_1 ) ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1494:1: ( ( ( rule__TypeReference__PtypeAssignment_0 ) ) | ( ( rule__TypeReference__DtypeAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=57 && LA6_0<=60)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIoTDevice.g:1495:1: ( ( rule__TypeReference__PtypeAssignment_0 ) )
                    {
                    // InternalIoTDevice.g:1495:1: ( ( rule__TypeReference__PtypeAssignment_0 ) )
                    // InternalIoTDevice.g:1496:1: ( rule__TypeReference__PtypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeReferenceAccess().getPtypeAssignment_0()); 
                    }
                    // InternalIoTDevice.g:1497:1: ( rule__TypeReference__PtypeAssignment_0 )
                    // InternalIoTDevice.g:1497:2: rule__TypeReference__PtypeAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeReference__PtypeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeReferenceAccess().getPtypeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1501:6: ( ( rule__TypeReference__DtypeAssignment_1 ) )
                    {
                    // InternalIoTDevice.g:1501:6: ( ( rule__TypeReference__DtypeAssignment_1 ) )
                    // InternalIoTDevice.g:1502:1: ( rule__TypeReference__DtypeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeReferenceAccess().getDtypeAssignment_1()); 
                    }
                    // InternalIoTDevice.g:1503:1: ( rule__TypeReference__DtypeAssignment_1 )
                    // InternalIoTDevice.g:1503:2: rule__TypeReference__DtypeAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeReference__DtypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeReferenceAccess().getDtypeAssignment_1()); 
                    }

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
    // $ANTLR end "rule__TypeReference__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalIoTDevice.g:1512:1: rule__PrimitiveType__Alternatives : ( ( ruleIntegerType ) | ( ruleBooleanType ) | ( ruleStringType ) | ( ruleRealType ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1516:1: ( ( ruleIntegerType ) | ( ruleBooleanType ) | ( ruleStringType ) | ( ruleRealType ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt7=1;
                }
                break;
            case 58:
                {
                alt7=2;
                }
                break;
            case 59:
                {
                alt7=3;
                }
                break;
            case 60:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIoTDevice.g:1517:1: ( ruleIntegerType )
                    {
                    // InternalIoTDevice.g:1517:1: ( ruleIntegerType )
                    // InternalIoTDevice.g:1518:1: ruleIntegerType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntegerType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1523:6: ( ruleBooleanType )
                    {
                    // InternalIoTDevice.g:1523:6: ( ruleBooleanType )
                    // InternalIoTDevice.g:1524:1: ruleBooleanType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBooleanType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTDevice.g:1529:6: ( ruleStringType )
                    {
                    // InternalIoTDevice.g:1529:6: ( ruleStringType )
                    // InternalIoTDevice.g:1530:1: ruleStringType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleStringType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTDevice.g:1535:6: ( ruleRealType )
                    {
                    // InternalIoTDevice.g:1535:6: ( ruleRealType )
                    // InternalIoTDevice.g:1536:1: ruleRealType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getRealTypeParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleRealType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimitiveTypeAccess().getRealTypeParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__EqualityExpression__OpAlternatives_1_1_0"
    // InternalIoTDevice.g:1546:1: rule__EqualityExpression__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__EqualityExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1550:1: ( ( '==' ) | ( '!=' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIoTDevice.g:1551:1: ( '==' )
                    {
                    // InternalIoTDevice.g:1551:1: ( '==' )
                    // InternalIoTDevice.g:1552:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }
                    match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1559:6: ( '!=' )
                    {
                    // InternalIoTDevice.g:1559:6: ( '!=' )
                    // InternalIoTDevice.g:1560:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__EqualityExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__RelationalExpression__OpAlternatives_1_1_0"
    // InternalIoTDevice.g:1572:1: rule__RelationalExpression__OpAlternatives_1_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__RelationalExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1576:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            case 16:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalIoTDevice.g:1577:1: ( '<' )
                    {
                    // InternalIoTDevice.g:1577:1: ( '<' )
                    // InternalIoTDevice.g:1578:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_1_0_0()); 
                    }
                    match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1585:6: ( '>' )
                    {
                    // InternalIoTDevice.g:1585:6: ( '>' )
                    // InternalIoTDevice.g:1586:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1()); 
                    }
                    match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTDevice.g:1593:6: ( '<=' )
                    {
                    // InternalIoTDevice.g:1593:6: ( '<=' )
                    // InternalIoTDevice.g:1594:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    }
                    match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTDevice.g:1601:6: ( '>=' )
                    {
                    // InternalIoTDevice.g:1601:6: ( '>=' )
                    // InternalIoTDevice.g:1602:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    }
                    match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    }

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
    // $ANTLR end "rule__RelationalExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__AdditiveExpression__OpAlternatives_1_1_0"
    // InternalIoTDevice.g:1614:1: rule__AdditiveExpression__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditiveExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1618:1: ( ( '+' ) | ( '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==18) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTDevice.g:1619:1: ( '+' )
                    {
                    // InternalIoTDevice.g:1619:1: ( '+' )
                    // InternalIoTDevice.g:1620:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveExpressionAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    }
                    match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveExpressionAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1627:6: ( '-' )
                    {
                    // InternalIoTDevice.g:1627:6: ( '-' )
                    // InternalIoTDevice.g:1628:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditiveExpressionAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    }
                    match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditiveExpressionAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__AdditiveExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__MultiplicativeExpression__OpAlternatives_1_1_0"
    // InternalIoTDevice.g:1640:1: rule__MultiplicativeExpression__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultiplicativeExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1644:1: ( ( '*' ) | ( '/' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoTDevice.g:1645:1: ( '*' )
                    {
                    // InternalIoTDevice.g:1645:1: ( '*' )
                    // InternalIoTDevice.g:1646:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,19,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1653:6: ( '/' )
                    {
                    // InternalIoTDevice.g:1653:6: ( '/' )
                    // InternalIoTDevice.g:1654:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }
                    match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__MultiplicativeExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // InternalIoTDevice.g:1666:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) | ( ruleCapabilitySelection ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1670:1: ( ( ( rule__UnaryExpression__Group_0__0 ) ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) | ( ruleCapabilitySelection ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                alt12=2;
                }
                break;
            case 18:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 21:
            case 38:
            case 55:
            case 64:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalIoTDevice.g:1671:1: ( ( rule__UnaryExpression__Group_0__0 ) )
                    {
                    // InternalIoTDevice.g:1671:1: ( ( rule__UnaryExpression__Group_0__0 ) )
                    // InternalIoTDevice.g:1672:1: ( rule__UnaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalIoTDevice.g:1673:1: ( rule__UnaryExpression__Group_0__0 )
                    // InternalIoTDevice.g:1673:2: rule__UnaryExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__UnaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1677:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // InternalIoTDevice.g:1677:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // InternalIoTDevice.g:1678:1: ( rule__UnaryExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    }
                    // InternalIoTDevice.g:1679:1: ( rule__UnaryExpression__Group_1__0 )
                    // InternalIoTDevice.g:1679:2: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTDevice.g:1683:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    {
                    // InternalIoTDevice.g:1683:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    // InternalIoTDevice.g:1684:1: ( rule__UnaryExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    }
                    // InternalIoTDevice.g:1685:1: ( rule__UnaryExpression__Group_2__0 )
                    // InternalIoTDevice.g:1685:2: rule__UnaryExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__UnaryExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTDevice.g:1689:6: ( ruleCapabilitySelection )
                    {
                    // InternalIoTDevice.g:1689:6: ( ruleCapabilitySelection )
                    // InternalIoTDevice.g:1690:1: ruleCapabilitySelection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getUnaryExpressionAccess().getCapabilitySelectionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleCapabilitySelection();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getUnaryExpressionAccess().getCapabilitySelectionParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalIoTDevice.g:1700:1: rule__PrimaryExpression__Alternatives : ( ( ruleParenthesizedExpression ) | ( ruleLiteralExpression ) | ( ruleTarget ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1704:1: ( ( ruleParenthesizedExpression ) | ( ruleLiteralExpression ) | ( ruleTarget ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt13=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 21:
            case 55:
            case 64:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 29:
                case 30:
                case 39:
                case 40:
                case 47:
                case 52:
                case 61:
                case 62:
                    {
                    alt13=3;
                    }
                    break;
                case 53:
                    {
                    int LA13_5 = input.LA(3);

                    if ( (LA13_5==RULE_ID) ) {
                        int LA13_6 = input.LA(4);

                        if ( (LA13_6==38) ) {
                            alt13=3;
                        }
                        else if ( ((LA13_6>=53 && LA13_6<=54)) ) {
                            alt13=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 6, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 54:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalIoTDevice.g:1705:1: ( ruleParenthesizedExpression )
                    {
                    // InternalIoTDevice.g:1705:1: ( ruleParenthesizedExpression )
                    // InternalIoTDevice.g:1706:1: ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1711:6: ( ruleLiteralExpression )
                    {
                    // InternalIoTDevice.g:1711:6: ( ruleLiteralExpression )
                    // InternalIoTDevice.g:1712:1: ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTDevice.g:1717:6: ( ruleTarget )
                    {
                    // InternalIoTDevice.g:1717:6: ( ruleTarget )
                    // InternalIoTDevice.g:1718:1: ruleTarget
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getTargetParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTarget();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getTargetParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // InternalIoTDevice.g:1728:1: rule__LiteralExpression__Alternatives : ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) | ( ( rule__LiteralExpression__Group_2__0 ) ) | ( ( rule__LiteralExpression__Group_3__0 ) ) | ( ( rule__LiteralExpression__Group_4__0 ) ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1732:1: ( ( ( rule__LiteralExpression__Group_0__0 ) ) | ( ( rule__LiteralExpression__Group_1__0 ) ) | ( ( rule__LiteralExpression__Group_2__0 ) ) | ( ( rule__LiteralExpression__Group_3__0 ) ) | ( ( rule__LiteralExpression__Group_4__0 ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                alt14=3;
                }
                break;
            case 55:
                {
                alt14=4;
                }
                break;
            case 21:
            case 64:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalIoTDevice.g:1733:1: ( ( rule__LiteralExpression__Group_0__0 ) )
                    {
                    // InternalIoTDevice.g:1733:1: ( ( rule__LiteralExpression__Group_0__0 ) )
                    // InternalIoTDevice.g:1734:1: ( rule__LiteralExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getGroup_0()); 
                    }
                    // InternalIoTDevice.g:1735:1: ( rule__LiteralExpression__Group_0__0 )
                    // InternalIoTDevice.g:1735:2: rule__LiteralExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LiteralExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1739:6: ( ( rule__LiteralExpression__Group_1__0 ) )
                    {
                    // InternalIoTDevice.g:1739:6: ( ( rule__LiteralExpression__Group_1__0 ) )
                    // InternalIoTDevice.g:1740:1: ( rule__LiteralExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getGroup_1()); 
                    }
                    // InternalIoTDevice.g:1741:1: ( rule__LiteralExpression__Group_1__0 )
                    // InternalIoTDevice.g:1741:2: rule__LiteralExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LiteralExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTDevice.g:1745:6: ( ( rule__LiteralExpression__Group_2__0 ) )
                    {
                    // InternalIoTDevice.g:1745:6: ( ( rule__LiteralExpression__Group_2__0 ) )
                    // InternalIoTDevice.g:1746:1: ( rule__LiteralExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getGroup_2()); 
                    }
                    // InternalIoTDevice.g:1747:1: ( rule__LiteralExpression__Group_2__0 )
                    // InternalIoTDevice.g:1747:2: rule__LiteralExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LiteralExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTDevice.g:1751:6: ( ( rule__LiteralExpression__Group_3__0 ) )
                    {
                    // InternalIoTDevice.g:1751:6: ( ( rule__LiteralExpression__Group_3__0 ) )
                    // InternalIoTDevice.g:1752:1: ( rule__LiteralExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getGroup_3()); 
                    }
                    // InternalIoTDevice.g:1753:1: ( rule__LiteralExpression__Group_3__0 )
                    // InternalIoTDevice.g:1753:2: rule__LiteralExpression__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LiteralExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIoTDevice.g:1757:6: ( ( rule__LiteralExpression__Group_4__0 ) )
                    {
                    // InternalIoTDevice.g:1757:6: ( ( rule__LiteralExpression__Group_4__0 ) )
                    // InternalIoTDevice.g:1758:1: ( rule__LiteralExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getGroup_4()); 
                    }
                    // InternalIoTDevice.g:1759:1: ( rule__LiteralExpression__Group_4__0 )
                    // InternalIoTDevice.g:1759:2: rule__LiteralExpression__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LiteralExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getGroup_4()); 
                    }

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
    // $ANTLR end "rule__LiteralExpression__Alternatives"


    // $ANTLR start "rule__LiteralExpression__Alternatives_4_1"
    // InternalIoTDevice.g:1768:1: rule__LiteralExpression__Alternatives_4_1 : ( ( 'false' ) | ( ( rule__LiteralExpression__IsTrueAssignment_4_1_1 ) ) );
    public final void rule__LiteralExpression__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1772:1: ( ( 'false' ) | ( ( rule__LiteralExpression__IsTrueAssignment_4_1_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            else if ( (LA15_0==64) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalIoTDevice.g:1773:1: ( 'false' )
                    {
                    // InternalIoTDevice.g:1773:1: ( 'false' )
                    // InternalIoTDevice.g:1774:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getFalseKeyword_4_1_0()); 
                    }
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getFalseKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1781:6: ( ( rule__LiteralExpression__IsTrueAssignment_4_1_1 ) )
                    {
                    // InternalIoTDevice.g:1781:6: ( ( rule__LiteralExpression__IsTrueAssignment_4_1_1 ) )
                    // InternalIoTDevice.g:1782:1: ( rule__LiteralExpression__IsTrueAssignment_4_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralExpressionAccess().getIsTrueAssignment_4_1_1()); 
                    }
                    // InternalIoTDevice.g:1783:1: ( rule__LiteralExpression__IsTrueAssignment_4_1_1 )
                    // InternalIoTDevice.g:1783:2: rule__LiteralExpression__IsTrueAssignment_4_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LiteralExpression__IsTrueAssignment_4_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralExpressionAccess().getIsTrueAssignment_4_1_1()); 
                    }

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
    // $ANTLR end "rule__LiteralExpression__Alternatives_4_1"


    // $ANTLR start "rule__Protocol__Alternatives"
    // InternalIoTDevice.g:1792:1: rule__Protocol__Alternatives : ( ( ( 'IP' ) ) | ( ( 'ZWAVE' ) ) | ( ( 'ZIGBEE' ) ) | ( ( 'MQTT' ) ) | ( ( 'DDS' ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1796:1: ( ( ( 'IP' ) ) | ( ( 'ZWAVE' ) ) | ( ( 'ZIGBEE' ) ) | ( ( 'MQTT' ) ) | ( ( 'DDS' ) ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 23:
                {
                alt16=2;
                }
                break;
            case 24:
                {
                alt16=3;
                }
                break;
            case 25:
                {
                alt16=4;
                }
                break;
            case 26:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalIoTDevice.g:1797:1: ( ( 'IP' ) )
                    {
                    // InternalIoTDevice.g:1797:1: ( ( 'IP' ) )
                    // InternalIoTDevice.g:1798:1: ( 'IP' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProtocolAccess().getIPEnumLiteralDeclaration_0()); 
                    }
                    // InternalIoTDevice.g:1799:1: ( 'IP' )
                    // InternalIoTDevice.g:1799:3: 'IP'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProtocolAccess().getIPEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDevice.g:1804:6: ( ( 'ZWAVE' ) )
                    {
                    // InternalIoTDevice.g:1804:6: ( ( 'ZWAVE' ) )
                    // InternalIoTDevice.g:1805:1: ( 'ZWAVE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProtocolAccess().getZWAVEEnumLiteralDeclaration_1()); 
                    }
                    // InternalIoTDevice.g:1806:1: ( 'ZWAVE' )
                    // InternalIoTDevice.g:1806:3: 'ZWAVE'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProtocolAccess().getZWAVEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoTDevice.g:1811:6: ( ( 'ZIGBEE' ) )
                    {
                    // InternalIoTDevice.g:1811:6: ( ( 'ZIGBEE' ) )
                    // InternalIoTDevice.g:1812:1: ( 'ZIGBEE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProtocolAccess().getZIGBEEEnumLiteralDeclaration_2()); 
                    }
                    // InternalIoTDevice.g:1813:1: ( 'ZIGBEE' )
                    // InternalIoTDevice.g:1813:3: 'ZIGBEE'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProtocolAccess().getZIGBEEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoTDevice.g:1818:6: ( ( 'MQTT' ) )
                    {
                    // InternalIoTDevice.g:1818:6: ( ( 'MQTT' ) )
                    // InternalIoTDevice.g:1819:1: ( 'MQTT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProtocolAccess().getMQTTEnumLiteralDeclaration_3()); 
                    }
                    // InternalIoTDevice.g:1820:1: ( 'MQTT' )
                    // InternalIoTDevice.g:1820:3: 'MQTT'
                    {
                    match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProtocolAccess().getMQTTEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIoTDevice.g:1825:6: ( ( 'DDS' ) )
                    {
                    // InternalIoTDevice.g:1825:6: ( ( 'DDS' ) )
                    // InternalIoTDevice.g:1826:1: ( 'DDS' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProtocolAccess().getDDSEnumLiteralDeclaration_4()); 
                    }
                    // InternalIoTDevice.g:1827:1: ( 'DDS' )
                    // InternalIoTDevice.g:1827:3: 'DDS'
                    {
                    match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProtocolAccess().getDDSEnumLiteralDeclaration_4()); 
                    }

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
    // $ANTLR end "rule__Protocol__Alternatives"


    // $ANTLR start "rule__IoTModel__Group__0"
    // InternalIoTDevice.g:1839:1: rule__IoTModel__Group__0 : rule__IoTModel__Group__0__Impl rule__IoTModel__Group__1 ;
    public final void rule__IoTModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1843:1: ( rule__IoTModel__Group__0__Impl rule__IoTModel__Group__1 )
            // InternalIoTDevice.g:1844:2: rule__IoTModel__Group__0__Impl rule__IoTModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__IoTModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IoTModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IoTModel__Group__0"


    // $ANTLR start "rule__IoTModel__Group__0__Impl"
    // InternalIoTDevice.g:1851:1: rule__IoTModel__Group__0__Impl : ( () ) ;
    public final void rule__IoTModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1855:1: ( ( () ) )
            // InternalIoTDevice.g:1856:1: ( () )
            {
            // InternalIoTDevice.g:1856:1: ( () )
            // InternalIoTDevice.g:1857:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getIoTModelAction_0()); 
            }
            // InternalIoTDevice.g:1858:1: ()
            // InternalIoTDevice.g:1860:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelAccess().getIoTModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IoTModel__Group__0__Impl"


    // $ANTLR start "rule__IoTModel__Group__1"
    // InternalIoTDevice.g:1870:1: rule__IoTModel__Group__1 : rule__IoTModel__Group__1__Impl rule__IoTModel__Group__2 ;
    public final void rule__IoTModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1874:1: ( rule__IoTModel__Group__1__Impl rule__IoTModel__Group__2 )
            // InternalIoTDevice.g:1875:2: rule__IoTModel__Group__1__Impl rule__IoTModel__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__IoTModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IoTModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IoTModel__Group__1"


    // $ANTLR start "rule__IoTModel__Group__1__Impl"
    // InternalIoTDevice.g:1882:1: rule__IoTModel__Group__1__Impl : ( ( rule__IoTModel__TypesAssignment_1 )* ) ;
    public final void rule__IoTModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1886:1: ( ( ( rule__IoTModel__TypesAssignment_1 )* ) )
            // InternalIoTDevice.g:1887:1: ( ( rule__IoTModel__TypesAssignment_1 )* )
            {
            // InternalIoTDevice.g:1887:1: ( ( rule__IoTModel__TypesAssignment_1 )* )
            // InternalIoTDevice.g:1888:1: ( rule__IoTModel__TypesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getTypesAssignment_1()); 
            }
            // InternalIoTDevice.g:1889:1: ( rule__IoTModel__TypesAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27||(LA17_0>=31 && LA17_0<=34)||(LA17_0>=57 && LA17_0<=60)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIoTDevice.g:1889:2: rule__IoTModel__TypesAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__IoTModel__TypesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelAccess().getTypesAssignment_1()); 
            }

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
    // $ANTLR end "rule__IoTModel__Group__1__Impl"


    // $ANTLR start "rule__IoTModel__Group__2"
    // InternalIoTDevice.g:1899:1: rule__IoTModel__Group__2 : rule__IoTModel__Group__2__Impl rule__IoTModel__Group__3 ;
    public final void rule__IoTModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1903:1: ( rule__IoTModel__Group__2__Impl rule__IoTModel__Group__3 )
            // InternalIoTDevice.g:1904:2: rule__IoTModel__Group__2__Impl rule__IoTModel__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__IoTModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IoTModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IoTModel__Group__2"


    // $ANTLR start "rule__IoTModel__Group__2__Impl"
    // InternalIoTDevice.g:1911:1: rule__IoTModel__Group__2__Impl : ( ( rule__IoTModel__ConfigurationAssignment_2 )* ) ;
    public final void rule__IoTModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1915:1: ( ( ( rule__IoTModel__ConfigurationAssignment_2 )* ) )
            // InternalIoTDevice.g:1916:1: ( ( rule__IoTModel__ConfigurationAssignment_2 )* )
            {
            // InternalIoTDevice.g:1916:1: ( ( rule__IoTModel__ConfigurationAssignment_2 )* )
            // InternalIoTDevice.g:1917:1: ( rule__IoTModel__ConfigurationAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getConfigurationAssignment_2()); 
            }
            // InternalIoTDevice.g:1918:1: ( rule__IoTModel__ConfigurationAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIoTDevice.g:1918:2: rule__IoTModel__ConfigurationAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__IoTModel__ConfigurationAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelAccess().getConfigurationAssignment_2()); 
            }

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
    // $ANTLR end "rule__IoTModel__Group__2__Impl"


    // $ANTLR start "rule__IoTModel__Group__3"
    // InternalIoTDevice.g:1928:1: rule__IoTModel__Group__3 : rule__IoTModel__Group__3__Impl ;
    public final void rule__IoTModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1932:1: ( rule__IoTModel__Group__3__Impl )
            // InternalIoTDevice.g:1933:2: rule__IoTModel__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IoTModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IoTModel__Group__3"


    // $ANTLR start "rule__IoTModel__Group__3__Impl"
    // InternalIoTDevice.g:1939:1: rule__IoTModel__Group__3__Impl : ( ( rule__IoTModel__RulesAssignment_3 )* ) ;
    public final void rule__IoTModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1943:1: ( ( ( rule__IoTModel__RulesAssignment_3 )* ) )
            // InternalIoTDevice.g:1944:1: ( ( rule__IoTModel__RulesAssignment_3 )* )
            {
            // InternalIoTDevice.g:1944:1: ( ( rule__IoTModel__RulesAssignment_3 )* )
            // InternalIoTDevice.g:1945:1: ( rule__IoTModel__RulesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getRulesAssignment_3()); 
            }
            // InternalIoTDevice.g:1946:1: ( rule__IoTModel__RulesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalIoTDevice.g:1946:2: rule__IoTModel__RulesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__IoTModel__RulesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelAccess().getRulesAssignment_3()); 
            }

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
    // $ANTLR end "rule__IoTModel__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalIoTDevice.g:1964:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1968:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalIoTDevice.g:1969:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalIoTDevice.g:1976:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1980:1: ( ( 'enumeration' ) )
            // InternalIoTDevice.g:1981:1: ( 'enumeration' )
            {
            // InternalIoTDevice.g:1981:1: ( 'enumeration' )
            // InternalIoTDevice.g:1982:1: 'enumeration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            }

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
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalIoTDevice.g:1995:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:1999:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalIoTDevice.g:2000:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalIoTDevice.g:2007:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2011:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:2012:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:2012:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalIoTDevice.g:2013:1: ( rule__Enumeration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:2014:1: ( rule__Enumeration__NameAssignment_1 )
            // InternalIoTDevice.g:2014:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalIoTDevice.g:2024:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2028:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalIoTDevice.g:2029:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalIoTDevice.g:2036:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2040:1: ( ( '{' ) )
            // InternalIoTDevice.g:2041:1: ( '{' )
            {
            // InternalIoTDevice.g:2041:1: ( '{' )
            // InternalIoTDevice.g:2042:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            }

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
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalIoTDevice.g:2055:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2059:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalIoTDevice.g:2060:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalIoTDevice.g:2067:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__Group_3__0 )* ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2071:1: ( ( ( rule__Enumeration__Group_3__0 )* ) )
            // InternalIoTDevice.g:2072:1: ( ( rule__Enumeration__Group_3__0 )* )
            {
            // InternalIoTDevice.g:2072:1: ( ( rule__Enumeration__Group_3__0 )* )
            // InternalIoTDevice.g:2073:1: ( rule__Enumeration__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup_3()); 
            }
            // InternalIoTDevice.g:2074:1: ( rule__Enumeration__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIoTDevice.g:2074:2: rule__Enumeration__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__Enumeration__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup_3()); 
            }

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
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalIoTDevice.g:2084:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2088:1: ( rule__Enumeration__Group__4__Impl )
            // InternalIoTDevice.g:2089:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalIoTDevice.g:2095:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2099:1: ( ( '}' ) )
            // InternalIoTDevice.g:2100:1: ( '}' )
            {
            // InternalIoTDevice.g:2100:1: ( '}' )
            // InternalIoTDevice.g:2101:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group_3__0"
    // InternalIoTDevice.g:2124:1: rule__Enumeration__Group_3__0 : rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1 ;
    public final void rule__Enumeration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2128:1: ( rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1 )
            // InternalIoTDevice.g:2129:2: rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Enumeration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Enumeration__Group_3__0"


    // $ANTLR start "rule__Enumeration__Group_3__0__Impl"
    // InternalIoTDevice.g:2136:1: rule__Enumeration__Group_3__0__Impl : ( ( rule__Enumeration__LiteralsAssignment_3_0 ) ) ;
    public final void rule__Enumeration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2140:1: ( ( ( rule__Enumeration__LiteralsAssignment_3_0 ) ) )
            // InternalIoTDevice.g:2141:1: ( ( rule__Enumeration__LiteralsAssignment_3_0 ) )
            {
            // InternalIoTDevice.g:2141:1: ( ( rule__Enumeration__LiteralsAssignment_3_0 ) )
            // InternalIoTDevice.g:2142:1: ( rule__Enumeration__LiteralsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_0()); 
            }
            // InternalIoTDevice.g:2143:1: ( rule__Enumeration__LiteralsAssignment_3_0 )
            // InternalIoTDevice.g:2143:2: rule__Enumeration__LiteralsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__LiteralsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_0()); 
            }

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
    // $ANTLR end "rule__Enumeration__Group_3__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_3__1"
    // InternalIoTDevice.g:2153:1: rule__Enumeration__Group_3__1 : rule__Enumeration__Group_3__1__Impl ;
    public final void rule__Enumeration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2157:1: ( rule__Enumeration__Group_3__1__Impl )
            // InternalIoTDevice.g:2158:2: rule__Enumeration__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Enumeration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Enumeration__Group_3__1"


    // $ANTLR start "rule__Enumeration__Group_3__1__Impl"
    // InternalIoTDevice.g:2164:1: rule__Enumeration__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Enumeration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2168:1: ( ( ';' ) )
            // InternalIoTDevice.g:2169:1: ( ';' )
            {
            // InternalIoTDevice.g:2169:1: ( ';' )
            // InternalIoTDevice.g:2170:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getSemicolonKeyword_3_1()); 
            }

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
    // $ANTLR end "rule__Enumeration__Group_3__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // InternalIoTDevice.g:2187:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2191:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalIoTDevice.g:2192:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // InternalIoTDevice.g:2199:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2203:1: ( ( () ) )
            // InternalIoTDevice.g:2204:1: ( () )
            {
            // InternalIoTDevice.g:2204:1: ( () )
            // InternalIoTDevice.g:2205:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            }
            // InternalIoTDevice.g:2206:1: ()
            // InternalIoTDevice.g:2208:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // InternalIoTDevice.g:2218:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2222:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalIoTDevice.g:2223:2: rule__EnumerationLiteral__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // InternalIoTDevice.g:2229:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2233:1: ( ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:2234:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:2234:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            // InternalIoTDevice.g:2235:1: ( rule__EnumerationLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:2236:1: ( rule__EnumerationLiteral__NameAssignment_1 )
            // InternalIoTDevice.g:2236:2: rule__EnumerationLiteral__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationLiteral__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__Cloud__Group__0"
    // InternalIoTDevice.g:2250:1: rule__Cloud__Group__0 : rule__Cloud__Group__0__Impl rule__Cloud__Group__1 ;
    public final void rule__Cloud__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2254:1: ( rule__Cloud__Group__0__Impl rule__Cloud__Group__1 )
            // InternalIoTDevice.g:2255:2: rule__Cloud__Group__0__Impl rule__Cloud__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Cloud__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cloud__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Cloud__Group__0"


    // $ANTLR start "rule__Cloud__Group__0__Impl"
    // InternalIoTDevice.g:2262:1: rule__Cloud__Group__0__Impl : ( () ) ;
    public final void rule__Cloud__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2266:1: ( ( () ) )
            // InternalIoTDevice.g:2267:1: ( () )
            {
            // InternalIoTDevice.g:2267:1: ( () )
            // InternalIoTDevice.g:2268:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloudAccess().getCloudAction_0()); 
            }
            // InternalIoTDevice.g:2269:1: ()
            // InternalIoTDevice.g:2271:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloudAccess().getCloudAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cloud__Group__0__Impl"


    // $ANTLR start "rule__Cloud__Group__1"
    // InternalIoTDevice.g:2281:1: rule__Cloud__Group__1 : rule__Cloud__Group__1__Impl rule__Cloud__Group__2 ;
    public final void rule__Cloud__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2285:1: ( rule__Cloud__Group__1__Impl rule__Cloud__Group__2 )
            // InternalIoTDevice.g:2286:2: rule__Cloud__Group__1__Impl rule__Cloud__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Cloud__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cloud__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Cloud__Group__1"


    // $ANTLR start "rule__Cloud__Group__1__Impl"
    // InternalIoTDevice.g:2293:1: rule__Cloud__Group__1__Impl : ( 'cloud' ) ;
    public final void rule__Cloud__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2297:1: ( ( 'cloud' ) )
            // InternalIoTDevice.g:2298:1: ( 'cloud' )
            {
            // InternalIoTDevice.g:2298:1: ( 'cloud' )
            // InternalIoTDevice.g:2299:1: 'cloud'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloudAccess().getCloudKeyword_1()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloudAccess().getCloudKeyword_1()); 
            }

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
    // $ANTLR end "rule__Cloud__Group__1__Impl"


    // $ANTLR start "rule__Cloud__Group__2"
    // InternalIoTDevice.g:2312:1: rule__Cloud__Group__2 : rule__Cloud__Group__2__Impl ;
    public final void rule__Cloud__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2316:1: ( rule__Cloud__Group__2__Impl )
            // InternalIoTDevice.g:2317:2: rule__Cloud__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cloud__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Cloud__Group__2"


    // $ANTLR start "rule__Cloud__Group__2__Impl"
    // InternalIoTDevice.g:2323:1: rule__Cloud__Group__2__Impl : ( ( rule__Cloud__NameAssignment_2 ) ) ;
    public final void rule__Cloud__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2327:1: ( ( ( rule__Cloud__NameAssignment_2 ) ) )
            // InternalIoTDevice.g:2328:1: ( ( rule__Cloud__NameAssignment_2 ) )
            {
            // InternalIoTDevice.g:2328:1: ( ( rule__Cloud__NameAssignment_2 ) )
            // InternalIoTDevice.g:2329:1: ( rule__Cloud__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloudAccess().getNameAssignment_2()); 
            }
            // InternalIoTDevice.g:2330:1: ( rule__Cloud__NameAssignment_2 )
            // InternalIoTDevice.g:2330:2: rule__Cloud__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cloud__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloudAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Cloud__Group__2__Impl"


    // $ANTLR start "rule__Gateway__Group__0"
    // InternalIoTDevice.g:2346:1: rule__Gateway__Group__0 : rule__Gateway__Group__0__Impl rule__Gateway__Group__1 ;
    public final void rule__Gateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2350:1: ( rule__Gateway__Group__0__Impl rule__Gateway__Group__1 )
            // InternalIoTDevice.g:2351:2: rule__Gateway__Group__0__Impl rule__Gateway__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Gateway__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Gateway__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Gateway__Group__0"


    // $ANTLR start "rule__Gateway__Group__0__Impl"
    // InternalIoTDevice.g:2358:1: rule__Gateway__Group__0__Impl : ( () ) ;
    public final void rule__Gateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2362:1: ( ( () ) )
            // InternalIoTDevice.g:2363:1: ( () )
            {
            // InternalIoTDevice.g:2363:1: ( () )
            // InternalIoTDevice.g:2364:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getGatewayAction_0()); 
            }
            // InternalIoTDevice.g:2365:1: ()
            // InternalIoTDevice.g:2367:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGatewayAccess().getGatewayAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gateway__Group__0__Impl"


    // $ANTLR start "rule__Gateway__Group__1"
    // InternalIoTDevice.g:2377:1: rule__Gateway__Group__1 : rule__Gateway__Group__1__Impl rule__Gateway__Group__2 ;
    public final void rule__Gateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2381:1: ( rule__Gateway__Group__1__Impl rule__Gateway__Group__2 )
            // InternalIoTDevice.g:2382:2: rule__Gateway__Group__1__Impl rule__Gateway__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Gateway__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Gateway__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Gateway__Group__1"


    // $ANTLR start "rule__Gateway__Group__1__Impl"
    // InternalIoTDevice.g:2389:1: rule__Gateway__Group__1__Impl : ( 'gateway' ) ;
    public final void rule__Gateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2393:1: ( ( 'gateway' ) )
            // InternalIoTDevice.g:2394:1: ( 'gateway' )
            {
            // InternalIoTDevice.g:2394:1: ( 'gateway' )
            // InternalIoTDevice.g:2395:1: 'gateway'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getGatewayKeyword_1()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGatewayAccess().getGatewayKeyword_1()); 
            }

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
    // $ANTLR end "rule__Gateway__Group__1__Impl"


    // $ANTLR start "rule__Gateway__Group__2"
    // InternalIoTDevice.g:2408:1: rule__Gateway__Group__2 : rule__Gateway__Group__2__Impl ;
    public final void rule__Gateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2412:1: ( rule__Gateway__Group__2__Impl )
            // InternalIoTDevice.g:2413:2: rule__Gateway__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Gateway__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Gateway__Group__2"


    // $ANTLR start "rule__Gateway__Group__2__Impl"
    // InternalIoTDevice.g:2419:1: rule__Gateway__Group__2__Impl : ( ( rule__Gateway__NameAssignment_2 ) ) ;
    public final void rule__Gateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2423:1: ( ( ( rule__Gateway__NameAssignment_2 ) ) )
            // InternalIoTDevice.g:2424:1: ( ( rule__Gateway__NameAssignment_2 ) )
            {
            // InternalIoTDevice.g:2424:1: ( ( rule__Gateway__NameAssignment_2 ) )
            // InternalIoTDevice.g:2425:1: ( rule__Gateway__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getNameAssignment_2()); 
            }
            // InternalIoTDevice.g:2426:1: ( rule__Gateway__NameAssignment_2 )
            // InternalIoTDevice.g:2426:2: rule__Gateway__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Gateway__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGatewayAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Gateway__Group__2__Impl"


    // $ANTLR start "rule__Router__Group__0"
    // InternalIoTDevice.g:2442:1: rule__Router__Group__0 : rule__Router__Group__0__Impl rule__Router__Group__1 ;
    public final void rule__Router__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2446:1: ( rule__Router__Group__0__Impl rule__Router__Group__1 )
            // InternalIoTDevice.g:2447:2: rule__Router__Group__0__Impl rule__Router__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Router__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Router__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Router__Group__0"


    // $ANTLR start "rule__Router__Group__0__Impl"
    // InternalIoTDevice.g:2454:1: rule__Router__Group__0__Impl : ( () ) ;
    public final void rule__Router__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2458:1: ( ( () ) )
            // InternalIoTDevice.g:2459:1: ( () )
            {
            // InternalIoTDevice.g:2459:1: ( () )
            // InternalIoTDevice.g:2460:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRouterAccess().getRouterAction_0()); 
            }
            // InternalIoTDevice.g:2461:1: ()
            // InternalIoTDevice.g:2463:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRouterAccess().getRouterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Router__Group__0__Impl"


    // $ANTLR start "rule__Router__Group__1"
    // InternalIoTDevice.g:2473:1: rule__Router__Group__1 : rule__Router__Group__1__Impl rule__Router__Group__2 ;
    public final void rule__Router__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2477:1: ( rule__Router__Group__1__Impl rule__Router__Group__2 )
            // InternalIoTDevice.g:2478:2: rule__Router__Group__1__Impl rule__Router__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Router__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Router__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Router__Group__1"


    // $ANTLR start "rule__Router__Group__1__Impl"
    // InternalIoTDevice.g:2485:1: rule__Router__Group__1__Impl : ( 'router' ) ;
    public final void rule__Router__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2489:1: ( ( 'router' ) )
            // InternalIoTDevice.g:2490:1: ( 'router' )
            {
            // InternalIoTDevice.g:2490:1: ( 'router' )
            // InternalIoTDevice.g:2491:1: 'router'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRouterAccess().getRouterKeyword_1()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRouterAccess().getRouterKeyword_1()); 
            }

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
    // $ANTLR end "rule__Router__Group__1__Impl"


    // $ANTLR start "rule__Router__Group__2"
    // InternalIoTDevice.g:2504:1: rule__Router__Group__2 : rule__Router__Group__2__Impl ;
    public final void rule__Router__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2508:1: ( rule__Router__Group__2__Impl )
            // InternalIoTDevice.g:2509:2: rule__Router__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Router__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Router__Group__2"


    // $ANTLR start "rule__Router__Group__2__Impl"
    // InternalIoTDevice.g:2515:1: rule__Router__Group__2__Impl : ( ( rule__Router__NameAssignment_2 ) ) ;
    public final void rule__Router__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2519:1: ( ( ( rule__Router__NameAssignment_2 ) ) )
            // InternalIoTDevice.g:2520:1: ( ( rule__Router__NameAssignment_2 ) )
            {
            // InternalIoTDevice.g:2520:1: ( ( rule__Router__NameAssignment_2 ) )
            // InternalIoTDevice.g:2521:1: ( rule__Router__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRouterAccess().getNameAssignment_2()); 
            }
            // InternalIoTDevice.g:2522:1: ( rule__Router__NameAssignment_2 )
            // InternalIoTDevice.g:2522:2: rule__Router__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Router__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRouterAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Router__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalIoTDevice.g:2538:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2542:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalIoTDevice.g:2543:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Device__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalIoTDevice.g:2550:1: rule__Device__Group__0__Impl : ( () ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2554:1: ( ( () ) )
            // InternalIoTDevice.g:2555:1: ( () )
            {
            // InternalIoTDevice.g:2555:1: ( () )
            // InternalIoTDevice.g:2556:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDeviceAction_0()); 
            }
            // InternalIoTDevice.g:2557:1: ()
            // InternalIoTDevice.g:2559:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDeviceAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalIoTDevice.g:2569:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2573:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalIoTDevice.g:2574:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Device__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalIoTDevice.g:2581:1: rule__Device__Group__1__Impl : ( 'device' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2585:1: ( ( 'device' ) )
            // InternalIoTDevice.g:2586:1: ( 'device' )
            {
            // InternalIoTDevice.g:2586:1: ( 'device' )
            // InternalIoTDevice.g:2587:1: 'device'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDeviceKeyword_1()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDeviceKeyword_1()); 
            }

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
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalIoTDevice.g:2600:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2604:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalIoTDevice.g:2605:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Device__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Device__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalIoTDevice.g:2612:1: rule__Device__Group__2__Impl : ( ( rule__Device__NameAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2616:1: ( ( ( rule__Device__NameAssignment_2 ) ) )
            // InternalIoTDevice.g:2617:1: ( ( rule__Device__NameAssignment_2 ) )
            {
            // InternalIoTDevice.g:2617:1: ( ( rule__Device__NameAssignment_2 ) )
            // InternalIoTDevice.g:2618:1: ( rule__Device__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getNameAssignment_2()); 
            }
            // InternalIoTDevice.g:2619:1: ( rule__Device__NameAssignment_2 )
            // InternalIoTDevice.g:2619:2: rule__Device__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Device__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalIoTDevice.g:2629:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2633:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalIoTDevice.g:2634:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Device__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Device__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalIoTDevice.g:2641:1: rule__Device__Group__3__Impl : ( '{' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2645:1: ( ( '{' ) )
            // InternalIoTDevice.g:2646:1: ( '{' )
            {
            // InternalIoTDevice.g:2646:1: ( '{' )
            // InternalIoTDevice.g:2647:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalIoTDevice.g:2660:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2664:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalIoTDevice.g:2665:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__Device__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Device__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalIoTDevice.g:2672:1: rule__Device__Group__4__Impl : ( ( rule__Device__FeaturesAssignment_4 )* ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2676:1: ( ( ( rule__Device__FeaturesAssignment_4 )* ) )
            // InternalIoTDevice.g:2677:1: ( ( rule__Device__FeaturesAssignment_4 )* )
            {
            // InternalIoTDevice.g:2677:1: ( ( rule__Device__FeaturesAssignment_4 )* )
            // InternalIoTDevice.g:2678:1: ( rule__Device__FeaturesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getFeaturesAssignment_4()); 
            }
            // InternalIoTDevice.g:2679:1: ( rule__Device__FeaturesAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35||LA21_0==37||LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIoTDevice.g:2679:2: rule__Device__FeaturesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    rule__Device__FeaturesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getFeaturesAssignment_4()); 
            }

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
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalIoTDevice.g:2689:1: rule__Device__Group__5 : rule__Device__Group__5__Impl ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2693:1: ( rule__Device__Group__5__Impl )
            // InternalIoTDevice.g:2694:2: rule__Device__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Device__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalIoTDevice.g:2700:1: rule__Device__Group__5__Impl : ( '}' ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2704:1: ( ( '}' ) )
            // InternalIoTDevice.g:2705:1: ( '}' )
            {
            // InternalIoTDevice.g:2705:1: ( '}' )
            // InternalIoTDevice.g:2706:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_5()); 
            }

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
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalIoTDevice.g:2731:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2735:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalIoTDevice.g:2736:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalIoTDevice.g:2743:1: rule__Property__Group__0__Impl : ( 'property' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2747:1: ( ( 'property' ) )
            // InternalIoTDevice.g:2748:1: ( 'property' )
            {
            // InternalIoTDevice.g:2748:1: ( 'property' )
            // InternalIoTDevice.g:2749:1: 'property'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            }

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
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalIoTDevice.g:2762:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2766:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalIoTDevice.g:2767:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalIoTDevice.g:2774:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2778:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:2779:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:2779:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalIoTDevice.g:2780:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:2781:1: ( rule__Property__NameAssignment_1 )
            // InternalIoTDevice.g:2781:2: rule__Property__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalIoTDevice.g:2791:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2795:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalIoTDevice.g:2796:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalIoTDevice.g:2803:1: rule__Property__Group__2__Impl : ( ':' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2807:1: ( ( ':' ) )
            // InternalIoTDevice.g:2808:1: ( ':' )
            {
            // InternalIoTDevice.g:2808:1: ( ':' )
            // InternalIoTDevice.g:2809:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            }

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
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalIoTDevice.g:2822:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2826:1: ( rule__Property__Group__3__Impl )
            // InternalIoTDevice.g:2827:2: rule__Property__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalIoTDevice.g:2833:1: rule__Property__Group__3__Impl : ( ( rule__Property__TypeAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2837:1: ( ( ( rule__Property__TypeAssignment_3 ) ) )
            // InternalIoTDevice.g:2838:1: ( ( rule__Property__TypeAssignment_3 ) )
            {
            // InternalIoTDevice.g:2838:1: ( ( rule__Property__TypeAssignment_3 ) )
            // InternalIoTDevice.g:2839:1: ( rule__Property__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            }
            // InternalIoTDevice.g:2840:1: ( rule__Property__TypeAssignment_3 )
            // InternalIoTDevice.g:2840:2: rule__Property__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Property__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            }

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
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Sensing__Group__0"
    // InternalIoTDevice.g:2858:1: rule__Sensing__Group__0 : rule__Sensing__Group__0__Impl rule__Sensing__Group__1 ;
    public final void rule__Sensing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2862:1: ( rule__Sensing__Group__0__Impl rule__Sensing__Group__1 )
            // InternalIoTDevice.g:2863:2: rule__Sensing__Group__0__Impl rule__Sensing__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Sensing__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group__0"


    // $ANTLR start "rule__Sensing__Group__0__Impl"
    // InternalIoTDevice.g:2870:1: rule__Sensing__Group__0__Impl : ( () ) ;
    public final void rule__Sensing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2874:1: ( ( () ) )
            // InternalIoTDevice.g:2875:1: ( () )
            {
            // InternalIoTDevice.g:2875:1: ( () )
            // InternalIoTDevice.g:2876:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getSensingAction_0()); 
            }
            // InternalIoTDevice.g:2877:1: ()
            // InternalIoTDevice.g:2879:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getSensingAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensing__Group__0__Impl"


    // $ANTLR start "rule__Sensing__Group__1"
    // InternalIoTDevice.g:2889:1: rule__Sensing__Group__1 : rule__Sensing__Group__1__Impl rule__Sensing__Group__2 ;
    public final void rule__Sensing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2893:1: ( rule__Sensing__Group__1__Impl rule__Sensing__Group__2 )
            // InternalIoTDevice.g:2894:2: rule__Sensing__Group__1__Impl rule__Sensing__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Sensing__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group__1"


    // $ANTLR start "rule__Sensing__Group__1__Impl"
    // InternalIoTDevice.g:2901:1: rule__Sensing__Group__1__Impl : ( 'sensing' ) ;
    public final void rule__Sensing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2905:1: ( ( 'sensing' ) )
            // InternalIoTDevice.g:2906:1: ( 'sensing' )
            {
            // InternalIoTDevice.g:2906:1: ( 'sensing' )
            // InternalIoTDevice.g:2907:1: 'sensing'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getSensingKeyword_1()); 
            }
            match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getSensingKeyword_1()); 
            }

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
    // $ANTLR end "rule__Sensing__Group__1__Impl"


    // $ANTLR start "rule__Sensing__Group__2"
    // InternalIoTDevice.g:2920:1: rule__Sensing__Group__2 : rule__Sensing__Group__2__Impl rule__Sensing__Group__3 ;
    public final void rule__Sensing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2924:1: ( rule__Sensing__Group__2__Impl rule__Sensing__Group__3 )
            // InternalIoTDevice.g:2925:2: rule__Sensing__Group__2__Impl rule__Sensing__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__Sensing__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group__2"


    // $ANTLR start "rule__Sensing__Group__2__Impl"
    // InternalIoTDevice.g:2932:1: rule__Sensing__Group__2__Impl : ( ( rule__Sensing__NameAssignment_2 ) ) ;
    public final void rule__Sensing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2936:1: ( ( ( rule__Sensing__NameAssignment_2 ) ) )
            // InternalIoTDevice.g:2937:1: ( ( rule__Sensing__NameAssignment_2 ) )
            {
            // InternalIoTDevice.g:2937:1: ( ( rule__Sensing__NameAssignment_2 ) )
            // InternalIoTDevice.g:2938:1: ( rule__Sensing__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getNameAssignment_2()); 
            }
            // InternalIoTDevice.g:2939:1: ( rule__Sensing__NameAssignment_2 )
            // InternalIoTDevice.g:2939:2: rule__Sensing__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Sensing__Group__2__Impl"


    // $ANTLR start "rule__Sensing__Group__3"
    // InternalIoTDevice.g:2949:1: rule__Sensing__Group__3 : rule__Sensing__Group__3__Impl rule__Sensing__Group__4 ;
    public final void rule__Sensing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2953:1: ( rule__Sensing__Group__3__Impl rule__Sensing__Group__4 )
            // InternalIoTDevice.g:2954:2: rule__Sensing__Group__3__Impl rule__Sensing__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Sensing__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group__3"


    // $ANTLR start "rule__Sensing__Group__3__Impl"
    // InternalIoTDevice.g:2961:1: rule__Sensing__Group__3__Impl : ( '(' ) ;
    public final void rule__Sensing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2965:1: ( ( '(' ) )
            // InternalIoTDevice.g:2966:1: ( '(' )
            {
            // InternalIoTDevice.g:2966:1: ( '(' )
            // InternalIoTDevice.g:2967:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getLeftParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__Sensing__Group__3__Impl"


    // $ANTLR start "rule__Sensing__Group__4"
    // InternalIoTDevice.g:2980:1: rule__Sensing__Group__4 : rule__Sensing__Group__4__Impl rule__Sensing__Group__5 ;
    public final void rule__Sensing__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2984:1: ( rule__Sensing__Group__4__Impl rule__Sensing__Group__5 )
            // InternalIoTDevice.g:2985:2: rule__Sensing__Group__4__Impl rule__Sensing__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Sensing__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group__4"


    // $ANTLR start "rule__Sensing__Group__4__Impl"
    // InternalIoTDevice.g:2992:1: rule__Sensing__Group__4__Impl : ( ( rule__Sensing__Group_4__0 )? ) ;
    public final void rule__Sensing__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:2996:1: ( ( ( rule__Sensing__Group_4__0 )? ) )
            // InternalIoTDevice.g:2997:1: ( ( rule__Sensing__Group_4__0 )? )
            {
            // InternalIoTDevice.g:2997:1: ( ( rule__Sensing__Group_4__0 )? )
            // InternalIoTDevice.g:2998:1: ( rule__Sensing__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getGroup_4()); 
            }
            // InternalIoTDevice.g:2999:1: ( rule__Sensing__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalIoTDevice.g:2999:2: rule__Sensing__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Sensing__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__Sensing__Group__4__Impl"


    // $ANTLR start "rule__Sensing__Group__5"
    // InternalIoTDevice.g:3009:1: rule__Sensing__Group__5 : rule__Sensing__Group__5__Impl ;
    public final void rule__Sensing__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3013:1: ( rule__Sensing__Group__5__Impl )
            // InternalIoTDevice.g:3014:2: rule__Sensing__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group__5"


    // $ANTLR start "rule__Sensing__Group__5__Impl"
    // InternalIoTDevice.g:3020:1: rule__Sensing__Group__5__Impl : ( ')' ) ;
    public final void rule__Sensing__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3024:1: ( ( ')' ) )
            // InternalIoTDevice.g:3025:1: ( ')' )
            {
            // InternalIoTDevice.g:3025:1: ( ')' )
            // InternalIoTDevice.g:3026:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getRightParenthesisKeyword_5()); 
            }

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
    // $ANTLR end "rule__Sensing__Group__5__Impl"


    // $ANTLR start "rule__Sensing__Group_4__0"
    // InternalIoTDevice.g:3051:1: rule__Sensing__Group_4__0 : rule__Sensing__Group_4__0__Impl rule__Sensing__Group_4__1 ;
    public final void rule__Sensing__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3055:1: ( rule__Sensing__Group_4__0__Impl rule__Sensing__Group_4__1 )
            // InternalIoTDevice.g:3056:2: rule__Sensing__Group_4__0__Impl rule__Sensing__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Sensing__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group_4__0"


    // $ANTLR start "rule__Sensing__Group_4__0__Impl"
    // InternalIoTDevice.g:3063:1: rule__Sensing__Group_4__0__Impl : ( ( rule__Sensing__ParametersAssignment_4_0 ) ) ;
    public final void rule__Sensing__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3067:1: ( ( ( rule__Sensing__ParametersAssignment_4_0 ) ) )
            // InternalIoTDevice.g:3068:1: ( ( rule__Sensing__ParametersAssignment_4_0 ) )
            {
            // InternalIoTDevice.g:3068:1: ( ( rule__Sensing__ParametersAssignment_4_0 ) )
            // InternalIoTDevice.g:3069:1: ( rule__Sensing__ParametersAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getParametersAssignment_4_0()); 
            }
            // InternalIoTDevice.g:3070:1: ( rule__Sensing__ParametersAssignment_4_0 )
            // InternalIoTDevice.g:3070:2: rule__Sensing__ParametersAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__ParametersAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getParametersAssignment_4_0()); 
            }

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
    // $ANTLR end "rule__Sensing__Group_4__0__Impl"


    // $ANTLR start "rule__Sensing__Group_4__1"
    // InternalIoTDevice.g:3080:1: rule__Sensing__Group_4__1 : rule__Sensing__Group_4__1__Impl ;
    public final void rule__Sensing__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3084:1: ( rule__Sensing__Group_4__1__Impl )
            // InternalIoTDevice.g:3085:2: rule__Sensing__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group_4__1"


    // $ANTLR start "rule__Sensing__Group_4__1__Impl"
    // InternalIoTDevice.g:3091:1: rule__Sensing__Group_4__1__Impl : ( ( rule__Sensing__Group_4_1__0 )* ) ;
    public final void rule__Sensing__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3095:1: ( ( ( rule__Sensing__Group_4_1__0 )* ) )
            // InternalIoTDevice.g:3096:1: ( ( rule__Sensing__Group_4_1__0 )* )
            {
            // InternalIoTDevice.g:3096:1: ( ( rule__Sensing__Group_4_1__0 )* )
            // InternalIoTDevice.g:3097:1: ( rule__Sensing__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getGroup_4_1()); 
            }
            // InternalIoTDevice.g:3098:1: ( rule__Sensing__Group_4_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalIoTDevice.g:3098:2: rule__Sensing__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__Sensing__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getGroup_4_1()); 
            }

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
    // $ANTLR end "rule__Sensing__Group_4__1__Impl"


    // $ANTLR start "rule__Sensing__Group_4_1__0"
    // InternalIoTDevice.g:3112:1: rule__Sensing__Group_4_1__0 : rule__Sensing__Group_4_1__0__Impl rule__Sensing__Group_4_1__1 ;
    public final void rule__Sensing__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3116:1: ( rule__Sensing__Group_4_1__0__Impl rule__Sensing__Group_4_1__1 )
            // InternalIoTDevice.g:3117:2: rule__Sensing__Group_4_1__0__Impl rule__Sensing__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Sensing__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group_4_1__0"


    // $ANTLR start "rule__Sensing__Group_4_1__0__Impl"
    // InternalIoTDevice.g:3124:1: rule__Sensing__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Sensing__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3128:1: ( ( ',' ) )
            // InternalIoTDevice.g:3129:1: ( ',' )
            {
            // InternalIoTDevice.g:3129:1: ( ',' )
            // InternalIoTDevice.g:3130:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getCommaKeyword_4_1_0()); 
            }

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
    // $ANTLR end "rule__Sensing__Group_4_1__0__Impl"


    // $ANTLR start "rule__Sensing__Group_4_1__1"
    // InternalIoTDevice.g:3143:1: rule__Sensing__Group_4_1__1 : rule__Sensing__Group_4_1__1__Impl ;
    public final void rule__Sensing__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3147:1: ( rule__Sensing__Group_4_1__1__Impl )
            // InternalIoTDevice.g:3148:2: rule__Sensing__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Sensing__Group_4_1__1"


    // $ANTLR start "rule__Sensing__Group_4_1__1__Impl"
    // InternalIoTDevice.g:3154:1: rule__Sensing__Group_4_1__1__Impl : ( ( rule__Sensing__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__Sensing__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3158:1: ( ( ( rule__Sensing__ParametersAssignment_4_1_1 ) ) )
            // InternalIoTDevice.g:3159:1: ( ( rule__Sensing__ParametersAssignment_4_1_1 ) )
            {
            // InternalIoTDevice.g:3159:1: ( ( rule__Sensing__ParametersAssignment_4_1_1 ) )
            // InternalIoTDevice.g:3160:1: ( rule__Sensing__ParametersAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getParametersAssignment_4_1_1()); 
            }
            // InternalIoTDevice.g:3161:1: ( rule__Sensing__ParametersAssignment_4_1_1 )
            // InternalIoTDevice.g:3161:2: rule__Sensing__ParametersAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Sensing__ParametersAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getParametersAssignment_4_1_1()); 
            }

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
    // $ANTLR end "rule__Sensing__Group_4_1__1__Impl"


    // $ANTLR start "rule__Actuating__Group__0"
    // InternalIoTDevice.g:3175:1: rule__Actuating__Group__0 : rule__Actuating__Group__0__Impl rule__Actuating__Group__1 ;
    public final void rule__Actuating__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3179:1: ( rule__Actuating__Group__0__Impl rule__Actuating__Group__1 )
            // InternalIoTDevice.g:3180:2: rule__Actuating__Group__0__Impl rule__Actuating__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Actuating__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group__0"


    // $ANTLR start "rule__Actuating__Group__0__Impl"
    // InternalIoTDevice.g:3187:1: rule__Actuating__Group__0__Impl : ( () ) ;
    public final void rule__Actuating__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3191:1: ( ( () ) )
            // InternalIoTDevice.g:3192:1: ( () )
            {
            // InternalIoTDevice.g:3192:1: ( () )
            // InternalIoTDevice.g:3193:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getActuatingAction_0()); 
            }
            // InternalIoTDevice.g:3194:1: ()
            // InternalIoTDevice.g:3196:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getActuatingAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuating__Group__0__Impl"


    // $ANTLR start "rule__Actuating__Group__1"
    // InternalIoTDevice.g:3206:1: rule__Actuating__Group__1 : rule__Actuating__Group__1__Impl rule__Actuating__Group__2 ;
    public final void rule__Actuating__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3210:1: ( rule__Actuating__Group__1__Impl rule__Actuating__Group__2 )
            // InternalIoTDevice.g:3211:2: rule__Actuating__Group__1__Impl rule__Actuating__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Actuating__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group__1"


    // $ANTLR start "rule__Actuating__Group__1__Impl"
    // InternalIoTDevice.g:3218:1: rule__Actuating__Group__1__Impl : ( 'actuating' ) ;
    public final void rule__Actuating__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3222:1: ( ( 'actuating' ) )
            // InternalIoTDevice.g:3223:1: ( 'actuating' )
            {
            // InternalIoTDevice.g:3223:1: ( 'actuating' )
            // InternalIoTDevice.g:3224:1: 'actuating'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getActuatingKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getActuatingKeyword_1()); 
            }

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
    // $ANTLR end "rule__Actuating__Group__1__Impl"


    // $ANTLR start "rule__Actuating__Group__2"
    // InternalIoTDevice.g:3237:1: rule__Actuating__Group__2 : rule__Actuating__Group__2__Impl rule__Actuating__Group__3 ;
    public final void rule__Actuating__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3241:1: ( rule__Actuating__Group__2__Impl rule__Actuating__Group__3 )
            // InternalIoTDevice.g:3242:2: rule__Actuating__Group__2__Impl rule__Actuating__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__Actuating__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group__2"


    // $ANTLR start "rule__Actuating__Group__2__Impl"
    // InternalIoTDevice.g:3249:1: rule__Actuating__Group__2__Impl : ( ( rule__Actuating__NameAssignment_2 ) ) ;
    public final void rule__Actuating__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3253:1: ( ( ( rule__Actuating__NameAssignment_2 ) ) )
            // InternalIoTDevice.g:3254:1: ( ( rule__Actuating__NameAssignment_2 ) )
            {
            // InternalIoTDevice.g:3254:1: ( ( rule__Actuating__NameAssignment_2 ) )
            // InternalIoTDevice.g:3255:1: ( rule__Actuating__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getNameAssignment_2()); 
            }
            // InternalIoTDevice.g:3256:1: ( rule__Actuating__NameAssignment_2 )
            // InternalIoTDevice.g:3256:2: rule__Actuating__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__Actuating__Group__2__Impl"


    // $ANTLR start "rule__Actuating__Group__3"
    // InternalIoTDevice.g:3266:1: rule__Actuating__Group__3 : rule__Actuating__Group__3__Impl rule__Actuating__Group__4 ;
    public final void rule__Actuating__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3270:1: ( rule__Actuating__Group__3__Impl rule__Actuating__Group__4 )
            // InternalIoTDevice.g:3271:2: rule__Actuating__Group__3__Impl rule__Actuating__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Actuating__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group__3"


    // $ANTLR start "rule__Actuating__Group__3__Impl"
    // InternalIoTDevice.g:3278:1: rule__Actuating__Group__3__Impl : ( '(' ) ;
    public final void rule__Actuating__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3282:1: ( ( '(' ) )
            // InternalIoTDevice.g:3283:1: ( '(' )
            {
            // InternalIoTDevice.g:3283:1: ( '(' )
            // InternalIoTDevice.g:3284:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getLeftParenthesisKeyword_3()); 
            }

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
    // $ANTLR end "rule__Actuating__Group__3__Impl"


    // $ANTLR start "rule__Actuating__Group__4"
    // InternalIoTDevice.g:3297:1: rule__Actuating__Group__4 : rule__Actuating__Group__4__Impl rule__Actuating__Group__5 ;
    public final void rule__Actuating__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3301:1: ( rule__Actuating__Group__4__Impl rule__Actuating__Group__5 )
            // InternalIoTDevice.g:3302:2: rule__Actuating__Group__4__Impl rule__Actuating__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Actuating__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group__4"


    // $ANTLR start "rule__Actuating__Group__4__Impl"
    // InternalIoTDevice.g:3309:1: rule__Actuating__Group__4__Impl : ( ( rule__Actuating__Group_4__0 )? ) ;
    public final void rule__Actuating__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3313:1: ( ( ( rule__Actuating__Group_4__0 )? ) )
            // InternalIoTDevice.g:3314:1: ( ( rule__Actuating__Group_4__0 )? )
            {
            // InternalIoTDevice.g:3314:1: ( ( rule__Actuating__Group_4__0 )? )
            // InternalIoTDevice.g:3315:1: ( rule__Actuating__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getGroup_4()); 
            }
            // InternalIoTDevice.g:3316:1: ( rule__Actuating__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalIoTDevice.g:3316:2: rule__Actuating__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Actuating__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__Actuating__Group__4__Impl"


    // $ANTLR start "rule__Actuating__Group__5"
    // InternalIoTDevice.g:3326:1: rule__Actuating__Group__5 : rule__Actuating__Group__5__Impl ;
    public final void rule__Actuating__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3330:1: ( rule__Actuating__Group__5__Impl )
            // InternalIoTDevice.g:3331:2: rule__Actuating__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group__5"


    // $ANTLR start "rule__Actuating__Group__5__Impl"
    // InternalIoTDevice.g:3337:1: rule__Actuating__Group__5__Impl : ( ')' ) ;
    public final void rule__Actuating__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3341:1: ( ( ')' ) )
            // InternalIoTDevice.g:3342:1: ( ')' )
            {
            // InternalIoTDevice.g:3342:1: ( ')' )
            // InternalIoTDevice.g:3343:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getRightParenthesisKeyword_5()); 
            }

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
    // $ANTLR end "rule__Actuating__Group__5__Impl"


    // $ANTLR start "rule__Actuating__Group_4__0"
    // InternalIoTDevice.g:3368:1: rule__Actuating__Group_4__0 : rule__Actuating__Group_4__0__Impl rule__Actuating__Group_4__1 ;
    public final void rule__Actuating__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3372:1: ( rule__Actuating__Group_4__0__Impl rule__Actuating__Group_4__1 )
            // InternalIoTDevice.g:3373:2: rule__Actuating__Group_4__0__Impl rule__Actuating__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Actuating__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group_4__0"


    // $ANTLR start "rule__Actuating__Group_4__0__Impl"
    // InternalIoTDevice.g:3380:1: rule__Actuating__Group_4__0__Impl : ( ( rule__Actuating__ParametersAssignment_4_0 ) ) ;
    public final void rule__Actuating__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3384:1: ( ( ( rule__Actuating__ParametersAssignment_4_0 ) ) )
            // InternalIoTDevice.g:3385:1: ( ( rule__Actuating__ParametersAssignment_4_0 ) )
            {
            // InternalIoTDevice.g:3385:1: ( ( rule__Actuating__ParametersAssignment_4_0 ) )
            // InternalIoTDevice.g:3386:1: ( rule__Actuating__ParametersAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getParametersAssignment_4_0()); 
            }
            // InternalIoTDevice.g:3387:1: ( rule__Actuating__ParametersAssignment_4_0 )
            // InternalIoTDevice.g:3387:2: rule__Actuating__ParametersAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__ParametersAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getParametersAssignment_4_0()); 
            }

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
    // $ANTLR end "rule__Actuating__Group_4__0__Impl"


    // $ANTLR start "rule__Actuating__Group_4__1"
    // InternalIoTDevice.g:3397:1: rule__Actuating__Group_4__1 : rule__Actuating__Group_4__1__Impl ;
    public final void rule__Actuating__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3401:1: ( rule__Actuating__Group_4__1__Impl )
            // InternalIoTDevice.g:3402:2: rule__Actuating__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group_4__1"


    // $ANTLR start "rule__Actuating__Group_4__1__Impl"
    // InternalIoTDevice.g:3408:1: rule__Actuating__Group_4__1__Impl : ( ( rule__Actuating__Group_4_1__0 )* ) ;
    public final void rule__Actuating__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3412:1: ( ( ( rule__Actuating__Group_4_1__0 )* ) )
            // InternalIoTDevice.g:3413:1: ( ( rule__Actuating__Group_4_1__0 )* )
            {
            // InternalIoTDevice.g:3413:1: ( ( rule__Actuating__Group_4_1__0 )* )
            // InternalIoTDevice.g:3414:1: ( rule__Actuating__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getGroup_4_1()); 
            }
            // InternalIoTDevice.g:3415:1: ( rule__Actuating__Group_4_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalIoTDevice.g:3415:2: rule__Actuating__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__Actuating__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getGroup_4_1()); 
            }

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
    // $ANTLR end "rule__Actuating__Group_4__1__Impl"


    // $ANTLR start "rule__Actuating__Group_4_1__0"
    // InternalIoTDevice.g:3429:1: rule__Actuating__Group_4_1__0 : rule__Actuating__Group_4_1__0__Impl rule__Actuating__Group_4_1__1 ;
    public final void rule__Actuating__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3433:1: ( rule__Actuating__Group_4_1__0__Impl rule__Actuating__Group_4_1__1 )
            // InternalIoTDevice.g:3434:2: rule__Actuating__Group_4_1__0__Impl rule__Actuating__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Actuating__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group_4_1__0"


    // $ANTLR start "rule__Actuating__Group_4_1__0__Impl"
    // InternalIoTDevice.g:3441:1: rule__Actuating__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Actuating__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3445:1: ( ( ',' ) )
            // InternalIoTDevice.g:3446:1: ( ',' )
            {
            // InternalIoTDevice.g:3446:1: ( ',' )
            // InternalIoTDevice.g:3447:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getCommaKeyword_4_1_0()); 
            }

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
    // $ANTLR end "rule__Actuating__Group_4_1__0__Impl"


    // $ANTLR start "rule__Actuating__Group_4_1__1"
    // InternalIoTDevice.g:3460:1: rule__Actuating__Group_4_1__1 : rule__Actuating__Group_4_1__1__Impl ;
    public final void rule__Actuating__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3464:1: ( rule__Actuating__Group_4_1__1__Impl )
            // InternalIoTDevice.g:3465:2: rule__Actuating__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Actuating__Group_4_1__1"


    // $ANTLR start "rule__Actuating__Group_4_1__1__Impl"
    // InternalIoTDevice.g:3471:1: rule__Actuating__Group_4_1__1__Impl : ( ( rule__Actuating__ParametersAssignment_4_1_1 ) ) ;
    public final void rule__Actuating__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3475:1: ( ( ( rule__Actuating__ParametersAssignment_4_1_1 ) ) )
            // InternalIoTDevice.g:3476:1: ( ( rule__Actuating__ParametersAssignment_4_1_1 ) )
            {
            // InternalIoTDevice.g:3476:1: ( ( rule__Actuating__ParametersAssignment_4_1_1 ) )
            // InternalIoTDevice.g:3477:1: ( rule__Actuating__ParametersAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getParametersAssignment_4_1_1()); 
            }
            // InternalIoTDevice.g:3478:1: ( rule__Actuating__ParametersAssignment_4_1_1 )
            // InternalIoTDevice.g:3478:2: rule__Actuating__ParametersAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Actuating__ParametersAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getParametersAssignment_4_1_1()); 
            }

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
    // $ANTLR end "rule__Actuating__Group_4_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalIoTDevice.g:3492:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3496:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalIoTDevice.g:3497:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalIoTDevice.g:3504:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3508:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalIoTDevice.g:3509:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalIoTDevice.g:3509:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalIoTDevice.g:3510:1: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // InternalIoTDevice.g:3511:1: ( rule__Parameter__NameAssignment_0 )
            // InternalIoTDevice.g:3511:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalIoTDevice.g:3521:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3525:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalIoTDevice.g:3526:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalIoTDevice.g:3533:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3537:1: ( ( ':' ) )
            // InternalIoTDevice.g:3538:1: ( ':' )
            {
            // InternalIoTDevice.g:3538:1: ( ':' )
            // InternalIoTDevice.g:3539:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalIoTDevice.g:3552:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3556:1: ( rule__Parameter__Group__2__Impl )
            // InternalIoTDevice.g:3557:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalIoTDevice.g:3563:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3567:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalIoTDevice.g:3568:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalIoTDevice.g:3568:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalIoTDevice.g:3569:1: ( rule__Parameter__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }
            // InternalIoTDevice.g:3570:1: ( rule__Parameter__TypeAssignment_2 )
            // InternalIoTDevice.g:3570:2: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__IntegerType__Group__0"
    // InternalIoTDevice.g:3586:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3590:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalIoTDevice.g:3591:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__IntegerType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IntegerType__Group__0"


    // $ANTLR start "rule__IntegerType__Group__0__Impl"
    // InternalIoTDevice.g:3598:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3602:1: ( ( () ) )
            // InternalIoTDevice.g:3603:1: ( () )
            {
            // InternalIoTDevice.g:3603:1: ( () )
            // InternalIoTDevice.g:3604:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            }
            // InternalIoTDevice.g:3605:1: ()
            // InternalIoTDevice.g:3607:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0__Impl"


    // $ANTLR start "rule__IntegerType__Group__1"
    // InternalIoTDevice.g:3617:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3621:1: ( rule__IntegerType__Group__1__Impl )
            // InternalIoTDevice.g:3622:2: rule__IntegerType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__IntegerType__Group__1"


    // $ANTLR start "rule__IntegerType__Group__1__Impl"
    // InternalIoTDevice.g:3628:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__NameAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3632:1: ( ( ( rule__IntegerType__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:3633:1: ( ( rule__IntegerType__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:3633:1: ( ( rule__IntegerType__NameAssignment_1 ) )
            // InternalIoTDevice.g:3634:1: ( rule__IntegerType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:3635:1: ( rule__IntegerType__NameAssignment_1 )
            // InternalIoTDevice.g:3635:2: rule__IntegerType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerTypeAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__IntegerType__Group__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // InternalIoTDevice.g:3649:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3653:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalIoTDevice.g:3654:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // InternalIoTDevice.g:3661:1: rule__BooleanType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3665:1: ( ( () ) )
            // InternalIoTDevice.g:3666:1: ( () )
            {
            // InternalIoTDevice.g:3666:1: ( () )
            // InternalIoTDevice.g:3667:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            }
            // InternalIoTDevice.g:3668:1: ()
            // InternalIoTDevice.g:3670:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // InternalIoTDevice.g:3680:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3684:1: ( rule__BooleanType__Group__1__Impl )
            // InternalIoTDevice.g:3685:2: rule__BooleanType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // InternalIoTDevice.g:3691:1: rule__BooleanType__Group__1__Impl : ( ( rule__BooleanType__NameAssignment_1 ) ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3695:1: ( ( ( rule__BooleanType__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:3696:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:3696:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            // InternalIoTDevice.g:3697:1: ( rule__BooleanType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:3698:1: ( rule__BooleanType__NameAssignment_1 )
            // InternalIoTDevice.g:3698:2: rule__BooleanType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanTypeAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__BooleanType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalIoTDevice.g:3712:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3716:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalIoTDevice.g:3717:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__StringType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalIoTDevice.g:3724:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3728:1: ( ( () ) )
            // InternalIoTDevice.g:3729:1: ( () )
            {
            // InternalIoTDevice.g:3729:1: ( () )
            // InternalIoTDevice.g:3730:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            }
            // InternalIoTDevice.g:3731:1: ()
            // InternalIoTDevice.g:3733:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalIoTDevice.g:3743:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3747:1: ( rule__StringType__Group__1__Impl )
            // InternalIoTDevice.g:3748:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalIoTDevice.g:3754:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__NameAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3758:1: ( ( ( rule__StringType__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:3759:1: ( ( rule__StringType__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:3759:1: ( ( rule__StringType__NameAssignment_1 ) )
            // InternalIoTDevice.g:3760:1: ( rule__StringType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:3761:1: ( rule__StringType__NameAssignment_1 )
            // InternalIoTDevice.g:3761:2: rule__StringType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__RealType__Group__0"
    // InternalIoTDevice.g:3775:1: rule__RealType__Group__0 : rule__RealType__Group__0__Impl rule__RealType__Group__1 ;
    public final void rule__RealType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3779:1: ( rule__RealType__Group__0__Impl rule__RealType__Group__1 )
            // InternalIoTDevice.g:3780:2: rule__RealType__Group__0__Impl rule__RealType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__RealType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RealType__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RealType__Group__0"


    // $ANTLR start "rule__RealType__Group__0__Impl"
    // InternalIoTDevice.g:3787:1: rule__RealType__Group__0__Impl : ( () ) ;
    public final void rule__RealType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3791:1: ( ( () ) )
            // InternalIoTDevice.g:3792:1: ( () )
            {
            // InternalIoTDevice.g:3792:1: ( () )
            // InternalIoTDevice.g:3793:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getRealTypeAction_0()); 
            }
            // InternalIoTDevice.g:3794:1: ()
            // InternalIoTDevice.g:3796:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealTypeAccess().getRealTypeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealType__Group__0__Impl"


    // $ANTLR start "rule__RealType__Group__1"
    // InternalIoTDevice.g:3806:1: rule__RealType__Group__1 : rule__RealType__Group__1__Impl ;
    public final void rule__RealType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3810:1: ( rule__RealType__Group__1__Impl )
            // InternalIoTDevice.g:3811:2: rule__RealType__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RealType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RealType__Group__1"


    // $ANTLR start "rule__RealType__Group__1__Impl"
    // InternalIoTDevice.g:3817:1: rule__RealType__Group__1__Impl : ( ( rule__RealType__NameAssignment_1 ) ) ;
    public final void rule__RealType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3821:1: ( ( ( rule__RealType__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:3822:1: ( ( rule__RealType__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:3822:1: ( ( rule__RealType__NameAssignment_1 ) )
            // InternalIoTDevice.g:3823:1: ( rule__RealType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:3824:1: ( rule__RealType__NameAssignment_1 )
            // InternalIoTDevice.g:3824:2: rule__RealType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RealType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealTypeAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__RealType__Group__1__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__0"
    // InternalIoTDevice.g:3838:1: rule__NetworkConfiguration__Group__0 : rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 ;
    public final void rule__NetworkConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3842:1: ( rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1 )
            // InternalIoTDevice.g:3843:2: rule__NetworkConfiguration__Group__0__Impl rule__NetworkConfiguration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__NetworkConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NetworkConfiguration__Group__0"


    // $ANTLR start "rule__NetworkConfiguration__Group__0__Impl"
    // InternalIoTDevice.g:3850:1: rule__NetworkConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__NetworkConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3854:1: ( ( () ) )
            // InternalIoTDevice.g:3855:1: ( () )
            {
            // InternalIoTDevice.g:3855:1: ( () )
            // InternalIoTDevice.g:3856:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationAction_0()); 
            }
            // InternalIoTDevice.g:3857:1: ()
            // InternalIoTDevice.g:3859:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getNetworkConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConfiguration__Group__0__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__1"
    // InternalIoTDevice.g:3869:1: rule__NetworkConfiguration__Group__1 : rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 ;
    public final void rule__NetworkConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3873:1: ( rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2 )
            // InternalIoTDevice.g:3874:2: rule__NetworkConfiguration__Group__1__Impl rule__NetworkConfiguration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__NetworkConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NetworkConfiguration__Group__1"


    // $ANTLR start "rule__NetworkConfiguration__Group__1__Impl"
    // InternalIoTDevice.g:3881:1: rule__NetworkConfiguration__Group__1__Impl : ( 'configuration' ) ;
    public final void rule__NetworkConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3885:1: ( ( 'configuration' ) )
            // InternalIoTDevice.g:3886:1: ( 'configuration' )
            {
            // InternalIoTDevice.g:3886:1: ( 'configuration' )
            // InternalIoTDevice.g:3887:1: 'configuration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getConfigurationKeyword_1()); 
            }
            match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getConfigurationKeyword_1()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__Group__1__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__2"
    // InternalIoTDevice.g:3900:1: rule__NetworkConfiguration__Group__2 : rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 ;
    public final void rule__NetworkConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3904:1: ( rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3 )
            // InternalIoTDevice.g:3905:2: rule__NetworkConfiguration__Group__2__Impl rule__NetworkConfiguration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__NetworkConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NetworkConfiguration__Group__2"


    // $ANTLR start "rule__NetworkConfiguration__Group__2__Impl"
    // InternalIoTDevice.g:3912:1: rule__NetworkConfiguration__Group__2__Impl : ( ( rule__NetworkConfiguration__NameAssignment_2 ) ) ;
    public final void rule__NetworkConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3916:1: ( ( ( rule__NetworkConfiguration__NameAssignment_2 ) ) )
            // InternalIoTDevice.g:3917:1: ( ( rule__NetworkConfiguration__NameAssignment_2 ) )
            {
            // InternalIoTDevice.g:3917:1: ( ( rule__NetworkConfiguration__NameAssignment_2 ) )
            // InternalIoTDevice.g:3918:1: ( rule__NetworkConfiguration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_2()); 
            }
            // InternalIoTDevice.g:3919:1: ( rule__NetworkConfiguration__NameAssignment_2 )
            // InternalIoTDevice.g:3919:2: rule__NetworkConfiguration__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getNameAssignment_2()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__Group__2__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__3"
    // InternalIoTDevice.g:3929:1: rule__NetworkConfiguration__Group__3 : rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 ;
    public final void rule__NetworkConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3933:1: ( rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4 )
            // InternalIoTDevice.g:3934:2: rule__NetworkConfiguration__Group__3__Impl rule__NetworkConfiguration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__NetworkConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NetworkConfiguration__Group__3"


    // $ANTLR start "rule__NetworkConfiguration__Group__3__Impl"
    // InternalIoTDevice.g:3941:1: rule__NetworkConfiguration__Group__3__Impl : ( '{' ) ;
    public final void rule__NetworkConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3945:1: ( ( '{' ) )
            // InternalIoTDevice.g:3946:1: ( '{' )
            {
            // InternalIoTDevice.g:3946:1: ( '{' )
            // InternalIoTDevice.g:3947:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getLeftCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__Group__3__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__4"
    // InternalIoTDevice.g:3960:1: rule__NetworkConfiguration__Group__4 : rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 ;
    public final void rule__NetworkConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3964:1: ( rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5 )
            // InternalIoTDevice.g:3965:2: rule__NetworkConfiguration__Group__4__Impl rule__NetworkConfiguration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__NetworkConfiguration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NetworkConfiguration__Group__4"


    // $ANTLR start "rule__NetworkConfiguration__Group__4__Impl"
    // InternalIoTDevice.g:3972:1: rule__NetworkConfiguration__Group__4__Impl : ( ( rule__NetworkConfiguration__NodesAssignment_4 )* ) ;
    public final void rule__NetworkConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3976:1: ( ( ( rule__NetworkConfiguration__NodesAssignment_4 )* ) )
            // InternalIoTDevice.g:3977:1: ( ( rule__NetworkConfiguration__NodesAssignment_4 )* )
            {
            // InternalIoTDevice.g:3977:1: ( ( rule__NetworkConfiguration__NodesAssignment_4 )* )
            // InternalIoTDevice.g:3978:1: ( rule__NetworkConfiguration__NodesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getNodesAssignment_4()); 
            }
            // InternalIoTDevice.g:3979:1: ( rule__NetworkConfiguration__NodesAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==43) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalIoTDevice.g:3979:2: rule__NetworkConfiguration__NodesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    rule__NetworkConfiguration__NodesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getNodesAssignment_4()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__Group__4__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__5"
    // InternalIoTDevice.g:3989:1: rule__NetworkConfiguration__Group__5 : rule__NetworkConfiguration__Group__5__Impl rule__NetworkConfiguration__Group__6 ;
    public final void rule__NetworkConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:3993:1: ( rule__NetworkConfiguration__Group__5__Impl rule__NetworkConfiguration__Group__6 )
            // InternalIoTDevice.g:3994:2: rule__NetworkConfiguration__Group__5__Impl rule__NetworkConfiguration__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__NetworkConfiguration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NetworkConfiguration__Group__5"


    // $ANTLR start "rule__NetworkConfiguration__Group__5__Impl"
    // InternalIoTDevice.g:4001:1: rule__NetworkConfiguration__Group__5__Impl : ( ( rule__NetworkConfiguration__PathsAssignment_5 )* ) ;
    public final void rule__NetworkConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4005:1: ( ( ( rule__NetworkConfiguration__PathsAssignment_5 )* ) )
            // InternalIoTDevice.g:4006:1: ( ( rule__NetworkConfiguration__PathsAssignment_5 )* )
            {
            // InternalIoTDevice.g:4006:1: ( ( rule__NetworkConfiguration__PathsAssignment_5 )* )
            // InternalIoTDevice.g:4007:1: ( rule__NetworkConfiguration__PathsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getPathsAssignment_5()); 
            }
            // InternalIoTDevice.g:4008:1: ( rule__NetworkConfiguration__PathsAssignment_5 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==44) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalIoTDevice.g:4008:2: rule__NetworkConfiguration__PathsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    rule__NetworkConfiguration__PathsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getPathsAssignment_5()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__Group__5__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__6"
    // InternalIoTDevice.g:4018:1: rule__NetworkConfiguration__Group__6 : rule__NetworkConfiguration__Group__6__Impl rule__NetworkConfiguration__Group__7 ;
    public final void rule__NetworkConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4022:1: ( rule__NetworkConfiguration__Group__6__Impl rule__NetworkConfiguration__Group__7 )
            // InternalIoTDevice.g:4023:2: rule__NetworkConfiguration__Group__6__Impl rule__NetworkConfiguration__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__NetworkConfiguration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NetworkConfiguration__Group__6"


    // $ANTLR start "rule__NetworkConfiguration__Group__6__Impl"
    // InternalIoTDevice.g:4030:1: rule__NetworkConfiguration__Group__6__Impl : ( ( rule__NetworkConfiguration__VariablesAssignment_6 )* ) ;
    public final void rule__NetworkConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4034:1: ( ( ( rule__NetworkConfiguration__VariablesAssignment_6 )* ) )
            // InternalIoTDevice.g:4035:1: ( ( rule__NetworkConfiguration__VariablesAssignment_6 )* )
            {
            // InternalIoTDevice.g:4035:1: ( ( rule__NetworkConfiguration__VariablesAssignment_6 )* )
            // InternalIoTDevice.g:4036:1: ( rule__NetworkConfiguration__VariablesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getVariablesAssignment_6()); 
            }
            // InternalIoTDevice.g:4037:1: ( rule__NetworkConfiguration__VariablesAssignment_6 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==47) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalIoTDevice.g:4037:2: rule__NetworkConfiguration__VariablesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    rule__NetworkConfiguration__VariablesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getVariablesAssignment_6()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__Group__6__Impl"


    // $ANTLR start "rule__NetworkConfiguration__Group__7"
    // InternalIoTDevice.g:4047:1: rule__NetworkConfiguration__Group__7 : rule__NetworkConfiguration__Group__7__Impl ;
    public final void rule__NetworkConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4051:1: ( rule__NetworkConfiguration__Group__7__Impl )
            // InternalIoTDevice.g:4052:2: rule__NetworkConfiguration__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NetworkConfiguration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NetworkConfiguration__Group__7"


    // $ANTLR start "rule__NetworkConfiguration__Group__7__Impl"
    // InternalIoTDevice.g:4058:1: rule__NetworkConfiguration__Group__7__Impl : ( '}' ) ;
    public final void rule__NetworkConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4062:1: ( ( '}' ) )
            // InternalIoTDevice.g:4063:1: ( '}' )
            {
            // InternalIoTDevice.g:4063:1: ( '}' )
            // InternalIoTDevice.g:4064:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getRightCurlyBracketKeyword_7()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__Group__7__Impl"


    // $ANTLR start "rule__NodeInstance__Group__0"
    // InternalIoTDevice.g:4093:1: rule__NodeInstance__Group__0 : rule__NodeInstance__Group__0__Impl rule__NodeInstance__Group__1 ;
    public final void rule__NodeInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4097:1: ( rule__NodeInstance__Group__0__Impl rule__NodeInstance__Group__1 )
            // InternalIoTDevice.g:4098:2: rule__NodeInstance__Group__0__Impl rule__NodeInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__NodeInstance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeInstance__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NodeInstance__Group__0"


    // $ANTLR start "rule__NodeInstance__Group__0__Impl"
    // InternalIoTDevice.g:4105:1: rule__NodeInstance__Group__0__Impl : ( 'node' ) ;
    public final void rule__NodeInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4109:1: ( ( 'node' ) )
            // InternalIoTDevice.g:4110:1: ( 'node' )
            {
            // InternalIoTDevice.g:4110:1: ( 'node' )
            // InternalIoTDevice.g:4111:1: 'node'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceAccess().getNodeKeyword_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceAccess().getNodeKeyword_0()); 
            }

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
    // $ANTLR end "rule__NodeInstance__Group__0__Impl"


    // $ANTLR start "rule__NodeInstance__Group__1"
    // InternalIoTDevice.g:4124:1: rule__NodeInstance__Group__1 : rule__NodeInstance__Group__1__Impl rule__NodeInstance__Group__2 ;
    public final void rule__NodeInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4128:1: ( rule__NodeInstance__Group__1__Impl rule__NodeInstance__Group__2 )
            // InternalIoTDevice.g:4129:2: rule__NodeInstance__Group__1__Impl rule__NodeInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__NodeInstance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeInstance__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NodeInstance__Group__1"


    // $ANTLR start "rule__NodeInstance__Group__1__Impl"
    // InternalIoTDevice.g:4136:1: rule__NodeInstance__Group__1__Impl : ( ( rule__NodeInstance__NameAssignment_1 ) ) ;
    public final void rule__NodeInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4140:1: ( ( ( rule__NodeInstance__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:4141:1: ( ( rule__NodeInstance__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:4141:1: ( ( rule__NodeInstance__NameAssignment_1 ) )
            // InternalIoTDevice.g:4142:1: ( rule__NodeInstance__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:4143:1: ( rule__NodeInstance__NameAssignment_1 )
            // InternalIoTDevice.g:4143:2: rule__NodeInstance__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeInstance__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__NodeInstance__Group__1__Impl"


    // $ANTLR start "rule__NodeInstance__Group__2"
    // InternalIoTDevice.g:4153:1: rule__NodeInstance__Group__2 : rule__NodeInstance__Group__2__Impl rule__NodeInstance__Group__3 ;
    public final void rule__NodeInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4157:1: ( rule__NodeInstance__Group__2__Impl rule__NodeInstance__Group__3 )
            // InternalIoTDevice.g:4158:2: rule__NodeInstance__Group__2__Impl rule__NodeInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__NodeInstance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeInstance__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NodeInstance__Group__2"


    // $ANTLR start "rule__NodeInstance__Group__2__Impl"
    // InternalIoTDevice.g:4165:1: rule__NodeInstance__Group__2__Impl : ( ':' ) ;
    public final void rule__NodeInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4169:1: ( ( ':' ) )
            // InternalIoTDevice.g:4170:1: ( ':' )
            {
            // InternalIoTDevice.g:4170:1: ( ':' )
            // InternalIoTDevice.g:4171:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceAccess().getColonKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceAccess().getColonKeyword_2()); 
            }

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
    // $ANTLR end "rule__NodeInstance__Group__2__Impl"


    // $ANTLR start "rule__NodeInstance__Group__3"
    // InternalIoTDevice.g:4184:1: rule__NodeInstance__Group__3 : rule__NodeInstance__Group__3__Impl ;
    public final void rule__NodeInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4188:1: ( rule__NodeInstance__Group__3__Impl )
            // InternalIoTDevice.g:4189:2: rule__NodeInstance__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeInstance__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__NodeInstance__Group__3"


    // $ANTLR start "rule__NodeInstance__Group__3__Impl"
    // InternalIoTDevice.g:4195:1: rule__NodeInstance__Group__3__Impl : ( ( rule__NodeInstance__TypeAssignment_3 ) ) ;
    public final void rule__NodeInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4199:1: ( ( ( rule__NodeInstance__TypeAssignment_3 ) ) )
            // InternalIoTDevice.g:4200:1: ( ( rule__NodeInstance__TypeAssignment_3 ) )
            {
            // InternalIoTDevice.g:4200:1: ( ( rule__NodeInstance__TypeAssignment_3 ) )
            // InternalIoTDevice.g:4201:1: ( rule__NodeInstance__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceAccess().getTypeAssignment_3()); 
            }
            // InternalIoTDevice.g:4202:1: ( rule__NodeInstance__TypeAssignment_3 )
            // InternalIoTDevice.g:4202:2: rule__NodeInstance__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NodeInstance__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceAccess().getTypeAssignment_3()); 
            }

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
    // $ANTLR end "rule__NodeInstance__Group__3__Impl"


    // $ANTLR start "rule__CommunicationPath__Group__0"
    // InternalIoTDevice.g:4220:1: rule__CommunicationPath__Group__0 : rule__CommunicationPath__Group__0__Impl rule__CommunicationPath__Group__1 ;
    public final void rule__CommunicationPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4224:1: ( rule__CommunicationPath__Group__0__Impl rule__CommunicationPath__Group__1 )
            // InternalIoTDevice.g:4225:2: rule__CommunicationPath__Group__0__Impl rule__CommunicationPath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__CommunicationPath__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CommunicationPath__Group__0"


    // $ANTLR start "rule__CommunicationPath__Group__0__Impl"
    // InternalIoTDevice.g:4232:1: rule__CommunicationPath__Group__0__Impl : ( 'from' ) ;
    public final void rule__CommunicationPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4236:1: ( ( 'from' ) )
            // InternalIoTDevice.g:4237:1: ( 'from' )
            {
            // InternalIoTDevice.g:4237:1: ( 'from' )
            // InternalIoTDevice.g:4238:1: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getFromKeyword_0()); 
            }
            match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getFromKeyword_0()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__Group__0__Impl"


    // $ANTLR start "rule__CommunicationPath__Group__1"
    // InternalIoTDevice.g:4251:1: rule__CommunicationPath__Group__1 : rule__CommunicationPath__Group__1__Impl rule__CommunicationPath__Group__2 ;
    public final void rule__CommunicationPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4255:1: ( rule__CommunicationPath__Group__1__Impl rule__CommunicationPath__Group__2 )
            // InternalIoTDevice.g:4256:2: rule__CommunicationPath__Group__1__Impl rule__CommunicationPath__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__CommunicationPath__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CommunicationPath__Group__1"


    // $ANTLR start "rule__CommunicationPath__Group__1__Impl"
    // InternalIoTDevice.g:4263:1: rule__CommunicationPath__Group__1__Impl : ( ( rule__CommunicationPath__SrcAssignment_1 ) ) ;
    public final void rule__CommunicationPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4267:1: ( ( ( rule__CommunicationPath__SrcAssignment_1 ) ) )
            // InternalIoTDevice.g:4268:1: ( ( rule__CommunicationPath__SrcAssignment_1 ) )
            {
            // InternalIoTDevice.g:4268:1: ( ( rule__CommunicationPath__SrcAssignment_1 ) )
            // InternalIoTDevice.g:4269:1: ( rule__CommunicationPath__SrcAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getSrcAssignment_1()); 
            }
            // InternalIoTDevice.g:4270:1: ( rule__CommunicationPath__SrcAssignment_1 )
            // InternalIoTDevice.g:4270:2: rule__CommunicationPath__SrcAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__SrcAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getSrcAssignment_1()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__Group__1__Impl"


    // $ANTLR start "rule__CommunicationPath__Group__2"
    // InternalIoTDevice.g:4280:1: rule__CommunicationPath__Group__2 : rule__CommunicationPath__Group__2__Impl rule__CommunicationPath__Group__3 ;
    public final void rule__CommunicationPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4284:1: ( rule__CommunicationPath__Group__2__Impl rule__CommunicationPath__Group__3 )
            // InternalIoTDevice.g:4285:2: rule__CommunicationPath__Group__2__Impl rule__CommunicationPath__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__CommunicationPath__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CommunicationPath__Group__2"


    // $ANTLR start "rule__CommunicationPath__Group__2__Impl"
    // InternalIoTDevice.g:4292:1: rule__CommunicationPath__Group__2__Impl : ( 'to' ) ;
    public final void rule__CommunicationPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4296:1: ( ( 'to' ) )
            // InternalIoTDevice.g:4297:1: ( 'to' )
            {
            // InternalIoTDevice.g:4297:1: ( 'to' )
            // InternalIoTDevice.g:4298:1: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getToKeyword_2()); 
            }
            match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getToKeyword_2()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__Group__2__Impl"


    // $ANTLR start "rule__CommunicationPath__Group__3"
    // InternalIoTDevice.g:4311:1: rule__CommunicationPath__Group__3 : rule__CommunicationPath__Group__3__Impl rule__CommunicationPath__Group__4 ;
    public final void rule__CommunicationPath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4315:1: ( rule__CommunicationPath__Group__3__Impl rule__CommunicationPath__Group__4 )
            // InternalIoTDevice.g:4316:2: rule__CommunicationPath__Group__3__Impl rule__CommunicationPath__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__CommunicationPath__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CommunicationPath__Group__3"


    // $ANTLR start "rule__CommunicationPath__Group__3__Impl"
    // InternalIoTDevice.g:4323:1: rule__CommunicationPath__Group__3__Impl : ( ( rule__CommunicationPath__TgtAssignment_3 ) ) ;
    public final void rule__CommunicationPath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4327:1: ( ( ( rule__CommunicationPath__TgtAssignment_3 ) ) )
            // InternalIoTDevice.g:4328:1: ( ( rule__CommunicationPath__TgtAssignment_3 ) )
            {
            // InternalIoTDevice.g:4328:1: ( ( rule__CommunicationPath__TgtAssignment_3 ) )
            // InternalIoTDevice.g:4329:1: ( rule__CommunicationPath__TgtAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getTgtAssignment_3()); 
            }
            // InternalIoTDevice.g:4330:1: ( rule__CommunicationPath__TgtAssignment_3 )
            // InternalIoTDevice.g:4330:2: rule__CommunicationPath__TgtAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__TgtAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getTgtAssignment_3()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__Group__3__Impl"


    // $ANTLR start "rule__CommunicationPath__Group__4"
    // InternalIoTDevice.g:4340:1: rule__CommunicationPath__Group__4 : rule__CommunicationPath__Group__4__Impl rule__CommunicationPath__Group__5 ;
    public final void rule__CommunicationPath__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4344:1: ( rule__CommunicationPath__Group__4__Impl rule__CommunicationPath__Group__5 )
            // InternalIoTDevice.g:4345:2: rule__CommunicationPath__Group__4__Impl rule__CommunicationPath__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__CommunicationPath__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CommunicationPath__Group__4"


    // $ANTLR start "rule__CommunicationPath__Group__4__Impl"
    // InternalIoTDevice.g:4352:1: rule__CommunicationPath__Group__4__Impl : ( 'via' ) ;
    public final void rule__CommunicationPath__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4356:1: ( ( 'via' ) )
            // InternalIoTDevice.g:4357:1: ( 'via' )
            {
            // InternalIoTDevice.g:4357:1: ( 'via' )
            // InternalIoTDevice.g:4358:1: 'via'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getViaKeyword_4()); 
            }
            match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getViaKeyword_4()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__Group__4__Impl"


    // $ANTLR start "rule__CommunicationPath__Group__5"
    // InternalIoTDevice.g:4371:1: rule__CommunicationPath__Group__5 : rule__CommunicationPath__Group__5__Impl ;
    public final void rule__CommunicationPath__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4375:1: ( rule__CommunicationPath__Group__5__Impl )
            // InternalIoTDevice.g:4376:2: rule__CommunicationPath__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CommunicationPath__Group__5"


    // $ANTLR start "rule__CommunicationPath__Group__5__Impl"
    // InternalIoTDevice.g:4382:1: rule__CommunicationPath__Group__5__Impl : ( ( rule__CommunicationPath__ProtocolAssignment_5 ) ) ;
    public final void rule__CommunicationPath__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4386:1: ( ( ( rule__CommunicationPath__ProtocolAssignment_5 ) ) )
            // InternalIoTDevice.g:4387:1: ( ( rule__CommunicationPath__ProtocolAssignment_5 ) )
            {
            // InternalIoTDevice.g:4387:1: ( ( rule__CommunicationPath__ProtocolAssignment_5 ) )
            // InternalIoTDevice.g:4388:1: ( rule__CommunicationPath__ProtocolAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getProtocolAssignment_5()); 
            }
            // InternalIoTDevice.g:4389:1: ( rule__CommunicationPath__ProtocolAssignment_5 )
            // InternalIoTDevice.g:4389:2: rule__CommunicationPath__ProtocolAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CommunicationPath__ProtocolAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getProtocolAssignment_5()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__Group__5__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalIoTDevice.g:4411:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4415:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalIoTDevice.g:4416:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalIoTDevice.g:4423:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4427:1: ( ( 'var' ) )
            // InternalIoTDevice.g:4428:1: ( 'var' )
            {
            // InternalIoTDevice.g:4428:1: ( 'var' )
            // InternalIoTDevice.g:4429:1: 'var'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            }
            match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            }

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
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalIoTDevice.g:4442:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4446:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalIoTDevice.g:4447:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalIoTDevice.g:4454:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4458:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:4459:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:4459:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalIoTDevice.g:4460:1: ( rule__VariableDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:4461:1: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalIoTDevice.g:4461:2: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalIoTDevice.g:4471:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4475:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalIoTDevice.g:4476:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalIoTDevice.g:4483:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4487:1: ( ( '=' ) )
            // InternalIoTDevice.g:4488:1: ( '=' )
            {
            // InternalIoTDevice.g:4488:1: ( '=' )
            // InternalIoTDevice.g:4489:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            }
            match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            }

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
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalIoTDevice.g:4502:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4506:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalIoTDevice.g:4507:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalIoTDevice.g:4513:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__InitAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4517:1: ( ( ( rule__VariableDeclaration__InitAssignment_3 ) ) )
            // InternalIoTDevice.g:4518:1: ( ( rule__VariableDeclaration__InitAssignment_3 ) )
            {
            // InternalIoTDevice.g:4518:1: ( ( rule__VariableDeclaration__InitAssignment_3 ) )
            // InternalIoTDevice.g:4519:1: ( rule__VariableDeclaration__InitAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getInitAssignment_3()); 
            }
            // InternalIoTDevice.g:4520:1: ( rule__VariableDeclaration__InitAssignment_3 )
            // InternalIoTDevice.g:4520:2: rule__VariableDeclaration__InitAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__VariableDeclaration__InitAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getInitAssignment_3()); 
            }

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
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalIoTDevice.g:4538:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4542:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalIoTDevice.g:4543:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Rule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalIoTDevice.g:4550:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4554:1: ( ( 'rule' ) )
            // InternalIoTDevice.g:4555:1: ( 'rule' )
            {
            // InternalIoTDevice.g:4555:1: ( 'rule' )
            // InternalIoTDevice.g:4556:1: 'rule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            }
            match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            }

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalIoTDevice.g:4569:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4573:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalIoTDevice.g:4574:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Rule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalIoTDevice.g:4581:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4585:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalIoTDevice.g:4586:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalIoTDevice.g:4586:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalIoTDevice.g:4587:1: ( rule__Rule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }
            // InternalIoTDevice.g:4588:1: ( rule__Rule__NameAssignment_1 )
            // InternalIoTDevice.g:4588:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalIoTDevice.g:4598:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4602:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalIoTDevice.g:4603:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__Rule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalIoTDevice.g:4610:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4614:1: ( ( ':' ) )
            // InternalIoTDevice.g:4615:1: ( ':' )
            {
            // InternalIoTDevice.g:4615:1: ( ':' )
            // InternalIoTDevice.g:4616:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            }

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalIoTDevice.g:4629:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4633:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalIoTDevice.g:4634:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__Rule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalIoTDevice.g:4641:1: rule__Rule__Group__3__Impl : ( 'when' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4645:1: ( ( 'when' ) )
            // InternalIoTDevice.g:4646:1: ( 'when' )
            {
            // InternalIoTDevice.g:4646:1: ( 'when' )
            // InternalIoTDevice.g:4647:1: 'when'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getWhenKeyword_3()); 
            }
            match(input,50,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getWhenKeyword_3()); 
            }

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalIoTDevice.g:4660:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4664:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalIoTDevice.g:4665:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__Rule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalIoTDevice.g:4672:1: rule__Rule__Group__4__Impl : ( '(' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4676:1: ( ( '(' ) )
            // InternalIoTDevice.g:4677:1: ( '(' )
            {
            // InternalIoTDevice.g:4677:1: ( '(' )
            // InternalIoTDevice.g:4678:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_4()); 
            }

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalIoTDevice.g:4691:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4695:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalIoTDevice.g:4696:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__Rule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalIoTDevice.g:4703:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__TriggerAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4707:1: ( ( ( rule__Rule__TriggerAssignment_5 ) ) )
            // InternalIoTDevice.g:4708:1: ( ( rule__Rule__TriggerAssignment_5 ) )
            {
            // InternalIoTDevice.g:4708:1: ( ( rule__Rule__TriggerAssignment_5 ) )
            // InternalIoTDevice.g:4709:1: ( rule__Rule__TriggerAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getTriggerAssignment_5()); 
            }
            // InternalIoTDevice.g:4710:1: ( rule__Rule__TriggerAssignment_5 )
            // InternalIoTDevice.g:4710:2: rule__Rule__TriggerAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__TriggerAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getTriggerAssignment_5()); 
            }

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
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalIoTDevice.g:4720:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4724:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalIoTDevice.g:4725:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__Rule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalIoTDevice.g:4732:1: rule__Rule__Group__6__Impl : ( ')' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4736:1: ( ( ')' ) )
            // InternalIoTDevice.g:4737:1: ( ')' )
            {
            // InternalIoTDevice.g:4737:1: ( ')' )
            // InternalIoTDevice.g:4738:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_6()); 
            }

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
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalIoTDevice.g:4751:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4755:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalIoTDevice.g:4756:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Rule__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__8();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalIoTDevice.g:4763:1: rule__Rule__Group__7__Impl : ( 'do' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4767:1: ( ( 'do' ) )
            // InternalIoTDevice.g:4768:1: ( 'do' )
            {
            // InternalIoTDevice.g:4768:1: ( 'do' )
            // InternalIoTDevice.g:4769:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getDoKeyword_7()); 
            }
            match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getDoKeyword_7()); 
            }

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
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // InternalIoTDevice.g:4782:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4786:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalIoTDevice.g:4787:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__Rule__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__9();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // InternalIoTDevice.g:4794:1: rule__Rule__Group__8__Impl : ( '{' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4798:1: ( ( '{' ) )
            // InternalIoTDevice.g:4799:1: ( '{' )
            {
            // InternalIoTDevice.g:4799:1: ( '{' )
            // InternalIoTDevice.g:4800:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_8()); 
            }

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
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // InternalIoTDevice.g:4813:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4817:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalIoTDevice.g:4818:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__Rule__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__10();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // InternalIoTDevice.g:4825:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__ReactionAssignment_9 ) ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4829:1: ( ( ( rule__Rule__ReactionAssignment_9 ) ) )
            // InternalIoTDevice.g:4830:1: ( ( rule__Rule__ReactionAssignment_9 ) )
            {
            // InternalIoTDevice.g:4830:1: ( ( rule__Rule__ReactionAssignment_9 ) )
            // InternalIoTDevice.g:4831:1: ( rule__Rule__ReactionAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getReactionAssignment_9()); 
            }
            // InternalIoTDevice.g:4832:1: ( rule__Rule__ReactionAssignment_9 )
            // InternalIoTDevice.g:4832:2: rule__Rule__ReactionAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__ReactionAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getReactionAssignment_9()); 
            }

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
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Rule__Group__10"
    // InternalIoTDevice.g:4842:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4846:1: ( rule__Rule__Group__10__Impl )
            // InternalIoTDevice.g:4847:2: rule__Rule__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Rule__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Rule__Group__10"


    // $ANTLR start "rule__Rule__Group__10__Impl"
    // InternalIoTDevice.g:4853:1: rule__Rule__Group__10__Impl : ( '}' ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4857:1: ( ( '}' ) )
            // InternalIoTDevice.g:4858:1: ( '}' )
            {
            // InternalIoTDevice.g:4858:1: ( '}' )
            // InternalIoTDevice.g:4859:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10()); 
            }

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
    // $ANTLR end "rule__Rule__Group__10__Impl"


    // $ANTLR start "rule__ParallelComposition__Group__0"
    // InternalIoTDevice.g:4894:1: rule__ParallelComposition__Group__0 : rule__ParallelComposition__Group__0__Impl rule__ParallelComposition__Group__1 ;
    public final void rule__ParallelComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4898:1: ( rule__ParallelComposition__Group__0__Impl rule__ParallelComposition__Group__1 )
            // InternalIoTDevice.g:4899:2: rule__ParallelComposition__Group__0__Impl rule__ParallelComposition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__ParallelComposition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParallelComposition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelComposition__Group__0"


    // $ANTLR start "rule__ParallelComposition__Group__0__Impl"
    // InternalIoTDevice.g:4906:1: rule__ParallelComposition__Group__0__Impl : ( ruleSeqComposition ) ;
    public final void rule__ParallelComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4910:1: ( ( ruleSeqComposition ) )
            // InternalIoTDevice.g:4911:1: ( ruleSeqComposition )
            {
            // InternalIoTDevice.g:4911:1: ( ruleSeqComposition )
            // InternalIoTDevice.g:4912:1: ruleSeqComposition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelCompositionAccess().getSeqCompositionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSeqComposition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelCompositionAccess().getSeqCompositionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__ParallelComposition__Group__0__Impl"


    // $ANTLR start "rule__ParallelComposition__Group__1"
    // InternalIoTDevice.g:4923:1: rule__ParallelComposition__Group__1 : rule__ParallelComposition__Group__1__Impl ;
    public final void rule__ParallelComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4927:1: ( rule__ParallelComposition__Group__1__Impl )
            // InternalIoTDevice.g:4928:2: rule__ParallelComposition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParallelComposition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelComposition__Group__1"


    // $ANTLR start "rule__ParallelComposition__Group__1__Impl"
    // InternalIoTDevice.g:4934:1: rule__ParallelComposition__Group__1__Impl : ( ( rule__ParallelComposition__Group_1__0 )* ) ;
    public final void rule__ParallelComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4938:1: ( ( ( rule__ParallelComposition__Group_1__0 )* ) )
            // InternalIoTDevice.g:4939:1: ( ( rule__ParallelComposition__Group_1__0 )* )
            {
            // InternalIoTDevice.g:4939:1: ( ( rule__ParallelComposition__Group_1__0 )* )
            // InternalIoTDevice.g:4940:1: ( rule__ParallelComposition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelCompositionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:4941:1: ( rule__ParallelComposition__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==52) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalIoTDevice.g:4941:2: rule__ParallelComposition__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    rule__ParallelComposition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelCompositionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__ParallelComposition__Group__1__Impl"


    // $ANTLR start "rule__ParallelComposition__Group_1__0"
    // InternalIoTDevice.g:4955:1: rule__ParallelComposition__Group_1__0 : rule__ParallelComposition__Group_1__0__Impl rule__ParallelComposition__Group_1__1 ;
    public final void rule__ParallelComposition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4959:1: ( rule__ParallelComposition__Group_1__0__Impl rule__ParallelComposition__Group_1__1 )
            // InternalIoTDevice.g:4960:2: rule__ParallelComposition__Group_1__0__Impl rule__ParallelComposition__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__ParallelComposition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParallelComposition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelComposition__Group_1__0"


    // $ANTLR start "rule__ParallelComposition__Group_1__0__Impl"
    // InternalIoTDevice.g:4967:1: rule__ParallelComposition__Group_1__0__Impl : ( () ) ;
    public final void rule__ParallelComposition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4971:1: ( ( () ) )
            // InternalIoTDevice.g:4972:1: ( () )
            {
            // InternalIoTDevice.g:4972:1: ( () )
            // InternalIoTDevice.g:4973:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelCompositionAccess().getParallelCompositionLhsAction_1_0()); 
            }
            // InternalIoTDevice.g:4974:1: ()
            // InternalIoTDevice.g:4976:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelCompositionAccess().getParallelCompositionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParallelComposition__Group_1__0__Impl"


    // $ANTLR start "rule__ParallelComposition__Group_1__1"
    // InternalIoTDevice.g:4986:1: rule__ParallelComposition__Group_1__1 : rule__ParallelComposition__Group_1__1__Impl rule__ParallelComposition__Group_1__2 ;
    public final void rule__ParallelComposition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:4990:1: ( rule__ParallelComposition__Group_1__1__Impl rule__ParallelComposition__Group_1__2 )
            // InternalIoTDevice.g:4991:2: rule__ParallelComposition__Group_1__1__Impl rule__ParallelComposition__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__ParallelComposition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParallelComposition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelComposition__Group_1__1"


    // $ANTLR start "rule__ParallelComposition__Group_1__1__Impl"
    // InternalIoTDevice.g:4998:1: rule__ParallelComposition__Group_1__1__Impl : ( '||' ) ;
    public final void rule__ParallelComposition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5002:1: ( ( '||' ) )
            // InternalIoTDevice.g:5003:1: ( '||' )
            {
            // InternalIoTDevice.g:5003:1: ( '||' )
            // InternalIoTDevice.g:5004:1: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelCompositionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelCompositionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__ParallelComposition__Group_1__1__Impl"


    // $ANTLR start "rule__ParallelComposition__Group_1__2"
    // InternalIoTDevice.g:5017:1: rule__ParallelComposition__Group_1__2 : rule__ParallelComposition__Group_1__2__Impl ;
    public final void rule__ParallelComposition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5021:1: ( rule__ParallelComposition__Group_1__2__Impl )
            // InternalIoTDevice.g:5022:2: rule__ParallelComposition__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParallelComposition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParallelComposition__Group_1__2"


    // $ANTLR start "rule__ParallelComposition__Group_1__2__Impl"
    // InternalIoTDevice.g:5028:1: rule__ParallelComposition__Group_1__2__Impl : ( ( rule__ParallelComposition__RhsAssignment_1_2 ) ) ;
    public final void rule__ParallelComposition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5032:1: ( ( ( rule__ParallelComposition__RhsAssignment_1_2 ) ) )
            // InternalIoTDevice.g:5033:1: ( ( rule__ParallelComposition__RhsAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:5033:1: ( ( rule__ParallelComposition__RhsAssignment_1_2 ) )
            // InternalIoTDevice.g:5034:1: ( rule__ParallelComposition__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelCompositionAccess().getRhsAssignment_1_2()); 
            }
            // InternalIoTDevice.g:5035:1: ( rule__ParallelComposition__RhsAssignment_1_2 )
            // InternalIoTDevice.g:5035:2: rule__ParallelComposition__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParallelComposition__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelCompositionAccess().getRhsAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__ParallelComposition__Group_1__2__Impl"


    // $ANTLR start "rule__SeqComposition__Group__0"
    // InternalIoTDevice.g:5051:1: rule__SeqComposition__Group__0 : rule__SeqComposition__Group__0__Impl rule__SeqComposition__Group__1 ;
    public final void rule__SeqComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5055:1: ( rule__SeqComposition__Group__0__Impl rule__SeqComposition__Group__1 )
            // InternalIoTDevice.g:5056:2: rule__SeqComposition__Group__0__Impl rule__SeqComposition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__SeqComposition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SeqComposition__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SeqComposition__Group__0"


    // $ANTLR start "rule__SeqComposition__Group__0__Impl"
    // InternalIoTDevice.g:5063:1: rule__SeqComposition__Group__0__Impl : ( ruleSimpleReaction ) ;
    public final void rule__SeqComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5067:1: ( ( ruleSimpleReaction ) )
            // InternalIoTDevice.g:5068:1: ( ruleSimpleReaction )
            {
            // InternalIoTDevice.g:5068:1: ( ruleSimpleReaction )
            // InternalIoTDevice.g:5069:1: ruleSimpleReaction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeqCompositionAccess().getSimpleReactionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSimpleReaction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeqCompositionAccess().getSimpleReactionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__SeqComposition__Group__0__Impl"


    // $ANTLR start "rule__SeqComposition__Group__1"
    // InternalIoTDevice.g:5080:1: rule__SeqComposition__Group__1 : rule__SeqComposition__Group__1__Impl ;
    public final void rule__SeqComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5084:1: ( rule__SeqComposition__Group__1__Impl )
            // InternalIoTDevice.g:5085:2: rule__SeqComposition__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SeqComposition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SeqComposition__Group__1"


    // $ANTLR start "rule__SeqComposition__Group__1__Impl"
    // InternalIoTDevice.g:5091:1: rule__SeqComposition__Group__1__Impl : ( ( rule__SeqComposition__Group_1__0 )* ) ;
    public final void rule__SeqComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5095:1: ( ( ( rule__SeqComposition__Group_1__0 )* ) )
            // InternalIoTDevice.g:5096:1: ( ( rule__SeqComposition__Group_1__0 )* )
            {
            // InternalIoTDevice.g:5096:1: ( ( rule__SeqComposition__Group_1__0 )* )
            // InternalIoTDevice.g:5097:1: ( rule__SeqComposition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeqCompositionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:5098:1: ( rule__SeqComposition__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalIoTDevice.g:5098:2: rule__SeqComposition__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__SeqComposition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeqCompositionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__SeqComposition__Group__1__Impl"


    // $ANTLR start "rule__SeqComposition__Group_1__0"
    // InternalIoTDevice.g:5112:1: rule__SeqComposition__Group_1__0 : rule__SeqComposition__Group_1__0__Impl rule__SeqComposition__Group_1__1 ;
    public final void rule__SeqComposition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5116:1: ( rule__SeqComposition__Group_1__0__Impl rule__SeqComposition__Group_1__1 )
            // InternalIoTDevice.g:5117:2: rule__SeqComposition__Group_1__0__Impl rule__SeqComposition__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__SeqComposition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SeqComposition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SeqComposition__Group_1__0"


    // $ANTLR start "rule__SeqComposition__Group_1__0__Impl"
    // InternalIoTDevice.g:5124:1: rule__SeqComposition__Group_1__0__Impl : ( () ) ;
    public final void rule__SeqComposition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5128:1: ( ( () ) )
            // InternalIoTDevice.g:5129:1: ( () )
            {
            // InternalIoTDevice.g:5129:1: ( () )
            // InternalIoTDevice.g:5130:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeqCompositionAccess().getSeqCompositionLhsAction_1_0()); 
            }
            // InternalIoTDevice.g:5131:1: ()
            // InternalIoTDevice.g:5133:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeqCompositionAccess().getSeqCompositionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeqComposition__Group_1__0__Impl"


    // $ANTLR start "rule__SeqComposition__Group_1__1"
    // InternalIoTDevice.g:5143:1: rule__SeqComposition__Group_1__1 : rule__SeqComposition__Group_1__1__Impl rule__SeqComposition__Group_1__2 ;
    public final void rule__SeqComposition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5147:1: ( rule__SeqComposition__Group_1__1__Impl rule__SeqComposition__Group_1__2 )
            // InternalIoTDevice.g:5148:2: rule__SeqComposition__Group_1__1__Impl rule__SeqComposition__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__SeqComposition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SeqComposition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SeqComposition__Group_1__1"


    // $ANTLR start "rule__SeqComposition__Group_1__1__Impl"
    // InternalIoTDevice.g:5155:1: rule__SeqComposition__Group_1__1__Impl : ( ';' ) ;
    public final void rule__SeqComposition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5159:1: ( ( ';' ) )
            // InternalIoTDevice.g:5160:1: ( ';' )
            {
            // InternalIoTDevice.g:5160:1: ( ';' )
            // InternalIoTDevice.g:5161:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeqCompositionAccess().getSemicolonKeyword_1_1()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeqCompositionAccess().getSemicolonKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__SeqComposition__Group_1__1__Impl"


    // $ANTLR start "rule__SeqComposition__Group_1__2"
    // InternalIoTDevice.g:5174:1: rule__SeqComposition__Group_1__2 : rule__SeqComposition__Group_1__2__Impl ;
    public final void rule__SeqComposition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5178:1: ( rule__SeqComposition__Group_1__2__Impl )
            // InternalIoTDevice.g:5179:2: rule__SeqComposition__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SeqComposition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SeqComposition__Group_1__2"


    // $ANTLR start "rule__SeqComposition__Group_1__2__Impl"
    // InternalIoTDevice.g:5185:1: rule__SeqComposition__Group_1__2__Impl : ( ( rule__SeqComposition__RhsAssignment_1_2 ) ) ;
    public final void rule__SeqComposition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5189:1: ( ( ( rule__SeqComposition__RhsAssignment_1_2 ) ) )
            // InternalIoTDevice.g:5190:1: ( ( rule__SeqComposition__RhsAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:5190:1: ( ( rule__SeqComposition__RhsAssignment_1_2 ) )
            // InternalIoTDevice.g:5191:1: ( rule__SeqComposition__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeqCompositionAccess().getRhsAssignment_1_2()); 
            }
            // InternalIoTDevice.g:5192:1: ( rule__SeqComposition__RhsAssignment_1_2 )
            // InternalIoTDevice.g:5192:2: rule__SeqComposition__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SeqComposition__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeqCompositionAccess().getRhsAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__SeqComposition__Group_1__2__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalIoTDevice.g:5208:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5212:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalIoTDevice.g:5213:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalIoTDevice.g:5220:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5224:1: ( ( ruleAndExpression ) )
            // InternalIoTDevice.g:5225:1: ( ruleAndExpression )
            {
            // InternalIoTDevice.g:5225:1: ( ruleAndExpression )
            // InternalIoTDevice.g:5226:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalIoTDevice.g:5237:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5241:1: ( rule__OrExpression__Group__1__Impl )
            // InternalIoTDevice.g:5242:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalIoTDevice.g:5248:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5252:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalIoTDevice.g:5253:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalIoTDevice.g:5253:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalIoTDevice.g:5254:1: ( rule__OrExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:5255:1: ( rule__OrExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==61) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalIoTDevice.g:5255:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_48);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalIoTDevice.g:5269:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5273:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalIoTDevice.g:5274:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalIoTDevice.g:5281:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5285:1: ( ( () ) )
            // InternalIoTDevice.g:5286:1: ( () )
            {
            // InternalIoTDevice.g:5286:1: ( () )
            // InternalIoTDevice.g:5287:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0()); 
            }
            // InternalIoTDevice.g:5288:1: ()
            // InternalIoTDevice.g:5290:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalIoTDevice.g:5300:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5304:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalIoTDevice.g:5305:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalIoTDevice.g:5312:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OpAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5316:1: ( ( ( rule__OrExpression__OpAssignment_1_1 ) ) )
            // InternalIoTDevice.g:5317:1: ( ( rule__OrExpression__OpAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:5317:1: ( ( rule__OrExpression__OpAssignment_1_1 ) )
            // InternalIoTDevice.g:5318:1: ( rule__OrExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalIoTDevice.g:5319:1: ( rule__OrExpression__OpAssignment_1_1 )
            // InternalIoTDevice.g:5319:2: rule__OrExpression__OpAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalIoTDevice.g:5329:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5333:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalIoTDevice.g:5334:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalIoTDevice.g:5340:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5344:1: ( ( ( rule__OrExpression__RhsAssignment_1_2 ) ) )
            // InternalIoTDevice.g:5345:1: ( ( rule__OrExpression__RhsAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:5345:1: ( ( rule__OrExpression__RhsAssignment_1_2 ) )
            // InternalIoTDevice.g:5346:1: ( rule__OrExpression__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2()); 
            }
            // InternalIoTDevice.g:5347:1: ( rule__OrExpression__RhsAssignment_1_2 )
            // InternalIoTDevice.g:5347:2: rule__OrExpression__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpression__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalIoTDevice.g:5363:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5367:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalIoTDevice.g:5368:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalIoTDevice.g:5375:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5379:1: ( ( ruleEqualityExpression ) )
            // InternalIoTDevice.g:5380:1: ( ruleEqualityExpression )
            {
            // InternalIoTDevice.g:5380:1: ( ruleEqualityExpression )
            // InternalIoTDevice.g:5381:1: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalIoTDevice.g:5392:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5396:1: ( rule__AndExpression__Group__1__Impl )
            // InternalIoTDevice.g:5397:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalIoTDevice.g:5403:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5407:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalIoTDevice.g:5408:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalIoTDevice.g:5408:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalIoTDevice.g:5409:1: ( rule__AndExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:5410:1: ( rule__AndExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==62) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalIoTDevice.g:5410:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_50);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalIoTDevice.g:5424:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5428:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalIoTDevice.g:5429:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalIoTDevice.g:5436:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5440:1: ( ( () ) )
            // InternalIoTDevice.g:5441:1: ( () )
            {
            // InternalIoTDevice.g:5441:1: ( () )
            // InternalIoTDevice.g:5442:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0()); 
            }
            // InternalIoTDevice.g:5443:1: ()
            // InternalIoTDevice.g:5445:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalIoTDevice.g:5455:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5459:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalIoTDevice.g:5460:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalIoTDevice.g:5467:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5471:1: ( ( ( rule__AndExpression__OpAssignment_1_1 ) ) )
            // InternalIoTDevice.g:5472:1: ( ( rule__AndExpression__OpAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:5472:1: ( ( rule__AndExpression__OpAssignment_1_1 ) )
            // InternalIoTDevice.g:5473:1: ( rule__AndExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalIoTDevice.g:5474:1: ( rule__AndExpression__OpAssignment_1_1 )
            // InternalIoTDevice.g:5474:2: rule__AndExpression__OpAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalIoTDevice.g:5484:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5488:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalIoTDevice.g:5489:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalIoTDevice.g:5495:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5499:1: ( ( ( rule__AndExpression__RhsAssignment_1_2 ) ) )
            // InternalIoTDevice.g:5500:1: ( ( rule__AndExpression__RhsAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:5500:1: ( ( rule__AndExpression__RhsAssignment_1_2 ) )
            // InternalIoTDevice.g:5501:1: ( rule__AndExpression__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2()); 
            }
            // InternalIoTDevice.g:5502:1: ( rule__AndExpression__RhsAssignment_1_2 )
            // InternalIoTDevice.g:5502:2: rule__AndExpression__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpression__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // InternalIoTDevice.g:5518:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5522:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // InternalIoTDevice.g:5523:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // InternalIoTDevice.g:5530:1: rule__EqualityExpression__Group__0__Impl : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5534:1: ( ( ruleRelationalExpression ) )
            // InternalIoTDevice.g:5535:1: ( ruleRelationalExpression )
            {
            // InternalIoTDevice.g:5535:1: ( ruleRelationalExpression )
            // InternalIoTDevice.g:5536:1: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // InternalIoTDevice.g:5547:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5551:1: ( rule__EqualityExpression__Group__1__Impl )
            // InternalIoTDevice.g:5552:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // InternalIoTDevice.g:5558:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5562:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // InternalIoTDevice.g:5563:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // InternalIoTDevice.g:5563:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // InternalIoTDevice.g:5564:1: ( rule__EqualityExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:5565:1: ( rule__EqualityExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=11 && LA33_0<=12)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalIoTDevice.g:5565:2: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_52);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // InternalIoTDevice.g:5579:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5583:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // InternalIoTDevice.g:5584:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // InternalIoTDevice.g:5591:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5595:1: ( ( () ) )
            // InternalIoTDevice.g:5596:1: ( () )
            {
            // InternalIoTDevice.g:5596:1: ( () )
            // InternalIoTDevice.g:5597:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLhsAction_1_0()); 
            }
            // InternalIoTDevice.g:5598:1: ()
            // InternalIoTDevice.g:5600:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // InternalIoTDevice.g:5610:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5614:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // InternalIoTDevice.g:5615:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // InternalIoTDevice.g:5622:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OpAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5626:1: ( ( ( rule__EqualityExpression__OpAssignment_1_1 ) ) )
            // InternalIoTDevice.g:5627:1: ( ( rule__EqualityExpression__OpAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:5627:1: ( ( rule__EqualityExpression__OpAssignment_1_1 ) )
            // InternalIoTDevice.g:5628:1: ( rule__EqualityExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalIoTDevice.g:5629:1: ( rule__EqualityExpression__OpAssignment_1_1 )
            // InternalIoTDevice.g:5629:2: rule__EqualityExpression__OpAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__2"
    // InternalIoTDevice.g:5639:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5643:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // InternalIoTDevice.g:5644:2: rule__EqualityExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EqualityExpression__Group_1__2"


    // $ANTLR start "rule__EqualityExpression__Group_1__2__Impl"
    // InternalIoTDevice.g:5650:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5654:1: ( ( ( rule__EqualityExpression__RhsAssignment_1_2 ) ) )
            // InternalIoTDevice.g:5655:1: ( ( rule__EqualityExpression__RhsAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:5655:1: ( ( rule__EqualityExpression__RhsAssignment_1_2 ) )
            // InternalIoTDevice.g:5656:1: ( rule__EqualityExpression__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRhsAssignment_1_2()); 
            }
            // InternalIoTDevice.g:5657:1: ( rule__EqualityExpression__RhsAssignment_1_2 )
            // InternalIoTDevice.g:5657:2: rule__EqualityExpression__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getRhsAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__0"
    // InternalIoTDevice.g:5673:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5677:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // InternalIoTDevice.g:5678:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_53);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group__0"


    // $ANTLR start "rule__RelationalExpression__Group__0__Impl"
    // InternalIoTDevice.g:5685:1: rule__RelationalExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5689:1: ( ( ruleAdditiveExpression ) )
            // InternalIoTDevice.g:5690:1: ( ruleAdditiveExpression )
            {
            // InternalIoTDevice.g:5690:1: ( ruleAdditiveExpression )
            // InternalIoTDevice.g:5691:1: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__1"
    // InternalIoTDevice.g:5702:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5706:1: ( rule__RelationalExpression__Group__1__Impl )
            // InternalIoTDevice.g:5707:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group__1"


    // $ANTLR start "rule__RelationalExpression__Group__1__Impl"
    // InternalIoTDevice.g:5713:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5717:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // InternalIoTDevice.g:5718:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // InternalIoTDevice.g:5718:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // InternalIoTDevice.g:5719:1: ( rule__RelationalExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:5720:1: ( rule__RelationalExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=13 && LA34_0<=16)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalIoTDevice.g:5720:2: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__0"
    // InternalIoTDevice.g:5734:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5738:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // InternalIoTDevice.g:5739:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_53);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group_1__0"


    // $ANTLR start "rule__RelationalExpression__Group_1__0__Impl"
    // InternalIoTDevice.g:5746:1: rule__RelationalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5750:1: ( ( () ) )
            // InternalIoTDevice.g:5751:1: ( () )
            {
            // InternalIoTDevice.g:5751:1: ( () )
            // InternalIoTDevice.g:5752:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getComparativeExpressionLhsAction_1_0()); 
            }
            // InternalIoTDevice.g:5753:1: ()
            // InternalIoTDevice.g:5755:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getComparativeExpressionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__1"
    // InternalIoTDevice.g:5765:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5769:1: ( rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2 )
            // InternalIoTDevice.g:5770:2: rule__RelationalExpression__Group_1__1__Impl rule__RelationalExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__RelationalExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group_1__1"


    // $ANTLR start "rule__RelationalExpression__Group_1__1__Impl"
    // InternalIoTDevice.g:5777:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__OpAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5781:1: ( ( ( rule__RelationalExpression__OpAssignment_1_1 ) ) )
            // InternalIoTDevice.g:5782:1: ( ( rule__RelationalExpression__OpAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:5782:1: ( ( rule__RelationalExpression__OpAssignment_1_1 ) )
            // InternalIoTDevice.g:5783:1: ( rule__RelationalExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalIoTDevice.g:5784:1: ( rule__RelationalExpression__OpAssignment_1_1 )
            // InternalIoTDevice.g:5784:2: rule__RelationalExpression__OpAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__2"
    // InternalIoTDevice.g:5794:1: rule__RelationalExpression__Group_1__2 : rule__RelationalExpression__Group_1__2__Impl ;
    public final void rule__RelationalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5798:1: ( rule__RelationalExpression__Group_1__2__Impl )
            // InternalIoTDevice.g:5799:2: rule__RelationalExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__RelationalExpression__Group_1__2"


    // $ANTLR start "rule__RelationalExpression__Group_1__2__Impl"
    // InternalIoTDevice.g:5805:1: rule__RelationalExpression__Group_1__2__Impl : ( ( rule__RelationalExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__RelationalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5809:1: ( ( ( rule__RelationalExpression__RhsAssignment_1_2 ) ) )
            // InternalIoTDevice.g:5810:1: ( ( rule__RelationalExpression__RhsAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:5810:1: ( ( rule__RelationalExpression__RhsAssignment_1_2 ) )
            // InternalIoTDevice.g:5811:1: ( rule__RelationalExpression__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRhsAssignment_1_2()); 
            }
            // InternalIoTDevice.g:5812:1: ( rule__RelationalExpression__RhsAssignment_1_2 )
            // InternalIoTDevice.g:5812:2: rule__RelationalExpression__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRhsAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalIoTDevice.g:5828:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5832:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalIoTDevice.g:5833:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_55);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalIoTDevice.g:5840:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5844:1: ( ( ruleMultiplicativeExpression ) )
            // InternalIoTDevice.g:5845:1: ( ruleMultiplicativeExpression )
            {
            // InternalIoTDevice.g:5845:1: ( ruleMultiplicativeExpression )
            // InternalIoTDevice.g:5846:1: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalIoTDevice.g:5857:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5861:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalIoTDevice.g:5862:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalIoTDevice.g:5868:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5872:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalIoTDevice.g:5873:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalIoTDevice.g:5873:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalIoTDevice.g:5874:1: ( rule__AdditiveExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:5875:1: ( rule__AdditiveExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=17 && LA35_0<=18)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalIoTDevice.g:5875:2: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_56);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalIoTDevice.g:5889:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5893:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalIoTDevice.g:5894:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_55);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalIoTDevice.g:5901:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5905:1: ( ( () ) )
            // InternalIoTDevice.g:5906:1: ( () )
            {
            // InternalIoTDevice.g:5906:1: ( () )
            // InternalIoTDevice.g:5907:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLhsAction_1_0()); 
            }
            // InternalIoTDevice.g:5908:1: ()
            // InternalIoTDevice.g:5910:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalIoTDevice.g:5920:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5924:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalIoTDevice.g:5925:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalIoTDevice.g:5932:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5936:1: ( ( ( rule__AdditiveExpression__OpAssignment_1_1 ) ) )
            // InternalIoTDevice.g:5937:1: ( ( rule__AdditiveExpression__OpAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:5937:1: ( ( rule__AdditiveExpression__OpAssignment_1_1 ) )
            // InternalIoTDevice.g:5938:1: ( rule__AdditiveExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalIoTDevice.g:5939:1: ( rule__AdditiveExpression__OpAssignment_1_1 )
            // InternalIoTDevice.g:5939:2: rule__AdditiveExpression__OpAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2"
    // InternalIoTDevice.g:5949:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5953:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalIoTDevice.g:5954:2: rule__AdditiveExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__2"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2__Impl"
    // InternalIoTDevice.g:5960:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5964:1: ( ( ( rule__AdditiveExpression__RhsAssignment_1_2 ) ) )
            // InternalIoTDevice.g:5965:1: ( ( rule__AdditiveExpression__RhsAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:5965:1: ( ( rule__AdditiveExpression__RhsAssignment_1_2 ) )
            // InternalIoTDevice.g:5966:1: ( rule__AdditiveExpression__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRhsAssignment_1_2()); 
            }
            // InternalIoTDevice.g:5967:1: ( rule__AdditiveExpression__RhsAssignment_1_2 )
            // InternalIoTDevice.g:5967:2: rule__AdditiveExpression__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getRhsAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalIoTDevice.g:5983:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5987:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalIoTDevice.g:5988:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_57);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalIoTDevice.g:5995:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:5999:1: ( ( ruleUnaryExpression ) )
            // InternalIoTDevice.g:6000:1: ( ruleUnaryExpression )
            {
            // InternalIoTDevice.g:6000:1: ( ruleUnaryExpression )
            // InternalIoTDevice.g:6001:1: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalIoTDevice.g:6012:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6016:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalIoTDevice.g:6017:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalIoTDevice.g:6023:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6027:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalIoTDevice.g:6028:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalIoTDevice.g:6028:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalIoTDevice.g:6029:1: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:6030:1: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=19 && LA36_0<=20)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalIoTDevice.g:6030:2: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_58);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalIoTDevice.g:6044:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6048:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalIoTDevice.g:6049:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_57);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalIoTDevice.g:6056:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6060:1: ( ( () ) )
            // InternalIoTDevice.g:6061:1: ( () )
            {
            // InternalIoTDevice.g:6061:1: ( () )
            // InternalIoTDevice.g:6062:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLhsAction_1_0()); 
            }
            // InternalIoTDevice.g:6063:1: ()
            // InternalIoTDevice.g:6065:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLhsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalIoTDevice.g:6075:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6079:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalIoTDevice.g:6080:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalIoTDevice.g:6087:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OpAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6091:1: ( ( ( rule__MultiplicativeExpression__OpAssignment_1_1 ) ) )
            // InternalIoTDevice.g:6092:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:6092:1: ( ( rule__MultiplicativeExpression__OpAssignment_1_1 ) )
            // InternalIoTDevice.g:6093:1: ( rule__MultiplicativeExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalIoTDevice.g:6094:1: ( rule__MultiplicativeExpression__OpAssignment_1_1 )
            // InternalIoTDevice.g:6094:2: rule__MultiplicativeExpression__OpAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2"
    // InternalIoTDevice.g:6104:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6108:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalIoTDevice.g:6109:2: rule__MultiplicativeExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2__Impl"
    // InternalIoTDevice.g:6115:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__RhsAssignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6119:1: ( ( ( rule__MultiplicativeExpression__RhsAssignment_1_2 ) ) )
            // InternalIoTDevice.g:6120:1: ( ( rule__MultiplicativeExpression__RhsAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:6120:1: ( ( rule__MultiplicativeExpression__RhsAssignment_1_2 ) )
            // InternalIoTDevice.g:6121:1: ( rule__MultiplicativeExpression__RhsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRhsAssignment_1_2()); 
            }
            // InternalIoTDevice.g:6122:1: ( rule__MultiplicativeExpression__RhsAssignment_1_2 )
            // InternalIoTDevice.g:6122:2: rule__MultiplicativeExpression__RhsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__RhsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRhsAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__0"
    // InternalIoTDevice.g:6138:1: rule__UnaryExpression__Group_0__0 : rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 ;
    public final void rule__UnaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6142:1: ( rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1 )
            // InternalIoTDevice.g:6143:2: rule__UnaryExpression__Group_0__0__Impl rule__UnaryExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_59);
            rule__UnaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0__0__Impl"
    // InternalIoTDevice.g:6150:1: rule__UnaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6154:1: ( ( () ) )
            // InternalIoTDevice.g:6155:1: ( () )
            {
            // InternalIoTDevice.g:6155:1: ( () )
            // InternalIoTDevice.g:6156:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getNotExpressionAction_0_0()); 
            }
            // InternalIoTDevice.g:6157:1: ()
            // InternalIoTDevice.g:6159:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getNotExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__1"
    // InternalIoTDevice.g:6169:1: rule__UnaryExpression__Group_0__1 : rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 ;
    public final void rule__UnaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6173:1: ( rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2 )
            // InternalIoTDevice.g:6174:2: rule__UnaryExpression__Group_0__1__Impl rule__UnaryExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__UnaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0__1__Impl"
    // InternalIoTDevice.g:6181:1: rule__UnaryExpression__Group_0__1__Impl : ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6185:1: ( ( ( rule__UnaryExpression__OpAssignment_0_1 ) ) )
            // InternalIoTDevice.g:6186:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            {
            // InternalIoTDevice.g:6186:1: ( ( rule__UnaryExpression__OpAssignment_0_1 ) )
            // InternalIoTDevice.g:6187:1: ( rule__UnaryExpression__OpAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }
            // InternalIoTDevice.g:6188:1: ( rule__UnaryExpression__OpAssignment_0_1 )
            // InternalIoTDevice.g:6188:2: rule__UnaryExpression__OpAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__OpAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0__2"
    // InternalIoTDevice.g:6198:1: rule__UnaryExpression__Group_0__2 : rule__UnaryExpression__Group_0__2__Impl ;
    public final void rule__UnaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6202:1: ( rule__UnaryExpression__Group_0__2__Impl )
            // InternalIoTDevice.g:6203:2: rule__UnaryExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_0__2"


    // $ANTLR start "rule__UnaryExpression__Group_0__2__Impl"
    // InternalIoTDevice.g:6209:1: rule__UnaryExpression__Group_0__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) ;
    public final void rule__UnaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6213:1: ( ( ( rule__UnaryExpression__OperandAssignment_0_2 ) ) )
            // InternalIoTDevice.g:6214:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            {
            // InternalIoTDevice.g:6214:1: ( ( rule__UnaryExpression__OperandAssignment_0_2 ) )
            // InternalIoTDevice.g:6215:1: ( rule__UnaryExpression__OperandAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }
            // InternalIoTDevice.g:6216:1: ( rule__UnaryExpression__OperandAssignment_0_2 )
            // InternalIoTDevice.g:6216:2: rule__UnaryExpression__OperandAssignment_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_0_2()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__0"
    // InternalIoTDevice.g:6232:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6236:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // InternalIoTDevice.g:6237:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_60);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_1__0"


    // $ANTLR start "rule__UnaryExpression__Group_1__0__Impl"
    // InternalIoTDevice.g:6244:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6248:1: ( ( () ) )
            // InternalIoTDevice.g:6249:1: ( () )
            {
            // InternalIoTDevice.g:6249:1: ( () )
            // InternalIoTDevice.g:6250:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getPlusExpressionAction_1_0()); 
            }
            // InternalIoTDevice.g:6251:1: ()
            // InternalIoTDevice.g:6253:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getPlusExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__1"
    // InternalIoTDevice.g:6263:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6267:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // InternalIoTDevice.g:6268:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_1__1"


    // $ANTLR start "rule__UnaryExpression__Group_1__1__Impl"
    // InternalIoTDevice.g:6275:1: rule__UnaryExpression__Group_1__1__Impl : ( ( rule__UnaryExpression__OpAssignment_1_1 ) ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6279:1: ( ( ( rule__UnaryExpression__OpAssignment_1_1 ) ) )
            // InternalIoTDevice.g:6280:1: ( ( rule__UnaryExpression__OpAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:6280:1: ( ( rule__UnaryExpression__OpAssignment_1_1 ) )
            // InternalIoTDevice.g:6281:1: ( rule__UnaryExpression__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_1_1()); 
            }
            // InternalIoTDevice.g:6282:1: ( rule__UnaryExpression__OpAssignment_1_1 )
            // InternalIoTDevice.g:6282:2: rule__UnaryExpression__OpAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__2"
    // InternalIoTDevice.g:6292:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6296:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // InternalIoTDevice.g:6297:2: rule__UnaryExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_1__2"


    // $ANTLR start "rule__UnaryExpression__Group_1__2__Impl"
    // InternalIoTDevice.g:6303:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6307:1: ( ( ( rule__UnaryExpression__OperandAssignment_1_2 ) ) )
            // InternalIoTDevice.g:6308:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            {
            // InternalIoTDevice.g:6308:1: ( ( rule__UnaryExpression__OperandAssignment_1_2 ) )
            // InternalIoTDevice.g:6309:1: ( rule__UnaryExpression__OperandAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2()); 
            }
            // InternalIoTDevice.g:6310:1: ( rule__UnaryExpression__OperandAssignment_1_2 )
            // InternalIoTDevice.g:6310:2: rule__UnaryExpression__OperandAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_1_2()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__0"
    // InternalIoTDevice.g:6326:1: rule__UnaryExpression__Group_2__0 : rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 ;
    public final void rule__UnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6330:1: ( rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 )
            // InternalIoTDevice.g:6331:2: rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_61);
            rule__UnaryExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_2__0"


    // $ANTLR start "rule__UnaryExpression__Group_2__0__Impl"
    // InternalIoTDevice.g:6338:1: rule__UnaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6342:1: ( ( () ) )
            // InternalIoTDevice.g:6343:1: ( () )
            {
            // InternalIoTDevice.g:6343:1: ( () )
            // InternalIoTDevice.g:6344:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getMinusExpressionAction_2_0()); 
            }
            // InternalIoTDevice.g:6345:1: ()
            // InternalIoTDevice.g:6347:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getMinusExpressionAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__1"
    // InternalIoTDevice.g:6357:1: rule__UnaryExpression__Group_2__1 : rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 ;
    public final void rule__UnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6361:1: ( rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 )
            // InternalIoTDevice.g:6362:2: rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__UnaryExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_2__1"


    // $ANTLR start "rule__UnaryExpression__Group_2__1__Impl"
    // InternalIoTDevice.g:6369:1: rule__UnaryExpression__Group_2__1__Impl : ( ( rule__UnaryExpression__OpAssignment_2_1 ) ) ;
    public final void rule__UnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6373:1: ( ( ( rule__UnaryExpression__OpAssignment_2_1 ) ) )
            // InternalIoTDevice.g:6374:1: ( ( rule__UnaryExpression__OpAssignment_2_1 ) )
            {
            // InternalIoTDevice.g:6374:1: ( ( rule__UnaryExpression__OpAssignment_2_1 ) )
            // InternalIoTDevice.g:6375:1: ( rule__UnaryExpression__OpAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpAssignment_2_1()); 
            }
            // InternalIoTDevice.g:6376:1: ( rule__UnaryExpression__OpAssignment_2_1 )
            // InternalIoTDevice.g:6376:2: rule__UnaryExpression__OpAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__OpAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__2"
    // InternalIoTDevice.g:6386:1: rule__UnaryExpression__Group_2__2 : rule__UnaryExpression__Group_2__2__Impl ;
    public final void rule__UnaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6390:1: ( rule__UnaryExpression__Group_2__2__Impl )
            // InternalIoTDevice.g:6391:2: rule__UnaryExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__UnaryExpression__Group_2__2"


    // $ANTLR start "rule__UnaryExpression__Group_2__2__Impl"
    // InternalIoTDevice.g:6397:1: rule__UnaryExpression__Group_2__2__Impl : ( ( rule__UnaryExpression__OperandAssignment_2_2 ) ) ;
    public final void rule__UnaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6401:1: ( ( ( rule__UnaryExpression__OperandAssignment_2_2 ) ) )
            // InternalIoTDevice.g:6402:1: ( ( rule__UnaryExpression__OperandAssignment_2_2 ) )
            {
            // InternalIoTDevice.g:6402:1: ( ( rule__UnaryExpression__OperandAssignment_2_2 ) )
            // InternalIoTDevice.g:6403:1: ( rule__UnaryExpression__OperandAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2_2()); 
            }
            // InternalIoTDevice.g:6404:1: ( rule__UnaryExpression__OperandAssignment_2_2 )
            // InternalIoTDevice.g:6404:2: rule__UnaryExpression__OperandAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryExpression__OperandAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandAssignment_2_2()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group__0"
    // InternalIoTDevice.g:6420:1: rule__CapabilitySelection__Group__0 : rule__CapabilitySelection__Group__0__Impl rule__CapabilitySelection__Group__1 ;
    public final void rule__CapabilitySelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6424:1: ( rule__CapabilitySelection__Group__0__Impl rule__CapabilitySelection__Group__1 )
            // InternalIoTDevice.g:6425:2: rule__CapabilitySelection__Group__0__Impl rule__CapabilitySelection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_62);
            rule__CapabilitySelection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group__0"


    // $ANTLR start "rule__CapabilitySelection__Group__0__Impl"
    // InternalIoTDevice.g:6432:1: rule__CapabilitySelection__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__CapabilitySelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6436:1: ( ( rulePrimaryExpression ) )
            // InternalIoTDevice.g:6437:1: ( rulePrimaryExpression )
            {
            // InternalIoTDevice.g:6437:1: ( rulePrimaryExpression )
            // InternalIoTDevice.g:6438:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getPrimaryExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group__0__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group__1"
    // InternalIoTDevice.g:6449:1: rule__CapabilitySelection__Group__1 : rule__CapabilitySelection__Group__1__Impl ;
    public final void rule__CapabilitySelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6453:1: ( rule__CapabilitySelection__Group__1__Impl )
            // InternalIoTDevice.g:6454:2: rule__CapabilitySelection__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group__1"


    // $ANTLR start "rule__CapabilitySelection__Group__1__Impl"
    // InternalIoTDevice.g:6460:1: rule__CapabilitySelection__Group__1__Impl : ( ( rule__CapabilitySelection__Group_1__0 )* ) ;
    public final void rule__CapabilitySelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6464:1: ( ( ( rule__CapabilitySelection__Group_1__0 )* ) )
            // InternalIoTDevice.g:6465:1: ( ( rule__CapabilitySelection__Group_1__0 )* )
            {
            // InternalIoTDevice.g:6465:1: ( ( rule__CapabilitySelection__Group_1__0 )* )
            // InternalIoTDevice.g:6466:1: ( rule__CapabilitySelection__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:6467:1: ( rule__CapabilitySelection__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==53) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalIoTDevice.g:6467:2: rule__CapabilitySelection__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    rule__CapabilitySelection__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group__1__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1__0"
    // InternalIoTDevice.g:6481:1: rule__CapabilitySelection__Group_1__0 : rule__CapabilitySelection__Group_1__0__Impl rule__CapabilitySelection__Group_1__1 ;
    public final void rule__CapabilitySelection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6485:1: ( rule__CapabilitySelection__Group_1__0__Impl rule__CapabilitySelection__Group_1__1 )
            // InternalIoTDevice.g:6486:2: rule__CapabilitySelection__Group_1__0__Impl rule__CapabilitySelection__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__CapabilitySelection__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__0"


    // $ANTLR start "rule__CapabilitySelection__Group_1__0__Impl"
    // InternalIoTDevice.g:6493:1: rule__CapabilitySelection__Group_1__0__Impl : ( ( rule__CapabilitySelection__Group_1_0__0 ) ) ;
    public final void rule__CapabilitySelection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6497:1: ( ( ( rule__CapabilitySelection__Group_1_0__0 ) ) )
            // InternalIoTDevice.g:6498:1: ( ( rule__CapabilitySelection__Group_1_0__0 ) )
            {
            // InternalIoTDevice.g:6498:1: ( ( rule__CapabilitySelection__Group_1_0__0 ) )
            // InternalIoTDevice.g:6499:1: ( rule__CapabilitySelection__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getGroup_1_0()); 
            }
            // InternalIoTDevice.g:6500:1: ( rule__CapabilitySelection__Group_1_0__0 )
            // InternalIoTDevice.g:6500:2: rule__CapabilitySelection__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__0__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1__1"
    // InternalIoTDevice.g:6510:1: rule__CapabilitySelection__Group_1__1 : rule__CapabilitySelection__Group_1__1__Impl rule__CapabilitySelection__Group_1__2 ;
    public final void rule__CapabilitySelection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6514:1: ( rule__CapabilitySelection__Group_1__1__Impl rule__CapabilitySelection__Group_1__2 )
            // InternalIoTDevice.g:6515:2: rule__CapabilitySelection__Group_1__1__Impl rule__CapabilitySelection__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__CapabilitySelection__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__1"


    // $ANTLR start "rule__CapabilitySelection__Group_1__1__Impl"
    // InternalIoTDevice.g:6522:1: rule__CapabilitySelection__Group_1__1__Impl : ( ( rule__CapabilitySelection__CapabilityAssignment_1_1 ) ) ;
    public final void rule__CapabilitySelection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6526:1: ( ( ( rule__CapabilitySelection__CapabilityAssignment_1_1 ) ) )
            // InternalIoTDevice.g:6527:1: ( ( rule__CapabilitySelection__CapabilityAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:6527:1: ( ( rule__CapabilitySelection__CapabilityAssignment_1_1 ) )
            // InternalIoTDevice.g:6528:1: ( rule__CapabilitySelection__CapabilityAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getCapabilityAssignment_1_1()); 
            }
            // InternalIoTDevice.g:6529:1: ( rule__CapabilitySelection__CapabilityAssignment_1_1 )
            // InternalIoTDevice.g:6529:2: rule__CapabilitySelection__CapabilityAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__CapabilityAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getCapabilityAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__1__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1__2"
    // InternalIoTDevice.g:6539:1: rule__CapabilitySelection__Group_1__2 : rule__CapabilitySelection__Group_1__2__Impl rule__CapabilitySelection__Group_1__3 ;
    public final void rule__CapabilitySelection__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6543:1: ( rule__CapabilitySelection__Group_1__2__Impl rule__CapabilitySelection__Group_1__3 )
            // InternalIoTDevice.g:6544:2: rule__CapabilitySelection__Group_1__2__Impl rule__CapabilitySelection__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_64);
            rule__CapabilitySelection__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__2"


    // $ANTLR start "rule__CapabilitySelection__Group_1__2__Impl"
    // InternalIoTDevice.g:6551:1: rule__CapabilitySelection__Group_1__2__Impl : ( '(' ) ;
    public final void rule__CapabilitySelection__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6555:1: ( ( '(' ) )
            // InternalIoTDevice.g:6556:1: ( '(' )
            {
            // InternalIoTDevice.g:6556:1: ( '(' )
            // InternalIoTDevice.g:6557:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getLeftParenthesisKeyword_1_2()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getLeftParenthesisKeyword_1_2()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__2__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1__3"
    // InternalIoTDevice.g:6570:1: rule__CapabilitySelection__Group_1__3 : rule__CapabilitySelection__Group_1__3__Impl rule__CapabilitySelection__Group_1__4 ;
    public final void rule__CapabilitySelection__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6574:1: ( rule__CapabilitySelection__Group_1__3__Impl rule__CapabilitySelection__Group_1__4 )
            // InternalIoTDevice.g:6575:2: rule__CapabilitySelection__Group_1__3__Impl rule__CapabilitySelection__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_64);
            rule__CapabilitySelection__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__3"


    // $ANTLR start "rule__CapabilitySelection__Group_1__3__Impl"
    // InternalIoTDevice.g:6582:1: rule__CapabilitySelection__Group_1__3__Impl : ( ( rule__CapabilitySelection__Group_1_3__0 )? ) ;
    public final void rule__CapabilitySelection__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6586:1: ( ( ( rule__CapabilitySelection__Group_1_3__0 )? ) )
            // InternalIoTDevice.g:6587:1: ( ( rule__CapabilitySelection__Group_1_3__0 )? )
            {
            // InternalIoTDevice.g:6587:1: ( ( rule__CapabilitySelection__Group_1_3__0 )? )
            // InternalIoTDevice.g:6588:1: ( rule__CapabilitySelection__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getGroup_1_3()); 
            }
            // InternalIoTDevice.g:6589:1: ( rule__CapabilitySelection__Group_1_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)||(LA38_0>=17 && LA38_0<=18)||LA38_0==21||LA38_0==38||LA38_0==55||(LA38_0>=63 && LA38_0<=64)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalIoTDevice.g:6589:2: rule__CapabilitySelection__Group_1_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__CapabilitySelection__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getGroup_1_3()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__3__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1__4"
    // InternalIoTDevice.g:6599:1: rule__CapabilitySelection__Group_1__4 : rule__CapabilitySelection__Group_1__4__Impl ;
    public final void rule__CapabilitySelection__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6603:1: ( rule__CapabilitySelection__Group_1__4__Impl )
            // InternalIoTDevice.g:6604:2: rule__CapabilitySelection__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__4"


    // $ANTLR start "rule__CapabilitySelection__Group_1__4__Impl"
    // InternalIoTDevice.g:6610:1: rule__CapabilitySelection__Group_1__4__Impl : ( ')' ) ;
    public final void rule__CapabilitySelection__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6614:1: ( ( ')' ) )
            // InternalIoTDevice.g:6615:1: ( ')' )
            {
            // InternalIoTDevice.g:6615:1: ( ')' )
            // InternalIoTDevice.g:6616:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getRightParenthesisKeyword_1_4()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getRightParenthesisKeyword_1_4()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1__4__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1_0__0"
    // InternalIoTDevice.g:6639:1: rule__CapabilitySelection__Group_1_0__0 : rule__CapabilitySelection__Group_1_0__0__Impl ;
    public final void rule__CapabilitySelection__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6643:1: ( rule__CapabilitySelection__Group_1_0__0__Impl )
            // InternalIoTDevice.g:6644:2: rule__CapabilitySelection__Group_1_0__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_0__0"


    // $ANTLR start "rule__CapabilitySelection__Group_1_0__0__Impl"
    // InternalIoTDevice.g:6650:1: rule__CapabilitySelection__Group_1_0__0__Impl : ( ( rule__CapabilitySelection__Group_1_0_0__0 ) ) ;
    public final void rule__CapabilitySelection__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6654:1: ( ( ( rule__CapabilitySelection__Group_1_0_0__0 ) ) )
            // InternalIoTDevice.g:6655:1: ( ( rule__CapabilitySelection__Group_1_0_0__0 ) )
            {
            // InternalIoTDevice.g:6655:1: ( ( rule__CapabilitySelection__Group_1_0_0__0 ) )
            // InternalIoTDevice.g:6656:1: ( rule__CapabilitySelection__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getGroup_1_0_0()); 
            }
            // InternalIoTDevice.g:6657:1: ( rule__CapabilitySelection__Group_1_0_0__0 )
            // InternalIoTDevice.g:6657:2: rule__CapabilitySelection__Group_1_0_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_0__0__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1_0_0__0"
    // InternalIoTDevice.g:6669:1: rule__CapabilitySelection__Group_1_0_0__0 : rule__CapabilitySelection__Group_1_0_0__0__Impl rule__CapabilitySelection__Group_1_0_0__1 ;
    public final void rule__CapabilitySelection__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6673:1: ( rule__CapabilitySelection__Group_1_0_0__0__Impl rule__CapabilitySelection__Group_1_0_0__1 )
            // InternalIoTDevice.g:6674:2: rule__CapabilitySelection__Group_1_0_0__0__Impl rule__CapabilitySelection__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_62);
            rule__CapabilitySelection__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_0_0__0"


    // $ANTLR start "rule__CapabilitySelection__Group_1_0_0__0__Impl"
    // InternalIoTDevice.g:6681:1: rule__CapabilitySelection__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CapabilitySelection__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6685:1: ( ( () ) )
            // InternalIoTDevice.g:6686:1: ( () )
            {
            // InternalIoTDevice.g:6686:1: ( () )
            // InternalIoTDevice.g:6687:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getCapabilitySelectionReceiverAction_1_0_0_0()); 
            }
            // InternalIoTDevice.g:6688:1: ()
            // InternalIoTDevice.g:6690:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getCapabilitySelectionReceiverAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CapabilitySelection__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1_0_0__1"
    // InternalIoTDevice.g:6700:1: rule__CapabilitySelection__Group_1_0_0__1 : rule__CapabilitySelection__Group_1_0_0__1__Impl ;
    public final void rule__CapabilitySelection__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6704:1: ( rule__CapabilitySelection__Group_1_0_0__1__Impl )
            // InternalIoTDevice.g:6705:2: rule__CapabilitySelection__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_0_0__1"


    // $ANTLR start "rule__CapabilitySelection__Group_1_0_0__1__Impl"
    // InternalIoTDevice.g:6711:1: rule__CapabilitySelection__Group_1_0_0__1__Impl : ( '.' ) ;
    public final void rule__CapabilitySelection__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6715:1: ( ( '.' ) )
            // InternalIoTDevice.g:6716:1: ( '.' )
            {
            // InternalIoTDevice.g:6716:1: ( '.' )
            // InternalIoTDevice.g:6717:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getFullStopKeyword_1_0_0_1()); 
            }
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getFullStopKeyword_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1_3__0"
    // InternalIoTDevice.g:6734:1: rule__CapabilitySelection__Group_1_3__0 : rule__CapabilitySelection__Group_1_3__0__Impl rule__CapabilitySelection__Group_1_3__1 ;
    public final void rule__CapabilitySelection__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6738:1: ( rule__CapabilitySelection__Group_1_3__0__Impl rule__CapabilitySelection__Group_1_3__1 )
            // InternalIoTDevice.g:6739:2: rule__CapabilitySelection__Group_1_3__0__Impl rule__CapabilitySelection__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__CapabilitySelection__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_3__0"


    // $ANTLR start "rule__CapabilitySelection__Group_1_3__0__Impl"
    // InternalIoTDevice.g:6746:1: rule__CapabilitySelection__Group_1_3__0__Impl : ( ( rule__CapabilitySelection__ArgsAssignment_1_3_0 ) ) ;
    public final void rule__CapabilitySelection__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6750:1: ( ( ( rule__CapabilitySelection__ArgsAssignment_1_3_0 ) ) )
            // InternalIoTDevice.g:6751:1: ( ( rule__CapabilitySelection__ArgsAssignment_1_3_0 ) )
            {
            // InternalIoTDevice.g:6751:1: ( ( rule__CapabilitySelection__ArgsAssignment_1_3_0 ) )
            // InternalIoTDevice.g:6752:1: ( rule__CapabilitySelection__ArgsAssignment_1_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getArgsAssignment_1_3_0()); 
            }
            // InternalIoTDevice.g:6753:1: ( rule__CapabilitySelection__ArgsAssignment_1_3_0 )
            // InternalIoTDevice.g:6753:2: rule__CapabilitySelection__ArgsAssignment_1_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__ArgsAssignment_1_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getArgsAssignment_1_3_0()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_3__0__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1_3__1"
    // InternalIoTDevice.g:6763:1: rule__CapabilitySelection__Group_1_3__1 : rule__CapabilitySelection__Group_1_3__1__Impl ;
    public final void rule__CapabilitySelection__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6767:1: ( rule__CapabilitySelection__Group_1_3__1__Impl )
            // InternalIoTDevice.g:6768:2: rule__CapabilitySelection__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_3__1"


    // $ANTLR start "rule__CapabilitySelection__Group_1_3__1__Impl"
    // InternalIoTDevice.g:6774:1: rule__CapabilitySelection__Group_1_3__1__Impl : ( ( rule__CapabilitySelection__Group_1_3_1__0 )* ) ;
    public final void rule__CapabilitySelection__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6778:1: ( ( ( rule__CapabilitySelection__Group_1_3_1__0 )* ) )
            // InternalIoTDevice.g:6779:1: ( ( rule__CapabilitySelection__Group_1_3_1__0 )* )
            {
            // InternalIoTDevice.g:6779:1: ( ( rule__CapabilitySelection__Group_1_3_1__0 )* )
            // InternalIoTDevice.g:6780:1: ( rule__CapabilitySelection__Group_1_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getGroup_1_3_1()); 
            }
            // InternalIoTDevice.g:6781:1: ( rule__CapabilitySelection__Group_1_3_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalIoTDevice.g:6781:2: rule__CapabilitySelection__Group_1_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__CapabilitySelection__Group_1_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getGroup_1_3_1()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_3__1__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1_3_1__0"
    // InternalIoTDevice.g:6795:1: rule__CapabilitySelection__Group_1_3_1__0 : rule__CapabilitySelection__Group_1_3_1__0__Impl rule__CapabilitySelection__Group_1_3_1__1 ;
    public final void rule__CapabilitySelection__Group_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6799:1: ( rule__CapabilitySelection__Group_1_3_1__0__Impl rule__CapabilitySelection__Group_1_3_1__1 )
            // InternalIoTDevice.g:6800:2: rule__CapabilitySelection__Group_1_3_1__0__Impl rule__CapabilitySelection__Group_1_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__CapabilitySelection__Group_1_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_3_1__0"


    // $ANTLR start "rule__CapabilitySelection__Group_1_3_1__0__Impl"
    // InternalIoTDevice.g:6807:1: rule__CapabilitySelection__Group_1_3_1__0__Impl : ( ',' ) ;
    public final void rule__CapabilitySelection__Group_1_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6811:1: ( ( ',' ) )
            // InternalIoTDevice.g:6812:1: ( ',' )
            {
            // InternalIoTDevice.g:6812:1: ( ',' )
            // InternalIoTDevice.g:6813:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getCommaKeyword_1_3_1_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getCommaKeyword_1_3_1_0()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_3_1__0__Impl"


    // $ANTLR start "rule__CapabilitySelection__Group_1_3_1__1"
    // InternalIoTDevice.g:6826:1: rule__CapabilitySelection__Group_1_3_1__1 : rule__CapabilitySelection__Group_1_3_1__1__Impl ;
    public final void rule__CapabilitySelection__Group_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6830:1: ( rule__CapabilitySelection__Group_1_3_1__1__Impl )
            // InternalIoTDevice.g:6831:2: rule__CapabilitySelection__Group_1_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__Group_1_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_3_1__1"


    // $ANTLR start "rule__CapabilitySelection__Group_1_3_1__1__Impl"
    // InternalIoTDevice.g:6837:1: rule__CapabilitySelection__Group_1_3_1__1__Impl : ( ( rule__CapabilitySelection__ArgsAssignment_1_3_1_1 ) ) ;
    public final void rule__CapabilitySelection__Group_1_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6841:1: ( ( ( rule__CapabilitySelection__ArgsAssignment_1_3_1_1 ) ) )
            // InternalIoTDevice.g:6842:1: ( ( rule__CapabilitySelection__ArgsAssignment_1_3_1_1 ) )
            {
            // InternalIoTDevice.g:6842:1: ( ( rule__CapabilitySelection__ArgsAssignment_1_3_1_1 ) )
            // InternalIoTDevice.g:6843:1: ( rule__CapabilitySelection__ArgsAssignment_1_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getArgsAssignment_1_3_1_1()); 
            }
            // InternalIoTDevice.g:6844:1: ( rule__CapabilitySelection__ArgsAssignment_1_3_1_1 )
            // InternalIoTDevice.g:6844:2: rule__CapabilitySelection__ArgsAssignment_1_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__CapabilitySelection__ArgsAssignment_1_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getArgsAssignment_1_3_1_1()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__Group_1_3_1__1__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__0"
    // InternalIoTDevice.g:6858:1: rule__ParenthesizedExpression__Group__0 : rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 ;
    public final void rule__ParenthesizedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6862:1: ( rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1 )
            // InternalIoTDevice.g:6863:2: rule__ParenthesizedExpression__Group__0__Impl rule__ParenthesizedExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__ParenthesizedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__0"


    // $ANTLR start "rule__ParenthesizedExpression__Group__0__Impl"
    // InternalIoTDevice.g:6870:1: rule__ParenthesizedExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6874:1: ( ( '(' ) )
            // InternalIoTDevice.g:6875:1: ( '(' )
            {
            // InternalIoTDevice.g:6875:1: ( '(' )
            // InternalIoTDevice.g:6876:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__1"
    // InternalIoTDevice.g:6889:1: rule__ParenthesizedExpression__Group__1 : rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 ;
    public final void rule__ParenthesizedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6893:1: ( rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2 )
            // InternalIoTDevice.g:6894:2: rule__ParenthesizedExpression__Group__1__Impl rule__ParenthesizedExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__ParenthesizedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__1"


    // $ANTLR start "rule__ParenthesizedExpression__Group__1__Impl"
    // InternalIoTDevice.g:6901:1: rule__ParenthesizedExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesizedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6905:1: ( ( ruleExpression ) )
            // InternalIoTDevice.g:6906:1: ( ruleExpression )
            {
            // InternalIoTDevice.g:6906:1: ( ruleExpression )
            // InternalIoTDevice.g:6907:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1()); 
            }

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedExpression__Group__2"
    // InternalIoTDevice.g:6918:1: rule__ParenthesizedExpression__Group__2 : rule__ParenthesizedExpression__Group__2__Impl ;
    public final void rule__ParenthesizedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6922:1: ( rule__ParenthesizedExpression__Group__2__Impl )
            // InternalIoTDevice.g:6923:2: rule__ParenthesizedExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParenthesizedExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__2"


    // $ANTLR start "rule__ParenthesizedExpression__Group__2__Impl"
    // InternalIoTDevice.g:6929:1: rule__ParenthesizedExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6933:1: ( ( ')' ) )
            // InternalIoTDevice.g:6934:1: ( ')' )
            {
            // InternalIoTDevice.g:6934:1: ( ')' )
            // InternalIoTDevice.g:6935:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2()); 
            }

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
    // $ANTLR end "rule__ParenthesizedExpression__Group__2__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_0__0"
    // InternalIoTDevice.g:6954:1: rule__LiteralExpression__Group_0__0 : rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1 ;
    public final void rule__LiteralExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6958:1: ( rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1 )
            // InternalIoTDevice.g:6959:2: rule__LiteralExpression__Group_0__0__Impl rule__LiteralExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_65);
            rule__LiteralExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_0__0"


    // $ANTLR start "rule__LiteralExpression__Group_0__0__Impl"
    // InternalIoTDevice.g:6966:1: rule__LiteralExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6970:1: ( ( () ) )
            // InternalIoTDevice.g:6971:1: ( () )
            {
            // InternalIoTDevice.g:6971:1: ( () )
            // InternalIoTDevice.g:6972:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getIntegerLiteralAction_0_0()); 
            }
            // InternalIoTDevice.g:6973:1: ()
            // InternalIoTDevice.g:6975:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getIntegerLiteralAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_0__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_0__1"
    // InternalIoTDevice.g:6985:1: rule__LiteralExpression__Group_0__1 : rule__LiteralExpression__Group_0__1__Impl ;
    public final void rule__LiteralExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:6989:1: ( rule__LiteralExpression__Group_0__1__Impl )
            // InternalIoTDevice.g:6990:2: rule__LiteralExpression__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_0__1"


    // $ANTLR start "rule__LiteralExpression__Group_0__1__Impl"
    // InternalIoTDevice.g:6996:1: rule__LiteralExpression__Group_0__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__LiteralExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7000:1: ( ( ( rule__LiteralExpression__ValueAssignment_0_1 ) ) )
            // InternalIoTDevice.g:7001:1: ( ( rule__LiteralExpression__ValueAssignment_0_1 ) )
            {
            // InternalIoTDevice.g:7001:1: ( ( rule__LiteralExpression__ValueAssignment_0_1 ) )
            // InternalIoTDevice.g:7002:1: ( rule__LiteralExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalIoTDevice.g:7003:1: ( rule__LiteralExpression__ValueAssignment_0_1 )
            // InternalIoTDevice.g:7003:2: rule__LiteralExpression__ValueAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_0__1__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_1__0"
    // InternalIoTDevice.g:7017:1: rule__LiteralExpression__Group_1__0 : rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1 ;
    public final void rule__LiteralExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7021:1: ( rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1 )
            // InternalIoTDevice.g:7022:2: rule__LiteralExpression__Group_1__0__Impl rule__LiteralExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_66);
            rule__LiteralExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_1__0"


    // $ANTLR start "rule__LiteralExpression__Group_1__0__Impl"
    // InternalIoTDevice.g:7029:1: rule__LiteralExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7033:1: ( ( () ) )
            // InternalIoTDevice.g:7034:1: ( () )
            {
            // InternalIoTDevice.g:7034:1: ( () )
            // InternalIoTDevice.g:7035:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getStringLiteralAction_1_0()); 
            }
            // InternalIoTDevice.g:7036:1: ()
            // InternalIoTDevice.g:7038:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getStringLiteralAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_1__1"
    // InternalIoTDevice.g:7048:1: rule__LiteralExpression__Group_1__1 : rule__LiteralExpression__Group_1__1__Impl ;
    public final void rule__LiteralExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7052:1: ( rule__LiteralExpression__Group_1__1__Impl )
            // InternalIoTDevice.g:7053:2: rule__LiteralExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_1__1"


    // $ANTLR start "rule__LiteralExpression__Group_1__1__Impl"
    // InternalIoTDevice.g:7059:1: rule__LiteralExpression__Group_1__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__LiteralExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7063:1: ( ( ( rule__LiteralExpression__ValueAssignment_1_1 ) ) )
            // InternalIoTDevice.g:7064:1: ( ( rule__LiteralExpression__ValueAssignment_1_1 ) )
            {
            // InternalIoTDevice.g:7064:1: ( ( rule__LiteralExpression__ValueAssignment_1_1 ) )
            // InternalIoTDevice.g:7065:1: ( rule__LiteralExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalIoTDevice.g:7066:1: ( rule__LiteralExpression__ValueAssignment_1_1 )
            // InternalIoTDevice.g:7066:2: rule__LiteralExpression__ValueAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_2__0"
    // InternalIoTDevice.g:7080:1: rule__LiteralExpression__Group_2__0 : rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1 ;
    public final void rule__LiteralExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7084:1: ( rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1 )
            // InternalIoTDevice.g:7085:2: rule__LiteralExpression__Group_2__0__Impl rule__LiteralExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__LiteralExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_2__0"


    // $ANTLR start "rule__LiteralExpression__Group_2__0__Impl"
    // InternalIoTDevice.g:7092:1: rule__LiteralExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7096:1: ( ( () ) )
            // InternalIoTDevice.g:7097:1: ( () )
            {
            // InternalIoTDevice.g:7097:1: ( () )
            // InternalIoTDevice.g:7098:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getEnumLiteralAction_2_0()); 
            }
            // InternalIoTDevice.g:7099:1: ()
            // InternalIoTDevice.g:7101:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getEnumLiteralAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_2__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_2__1"
    // InternalIoTDevice.g:7111:1: rule__LiteralExpression__Group_2__1 : rule__LiteralExpression__Group_2__1__Impl rule__LiteralExpression__Group_2__2 ;
    public final void rule__LiteralExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7115:1: ( rule__LiteralExpression__Group_2__1__Impl rule__LiteralExpression__Group_2__2 )
            // InternalIoTDevice.g:7116:2: rule__LiteralExpression__Group_2__1__Impl rule__LiteralExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_67);
            rule__LiteralExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_2__1"


    // $ANTLR start "rule__LiteralExpression__Group_2__1__Impl"
    // InternalIoTDevice.g:7123:1: rule__LiteralExpression__Group_2__1__Impl : ( ( rule__LiteralExpression__EnumerationAssignment_2_1 ) ) ;
    public final void rule__LiteralExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7127:1: ( ( ( rule__LiteralExpression__EnumerationAssignment_2_1 ) ) )
            // InternalIoTDevice.g:7128:1: ( ( rule__LiteralExpression__EnumerationAssignment_2_1 ) )
            {
            // InternalIoTDevice.g:7128:1: ( ( rule__LiteralExpression__EnumerationAssignment_2_1 ) )
            // InternalIoTDevice.g:7129:1: ( rule__LiteralExpression__EnumerationAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getEnumerationAssignment_2_1()); 
            }
            // InternalIoTDevice.g:7130:1: ( rule__LiteralExpression__EnumerationAssignment_2_1 )
            // InternalIoTDevice.g:7130:2: rule__LiteralExpression__EnumerationAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__EnumerationAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getEnumerationAssignment_2_1()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_2__1__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_2__2"
    // InternalIoTDevice.g:7140:1: rule__LiteralExpression__Group_2__2 : rule__LiteralExpression__Group_2__2__Impl rule__LiteralExpression__Group_2__3 ;
    public final void rule__LiteralExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7144:1: ( rule__LiteralExpression__Group_2__2__Impl rule__LiteralExpression__Group_2__3 )
            // InternalIoTDevice.g:7145:2: rule__LiteralExpression__Group_2__2__Impl rule__LiteralExpression__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__LiteralExpression__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_2__2"


    // $ANTLR start "rule__LiteralExpression__Group_2__2__Impl"
    // InternalIoTDevice.g:7152:1: rule__LiteralExpression__Group_2__2__Impl : ( '::' ) ;
    public final void rule__LiteralExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7156:1: ( ( '::' ) )
            // InternalIoTDevice.g:7157:1: ( '::' )
            {
            // InternalIoTDevice.g:7157:1: ( '::' )
            // InternalIoTDevice.g:7158:1: '::'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getColonColonKeyword_2_2()); 
            }
            match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getColonColonKeyword_2_2()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_2__2__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_2__3"
    // InternalIoTDevice.g:7171:1: rule__LiteralExpression__Group_2__3 : rule__LiteralExpression__Group_2__3__Impl ;
    public final void rule__LiteralExpression__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7175:1: ( rule__LiteralExpression__Group_2__3__Impl )
            // InternalIoTDevice.g:7176:2: rule__LiteralExpression__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_2__3"


    // $ANTLR start "rule__LiteralExpression__Group_2__3__Impl"
    // InternalIoTDevice.g:7182:1: rule__LiteralExpression__Group_2__3__Impl : ( ( rule__LiteralExpression__LiteralAssignment_2_3 ) ) ;
    public final void rule__LiteralExpression__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7186:1: ( ( ( rule__LiteralExpression__LiteralAssignment_2_3 ) ) )
            // InternalIoTDevice.g:7187:1: ( ( rule__LiteralExpression__LiteralAssignment_2_3 ) )
            {
            // InternalIoTDevice.g:7187:1: ( ( rule__LiteralExpression__LiteralAssignment_2_3 ) )
            // InternalIoTDevice.g:7188:1: ( rule__LiteralExpression__LiteralAssignment_2_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getLiteralAssignment_2_3()); 
            }
            // InternalIoTDevice.g:7189:1: ( rule__LiteralExpression__LiteralAssignment_2_3 )
            // InternalIoTDevice.g:7189:2: rule__LiteralExpression__LiteralAssignment_2_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__LiteralAssignment_2_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getLiteralAssignment_2_3()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_2__3__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_3__0"
    // InternalIoTDevice.g:7207:1: rule__LiteralExpression__Group_3__0 : rule__LiteralExpression__Group_3__0__Impl rule__LiteralExpression__Group_3__1 ;
    public final void rule__LiteralExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7211:1: ( rule__LiteralExpression__Group_3__0__Impl rule__LiteralExpression__Group_3__1 )
            // InternalIoTDevice.g:7212:2: rule__LiteralExpression__Group_3__0__Impl rule__LiteralExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_68);
            rule__LiteralExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_3__0"


    // $ANTLR start "rule__LiteralExpression__Group_3__0__Impl"
    // InternalIoTDevice.g:7219:1: rule__LiteralExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7223:1: ( ( () ) )
            // InternalIoTDevice.g:7224:1: ( () )
            {
            // InternalIoTDevice.g:7224:1: ( () )
            // InternalIoTDevice.g:7225:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getCollectionLiteralAction_3_0()); 
            }
            // InternalIoTDevice.g:7226:1: ()
            // InternalIoTDevice.g:7228:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getCollectionLiteralAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_3__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_3__1"
    // InternalIoTDevice.g:7238:1: rule__LiteralExpression__Group_3__1 : rule__LiteralExpression__Group_3__1__Impl rule__LiteralExpression__Group_3__2 ;
    public final void rule__LiteralExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7242:1: ( rule__LiteralExpression__Group_3__1__Impl rule__LiteralExpression__Group_3__2 )
            // InternalIoTDevice.g:7243:2: rule__LiteralExpression__Group_3__1__Impl rule__LiteralExpression__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__LiteralExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_3__1"


    // $ANTLR start "rule__LiteralExpression__Group_3__1__Impl"
    // InternalIoTDevice.g:7250:1: rule__LiteralExpression__Group_3__1__Impl : ( '[' ) ;
    public final void rule__LiteralExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7254:1: ( ( '[' ) )
            // InternalIoTDevice.g:7255:1: ( '[' )
            {
            // InternalIoTDevice.g:7255:1: ( '[' )
            // InternalIoTDevice.g:7256:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getLeftSquareBracketKeyword_3_1()); 
            }
            match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getLeftSquareBracketKeyword_3_1()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_3__1__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_3__2"
    // InternalIoTDevice.g:7269:1: rule__LiteralExpression__Group_3__2 : rule__LiteralExpression__Group_3__2__Impl rule__LiteralExpression__Group_3__3 ;
    public final void rule__LiteralExpression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7273:1: ( rule__LiteralExpression__Group_3__2__Impl rule__LiteralExpression__Group_3__3 )
            // InternalIoTDevice.g:7274:2: rule__LiteralExpression__Group_3__2__Impl rule__LiteralExpression__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_69);
            rule__LiteralExpression__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_3__2"


    // $ANTLR start "rule__LiteralExpression__Group_3__2__Impl"
    // InternalIoTDevice.g:7281:1: rule__LiteralExpression__Group_3__2__Impl : ( ( rule__LiteralExpression__ValueAssignment_3_2 ) ) ;
    public final void rule__LiteralExpression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7285:1: ( ( ( rule__LiteralExpression__ValueAssignment_3_2 ) ) )
            // InternalIoTDevice.g:7286:1: ( ( rule__LiteralExpression__ValueAssignment_3_2 ) )
            {
            // InternalIoTDevice.g:7286:1: ( ( rule__LiteralExpression__ValueAssignment_3_2 ) )
            // InternalIoTDevice.g:7287:1: ( rule__LiteralExpression__ValueAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_3_2()); 
            }
            // InternalIoTDevice.g:7288:1: ( rule__LiteralExpression__ValueAssignment_3_2 )
            // InternalIoTDevice.g:7288:2: rule__LiteralExpression__ValueAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__ValueAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_3_2()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_3__2__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_3__3"
    // InternalIoTDevice.g:7298:1: rule__LiteralExpression__Group_3__3 : rule__LiteralExpression__Group_3__3__Impl rule__LiteralExpression__Group_3__4 ;
    public final void rule__LiteralExpression__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7302:1: ( rule__LiteralExpression__Group_3__3__Impl rule__LiteralExpression__Group_3__4 )
            // InternalIoTDevice.g:7303:2: rule__LiteralExpression__Group_3__3__Impl rule__LiteralExpression__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_69);
            rule__LiteralExpression__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_3__3"


    // $ANTLR start "rule__LiteralExpression__Group_3__3__Impl"
    // InternalIoTDevice.g:7310:1: rule__LiteralExpression__Group_3__3__Impl : ( ( rule__LiteralExpression__Group_3_3__0 )* ) ;
    public final void rule__LiteralExpression__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7314:1: ( ( ( rule__LiteralExpression__Group_3_3__0 )* ) )
            // InternalIoTDevice.g:7315:1: ( ( rule__LiteralExpression__Group_3_3__0 )* )
            {
            // InternalIoTDevice.g:7315:1: ( ( rule__LiteralExpression__Group_3_3__0 )* )
            // InternalIoTDevice.g:7316:1: ( rule__LiteralExpression__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getGroup_3_3()); 
            }
            // InternalIoTDevice.g:7317:1: ( rule__LiteralExpression__Group_3_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==40) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalIoTDevice.g:7317:2: rule__LiteralExpression__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__LiteralExpression__Group_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getGroup_3_3()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_3__3__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_3__4"
    // InternalIoTDevice.g:7327:1: rule__LiteralExpression__Group_3__4 : rule__LiteralExpression__Group_3__4__Impl ;
    public final void rule__LiteralExpression__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7331:1: ( rule__LiteralExpression__Group_3__4__Impl )
            // InternalIoTDevice.g:7332:2: rule__LiteralExpression__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_3__4"


    // $ANTLR start "rule__LiteralExpression__Group_3__4__Impl"
    // InternalIoTDevice.g:7338:1: rule__LiteralExpression__Group_3__4__Impl : ( ']' ) ;
    public final void rule__LiteralExpression__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7342:1: ( ( ']' ) )
            // InternalIoTDevice.g:7343:1: ( ']' )
            {
            // InternalIoTDevice.g:7343:1: ( ']' )
            // InternalIoTDevice.g:7344:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getRightSquareBracketKeyword_3_4()); 
            }
            match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getRightSquareBracketKeyword_3_4()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_3__4__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_3_3__0"
    // InternalIoTDevice.g:7367:1: rule__LiteralExpression__Group_3_3__0 : rule__LiteralExpression__Group_3_3__0__Impl rule__LiteralExpression__Group_3_3__1 ;
    public final void rule__LiteralExpression__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7371:1: ( rule__LiteralExpression__Group_3_3__0__Impl rule__LiteralExpression__Group_3_3__1 )
            // InternalIoTDevice.g:7372:2: rule__LiteralExpression__Group_3_3__0__Impl rule__LiteralExpression__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__LiteralExpression__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_3_3__0"


    // $ANTLR start "rule__LiteralExpression__Group_3_3__0__Impl"
    // InternalIoTDevice.g:7379:1: rule__LiteralExpression__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__LiteralExpression__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7383:1: ( ( ',' ) )
            // InternalIoTDevice.g:7384:1: ( ',' )
            {
            // InternalIoTDevice.g:7384:1: ( ',' )
            // InternalIoTDevice.g:7385:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getCommaKeyword_3_3_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getCommaKeyword_3_3_0()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_3_3__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_3_3__1"
    // InternalIoTDevice.g:7398:1: rule__LiteralExpression__Group_3_3__1 : rule__LiteralExpression__Group_3_3__1__Impl ;
    public final void rule__LiteralExpression__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7402:1: ( rule__LiteralExpression__Group_3_3__1__Impl )
            // InternalIoTDevice.g:7403:2: rule__LiteralExpression__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_3_3__1"


    // $ANTLR start "rule__LiteralExpression__Group_3_3__1__Impl"
    // InternalIoTDevice.g:7409:1: rule__LiteralExpression__Group_3_3__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_3_3_1 ) ) ;
    public final void rule__LiteralExpression__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7413:1: ( ( ( rule__LiteralExpression__ValueAssignment_3_3_1 ) ) )
            // InternalIoTDevice.g:7414:1: ( ( rule__LiteralExpression__ValueAssignment_3_3_1 ) )
            {
            // InternalIoTDevice.g:7414:1: ( ( rule__LiteralExpression__ValueAssignment_3_3_1 ) )
            // InternalIoTDevice.g:7415:1: ( rule__LiteralExpression__ValueAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_3_3_1()); 
            }
            // InternalIoTDevice.g:7416:1: ( rule__LiteralExpression__ValueAssignment_3_3_1 )
            // InternalIoTDevice.g:7416:2: rule__LiteralExpression__ValueAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__ValueAssignment_3_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_3_3_1()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_3_3__1__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_4__0"
    // InternalIoTDevice.g:7430:1: rule__LiteralExpression__Group_4__0 : rule__LiteralExpression__Group_4__0__Impl rule__LiteralExpression__Group_4__1 ;
    public final void rule__LiteralExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7434:1: ( rule__LiteralExpression__Group_4__0__Impl rule__LiteralExpression__Group_4__1 )
            // InternalIoTDevice.g:7435:2: rule__LiteralExpression__Group_4__0__Impl rule__LiteralExpression__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_70);
            rule__LiteralExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_4__0"


    // $ANTLR start "rule__LiteralExpression__Group_4__0__Impl"
    // InternalIoTDevice.g:7442:1: rule__LiteralExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7446:1: ( ( () ) )
            // InternalIoTDevice.g:7447:1: ( () )
            {
            // InternalIoTDevice.g:7447:1: ( () )
            // InternalIoTDevice.g:7448:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralAction_4_0()); 
            }
            // InternalIoTDevice.g:7449:1: ()
            // InternalIoTDevice.g:7451:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group_4__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group_4__1"
    // InternalIoTDevice.g:7461:1: rule__LiteralExpression__Group_4__1 : rule__LiteralExpression__Group_4__1__Impl ;
    public final void rule__LiteralExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7465:1: ( rule__LiteralExpression__Group_4__1__Impl )
            // InternalIoTDevice.g:7466:2: rule__LiteralExpression__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__LiteralExpression__Group_4__1"


    // $ANTLR start "rule__LiteralExpression__Group_4__1__Impl"
    // InternalIoTDevice.g:7472:1: rule__LiteralExpression__Group_4__1__Impl : ( ( rule__LiteralExpression__Alternatives_4_1 ) ) ;
    public final void rule__LiteralExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7476:1: ( ( ( rule__LiteralExpression__Alternatives_4_1 ) ) )
            // InternalIoTDevice.g:7477:1: ( ( rule__LiteralExpression__Alternatives_4_1 ) )
            {
            // InternalIoTDevice.g:7477:1: ( ( rule__LiteralExpression__Alternatives_4_1 ) )
            // InternalIoTDevice.g:7478:1: ( rule__LiteralExpression__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getAlternatives_4_1()); 
            }
            // InternalIoTDevice.g:7479:1: ( rule__LiteralExpression__Alternatives_4_1 )
            // InternalIoTDevice.g:7479:2: rule__LiteralExpression__Alternatives_4_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Alternatives_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getAlternatives_4_1()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__Group_4__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalIoTDevice.g:7493:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7497:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIoTDevice.g:7498:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_62);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalIoTDevice.g:7505:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7509:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7510:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7510:1: ( ruleValidID )
            // InternalIoTDevice.g:7511:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalIoTDevice.g:7522:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7526:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIoTDevice.g:7527:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalIoTDevice.g:7533:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7537:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIoTDevice.g:7538:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIoTDevice.g:7538:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIoTDevice.g:7539:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalIoTDevice.g:7540:1: ( rule__QualifiedName__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==53) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalIoTDevice.g:7540:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalIoTDevice.g:7554:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7558:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIoTDevice.g:7559:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalIoTDevice.g:7566:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7570:1: ( ( ( '.' ) ) )
            // InternalIoTDevice.g:7571:1: ( ( '.' ) )
            {
            // InternalIoTDevice.g:7571:1: ( ( '.' ) )
            // InternalIoTDevice.g:7572:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalIoTDevice.g:7573:1: ( '.' )
            // InternalIoTDevice.g:7574:2: '.'
            {
            match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalIoTDevice.g:7585:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7589:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIoTDevice.g:7590:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalIoTDevice.g:7596:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7600:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7601:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7601:1: ( ruleValidID )
            // InternalIoTDevice.g:7602:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__IoTModel__TypesAssignment_1"
    // InternalIoTDevice.g:7618:1: rule__IoTModel__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__IoTModel__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7622:1: ( ( ruleType ) )
            // InternalIoTDevice.g:7623:1: ( ruleType )
            {
            // InternalIoTDevice.g:7623:1: ( ruleType )
            // InternalIoTDevice.g:7624:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getTypesTypeParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelAccess().getTypesTypeParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__IoTModel__TypesAssignment_1"


    // $ANTLR start "rule__IoTModel__ConfigurationAssignment_2"
    // InternalIoTDevice.g:7633:1: rule__IoTModel__ConfigurationAssignment_2 : ( ruleNetworkConfiguration ) ;
    public final void rule__IoTModel__ConfigurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7637:1: ( ( ruleNetworkConfiguration ) )
            // InternalIoTDevice.g:7638:1: ( ruleNetworkConfiguration )
            {
            // InternalIoTDevice.g:7638:1: ( ruleNetworkConfiguration )
            // InternalIoTDevice.g:7639:1: ruleNetworkConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getConfigurationNetworkConfigurationParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNetworkConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelAccess().getConfigurationNetworkConfigurationParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__IoTModel__ConfigurationAssignment_2"


    // $ANTLR start "rule__IoTModel__RulesAssignment_3"
    // InternalIoTDevice.g:7648:1: rule__IoTModel__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__IoTModel__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7652:1: ( ( ruleRule ) )
            // InternalIoTDevice.g:7653:1: ( ruleRule )
            {
            // InternalIoTDevice.g:7653:1: ( ruleRule )
            // InternalIoTDevice.g:7654:1: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getRulesRuleParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelAccess().getRulesRuleParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__IoTModel__RulesAssignment_3"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalIoTDevice.g:7663:1: rule__Enumeration__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7667:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7668:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7668:1: ( ruleValidID )
            // InternalIoTDevice.g:7669:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getNameValidIDParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_3_0"
    // InternalIoTDevice.g:7678:1: rule__Enumeration__LiteralsAssignment_3_0 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7682:1: ( ( ruleEnumerationLiteral ) )
            // InternalIoTDevice.g:7683:1: ( ruleEnumerationLiteral )
            {
            // InternalIoTDevice.g:7683:1: ( ruleEnumerationLiteral )
            // InternalIoTDevice.g:7684:1: ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0_0()); 
            }

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
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_3_0"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_1"
    // InternalIoTDevice.g:7693:1: rule__EnumerationLiteral__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7697:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7698:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7698:1: ( ruleValidID )
            // InternalIoTDevice.g:7699:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralAccess().getNameValidIDParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_1"


    // $ANTLR start "rule__Cloud__NameAssignment_2"
    // InternalIoTDevice.g:7708:1: rule__Cloud__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Cloud__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7712:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7713:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7713:1: ( ruleValidID )
            // InternalIoTDevice.g:7714:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCloudAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCloudAccess().getNameValidIDParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Cloud__NameAssignment_2"


    // $ANTLR start "rule__Gateway__NameAssignment_2"
    // InternalIoTDevice.g:7723:1: rule__Gateway__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Gateway__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7727:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7728:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7728:1: ( ruleValidID )
            // InternalIoTDevice.g:7729:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGatewayAccess().getNameValidIDParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Gateway__NameAssignment_2"


    // $ANTLR start "rule__Router__NameAssignment_2"
    // InternalIoTDevice.g:7738:1: rule__Router__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Router__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7742:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7743:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7743:1: ( ruleValidID )
            // InternalIoTDevice.g:7744:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRouterAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRouterAccess().getNameValidIDParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Router__NameAssignment_2"


    // $ANTLR start "rule__Device__NameAssignment_2"
    // InternalIoTDevice.g:7753:1: rule__Device__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Device__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7757:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7758:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7758:1: ( ruleValidID )
            // InternalIoTDevice.g:7759:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getNameValidIDParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Device__NameAssignment_2"


    // $ANTLR start "rule__Device__FeaturesAssignment_4"
    // InternalIoTDevice.g:7768:1: rule__Device__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Device__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7772:1: ( ( ruleFeature ) )
            // InternalIoTDevice.g:7773:1: ( ruleFeature )
            {
            // InternalIoTDevice.g:7773:1: ( ruleFeature )
            // InternalIoTDevice.g:7774:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__Device__FeaturesAssignment_4"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalIoTDevice.g:7783:1: rule__Property__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7787:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7788:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7788:1: ( ruleValidID )
            // InternalIoTDevice.g:7789:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__TypeAssignment_3"
    // InternalIoTDevice.g:7798:1: rule__Property__TypeAssignment_3 : ( ruleTypeReference ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7802:1: ( ( ruleTypeReference ) )
            // InternalIoTDevice.g:7803:1: ( ruleTypeReference )
            {
            // InternalIoTDevice.g:7803:1: ( ruleTypeReference )
            // InternalIoTDevice.g:7804:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeReferenceParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTypeReferenceParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Property__TypeAssignment_3"


    // $ANTLR start "rule__Sensing__NameAssignment_2"
    // InternalIoTDevice.g:7813:1: rule__Sensing__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Sensing__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7817:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7818:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7818:1: ( ruleValidID )
            // InternalIoTDevice.g:7819:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getNameValidIDParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Sensing__NameAssignment_2"


    // $ANTLR start "rule__Sensing__ParametersAssignment_4_0"
    // InternalIoTDevice.g:7828:1: rule__Sensing__ParametersAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Sensing__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7832:1: ( ( ruleParameter ) )
            // InternalIoTDevice.g:7833:1: ( ruleParameter )
            {
            // InternalIoTDevice.g:7833:1: ( ruleParameter )
            // InternalIoTDevice.g:7834:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getParametersParameterParserRuleCall_4_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getParametersParameterParserRuleCall_4_0_0()); 
            }

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
    // $ANTLR end "rule__Sensing__ParametersAssignment_4_0"


    // $ANTLR start "rule__Sensing__ParametersAssignment_4_1_1"
    // InternalIoTDevice.g:7843:1: rule__Sensing__ParametersAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Sensing__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7847:1: ( ( ruleParameter ) )
            // InternalIoTDevice.g:7848:1: ( ruleParameter )
            {
            // InternalIoTDevice.g:7848:1: ( ruleParameter )
            // InternalIoTDevice.g:7849:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensingAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensingAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
            }

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
    // $ANTLR end "rule__Sensing__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__Actuating__NameAssignment_2"
    // InternalIoTDevice.g:7858:1: rule__Actuating__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Actuating__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7862:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7863:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7863:1: ( ruleValidID )
            // InternalIoTDevice.g:7864:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getNameValidIDParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Actuating__NameAssignment_2"


    // $ANTLR start "rule__Actuating__ParametersAssignment_4_0"
    // InternalIoTDevice.g:7873:1: rule__Actuating__ParametersAssignment_4_0 : ( ruleParameter ) ;
    public final void rule__Actuating__ParametersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7877:1: ( ( ruleParameter ) )
            // InternalIoTDevice.g:7878:1: ( ruleParameter )
            {
            // InternalIoTDevice.g:7878:1: ( ruleParameter )
            // InternalIoTDevice.g:7879:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getParametersParameterParserRuleCall_4_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getParametersParameterParserRuleCall_4_0_0()); 
            }

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
    // $ANTLR end "rule__Actuating__ParametersAssignment_4_0"


    // $ANTLR start "rule__Actuating__ParametersAssignment_4_1_1"
    // InternalIoTDevice.g:7888:1: rule__Actuating__ParametersAssignment_4_1_1 : ( ruleParameter ) ;
    public final void rule__Actuating__ParametersAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7892:1: ( ( ruleParameter ) )
            // InternalIoTDevice.g:7893:1: ( ruleParameter )
            {
            // InternalIoTDevice.g:7893:1: ( ruleParameter )
            // InternalIoTDevice.g:7894:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActuatingAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActuatingAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
            }

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
    // $ANTLR end "rule__Actuating__ParametersAssignment_4_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalIoTDevice.g:7903:1: rule__Parameter__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7907:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:7908:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:7908:1: ( ruleValidID )
            // InternalIoTDevice.g:7909:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalIoTDevice.g:7918:1: rule__Parameter__TypeAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7922:1: ( ( ruleTypeReference ) )
            // InternalIoTDevice.g:7923:1: ( ruleTypeReference )
            {
            // InternalIoTDevice.g:7923:1: ( ruleTypeReference )
            // InternalIoTDevice.g:7924:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeTypeReferenceParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__TypeReference__PtypeAssignment_0"
    // InternalIoTDevice.g:7933:1: rule__TypeReference__PtypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__TypeReference__PtypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7937:1: ( ( rulePrimitiveType ) )
            // InternalIoTDevice.g:7938:1: ( rulePrimitiveType )
            {
            // InternalIoTDevice.g:7938:1: ( rulePrimitiveType )
            // InternalIoTDevice.g:7939:1: rulePrimitiveType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getPtypePrimitiveTypeParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getPtypePrimitiveTypeParserRuleCall_0_0()); 
            }

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
    // $ANTLR end "rule__TypeReference__PtypeAssignment_0"


    // $ANTLR start "rule__TypeReference__DtypeAssignment_1"
    // InternalIoTDevice.g:7948:1: rule__TypeReference__DtypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeReference__DtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7952:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIoTDevice.g:7953:1: ( ( ruleQualifiedName ) )
            {
            // InternalIoTDevice.g:7953:1: ( ( ruleQualifiedName ) )
            // InternalIoTDevice.g:7954:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getDtypeDeclaredTypeCrossReference_1_0()); 
            }
            // InternalIoTDevice.g:7955:1: ( ruleQualifiedName )
            // InternalIoTDevice.g:7956:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getDtypeDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getDtypeDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getDtypeDeclaredTypeCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__TypeReference__DtypeAssignment_1"


    // $ANTLR start "rule__IntegerType__NameAssignment_1"
    // InternalIoTDevice.g:7967:1: rule__IntegerType__NameAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__IntegerType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7971:1: ( ( ( 'integer' ) ) )
            // InternalIoTDevice.g:7972:1: ( ( 'integer' ) )
            {
            // InternalIoTDevice.g:7972:1: ( ( 'integer' ) )
            // InternalIoTDevice.g:7973:1: ( 'integer' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getNameIntegerKeyword_1_0()); 
            }
            // InternalIoTDevice.g:7974:1: ( 'integer' )
            // InternalIoTDevice.g:7975:1: 'integer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getNameIntegerKeyword_1_0()); 
            }
            match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerTypeAccess().getNameIntegerKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerTypeAccess().getNameIntegerKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__IntegerType__NameAssignment_1"


    // $ANTLR start "rule__BooleanType__NameAssignment_1"
    // InternalIoTDevice.g:7990:1: rule__BooleanType__NameAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:7994:1: ( ( ( 'boolean' ) ) )
            // InternalIoTDevice.g:7995:1: ( ( 'boolean' ) )
            {
            // InternalIoTDevice.g:7995:1: ( ( 'boolean' ) )
            // InternalIoTDevice.g:7996:1: ( 'boolean' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getNameBooleanKeyword_1_0()); 
            }
            // InternalIoTDevice.g:7997:1: ( 'boolean' )
            // InternalIoTDevice.g:7998:1: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getNameBooleanKeyword_1_0()); 
            }
            match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanTypeAccess().getNameBooleanKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanTypeAccess().getNameBooleanKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__BooleanType__NameAssignment_1"


    // $ANTLR start "rule__StringType__NameAssignment_1"
    // InternalIoTDevice.g:8013:1: rule__StringType__NameAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__StringType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8017:1: ( ( ( 'string' ) ) )
            // InternalIoTDevice.g:8018:1: ( ( 'string' ) )
            {
            // InternalIoTDevice.g:8018:1: ( ( 'string' ) )
            // InternalIoTDevice.g:8019:1: ( 'string' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 
            }
            // InternalIoTDevice.g:8020:1: ( 'string' )
            // InternalIoTDevice.g:8021:1: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 
            }
            match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__StringType__NameAssignment_1"


    // $ANTLR start "rule__RealType__NameAssignment_1"
    // InternalIoTDevice.g:8036:1: rule__RealType__NameAssignment_1 : ( ( 'real' ) ) ;
    public final void rule__RealType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8040:1: ( ( ( 'real' ) ) )
            // InternalIoTDevice.g:8041:1: ( ( 'real' ) )
            {
            // InternalIoTDevice.g:8041:1: ( ( 'real' ) )
            // InternalIoTDevice.g:8042:1: ( 'real' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getNameRealKeyword_1_0()); 
            }
            // InternalIoTDevice.g:8043:1: ( 'real' )
            // InternalIoTDevice.g:8044:1: 'real'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getNameRealKeyword_1_0()); 
            }
            match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealTypeAccess().getNameRealKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealTypeAccess().getNameRealKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__RealType__NameAssignment_1"


    // $ANTLR start "rule__NetworkConfiguration__NameAssignment_2"
    // InternalIoTDevice.g:8059:1: rule__NetworkConfiguration__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__NetworkConfiguration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8063:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8064:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:8064:1: ( ruleValidID )
            // InternalIoTDevice.g:8065:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getNameValidIDParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__NameAssignment_2"


    // $ANTLR start "rule__NetworkConfiguration__NodesAssignment_4"
    // InternalIoTDevice.g:8074:1: rule__NetworkConfiguration__NodesAssignment_4 : ( ruleNodeInstance ) ;
    public final void rule__NetworkConfiguration__NodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8078:1: ( ( ruleNodeInstance ) )
            // InternalIoTDevice.g:8079:1: ( ruleNodeInstance )
            {
            // InternalIoTDevice.g:8079:1: ( ruleNodeInstance )
            // InternalIoTDevice.g:8080:1: ruleNodeInstance
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getNodesNodeInstanceParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNodeInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getNodesNodeInstanceParserRuleCall_4_0()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__NodesAssignment_4"


    // $ANTLR start "rule__NetworkConfiguration__PathsAssignment_5"
    // InternalIoTDevice.g:8089:1: rule__NetworkConfiguration__PathsAssignment_5 : ( ruleCommunicationPath ) ;
    public final void rule__NetworkConfiguration__PathsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8093:1: ( ( ruleCommunicationPath ) )
            // InternalIoTDevice.g:8094:1: ( ruleCommunicationPath )
            {
            // InternalIoTDevice.g:8094:1: ( ruleCommunicationPath )
            // InternalIoTDevice.g:8095:1: ruleCommunicationPath
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getPathsCommunicationPathParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCommunicationPath();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getPathsCommunicationPathParserRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__PathsAssignment_5"


    // $ANTLR start "rule__NetworkConfiguration__VariablesAssignment_6"
    // InternalIoTDevice.g:8104:1: rule__NetworkConfiguration__VariablesAssignment_6 : ( ruleVariableDeclaration ) ;
    public final void rule__NetworkConfiguration__VariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8108:1: ( ( ruleVariableDeclaration ) )
            // InternalIoTDevice.g:8109:1: ( ruleVariableDeclaration )
            {
            // InternalIoTDevice.g:8109:1: ( ruleVariableDeclaration )
            // InternalIoTDevice.g:8110:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNetworkConfigurationAccess().getVariablesVariableDeclarationParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNetworkConfigurationAccess().getVariablesVariableDeclarationParserRuleCall_6_0()); 
            }

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
    // $ANTLR end "rule__NetworkConfiguration__VariablesAssignment_6"


    // $ANTLR start "rule__NodeInstance__NameAssignment_1"
    // InternalIoTDevice.g:8119:1: rule__NodeInstance__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__NodeInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8123:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8124:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:8124:1: ( ruleValidID )
            // InternalIoTDevice.g:8125:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceAccess().getNameValidIDParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__NodeInstance__NameAssignment_1"


    // $ANTLR start "rule__NodeInstance__TypeAssignment_3"
    // InternalIoTDevice.g:8134:1: rule__NodeInstance__TypeAssignment_3 : ( ( ruleValidID ) ) ;
    public final void rule__NodeInstance__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8138:1: ( ( ( ruleValidID ) ) )
            // InternalIoTDevice.g:8139:1: ( ( ruleValidID ) )
            {
            // InternalIoTDevice.g:8139:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8140:1: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceAccess().getTypeNodeCrossReference_3_0()); 
            }
            // InternalIoTDevice.g:8141:1: ( ruleValidID )
            // InternalIoTDevice.g:8142:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeInstanceAccess().getTypeNodeValidIDParserRuleCall_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceAccess().getTypeNodeValidIDParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeInstanceAccess().getTypeNodeCrossReference_3_0()); 
            }

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
    // $ANTLR end "rule__NodeInstance__TypeAssignment_3"


    // $ANTLR start "rule__CommunicationPath__SrcAssignment_1"
    // InternalIoTDevice.g:8153:1: rule__CommunicationPath__SrcAssignment_1 : ( ( ruleValidID ) ) ;
    public final void rule__CommunicationPath__SrcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8157:1: ( ( ( ruleValidID ) ) )
            // InternalIoTDevice.g:8158:1: ( ( ruleValidID ) )
            {
            // InternalIoTDevice.g:8158:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8159:1: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getSrcNodeInstanceCrossReference_1_0()); 
            }
            // InternalIoTDevice.g:8160:1: ( ruleValidID )
            // InternalIoTDevice.g:8161:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getSrcNodeInstanceValidIDParserRuleCall_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getSrcNodeInstanceValidIDParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getSrcNodeInstanceCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__SrcAssignment_1"


    // $ANTLR start "rule__CommunicationPath__TgtAssignment_3"
    // InternalIoTDevice.g:8172:1: rule__CommunicationPath__TgtAssignment_3 : ( ( ruleValidID ) ) ;
    public final void rule__CommunicationPath__TgtAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8176:1: ( ( ( ruleValidID ) ) )
            // InternalIoTDevice.g:8177:1: ( ( ruleValidID ) )
            {
            // InternalIoTDevice.g:8177:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8178:1: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getTgtNodeInstanceCrossReference_3_0()); 
            }
            // InternalIoTDevice.g:8179:1: ( ruleValidID )
            // InternalIoTDevice.g:8180:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getTgtNodeInstanceValidIDParserRuleCall_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getTgtNodeInstanceValidIDParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getTgtNodeInstanceCrossReference_3_0()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__TgtAssignment_3"


    // $ANTLR start "rule__CommunicationPath__ProtocolAssignment_5"
    // InternalIoTDevice.g:8191:1: rule__CommunicationPath__ProtocolAssignment_5 : ( ruleProtocol ) ;
    public final void rule__CommunicationPath__ProtocolAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8195:1: ( ( ruleProtocol ) )
            // InternalIoTDevice.g:8196:1: ( ruleProtocol )
            {
            // InternalIoTDevice.g:8196:1: ( ruleProtocol )
            // InternalIoTDevice.g:8197:1: ruleProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommunicationPathAccess().getProtocolProtocolEnumRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommunicationPathAccess().getProtocolProtocolEnumRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__CommunicationPath__ProtocolAssignment_5"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalIoTDevice.g:8206:1: rule__VariableDeclaration__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8210:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8211:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:8211:1: ( ruleValidID )
            // InternalIoTDevice.g:8212:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__InitAssignment_3"
    // InternalIoTDevice.g:8221:1: rule__VariableDeclaration__InitAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableDeclaration__InitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8225:1: ( ( ruleExpression ) )
            // InternalIoTDevice.g:8226:1: ( ruleExpression )
            {
            // InternalIoTDevice.g:8226:1: ( ruleExpression )
            // InternalIoTDevice.g:8227:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getInitExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getInitExpressionParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__VariableDeclaration__InitAssignment_3"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalIoTDevice.g:8236:1: rule__Rule__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8240:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8241:1: ( ruleValidID )
            {
            // InternalIoTDevice.g:8241:1: ( ruleValidID )
            // InternalIoTDevice.g:8242:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getNameValidIDParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__TriggerAssignment_5"
    // InternalIoTDevice.g:8251:1: rule__Rule__TriggerAssignment_5 : ( ruleExpression ) ;
    public final void rule__Rule__TriggerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8255:1: ( ( ruleExpression ) )
            // InternalIoTDevice.g:8256:1: ( ruleExpression )
            {
            // InternalIoTDevice.g:8256:1: ( ruleExpression )
            // InternalIoTDevice.g:8257:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getTriggerExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getTriggerExpressionParserRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__Rule__TriggerAssignment_5"


    // $ANTLR start "rule__Rule__ReactionAssignment_9"
    // InternalIoTDevice.g:8266:1: rule__Rule__ReactionAssignment_9 : ( ruleReaction ) ;
    public final void rule__Rule__ReactionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8270:1: ( ( ruleReaction ) )
            // InternalIoTDevice.g:8271:1: ( ruleReaction )
            {
            // InternalIoTDevice.g:8271:1: ( ruleReaction )
            // InternalIoTDevice.g:8272:1: ruleReaction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getReactionReactionParserRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleReaction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getReactionReactionParserRuleCall_9_0()); 
            }

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
    // $ANTLR end "rule__Rule__ReactionAssignment_9"


    // $ANTLR start "rule__ParallelComposition__RhsAssignment_1_2"
    // InternalIoTDevice.g:8281:1: rule__ParallelComposition__RhsAssignment_1_2 : ( ruleSeqComposition ) ;
    public final void rule__ParallelComposition__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8285:1: ( ( ruleSeqComposition ) )
            // InternalIoTDevice.g:8286:1: ( ruleSeqComposition )
            {
            // InternalIoTDevice.g:8286:1: ( ruleSeqComposition )
            // InternalIoTDevice.g:8287:1: ruleSeqComposition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParallelCompositionAccess().getRhsSeqCompositionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSeqComposition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParallelCompositionAccess().getRhsSeqCompositionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__ParallelComposition__RhsAssignment_1_2"


    // $ANTLR start "rule__SeqComposition__RhsAssignment_1_2"
    // InternalIoTDevice.g:8296:1: rule__SeqComposition__RhsAssignment_1_2 : ( ruleSimpleReaction ) ;
    public final void rule__SeqComposition__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8300:1: ( ( ruleSimpleReaction ) )
            // InternalIoTDevice.g:8301:1: ( ruleSimpleReaction )
            {
            // InternalIoTDevice.g:8301:1: ( ruleSimpleReaction )
            // InternalIoTDevice.g:8302:1: ruleSimpleReaction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeqCompositionAccess().getRhsSimpleReactionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSimpleReaction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeqCompositionAccess().getRhsSimpleReactionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__SeqComposition__RhsAssignment_1_2"


    // $ANTLR start "rule__SimpleReaction__ExpAssignment"
    // InternalIoTDevice.g:8311:1: rule__SimpleReaction__ExpAssignment : ( ruleExpression ) ;
    public final void rule__SimpleReaction__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8315:1: ( ( ruleExpression ) )
            // InternalIoTDevice.g:8316:1: ( ruleExpression )
            {
            // InternalIoTDevice.g:8316:1: ( ruleExpression )
            // InternalIoTDevice.g:8317:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleReactionAccess().getExpExpressionParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleReactionAccess().getExpExpressionParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__SimpleReaction__ExpAssignment"


    // $ANTLR start "rule__OrExpression__OpAssignment_1_1"
    // InternalIoTDevice.g:8326:1: rule__OrExpression__OpAssignment_1_1 : ( ( 'or' ) ) ;
    public final void rule__OrExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8330:1: ( ( ( 'or' ) ) )
            // InternalIoTDevice.g:8331:1: ( ( 'or' ) )
            {
            // InternalIoTDevice.g:8331:1: ( ( 'or' ) )
            // InternalIoTDevice.g:8332:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOrKeyword_1_1_0()); 
            }
            // InternalIoTDevice.g:8333:1: ( 'or' )
            // InternalIoTDevice.g:8334:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getOpOrKeyword_1_1_0()); 
            }
            match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpOrKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getOpOrKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__OpAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RhsAssignment_1_2"
    // InternalIoTDevice.g:8349:1: rule__OrExpression__RhsAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8353:1: ( ( ruleAndExpression ) )
            // InternalIoTDevice.g:8354:1: ( ruleAndExpression )
            {
            // InternalIoTDevice.g:8354:1: ( ruleAndExpression )
            // InternalIoTDevice.g:8355:1: ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__OrExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OpAssignment_1_1"
    // InternalIoTDevice.g:8364:1: rule__AndExpression__OpAssignment_1_1 : ( ( 'and' ) ) ;
    public final void rule__AndExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8368:1: ( ( ( 'and' ) ) )
            // InternalIoTDevice.g:8369:1: ( ( 'and' ) )
            {
            // InternalIoTDevice.g:8369:1: ( ( 'and' ) )
            // InternalIoTDevice.g:8370:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAndKeyword_1_1_0()); 
            }
            // InternalIoTDevice.g:8371:1: ( 'and' )
            // InternalIoTDevice.g:8372:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getOpAndKeyword_1_1_0()); 
            }
            match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAndKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getOpAndKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__OpAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RhsAssignment_1_2"
    // InternalIoTDevice.g:8387:1: rule__AndExpression__RhsAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8391:1: ( ( ruleEqualityExpression ) )
            // InternalIoTDevice.g:8392:1: ( ruleEqualityExpression )
            {
            // InternalIoTDevice.g:8392:1: ( ruleEqualityExpression )
            // InternalIoTDevice.g:8393:1: ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionAccess().getRhsEqualityExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionAccess().getRhsEqualityExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__AndExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__EqualityExpression__OpAssignment_1_1"
    // InternalIoTDevice.g:8402:1: rule__EqualityExpression__OpAssignment_1_1 : ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__EqualityExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8406:1: ( ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) ) )
            // InternalIoTDevice.g:8407:1: ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) )
            {
            // InternalIoTDevice.g:8407:1: ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) )
            // InternalIoTDevice.g:8408:1: ( rule__EqualityExpression__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalIoTDevice.g:8409:1: ( rule__EqualityExpression__OpAlternatives_1_1_0 )
            // InternalIoTDevice.g:8409:2: rule__EqualityExpression__OpAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EqualityExpression__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_1_1_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__OpAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__RhsAssignment_1_2"
    // InternalIoTDevice.g:8418:1: rule__EqualityExpression__RhsAssignment_1_2 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8422:1: ( ( ruleRelationalExpression ) )
            // InternalIoTDevice.g:8423:1: ( ruleRelationalExpression )
            {
            // InternalIoTDevice.g:8423:1: ( ruleRelationalExpression )
            // InternalIoTDevice.g:8424:1: ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityExpressionAccess().getRhsRelationalExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityExpressionAccess().getRhsRelationalExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__EqualityExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__RelationalExpression__OpAssignment_1_1"
    // InternalIoTDevice.g:8433:1: rule__RelationalExpression__OpAssignment_1_1 : ( ( rule__RelationalExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__RelationalExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8437:1: ( ( ( rule__RelationalExpression__OpAlternatives_1_1_0 ) ) )
            // InternalIoTDevice.g:8438:1: ( ( rule__RelationalExpression__OpAlternatives_1_1_0 ) )
            {
            // InternalIoTDevice.g:8438:1: ( ( rule__RelationalExpression__OpAlternatives_1_1_0 ) )
            // InternalIoTDevice.g:8439:1: ( rule__RelationalExpression__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalIoTDevice.g:8440:1: ( rule__RelationalExpression__OpAlternatives_1_1_0 )
            // InternalIoTDevice.g:8440:2: rule__RelationalExpression__OpAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RelationalExpression__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getOpAlternatives_1_1_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__OpAssignment_1_1"


    // $ANTLR start "rule__RelationalExpression__RhsAssignment_1_2"
    // InternalIoTDevice.g:8449:1: rule__RelationalExpression__RhsAssignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8453:1: ( ( ruleAdditiveExpression ) )
            // InternalIoTDevice.g:8454:1: ( ruleAdditiveExpression )
            {
            // InternalIoTDevice.g:8454:1: ( ruleAdditiveExpression )
            // InternalIoTDevice.g:8455:1: ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationalExpressionAccess().getRhsAdditiveExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationalExpressionAccess().getRhsAdditiveExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__RelationalExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OpAssignment_1_1"
    // InternalIoTDevice.g:8464:1: rule__AdditiveExpression__OpAssignment_1_1 : ( ( rule__AdditiveExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__AdditiveExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8468:1: ( ( ( rule__AdditiveExpression__OpAlternatives_1_1_0 ) ) )
            // InternalIoTDevice.g:8469:1: ( ( rule__AdditiveExpression__OpAlternatives_1_1_0 ) )
            {
            // InternalIoTDevice.g:8469:1: ( ( rule__AdditiveExpression__OpAlternatives_1_1_0 ) )
            // InternalIoTDevice.g:8470:1: ( rule__AdditiveExpression__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalIoTDevice.g:8471:1: ( rule__AdditiveExpression__OpAlternatives_1_1_0 )
            // InternalIoTDevice.g:8471:2: rule__AdditiveExpression__OpAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditiveExpression__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getOpAlternatives_1_1_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__OpAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__RhsAssignment_1_2"
    // InternalIoTDevice.g:8480:1: rule__AdditiveExpression__RhsAssignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8484:1: ( ( ruleMultiplicativeExpression ) )
            // InternalIoTDevice.g:8485:1: ( ruleMultiplicativeExpression )
            {
            // InternalIoTDevice.g:8485:1: ( ruleMultiplicativeExpression )
            // InternalIoTDevice.g:8486:1: ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditiveExpressionAccess().getRhsMultiplicativeExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditiveExpressionAccess().getRhsMultiplicativeExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__AdditiveExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__MultiplicativeExpression__OpAssignment_1_1"
    // InternalIoTDevice.g:8495:1: rule__MultiplicativeExpression__OpAssignment_1_1 : ( ( rule__MultiplicativeExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8499:1: ( ( ( rule__MultiplicativeExpression__OpAlternatives_1_1_0 ) ) )
            // InternalIoTDevice.g:8500:1: ( ( rule__MultiplicativeExpression__OpAlternatives_1_1_0 ) )
            {
            // InternalIoTDevice.g:8500:1: ( ( rule__MultiplicativeExpression__OpAlternatives_1_1_0 ) )
            // InternalIoTDevice.g:8501:1: ( rule__MultiplicativeExpression__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalIoTDevice.g:8502:1: ( rule__MultiplicativeExpression__OpAlternatives_1_1_0 )
            // InternalIoTDevice.g:8502:2: rule__MultiplicativeExpression__OpAlternatives_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicativeExpression__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getOpAlternatives_1_1_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__OpAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__RhsAssignment_1_2"
    // InternalIoTDevice.g:8511:1: rule__MultiplicativeExpression__RhsAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8515:1: ( ( ruleUnaryExpression ) )
            // InternalIoTDevice.g:8516:1: ( ruleUnaryExpression )
            {
            // InternalIoTDevice.g:8516:1: ( ruleUnaryExpression )
            // InternalIoTDevice.g:8517:1: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicativeExpressionAccess().getRhsUnaryExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicativeExpressionAccess().getRhsUnaryExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__MultiplicativeExpression__RhsAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__OpAssignment_0_1"
    // InternalIoTDevice.g:8526:1: rule__UnaryExpression__OpAssignment_0_1 : ( ( 'not' ) ) ;
    public final void rule__UnaryExpression__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8530:1: ( ( ( 'not' ) ) )
            // InternalIoTDevice.g:8531:1: ( ( 'not' ) )
            {
            // InternalIoTDevice.g:8531:1: ( ( 'not' ) )
            // InternalIoTDevice.g:8532:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpNotKeyword_0_1_0()); 
            }
            // InternalIoTDevice.g:8533:1: ( 'not' )
            // InternalIoTDevice.g:8534:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpNotKeyword_0_1_0()); 
            }
            match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpNotKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpNotKeyword_0_1_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__OpAssignment_0_1"


    // $ANTLR start "rule__UnaryExpression__OperandAssignment_0_2"
    // InternalIoTDevice.g:8549:1: rule__UnaryExpression__OperandAssignment_0_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8553:1: ( ( ruleUnaryExpression ) )
            // InternalIoTDevice.g:8554:1: ( ruleUnaryExpression )
            {
            // InternalIoTDevice.g:8554:1: ( ruleUnaryExpression )
            // InternalIoTDevice.g:8555:1: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_0_2_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__OperandAssignment_0_2"


    // $ANTLR start "rule__UnaryExpression__OpAssignment_1_1"
    // InternalIoTDevice.g:8564:1: rule__UnaryExpression__OpAssignment_1_1 : ( ( '+' ) ) ;
    public final void rule__UnaryExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8568:1: ( ( ( '+' ) ) )
            // InternalIoTDevice.g:8569:1: ( ( '+' ) )
            {
            // InternalIoTDevice.g:8569:1: ( ( '+' ) )
            // InternalIoTDevice.g:8570:1: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_1_1_0()); 
            }
            // InternalIoTDevice.g:8571:1: ( '+' )
            // InternalIoTDevice.g:8572:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_1_1_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__OpAssignment_1_1"


    // $ANTLR start "rule__UnaryExpression__OperandAssignment_1_2"
    // InternalIoTDevice.g:8587:1: rule__UnaryExpression__OperandAssignment_1_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8591:1: ( ( ruleUnaryExpression ) )
            // InternalIoTDevice.g:8592:1: ( ruleUnaryExpression )
            {
            // InternalIoTDevice.g:8592:1: ( ruleUnaryExpression )
            // InternalIoTDevice.g:8593:1: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_1_2_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__OperandAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__OpAssignment_2_1"
    // InternalIoTDevice.g:8602:1: rule__UnaryExpression__OpAssignment_2_1 : ( ( '-' ) ) ;
    public final void rule__UnaryExpression__OpAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8606:1: ( ( ( '-' ) ) )
            // InternalIoTDevice.g:8607:1: ( ( '-' ) )
            {
            // InternalIoTDevice.g:8607:1: ( ( '-' ) )
            // InternalIoTDevice.g:8608:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_2_1_0()); 
            }
            // InternalIoTDevice.g:8609:1: ( '-' )
            // InternalIoTDevice.g:8610:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_2_1_0()); 
            }
            match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_2_1_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__OpAssignment_2_1"


    // $ANTLR start "rule__UnaryExpression__OperandAssignment_2_2"
    // InternalIoTDevice.g:8625:1: rule__UnaryExpression__OperandAssignment_2_2 : ( ruleUnaryExpression ) ;
    public final void rule__UnaryExpression__OperandAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8629:1: ( ( ruleUnaryExpression ) )
            // InternalIoTDevice.g:8630:1: ( ruleUnaryExpression )
            {
            // InternalIoTDevice.g:8630:1: ( ruleUnaryExpression )
            // InternalIoTDevice.g:8631:1: ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_2_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_2_2_0()); 
            }

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
    // $ANTLR end "rule__UnaryExpression__OperandAssignment_2_2"


    // $ANTLR start "rule__CapabilitySelection__CapabilityAssignment_1_1"
    // InternalIoTDevice.g:8640:1: rule__CapabilitySelection__CapabilityAssignment_1_1 : ( ( ruleValidID ) ) ;
    public final void rule__CapabilitySelection__CapabilityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8644:1: ( ( ( ruleValidID ) ) )
            // InternalIoTDevice.g:8645:1: ( ( ruleValidID ) )
            {
            // InternalIoTDevice.g:8645:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8646:1: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getCapabilityCapabilityCrossReference_1_1_0()); 
            }
            // InternalIoTDevice.g:8647:1: ( ruleValidID )
            // InternalIoTDevice.g:8648:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getCapabilityCapabilityValidIDParserRuleCall_1_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getCapabilityCapabilityValidIDParserRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getCapabilityCapabilityCrossReference_1_1_0()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__CapabilityAssignment_1_1"


    // $ANTLR start "rule__CapabilitySelection__ArgsAssignment_1_3_0"
    // InternalIoTDevice.g:8659:1: rule__CapabilitySelection__ArgsAssignment_1_3_0 : ( ruleExpression ) ;
    public final void rule__CapabilitySelection__ArgsAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8663:1: ( ( ruleExpression ) )
            // InternalIoTDevice.g:8664:1: ( ruleExpression )
            {
            // InternalIoTDevice.g:8664:1: ( ruleExpression )
            // InternalIoTDevice.g:8665:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getArgsExpressionParserRuleCall_1_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getArgsExpressionParserRuleCall_1_3_0_0()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__ArgsAssignment_1_3_0"


    // $ANTLR start "rule__CapabilitySelection__ArgsAssignment_1_3_1_1"
    // InternalIoTDevice.g:8674:1: rule__CapabilitySelection__ArgsAssignment_1_3_1_1 : ( ruleExpression ) ;
    public final void rule__CapabilitySelection__ArgsAssignment_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8678:1: ( ( ruleExpression ) )
            // InternalIoTDevice.g:8679:1: ( ruleExpression )
            {
            // InternalIoTDevice.g:8679:1: ( ruleExpression )
            // InternalIoTDevice.g:8680:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCapabilitySelectionAccess().getArgsExpressionParserRuleCall_1_3_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCapabilitySelectionAccess().getArgsExpressionParserRuleCall_1_3_1_1_0()); 
            }

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
    // $ANTLR end "rule__CapabilitySelection__ArgsAssignment_1_3_1_1"


    // $ANTLR start "rule__Target__RefAssignment"
    // InternalIoTDevice.g:8689:1: rule__Target__RefAssignment : ( ( ruleValidID ) ) ;
    public final void rule__Target__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8693:1: ( ( ( ruleValidID ) ) )
            // InternalIoTDevice.g:8694:1: ( ( ruleValidID ) )
            {
            // InternalIoTDevice.g:8694:1: ( ( ruleValidID ) )
            // InternalIoTDevice.g:8695:1: ( ruleValidID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetAccess().getRefNodeInstanceCrossReference_0()); 
            }
            // InternalIoTDevice.g:8696:1: ( ruleValidID )
            // InternalIoTDevice.g:8697:1: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetAccess().getRefNodeInstanceValidIDParserRuleCall_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetAccess().getRefNodeInstanceValidIDParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetAccess().getRefNodeInstanceCrossReference_0()); 
            }

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
    // $ANTLR end "rule__Target__RefAssignment"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_0_1"
    // InternalIoTDevice.g:8708:1: rule__LiteralExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__LiteralExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8712:1: ( ( RULE_INT ) )
            // InternalIoTDevice.g:8713:1: ( RULE_INT )
            {
            // InternalIoTDevice.g:8713:1: ( RULE_INT )
            // InternalIoTDevice.g:8714:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_1_1"
    // InternalIoTDevice.g:8723:1: rule__LiteralExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__LiteralExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8727:1: ( ( RULE_STRING ) )
            // InternalIoTDevice.g:8728:1: ( RULE_STRING )
            {
            // InternalIoTDevice.g:8728:1: ( RULE_STRING )
            // InternalIoTDevice.g:8729:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__LiteralExpression__EnumerationAssignment_2_1"
    // InternalIoTDevice.g:8738:1: rule__LiteralExpression__EnumerationAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__LiteralExpression__EnumerationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8742:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIoTDevice.g:8743:1: ( ( ruleQualifiedName ) )
            {
            // InternalIoTDevice.g:8743:1: ( ( ruleQualifiedName ) )
            // InternalIoTDevice.g:8744:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getEnumerationEnumerationCrossReference_2_1_0()); 
            }
            // InternalIoTDevice.g:8745:1: ( ruleQualifiedName )
            // InternalIoTDevice.g:8746:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getEnumerationEnumerationQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getEnumerationEnumerationQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getEnumerationEnumerationCrossReference_2_1_0()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__EnumerationAssignment_2_1"


    // $ANTLR start "rule__LiteralExpression__LiteralAssignment_2_3"
    // InternalIoTDevice.g:8757:1: rule__LiteralExpression__LiteralAssignment_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__LiteralExpression__LiteralAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8761:1: ( ( ( RULE_ID ) ) )
            // InternalIoTDevice.g:8762:1: ( ( RULE_ID ) )
            {
            // InternalIoTDevice.g:8762:1: ( ( RULE_ID ) )
            // InternalIoTDevice.g:8763:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getLiteralEnumerationLiteralCrossReference_2_3_0()); 
            }
            // InternalIoTDevice.g:8764:1: ( RULE_ID )
            // InternalIoTDevice.g:8765:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getLiteralEnumerationLiteralIDTerminalRuleCall_2_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getLiteralEnumerationLiteralIDTerminalRuleCall_2_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getLiteralEnumerationLiteralCrossReference_2_3_0()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__LiteralAssignment_2_3"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_3_2"
    // InternalIoTDevice.g:8776:1: rule__LiteralExpression__ValueAssignment_3_2 : ( ruleTarget ) ;
    public final void rule__LiteralExpression__ValueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8780:1: ( ( ruleTarget ) )
            // InternalIoTDevice.g:8781:1: ( ruleTarget )
            {
            // InternalIoTDevice.g:8781:1: ( ruleTarget )
            // InternalIoTDevice.g:8782:1: ruleTarget
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getValueTargetParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTarget();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getValueTargetParserRuleCall_3_2_0()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_3_2"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_3_3_1"
    // InternalIoTDevice.g:8791:1: rule__LiteralExpression__ValueAssignment_3_3_1 : ( ruleTarget ) ;
    public final void rule__LiteralExpression__ValueAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8795:1: ( ( ruleTarget ) )
            // InternalIoTDevice.g:8796:1: ( ruleTarget )
            {
            // InternalIoTDevice.g:8796:1: ( ruleTarget )
            // InternalIoTDevice.g:8797:1: ruleTarget
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getValueTargetParserRuleCall_3_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTarget();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getValueTargetParserRuleCall_3_3_1_0()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_3_3_1"


    // $ANTLR start "rule__LiteralExpression__IsTrueAssignment_4_1_1"
    // InternalIoTDevice.g:8806:1: rule__LiteralExpression__IsTrueAssignment_4_1_1 : ( ( 'true' ) ) ;
    public final void rule__LiteralExpression__IsTrueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalIoTDevice.g:8810:1: ( ( ( 'true' ) ) )
            // InternalIoTDevice.g:8811:1: ( ( 'true' ) )
            {
            // InternalIoTDevice.g:8811:1: ( ( 'true' ) )
            // InternalIoTDevice.g:8812:1: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getIsTrueTrueKeyword_4_1_1_0()); 
            }
            // InternalIoTDevice.g:8813:1: ( 'true' )
            // InternalIoTDevice.g:8814:1: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExpressionAccess().getIsTrueTrueKeyword_4_1_1_0()); 
            }
            match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getIsTrueTrueKeyword_4_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExpressionAccess().getIsTrueTrueKeyword_4_1_1_0()); 
            }

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
    // $ANTLR end "rule__LiteralExpression__IsTrueAssignment_4_1_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x1E02040788000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1E00000788000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000780000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000022820000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000022800000002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1E00000788000010L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000010L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000022800000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1E00000788000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000980020000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000007C00000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x9E80004788260070L,0x0000000000000001L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000000000001E000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000000000001E002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000060002L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x9E8000C788260070L,0x0000000000000001L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0100010000000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x1E80000788200070L,0x0000000000000001L});
    }


}