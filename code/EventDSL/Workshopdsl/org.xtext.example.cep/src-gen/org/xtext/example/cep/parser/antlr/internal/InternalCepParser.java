package org.xtext.example.cep.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.cep.services.CepGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCepParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Define'", "'From'", "'Where'", "';'", "'('", "','", "')'", "':'", "'integer'", "'boolean'", "'string'", "'real'", "'or'", "'and'", "'as'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'false'", "'true'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalCepParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCepParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCepParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCep.g"; }



     	private CepGrammarAccess grammarAccess;

        public InternalCepParser(TokenStream input, CepGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CepGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCep.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCep.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCep.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCep.g:71:1: ruleModel returns [EObject current=null] : ( (lv_rule_0_0= ruleRule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rule_0_0 = null;



        	enterRule();

        try {
            // InternalCep.g:77:2: ( ( (lv_rule_0_0= ruleRule ) )* )
            // InternalCep.g:78:2: ( (lv_rule_0_0= ruleRule ) )*
            {
            // InternalCep.g:78:2: ( (lv_rule_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCep.g:79:3: (lv_rule_0_0= ruleRule )
            	    {
            	    // InternalCep.g:79:3: (lv_rule_0_0= ruleRule )
            	    // InternalCep.g:80:4: lv_rule_0_0= ruleRule
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getRuleRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_rule_0_0=ruleRule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rule",
            	    					lv_rule_0_0,
            	    					"org.xtext.example.cep.Cep.Rule");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // InternalCep.g:100:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalCep.g:100:45: (iv_ruleRule= ruleRule EOF )
            // InternalCep.g:101:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalCep.g:107:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Define' this_ComplexEvent_1= ruleComplexEvent otherlv_2= 'From' ( (lv_Pattern_3_0= ruleExpression ) ) otherlv_4= 'Where' ( (lv_conditionExpression_5_0= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_conditionExpression_5_0=null;
        Token otherlv_6=null;
        EObject this_ComplexEvent_1 = null;

        EObject lv_Pattern_3_0 = null;



        	enterRule();

        try {
            // InternalCep.g:113:2: ( (otherlv_0= 'Define' this_ComplexEvent_1= ruleComplexEvent otherlv_2= 'From' ( (lv_Pattern_3_0= ruleExpression ) ) otherlv_4= 'Where' ( (lv_conditionExpression_5_0= RULE_ID ) ) otherlv_6= ';' ) )
            // InternalCep.g:114:2: (otherlv_0= 'Define' this_ComplexEvent_1= ruleComplexEvent otherlv_2= 'From' ( (lv_Pattern_3_0= ruleExpression ) ) otherlv_4= 'Where' ( (lv_conditionExpression_5_0= RULE_ID ) ) otherlv_6= ';' )
            {
            // InternalCep.g:114:2: (otherlv_0= 'Define' this_ComplexEvent_1= ruleComplexEvent otherlv_2= 'From' ( (lv_Pattern_3_0= ruleExpression ) ) otherlv_4= 'Where' ( (lv_conditionExpression_5_0= RULE_ID ) ) otherlv_6= ';' )
            // InternalCep.g:115:3: otherlv_0= 'Define' this_ComplexEvent_1= ruleComplexEvent otherlv_2= 'From' ( (lv_Pattern_3_0= ruleExpression ) ) otherlv_4= 'Where' ( (lv_conditionExpression_5_0= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getDefineKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRuleAccess().getComplexEventParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_ComplexEvent_1=ruleComplexEvent();

            state._fsp--;


            			current = this_ComplexEvent_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getFromKeyword_2());
            		
            // InternalCep.g:131:3: ( (lv_Pattern_3_0= ruleExpression ) )
            // InternalCep.g:132:4: (lv_Pattern_3_0= ruleExpression )
            {
            // InternalCep.g:132:4: (lv_Pattern_3_0= ruleExpression )
            // InternalCep.g:133:5: lv_Pattern_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getPatternExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_Pattern_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"Pattern",
            						lv_Pattern_3_0,
            						"org.xtext.example.cep.Cep.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getWhereKeyword_4());
            		
            // InternalCep.g:154:3: ( (lv_conditionExpression_5_0= RULE_ID ) )
            // InternalCep.g:155:4: (lv_conditionExpression_5_0= RULE_ID )
            {
            // InternalCep.g:155:4: (lv_conditionExpression_5_0= RULE_ID )
            // InternalCep.g:156:5: lv_conditionExpression_5_0= RULE_ID
            {
            lv_conditionExpression_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_conditionExpression_5_0, grammarAccess.getRuleAccess().getConditionExpressionIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conditionExpression",
            						lv_conditionExpression_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleComplexEvent"
    // InternalCep.g:180:1: entryRuleComplexEvent returns [EObject current=null] : iv_ruleComplexEvent= ruleComplexEvent EOF ;
    public final EObject entryRuleComplexEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexEvent = null;


        try {
            // InternalCep.g:180:53: (iv_ruleComplexEvent= ruleComplexEvent EOF )
            // InternalCep.g:181:2: iv_ruleComplexEvent= ruleComplexEvent EOF
            {
             newCompositeNode(grammarAccess.getComplexEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexEvent=ruleComplexEvent();

            state._fsp--;

             current =iv_ruleComplexEvent; 
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
    // $ANTLR end "entryRuleComplexEvent"


    // $ANTLR start "ruleComplexEvent"
    // InternalCep.g:187:1: ruleComplexEvent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleCEParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleComplexEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalCep.g:193:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleCEParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) ) )* )? otherlv_5= ')' ) )
            // InternalCep.g:194:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleCEParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) ) )* )? otherlv_5= ')' )
            {
            // InternalCep.g:194:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleCEParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) ) )* )? otherlv_5= ')' )
            // InternalCep.g:195:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleCEParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) ) )* )? otherlv_5= ')'
            {
            // InternalCep.g:195:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCep.g:196:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCep.g:196:4: (lv_name_0_0= RULE_ID )
            // InternalCep.g:197:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComplexEventAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexEventAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCep.g:217:3: ( ( (lv_params_2_0= ruleCEParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCep.g:218:4: ( (lv_params_2_0= ruleCEParameter ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) ) )*
                    {
                    // InternalCep.g:218:4: ( (lv_params_2_0= ruleCEParameter ) )
                    // InternalCep.g:219:5: (lv_params_2_0= ruleCEParameter )
                    {
                    // InternalCep.g:219:5: (lv_params_2_0= ruleCEParameter )
                    // InternalCep.g:220:6: lv_params_2_0= ruleCEParameter
                    {

                    						newCompositeNode(grammarAccess.getComplexEventAccess().getParamsCEParameterParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_params_2_0=ruleCEParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexEventRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"org.xtext.example.cep.Cep.CEParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCep.g:237:4: (otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCep.g:238:5: otherlv_3= ',' ( (lv_params_4_0= ruleCEParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getComplexEventAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalCep.g:242:5: ( (lv_params_4_0= ruleCEParameter ) )
                    	    // InternalCep.g:243:6: (lv_params_4_0= ruleCEParameter )
                    	    {
                    	    // InternalCep.g:243:6: (lv_params_4_0= ruleCEParameter )
                    	    // InternalCep.g:244:7: lv_params_4_0= ruleCEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getComplexEventAccess().getParamsCEParameterParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_params_4_0=ruleCEParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComplexEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"org.xtext.example.cep.Cep.CEParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexEventAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleComplexEvent"


    // $ANTLR start "entryRuleCEParameter"
    // InternalCep.g:271:1: entryRuleCEParameter returns [EObject current=null] : iv_ruleCEParameter= ruleCEParameter EOF ;
    public final EObject entryRuleCEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCEParameter = null;


        try {
            // InternalCep.g:271:52: (iv_ruleCEParameter= ruleCEParameter EOF )
            // InternalCep.g:272:2: iv_ruleCEParameter= ruleCEParameter EOF
            {
             newCompositeNode(grammarAccess.getCEParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCEParameter=ruleCEParameter();

            state._fsp--;

             current =iv_ruleCEParameter; 
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
    // $ANTLR end "entryRuleCEParameter"


    // $ANTLR start "ruleCEParameter"
    // InternalCep.g:278:1: ruleCEParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) ) ;
    public final EObject ruleCEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalCep.g:284:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) ) )
            // InternalCep.g:285:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )
            {
            // InternalCep.g:285:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) ) )
            // InternalCep.g:286:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeReference ) )
            {
            // InternalCep.g:286:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCep.g:287:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCep.g:287:4: (lv_name_0_0= RULE_ID )
            // InternalCep.g:288:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCEParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCEParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCEParameterAccess().getColonKeyword_1());
            		
            // InternalCep.g:308:3: ( (lv_type_2_0= ruleTypeReference ) )
            // InternalCep.g:309:4: (lv_type_2_0= ruleTypeReference )
            {
            // InternalCep.g:309:4: (lv_type_2_0= ruleTypeReference )
            // InternalCep.g:310:5: lv_type_2_0= ruleTypeReference
            {

            					newCompositeNode(grammarAccess.getCEParameterAccess().getTypeTypeReferenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleTypeReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCEParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.cep.Cep.TypeReference");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleCEParameter"


    // $ANTLR start "entryRuleTypeReference"
    // InternalCep.g:331:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalCep.g:331:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalCep.g:332:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalCep.g:338:1: ruleTypeReference returns [EObject current=null] : ( (lv_ptype_0_0= rulePrimitiveType ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject lv_ptype_0_0 = null;



        	enterRule();

        try {
            // InternalCep.g:344:2: ( ( (lv_ptype_0_0= rulePrimitiveType ) ) )
            // InternalCep.g:345:2: ( (lv_ptype_0_0= rulePrimitiveType ) )
            {
            // InternalCep.g:345:2: ( (lv_ptype_0_0= rulePrimitiveType ) )
            // InternalCep.g:346:3: (lv_ptype_0_0= rulePrimitiveType )
            {
            // InternalCep.g:346:3: (lv_ptype_0_0= rulePrimitiveType )
            // InternalCep.g:347:4: lv_ptype_0_0= rulePrimitiveType
            {

            				newCompositeNode(grammarAccess.getTypeReferenceAccess().getPtypePrimitiveTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ptype_0_0=rulePrimitiveType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
            				}
            				set(
            					current,
            					"ptype",
            					lv_ptype_0_0,
            					"org.xtext.example.cep.Cep.PrimitiveType");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalCep.g:367:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalCep.g:367:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalCep.g:368:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalCep.g:374:1: rulePrimitiveType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType | this_RealType_3= ruleRealType ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_StringType_2 = null;

        EObject this_RealType_3 = null;



        	enterRule();

        try {
            // InternalCep.g:380:2: ( (this_IntegerType_0= ruleIntegerType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType | this_RealType_3= ruleRealType ) )
            // InternalCep.g:381:2: (this_IntegerType_0= ruleIntegerType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType | this_RealType_3= ruleRealType )
            {
            // InternalCep.g:381:2: (this_IntegerType_0= ruleIntegerType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType | this_RealType_3= ruleRealType )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCep.g:382:3: this_IntegerType_0= ruleIntegerType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getIntegerTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;


                    			current = this_IntegerType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCep.g:391:3: this_BooleanType_1= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCep.g:400:3: this_StringType_2= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_2=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCep.g:409:3: this_RealType_3= ruleRealType
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getRealTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealType_3=ruleRealType();

                    state._fsp--;


                    			current = this_RealType_3;
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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalCep.g:421:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalCep.g:421:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalCep.g:422:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalCep.g:428:1: ruleIntegerType returns [EObject current=null] : ( () ( (lv_name_1_0= 'integer' ) ) ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCep.g:434:2: ( ( () ( (lv_name_1_0= 'integer' ) ) ) )
            // InternalCep.g:435:2: ( () ( (lv_name_1_0= 'integer' ) ) )
            {
            // InternalCep.g:435:2: ( () ( (lv_name_1_0= 'integer' ) ) )
            // InternalCep.g:436:3: () ( (lv_name_1_0= 'integer' ) )
            {
            // InternalCep.g:436:3: ()
            // InternalCep.g:437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            // InternalCep.g:443:3: ( (lv_name_1_0= 'integer' ) )
            // InternalCep.g:444:4: (lv_name_1_0= 'integer' )
            {
            // InternalCep.g:444:4: (lv_name_1_0= 'integer' )
            // InternalCep.g:445:5: lv_name_1_0= 'integer'
            {
            lv_name_1_0=(Token)match(input,19,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntegerTypeAccess().getNameIntegerKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerTypeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "integer");
            				

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalCep.g:461:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalCep.g:461:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalCep.g:462:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalCep.g:468:1: ruleBooleanType returns [EObject current=null] : ( () ( (lv_name_1_0= 'boolean' ) ) ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCep.g:474:2: ( ( () ( (lv_name_1_0= 'boolean' ) ) ) )
            // InternalCep.g:475:2: ( () ( (lv_name_1_0= 'boolean' ) ) )
            {
            // InternalCep.g:475:2: ( () ( (lv_name_1_0= 'boolean' ) ) )
            // InternalCep.g:476:3: () ( (lv_name_1_0= 'boolean' ) )
            {
            // InternalCep.g:476:3: ()
            // InternalCep.g:477:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            // InternalCep.g:483:3: ( (lv_name_1_0= 'boolean' ) )
            // InternalCep.g:484:4: (lv_name_1_0= 'boolean' )
            {
            // InternalCep.g:484:4: (lv_name_1_0= 'boolean' )
            // InternalCep.g:485:5: lv_name_1_0= 'boolean'
            {
            lv_name_1_0=(Token)match(input,20,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBooleanTypeAccess().getNameBooleanKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanTypeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "boolean");
            				

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // InternalCep.g:501:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalCep.g:501:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalCep.g:502:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalCep.g:508:1: ruleStringType returns [EObject current=null] : ( () ( (lv_name_1_0= 'string' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCep.g:514:2: ( ( () ( (lv_name_1_0= 'string' ) ) ) )
            // InternalCep.g:515:2: ( () ( (lv_name_1_0= 'string' ) ) )
            {
            // InternalCep.g:515:2: ( () ( (lv_name_1_0= 'string' ) ) )
            // InternalCep.g:516:3: () ( (lv_name_1_0= 'string' ) )
            {
            // InternalCep.g:516:3: ()
            // InternalCep.g:517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            // InternalCep.g:523:3: ( (lv_name_1_0= 'string' ) )
            // InternalCep.g:524:4: (lv_name_1_0= 'string' )
            {
            // InternalCep.g:524:4: (lv_name_1_0= 'string' )
            // InternalCep.g:525:5: lv_name_1_0= 'string'
            {
            lv_name_1_0=(Token)match(input,21,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringTypeAccess().getNameStringKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringTypeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "string");
            				

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleRealType"
    // InternalCep.g:541:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // InternalCep.g:541:49: (iv_ruleRealType= ruleRealType EOF )
            // InternalCep.g:542:2: iv_ruleRealType= ruleRealType EOF
            {
             newCompositeNode(grammarAccess.getRealTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealType=ruleRealType();

            state._fsp--;

             current =iv_ruleRealType; 
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
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // InternalCep.g:548:1: ruleRealType returns [EObject current=null] : ( () ( (lv_name_1_0= 'real' ) ) ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCep.g:554:2: ( ( () ( (lv_name_1_0= 'real' ) ) ) )
            // InternalCep.g:555:2: ( () ( (lv_name_1_0= 'real' ) ) )
            {
            // InternalCep.g:555:2: ( () ( (lv_name_1_0= 'real' ) ) )
            // InternalCep.g:556:3: () ( (lv_name_1_0= 'real' ) )
            {
            // InternalCep.g:556:3: ()
            // InternalCep.g:557:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTypeAccess().getRealTypeAction_0(),
            					current);
            			

            }

            // InternalCep.g:563:3: ( (lv_name_1_0= 'real' ) )
            // InternalCep.g:564:4: (lv_name_1_0= 'real' )
            {
            // InternalCep.g:564:4: (lv_name_1_0= 'real' )
            // InternalCep.g:565:5: lv_name_1_0= 'real'
            {
            lv_name_1_0=(Token)match(input,22,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRealTypeAccess().getNameRealKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRealTypeRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "real");
            				

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
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleExpression"
    // InternalCep.g:581:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCep.g:581:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCep.g:582:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCep.g:588:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalCep.g:594:2: (this_OrExpression_0= ruleOrExpression )
            // InternalCep.g:595:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalCep.g:606:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalCep.g:606:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalCep.g:607:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalCep.g:613:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_rhs_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCep.g:619:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_rhs_3_0= ruleAndExpression ) ) )* ) )
            // InternalCep.g:620:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_rhs_3_0= ruleAndExpression ) ) )* )
            {
            // InternalCep.g:620:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_rhs_3_0= ruleAndExpression ) ) )* )
            // InternalCep.g:621:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_op_2_0= 'or' ) ) ( (lv_rhs_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCep.g:629:3: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_rhs_3_0= ruleAndExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCep.g:630:4: () ( (lv_op_2_0= 'or' ) ) ( (lv_rhs_3_0= ruleAndExpression ) )
            	    {
            	    // InternalCep.g:630:4: ()
            	    // InternalCep.g:631:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCep.g:637:4: ( (lv_op_2_0= 'or' ) )
            	    // InternalCep.g:638:5: (lv_op_2_0= 'or' )
            	    {
            	    // InternalCep.g:638:5: (lv_op_2_0= 'or' )
            	    // InternalCep.g:639:6: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,23,FOLLOW_6); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpOrKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOrExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	    					

            	    }


            	    }

            	    // InternalCep.g:651:4: ( (lv_rhs_3_0= ruleAndExpression ) )
            	    // InternalCep.g:652:5: (lv_rhs_3_0= ruleAndExpression )
            	    {
            	    // InternalCep.g:652:5: (lv_rhs_3_0= ruleAndExpression )
            	    // InternalCep.g:653:6: lv_rhs_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_rhs_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"org.xtext.example.cep.Cep.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalCep.g:675:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalCep.g:675:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalCep.g:676:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalCep.g:682:1: ruleAndExpression returns [EObject current=null] : (this_AsExpression_0= ruleAsExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_rhs_3_0= ruleAsExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AsExpression_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCep.g:688:2: ( (this_AsExpression_0= ruleAsExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_rhs_3_0= ruleAsExpression ) ) )* ) )
            // InternalCep.g:689:2: (this_AsExpression_0= ruleAsExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_rhs_3_0= ruleAsExpression ) ) )* )
            {
            // InternalCep.g:689:2: (this_AsExpression_0= ruleAsExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_rhs_3_0= ruleAsExpression ) ) )* )
            // InternalCep.g:690:3: this_AsExpression_0= ruleAsExpression ( () ( (lv_op_2_0= 'and' ) ) ( (lv_rhs_3_0= ruleAsExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getAsExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_AsExpression_0=ruleAsExpression();

            state._fsp--;


            			current = this_AsExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCep.g:698:3: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_rhs_3_0= ruleAsExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCep.g:699:4: () ( (lv_op_2_0= 'and' ) ) ( (lv_rhs_3_0= ruleAsExpression ) )
            	    {
            	    // InternalCep.g:699:4: ()
            	    // InternalCep.g:700:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCep.g:706:4: ( (lv_op_2_0= 'and' ) )
            	    // InternalCep.g:707:5: (lv_op_2_0= 'and' )
            	    {
            	    // InternalCep.g:707:5: (lv_op_2_0= 'and' )
            	    // InternalCep.g:708:6: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,24,FOLLOW_6); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpAndKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAndExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	    					

            	    }


            	    }

            	    // InternalCep.g:720:4: ( (lv_rhs_3_0= ruleAsExpression ) )
            	    // InternalCep.g:721:5: (lv_rhs_3_0= ruleAsExpression )
            	    {
            	    // InternalCep.g:721:5: (lv_rhs_3_0= ruleAsExpression )
            	    // InternalCep.g:722:6: lv_rhs_3_0= ruleAsExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsAsExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_rhs_3_0=ruleAsExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"org.xtext.example.cep.Cep.AsExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAsExpression"
    // InternalCep.g:744:1: entryRuleAsExpression returns [EObject current=null] : iv_ruleAsExpression= ruleAsExpression EOF ;
    public final EObject entryRuleAsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsExpression = null;


        try {
            // InternalCep.g:744:53: (iv_ruleAsExpression= ruleAsExpression EOF )
            // InternalCep.g:745:2: iv_ruleAsExpression= ruleAsExpression EOF
            {
             newCompositeNode(grammarAccess.getAsExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsExpression=ruleAsExpression();

            state._fsp--;

             current =iv_ruleAsExpression; 
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
    // $ANTLR end "entryRuleAsExpression"


    // $ANTLR start "ruleAsExpression"
    // InternalCep.g:751:1: ruleAsExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'as' ) ) ( (lv_nameofas_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleAsExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_nameofas_3_0=null;
        EObject this_EqualityExpression_0 = null;



        	enterRule();

        try {
            // InternalCep.g:757:2: ( (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'as' ) ) ( (lv_nameofas_3_0= RULE_ID ) ) )* ) )
            // InternalCep.g:758:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'as' ) ) ( (lv_nameofas_3_0= RULE_ID ) ) )* )
            {
            // InternalCep.g:758:2: (this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'as' ) ) ( (lv_nameofas_3_0= RULE_ID ) ) )* )
            // InternalCep.g:759:3: this_EqualityExpression_0= ruleEqualityExpression ( () ( (lv_op_2_0= 'as' ) ) ( (lv_nameofas_3_0= RULE_ID ) ) )*
            {

            			newCompositeNode(grammarAccess.getAsExpressionAccess().getEqualityExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;


            			current = this_EqualityExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCep.g:767:3: ( () ( (lv_op_2_0= 'as' ) ) ( (lv_nameofas_3_0= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCep.g:768:4: () ( (lv_op_2_0= 'as' ) ) ( (lv_nameofas_3_0= RULE_ID ) )
            	    {
            	    // InternalCep.g:768:4: ()
            	    // InternalCep.g:769:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAsExpressionAccess().getAsExpressionLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCep.g:775:4: ( (lv_op_2_0= 'as' ) )
            	    // InternalCep.g:776:5: (lv_op_2_0= 'as' )
            	    {
            	    // InternalCep.g:776:5: (lv_op_2_0= 'as' )
            	    // InternalCep.g:777:6: lv_op_2_0= 'as'
            	    {
            	    lv_op_2_0=(Token)match(input,25,FOLLOW_4); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getAsExpressionAccess().getOpAsKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAsExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "op", lv_op_2_0, "as");
            	    					

            	    }


            	    }

            	    // InternalCep.g:789:4: ( (lv_nameofas_3_0= RULE_ID ) )
            	    // InternalCep.g:790:5: (lv_nameofas_3_0= RULE_ID )
            	    {
            	    // InternalCep.g:790:5: (lv_nameofas_3_0= RULE_ID )
            	    // InternalCep.g:791:6: lv_nameofas_3_0= RULE_ID
            	    {
            	    lv_nameofas_3_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(lv_nameofas_3_0, grammarAccess.getAsExpressionAccess().getNameofasIDTerminalRuleCall_1_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAsExpressionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"nameofas",
            	    							lv_nameofas_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleAsExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalCep.g:812:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalCep.g:812:59: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalCep.g:813:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalCep.g:819:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_rhs_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCep.g:825:2: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_rhs_3_0= ruleRelationalExpression ) ) )* ) )
            // InternalCep.g:826:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_rhs_3_0= ruleRelationalExpression ) ) )* )
            {
            // InternalCep.g:826:2: (this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_rhs_3_0= ruleRelationalExpression ) ) )* )
            // InternalCep.g:827:3: this_RelationalExpression_0= ruleRelationalExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_rhs_3_0= ruleRelationalExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;


            			current = this_RelationalExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCep.g:835:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_rhs_3_0= ruleRelationalExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=26 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCep.g:836:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_rhs_3_0= ruleRelationalExpression ) )
            	    {
            	    // InternalCep.g:836:4: ()
            	    // InternalCep.g:837:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCep.g:843:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalCep.g:844:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalCep.g:844:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalCep.g:845:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalCep.g:845:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==26) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==27) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalCep.g:846:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCep.g:857:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCep.g:870:4: ( (lv_rhs_3_0= ruleRelationalExpression ) )
            	    // InternalCep.g:871:5: (lv_rhs_3_0= ruleRelationalExpression )
            	    {
            	    // InternalCep.g:871:5: (lv_rhs_3_0= ruleRelationalExpression )
            	    // InternalCep.g:872:6: lv_rhs_3_0= ruleRelationalExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRhsRelationalExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_rhs_3_0=ruleRelationalExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"org.xtext.example.cep.Cep.RelationalExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalCep.g:894:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalCep.g:894:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalCep.g:895:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalCep.g:901:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_rhs_3_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCep.g:907:2: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_rhs_3_0= ruleAdditiveExpression ) ) )* ) )
            // InternalCep.g:908:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_rhs_3_0= ruleAdditiveExpression ) ) )* )
            {
            // InternalCep.g:908:2: (this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_rhs_3_0= ruleAdditiveExpression ) ) )* )
            // InternalCep.g:909:3: this_AdditiveExpression_0= ruleAdditiveExpression ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_rhs_3_0= ruleAdditiveExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;


            			current = this_AdditiveExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCep.g:917:3: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_rhs_3_0= ruleAdditiveExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=31)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCep.g:918:4: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_rhs_3_0= ruleAdditiveExpression ) )
            	    {
            	    // InternalCep.g:918:4: ()
            	    // InternalCep.g:919:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelationalExpressionAccess().getComparativeExpressionLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCep.g:925:4: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    // InternalCep.g:926:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    {
            	    // InternalCep.g:926:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    // InternalCep.g:927:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    {
            	    // InternalCep.g:927:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    int alt10=4;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // InternalCep.g:928:7: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,28,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCep.g:939:7: lv_op_2_2= '>'
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCep.g:950:7: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,30,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getRelationalExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalCep.g:961:7: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,31,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getRelationalExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRelationalExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCep.g:974:4: ( (lv_rhs_3_0= ruleAdditiveExpression ) )
            	    // InternalCep.g:975:5: (lv_rhs_3_0= ruleAdditiveExpression )
            	    {
            	    // InternalCep.g:975:5: (lv_rhs_3_0= ruleAdditiveExpression )
            	    // InternalCep.g:976:6: lv_rhs_3_0= ruleAdditiveExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRhsAdditiveExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_rhs_3_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"org.xtext.example.cep.Cep.AdditiveExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalCep.g:998:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalCep.g:998:59: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalCep.g:999:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalCep.g:1005:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rhs_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCep.g:1011:2: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rhs_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // InternalCep.g:1012:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rhs_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // InternalCep.g:1012:2: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rhs_3_0= ruleMultiplicativeExpression ) ) )* )
            // InternalCep.g:1013:3: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rhs_3_0= ruleMultiplicativeExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;


            			current = this_MultiplicativeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCep.g:1021:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rhs_3_0= ruleMultiplicativeExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=32 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCep.g:1022:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_rhs_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // InternalCep.g:1022:4: ()
            	    // InternalCep.g:1023:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCep.g:1029:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalCep.g:1030:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalCep.g:1030:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalCep.g:1031:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalCep.g:1031:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==32) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==33) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalCep.g:1032:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getAdditiveExpressionAccess().getOpPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCep.g:1043:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getAdditiveExpressionAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditiveExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCep.g:1056:4: ( (lv_rhs_3_0= ruleMultiplicativeExpression ) )
            	    // InternalCep.g:1057:5: (lv_rhs_3_0= ruleMultiplicativeExpression )
            	    {
            	    // InternalCep.g:1057:5: (lv_rhs_3_0= ruleMultiplicativeExpression )
            	    // InternalCep.g:1058:6: lv_rhs_3_0= ruleMultiplicativeExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRhsMultiplicativeExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_rhs_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"org.xtext.example.cep.Cep.MultiplicativeExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalCep.g:1080:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalCep.g:1080:65: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalCep.g:1081:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalCep.g:1087:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_rhs_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCep.g:1093:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_rhs_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalCep.g:1094:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_rhs_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalCep.g:1094:2: (this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_rhs_3_0= ruleUnaryExpression ) ) )* )
            // InternalCep.g:1095:3: this_UnaryExpression_0= ruleUnaryExpression ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_rhs_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCep.g:1103:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_rhs_3_0= ruleUnaryExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=34 && LA15_0<=35)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCep.g:1104:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_rhs_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalCep.g:1104:4: ()
            	    // InternalCep.g:1105:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLhsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalCep.g:1111:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalCep.g:1112:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalCep.g:1112:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalCep.g:1113:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalCep.g:1113:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==34) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==35) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalCep.g:1114:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCep.g:1125:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_6); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMultiplicativeExpressionAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalCep.g:1138:4: ( (lv_rhs_3_0= ruleUnaryExpression ) )
            	    // InternalCep.g:1139:5: (lv_rhs_3_0= ruleUnaryExpression )
            	    {
            	    // InternalCep.g:1139:5: (lv_rhs_3_0= ruleUnaryExpression )
            	    // InternalCep.g:1140:6: lv_rhs_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRhsUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_rhs_3_0=ruleUnaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rhs",
            	    							lv_rhs_3_0,
            	    							"org.xtext.example.cep.Cep.UnaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalCep.g:1162:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalCep.g:1162:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalCep.g:1163:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalCep.g:1169:1: ruleUnaryExpression returns [EObject current=null] : ( ( () ( (lv_op_1_0= 'not' ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | ( () ( (lv_op_4_0= '+' ) ) ( (lv_operand_5_0= ruleUnaryExpression ) ) ) | ( () ( (lv_op_7_0= '-' ) ) ( (lv_operand_8_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_9= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_op_4_0=null;
        Token lv_op_7_0=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;

        EObject lv_operand_8_0 = null;

        EObject this_PrimaryExpression_9 = null;



        	enterRule();

        try {
            // InternalCep.g:1175:2: ( ( ( () ( (lv_op_1_0= 'not' ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | ( () ( (lv_op_4_0= '+' ) ) ( (lv_operand_5_0= ruleUnaryExpression ) ) ) | ( () ( (lv_op_7_0= '-' ) ) ( (lv_operand_8_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_9= rulePrimaryExpression ) )
            // InternalCep.g:1176:2: ( ( () ( (lv_op_1_0= 'not' ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | ( () ( (lv_op_4_0= '+' ) ) ( (lv_operand_5_0= ruleUnaryExpression ) ) ) | ( () ( (lv_op_7_0= '-' ) ) ( (lv_operand_8_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_9= rulePrimaryExpression )
            {
            // InternalCep.g:1176:2: ( ( () ( (lv_op_1_0= 'not' ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) ) | ( () ( (lv_op_4_0= '+' ) ) ( (lv_operand_5_0= ruleUnaryExpression ) ) ) | ( () ( (lv_op_7_0= '-' ) ) ( (lv_operand_8_0= ruleUnaryExpression ) ) ) | this_PrimaryExpression_9= rulePrimaryExpression )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 15:
            case 37:
            case 38:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCep.g:1177:3: ( () ( (lv_op_1_0= 'not' ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    {
                    // InternalCep.g:1177:3: ( () ( (lv_op_1_0= 'not' ) ) ( (lv_operand_2_0= ruleUnaryExpression ) ) )
                    // InternalCep.g:1178:4: () ( (lv_op_1_0= 'not' ) ) ( (lv_operand_2_0= ruleUnaryExpression ) )
                    {
                    // InternalCep.g:1178:4: ()
                    // InternalCep.g:1179:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getNotExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCep.g:1185:4: ( (lv_op_1_0= 'not' ) )
                    // InternalCep.g:1186:5: (lv_op_1_0= 'not' )
                    {
                    // InternalCep.g:1186:5: (lv_op_1_0= 'not' )
                    // InternalCep.g:1187:6: lv_op_1_0= 'not'
                    {
                    lv_op_1_0=(Token)match(input,36,FOLLOW_6); 

                    						newLeafNode(lv_op_1_0, grammarAccess.getUnaryExpressionAccess().getOpNotKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_0, "not");
                    					

                    }


                    }

                    // InternalCep.g:1199:4: ( (lv_operand_2_0= ruleUnaryExpression ) )
                    // InternalCep.g:1200:5: (lv_operand_2_0= ruleUnaryExpression )
                    {
                    // InternalCep.g:1200:5: (lv_operand_2_0= ruleUnaryExpression )
                    // InternalCep.g:1201:6: lv_operand_2_0= ruleUnaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_2_0=ruleUnaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_2_0,
                    							"org.xtext.example.cep.Cep.UnaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCep.g:1220:3: ( () ( (lv_op_4_0= '+' ) ) ( (lv_operand_5_0= ruleUnaryExpression ) ) )
                    {
                    // InternalCep.g:1220:3: ( () ( (lv_op_4_0= '+' ) ) ( (lv_operand_5_0= ruleUnaryExpression ) ) )
                    // InternalCep.g:1221:4: () ( (lv_op_4_0= '+' ) ) ( (lv_operand_5_0= ruleUnaryExpression ) )
                    {
                    // InternalCep.g:1221:4: ()
                    // InternalCep.g:1222:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getPlusExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCep.g:1228:4: ( (lv_op_4_0= '+' ) )
                    // InternalCep.g:1229:5: (lv_op_4_0= '+' )
                    {
                    // InternalCep.g:1229:5: (lv_op_4_0= '+' )
                    // InternalCep.g:1230:6: lv_op_4_0= '+'
                    {
                    lv_op_4_0=(Token)match(input,32,FOLLOW_6); 

                    						newLeafNode(lv_op_4_0, grammarAccess.getUnaryExpressionAccess().getOpPlusSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_4_0, "+");
                    					

                    }


                    }

                    // InternalCep.g:1242:4: ( (lv_operand_5_0= ruleUnaryExpression ) )
                    // InternalCep.g:1243:5: (lv_operand_5_0= ruleUnaryExpression )
                    {
                    // InternalCep.g:1243:5: (lv_operand_5_0= ruleUnaryExpression )
                    // InternalCep.g:1244:6: lv_operand_5_0= ruleUnaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_5_0=ruleUnaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_5_0,
                    							"org.xtext.example.cep.Cep.UnaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCep.g:1263:3: ( () ( (lv_op_7_0= '-' ) ) ( (lv_operand_8_0= ruleUnaryExpression ) ) )
                    {
                    // InternalCep.g:1263:3: ( () ( (lv_op_7_0= '-' ) ) ( (lv_operand_8_0= ruleUnaryExpression ) ) )
                    // InternalCep.g:1264:4: () ( (lv_op_7_0= '-' ) ) ( (lv_operand_8_0= ruleUnaryExpression ) )
                    {
                    // InternalCep.g:1264:4: ()
                    // InternalCep.g:1265:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryExpressionAccess().getMinusExpressionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCep.g:1271:4: ( (lv_op_7_0= '-' ) )
                    // InternalCep.g:1272:5: (lv_op_7_0= '-' )
                    {
                    // InternalCep.g:1272:5: (lv_op_7_0= '-' )
                    // InternalCep.g:1273:6: lv_op_7_0= '-'
                    {
                    lv_op_7_0=(Token)match(input,33,FOLLOW_6); 

                    						newLeafNode(lv_op_7_0, grammarAccess.getUnaryExpressionAccess().getOpHyphenMinusKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryExpressionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_7_0, "-");
                    					

                    }


                    }

                    // InternalCep.g:1285:4: ( (lv_operand_8_0= ruleUnaryExpression ) )
                    // InternalCep.g:1286:5: (lv_operand_8_0= ruleUnaryExpression )
                    {
                    // InternalCep.g:1286:5: (lv_operand_8_0= ruleUnaryExpression )
                    // InternalCep.g:1287:6: lv_operand_8_0= ruleUnaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandUnaryExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_operand_8_0=ruleUnaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operand",
                    							lv_operand_8_0,
                    							"org.xtext.example.cep.Cep.UnaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCep.g:1306:3: this_PrimaryExpression_9= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_9=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_9;
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalCep.g:1318:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalCep.g:1318:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalCep.g:1319:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalCep.g:1325:1: rulePrimaryExpression returns [EObject current=null] : (this_ParenthesizedExpression_0= ruleParenthesizedExpression | this_LiteralExpression_1= ruleLiteralExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesizedExpression_0 = null;

        EObject this_LiteralExpression_1 = null;



        	enterRule();

        try {
            // InternalCep.g:1331:2: ( (this_ParenthesizedExpression_0= ruleParenthesizedExpression | this_LiteralExpression_1= ruleLiteralExpression ) )
            // InternalCep.g:1332:2: (this_ParenthesizedExpression_0= ruleParenthesizedExpression | this_LiteralExpression_1= ruleLiteralExpression )
            {
            // InternalCep.g:1332:2: (this_ParenthesizedExpression_0= ruleParenthesizedExpression | this_LiteralExpression_1= ruleLiteralExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_STRING)||(LA17_0>=37 && LA17_0<=38)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCep.g:1333:3: this_ParenthesizedExpression_0= ruleParenthesizedExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParenthesizedExpression_0=ruleParenthesizedExpression();

                    state._fsp--;


                    			current = this_ParenthesizedExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCep.g:1342:3: this_LiteralExpression_1= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_1;
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // InternalCep.g:1354:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // InternalCep.g:1354:64: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // InternalCep.g:1355:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;

             current =iv_ruleParenthesizedExpression; 
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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // InternalCep.g:1361:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;



        	enterRule();

        try {
            // InternalCep.g:1367:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // InternalCep.g:1368:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // InternalCep.g:1368:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // InternalCep.g:1369:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionParserRuleCall_1());
            		
            pushFollow(FOLLOW_21);
            this_Expression_1=ruleExpression();

            state._fsp--;


            			current = this_Expression_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalCep.g:1389:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalCep.g:1389:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalCep.g:1390:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalCep.g:1396:1: ruleLiteralExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () (otherlv_5= 'false' | ( (lv_isTrue_6_0= 'true' ) ) ) ) ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;
        Token lv_isTrue_6_0=null;


        	enterRule();

        try {
            // InternalCep.g:1402:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () (otherlv_5= 'false' | ( (lv_isTrue_6_0= 'true' ) ) ) ) ) )
            // InternalCep.g:1403:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () (otherlv_5= 'false' | ( (lv_isTrue_6_0= 'true' ) ) ) ) )
            {
            // InternalCep.g:1403:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () (otherlv_5= 'false' | ( (lv_isTrue_6_0= 'true' ) ) ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_STRING:
                {
                alt19=2;
                }
                break;
            case 37:
            case 38:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalCep.g:1404:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalCep.g:1404:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalCep.g:1405:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalCep.g:1405:4: ()
                    // InternalCep.g:1406:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralExpressionAccess().getIntegerLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCep.g:1412:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalCep.g:1413:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalCep.g:1413:5: (lv_value_1_0= RULE_INT )
                    // InternalCep.g:1414:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getLiteralExpressionAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCep.g:1432:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalCep.g:1432:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalCep.g:1433:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalCep.g:1433:4: ()
                    // InternalCep.g:1434:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralExpressionAccess().getStringLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCep.g:1440:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalCep.g:1441:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalCep.g:1441:5: (lv_value_3_0= RULE_STRING )
                    // InternalCep.g:1442:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getLiteralExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCep.g:1460:3: ( () (otherlv_5= 'false' | ( (lv_isTrue_6_0= 'true' ) ) ) )
                    {
                    // InternalCep.g:1460:3: ( () (otherlv_5= 'false' | ( (lv_isTrue_6_0= 'true' ) ) ) )
                    // InternalCep.g:1461:4: () (otherlv_5= 'false' | ( (lv_isTrue_6_0= 'true' ) ) )
                    {
                    // InternalCep.g:1461:4: ()
                    // InternalCep.g:1462:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralExpressionAccess().getBooleanLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalCep.g:1468:4: (otherlv_5= 'false' | ( (lv_isTrue_6_0= 'true' ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==37) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==38) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalCep.g:1469:5: otherlv_5= 'false'
                            {
                            otherlv_5=(Token)match(input,37,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getLiteralExpressionAccess().getFalseKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCep.g:1474:5: ( (lv_isTrue_6_0= 'true' ) )
                            {
                            // InternalCep.g:1474:5: ( (lv_isTrue_6_0= 'true' ) )
                            // InternalCep.g:1475:6: (lv_isTrue_6_0= 'true' )
                            {
                            // InternalCep.g:1475:6: (lv_isTrue_6_0= 'true' )
                            // InternalCep.g:1476:7: lv_isTrue_6_0= 'true'
                            {
                            lv_isTrue_6_0=(Token)match(input,38,FOLLOW_2); 

                            							newLeafNode(lv_isTrue_6_0, grammarAccess.getLiteralExpressionAccess().getIsTrueTrueKeyword_2_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLiteralExpressionRule());
                            							}
                            							setWithLastConsumed(current, "isTrue", true, "true");
                            						

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleLiteralExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007300008060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});

}