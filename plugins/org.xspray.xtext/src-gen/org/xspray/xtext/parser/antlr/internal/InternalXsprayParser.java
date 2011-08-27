package org.xspray.xtext.parser.antlr.internal; 

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
import org.xspray.xtext.services.XsprayGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXsprayParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'diagram'", "'metamodel'", "'metapackage'", "'extension'", "'behaviour'", "'['", "';'", "']'", "'class'", "'alias'", "'icon'", "':'", "'references'", "'behavior'", "'group'", "'palette'", "'('", "'width'", "'='", "'color'", "'fill'", "'figure'", "'bold'", "'italic'", "')'", "'rectangle'", "'connection'", "'from'", "'to'", "'fromText'", "'connectionText'", "'toText'", "'text'", "'.'", "'line'", "'container'", "'reference'", "'attribute'", "'create'", "'black'", "'red'", "'green'", "'light_gray'", "'light_light_gray'", "'gray'", "'orange'", "'white'", "'yellow'", "'dark_blue'", "'vc_dark_blue'", "'cyan'", "'dark_green'", "'light_green'", "'light_blue'", "'medium_blue'", "'pink'"
    };
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalXsprayParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXsprayParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXsprayParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g"; }



     	private XsprayGrammarAccess grammarAccess;
     	
        public InternalXsprayParser(TokenStream input, XsprayGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Diagram";	
       	}
       	
       	@Override
       	protected XsprayGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDiagram"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:68:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:69:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:70:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDiagram_in_entryRuleDiagram75);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDiagram85); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:77:1: ruleDiagram returns [EObject current=null] : (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (lv_import1_3_0= RULE_STRING ) ) otherlv_4= 'metapackage' ( (lv_importPackage_5_0= RULE_STRING ) ) otherlv_6= 'extension' ( (lv_modelfileExtension_7_0= RULE_STRING ) ) ( (lv_behaviourGroups_8_0= ruleBehaviourGroup ) )* ( (lv_metaClasses_9_0= ruleMetaClass ) )* ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_import1_3_0=null;
        Token otherlv_4=null;
        Token lv_importPackage_5_0=null;
        Token otherlv_6=null;
        Token lv_modelfileExtension_7_0=null;
        EObject lv_behaviourGroups_8_0 = null;

        EObject lv_metaClasses_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:80:28: ( (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (lv_import1_3_0= RULE_STRING ) ) otherlv_4= 'metapackage' ( (lv_importPackage_5_0= RULE_STRING ) ) otherlv_6= 'extension' ( (lv_modelfileExtension_7_0= RULE_STRING ) ) ( (lv_behaviourGroups_8_0= ruleBehaviourGroup ) )* ( (lv_metaClasses_9_0= ruleMetaClass ) )* ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:81:1: (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (lv_import1_3_0= RULE_STRING ) ) otherlv_4= 'metapackage' ( (lv_importPackage_5_0= RULE_STRING ) ) otherlv_6= 'extension' ( (lv_modelfileExtension_7_0= RULE_STRING ) ) ( (lv_behaviourGroups_8_0= ruleBehaviourGroup ) )* ( (lv_metaClasses_9_0= ruleMetaClass ) )* )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:81:1: (otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (lv_import1_3_0= RULE_STRING ) ) otherlv_4= 'metapackage' ( (lv_importPackage_5_0= RULE_STRING ) ) otherlv_6= 'extension' ( (lv_modelfileExtension_7_0= RULE_STRING ) ) ( (lv_behaviourGroups_8_0= ruleBehaviourGroup ) )* ( (lv_metaClasses_9_0= ruleMetaClass ) )* )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:81:3: otherlv_0= 'diagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'metamodel' ( (lv_import1_3_0= RULE_STRING ) ) otherlv_4= 'metapackage' ( (lv_importPackage_5_0= RULE_STRING ) ) otherlv_6= 'extension' ( (lv_modelfileExtension_7_0= RULE_STRING ) ) ( (lv_behaviourGroups_8_0= ruleBehaviourGroup ) )* ( (lv_metaClasses_9_0= ruleMetaClass ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDiagram122); 

                	newLeafNode(otherlv_0, grammarAccess.getDiagramAccess().getDiagramKeyword_0());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:86:1: (lv_name_1_0= RULE_ID )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDiagram139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDiagram156); 

                	newLeafNode(otherlv_2, grammarAccess.getDiagramAccess().getMetamodelKeyword_2());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:107:1: ( (lv_import1_3_0= RULE_STRING ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:108:1: (lv_import1_3_0= RULE_STRING )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:108:1: (lv_import1_3_0= RULE_STRING )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:109:3: lv_import1_3_0= RULE_STRING
            {
            lv_import1_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDiagram173); 

            			newLeafNode(lv_import1_3_0, grammarAccess.getDiagramAccess().getImport1STRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"import1",
                    		lv_import1_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDiagram190); 

                	newLeafNode(otherlv_4, grammarAccess.getDiagramAccess().getMetapackageKeyword_4());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:129:1: ( (lv_importPackage_5_0= RULE_STRING ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:130:1: (lv_importPackage_5_0= RULE_STRING )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:130:1: (lv_importPackage_5_0= RULE_STRING )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:131:3: lv_importPackage_5_0= RULE_STRING
            {
            lv_importPackage_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDiagram207); 

            			newLeafNode(lv_importPackage_5_0, grammarAccess.getDiagramAccess().getImportPackageSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importPackage",
                    		lv_importPackage_5_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDiagram224); 

                	newLeafNode(otherlv_6, grammarAccess.getDiagramAccess().getExtensionKeyword_6());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:151:1: ( (lv_modelfileExtension_7_0= RULE_STRING ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:152:1: (lv_modelfileExtension_7_0= RULE_STRING )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:152:1: (lv_modelfileExtension_7_0= RULE_STRING )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:153:3: lv_modelfileExtension_7_0= RULE_STRING
            {
            lv_modelfileExtension_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDiagram241); 

            			newLeafNode(lv_modelfileExtension_7_0, grammarAccess.getDiagramAccess().getModelfileExtensionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"modelfileExtension",
                    		lv_modelfileExtension_7_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:169:2: ( (lv_behaviourGroups_8_0= ruleBehaviourGroup ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:170:1: (lv_behaviourGroups_8_0= ruleBehaviourGroup )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:170:1: (lv_behaviourGroups_8_0= ruleBehaviourGroup )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:171:3: lv_behaviourGroups_8_0= ruleBehaviourGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getBehaviourGroupsBehaviourGroupParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBehaviourGroup_in_ruleDiagram267);
            	    lv_behaviourGroups_8_0=ruleBehaviourGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"behaviourGroups",
            	            		lv_behaviourGroups_8_0, 
            	            		"BehaviourGroup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:187:3: ( (lv_metaClasses_9_0= ruleMetaClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:188:1: (lv_metaClasses_9_0= ruleMetaClass )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:188:1: (lv_metaClasses_9_0= ruleMetaClass )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:189:3: lv_metaClasses_9_0= ruleMetaClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getMetaClassesMetaClassParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMetaClass_in_ruleDiagram289);
            	    lv_metaClasses_9_0=ruleMetaClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metaClasses",
            	            		lv_metaClasses_9_0, 
            	            		"MetaClass");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleBehaviourGroup"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:213:1: entryRuleBehaviourGroup returns [EObject current=null] : iv_ruleBehaviourGroup= ruleBehaviourGroup EOF ;
    public final EObject entryRuleBehaviourGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviourGroup = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:214:2: (iv_ruleBehaviourGroup= ruleBehaviourGroup EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:215:2: iv_ruleBehaviourGroup= ruleBehaviourGroup EOF
            {
             newCompositeNode(grammarAccess.getBehaviourGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviourGroup_in_entryRuleBehaviourGroup326);
            iv_ruleBehaviourGroup=ruleBehaviourGroup();

            state._fsp--;

             current =iv_ruleBehaviourGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehaviourGroup336); 

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
    // $ANTLR end "entryRuleBehaviourGroup"


    // $ANTLR start "ruleBehaviourGroup"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:222:1: ruleBehaviourGroup returns [EObject current=null] : (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_behaviours_3_0= ruleBehaviour ) ) otherlv_4= ';' )+ otherlv_5= ']' ) ;
    public final EObject ruleBehaviourGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_behaviours_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:225:28: ( (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_behaviours_3_0= ruleBehaviour ) ) otherlv_4= ';' )+ otherlv_5= ']' ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:226:1: (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_behaviours_3_0= ruleBehaviour ) ) otherlv_4= ';' )+ otherlv_5= ']' )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:226:1: (otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_behaviours_3_0= ruleBehaviour ) ) otherlv_4= ';' )+ otherlv_5= ']' )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:226:3: otherlv_0= 'behaviour' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_behaviours_3_0= ruleBehaviour ) ) otherlv_4= ';' )+ otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBehaviourGroup373); 

                	newLeafNode(otherlv_0, grammarAccess.getBehaviourGroupAccess().getBehaviourKeyword_0());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:230:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:231:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:231:1: (lv_name_1_0= RULE_ID )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:232:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBehaviourGroup390); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBehaviourGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBehaviourGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBehaviourGroup407); 

                	newLeafNode(otherlv_2, grammarAccess.getBehaviourGroupAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:252:1: ( ( (lv_behaviours_3_0= ruleBehaviour ) ) otherlv_4= ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==49) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:252:2: ( (lv_behaviours_3_0= ruleBehaviour ) ) otherlv_4= ';'
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:252:2: ( (lv_behaviours_3_0= ruleBehaviour ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:253:1: (lv_behaviours_3_0= ruleBehaviour )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:253:1: (lv_behaviours_3_0= ruleBehaviour )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:254:3: lv_behaviours_3_0= ruleBehaviour
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBehaviourGroupAccess().getBehavioursBehaviourParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_ruleBehaviourGroup429);
            	    lv_behaviours_3_0=ruleBehaviour();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBehaviourGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"behaviours",
            	            		lv_behaviours_3_0, 
            	            		"Behaviour");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBehaviourGroup441); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBehaviourGroupAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBehaviourGroup455); 

                	newLeafNode(otherlv_5, grammarAccess.getBehaviourGroupAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleBehaviourGroup"


    // $ANTLR start "entryRuleMetaClass"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:286:1: entryRuleMetaClass returns [EObject current=null] : iv_ruleMetaClass= ruleMetaClass EOF ;
    public final EObject entryRuleMetaClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaClass = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:287:2: (iv_ruleMetaClass= ruleMetaClass EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:288:2: iv_ruleMetaClass= ruleMetaClass EOF
            {
             newCompositeNode(grammarAccess.getMetaClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaClass_in_entryRuleMetaClass491);
            iv_ruleMetaClass=ruleMetaClass();

            state._fsp--;

             current =iv_ruleMetaClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaClass501); 

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
    // $ANTLR end "entryRuleMetaClass"


    // $ANTLR start "ruleMetaClass"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:295:1: ruleMetaClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? (otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) )? otherlv_6= ':' ( (lv_representedBy_7_0= ruleShape ) ) (otherlv_8= 'references' otherlv_9= '[' ( ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';' )* otherlv_12= ']' )? (otherlv_13= 'behavior' otherlv_14= '[' ( (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' ) )* otherlv_20= ']' )? ) ;
    public final EObject ruleMetaClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_alias_3_0=null;
        Token otherlv_4=null;
        Token lv_icon_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_representedBy_7_0 = null;

        EObject lv_references_10_0 = null;

        EObject lv_behaviours_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:298:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? (otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) )? otherlv_6= ':' ( (lv_representedBy_7_0= ruleShape ) ) (otherlv_8= 'references' otherlv_9= '[' ( ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';' )* otherlv_12= ']' )? (otherlv_13= 'behavior' otherlv_14= '[' ( (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' ) )* otherlv_20= ']' )? ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:299:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? (otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) )? otherlv_6= ':' ( (lv_representedBy_7_0= ruleShape ) ) (otherlv_8= 'references' otherlv_9= '[' ( ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';' )* otherlv_12= ']' )? (otherlv_13= 'behavior' otherlv_14= '[' ( (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' ) )* otherlv_20= ']' )? )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:299:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? (otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) )? otherlv_6= ':' ( (lv_representedBy_7_0= ruleShape ) ) (otherlv_8= 'references' otherlv_9= '[' ( ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';' )* otherlv_12= ']' )? (otherlv_13= 'behavior' otherlv_14= '[' ( (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' ) )* otherlv_20= ']' )? )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:299:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )? (otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) )? otherlv_6= ':' ( (lv_representedBy_7_0= ruleShape ) ) (otherlv_8= 'references' otherlv_9= '[' ( ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';' )* otherlv_12= ']' )? (otherlv_13= 'behavior' otherlv_14= '[' ( (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' ) )* otherlv_20= ']' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMetaClass538); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaClassAccess().getClassKeyword_0());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:303:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:304:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:304:1: (lv_name_1_0= RULE_ID )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:305:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetaClass555); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMetaClassAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:321:2: (otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:321:4: otherlv_2= 'alias' ( (lv_alias_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMetaClass573); 

                        	newLeafNode(otherlv_2, grammarAccess.getMetaClassAccess().getAliasKeyword_2_0());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:325:1: ( (lv_alias_3_0= RULE_ID ) )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:326:1: (lv_alias_3_0= RULE_ID )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:326:1: (lv_alias_3_0= RULE_ID )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:327:3: lv_alias_3_0= RULE_ID
                    {
                    lv_alias_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetaClass590); 

                    			newLeafNode(lv_alias_3_0, grammarAccess.getMetaClassAccess().getAliasIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetaClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"alias",
                            		lv_alias_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:343:4: (otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:343:6: otherlv_4= 'icon' ( (lv_icon_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMetaClass610); 

                        	newLeafNode(otherlv_4, grammarAccess.getMetaClassAccess().getIconKeyword_3_0());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:347:1: ( (lv_icon_5_0= RULE_STRING ) )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:348:1: (lv_icon_5_0= RULE_STRING )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:348:1: (lv_icon_5_0= RULE_STRING )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:349:3: lv_icon_5_0= RULE_STRING
                    {
                    lv_icon_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMetaClass627); 

                    			newLeafNode(lv_icon_5_0, grammarAccess.getMetaClassAccess().getIconSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetaClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"icon",
                            		lv_icon_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMetaClass646); 

                	newLeafNode(otherlv_6, grammarAccess.getMetaClassAccess().getColonKeyword_4());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:369:1: ( (lv_representedBy_7_0= ruleShape ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:370:1: (lv_representedBy_7_0= ruleShape )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:370:1: (lv_representedBy_7_0= ruleShape )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:371:3: lv_representedBy_7_0= ruleShape
            {
             
            	        newCompositeNode(grammarAccess.getMetaClassAccess().getRepresentedByShapeParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleShape_in_ruleMetaClass667);
            lv_representedBy_7_0=ruleShape();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetaClassRule());
            	        }
                   		set(
                   			current, 
                   			"representedBy",
                    		lv_representedBy_7_0, 
                    		"Shape");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:387:2: (otherlv_8= 'references' otherlv_9= '[' ( ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';' )* otherlv_12= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:387:4: otherlv_8= 'references' otherlv_9= '[' ( ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';' )* otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMetaClass680); 

                        	newLeafNode(otherlv_8, grammarAccess.getMetaClassAccess().getReferencesKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMetaClass692); 

                        	newLeafNode(otherlv_9, grammarAccess.getMetaClassAccess().getLeftSquareBracketKeyword_6_1());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:395:1: ( ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:395:2: ( (lv_references_10_0= ruleMetaReference2 ) ) otherlv_11= ';'
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:395:2: ( (lv_references_10_0= ruleMetaReference2 ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:396:1: (lv_references_10_0= ruleMetaReference2 )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:396:1: (lv_references_10_0= ruleMetaReference2 )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:397:3: lv_references_10_0= ruleMetaReference2
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMetaClassAccess().getReferencesMetaReference2ParserRuleCall_6_2_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMetaReference2_in_ruleMetaClass714);
                    	    lv_references_10_0=ruleMetaReference2();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMetaClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"references",
                    	            		lv_references_10_0, 
                    	            		"MetaReference2");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMetaClass726); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getMetaClassAccess().getSemicolonKeyword_6_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMetaClass740); 

                        	newLeafNode(otherlv_12, grammarAccess.getMetaClassAccess().getRightSquareBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:421:3: (otherlv_13= 'behavior' otherlv_14= '[' ( (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' ) )* otherlv_20= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:421:5: otherlv_13= 'behavior' otherlv_14= '[' ( (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' ) )* otherlv_20= ']'
                    {
                    otherlv_13=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMetaClass755); 

                        	newLeafNode(otherlv_13, grammarAccess.getMetaClassAccess().getBehaviorKeyword_7_0());
                        
                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMetaClass767); 

                        	newLeafNode(otherlv_14, grammarAccess.getMetaClassAccess().getLeftSquareBracketKeyword_7_1());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:429:1: ( (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' ) | ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==25) ) {
                            alt8=1;
                        }
                        else if ( (LA8_0==RULE_ID||LA8_0==49) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:429:2: (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:429:2: (otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:429:4: otherlv_15= 'group' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';'
                    	    {
                    	    otherlv_15=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMetaClass781); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getMetaClassAccess().getGroupKeyword_7_2_0_0());
                    	        
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:433:1: ( (otherlv_16= RULE_ID ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:434:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:434:1: (otherlv_16= RULE_ID )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:435:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMetaClassRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetaClass801); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getMetaClassAccess().getBehaviourGroupsBehaviourGroupCrossReference_7_2_0_1_0()); 
                    	    	

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMetaClass813); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getMetaClassAccess().getSemicolonKeyword_7_2_0_2());
                    	        

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:451:6: ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:451:6: ( ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';' )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:451:7: ( (lv_behaviours_18_0= ruleBehaviour ) ) otherlv_19= ';'
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:451:7: ( (lv_behaviours_18_0= ruleBehaviour ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:452:1: (lv_behaviours_18_0= ruleBehaviour )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:452:1: (lv_behaviours_18_0= ruleBehaviour )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:453:3: lv_behaviours_18_0= ruleBehaviour
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMetaClassAccess().getBehavioursBehaviourParserRuleCall_7_2_1_0_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_ruleMetaClass842);
                    	    lv_behaviours_18_0=ruleBehaviour();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMetaClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"behaviours",
                    	            		lv_behaviours_18_0, 
                    	            		"Behaviour");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMetaClass854); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getMetaClassAccess().getSemicolonKeyword_7_2_1_1());
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMetaClass869); 

                        	newLeafNode(otherlv_20, grammarAccess.getMetaClassAccess().getRightSquareBracketKeyword_7_3());
                        

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
    // $ANTLR end "ruleMetaClass"


    // $ANTLR start "entryRuleBehaviour"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:485:1: entryRuleBehaviour returns [EObject current=null] : iv_ruleBehaviour= ruleBehaviour EOF ;
    public final EObject entryRuleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehaviour = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:486:2: (iv_ruleBehaviour= ruleBehaviour EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:487:2: iv_ruleBehaviour= ruleBehaviour EOF
            {
             newCompositeNode(grammarAccess.getBehaviourRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_entryRuleBehaviour907);
            iv_ruleBehaviour=ruleBehaviour();

            state._fsp--;

             current =iv_ruleBehaviour; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehaviour917); 

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
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:494:1: ruleBehaviour returns [EObject current=null] : (this_StandardBehaviour_0= ruleStandardBehaviour | this_CustomBehaviour_1= ruleCustomBehaviour ) ;
    public final EObject ruleBehaviour() throws RecognitionException {
        EObject current = null;

        EObject this_StandardBehaviour_0 = null;

        EObject this_CustomBehaviour_1 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:497:28: ( (this_StandardBehaviour_0= ruleStandardBehaviour | this_CustomBehaviour_1= ruleCustomBehaviour ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:498:1: (this_StandardBehaviour_0= ruleStandardBehaviour | this_CustomBehaviour_1= ruleCustomBehaviour )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:498:1: (this_StandardBehaviour_0= ruleStandardBehaviour | this_CustomBehaviour_1= ruleCustomBehaviour )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==49) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:499:5: this_StandardBehaviour_0= ruleStandardBehaviour
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviourAccess().getStandardBehaviourParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStandardBehaviour_in_ruleBehaviour964);
                    this_StandardBehaviour_0=ruleStandardBehaviour();

                    state._fsp--;

                     
                            current = this_StandardBehaviour_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:509:5: this_CustomBehaviour_1= ruleCustomBehaviour
                    {
                     
                            newCompositeNode(grammarAccess.getBehaviourAccess().getCustomBehaviourParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCustomBehaviour_in_ruleBehaviour991);
                    this_CustomBehaviour_1=ruleCustomBehaviour();

                    state._fsp--;

                     
                            current = this_CustomBehaviour_1; 
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
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleStandardBehaviour"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:525:1: entryRuleStandardBehaviour returns [EObject current=null] : iv_ruleStandardBehaviour= ruleStandardBehaviour EOF ;
    public final EObject entryRuleStandardBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStandardBehaviour = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:526:2: (iv_ruleStandardBehaviour= ruleStandardBehaviour EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:527:2: iv_ruleStandardBehaviour= ruleStandardBehaviour EOF
            {
             newCompositeNode(grammarAccess.getStandardBehaviourRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStandardBehaviour_in_entryRuleStandardBehaviour1026);
            iv_ruleStandardBehaviour=ruleStandardBehaviour();

            state._fsp--;

             current =iv_ruleStandardBehaviour; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStandardBehaviour1036); 

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
    // $ANTLR end "entryRuleStandardBehaviour"


    // $ANTLR start "ruleStandardBehaviour"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:534:1: ruleStandardBehaviour returns [EObject current=null] : ( ( (lv_type_0_0= ruleBehaviourType ) ) ( (lv_label_1_0= RULE_STRING ) )? (otherlv_2= 'palette' ( (lv_paletteCompartment_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStandardBehaviour() throws RecognitionException {
        EObject current = null;

        Token lv_label_1_0=null;
        Token otherlv_2=null;
        Token lv_paletteCompartment_3_0=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:537:28: ( ( ( (lv_type_0_0= ruleBehaviourType ) ) ( (lv_label_1_0= RULE_STRING ) )? (otherlv_2= 'palette' ( (lv_paletteCompartment_3_0= RULE_STRING ) ) )? ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:538:1: ( ( (lv_type_0_0= ruleBehaviourType ) ) ( (lv_label_1_0= RULE_STRING ) )? (otherlv_2= 'palette' ( (lv_paletteCompartment_3_0= RULE_STRING ) ) )? )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:538:1: ( ( (lv_type_0_0= ruleBehaviourType ) ) ( (lv_label_1_0= RULE_STRING ) )? (otherlv_2= 'palette' ( (lv_paletteCompartment_3_0= RULE_STRING ) ) )? )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:538:2: ( (lv_type_0_0= ruleBehaviourType ) ) ( (lv_label_1_0= RULE_STRING ) )? (otherlv_2= 'palette' ( (lv_paletteCompartment_3_0= RULE_STRING ) ) )?
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:538:2: ( (lv_type_0_0= ruleBehaviourType ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:539:1: (lv_type_0_0= ruleBehaviourType )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:539:1: (lv_type_0_0= ruleBehaviourType )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:540:3: lv_type_0_0= ruleBehaviourType
            {
             
            	        newCompositeNode(grammarAccess.getStandardBehaviourAccess().getTypeBehaviourTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBehaviourType_in_ruleStandardBehaviour1082);
            lv_type_0_0=ruleBehaviourType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStandardBehaviourRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"BehaviourType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:556:2: ( (lv_label_1_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:557:1: (lv_label_1_0= RULE_STRING )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:557:1: (lv_label_1_0= RULE_STRING )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:558:3: lv_label_1_0= RULE_STRING
                    {
                    lv_label_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStandardBehaviour1099); 

                    			newLeafNode(lv_label_1_0, grammarAccess.getStandardBehaviourAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStandardBehaviourRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:574:3: (otherlv_2= 'palette' ( (lv_paletteCompartment_3_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:574:5: otherlv_2= 'palette' ( (lv_paletteCompartment_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStandardBehaviour1118); 

                        	newLeafNode(otherlv_2, grammarAccess.getStandardBehaviourAccess().getPaletteKeyword_2_0());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:578:1: ( (lv_paletteCompartment_3_0= RULE_STRING ) )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:579:1: (lv_paletteCompartment_3_0= RULE_STRING )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:579:1: (lv_paletteCompartment_3_0= RULE_STRING )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:580:3: lv_paletteCompartment_3_0= RULE_STRING
                    {
                    lv_paletteCompartment_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStandardBehaviour1135); 

                    			newLeafNode(lv_paletteCompartment_3_0, grammarAccess.getStandardBehaviourAccess().getPaletteCompartmentSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStandardBehaviourRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"paletteCompartment",
                            		lv_paletteCompartment_3_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleStandardBehaviour"


    // $ANTLR start "entryRuleCustomBehaviour"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:604:1: entryRuleCustomBehaviour returns [EObject current=null] : iv_ruleCustomBehaviour= ruleCustomBehaviour EOF ;
    public final EObject entryRuleCustomBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomBehaviour = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:605:2: (iv_ruleCustomBehaviour= ruleCustomBehaviour EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:606:2: iv_ruleCustomBehaviour= ruleCustomBehaviour EOF
            {
             newCompositeNode(grammarAccess.getCustomBehaviourRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomBehaviour_in_entryRuleCustomBehaviour1178);
            iv_ruleCustomBehaviour=ruleCustomBehaviour();

            state._fsp--;

             current =iv_ruleCustomBehaviour; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomBehaviour1188); 

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
    // $ANTLR end "entryRuleCustomBehaviour"


    // $ANTLR start "ruleCustomBehaviour"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:613:1: ruleCustomBehaviour returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomBehaviour() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_label_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:616:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:617:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:617:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:617:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_label_1_0= RULE_STRING ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:617:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:618:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:618:1: (lv_name_0_0= RULE_ID )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:619:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCustomBehaviour1230); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCustomBehaviourAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomBehaviourRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:635:2: ( (lv_label_1_0= RULE_STRING ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:636:1: (lv_label_1_0= RULE_STRING )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:636:1: (lv_label_1_0= RULE_STRING )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:637:3: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCustomBehaviour1252); 

            			newLeafNode(lv_label_1_0, grammarAccess.getCustomBehaviourAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomBehaviourRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleCustomBehaviour"


    // $ANTLR start "entryRuleMetaReference2"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:663:1: entryRuleMetaReference2 returns [EObject current=null] : iv_ruleMetaReference2= ruleMetaReference2 EOF ;
    public final EObject entryRuleMetaReference2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaReference2 = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:664:2: (iv_ruleMetaReference2= ruleMetaReference2 EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:665:2: iv_ruleMetaReference2= ruleMetaReference2 EOF
            {
             newCompositeNode(grammarAccess.getMetaReference2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaReference2_in_entryRuleMetaReference21295);
            iv_ruleMetaReference2=ruleMetaReference2();

            state._fsp--;

             current =iv_ruleMetaReference2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaReference21305); 

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
    // $ANTLR end "entryRuleMetaReference2"


    // $ANTLR start "ruleMetaReference2"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:672:1: ruleMetaReference2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_representedBy_2_0= ruleConnection ) ) ) ;
    public final EObject ruleMetaReference2() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_representedBy_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:675:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_representedBy_2_0= ruleConnection ) ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:676:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_representedBy_2_0= ruleConnection ) ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:676:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_representedBy_2_0= ruleConnection ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:676:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_representedBy_2_0= ruleConnection ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:676:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:677:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:677:1: (lv_name_0_0= RULE_ID )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:678:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetaReference21347); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMetaReference2Access().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaReference2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMetaReference21364); 

                	newLeafNode(otherlv_1, grammarAccess.getMetaReference2Access().getColonKeyword_1());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:698:1: ( (lv_representedBy_2_0= ruleConnection ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:699:1: (lv_representedBy_2_0= ruleConnection )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:699:1: (lv_representedBy_2_0= ruleConnection )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:700:3: lv_representedBy_2_0= ruleConnection
            {
             
            	        newCompositeNode(grammarAccess.getMetaReference2Access().getRepresentedByConnectionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_ruleMetaReference21385);
            lv_representedBy_2_0=ruleConnection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetaReference2Rule());
            	        }
                   		set(
                   			current, 
                   			"representedBy",
                    		lv_representedBy_2_0, 
                    		"Connection");
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
    // $ANTLR end "ruleMetaReference2"


    // $ANTLR start "entryRuleShape"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:724:1: entryRuleShape returns [EObject current=null] : iv_ruleShape= ruleShape EOF ;
    public final EObject entryRuleShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShape = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:725:2: (iv_ruleShape= ruleShape EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:726:2: iv_ruleShape= ruleShape EOF
            {
             newCompositeNode(grammarAccess.getShapeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShape_in_entryRuleShape1421);
            iv_ruleShape=ruleShape();

            state._fsp--;

             current =iv_ruleShape; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShape1431); 

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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:733:1: ruleShape returns [EObject current=null] : (this_Rectangle_0= ruleRectangle | this_Text_1= ruleText | this_Container_2= ruleContainer | this_Connection_3= ruleConnection | this_Line_4= ruleLine ) ;
    public final EObject ruleShape() throws RecognitionException {
        EObject current = null;

        EObject this_Rectangle_0 = null;

        EObject this_Text_1 = null;

        EObject this_Container_2 = null;

        EObject this_Connection_3 = null;

        EObject this_Line_4 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:736:28: ( (this_Rectangle_0= ruleRectangle | this_Text_1= ruleText | this_Container_2= ruleContainer | this_Connection_3= ruleConnection | this_Line_4= ruleLine ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:737:1: (this_Rectangle_0= ruleRectangle | this_Text_1= ruleText | this_Container_2= ruleContainer | this_Connection_3= ruleConnection | this_Line_4= ruleLine )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:737:1: (this_Rectangle_0= ruleRectangle | this_Text_1= ruleText | this_Container_2= ruleContainer | this_Connection_3= ruleConnection | this_Line_4= ruleLine )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 46:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            case 45:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:738:5: this_Rectangle_0= ruleRectangle
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getRectangleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRectangle_in_ruleShape1478);
                    this_Rectangle_0=ruleRectangle();

                    state._fsp--;

                     
                            current = this_Rectangle_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:748:5: this_Text_1= ruleText
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getTextParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleShape1505);
                    this_Text_1=ruleText();

                    state._fsp--;

                     
                            current = this_Text_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:758:5: this_Container_2= ruleContainer
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getContainerParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleContainer_in_ruleShape1532);
                    this_Container_2=ruleContainer();

                    state._fsp--;

                     
                            current = this_Container_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:768:5: this_Connection_3= ruleConnection
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getConnectionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConnection_in_ruleShape1559);
                    this_Connection_3=ruleConnection();

                    state._fsp--;

                     
                            current = this_Connection_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:778:5: this_Line_4= ruleLine
                    {
                     
                            newCompositeNode(grammarAccess.getShapeAccess().getLineParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLine_in_ruleShape1586);
                    this_Line_4=ruleLine();

                    state._fsp--;

                     
                            current = this_Line_4; 
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
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleLayout"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:794:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:795:2: (iv_ruleLayout= ruleLayout EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:796:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout1621);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout1631); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:803:1: ruleLayout returns [EObject current=null] : ( () otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* ) ) ) otherlv_17= ')' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_lineWidth_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_figure_14_0=null;
        Token lv_bold_15_0=null;
        Token lv_italic_16_0=null;
        Token otherlv_17=null;
        Enumerator lv_lineColor_8_0 = null;

        Enumerator lv_fillColor_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:806:28: ( ( () otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* ) ) ) otherlv_17= ')' ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:807:1: ( () otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* ) ) ) otherlv_17= ')' )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:807:1: ( () otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* ) ) ) otherlv_17= ')' )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:807:2: () otherlv_1= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* ) ) ) otherlv_17= ')'
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:807:2: ()
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:808:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLayoutAccess().getLayoutAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLayout1677); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:817:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:819:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:819:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:820:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:823:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )* )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:824:3: ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )*
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:824:3: ( ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) ) )*
            loop14:
            do {
                int alt14=7;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                    alt14=4;
                }
                else if ( LA14_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                    alt14=5;
                }
                else if ( LA14_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                    alt14=6;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:826:4: ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:826:4: ({...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:827:5: {...}? => ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:827:103: ( ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:828:6: ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:831:6: ({...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:831:7: {...}? => (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "true");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:831:16: (otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:831:18: otherlv_3= 'width' otherlv_4= '=' ( (lv_lineWidth_5_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLayout1735); 

            	        	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getWidthKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLayout1747); 

            	        	newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:839:1: ( (lv_lineWidth_5_0= RULE_INT ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:840:1: (lv_lineWidth_5_0= RULE_INT )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:840:1: (lv_lineWidth_5_0= RULE_INT )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:841:3: lv_lineWidth_5_0= RULE_INT
            	    {
            	    lv_lineWidth_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleLayout1764); 

            	    			newLeafNode(lv_lineWidth_5_0, grammarAccess.getLayoutAccess().getLineWidthINTTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"lineWidth",
            	            		lv_lineWidth_5_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:864:4: ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:864:4: ({...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:865:5: {...}? => ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:865:103: ( ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:866:6: ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:869:6: ({...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:869:7: {...}? => (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "true");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:869:16: (otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:869:18: otherlv_6= 'color' otherlv_7= '=' ( (lv_lineColor_8_0= ruleColor ) )
            	    {
            	    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLayout1837); 

            	        	newLeafNode(otherlv_6, grammarAccess.getLayoutAccess().getColorKeyword_2_1_0());
            	        
            	    otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLayout1849); 

            	        	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:877:1: ( (lv_lineColor_8_0= ruleColor ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:878:1: (lv_lineColor_8_0= ruleColor )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:878:1: (lv_lineColor_8_0= ruleColor )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:879:3: lv_lineColor_8_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLayoutAccess().getLineColorColorEnumRuleCall_2_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleColor_in_ruleLayout1870);
            	    lv_lineColor_8_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"lineColor",
            	            		lv_lineColor_8_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:902:4: ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:902:4: ({...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:903:5: {...}? => ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:903:103: ( ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:904:6: ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:907:6: ({...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:907:7: {...}? => (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "true");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:907:16: (otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:907:18: otherlv_9= 'fill' otherlv_10= '=' ( (lv_fillColor_11_0= ruleColor ) )
            	    {
            	    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLayout1938); 

            	        	newLeafNode(otherlv_9, grammarAccess.getLayoutAccess().getFillKeyword_2_2_0());
            	        
            	    otherlv_10=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLayout1950); 

            	        	newLeafNode(otherlv_10, grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:915:1: ( (lv_fillColor_11_0= ruleColor ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:916:1: (lv_fillColor_11_0= ruleColor )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:916:1: (lv_fillColor_11_0= ruleColor )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:917:3: lv_fillColor_11_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLayoutAccess().getFillColorColorEnumRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleColor_in_ruleLayout1971);
            	    lv_fillColor_11_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_11_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:940:4: ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:940:4: ({...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:941:5: {...}? => ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:941:103: ( ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:942:6: ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:945:6: ({...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:945:7: {...}? => (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "true");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:945:16: (otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:945:18: otherlv_12= 'figure' otherlv_13= '=' ( (lv_figure_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleLayout2039); 

            	        	newLeafNode(otherlv_12, grammarAccess.getLayoutAccess().getFigureKeyword_2_3_0());
            	        
            	    otherlv_13=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLayout2051); 

            	        	newLeafNode(otherlv_13, grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:953:1: ( (lv_figure_14_0= RULE_STRING ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:954:1: (lv_figure_14_0= RULE_STRING )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:954:1: (lv_figure_14_0= RULE_STRING )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:955:3: lv_figure_14_0= RULE_STRING
            	    {
            	    lv_figure_14_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLayout2068); 

            	    			newLeafNode(lv_figure_14_0, grammarAccess.getLayoutAccess().getFigureSTRINGTerminalRuleCall_2_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLayoutRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"figure",
            	            		lv_figure_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:978:4: ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:978:4: ({...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:979:5: {...}? => ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:979:103: ( ({...}? => ( (lv_bold_15_0= 'bold' ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:980:6: ({...}? => ( (lv_bold_15_0= 'bold' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:983:6: ({...}? => ( (lv_bold_15_0= 'bold' ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:983:7: {...}? => ( (lv_bold_15_0= 'bold' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "true");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:983:16: ( (lv_bold_15_0= 'bold' ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:984:1: (lv_bold_15_0= 'bold' )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:984:1: (lv_bold_15_0= 'bold' )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:985:3: lv_bold_15_0= 'bold'
            	    {
            	    lv_bold_15_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleLayout2146); 

            	            newLeafNode(lv_bold_15_0, grammarAccess.getLayoutAccess().getBoldBoldKeyword_2_4_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLayoutRule());
            	    	        }
            	           		setWithLastConsumed(current, "bold", true, "bold");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1005:4: ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1005:4: ({...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1006:5: {...}? => ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1006:103: ( ({...}? => ( (lv_italic_16_0= 'italic' ) ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1007:6: ({...}? => ( (lv_italic_16_0= 'italic' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1010:6: ({...}? => ( (lv_italic_16_0= 'italic' ) ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1010:7: {...}? => ( (lv_italic_16_0= 'italic' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLayout", "true");
            	    }
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1010:16: ( (lv_italic_16_0= 'italic' ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1011:1: (lv_italic_16_0= 'italic' )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1011:1: (lv_italic_16_0= 'italic' )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1012:3: lv_italic_16_0= 'italic'
            	    {
            	    lv_italic_16_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleLayout2231); 

            	            newLeafNode(lv_italic_16_0, grammarAccess.getLayoutAccess().getItalicItalicKeyword_2_5_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLayoutRule());
            	    	        }
            	           		setWithLastConsumed(current, "italic", true, "italic");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	

            }

            otherlv_17=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleLayout2296); 

                	newLeafNode(otherlv_17, grammarAccess.getLayoutAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleRectangle"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1053:1: entryRuleRectangle returns [EObject current=null] : iv_ruleRectangle= ruleRectangle EOF ;
    public final EObject entryRuleRectangle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRectangle = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1054:2: (iv_ruleRectangle= ruleRectangle EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1055:2: iv_ruleRectangle= ruleRectangle EOF
            {
             newCompositeNode(grammarAccess.getRectangleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRectangle_in_entryRuleRectangle2334);
            iv_ruleRectangle=ruleRectangle();

            state._fsp--;

             current =iv_ruleRectangle; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRectangle2344); 

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
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1062:1: ruleRectangle returns [EObject current=null] : ( () otherlv_1= 'rectangle' ( (lv_layout_2_0= ruleLayout ) ) ) ;
    public final EObject ruleRectangle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_layout_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1065:28: ( ( () otherlv_1= 'rectangle' ( (lv_layout_2_0= ruleLayout ) ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1066:1: ( () otherlv_1= 'rectangle' ( (lv_layout_2_0= ruleLayout ) ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1066:1: ( () otherlv_1= 'rectangle' ( (lv_layout_2_0= ruleLayout ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1066:2: () otherlv_1= 'rectangle' ( (lv_layout_2_0= ruleLayout ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1066:2: ()
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1067:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRectangleAccess().getRectangleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleRectangle2390); 

                	newLeafNode(otherlv_1, grammarAccess.getRectangleAccess().getRectangleKeyword_1());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1076:1: ( (lv_layout_2_0= ruleLayout ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1077:1: (lv_layout_2_0= ruleLayout )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1077:1: (lv_layout_2_0= ruleLayout )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1078:3: lv_layout_2_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getRectangleAccess().getLayoutLayoutParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleRectangle2411);
            lv_layout_2_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRectangleRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_2_0, 
                    		"Layout");
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
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleConnection"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1102:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1103:2: (iv_ruleConnection= ruleConnection EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1104:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_entryRuleConnection2447);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnection2457); 

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1111:1: ruleConnection returns [EObject current=null] : ( () otherlv_1= 'connection' ( (lv_layout_2_0= ruleLayout ) ) (otherlv_3= '[' otherlv_4= 'from' ( (lv_from_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'to' ( (lv_to_8_0= RULE_ID ) ) otherlv_9= ';' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= ']' )? ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_from_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_to_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_layout_2_0 = null;

        EObject lv_fromLabel_12_0 = null;

        EObject lv_connectionLabel_15_0 = null;

        EObject lv_toLabel_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1114:28: ( ( () otherlv_1= 'connection' ( (lv_layout_2_0= ruleLayout ) ) (otherlv_3= '[' otherlv_4= 'from' ( (lv_from_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'to' ( (lv_to_8_0= RULE_ID ) ) otherlv_9= ';' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= ']' )? ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1115:1: ( () otherlv_1= 'connection' ( (lv_layout_2_0= ruleLayout ) ) (otherlv_3= '[' otherlv_4= 'from' ( (lv_from_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'to' ( (lv_to_8_0= RULE_ID ) ) otherlv_9= ';' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= ']' )? )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1115:1: ( () otherlv_1= 'connection' ( (lv_layout_2_0= ruleLayout ) ) (otherlv_3= '[' otherlv_4= 'from' ( (lv_from_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'to' ( (lv_to_8_0= RULE_ID ) ) otherlv_9= ';' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= ']' )? )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1115:2: () otherlv_1= 'connection' ( (lv_layout_2_0= ruleLayout ) ) (otherlv_3= '[' otherlv_4= 'from' ( (lv_from_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'to' ( (lv_to_8_0= RULE_ID ) ) otherlv_9= ';' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= ']' )?
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1115:2: ()
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1116:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConnectionAccess().getConnectionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConnection2503); 

                	newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getConnectionKeyword_1());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1125:1: ( (lv_layout_2_0= ruleLayout ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1126:1: (lv_layout_2_0= ruleLayout )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1126:1: (lv_layout_2_0= ruleLayout )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1127:3: lv_layout_2_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getConnectionAccess().getLayoutLayoutParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleConnection2524);
            lv_layout_2_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConnectionRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_2_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1143:2: (otherlv_3= '[' otherlv_4= 'from' ( (lv_from_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'to' ( (lv_to_8_0= RULE_ID ) ) otherlv_9= ';' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1143:4: otherlv_3= '[' otherlv_4= 'from' ( (lv_from_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'to' ( (lv_to_8_0= RULE_ID ) ) otherlv_9= ';' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= ']'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConnection2537); 

                        	newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getLeftSquareBracketKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleConnection2549); 

                        	newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getFromKeyword_3_1());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1151:1: ( (lv_from_5_0= RULE_ID ) )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1152:1: (lv_from_5_0= RULE_ID )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1152:1: (lv_from_5_0= RULE_ID )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1153:3: lv_from_5_0= RULE_ID
                    {
                    lv_from_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConnection2566); 

                    			newLeafNode(lv_from_5_0, grammarAccess.getConnectionAccess().getFromIDTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"from",
                            		lv_from_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConnection2583); 

                        	newLeafNode(otherlv_6, grammarAccess.getConnectionAccess().getSemicolonKeyword_3_3());
                        
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConnection2595); 

                        	newLeafNode(otherlv_7, grammarAccess.getConnectionAccess().getToKeyword_3_4());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1177:1: ( (lv_to_8_0= RULE_ID ) )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1178:1: (lv_to_8_0= RULE_ID )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1178:1: (lv_to_8_0= RULE_ID )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1179:3: lv_to_8_0= RULE_ID
                    {
                    lv_to_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConnection2612); 

                    			newLeafNode(lv_to_8_0, grammarAccess.getConnectionAccess().getToIDTerminalRuleCall_3_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"to",
                            		lv_to_8_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConnection2629); 

                        	newLeafNode(otherlv_9, grammarAccess.getConnectionAccess().getSemicolonKeyword_3_6());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1199:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) ) )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1201:1: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1201:1: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* ) )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1202:2: ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7());
                    	
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1205:2: ( ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )* )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1206:3: ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )*
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1206:3: ( ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) ) )*
                    loop15:
                    do {
                        int alt15=4;
                        int LA15_0 = input.LA(1);

                        if ( LA15_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0) ) {
                            alt15=1;
                        }
                        else if ( LA15_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1) ) {
                            alt15=2;
                        }
                        else if ( LA15_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2) ) {
                            alt15=3;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1208:4: ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1208:4: ({...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1209:5: {...}? => ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0)");
                    	    }
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1209:109: ( ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1210:6: ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0);
                    	    	 				
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1213:6: ({...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1213:7: {...}? => (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConnection", "true");
                    	    }
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1213:16: (otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';' )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1213:18: otherlv_11= 'fromText' ( (lv_fromLabel_12_0= ruleText ) ) otherlv_13= ';'
                    	    {
                    	    otherlv_11=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleConnection2687); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getConnectionAccess().getFromTextKeyword_3_7_0_0());
                    	        
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1217:1: ( (lv_fromLabel_12_0= ruleText ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1218:1: (lv_fromLabel_12_0= ruleText )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1218:1: (lv_fromLabel_12_0= ruleText )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1219:3: lv_fromLabel_12_0= ruleText
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConnectionAccess().getFromLabelTextParserRuleCall_3_7_0_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleConnection2708);
                    	    lv_fromLabel_12_0=ruleText();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"fromLabel",
                    	            		lv_fromLabel_12_0, 
                    	            		"Text");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConnection2720); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_0_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1246:4: ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1246:4: ({...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1247:5: {...}? => ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1)");
                    	    }
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1247:109: ( ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1248:6: ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1);
                    	    	 				
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1251:6: ({...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1251:7: {...}? => (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConnection", "true");
                    	    }
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1251:16: (otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';' )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1251:18: otherlv_14= 'connectionText' ( (lv_connectionLabel_15_0= ruleText ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleConnection2788); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getConnectionAccess().getConnectionTextKeyword_3_7_1_0());
                    	        
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1255:1: ( (lv_connectionLabel_15_0= ruleText ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1256:1: (lv_connectionLabel_15_0= ruleText )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1256:1: (lv_connectionLabel_15_0= ruleText )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1257:3: lv_connectionLabel_15_0= ruleText
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConnectionAccess().getConnectionLabelTextParserRuleCall_3_7_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleConnection2809);
                    	    lv_connectionLabel_15_0=ruleText();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"connectionLabel",
                    	            		lv_connectionLabel_15_0, 
                    	            		"Text");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConnection2821); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_1_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1284:4: ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1284:4: ({...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1285:5: {...}? => ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2)");
                    	    }
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1285:109: ( ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1286:6: ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2);
                    	    	 				
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1289:6: ({...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1289:7: {...}? => (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleConnection", "true");
                    	    }
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1289:16: (otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';' )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1289:18: otherlv_17= 'toText' ( (lv_toLabel_18_0= ruleText ) ) otherlv_19= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleConnection2889); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getConnectionAccess().getToTextKeyword_3_7_2_0());
                    	        
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1293:1: ( (lv_toLabel_18_0= ruleText ) )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1294:1: (lv_toLabel_18_0= ruleText )
                    	    {
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1294:1: (lv_toLabel_18_0= ruleText )
                    	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1295:3: lv_toLabel_18_0= ruleText
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConnectionAccess().getToLabelTextParserRuleCall_3_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleConnection2910);
                    	    lv_toLabel_18_0=ruleText();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConnectionRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"toLabel",
                    	            		lv_toLabel_18_0, 
                    	            		"Text");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConnection2922); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_2_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7());
                    	    	 				

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

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7());
                    	

                    }

                    otherlv_20=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConnection2975); 

                        	newLeafNode(otherlv_20, grammarAccess.getConnectionAccess().getRightSquareBracketKeyword_3_8());
                        

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleText"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1341:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1342:2: (iv_ruleText= ruleText EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1343:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText3013);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText3023); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1350:1: ruleText returns [EObject current=null] : ( () otherlv_1= 'text' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_value_3_0= ruleSprayString ) )+ ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_layout_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1353:28: ( ( () otherlv_1= 'text' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_value_3_0= ruleSprayString ) )+ ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1354:1: ( () otherlv_1= 'text' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_value_3_0= ruleSprayString ) )+ )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1354:1: ( () otherlv_1= 'text' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_value_3_0= ruleSprayString ) )+ )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1354:2: () otherlv_1= 'text' ( (lv_layout_2_0= ruleLayout ) ) ( (lv_value_3_0= ruleSprayString ) )+
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1354:2: ()
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1355:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTextAccess().getTextAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleText3069); 

                	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1364:1: ( (lv_layout_2_0= ruleLayout ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1365:1: (lv_layout_2_0= ruleLayout )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1365:1: (lv_layout_2_0= ruleLayout )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1366:3: lv_layout_2_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getTextAccess().getLayoutLayoutParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleText3090);
            lv_layout_2_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_2_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1382:2: ( (lv_value_3_0= ruleSprayString ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1383:1: (lv_value_3_0= ruleSprayString )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1383:1: (lv_value_3_0= ruleSprayString )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1384:3: lv_value_3_0= ruleSprayString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTextAccess().getValueSprayStringParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSprayString_in_ruleText3111);
            	    lv_value_3_0=ruleSprayString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_3_0, 
            	            		"SprayString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleSprayString"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1408:1: entryRuleSprayString returns [EObject current=null] : iv_ruleSprayString= ruleSprayString EOF ;
    public final EObject entryRuleSprayString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSprayString = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1409:2: (iv_ruleSprayString= ruleSprayString EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1410:2: iv_ruleSprayString= ruleSprayString EOF
            {
             newCompositeNode(grammarAccess.getSprayStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSprayString_in_entryRuleSprayString3148);
            iv_ruleSprayString=ruleSprayString();

            state._fsp--;

             current =iv_ruleSprayString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSprayString3158); 

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
    // $ANTLR end "entryRuleSprayString"


    // $ANTLR start "ruleSprayString"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1417:1: ruleSprayString returns [EObject current=null] : (this_MetaAttribute_0= ruleMetaAttribute | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleSprayString() throws RecognitionException {
        EObject current = null;

        EObject this_MetaAttribute_0 = null;

        EObject this_StringLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1420:28: ( (this_MetaAttribute_0= ruleMetaAttribute | this_StringLiteral_1= ruleStringLiteral ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1421:1: (this_MetaAttribute_0= ruleMetaAttribute | this_StringLiteral_1= ruleStringLiteral )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1421:1: (this_MetaAttribute_0= ruleMetaAttribute | this_StringLiteral_1= ruleStringLiteral )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1422:5: this_MetaAttribute_0= ruleMetaAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getSprayStringAccess().getMetaAttributeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMetaAttribute_in_ruleSprayString3205);
                    this_MetaAttribute_0=ruleMetaAttribute();

                    state._fsp--;

                     
                            current = this_MetaAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1432:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getSprayStringAccess().getStringLiteralParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_ruleSprayString3232);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_1; 
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
    // $ANTLR end "ruleSprayString"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1448:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1449:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1450:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3267);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral3277); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1457:1: ruleStringLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1460:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1461:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1461:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1462:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1462:1: (lv_name_0_0= RULE_STRING )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1463:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleStringLiteral3318); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStringLiteralAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleMetaAttribute"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1487:1: entryRuleMetaAttribute returns [EObject current=null] : iv_ruleMetaAttribute= ruleMetaAttribute EOF ;
    public final EObject entryRuleMetaAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaAttribute = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1488:2: (iv_ruleMetaAttribute= ruleMetaAttribute EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1489:2: iv_ruleMetaAttribute= ruleMetaAttribute EOF
            {
             newCompositeNode(grammarAccess.getMetaAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaAttribute_in_entryRuleMetaAttribute3358);
            iv_ruleMetaAttribute=ruleMetaAttribute();

            state._fsp--;

             current =iv_ruleMetaAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaAttribute3368); 

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
    // $ANTLR end "entryRuleMetaAttribute"


    // $ANTLR start "ruleMetaAttribute"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1496:1: ruleMetaAttribute returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleMetaAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1499:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1500:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1500:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1501:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1501:1: (lv_name_0_0= ruleQualifiedName )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1502:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getMetaAttributeAccess().getNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleMetaAttribute3413);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetaAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"QualifiedName");
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
    // $ANTLR end "ruleMetaAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1526:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1527:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1528:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3449);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName3460); 

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
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1535:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1538:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1539:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1539:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1539:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3500); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1546:1: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1547:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleQualifiedName3519); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3534); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLine"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1567:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1568:2: (iv_ruleLine= ruleLine EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1569:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLine_in_entryRuleLine3581);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLine3591); 

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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1576:1: ruleLine returns [EObject current=null] : ( () otherlv_1= 'line' ( (lv_layout_2_0= ruleLayout ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_layout_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1579:28: ( ( () otherlv_1= 'line' ( (lv_layout_2_0= ruleLayout ) ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1580:1: ( () otherlv_1= 'line' ( (lv_layout_2_0= ruleLayout ) ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1580:1: ( () otherlv_1= 'line' ( (lv_layout_2_0= ruleLayout ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1580:2: () otherlv_1= 'line' ( (lv_layout_2_0= ruleLayout ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1580:2: ()
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1581:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLineAccess().getLineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleLine3637); 

                	newLeafNode(otherlv_1, grammarAccess.getLineAccess().getLineKeyword_1());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1590:1: ( (lv_layout_2_0= ruleLayout ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1591:1: (lv_layout_2_0= ruleLayout )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1591:1: (lv_layout_2_0= ruleLayout )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1592:3: lv_layout_2_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getLineAccess().getLayoutLayoutParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleLine3658);
            lv_layout_2_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLineRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_2_0, 
                    		"Layout");
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
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleContainer"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1616:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1617:2: (iv_ruleContainer= ruleContainer EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1618:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_entryRuleContainer3694);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainer3704); 

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1625:1: ruleContainer returns [EObject current=null] : ( () otherlv_1= 'container' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= '[' ( ( (lv_parts_4_0= ruleSprayElement ) ) otherlv_5= ';' )* otherlv_6= ']' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_layout_2_0 = null;

        EObject lv_parts_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1628:28: ( ( () otherlv_1= 'container' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= '[' ( ( (lv_parts_4_0= ruleSprayElement ) ) otherlv_5= ';' )* otherlv_6= ']' ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1629:1: ( () otherlv_1= 'container' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= '[' ( ( (lv_parts_4_0= ruleSprayElement ) ) otherlv_5= ';' )* otherlv_6= ']' )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1629:1: ( () otherlv_1= 'container' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= '[' ( ( (lv_parts_4_0= ruleSprayElement ) ) otherlv_5= ';' )* otherlv_6= ']' )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1629:2: () otherlv_1= 'container' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= '[' ( ( (lv_parts_4_0= ruleSprayElement ) ) otherlv_5= ';' )* otherlv_6= ']'
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1629:2: ()
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1630:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContainerAccess().getContainerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleContainer3750); 

                	newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1639:1: ( (lv_layout_2_0= ruleLayout ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1640:1: (lv_layout_2_0= ruleLayout )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1640:1: (lv_layout_2_0= ruleLayout )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1641:3: lv_layout_2_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleContainer3771);
            lv_layout_2_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_2_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContainer3783); 

                	newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getLeftSquareBracketKeyword_3());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1661:1: ( ( (lv_parts_4_0= ruleSprayElement ) ) otherlv_5= ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=36 && LA20_0<=37)||LA20_0==43||(LA20_0>=45 && LA20_0<=48)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1661:2: ( (lv_parts_4_0= ruleSprayElement ) ) otherlv_5= ';'
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1661:2: ( (lv_parts_4_0= ruleSprayElement ) )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1662:1: (lv_parts_4_0= ruleSprayElement )
            	    {
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1662:1: (lv_parts_4_0= ruleSprayElement )
            	    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1663:3: lv_parts_4_0= ruleSprayElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getPartsSprayElementParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSprayElement_in_ruleContainer3805);
            	    lv_parts_4_0=ruleSprayElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parts",
            	            		lv_parts_4_0, 
            	            		"SprayElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleContainer3817); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getSemicolonKeyword_4_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContainer3831); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5());
                

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleSprayElement"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1695:1: entryRuleSprayElement returns [EObject current=null] : iv_ruleSprayElement= ruleSprayElement EOF ;
    public final EObject entryRuleSprayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSprayElement = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1696:2: (iv_ruleSprayElement= ruleSprayElement EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1697:2: iv_ruleSprayElement= ruleSprayElement EOF
            {
             newCompositeNode(grammarAccess.getSprayElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSprayElement_in_entryRuleSprayElement3867);
            iv_ruleSprayElement=ruleSprayElement();

            state._fsp--;

             current =iv_ruleSprayElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSprayElement3877); 

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
    // $ANTLR end "entryRuleSprayElement"


    // $ANTLR start "ruleSprayElement"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1704:1: ruleSprayElement returns [EObject current=null] : (this_Shape_0= ruleShape | this_MetaReferenceAsShape_1= ruleMetaReferenceAsShape | this_MetaAttributeAsShape_2= ruleMetaAttributeAsShape ) ;
    public final EObject ruleSprayElement() throws RecognitionException {
        EObject current = null;

        EObject this_Shape_0 = null;

        EObject this_MetaReferenceAsShape_1 = null;

        EObject this_MetaAttributeAsShape_2 = null;


         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1707:28: ( (this_Shape_0= ruleShape | this_MetaReferenceAsShape_1= ruleMetaReferenceAsShape | this_MetaAttributeAsShape_2= ruleMetaAttributeAsShape ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1708:1: (this_Shape_0= ruleShape | this_MetaReferenceAsShape_1= ruleMetaReferenceAsShape | this_MetaAttributeAsShape_2= ruleMetaAttributeAsShape )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1708:1: (this_Shape_0= ruleShape | this_MetaReferenceAsShape_1= ruleMetaReferenceAsShape | this_MetaAttributeAsShape_2= ruleMetaAttributeAsShape )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
            case 43:
            case 45:
            case 46:
                {
                alt21=1;
                }
                break;
            case 47:
                {
                alt21=2;
                }
                break;
            case 48:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1709:5: this_Shape_0= ruleShape
                    {
                     
                            newCompositeNode(grammarAccess.getSprayElementAccess().getShapeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleShape_in_ruleSprayElement3924);
                    this_Shape_0=ruleShape();

                    state._fsp--;

                     
                            current = this_Shape_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1719:5: this_MetaReferenceAsShape_1= ruleMetaReferenceAsShape
                    {
                     
                            newCompositeNode(grammarAccess.getSprayElementAccess().getMetaReferenceAsShapeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMetaReferenceAsShape_in_ruleSprayElement3951);
                    this_MetaReferenceAsShape_1=ruleMetaReferenceAsShape();

                    state._fsp--;

                     
                            current = this_MetaReferenceAsShape_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1729:5: this_MetaAttributeAsShape_2= ruleMetaAttributeAsShape
                    {
                     
                            newCompositeNode(grammarAccess.getSprayElementAccess().getMetaAttributeAsShapeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMetaAttributeAsShape_in_ruleSprayElement3978);
                    this_MetaAttributeAsShape_2=ruleMetaAttributeAsShape();

                    state._fsp--;

                     
                            current = this_MetaAttributeAsShape_2; 
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
    // $ANTLR end "ruleSprayElement"


    // $ANTLR start "entryRuleMetaReferenceAsShape"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1745:1: entryRuleMetaReferenceAsShape returns [EObject current=null] : iv_ruleMetaReferenceAsShape= ruleMetaReferenceAsShape EOF ;
    public final EObject entryRuleMetaReferenceAsShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaReferenceAsShape = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1746:2: (iv_ruleMetaReferenceAsShape= ruleMetaReferenceAsShape EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1747:2: iv_ruleMetaReferenceAsShape= ruleMetaReferenceAsShape EOF
            {
             newCompositeNode(grammarAccess.getMetaReferenceAsShapeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaReferenceAsShape_in_entryRuleMetaReferenceAsShape4013);
            iv_ruleMetaReferenceAsShape=ruleMetaReferenceAsShape();

            state._fsp--;

             current =iv_ruleMetaReferenceAsShape; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaReferenceAsShape4023); 

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
    // $ANTLR end "entryRuleMetaReferenceAsShape"


    // $ANTLR start "ruleMetaReferenceAsShape"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1754:1: ruleMetaReferenceAsShape returns [EObject current=null] : (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attribute' ( (lv_labelProperty_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleMetaReferenceAsShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_labelProperty_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1757:28: ( (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attribute' ( (lv_labelProperty_3_0= RULE_ID ) ) )? ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1758:1: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attribute' ( (lv_labelProperty_3_0= RULE_ID ) ) )? )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1758:1: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attribute' ( (lv_labelProperty_3_0= RULE_ID ) ) )? )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1758:3: otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attribute' ( (lv_labelProperty_3_0= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleMetaReferenceAsShape4060); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaReferenceAsShapeAccess().getReferenceKeyword_0());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1762:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1763:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1763:1: (lv_name_1_0= RULE_ID )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1764:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetaReferenceAsShape4077); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMetaReferenceAsShapeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaReferenceAsShapeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1780:2: (otherlv_2= 'attribute' ( (lv_labelProperty_3_0= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1780:4: otherlv_2= 'attribute' ( (lv_labelProperty_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMetaReferenceAsShape4095); 

                        	newLeafNode(otherlv_2, grammarAccess.getMetaReferenceAsShapeAccess().getAttributeKeyword_2_0());
                        
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1784:1: ( (lv_labelProperty_3_0= RULE_ID ) )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1785:1: (lv_labelProperty_3_0= RULE_ID )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1785:1: (lv_labelProperty_3_0= RULE_ID )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1786:3: lv_labelProperty_3_0= RULE_ID
                    {
                    lv_labelProperty_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetaReferenceAsShape4112); 

                    			newLeafNode(lv_labelProperty_3_0, grammarAccess.getMetaReferenceAsShapeAccess().getLabelPropertyIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetaReferenceAsShapeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"labelProperty",
                            		lv_labelProperty_3_0, 
                            		"ID");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleMetaReferenceAsShape"


    // $ANTLR start "entryRuleMetaAttributeAsShape"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1810:1: entryRuleMetaAttributeAsShape returns [EObject current=null] : iv_ruleMetaAttributeAsShape= ruleMetaAttributeAsShape EOF ;
    public final EObject entryRuleMetaAttributeAsShape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaAttributeAsShape = null;


        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1811:2: (iv_ruleMetaAttributeAsShape= ruleMetaAttributeAsShape EOF )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1812:2: iv_ruleMetaAttributeAsShape= ruleMetaAttributeAsShape EOF
            {
             newCompositeNode(grammarAccess.getMetaAttributeAsShapeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaAttributeAsShape_in_entryRuleMetaAttributeAsShape4155);
            iv_ruleMetaAttributeAsShape=ruleMetaAttributeAsShape();

            state._fsp--;

             current =iv_ruleMetaAttributeAsShape; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaAttributeAsShape4165); 

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
    // $ANTLR end "entryRuleMetaAttributeAsShape"


    // $ANTLR start "ruleMetaAttributeAsShape"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1819:1: ruleMetaAttributeAsShape returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMetaAttributeAsShape() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1822:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1823:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1823:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1823:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleMetaAttributeAsShape4202); 

                	newLeafNode(otherlv_0, grammarAccess.getMetaAttributeAsShapeAccess().getAttributeKeyword_0());
                
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1827:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1828:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1828:1: (lv_name_1_0= RULE_ID )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1829:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMetaAttributeAsShape4219); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMetaAttributeAsShapeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaAttributeAsShapeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleMetaAttributeAsShape"


    // $ANTLR start "ruleBehaviourType"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1853:1: ruleBehaviourType returns [Enumerator current=null] : (enumLiteral_0= 'create' ) ;
    public final Enumerator ruleBehaviourType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1855:28: ( (enumLiteral_0= 'create' ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1856:1: (enumLiteral_0= 'create' )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1856:1: (enumLiteral_0= 'create' )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1856:3: enumLiteral_0= 'create'
            {
            enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleBehaviourType4273); 

                    current = grammarAccess.getBehaviourTypeAccess().getCREATE_BEHAVIOUREnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getBehaviourTypeAccess().getCREATE_BEHAVIOUREnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleBehaviourType"


    // $ANTLR start "ruleColor"
    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1866:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'light_gray' ) | (enumLiteral_4= 'light_light_gray' ) | (enumLiteral_5= 'gray' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'white' ) | (enumLiteral_8= 'yellow' ) | (enumLiteral_9= 'dark_blue' ) | (enumLiteral_10= 'vc_dark_blue' ) | (enumLiteral_11= 'cyan' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'light_green' ) | (enumLiteral_14= 'light_blue' ) | (enumLiteral_15= 'medium_blue' ) | (enumLiteral_16= 'pink' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;

         enterRule(); 
        try {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1868:28: ( ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'light_gray' ) | (enumLiteral_4= 'light_light_gray' ) | (enumLiteral_5= 'gray' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'white' ) | (enumLiteral_8= 'yellow' ) | (enumLiteral_9= 'dark_blue' ) | (enumLiteral_10= 'vc_dark_blue' ) | (enumLiteral_11= 'cyan' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'light_green' ) | (enumLiteral_14= 'light_blue' ) | (enumLiteral_15= 'medium_blue' ) | (enumLiteral_16= 'pink' ) ) )
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1869:1: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'light_gray' ) | (enumLiteral_4= 'light_light_gray' ) | (enumLiteral_5= 'gray' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'white' ) | (enumLiteral_8= 'yellow' ) | (enumLiteral_9= 'dark_blue' ) | (enumLiteral_10= 'vc_dark_blue' ) | (enumLiteral_11= 'cyan' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'light_green' ) | (enumLiteral_14= 'light_blue' ) | (enumLiteral_15= 'medium_blue' ) | (enumLiteral_16= 'pink' ) )
            {
            // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1869:1: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'red' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'light_gray' ) | (enumLiteral_4= 'light_light_gray' ) | (enumLiteral_5= 'gray' ) | (enumLiteral_6= 'orange' ) | (enumLiteral_7= 'white' ) | (enumLiteral_8= 'yellow' ) | (enumLiteral_9= 'dark_blue' ) | (enumLiteral_10= 'vc_dark_blue' ) | (enumLiteral_11= 'cyan' ) | (enumLiteral_12= 'dark_green' ) | (enumLiteral_13= 'light_green' ) | (enumLiteral_14= 'light_blue' ) | (enumLiteral_15= 'medium_blue' ) | (enumLiteral_16= 'pink' ) )
            int alt23=17;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt23=1;
                }
                break;
            case 51:
                {
                alt23=2;
                }
                break;
            case 52:
                {
                alt23=3;
                }
                break;
            case 53:
                {
                alt23=4;
                }
                break;
            case 54:
                {
                alt23=5;
                }
                break;
            case 55:
                {
                alt23=6;
                }
                break;
            case 56:
                {
                alt23=7;
                }
                break;
            case 57:
                {
                alt23=8;
                }
                break;
            case 58:
                {
                alt23=9;
                }
                break;
            case 59:
                {
                alt23=10;
                }
                break;
            case 60:
                {
                alt23=11;
                }
                break;
            case 61:
                {
                alt23=12;
                }
                break;
            case 62:
                {
                alt23=13;
                }
                break;
            case 63:
                {
                alt23=14;
                }
                break;
            case 64:
                {
                alt23=15;
                }
                break;
            case 65:
                {
                alt23=16;
                }
                break;
            case 66:
                {
                alt23=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1869:2: (enumLiteral_0= 'black' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1869:2: (enumLiteral_0= 'black' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1869:4: enumLiteral_0= 'black'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleColor4317); 

                            current = grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1875:6: (enumLiteral_1= 'red' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1875:6: (enumLiteral_1= 'red' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1875:8: enumLiteral_1= 'red'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleColor4334); 

                            current = grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1881:6: (enumLiteral_2= 'green' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1881:6: (enumLiteral_2= 'green' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1881:8: enumLiteral_2= 'green'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleColor4351); 

                            current = grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1887:6: (enumLiteral_3= 'light_gray' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1887:6: (enumLiteral_3= 'light_gray' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1887:8: enumLiteral_3= 'light_gray'
                    {
                    enumLiteral_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleColor4368); 

                            current = grammarAccess.getColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1893:6: (enumLiteral_4= 'light_light_gray' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1893:6: (enumLiteral_4= 'light_light_gray' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1893:8: enumLiteral_4= 'light_light_gray'
                    {
                    enumLiteral_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleColor4385); 

                            current = grammarAccess.getColorAccess().getLIGHT_LIGHT_GRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getLIGHT_LIGHT_GRAYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1899:6: (enumLiteral_5= 'gray' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1899:6: (enumLiteral_5= 'gray' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1899:8: enumLiteral_5= 'gray'
                    {
                    enumLiteral_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleColor4402); 

                            current = grammarAccess.getColorAccess().getGRAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getGRAYEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1905:6: (enumLiteral_6= 'orange' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1905:6: (enumLiteral_6= 'orange' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1905:8: enumLiteral_6= 'orange'
                    {
                    enumLiteral_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleColor4419); 

                            current = grammarAccess.getColorAccess().getORANGEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getORANGEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1911:6: (enumLiteral_7= 'white' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1911:6: (enumLiteral_7= 'white' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1911:8: enumLiteral_7= 'white'
                    {
                    enumLiteral_7=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleColor4436); 

                            current = grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1917:6: (enumLiteral_8= 'yellow' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1917:6: (enumLiteral_8= 'yellow' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1917:8: enumLiteral_8= 'yellow'
                    {
                    enumLiteral_8=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleColor4453); 

                            current = grammarAccess.getColorAccess().getYELLOWEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getYELLOWEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1923:6: (enumLiteral_9= 'dark_blue' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1923:6: (enumLiteral_9= 'dark_blue' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1923:8: enumLiteral_9= 'dark_blue'
                    {
                    enumLiteral_9=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleColor4470); 

                            current = grammarAccess.getColorAccess().getDARK_BLUEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getDARK_BLUEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1929:6: (enumLiteral_10= 'vc_dark_blue' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1929:6: (enumLiteral_10= 'vc_dark_blue' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1929:8: enumLiteral_10= 'vc_dark_blue'
                    {
                    enumLiteral_10=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleColor4487); 

                            current = grammarAccess.getColorAccess().getVC_DARK_BLUEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getVC_DARK_BLUEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1935:6: (enumLiteral_11= 'cyan' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1935:6: (enumLiteral_11= 'cyan' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1935:8: enumLiteral_11= 'cyan'
                    {
                    enumLiteral_11=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleColor4504); 

                            current = grammarAccess.getColorAccess().getCYANEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getCYANEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1941:6: (enumLiteral_12= 'dark_green' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1941:6: (enumLiteral_12= 'dark_green' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1941:8: enumLiteral_12= 'dark_green'
                    {
                    enumLiteral_12=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleColor4521); 

                            current = grammarAccess.getColorAccess().getDARK_GREENEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorAccess().getDARK_GREENEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1947:6: (enumLiteral_13= 'light_green' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1947:6: (enumLiteral_13= 'light_green' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1947:8: enumLiteral_13= 'light_green'
                    {
                    enumLiteral_13=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleColor4538); 

                            current = grammarAccess.getColorAccess().getLIGHT_GREENEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorAccess().getLIGHT_GREENEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1953:6: (enumLiteral_14= 'light_blue' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1953:6: (enumLiteral_14= 'light_blue' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1953:8: enumLiteral_14= 'light_blue'
                    {
                    enumLiteral_14=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleColor4555); 

                            current = grammarAccess.getColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1959:6: (enumLiteral_15= 'medium_blue' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1959:6: (enumLiteral_15= 'medium_blue' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1959:8: enumLiteral_15= 'medium_blue'
                    {
                    enumLiteral_15=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleColor4572); 

                            current = grammarAccess.getColorAccess().getVC_MEDIUM_BLUEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getColorAccess().getVC_MEDIUM_BLUEEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1965:6: (enumLiteral_16= 'pink' )
                    {
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1965:6: (enumLiteral_16= 'pink' )
                    // ../org.xspray.xtext/src-gen/org/xspray/xtext/parser/antlr/internal/InternalXspray.g:1965:8: enumLiteral_16= 'pink'
                    {
                    enumLiteral_16=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleColor4589); 

                            current = grammarAccess.getColorAccess().getPINKEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getColorAccess().getPINKEnumLiteralDeclaration_16()); 
                        

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
    // $ANTLR end "ruleColor"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDiagram85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDiagram122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDiagram139 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDiagram156 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagram173 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDiagram190 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagram207 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDiagram224 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDiagram241 = new BitSet(new long[]{0x0000000000088002L});
        public static final BitSet FOLLOW_ruleBehaviourGroup_in_ruleDiagram267 = new BitSet(new long[]{0x0000000000088002L});
        public static final BitSet FOLLOW_ruleMetaClass_in_ruleDiagram289 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_ruleBehaviourGroup_in_entryRuleBehaviourGroup326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehaviourGroup336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleBehaviourGroup373 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBehaviourGroup390 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBehaviourGroup407 = new BitSet(new long[]{0x0002000000000010L});
        public static final BitSet FOLLOW_ruleBehaviour_in_ruleBehaviourGroup429 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBehaviourGroup441 = new BitSet(new long[]{0x0002000000040010L});
        public static final BitSet FOLLOW_18_in_ruleBehaviourGroup455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaClass_in_entryRuleMetaClass491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaClass501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleMetaClass538 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetaClass555 = new BitSet(new long[]{0x0000000000700000L});
        public static final BitSet FOLLOW_20_in_ruleMetaClass573 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetaClass590 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleMetaClass610 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMetaClass627 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMetaClass646 = new BitSet(new long[]{0x0000683000000000L});
        public static final BitSet FOLLOW_ruleShape_in_ruleMetaClass667 = new BitSet(new long[]{0x0000000001800002L});
        public static final BitSet FOLLOW_23_in_ruleMetaClass680 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMetaClass692 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_ruleMetaReference2_in_ruleMetaClass714 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMetaClass726 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_18_in_ruleMetaClass740 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleMetaClass755 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMetaClass767 = new BitSet(new long[]{0x0002000002040010L});
        public static final BitSet FOLLOW_25_in_ruleMetaClass781 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetaClass801 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMetaClass813 = new BitSet(new long[]{0x0002000002040010L});
        public static final BitSet FOLLOW_ruleBehaviour_in_ruleMetaClass842 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMetaClass854 = new BitSet(new long[]{0x0002000002040010L});
        public static final BitSet FOLLOW_18_in_ruleMetaClass869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviour_in_entryRuleBehaviour907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehaviour917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStandardBehaviour_in_ruleBehaviour964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomBehaviour_in_ruleBehaviour991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStandardBehaviour_in_entryRuleStandardBehaviour1026 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStandardBehaviour1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviourType_in_ruleStandardBehaviour1082 = new BitSet(new long[]{0x0000000004000022L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStandardBehaviour1099 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleStandardBehaviour1118 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStandardBehaviour1135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomBehaviour_in_entryRuleCustomBehaviour1178 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomBehaviour1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCustomBehaviour1230 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomBehaviour1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaReference2_in_entryRuleMetaReference21295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaReference21305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetaReference21347 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleMetaReference21364 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleConnection_in_ruleMetaReference21385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShape_in_entryRuleShape1421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShape1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRectangle_in_ruleShape1478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleShape1505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainer_in_ruleShape1532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_ruleShape1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLine_in_ruleShape1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout1621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout1631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleLayout1677 = new BitSet(new long[]{0x0000000FD0000000L});
        public static final BitSet FOLLOW_28_in_ruleLayout1735 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLayout1747 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleLayout1764 = new BitSet(new long[]{0x0000000FD0000000L});
        public static final BitSet FOLLOW_30_in_ruleLayout1837 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLayout1849 = new BitSet(new long[]{0xFFFC000000000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleColor_in_ruleLayout1870 = new BitSet(new long[]{0x0000000FD0000000L});
        public static final BitSet FOLLOW_31_in_ruleLayout1938 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLayout1950 = new BitSet(new long[]{0xFFFC000000000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleColor_in_ruleLayout1971 = new BitSet(new long[]{0x0000000FD0000000L});
        public static final BitSet FOLLOW_32_in_ruleLayout2039 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLayout2051 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLayout2068 = new BitSet(new long[]{0x0000000FD0000000L});
        public static final BitSet FOLLOW_33_in_ruleLayout2146 = new BitSet(new long[]{0x0000000FD0000000L});
        public static final BitSet FOLLOW_34_in_ruleLayout2231 = new BitSet(new long[]{0x0000000FD0000000L});
        public static final BitSet FOLLOW_35_in_ruleLayout2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRectangle_in_entryRuleRectangle2334 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRectangle2344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleRectangle2390 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleRectangle2411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection2447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnection2457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleConnection2503 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleConnection2524 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleConnection2537 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleConnection2549 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConnection2566 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConnection2583 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleConnection2595 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConnection2612 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConnection2629 = new BitSet(new long[]{0x0000070000040000L});
        public static final BitSet FOLLOW_40_in_ruleConnection2687 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleText_in_ruleConnection2708 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConnection2720 = new BitSet(new long[]{0x0000070000040000L});
        public static final BitSet FOLLOW_41_in_ruleConnection2788 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleText_in_ruleConnection2809 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConnection2821 = new BitSet(new long[]{0x0000070000040000L});
        public static final BitSet FOLLOW_42_in_ruleConnection2889 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleText_in_ruleConnection2910 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConnection2922 = new BitSet(new long[]{0x0000070000040000L});
        public static final BitSet FOLLOW_18_in_ruleConnection2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText3013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText3023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleText3069 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleText3090 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleSprayString_in_ruleText3111 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_ruleSprayString_in_entryRuleSprayString3148 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSprayString3158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaAttribute_in_ruleSprayString3205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_ruleSprayString3232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3267 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaAttribute_in_entryRuleMetaAttribute3358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaAttribute3368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMetaAttribute3413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3500 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleQualifiedName3519 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3534 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleLine_in_entryRuleLine3581 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLine3591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleLine3637 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleLine3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer3694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainer3704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleContainer3750 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleContainer3771 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContainer3783 = new BitSet(new long[]{0x0001E83000040000L});
        public static final BitSet FOLLOW_ruleSprayElement_in_ruleContainer3805 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleContainer3817 = new BitSet(new long[]{0x0001E83000040000L});
        public static final BitSet FOLLOW_18_in_ruleContainer3831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSprayElement_in_entryRuleSprayElement3867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSprayElement3877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShape_in_ruleSprayElement3924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaReferenceAsShape_in_ruleSprayElement3951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaAttributeAsShape_in_ruleSprayElement3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaReferenceAsShape_in_entryRuleMetaReferenceAsShape4013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaReferenceAsShape4023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleMetaReferenceAsShape4060 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetaReferenceAsShape4077 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleMetaReferenceAsShape4095 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetaReferenceAsShape4112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaAttributeAsShape_in_entryRuleMetaAttributeAsShape4155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaAttributeAsShape4165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleMetaAttributeAsShape4202 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMetaAttributeAsShape4219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleBehaviourType4273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleColor4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleColor4334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleColor4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleColor4368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleColor4385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleColor4402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleColor4419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleColor4436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleColor4453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleColor4470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleColor4487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleColor4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleColor4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleColor4538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleColor4555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleColor4572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleColor4589 = new BitSet(new long[]{0x0000000000000002L});
    }


}