package be.unamur.iotdsl.xtext.ide.contentassist.antlr.internal;

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
import be.unamur.iotdsl.xtext.services.IoTDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIoTDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'gateway'", "'middleware'", "'sensing'", "'actuating'", "'enumeration'", "'{'", "'}'", "';'", "'device'", "'property'", "':'", "'('", "')'", "','", "'.'", "'integer'", "'boolean'", "'string'", "'real'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIoTDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIoTDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIoTDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIoTDSL.g"; }


    	private IoTDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(IoTDSLGrammarAccess grammarAccess) {
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
    // InternalIoTDSL.g:54:1: entryRuleIoTModel : ruleIoTModel EOF ;
    public final void entryRuleIoTModel() throws RecognitionException {
        try {
            // InternalIoTDSL.g:55:1: ( ruleIoTModel EOF )
            // InternalIoTDSL.g:56:1: ruleIoTModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIoTModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIoTModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:63:1: ruleIoTModel : ( ( rule__IoTModel__Group__0 ) ) ;
    public final void ruleIoTModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:67:2: ( ( ( rule__IoTModel__Group__0 ) ) )
            // InternalIoTDSL.g:68:2: ( ( rule__IoTModel__Group__0 ) )
            {
            // InternalIoTDSL.g:68:2: ( ( rule__IoTModel__Group__0 ) )
            // InternalIoTDSL.g:69:3: ( rule__IoTModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getGroup()); 
            }
            // InternalIoTDSL.g:70:3: ( rule__IoTModel__Group__0 )
            // InternalIoTDSL.g:70:4: rule__IoTModel__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:79:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalIoTDSL.g:80:1: ( ruleType EOF )
            // InternalIoTDSL.g:81:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:88:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:92:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalIoTDSL.g:93:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalIoTDSL.g:93:2: ( ( rule__Type__Alternatives ) )
            // InternalIoTDSL.g:94:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalIoTDSL.g:95:3: ( rule__Type__Alternatives )
            // InternalIoTDSL.g:95:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:104:1: entryRuleDeclaredType : ruleDeclaredType EOF ;
    public final void entryRuleDeclaredType() throws RecognitionException {
        try {
            // InternalIoTDSL.g:105:1: ( ruleDeclaredType EOF )
            // InternalIoTDSL.g:106:1: ruleDeclaredType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaredType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:113:1: ruleDeclaredType : ( ( rule__DeclaredType__Alternatives ) ) ;
    public final void ruleDeclaredType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:117:2: ( ( ( rule__DeclaredType__Alternatives ) ) )
            // InternalIoTDSL.g:118:2: ( ( rule__DeclaredType__Alternatives ) )
            {
            // InternalIoTDSL.g:118:2: ( ( rule__DeclaredType__Alternatives ) )
            // InternalIoTDSL.g:119:3: ( rule__DeclaredType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredTypeAccess().getAlternatives()); 
            }
            // InternalIoTDSL.g:120:3: ( rule__DeclaredType__Alternatives )
            // InternalIoTDSL.g:120:4: rule__DeclaredType__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:129:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalIoTDSL.g:130:1: ( ruleEnumeration EOF )
            // InternalIoTDSL.g:131:1: ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:138:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:142:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalIoTDSL.g:143:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalIoTDSL.g:143:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalIoTDSL.g:144:3: ( rule__Enumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup()); 
            }
            // InternalIoTDSL.g:145:3: ( rule__Enumeration__Group__0 )
            // InternalIoTDSL.g:145:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:154:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalIoTDSL.g:155:1: ( ruleEnumerationLiteral EOF )
            // InternalIoTDSL.g:156:1: ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:163:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:167:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalIoTDSL.g:168:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalIoTDSL.g:168:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalIoTDSL.g:169:3: ( rule__EnumerationLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            }
            // InternalIoTDSL.g:170:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalIoTDSL.g:170:4: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRulePrimitiveType"
    // InternalIoTDSL.g:179:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalIoTDSL.g:180:1: ( rulePrimitiveType EOF )
            // InternalIoTDSL.g:181:1: rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimitiveTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:188:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:192:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalIoTDSL.g:193:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalIoTDSL.g:193:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalIoTDSL.g:194:3: ( rule__PrimitiveType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            }
            // InternalIoTDSL.g:195:3: ( rule__PrimitiveType__Alternatives )
            // InternalIoTDSL.g:195:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:204:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalIoTDSL.g:205:1: ( ruleIntegerType EOF )
            // InternalIoTDSL.g:206:1: ruleIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntegerType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:213:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:217:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalIoTDSL.g:218:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalIoTDSL.g:218:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalIoTDSL.g:219:3: ( rule__IntegerType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            }
            // InternalIoTDSL.g:220:3: ( rule__IntegerType__Group__0 )
            // InternalIoTDSL.g:220:4: rule__IntegerType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:229:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalIoTDSL.g:230:1: ( ruleBooleanType EOF )
            // InternalIoTDSL.g:231:1: ruleBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:238:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:242:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalIoTDSL.g:243:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalIoTDSL.g:243:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalIoTDSL.g:244:3: ( rule__BooleanType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            }
            // InternalIoTDSL.g:245:3: ( rule__BooleanType__Group__0 )
            // InternalIoTDSL.g:245:4: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:254:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalIoTDSL.g:255:1: ( ruleStringType EOF )
            // InternalIoTDSL.g:256:1: ruleStringType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:263:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:267:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalIoTDSL.g:268:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalIoTDSL.g:268:2: ( ( rule__StringType__Group__0 ) )
            // InternalIoTDSL.g:269:3: ( rule__StringType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getGroup()); 
            }
            // InternalIoTDSL.g:270:3: ( rule__StringType__Group__0 )
            // InternalIoTDSL.g:270:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:279:1: entryRuleRealType : ruleRealType EOF ;
    public final void entryRuleRealType() throws RecognitionException {
        try {
            // InternalIoTDSL.g:280:1: ( ruleRealType EOF )
            // InternalIoTDSL.g:281:1: ruleRealType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRealType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:288:1: ruleRealType : ( ( rule__RealType__Group__0 ) ) ;
    public final void ruleRealType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:292:2: ( ( ( rule__RealType__Group__0 ) ) )
            // InternalIoTDSL.g:293:2: ( ( rule__RealType__Group__0 ) )
            {
            // InternalIoTDSL.g:293:2: ( ( rule__RealType__Group__0 ) )
            // InternalIoTDSL.g:294:3: ( rule__RealType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getGroup()); 
            }
            // InternalIoTDSL.g:295:3: ( rule__RealType__Group__0 )
            // InternalIoTDSL.g:295:4: rule__RealType__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleNode"
    // InternalIoTDSL.g:304:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalIoTDSL.g:305:1: ( ruleNode EOF )
            // InternalIoTDSL.g:306:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:313:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:317:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalIoTDSL.g:318:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalIoTDSL.g:318:2: ( ( rule__Node__Alternatives ) )
            // InternalIoTDSL.g:319:3: ( rule__Node__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives()); 
            }
            // InternalIoTDSL.g:320:3: ( rule__Node__Alternatives )
            // InternalIoTDSL.g:320:4: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleGateway"
    // InternalIoTDSL.g:329:1: entryRuleGateway : ruleGateway EOF ;
    public final void entryRuleGateway() throws RecognitionException {
        try {
            // InternalIoTDSL.g:330:1: ( ruleGateway EOF )
            // InternalIoTDSL.g:331:1: ruleGateway EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleGateway();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGatewayRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:338:1: ruleGateway : ( ( rule__Gateway__Group__0 ) ) ;
    public final void ruleGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:342:2: ( ( ( rule__Gateway__Group__0 ) ) )
            // InternalIoTDSL.g:343:2: ( ( rule__Gateway__Group__0 ) )
            {
            // InternalIoTDSL.g:343:2: ( ( rule__Gateway__Group__0 ) )
            // InternalIoTDSL.g:344:3: ( rule__Gateway__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getGroup()); 
            }
            // InternalIoTDSL.g:345:3: ( rule__Gateway__Group__0 )
            // InternalIoTDSL.g:345:4: rule__Gateway__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleDevice"
    // InternalIoTDSL.g:354:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalIoTDSL.g:355:1: ( ruleDevice EOF )
            // InternalIoTDSL.g:356:1: ruleDevice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:363:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:367:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalIoTDSL.g:368:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalIoTDSL.g:368:2: ( ( rule__Device__Group__0 ) )
            // InternalIoTDSL.g:369:3: ( rule__Device__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getGroup()); 
            }
            // InternalIoTDSL.g:370:3: ( rule__Device__Group__0 )
            // InternalIoTDSL.g:370:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleNamedTypedElement"
    // InternalIoTDSL.g:379:1: entryRuleNamedTypedElement : ruleNamedTypedElement EOF ;
    public final void entryRuleNamedTypedElement() throws RecognitionException {
        try {
            // InternalIoTDSL.g:380:1: ( ruleNamedTypedElement EOF )
            // InternalIoTDSL.g:381:1: ruleNamedTypedElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypedElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamedTypedElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedTypedElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNamedTypedElement"


    // $ANTLR start "ruleNamedTypedElement"
    // InternalIoTDSL.g:388:1: ruleNamedTypedElement : ( ( rule__NamedTypedElement__Alternatives ) ) ;
    public final void ruleNamedTypedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:392:2: ( ( ( rule__NamedTypedElement__Alternatives ) ) )
            // InternalIoTDSL.g:393:2: ( ( rule__NamedTypedElement__Alternatives ) )
            {
            // InternalIoTDSL.g:393:2: ( ( rule__NamedTypedElement__Alternatives ) )
            // InternalIoTDSL.g:394:3: ( rule__NamedTypedElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypedElementAccess().getAlternatives()); 
            }
            // InternalIoTDSL.g:395:3: ( rule__NamedTypedElement__Alternatives )
            // InternalIoTDSL.g:395:4: rule__NamedTypedElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NamedTypedElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedTypedElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedTypedElement"


    // $ANTLR start "entryRuleFeature"
    // InternalIoTDSL.g:404:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalIoTDSL.g:405:1: ( ruleFeature EOF )
            // InternalIoTDSL.g:406:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:413:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:417:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalIoTDSL.g:418:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalIoTDSL.g:418:2: ( ( rule__Feature__Alternatives ) )
            // InternalIoTDSL.g:419:3: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // InternalIoTDSL.g:420:3: ( rule__Feature__Alternatives )
            // InternalIoTDSL.g:420:4: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:429:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalIoTDSL.g:430:1: ( ruleProperty EOF )
            // InternalIoTDSL.g:431:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:438:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:442:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalIoTDSL.g:443:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalIoTDSL.g:443:2: ( ( rule__Property__Group__0 ) )
            // InternalIoTDSL.g:444:3: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // InternalIoTDSL.g:445:3: ( rule__Property__Group__0 )
            // InternalIoTDSL.g:445:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleEvent"
    // InternalIoTDSL.g:454:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalIoTDSL.g:455:1: ( ruleEvent EOF )
            // InternalIoTDSL.g:456:1: ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalIoTDSL.g:463:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:467:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalIoTDSL.g:468:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalIoTDSL.g:468:2: ( ( rule__Event__Group__0 ) )
            // InternalIoTDSL.g:469:3: ( rule__Event__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup()); 
            }
            // InternalIoTDSL.g:470:3: ( rule__Event__Group__0 )
            // InternalIoTDSL.g:470:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleParameter"
    // InternalIoTDSL.g:479:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalIoTDSL.g:480:1: ( ruleParameter EOF )
            // InternalIoTDSL.g:481:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:488:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:492:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalIoTDSL.g:493:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalIoTDSL.g:493:2: ( ( rule__Parameter__Group__0 ) )
            // InternalIoTDSL.g:494:3: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // InternalIoTDSL.g:495:3: ( rule__Parameter__Group__0 )
            // InternalIoTDSL.g:495:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:504:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalIoTDSL.g:505:1: ( ruleTypeReference EOF )
            // InternalIoTDSL.g:506:1: ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:513:1: ruleTypeReference : ( ( rule__TypeReference__Alternatives ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:517:2: ( ( ( rule__TypeReference__Alternatives ) ) )
            // InternalIoTDSL.g:518:2: ( ( rule__TypeReference__Alternatives ) )
            {
            // InternalIoTDSL.g:518:2: ( ( rule__TypeReference__Alternatives ) )
            // InternalIoTDSL.g:519:3: ( rule__TypeReference__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getAlternatives()); 
            }
            // InternalIoTDSL.g:520:3: ( rule__TypeReference__Alternatives )
            // InternalIoTDSL.g:520:4: rule__TypeReference__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIoTDSL.g:529:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalIoTDSL.g:530:1: ( ruleQualifiedName EOF )
            // InternalIoTDSL.g:531:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:538:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:542:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalIoTDSL.g:543:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalIoTDSL.g:543:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalIoTDSL.g:544:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalIoTDSL.g:545:3: ( rule__QualifiedName__Group__0 )
            // InternalIoTDSL.g:545:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:554:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalIoTDSL.g:555:1: ( ruleValidID EOF )
            // InternalIoTDSL.g:556:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:563:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:567:2: ( ( RULE_ID ) )
            // InternalIoTDSL.g:568:2: ( RULE_ID )
            {
            // InternalIoTDSL.g:568:2: ( RULE_ID )
            // InternalIoTDSL.g:569:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "ruleEventType"
    // InternalIoTDSL.g:579:1: ruleEventType : ( ( rule__EventType__Alternatives ) ) ;
    public final void ruleEventType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:583:1: ( ( ( rule__EventType__Alternatives ) ) )
            // InternalIoTDSL.g:584:2: ( ( rule__EventType__Alternatives ) )
            {
            // InternalIoTDSL.g:584:2: ( ( rule__EventType__Alternatives ) )
            // InternalIoTDSL.g:585:3: ( rule__EventType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventTypeAccess().getAlternatives()); 
            }
            // InternalIoTDSL.g:586:3: ( rule__EventType__Alternatives )
            // InternalIoTDSL.g:586:4: rule__EventType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EventType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventType"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalIoTDSL.g:594:1: rule__Type__Alternatives : ( ( ruleDeclaredType ) | ( rulePrimitiveType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:598:1: ( ( ruleDeclaredType ) | ( rulePrimitiveType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==15||LA1_0==19) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=26 && LA1_0<=29)) ) {
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
                    // InternalIoTDSL.g:599:2: ( ruleDeclaredType )
                    {
                    // InternalIoTDSL.g:599:2: ( ruleDeclaredType )
                    // InternalIoTDSL.g:600:3: ruleDeclaredType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDeclaredTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalIoTDSL.g:605:2: ( rulePrimitiveType )
                    {
                    // InternalIoTDSL.g:605:2: ( rulePrimitiveType )
                    // InternalIoTDSL.g:606:3: rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:615:1: rule__DeclaredType__Alternatives : ( ( ruleNode ) | ( ruleEnumeration ) );
    public final void rule__DeclaredType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:619:1: ( ( ruleNode ) | ( ruleEnumeration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)||LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
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
                    // InternalIoTDSL.g:620:2: ( ruleNode )
                    {
                    // InternalIoTDSL.g:620:2: ( ruleNode )
                    // InternalIoTDSL.g:621:3: ruleNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaredTypeAccess().getNodeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalIoTDSL.g:626:2: ( ruleEnumeration )
                    {
                    // InternalIoTDSL.g:626:2: ( ruleEnumeration )
                    // InternalIoTDSL.g:627:3: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclaredTypeAccess().getEnumerationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalIoTDSL.g:636:1: rule__PrimitiveType__Alternatives : ( ( ruleIntegerType ) | ( ruleBooleanType ) | ( ruleStringType ) | ( ruleRealType ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:640:1: ( ( ruleIntegerType ) | ( ruleBooleanType ) | ( ruleStringType ) | ( ruleRealType ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 29:
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
                    // InternalIoTDSL.g:641:2: ( ruleIntegerType )
                    {
                    // InternalIoTDSL.g:641:2: ( ruleIntegerType )
                    // InternalIoTDSL.g:642:3: ruleIntegerType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalIoTDSL.g:647:2: ( ruleBooleanType )
                    {
                    // InternalIoTDSL.g:647:2: ( ruleBooleanType )
                    // InternalIoTDSL.g:648:3: ruleBooleanType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalIoTDSL.g:653:2: ( ruleStringType )
                    {
                    // InternalIoTDSL.g:653:2: ( ruleStringType )
                    // InternalIoTDSL.g:654:3: ruleStringType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalIoTDSL.g:659:2: ( ruleRealType )
                    {
                    // InternalIoTDSL.g:659:2: ( ruleRealType )
                    // InternalIoTDSL.g:660:3: ruleRealType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimitiveTypeAccess().getRealTypeParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Node__Alternatives"
    // InternalIoTDSL.g:669:1: rule__Node__Alternatives : ( ( ruleGateway ) | ( ruleDevice ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:673:1: ( ( ruleGateway ) | ( ruleDevice ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
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
                    // InternalIoTDSL.g:674:2: ( ruleGateway )
                    {
                    // InternalIoTDSL.g:674:2: ( ruleGateway )
                    // InternalIoTDSL.g:675:3: ruleGateway
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getGatewayParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleGateway();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getGatewayParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:680:2: ( ruleDevice )
                    {
                    // InternalIoTDSL.g:680:2: ( ruleDevice )
                    // InternalIoTDSL.g:681:3: ruleDevice
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getDeviceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDevice();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getDeviceParserRuleCall_1()); 
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


    // $ANTLR start "rule__Gateway__Alternatives_1"
    // InternalIoTDSL.g:690:1: rule__Gateway__Alternatives_1 : ( ( 'gateway' ) | ( 'middleware' ) );
    public final void rule__Gateway__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:694:1: ( ( 'gateway' ) | ( 'middleware' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
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
                    // InternalIoTDSL.g:695:2: ( 'gateway' )
                    {
                    // InternalIoTDSL.g:695:2: ( 'gateway' )
                    // InternalIoTDSL.g:696:3: 'gateway'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGatewayAccess().getGatewayKeyword_1_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGatewayAccess().getGatewayKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:701:2: ( 'middleware' )
                    {
                    // InternalIoTDSL.g:701:2: ( 'middleware' )
                    // InternalIoTDSL.g:702:3: 'middleware'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGatewayAccess().getMiddlewareKeyword_1_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGatewayAccess().getMiddlewareKeyword_1_1()); 
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
    // $ANTLR end "rule__Gateway__Alternatives_1"


    // $ANTLR start "rule__NamedTypedElement__Alternatives"
    // InternalIoTDSL.g:711:1: rule__NamedTypedElement__Alternatives : ( ( ruleProperty ) | ( ruleParameter ) );
    public final void rule__NamedTypedElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:715:1: ( ( ruleProperty ) | ( ruleParameter ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
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
                    // InternalIoTDSL.g:716:2: ( ruleProperty )
                    {
                    // InternalIoTDSL.g:716:2: ( ruleProperty )
                    // InternalIoTDSL.g:717:3: ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNamedTypedElementAccess().getPropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNamedTypedElementAccess().getPropertyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:722:2: ( ruleParameter )
                    {
                    // InternalIoTDSL.g:722:2: ( ruleParameter )
                    // InternalIoTDSL.g:723:3: ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNamedTypedElementAccess().getParameterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNamedTypedElementAccess().getParameterParserRuleCall_1()); 
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
    // $ANTLR end "rule__NamedTypedElement__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalIoTDSL.g:732:1: rule__Feature__Alternatives : ( ( ruleProperty ) | ( ruleEvent ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:736:1: ( ( ruleProperty ) | ( ruleEvent ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=13 && LA7_0<=14)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoTDSL.g:737:2: ( ruleProperty )
                    {
                    // InternalIoTDSL.g:737:2: ( ruleProperty )
                    // InternalIoTDSL.g:738:3: ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalIoTDSL.g:743:2: ( ruleEvent )
                    {
                    // InternalIoTDSL.g:743:2: ( ruleEvent )
                    // InternalIoTDSL.g:744:3: ruleEvent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getEventParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEvent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getEventParserRuleCall_1()); 
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


    // $ANTLR start "rule__TypeReference__Alternatives"
    // InternalIoTDSL.g:753:1: rule__TypeReference__Alternatives : ( ( ( rule__TypeReference__PtypeAssignment_0 ) ) | ( ( rule__TypeReference__DtypeAssignment_1 ) ) );
    public final void rule__TypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:757:1: ( ( ( rule__TypeReference__PtypeAssignment_0 ) ) | ( ( rule__TypeReference__DtypeAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=26 && LA8_0<=29)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
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
                    // InternalIoTDSL.g:758:2: ( ( rule__TypeReference__PtypeAssignment_0 ) )
                    {
                    // InternalIoTDSL.g:758:2: ( ( rule__TypeReference__PtypeAssignment_0 ) )
                    // InternalIoTDSL.g:759:3: ( rule__TypeReference__PtypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeReferenceAccess().getPtypeAssignment_0()); 
                    }
                    // InternalIoTDSL.g:760:3: ( rule__TypeReference__PtypeAssignment_0 )
                    // InternalIoTDSL.g:760:4: rule__TypeReference__PtypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalIoTDSL.g:764:2: ( ( rule__TypeReference__DtypeAssignment_1 ) )
                    {
                    // InternalIoTDSL.g:764:2: ( ( rule__TypeReference__DtypeAssignment_1 ) )
                    // InternalIoTDSL.g:765:3: ( rule__TypeReference__DtypeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeReferenceAccess().getDtypeAssignment_1()); 
                    }
                    // InternalIoTDSL.g:766:3: ( rule__TypeReference__DtypeAssignment_1 )
                    // InternalIoTDSL.g:766:4: rule__TypeReference__DtypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__EventType__Alternatives"
    // InternalIoTDSL.g:774:1: rule__EventType__Alternatives : ( ( ( 'sensing' ) ) | ( ( 'actuating' ) ) );
    public final void rule__EventType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:778:1: ( ( ( 'sensing' ) ) | ( ( 'actuating' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTDSL.g:779:2: ( ( 'sensing' ) )
                    {
                    // InternalIoTDSL.g:779:2: ( ( 'sensing' ) )
                    // InternalIoTDSL.g:780:3: ( 'sensing' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventTypeAccess().getSENSINGEnumLiteralDeclaration_0()); 
                    }
                    // InternalIoTDSL.g:781:3: ( 'sensing' )
                    // InternalIoTDSL.g:781:4: 'sensing'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventTypeAccess().getSENSINGEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:785:2: ( ( 'actuating' ) )
                    {
                    // InternalIoTDSL.g:785:2: ( ( 'actuating' ) )
                    // InternalIoTDSL.g:786:3: ( 'actuating' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventTypeAccess().getACTUATINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalIoTDSL.g:787:3: ( 'actuating' )
                    // InternalIoTDSL.g:787:4: 'actuating'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventTypeAccess().getACTUATINGEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__EventType__Alternatives"


    // $ANTLR start "rule__IoTModel__Group__0"
    // InternalIoTDSL.g:795:1: rule__IoTModel__Group__0 : rule__IoTModel__Group__0__Impl rule__IoTModel__Group__1 ;
    public final void rule__IoTModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:799:1: ( rule__IoTModel__Group__0__Impl rule__IoTModel__Group__1 )
            // InternalIoTDSL.g:800:2: rule__IoTModel__Group__0__Impl rule__IoTModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__IoTModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:807:1: rule__IoTModel__Group__0__Impl : ( () ) ;
    public final void rule__IoTModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:811:1: ( ( () ) )
            // InternalIoTDSL.g:812:1: ( () )
            {
            // InternalIoTDSL.g:812:1: ( () )
            // InternalIoTDSL.g:813:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getIoTModelAction_0()); 
            }
            // InternalIoTDSL.g:814:2: ()
            // InternalIoTDSL.g:814:3: 
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
    // InternalIoTDSL.g:822:1: rule__IoTModel__Group__1 : rule__IoTModel__Group__1__Impl ;
    public final void rule__IoTModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:826:1: ( rule__IoTModel__Group__1__Impl )
            // InternalIoTDSL.g:827:2: rule__IoTModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IoTModel__Group__1__Impl();

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
    // InternalIoTDSL.g:833:1: rule__IoTModel__Group__1__Impl : ( ( rule__IoTModel__TypesAssignment_1 )* ) ;
    public final void rule__IoTModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:837:1: ( ( ( rule__IoTModel__TypesAssignment_1 )* ) )
            // InternalIoTDSL.g:838:1: ( ( rule__IoTModel__TypesAssignment_1 )* )
            {
            // InternalIoTDSL.g:838:1: ( ( rule__IoTModel__TypesAssignment_1 )* )
            // InternalIoTDSL.g:839:2: ( rule__IoTModel__TypesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getTypesAssignment_1()); 
            }
            // InternalIoTDSL.g:840:2: ( rule__IoTModel__TypesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=12)||LA10_0==15||LA10_0==19||(LA10_0>=26 && LA10_0<=29)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIoTDSL.g:840:3: rule__IoTModel__TypesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__IoTModel__TypesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalIoTDSL.g:849:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:853:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalIoTDSL.g:854:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:861:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:865:1: ( ( 'enumeration' ) )
            // InternalIoTDSL.g:866:1: ( 'enumeration' )
            {
            // InternalIoTDSL.g:866:1: ( 'enumeration' )
            // InternalIoTDSL.g:867:2: 'enumeration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:876:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:880:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalIoTDSL.g:881:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:888:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:892:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalIoTDSL.g:893:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalIoTDSL.g:893:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalIoTDSL.g:894:2: ( rule__Enumeration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            }
            // InternalIoTDSL.g:895:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalIoTDSL.g:895:3: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:903:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:907:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalIoTDSL.g:908:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:915:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:919:1: ( ( '{' ) )
            // InternalIoTDSL.g:920:1: ( '{' )
            {
            // InternalIoTDSL.g:920:1: ( '{' )
            // InternalIoTDSL.g:921:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:930:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:934:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalIoTDSL.g:935:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:942:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__Group_3__0 )* ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:946:1: ( ( ( rule__Enumeration__Group_3__0 )* ) )
            // InternalIoTDSL.g:947:1: ( ( rule__Enumeration__Group_3__0 )* )
            {
            // InternalIoTDSL.g:947:1: ( ( rule__Enumeration__Group_3__0 )* )
            // InternalIoTDSL.g:948:2: ( rule__Enumeration__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup_3()); 
            }
            // InternalIoTDSL.g:949:2: ( rule__Enumeration__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIoTDSL.g:949:3: rule__Enumeration__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Enumeration__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalIoTDSL.g:957:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:961:1: ( rule__Enumeration__Group__4__Impl )
            // InternalIoTDSL.g:962:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:968:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:972:1: ( ( '}' ) )
            // InternalIoTDSL.g:973:1: ( '}' )
            {
            // InternalIoTDSL.g:973:1: ( '}' )
            // InternalIoTDSL.g:974:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:984:1: rule__Enumeration__Group_3__0 : rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1 ;
    public final void rule__Enumeration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:988:1: ( rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1 )
            // InternalIoTDSL.g:989:2: rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Enumeration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:996:1: rule__Enumeration__Group_3__0__Impl : ( ( rule__Enumeration__LiteralsAssignment_3_0 ) ) ;
    public final void rule__Enumeration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1000:1: ( ( ( rule__Enumeration__LiteralsAssignment_3_0 ) ) )
            // InternalIoTDSL.g:1001:1: ( ( rule__Enumeration__LiteralsAssignment_3_0 ) )
            {
            // InternalIoTDSL.g:1001:1: ( ( rule__Enumeration__LiteralsAssignment_3_0 ) )
            // InternalIoTDSL.g:1002:2: ( rule__Enumeration__LiteralsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_0()); 
            }
            // InternalIoTDSL.g:1003:2: ( rule__Enumeration__LiteralsAssignment_3_0 )
            // InternalIoTDSL.g:1003:3: rule__Enumeration__LiteralsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1011:1: rule__Enumeration__Group_3__1 : rule__Enumeration__Group_3__1__Impl ;
    public final void rule__Enumeration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1015:1: ( rule__Enumeration__Group_3__1__Impl )
            // InternalIoTDSL.g:1016:2: rule__Enumeration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1022:1: rule__Enumeration__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Enumeration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1026:1: ( ( ';' ) )
            // InternalIoTDSL.g:1027:1: ( ';' )
            {
            // InternalIoTDSL.g:1027:1: ( ';' )
            // InternalIoTDSL.g:1028:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:1038:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1042:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalIoTDSL.g:1043:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1050:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1054:1: ( ( () ) )
            // InternalIoTDSL.g:1055:1: ( () )
            {
            // InternalIoTDSL.g:1055:1: ( () )
            // InternalIoTDSL.g:1056:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            }
            // InternalIoTDSL.g:1057:2: ()
            // InternalIoTDSL.g:1057:3: 
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
    // InternalIoTDSL.g:1065:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1069:1: ( rule__EnumerationLiteral__Group__1__Impl )
            // InternalIoTDSL.g:1070:2: rule__EnumerationLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1076:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1080:1: ( ( ( rule__EnumerationLiteral__NameAssignment_1 ) ) )
            // InternalIoTDSL.g:1081:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            {
            // InternalIoTDSL.g:1081:1: ( ( rule__EnumerationLiteral__NameAssignment_1 ) )
            // InternalIoTDSL.g:1082:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_1()); 
            }
            // InternalIoTDSL.g:1083:2: ( rule__EnumerationLiteral__NameAssignment_1 )
            // InternalIoTDSL.g:1083:3: rule__EnumerationLiteral__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__IntegerType__Group__0"
    // InternalIoTDSL.g:1092:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1096:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalIoTDSL.g:1097:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__IntegerType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1104:1: rule__IntegerType__Group__0__Impl : ( () ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1108:1: ( ( () ) )
            // InternalIoTDSL.g:1109:1: ( () )
            {
            // InternalIoTDSL.g:1109:1: ( () )
            // InternalIoTDSL.g:1110:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0()); 
            }
            // InternalIoTDSL.g:1111:2: ()
            // InternalIoTDSL.g:1111:3: 
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
    // InternalIoTDSL.g:1119:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1123:1: ( rule__IntegerType__Group__1__Impl )
            // InternalIoTDSL.g:1124:2: rule__IntegerType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1130:1: rule__IntegerType__Group__1__Impl : ( ( rule__IntegerType__NameAssignment_1 ) ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1134:1: ( ( ( rule__IntegerType__NameAssignment_1 ) ) )
            // InternalIoTDSL.g:1135:1: ( ( rule__IntegerType__NameAssignment_1 ) )
            {
            // InternalIoTDSL.g:1135:1: ( ( rule__IntegerType__NameAssignment_1 ) )
            // InternalIoTDSL.g:1136:2: ( rule__IntegerType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getNameAssignment_1()); 
            }
            // InternalIoTDSL.g:1137:2: ( rule__IntegerType__NameAssignment_1 )
            // InternalIoTDSL.g:1137:3: rule__IntegerType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1146:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1150:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalIoTDSL.g:1151:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1158:1: rule__BooleanType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1162:1: ( ( () ) )
            // InternalIoTDSL.g:1163:1: ( () )
            {
            // InternalIoTDSL.g:1163:1: ( () )
            // InternalIoTDSL.g:1164:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            }
            // InternalIoTDSL.g:1165:2: ()
            // InternalIoTDSL.g:1165:3: 
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
    // InternalIoTDSL.g:1173:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1177:1: ( rule__BooleanType__Group__1__Impl )
            // InternalIoTDSL.g:1178:2: rule__BooleanType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1184:1: rule__BooleanType__Group__1__Impl : ( ( rule__BooleanType__NameAssignment_1 ) ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1188:1: ( ( ( rule__BooleanType__NameAssignment_1 ) ) )
            // InternalIoTDSL.g:1189:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            {
            // InternalIoTDSL.g:1189:1: ( ( rule__BooleanType__NameAssignment_1 ) )
            // InternalIoTDSL.g:1190:2: ( rule__BooleanType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getNameAssignment_1()); 
            }
            // InternalIoTDSL.g:1191:2: ( rule__BooleanType__NameAssignment_1 )
            // InternalIoTDSL.g:1191:3: rule__BooleanType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1200:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1204:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalIoTDSL.g:1205:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__StringType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1212:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1216:1: ( ( () ) )
            // InternalIoTDSL.g:1217:1: ( () )
            {
            // InternalIoTDSL.g:1217:1: ( () )
            // InternalIoTDSL.g:1218:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            }
            // InternalIoTDSL.g:1219:2: ()
            // InternalIoTDSL.g:1219:3: 
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
    // InternalIoTDSL.g:1227:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1231:1: ( rule__StringType__Group__1__Impl )
            // InternalIoTDSL.g:1232:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1238:1: rule__StringType__Group__1__Impl : ( ( rule__StringType__NameAssignment_1 ) ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1242:1: ( ( ( rule__StringType__NameAssignment_1 ) ) )
            // InternalIoTDSL.g:1243:1: ( ( rule__StringType__NameAssignment_1 ) )
            {
            // InternalIoTDSL.g:1243:1: ( ( rule__StringType__NameAssignment_1 ) )
            // InternalIoTDSL.g:1244:2: ( rule__StringType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getNameAssignment_1()); 
            }
            // InternalIoTDSL.g:1245:2: ( rule__StringType__NameAssignment_1 )
            // InternalIoTDSL.g:1245:3: rule__StringType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1254:1: rule__RealType__Group__0 : rule__RealType__Group__0__Impl rule__RealType__Group__1 ;
    public final void rule__RealType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1258:1: ( rule__RealType__Group__0__Impl rule__RealType__Group__1 )
            // InternalIoTDSL.g:1259:2: rule__RealType__Group__0__Impl rule__RealType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RealType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1266:1: rule__RealType__Group__0__Impl : ( () ) ;
    public final void rule__RealType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1270:1: ( ( () ) )
            // InternalIoTDSL.g:1271:1: ( () )
            {
            // InternalIoTDSL.g:1271:1: ( () )
            // InternalIoTDSL.g:1272:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getRealTypeAction_0()); 
            }
            // InternalIoTDSL.g:1273:2: ()
            // InternalIoTDSL.g:1273:3: 
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
    // InternalIoTDSL.g:1281:1: rule__RealType__Group__1 : rule__RealType__Group__1__Impl ;
    public final void rule__RealType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1285:1: ( rule__RealType__Group__1__Impl )
            // InternalIoTDSL.g:1286:2: rule__RealType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1292:1: rule__RealType__Group__1__Impl : ( ( rule__RealType__NameAssignment_1 ) ) ;
    public final void rule__RealType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1296:1: ( ( ( rule__RealType__NameAssignment_1 ) ) )
            // InternalIoTDSL.g:1297:1: ( ( rule__RealType__NameAssignment_1 ) )
            {
            // InternalIoTDSL.g:1297:1: ( ( rule__RealType__NameAssignment_1 ) )
            // InternalIoTDSL.g:1298:2: ( rule__RealType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getNameAssignment_1()); 
            }
            // InternalIoTDSL.g:1299:2: ( rule__RealType__NameAssignment_1 )
            // InternalIoTDSL.g:1299:3: rule__RealType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Gateway__Group__0"
    // InternalIoTDSL.g:1308:1: rule__Gateway__Group__0 : rule__Gateway__Group__0__Impl rule__Gateway__Group__1 ;
    public final void rule__Gateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1312:1: ( rule__Gateway__Group__0__Impl rule__Gateway__Group__1 )
            // InternalIoTDSL.g:1313:2: rule__Gateway__Group__0__Impl rule__Gateway__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Gateway__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1320:1: rule__Gateway__Group__0__Impl : ( () ) ;
    public final void rule__Gateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1324:1: ( ( () ) )
            // InternalIoTDSL.g:1325:1: ( () )
            {
            // InternalIoTDSL.g:1325:1: ( () )
            // InternalIoTDSL.g:1326:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getGatewayAction_0()); 
            }
            // InternalIoTDSL.g:1327:2: ()
            // InternalIoTDSL.g:1327:3: 
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
    // InternalIoTDSL.g:1335:1: rule__Gateway__Group__1 : rule__Gateway__Group__1__Impl rule__Gateway__Group__2 ;
    public final void rule__Gateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1339:1: ( rule__Gateway__Group__1__Impl rule__Gateway__Group__2 )
            // InternalIoTDSL.g:1340:2: rule__Gateway__Group__1__Impl rule__Gateway__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Gateway__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1347:1: rule__Gateway__Group__1__Impl : ( ( rule__Gateway__Alternatives_1 ) ) ;
    public final void rule__Gateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1351:1: ( ( ( rule__Gateway__Alternatives_1 ) ) )
            // InternalIoTDSL.g:1352:1: ( ( rule__Gateway__Alternatives_1 ) )
            {
            // InternalIoTDSL.g:1352:1: ( ( rule__Gateway__Alternatives_1 ) )
            // InternalIoTDSL.g:1353:2: ( rule__Gateway__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getAlternatives_1()); 
            }
            // InternalIoTDSL.g:1354:2: ( rule__Gateway__Alternatives_1 )
            // InternalIoTDSL.g:1354:3: rule__Gateway__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Gateway__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGatewayAccess().getAlternatives_1()); 
            }

            }


            }

        }
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
    // InternalIoTDSL.g:1362:1: rule__Gateway__Group__2 : rule__Gateway__Group__2__Impl ;
    public final void rule__Gateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1366:1: ( rule__Gateway__Group__2__Impl )
            // InternalIoTDSL.g:1367:2: rule__Gateway__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1373:1: rule__Gateway__Group__2__Impl : ( ( rule__Gateway__NameAssignment_2 ) ) ;
    public final void rule__Gateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1377:1: ( ( ( rule__Gateway__NameAssignment_2 ) ) )
            // InternalIoTDSL.g:1378:1: ( ( rule__Gateway__NameAssignment_2 ) )
            {
            // InternalIoTDSL.g:1378:1: ( ( rule__Gateway__NameAssignment_2 ) )
            // InternalIoTDSL.g:1379:2: ( rule__Gateway__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getNameAssignment_2()); 
            }
            // InternalIoTDSL.g:1380:2: ( rule__Gateway__NameAssignment_2 )
            // InternalIoTDSL.g:1380:3: rule__Gateway__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Device__Group__0"
    // InternalIoTDSL.g:1389:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1393:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalIoTDSL.g:1394:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Device__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1401:1: rule__Device__Group__0__Impl : ( () ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1405:1: ( ( () ) )
            // InternalIoTDSL.g:1406:1: ( () )
            {
            // InternalIoTDSL.g:1406:1: ( () )
            // InternalIoTDSL.g:1407:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDeviceAction_0()); 
            }
            // InternalIoTDSL.g:1408:2: ()
            // InternalIoTDSL.g:1408:3: 
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
    // InternalIoTDSL.g:1416:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1420:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalIoTDSL.g:1421:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Device__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1428:1: rule__Device__Group__1__Impl : ( 'device' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1432:1: ( ( 'device' ) )
            // InternalIoTDSL.g:1433:1: ( 'device' )
            {
            // InternalIoTDSL.g:1433:1: ( 'device' )
            // InternalIoTDSL.g:1434:2: 'device'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDeviceKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:1443:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1447:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalIoTDSL.g:1448:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Device__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1455:1: rule__Device__Group__2__Impl : ( ( rule__Device__NameAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1459:1: ( ( ( rule__Device__NameAssignment_2 ) ) )
            // InternalIoTDSL.g:1460:1: ( ( rule__Device__NameAssignment_2 ) )
            {
            // InternalIoTDSL.g:1460:1: ( ( rule__Device__NameAssignment_2 ) )
            // InternalIoTDSL.g:1461:2: ( rule__Device__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getNameAssignment_2()); 
            }
            // InternalIoTDSL.g:1462:2: ( rule__Device__NameAssignment_2 )
            // InternalIoTDSL.g:1462:3: rule__Device__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1470:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1474:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalIoTDSL.g:1475:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Device__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1482:1: rule__Device__Group__3__Impl : ( '{' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1486:1: ( ( '{' ) )
            // InternalIoTDSL.g:1487:1: ( '{' )
            {
            // InternalIoTDSL.g:1487:1: ( '{' )
            // InternalIoTDSL.g:1488:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:1497:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1501:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalIoTDSL.g:1502:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Device__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1509:1: rule__Device__Group__4__Impl : ( ( rule__Device__FeaturesAssignment_4 )* ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1513:1: ( ( ( rule__Device__FeaturesAssignment_4 )* ) )
            // InternalIoTDSL.g:1514:1: ( ( rule__Device__FeaturesAssignment_4 )* )
            {
            // InternalIoTDSL.g:1514:1: ( ( rule__Device__FeaturesAssignment_4 )* )
            // InternalIoTDSL.g:1515:2: ( rule__Device__FeaturesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getFeaturesAssignment_4()); 
            }
            // InternalIoTDSL.g:1516:2: ( rule__Device__FeaturesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)||LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIoTDSL.g:1516:3: rule__Device__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Device__FeaturesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalIoTDSL.g:1524:1: rule__Device__Group__5 : rule__Device__Group__5__Impl ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1528:1: ( rule__Device__Group__5__Impl )
            // InternalIoTDSL.g:1529:2: rule__Device__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1535:1: rule__Device__Group__5__Impl : ( '}' ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1539:1: ( ( '}' ) )
            // InternalIoTDSL.g:1540:1: ( '}' )
            {
            // InternalIoTDSL.g:1540:1: ( '}' )
            // InternalIoTDSL.g:1541:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:1551:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1555:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalIoTDSL.g:1556:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1563:1: rule__Property__Group__0__Impl : ( 'property' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1567:1: ( ( 'property' ) )
            // InternalIoTDSL.g:1568:1: ( 'property' )
            {
            // InternalIoTDSL.g:1568:1: ( 'property' )
            // InternalIoTDSL.g:1569:2: 'property'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertyKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:1578:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1582:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalIoTDSL.g:1583:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1590:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1594:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalIoTDSL.g:1595:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalIoTDSL.g:1595:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalIoTDSL.g:1596:2: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // InternalIoTDSL.g:1597:2: ( rule__Property__NameAssignment_1 )
            // InternalIoTDSL.g:1597:3: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1605:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1609:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalIoTDSL.g:1610:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1617:1: rule__Property__Group__2__Impl : ( ':' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1621:1: ( ( ':' ) )
            // InternalIoTDSL.g:1622:1: ( ':' )
            {
            // InternalIoTDSL.g:1622:1: ( ':' )
            // InternalIoTDSL.g:1623:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:1632:1: rule__Property__Group__3 : rule__Property__Group__3__Impl ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1636:1: ( rule__Property__Group__3__Impl )
            // InternalIoTDSL.g:1637:2: rule__Property__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1643:1: rule__Property__Group__3__Impl : ( ( rule__Property__TypeAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1647:1: ( ( ( rule__Property__TypeAssignment_3 ) ) )
            // InternalIoTDSL.g:1648:1: ( ( rule__Property__TypeAssignment_3 ) )
            {
            // InternalIoTDSL.g:1648:1: ( ( rule__Property__TypeAssignment_3 ) )
            // InternalIoTDSL.g:1649:2: ( rule__Property__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            }
            // InternalIoTDSL.g:1650:2: ( rule__Property__TypeAssignment_3 )
            // InternalIoTDSL.g:1650:3: rule__Property__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Event__Group__0"
    // InternalIoTDSL.g:1659:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1663:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalIoTDSL.g:1664:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

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
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalIoTDSL.g:1671:1: rule__Event__Group__0__Impl : ( ( rule__Event__KindAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1675:1: ( ( ( rule__Event__KindAssignment_0 ) ) )
            // InternalIoTDSL.g:1676:1: ( ( rule__Event__KindAssignment_0 ) )
            {
            // InternalIoTDSL.g:1676:1: ( ( rule__Event__KindAssignment_0 ) )
            // InternalIoTDSL.g:1677:2: ( rule__Event__KindAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getKindAssignment_0()); 
            }
            // InternalIoTDSL.g:1678:2: ( rule__Event__KindAssignment_0 )
            // InternalIoTDSL.g:1678:3: rule__Event__KindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__KindAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getKindAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalIoTDSL.g:1686:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1690:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalIoTDSL.g:1691:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Event__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

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
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalIoTDSL.g:1698:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1702:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // InternalIoTDSL.g:1703:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // InternalIoTDSL.g:1703:1: ( ( rule__Event__NameAssignment_1 ) )
            // InternalIoTDSL.g:1704:2: ( rule__Event__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            }
            // InternalIoTDSL.g:1705:2: ( rule__Event__NameAssignment_1 )
            // InternalIoTDSL.g:1705:3: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalIoTDSL.g:1713:1: rule__Event__Group__2 : rule__Event__Group__2__Impl ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1717:1: ( rule__Event__Group__2__Impl )
            // InternalIoTDSL.g:1718:2: rule__Event__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__2__Impl();

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
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalIoTDSL.g:1724:1: rule__Event__Group__2__Impl : ( ( rule__Event__Group_2__0 )? ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1728:1: ( ( ( rule__Event__Group_2__0 )? ) )
            // InternalIoTDSL.g:1729:1: ( ( rule__Event__Group_2__0 )? )
            {
            // InternalIoTDSL.g:1729:1: ( ( rule__Event__Group_2__0 )? )
            // InternalIoTDSL.g:1730:2: ( rule__Event__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2()); 
            }
            // InternalIoTDSL.g:1731:2: ( rule__Event__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIoTDSL.g:1731:3: rule__Event__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group_2__0"
    // InternalIoTDSL.g:1740:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1744:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalIoTDSL.g:1745:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Event__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__1();

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
    // $ANTLR end "rule__Event__Group_2__0"


    // $ANTLR start "rule__Event__Group_2__0__Impl"
    // InternalIoTDSL.g:1752:1: rule__Event__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1756:1: ( ( '(' ) )
            // InternalIoTDSL.g:1757:1: ( '(' )
            {
            // InternalIoTDSL.g:1757:1: ( '(' )
            // InternalIoTDSL.g:1758:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__0__Impl"


    // $ANTLR start "rule__Event__Group_2__1"
    // InternalIoTDSL.g:1767:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl rule__Event__Group_2__2 ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1771:1: ( rule__Event__Group_2__1__Impl rule__Event__Group_2__2 )
            // InternalIoTDSL.g:1772:2: rule__Event__Group_2__1__Impl rule__Event__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Event__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__2();

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
    // $ANTLR end "rule__Event__Group_2__1"


    // $ANTLR start "rule__Event__Group_2__1__Impl"
    // InternalIoTDSL.g:1779:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__Group_2_1__0 )? ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1783:1: ( ( ( rule__Event__Group_2_1__0 )? ) )
            // InternalIoTDSL.g:1784:1: ( ( rule__Event__Group_2_1__0 )? )
            {
            // InternalIoTDSL.g:1784:1: ( ( rule__Event__Group_2_1__0 )? )
            // InternalIoTDSL.g:1785:2: ( rule__Event__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2_1()); 
            }
            // InternalIoTDSL.g:1786:2: ( rule__Event__Group_2_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTDSL.g:1786:3: rule__Event__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__1__Impl"


    // $ANTLR start "rule__Event__Group_2__2"
    // InternalIoTDSL.g:1794:1: rule__Event__Group_2__2 : rule__Event__Group_2__2__Impl ;
    public final void rule__Event__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1798:1: ( rule__Event__Group_2__2__Impl )
            // InternalIoTDSL.g:1799:2: rule__Event__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__2__Impl();

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
    // $ANTLR end "rule__Event__Group_2__2"


    // $ANTLR start "rule__Event__Group_2__2__Impl"
    // InternalIoTDSL.g:1805:1: rule__Event__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Event__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1809:1: ( ( ')' ) )
            // InternalIoTDSL.g:1810:1: ( ')' )
            {
            // InternalIoTDSL.g:1810:1: ( ')' )
            // InternalIoTDSL.g:1811:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__2__Impl"


    // $ANTLR start "rule__Event__Group_2_1__0"
    // InternalIoTDSL.g:1821:1: rule__Event__Group_2_1__0 : rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 ;
    public final void rule__Event__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1825:1: ( rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 )
            // InternalIoTDSL.g:1826:2: rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Event__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_1__1();

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
    // $ANTLR end "rule__Event__Group_2_1__0"


    // $ANTLR start "rule__Event__Group_2_1__0__Impl"
    // InternalIoTDSL.g:1833:1: rule__Event__Group_2_1__0__Impl : ( ( rule__Event__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Event__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1837:1: ( ( ( rule__Event__ParametersAssignment_2_1_0 ) ) )
            // InternalIoTDSL.g:1838:1: ( ( rule__Event__ParametersAssignment_2_1_0 ) )
            {
            // InternalIoTDSL.g:1838:1: ( ( rule__Event__ParametersAssignment_2_1_0 ) )
            // InternalIoTDSL.g:1839:2: ( rule__Event__ParametersAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParametersAssignment_2_1_0()); 
            }
            // InternalIoTDSL.g:1840:2: ( rule__Event__ParametersAssignment_2_1_0 )
            // InternalIoTDSL.g:1840:3: rule__Event__ParametersAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__ParametersAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParametersAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__0__Impl"


    // $ANTLR start "rule__Event__Group_2_1__1"
    // InternalIoTDSL.g:1848:1: rule__Event__Group_2_1__1 : rule__Event__Group_2_1__1__Impl ;
    public final void rule__Event__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1852:1: ( rule__Event__Group_2_1__1__Impl )
            // InternalIoTDSL.g:1853:2: rule__Event__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Event__Group_2_1__1"


    // $ANTLR start "rule__Event__Group_2_1__1__Impl"
    // InternalIoTDSL.g:1859:1: rule__Event__Group_2_1__1__Impl : ( ( rule__Event__Group_2_1_1__0 )* ) ;
    public final void rule__Event__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1863:1: ( ( ( rule__Event__Group_2_1_1__0 )* ) )
            // InternalIoTDSL.g:1864:1: ( ( rule__Event__Group_2_1_1__0 )* )
            {
            // InternalIoTDSL.g:1864:1: ( ( rule__Event__Group_2_1_1__0 )* )
            // InternalIoTDSL.g:1865:2: ( rule__Event__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2_1_1()); 
            }
            // InternalIoTDSL.g:1866:2: ( rule__Event__Group_2_1_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIoTDSL.g:1866:3: rule__Event__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Event__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__1__Impl"


    // $ANTLR start "rule__Event__Group_2_1_1__0"
    // InternalIoTDSL.g:1875:1: rule__Event__Group_2_1_1__0 : rule__Event__Group_2_1_1__0__Impl rule__Event__Group_2_1_1__1 ;
    public final void rule__Event__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1879:1: ( rule__Event__Group_2_1_1__0__Impl rule__Event__Group_2_1_1__1 )
            // InternalIoTDSL.g:1880:2: rule__Event__Group_2_1_1__0__Impl rule__Event__Group_2_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_1_1__1();

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
    // $ANTLR end "rule__Event__Group_2_1_1__0"


    // $ANTLR start "rule__Event__Group_2_1_1__0__Impl"
    // InternalIoTDSL.g:1887:1: rule__Event__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1891:1: ( ( ',' ) )
            // InternalIoTDSL.g:1892:1: ( ',' )
            {
            // InternalIoTDSL.g:1892:1: ( ',' )
            // InternalIoTDSL.g:1893:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getCommaKeyword_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Event__Group_2_1_1__1"
    // InternalIoTDSL.g:1902:1: rule__Event__Group_2_1_1__1 : rule__Event__Group_2_1_1__1__Impl ;
    public final void rule__Event__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1906:1: ( rule__Event__Group_2_1_1__1__Impl )
            // InternalIoTDSL.g:1907:2: rule__Event__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__Event__Group_2_1_1__1"


    // $ANTLR start "rule__Event__Group_2_1_1__1__Impl"
    // InternalIoTDSL.g:1913:1: rule__Event__Group_2_1_1__1__Impl : ( ( rule__Event__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Event__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1917:1: ( ( ( rule__Event__ParametersAssignment_2_1_1_1 ) ) )
            // InternalIoTDSL.g:1918:1: ( ( rule__Event__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalIoTDSL.g:1918:1: ( ( rule__Event__ParametersAssignment_2_1_1_1 ) )
            // InternalIoTDSL.g:1919:2: ( rule__Event__ParametersAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParametersAssignment_2_1_1_1()); 
            }
            // InternalIoTDSL.g:1920:2: ( rule__Event__ParametersAssignment_2_1_1_1 )
            // InternalIoTDSL.g:1920:3: rule__Event__ParametersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ParametersAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParametersAssignment_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalIoTDSL.g:1929:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1933:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalIoTDSL.g:1934:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1941:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1945:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalIoTDSL.g:1946:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalIoTDSL.g:1946:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalIoTDSL.g:1947:2: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // InternalIoTDSL.g:1948:2: ( rule__Parameter__NameAssignment_0 )
            // InternalIoTDSL.g:1948:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1956:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1960:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalIoTDSL.g:1961:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1968:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1972:1: ( ( ':' ) )
            // InternalIoTDSL.g:1973:1: ( ':' )
            {
            // InternalIoTDSL.g:1973:1: ( ':' )
            // InternalIoTDSL.g:1974:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:1983:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1987:1: ( rule__Parameter__Group__2__Impl )
            // InternalIoTDSL.g:1988:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:1994:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:1998:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalIoTDSL.g:1999:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalIoTDSL.g:1999:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalIoTDSL.g:2000:2: ( rule__Parameter__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            }
            // InternalIoTDSL.g:2001:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalIoTDSL.g:2001:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalIoTDSL.g:2010:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2014:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalIoTDSL.g:2015:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2022:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2026:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2027:1: ( ruleValidID )
            {
            // InternalIoTDSL.g:2027:1: ( ruleValidID )
            // InternalIoTDSL.g:2028:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2037:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2041:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalIoTDSL.g:2042:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2048:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2052:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalIoTDSL.g:2053:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalIoTDSL.g:2053:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalIoTDSL.g:2054:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalIoTDSL.g:2055:2: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIoTDSL.g:2055:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalIoTDSL.g:2064:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2068:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalIoTDSL.g:2069:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2076:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2080:1: ( ( ( '.' ) ) )
            // InternalIoTDSL.g:2081:1: ( ( '.' ) )
            {
            // InternalIoTDSL.g:2081:1: ( ( '.' ) )
            // InternalIoTDSL.g:2082:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalIoTDSL.g:2083:2: ( '.' )
            // InternalIoTDSL.g:2083:3: '.'
            {
            match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalIoTDSL.g:2091:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2095:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalIoTDSL.g:2096:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2102:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2106:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2107:1: ( ruleValidID )
            {
            // InternalIoTDSL.g:2107:1: ( ruleValidID )
            // InternalIoTDSL.g:2108:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2118:1: rule__IoTModel__TypesAssignment_1 : ( ruleType ) ;
    public final void rule__IoTModel__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2122:1: ( ( ruleType ) )
            // InternalIoTDSL.g:2123:2: ( ruleType )
            {
            // InternalIoTDSL.g:2123:2: ( ruleType )
            // InternalIoTDSL.g:2124:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIoTModelAccess().getTypesTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalIoTDSL.g:2133:1: rule__Enumeration__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2137:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2138:2: ( ruleValidID )
            {
            // InternalIoTDSL.g:2138:2: ( ruleValidID )
            // InternalIoTDSL.g:2139:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2148:1: rule__Enumeration__LiteralsAssignment_3_0 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2152:1: ( ( ruleEnumerationLiteral ) )
            // InternalIoTDSL.g:2153:2: ( ruleEnumerationLiteral )
            {
            // InternalIoTDSL.g:2153:2: ( ruleEnumerationLiteral )
            // InternalIoTDSL.g:2154:3: ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2163:1: rule__EnumerationLiteral__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__EnumerationLiteral__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2167:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2168:2: ( ruleValidID )
            {
            // InternalIoTDSL.g:2168:2: ( ruleValidID )
            // InternalIoTDSL.g:2169:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationLiteralAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__IntegerType__NameAssignment_1"
    // InternalIoTDSL.g:2178:1: rule__IntegerType__NameAssignment_1 : ( ( 'integer' ) ) ;
    public final void rule__IntegerType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2182:1: ( ( ( 'integer' ) ) )
            // InternalIoTDSL.g:2183:2: ( ( 'integer' ) )
            {
            // InternalIoTDSL.g:2183:2: ( ( 'integer' ) )
            // InternalIoTDSL.g:2184:3: ( 'integer' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getNameIntegerKeyword_1_0()); 
            }
            // InternalIoTDSL.g:2185:3: ( 'integer' )
            // InternalIoTDSL.g:2186:4: 'integer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerTypeAccess().getNameIntegerKeyword_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:2197:1: rule__BooleanType__NameAssignment_1 : ( ( 'boolean' ) ) ;
    public final void rule__BooleanType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2201:1: ( ( ( 'boolean' ) ) )
            // InternalIoTDSL.g:2202:2: ( ( 'boolean' ) )
            {
            // InternalIoTDSL.g:2202:2: ( ( 'boolean' ) )
            // InternalIoTDSL.g:2203:3: ( 'boolean' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getNameBooleanKeyword_1_0()); 
            }
            // InternalIoTDSL.g:2204:3: ( 'boolean' )
            // InternalIoTDSL.g:2205:4: 'boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanTypeAccess().getNameBooleanKeyword_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:2216:1: rule__StringType__NameAssignment_1 : ( ( 'string' ) ) ;
    public final void rule__StringType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2220:1: ( ( ( 'string' ) ) )
            // InternalIoTDSL.g:2221:2: ( ( 'string' ) )
            {
            // InternalIoTDSL.g:2221:2: ( ( 'string' ) )
            // InternalIoTDSL.g:2222:3: ( 'string' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 
            }
            // InternalIoTDSL.g:2223:3: ( 'string' )
            // InternalIoTDSL.g:2224:4: 'string'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalIoTDSL.g:2235:1: rule__RealType__NameAssignment_1 : ( ( 'real' ) ) ;
    public final void rule__RealType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2239:1: ( ( ( 'real' ) ) )
            // InternalIoTDSL.g:2240:2: ( ( 'real' ) )
            {
            // InternalIoTDSL.g:2240:2: ( ( 'real' ) )
            // InternalIoTDSL.g:2241:3: ( 'real' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getNameRealKeyword_1_0()); 
            }
            // InternalIoTDSL.g:2242:3: ( 'real' )
            // InternalIoTDSL.g:2243:4: 'real'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealTypeAccess().getNameRealKeyword_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Gateway__NameAssignment_2"
    // InternalIoTDSL.g:2254:1: rule__Gateway__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Gateway__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2258:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2259:2: ( ruleValidID )
            {
            // InternalIoTDSL.g:2259:2: ( ruleValidID )
            // InternalIoTDSL.g:2260:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGatewayAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Device__NameAssignment_2"
    // InternalIoTDSL.g:2269:1: rule__Device__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__Device__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2273:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2274:2: ( ruleValidID )
            {
            // InternalIoTDSL.g:2274:2: ( ruleValidID )
            // InternalIoTDSL.g:2275:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2284:1: rule__Device__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Device__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2288:1: ( ( ruleFeature ) )
            // InternalIoTDSL.g:2289:2: ( ruleFeature )
            {
            // InternalIoTDSL.g:2289:2: ( ruleFeature )
            // InternalIoTDSL.g:2290:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2299:1: rule__Property__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2303:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2304:2: ( ruleValidID )
            {
            // InternalIoTDSL.g:2304:2: ( ruleValidID )
            // InternalIoTDSL.g:2305:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2314:1: rule__Property__TypeAssignment_3 : ( ruleTypeReference ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2318:1: ( ( ruleTypeReference ) )
            // InternalIoTDSL.g:2319:2: ( ruleTypeReference )
            {
            // InternalIoTDSL.g:2319:2: ( ruleTypeReference )
            // InternalIoTDSL.g:2320:3: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTypeReferenceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Event__KindAssignment_0"
    // InternalIoTDSL.g:2329:1: rule__Event__KindAssignment_0 : ( ruleEventType ) ;
    public final void rule__Event__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2333:1: ( ( ruleEventType ) )
            // InternalIoTDSL.g:2334:2: ( ruleEventType )
            {
            // InternalIoTDSL.g:2334:2: ( ruleEventType )
            // InternalIoTDSL.g:2335:3: ruleEventType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getKindEventTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEventType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getKindEventTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__KindAssignment_0"


    // $ANTLR start "rule__Event__NameAssignment_1"
    // InternalIoTDSL.g:2344:1: rule__Event__NameAssignment_1 : ( ruleValidID ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2348:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2349:2: ( ruleValidID )
            {
            // InternalIoTDSL.g:2349:2: ( ruleValidID )
            // InternalIoTDSL.g:2350:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameValidIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameValidIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_1"


    // $ANTLR start "rule__Event__ParametersAssignment_2_1_0"
    // InternalIoTDSL.g:2359:1: rule__Event__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Event__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2363:1: ( ( ruleParameter ) )
            // InternalIoTDSL.g:2364:2: ( ruleParameter )
            {
            // InternalIoTDSL.g:2364:2: ( ruleParameter )
            // InternalIoTDSL.g:2365:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParametersAssignment_2_1_0"


    // $ANTLR start "rule__Event__ParametersAssignment_2_1_1_1"
    // InternalIoTDSL.g:2374:1: rule__Event__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Event__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2378:1: ( ( ruleParameter ) )
            // InternalIoTDSL.g:2379:2: ( ruleParameter )
            {
            // InternalIoTDSL.g:2379:2: ( ruleParameter )
            // InternalIoTDSL.g:2380:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParametersAssignment_2_1_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalIoTDSL.g:2389:1: rule__Parameter__NameAssignment_0 : ( ruleValidID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2393:1: ( ( ruleValidID ) )
            // InternalIoTDSL.g:2394:2: ( ruleValidID )
            {
            // InternalIoTDSL.g:2394:2: ( ruleValidID )
            // InternalIoTDSL.g:2395:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2404:1: rule__Parameter__TypeAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2408:1: ( ( ruleTypeReference ) )
            // InternalIoTDSL.g:2409:2: ( ruleTypeReference )
            {
            // InternalIoTDSL.g:2409:2: ( ruleTypeReference )
            // InternalIoTDSL.g:2410:3: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2419:1: rule__TypeReference__PtypeAssignment_0 : ( rulePrimitiveType ) ;
    public final void rule__TypeReference__PtypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2423:1: ( ( rulePrimitiveType ) )
            // InternalIoTDSL.g:2424:2: ( rulePrimitiveType )
            {
            // InternalIoTDSL.g:2424:2: ( rulePrimitiveType )
            // InternalIoTDSL.g:2425:3: rulePrimitiveType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getPtypePrimitiveTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalIoTDSL.g:2434:1: rule__TypeReference__DtypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TypeReference__DtypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoTDSL.g:2438:1: ( ( ( ruleQualifiedName ) ) )
            // InternalIoTDSL.g:2439:2: ( ( ruleQualifiedName ) )
            {
            // InternalIoTDSL.g:2439:2: ( ( ruleQualifiedName ) )
            // InternalIoTDSL.g:2440:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getDtypeDeclaredTypeCrossReference_1_0()); 
            }
            // InternalIoTDSL.g:2441:3: ( ruleQualifiedName )
            // InternalIoTDSL.g:2442:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getDtypeDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000003C089800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000003C089802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000081800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000126000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000106002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003C089810L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});

}