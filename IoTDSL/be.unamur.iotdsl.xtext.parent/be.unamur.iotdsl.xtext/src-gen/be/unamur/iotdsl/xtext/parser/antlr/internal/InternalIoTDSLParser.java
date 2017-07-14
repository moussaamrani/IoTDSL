package be.unamur.iotdsl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import be.unamur.iotdsl.xtext.services.IoTDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIoTDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'enumeration'", "'{'", "';'", "'}'", "'integer'", "'boolean'", "'string'", "'real'", "'gateway'", "'middleware'", "'device'", "'property'", "':'", "'('", "','", "')'", "'.'", "'sensing'", "'actuating'"
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

        public InternalIoTDSLParser(TokenStream input, IoTDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "IoTModel";
       	}

       	@Override
       	protected IoTDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleIoTModel"
    // InternalIoTDSL.g:65:1: entryRuleIoTModel returns [EObject current=null] : iv_ruleIoTModel= ruleIoTModel EOF ;
    public final EObject entryRuleIoTModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIoTModel = null;


        try {
            // InternalIoTDSL.g:65:49: (iv_ruleIoTModel= ruleIoTModel EOF )
            // InternalIoTDSL.g:66:2: iv_ruleIoTModel= ruleIoTModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIoTModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIoTModel=ruleIoTModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIoTModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIoTModel"


    // $ANTLR start "ruleIoTModel"
    // InternalIoTDSL.g:72:1: ruleIoTModel returns [EObject current=null] : ( () ( (lv_types_1_0= ruleType ) )* ) ;
    public final EObject ruleIoTModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:78:2: ( ( () ( (lv_types_1_0= ruleType ) )* ) )
            // InternalIoTDSL.g:79:2: ( () ( (lv_types_1_0= ruleType ) )* )
            {
            // InternalIoTDSL.g:79:2: ( () ( (lv_types_1_0= ruleType ) )* )
            // InternalIoTDSL.g:80:3: () ( (lv_types_1_0= ruleType ) )*
            {
            // InternalIoTDSL.g:80:3: ()
            // InternalIoTDSL.g:81:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIoTModelAccess().getIoTModelAction_0(),
              					current);
              			
            }

            }

            // InternalIoTDSL.g:87:3: ( (lv_types_1_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIoTDSL.g:88:4: (lv_types_1_0= ruleType )
            	    {
            	    // InternalIoTDSL.g:88:4: (lv_types_1_0= ruleType )
            	    // InternalIoTDSL.g:89:5: lv_types_1_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIoTModelAccess().getTypesTypeParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_types_1_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIoTModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"types",
            	      						lv_types_1_0,
            	      						"be.unamur.iotdsl.xtext.IoTDSL.Type");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIoTModel"


    // $ANTLR start "entryRuleType"
    // InternalIoTDSL.g:110:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalIoTDSL.g:110:45: (iv_ruleType= ruleType EOF )
            // InternalIoTDSL.g:111:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalIoTDSL.g:117:1: ruleType returns [EObject current=null] : (this_DeclaredType_0= ruleDeclaredType | this_PrimitiveType_1= rulePrimitiveType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DeclaredType_0 = null;

        EObject this_PrimitiveType_1 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:123:2: ( (this_DeclaredType_0= ruleDeclaredType | this_PrimitiveType_1= rulePrimitiveType ) )
            // InternalIoTDSL.g:124:2: (this_DeclaredType_0= ruleDeclaredType | this_PrimitiveType_1= rulePrimitiveType )
            {
            // InternalIoTDSL.g:124:2: (this_DeclaredType_0= ruleDeclaredType | this_PrimitiveType_1= rulePrimitiveType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||(LA2_0>=19 && LA2_0<=21)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=18)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalIoTDSL.g:125:3: this_DeclaredType_0= ruleDeclaredType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getDeclaredTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DeclaredType_0=ruleDeclaredType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DeclaredType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:134:3: this_PrimitiveType_1= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDeclaredType"
    // InternalIoTDSL.g:146:1: entryRuleDeclaredType returns [EObject current=null] : iv_ruleDeclaredType= ruleDeclaredType EOF ;
    public final EObject entryRuleDeclaredType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredType = null;


        try {
            // InternalIoTDSL.g:146:53: (iv_ruleDeclaredType= ruleDeclaredType EOF )
            // InternalIoTDSL.g:147:2: iv_ruleDeclaredType= ruleDeclaredType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredType=ruleDeclaredType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclaredType"


    // $ANTLR start "ruleDeclaredType"
    // InternalIoTDSL.g:153:1: ruleDeclaredType returns [EObject current=null] : (this_Node_0= ruleNode | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleDeclaredType() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:159:2: ( (this_Node_0= ruleNode | this_Enumeration_1= ruleEnumeration ) )
            // InternalIoTDSL.g:160:2: (this_Node_0= ruleNode | this_Enumeration_1= ruleEnumeration )
            {
            // InternalIoTDSL.g:160:2: (this_Node_0= ruleNode | this_Enumeration_1= ruleEnumeration )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=19 && LA3_0<=21)) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIoTDSL.g:161:3: this_Node_0= ruleNode
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclaredTypeAccess().getNodeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Node_0=ruleNode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Node_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:170:3: this_Enumeration_1= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclaredTypeAccess().getEnumerationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Enumeration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDeclaredType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalIoTDSL.g:182:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalIoTDSL.g:182:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalIoTDSL.g:183:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalIoTDSL.g:189:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:195:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // InternalIoTDSL.g:196:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // InternalIoTDSL.g:196:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // InternalIoTDSL.g:197:3: otherlv_0= 'enumeration' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
              		
            }
            // InternalIoTDSL.g:201:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalIoTDSL.g:202:4: (lv_name_1_0= ruleValidID )
            {
            // InternalIoTDSL.g:202:4: (lv_name_1_0= ruleValidID )
            // InternalIoTDSL.g:203:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumerationAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumerationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalIoTDSL.g:224:3: ( ( (lv_literals_3_0= ruleEnumerationLiteral ) ) otherlv_4= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIoTDSL.g:225:4: ( (lv_literals_3_0= ruleEnumerationLiteral ) ) otherlv_4= ';'
            	    {
            	    // InternalIoTDSL.g:225:4: ( (lv_literals_3_0= ruleEnumerationLiteral ) )
            	    // InternalIoTDSL.g:226:5: (lv_literals_3_0= ruleEnumerationLiteral )
            	    {
            	    // InternalIoTDSL.g:226:5: (lv_literals_3_0= ruleEnumerationLiteral )
            	    // InternalIoTDSL.g:227:6: lv_literals_3_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_literals_3_0=ruleEnumerationLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"literals",
            	      							lv_literals_3_0,
            	      							"be.unamur.iotdsl.xtext.IoTDSL.EnumerationLiteral");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getSemicolonKeyword_3_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalIoTDSL.g:257:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalIoTDSL.g:257:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalIoTDSL.g:258:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalIoTDSL.g:264:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:270:2: ( ( () ( (lv_name_1_0= ruleValidID ) ) ) )
            // InternalIoTDSL.g:271:2: ( () ( (lv_name_1_0= ruleValidID ) ) )
            {
            // InternalIoTDSL.g:271:2: ( () ( (lv_name_1_0= ruleValidID ) ) )
            // InternalIoTDSL.g:272:3: () ( (lv_name_1_0= ruleValidID ) )
            {
            // InternalIoTDSL.g:272:3: ()
            // InternalIoTDSL.g:273:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalIoTDSL.g:279:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalIoTDSL.g:280:4: (lv_name_1_0= ruleValidID )
            {
            // InternalIoTDSL.g:280:4: (lv_name_1_0= ruleValidID )
            // InternalIoTDSL.g:281:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalIoTDSL.g:302:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalIoTDSL.g:302:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalIoTDSL.g:303:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalIoTDSL.g:309:1: rulePrimitiveType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType | this_RealType_3= ruleRealType ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_StringType_2 = null;

        EObject this_RealType_3 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:315:2: ( (this_IntegerType_0= ruleIntegerType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType | this_RealType_3= ruleRealType ) )
            // InternalIoTDSL.g:316:2: (this_IntegerType_0= ruleIntegerType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType | this_RealType_3= ruleRealType )
            {
            // InternalIoTDSL.g:316:2: (this_IntegerType_0= ruleIntegerType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType | this_RealType_3= ruleRealType )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalIoTDSL.g:317:3: this_IntegerType_0= ruleIntegerType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:326:3: this_BooleanType_1= ruleBooleanType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalIoTDSL.g:335:3: this_StringType_2= ruleStringType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringType_2=ruleStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalIoTDSL.g:344:3: this_RealType_3= ruleRealType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getRealTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RealType_3=ruleRealType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RealType_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalIoTDSL.g:356:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalIoTDSL.g:356:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalIoTDSL.g:357:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalIoTDSL.g:363:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_name_1_0= 'integer' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIoTDSL.g:369:2: ( ( () ( (lv_name_1_0= 'integer' ) ) ) )
            // InternalIoTDSL.g:370:2: ( () ( (lv_name_1_0= 'integer' ) ) )
            {
            // InternalIoTDSL.g:370:2: ( () ( (lv_name_1_0= 'integer' ) ) )
            // InternalIoTDSL.g:371:3: () ( (lv_name_1_0= 'integer' ) )
            {
            // InternalIoTDSL.g:371:3: ()
            // InternalIoTDSL.g:372:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
              					current);
              			
            }

            }

            // InternalIoTDSL.g:378:3: ( (lv_name_1_0= 'integer' ) )
            // InternalIoTDSL.g:379:4: (lv_name_1_0= 'integer' )
            {
            // InternalIoTDSL.g:379:4: (lv_name_1_0= 'integer' )
            // InternalIoTDSL.g:380:5: lv_name_1_0= 'integer'
            {
            lv_name_1_0=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getIntegerTypeAccess().getNameIntegerKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntegerTypeRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "integer");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalIoTDSL.g:396:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalIoTDSL.g:396:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalIoTDSL.g:397:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalIoTDSL.g:403:1: ruleBooleanType returns [EObject current=null] : ( () ( (lv_name_1_0= 'boolean' ) ) ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIoTDSL.g:409:2: ( ( () ( (lv_name_1_0= 'boolean' ) ) ) )
            // InternalIoTDSL.g:410:2: ( () ( (lv_name_1_0= 'boolean' ) ) )
            {
            // InternalIoTDSL.g:410:2: ( () ( (lv_name_1_0= 'boolean' ) ) )
            // InternalIoTDSL.g:411:3: () ( (lv_name_1_0= 'boolean' ) )
            {
            // InternalIoTDSL.g:411:3: ()
            // InternalIoTDSL.g:412:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
              					current);
              			
            }

            }

            // InternalIoTDSL.g:418:3: ( (lv_name_1_0= 'boolean' ) )
            // InternalIoTDSL.g:419:4: (lv_name_1_0= 'boolean' )
            {
            // InternalIoTDSL.g:419:4: (lv_name_1_0= 'boolean' )
            // InternalIoTDSL.g:420:5: lv_name_1_0= 'boolean'
            {
            lv_name_1_0=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getBooleanTypeAccess().getNameBooleanKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBooleanTypeRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "boolean");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // InternalIoTDSL.g:436:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalIoTDSL.g:436:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalIoTDSL.g:437:2: iv_ruleStringType= ruleStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalIoTDSL.g:443:1: ruleStringType returns [EObject current=null] : ( () ( (lv_name_1_0= 'string' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIoTDSL.g:449:2: ( ( () ( (lv_name_1_0= 'string' ) ) ) )
            // InternalIoTDSL.g:450:2: ( () ( (lv_name_1_0= 'string' ) ) )
            {
            // InternalIoTDSL.g:450:2: ( () ( (lv_name_1_0= 'string' ) ) )
            // InternalIoTDSL.g:451:3: () ( (lv_name_1_0= 'string' ) )
            {
            // InternalIoTDSL.g:451:3: ()
            // InternalIoTDSL.g:452:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
              					current);
              			
            }

            }

            // InternalIoTDSL.g:458:3: ( (lv_name_1_0= 'string' ) )
            // InternalIoTDSL.g:459:4: (lv_name_1_0= 'string' )
            {
            // InternalIoTDSL.g:459:4: (lv_name_1_0= 'string' )
            // InternalIoTDSL.g:460:5: lv_name_1_0= 'string'
            {
            lv_name_1_0=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringTypeRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "string");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleRealType"
    // InternalIoTDSL.g:476:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // InternalIoTDSL.g:476:49: (iv_ruleRealType= ruleRealType EOF )
            // InternalIoTDSL.g:477:2: iv_ruleRealType= ruleRealType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRealType=ruleRealType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // InternalIoTDSL.g:483:1: ruleRealType returns [EObject current=null] : ( () ( (lv_name_1_0= 'real' ) ) ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalIoTDSL.g:489:2: ( ( () ( (lv_name_1_0= 'real' ) ) ) )
            // InternalIoTDSL.g:490:2: ( () ( (lv_name_1_0= 'real' ) ) )
            {
            // InternalIoTDSL.g:490:2: ( () ( (lv_name_1_0= 'real' ) ) )
            // InternalIoTDSL.g:491:3: () ( (lv_name_1_0= 'real' ) )
            {
            // InternalIoTDSL.g:491:3: ()
            // InternalIoTDSL.g:492:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRealTypeAccess().getRealTypeAction_0(),
              					current);
              			
            }

            }

            // InternalIoTDSL.g:498:3: ( (lv_name_1_0= 'real' ) )
            // InternalIoTDSL.g:499:4: (lv_name_1_0= 'real' )
            {
            // InternalIoTDSL.g:499:4: (lv_name_1_0= 'real' )
            // InternalIoTDSL.g:500:5: lv_name_1_0= 'real'
            {
            lv_name_1_0=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRealTypeAccess().getNameRealKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRealTypeRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_1_0, "real");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleNode"
    // InternalIoTDSL.g:516:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalIoTDSL.g:516:45: (iv_ruleNode= ruleNode EOF )
            // InternalIoTDSL.g:517:2: iv_ruleNode= ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalIoTDSL.g:523:1: ruleNode returns [EObject current=null] : (this_Gateway_0= ruleGateway | this_Device_1= ruleDevice ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Gateway_0 = null;

        EObject this_Device_1 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:529:2: ( (this_Gateway_0= ruleGateway | this_Device_1= ruleDevice ) )
            // InternalIoTDSL.g:530:2: (this_Gateway_0= ruleGateway | this_Device_1= ruleDevice )
            {
            // InternalIoTDSL.g:530:2: (this_Gateway_0= ruleGateway | this_Device_1= ruleDevice )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIoTDSL.g:531:3: this_Gateway_0= ruleGateway
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNodeAccess().getGatewayParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Gateway_0=ruleGateway();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Gateway_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:540:3: this_Device_1= ruleDevice
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNodeAccess().getDeviceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Device_1=ruleDevice();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Device_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleGateway"
    // InternalIoTDSL.g:552:1: entryRuleGateway returns [EObject current=null] : iv_ruleGateway= ruleGateway EOF ;
    public final EObject entryRuleGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGateway = null;


        try {
            // InternalIoTDSL.g:552:48: (iv_ruleGateway= ruleGateway EOF )
            // InternalIoTDSL.g:553:2: iv_ruleGateway= ruleGateway EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGatewayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGateway=ruleGateway();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGateway; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGateway"


    // $ANTLR start "ruleGateway"
    // InternalIoTDSL.g:559:1: ruleGateway returns [EObject current=null] : ( () (otherlv_1= 'gateway' | otherlv_2= 'middleware' ) ( (lv_name_3_0= ruleValidID ) ) ) ;
    public final EObject ruleGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:565:2: ( ( () (otherlv_1= 'gateway' | otherlv_2= 'middleware' ) ( (lv_name_3_0= ruleValidID ) ) ) )
            // InternalIoTDSL.g:566:2: ( () (otherlv_1= 'gateway' | otherlv_2= 'middleware' ) ( (lv_name_3_0= ruleValidID ) ) )
            {
            // InternalIoTDSL.g:566:2: ( () (otherlv_1= 'gateway' | otherlv_2= 'middleware' ) ( (lv_name_3_0= ruleValidID ) ) )
            // InternalIoTDSL.g:567:3: () (otherlv_1= 'gateway' | otherlv_2= 'middleware' ) ( (lv_name_3_0= ruleValidID ) )
            {
            // InternalIoTDSL.g:567:3: ()
            // InternalIoTDSL.g:568:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGatewayAccess().getGatewayAction_0(),
              					current);
              			
            }

            }

            // InternalIoTDSL.g:574:3: (otherlv_1= 'gateway' | otherlv_2= 'middleware' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoTDSL.g:575:4: otherlv_1= 'gateway'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getGatewayAccess().getGatewayKeyword_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:580:4: otherlv_2= 'middleware'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGatewayAccess().getMiddlewareKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalIoTDSL.g:585:3: ( (lv_name_3_0= ruleValidID ) )
            // InternalIoTDSL.g:586:4: (lv_name_3_0= ruleValidID )
            {
            // InternalIoTDSL.g:586:4: (lv_name_3_0= ruleValidID )
            // InternalIoTDSL.g:587:5: lv_name_3_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGatewayAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGatewayRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGateway"


    // $ANTLR start "entryRuleDevice"
    // InternalIoTDSL.g:608:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalIoTDSL.g:608:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalIoTDSL.g:609:2: iv_ruleDevice= ruleDevice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeviceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDevice; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIoTDSL.g:615:1: ruleDevice returns [EObject current=null] : ( () otherlv_1= 'device' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:621:2: ( ( () otherlv_1= 'device' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) )
            // InternalIoTDSL.g:622:2: ( () otherlv_1= 'device' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            {
            // InternalIoTDSL.g:622:2: ( () otherlv_1= 'device' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            // InternalIoTDSL.g:623:3: () otherlv_1= 'device' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}'
            {
            // InternalIoTDSL.g:623:3: ()
            // InternalIoTDSL.g:624:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDeviceAccess().getDeviceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getDeviceKeyword_1());
              		
            }
            // InternalIoTDSL.g:634:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalIoTDSL.g:635:4: (lv_name_2_0= ruleValidID )
            {
            // InternalIoTDSL.g:635:4: (lv_name_2_0= ruleValidID )
            // InternalIoTDSL.g:636:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeviceAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeviceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalIoTDSL.g:657:3: ( (lv_features_4_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22||(LA8_0>=28 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIoTDSL.g:658:4: (lv_features_4_0= ruleFeature )
            	    {
            	    // InternalIoTDSL.g:658:4: (lv_features_4_0= ruleFeature )
            	    // InternalIoTDSL.g:659:5: lv_features_4_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDeviceAccess().getFeaturesFeatureParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_features_4_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDeviceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_4_0,
            	      						"be.unamur.iotdsl.xtext.IoTDSL.Feature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleNamedTypedElement"
    // InternalIoTDSL.g:684:1: entryRuleNamedTypedElement returns [EObject current=null] : iv_ruleNamedTypedElement= ruleNamedTypedElement EOF ;
    public final EObject entryRuleNamedTypedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedTypedElement = null;


        try {
            // InternalIoTDSL.g:684:58: (iv_ruleNamedTypedElement= ruleNamedTypedElement EOF )
            // InternalIoTDSL.g:685:2: iv_ruleNamedTypedElement= ruleNamedTypedElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedTypedElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedTypedElement=ruleNamedTypedElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedTypedElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNamedTypedElement"


    // $ANTLR start "ruleNamedTypedElement"
    // InternalIoTDSL.g:691:1: ruleNamedTypedElement returns [EObject current=null] : (this_Property_0= ruleProperty | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleNamedTypedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Property_0 = null;

        EObject this_Parameter_1 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:697:2: ( (this_Property_0= ruleProperty | this_Parameter_1= ruleParameter ) )
            // InternalIoTDSL.g:698:2: (this_Property_0= ruleProperty | this_Parameter_1= ruleParameter )
            {
            // InternalIoTDSL.g:698:2: (this_Property_0= ruleProperty | this_Parameter_1= ruleParameter )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoTDSL.g:699:3: this_Property_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamedTypedElementAccess().getPropertyParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Property_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Property_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:708:3: this_Parameter_1= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamedTypedElementAccess().getParameterParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameter_1=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Parameter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNamedTypedElement"


    // $ANTLR start "entryRuleFeature"
    // InternalIoTDSL.g:720:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalIoTDSL.g:720:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalIoTDSL.g:721:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalIoTDSL.g:727:1: ruleFeature returns [EObject current=null] : (this_Property_0= ruleProperty | this_Event_1= ruleEvent ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Property_0 = null;

        EObject this_Event_1 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:733:2: ( (this_Property_0= ruleProperty | this_Event_1= ruleEvent ) )
            // InternalIoTDSL.g:734:2: (this_Property_0= ruleProperty | this_Event_1= ruleEvent )
            {
            // InternalIoTDSL.g:734:2: (this_Property_0= ruleProperty | this_Event_1= ruleEvent )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=28 && LA10_0<=29)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIoTDSL.g:735:3: this_Property_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getPropertyParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Property_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Property_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:744:3: this_Event_1= ruleEvent
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getEventParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Event_1=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Event_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleProperty"
    // InternalIoTDSL.g:756:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalIoTDSL.g:756:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalIoTDSL.g:757:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalIoTDSL.g:763:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:769:2: ( (otherlv_0= 'property' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) ) )
            // InternalIoTDSL.g:770:2: (otherlv_0= 'property' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )
            {
            // InternalIoTDSL.g:770:2: (otherlv_0= 'property' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) ) )
            // InternalIoTDSL.g:771:3: otherlv_0= 'property' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeReference ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
              		
            }
            // InternalIoTDSL.g:775:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalIoTDSL.g:776:4: (lv_name_1_0= ruleValidID )
            {
            // InternalIoTDSL.g:776:4: (lv_name_1_0= ruleValidID )
            // InternalIoTDSL.g:777:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
              		
            }
            // InternalIoTDSL.g:798:3: ( (lv_type_3_0= ruleTypeReference ) )
            // InternalIoTDSL.g:799:4: (lv_type_3_0= ruleTypeReference )
            {
            // InternalIoTDSL.g:799:4: (lv_type_3_0= ruleTypeReference )
            // InternalIoTDSL.g:800:5: lv_type_3_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleEvent"
    // InternalIoTDSL.g:821:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalIoTDSL.g:821:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalIoTDSL.g:822:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalIoTDSL.g:828:1: ruleEvent returns [EObject current=null] : ( ( (lv_kind_0_0= ruleEventType ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_kind_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:834:2: ( ( ( (lv_kind_0_0= ruleEventType ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? ) )
            // InternalIoTDSL.g:835:2: ( ( (lv_kind_0_0= ruleEventType ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            {
            // InternalIoTDSL.g:835:2: ( ( (lv_kind_0_0= ruleEventType ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? )
            // InternalIoTDSL.g:836:3: ( (lv_kind_0_0= ruleEventType ) ) ( (lv_name_1_0= ruleValidID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            {
            // InternalIoTDSL.g:836:3: ( (lv_kind_0_0= ruleEventType ) )
            // InternalIoTDSL.g:837:4: (lv_kind_0_0= ruleEventType )
            {
            // InternalIoTDSL.g:837:4: (lv_kind_0_0= ruleEventType )
            // InternalIoTDSL.g:838:5: lv_kind_0_0= ruleEventType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEventAccess().getKindEventTypeEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_kind_0_0=ruleEventType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEventRule());
              					}
              					set(
              						current,
              						"kind",
              						lv_kind_0_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.EventType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoTDSL.g:855:3: ( (lv_name_1_0= ruleValidID ) )
            // InternalIoTDSL.g:856:4: (lv_name_1_0= ruleValidID )
            {
            // InternalIoTDSL.g:856:4: (lv_name_1_0= ruleValidID )
            // InternalIoTDSL.g:857:5: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEventAccess().getNameValidIDParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEventRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoTDSL.g:874:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIoTDSL.g:875:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalIoTDSL.g:879:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalIoTDSL.g:880:5: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            {
                            // InternalIoTDSL.g:880:5: ( (lv_parameters_3_0= ruleParameter ) )
                            // InternalIoTDSL.g:881:6: (lv_parameters_3_0= ruleParameter )
                            {
                            // InternalIoTDSL.g:881:6: (lv_parameters_3_0= ruleParameter )
                            // InternalIoTDSL.g:882:7: lv_parameters_3_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_2_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_13);
                            lv_parameters_3_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getEventRule());
                              							}
                              							add(
                              								current,
                              								"parameters",
                              								lv_parameters_3_0,
                              								"be.unamur.iotdsl.xtext.IoTDSL.Parameter");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalIoTDSL.g:899:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==25) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalIoTDSL.g:900:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getEventAccess().getCommaKeyword_2_1_1_0());
                            	      					
                            	    }
                            	    // InternalIoTDSL.g:904:6: ( (lv_parameters_5_0= ruleParameter ) )
                            	    // InternalIoTDSL.g:905:7: (lv_parameters_5_0= ruleParameter )
                            	    {
                            	    // InternalIoTDSL.g:905:7: (lv_parameters_5_0= ruleParameter )
                            	    // InternalIoTDSL.g:906:8: lv_parameters_5_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getEventAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_13);
                            	    lv_parameters_5_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getEventRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"parameters",
                            	      									lv_parameters_5_0,
                            	      									"be.unamur.iotdsl.xtext.IoTDSL.Parameter");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleParameter"
    // InternalIoTDSL.g:934:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalIoTDSL.g:934:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalIoTDSL.g:935:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalIoTDSL.g:941:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:947:2: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) ) )
            // InternalIoTDSL.g:948:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )
            {
            // InternalIoTDSL.g:948:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )
            // InternalIoTDSL.g:949:3: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) )
            {
            // InternalIoTDSL.g:949:3: ( (lv_name_0_0= ruleValidID ) )
            // InternalIoTDSL.g:950:4: (lv_name_0_0= ruleValidID )
            {
            // InternalIoTDSL.g:950:4: (lv_name_0_0= ruleValidID )
            // InternalIoTDSL.g:951:5: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getNameValidIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
              		
            }
            // InternalIoTDSL.g:972:3: ( (lv_type_2_0= ruleTypeReference ) )
            // InternalIoTDSL.g:973:4: (lv_type_2_0= ruleTypeReference )
            {
            // InternalIoTDSL.g:973:4: (lv_type_2_0= ruleTypeReference )
            // InternalIoTDSL.g:974:5: lv_type_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeReferenceParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"be.unamur.iotdsl.xtext.IoTDSL.TypeReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTypeReference"
    // InternalIoTDSL.g:995:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalIoTDSL.g:995:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalIoTDSL.g:996:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalIoTDSL.g:1002:1: ruleTypeReference returns [EObject current=null] : ( ( (lv_ptype_0_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ptype_0_0 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:1008:2: ( ( ( (lv_ptype_0_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) ) )
            // InternalIoTDSL.g:1009:2: ( ( (lv_ptype_0_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            {
            // InternalIoTDSL.g:1009:2: ( ( (lv_ptype_0_0= rulePrimitiveType ) ) | ( ( ruleQualifiedName ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=15 && LA14_0<=18)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoTDSL.g:1010:3: ( (lv_ptype_0_0= rulePrimitiveType ) )
                    {
                    // InternalIoTDSL.g:1010:3: ( (lv_ptype_0_0= rulePrimitiveType ) )
                    // InternalIoTDSL.g:1011:4: (lv_ptype_0_0= rulePrimitiveType )
                    {
                    // InternalIoTDSL.g:1011:4: (lv_ptype_0_0= rulePrimitiveType )
                    // InternalIoTDSL.g:1012:5: lv_ptype_0_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeReferenceAccess().getPtypePrimitiveTypeParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ptype_0_0=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
                      					}
                      					set(
                      						current,
                      						"ptype",
                      						lv_ptype_0_0,
                      						"be.unamur.iotdsl.xtext.IoTDSL.PrimitiveType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:1030:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalIoTDSL.g:1030:3: ( ( ruleQualifiedName ) )
                    // InternalIoTDSL.g:1031:4: ( ruleQualifiedName )
                    {
                    // InternalIoTDSL.g:1031:4: ( ruleQualifiedName )
                    // InternalIoTDSL.g:1032:5: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTypeReferenceRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeReferenceAccess().getDtypeDeclaredTypeCrossReference_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIoTDSL.g:1050:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalIoTDSL.g:1050:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalIoTDSL.g:1051:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalIoTDSL.g:1057:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalIoTDSL.g:1063:2: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalIoTDSL.g:1064:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalIoTDSL.g:1064:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalIoTDSL.g:1065:3: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalIoTDSL.g:1075:3: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) && (synpred1_InternalIoTDSL())) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIoTDSL.g:1076:4: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalIoTDSL.g:1076:4: ( ( '.' )=>kw= '.' )
            	    // InternalIoTDSL.g:1077:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_14);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // InternalIoTDSL.g:1099:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalIoTDSL.g:1099:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalIoTDSL.g:1100:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalIoTDSL.g:1106:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalIoTDSL.g:1112:2: (this_ID_0= RULE_ID )
            // InternalIoTDSL.g:1113:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleEventType"
    // InternalIoTDSL.g:1123:1: ruleEventType returns [Enumerator current=null] : ( (enumLiteral_0= 'sensing' ) | (enumLiteral_1= 'actuating' ) ) ;
    public final Enumerator ruleEventType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIoTDSL.g:1129:2: ( ( (enumLiteral_0= 'sensing' ) | (enumLiteral_1= 'actuating' ) ) )
            // InternalIoTDSL.g:1130:2: ( (enumLiteral_0= 'sensing' ) | (enumLiteral_1= 'actuating' ) )
            {
            // InternalIoTDSL.g:1130:2: ( (enumLiteral_0= 'sensing' ) | (enumLiteral_1= 'actuating' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoTDSL.g:1131:3: (enumLiteral_0= 'sensing' )
                    {
                    // InternalIoTDSL.g:1131:3: (enumLiteral_0= 'sensing' )
                    // InternalIoTDSL.g:1132:4: enumLiteral_0= 'sensing'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEventTypeAccess().getSENSINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getSENSINGEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoTDSL.g:1139:3: (enumLiteral_1= 'actuating' )
                    {
                    // InternalIoTDSL.g:1139:3: (enumLiteral_1= 'actuating' )
                    // InternalIoTDSL.g:1140:4: enumLiteral_1= 'actuating'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEventTypeAccess().getACTUATINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEventTypeAccess().getACTUATINGEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEventType"

    // $ANTLR start synpred1_InternalIoTDSL
    public final void synpred1_InternalIoTDSL_fragment() throws RecognitionException {   
        // InternalIoTDSL.g:1077:5: ( '.' )
        // InternalIoTDSL.g:1077:6: '.'
        {
        match(input,27,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalIoTDSL

    // Delegated rules

    public final boolean synpred1_InternalIoTDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalIoTDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003F8802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000030404000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003F8810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});

}