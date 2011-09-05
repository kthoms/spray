package org.xspray.xtext.ui.contentassist.antlr.internal; 

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
import org.xspray.xtext.services.XsprayGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXsprayParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'black'", "'red'", "'green'", "'light_gray'", "'light_light_gray'", "'gray'", "'orange'", "'white'", "'yellow'", "'dark_blue'", "'vc_dark_blue'", "'cyan'", "'dark_green'", "'light_green'", "'light_blue'", "'medium_blue'", "'pink'", "'diagram'", "'metamodel'", "'metapackage'", "'extension'", "'behaviour'", "'['", "']'", "';'", "'class'", "':'", "'alias'", "'icon'", "'references'", "'behavior'", "'group'", "'palette'", "'('", "')'", "'width'", "'='", "'color'", "'fill'", "'figure'", "'rectangle'", "'connection'", "'from'", "'to'", "'fromText'", "'connectionText'", "'toText'", "'text'", "'.'", "'line'", "'container'", "'reference'", "'attribute'", "'bold'", "'italic'"
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
    public String getGrammarFileName() { return "../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g"; }


     
     	private XsprayGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XsprayGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDiagram"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:60:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:61:1: ( ruleDiagram EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:62:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDiagram_in_entryRuleDiagram61);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDiagram68); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:69:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:73:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:74:1: ( ( rule__Diagram__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:74:1: ( ( rule__Diagram__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:75:1: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:76:1: ( rule__Diagram__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:76:2: rule__Diagram__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__0_in_ruleDiagram94);
            rule__Diagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleBehaviourGroup"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:88:1: entryRuleBehaviourGroup : ruleBehaviourGroup EOF ;
    public final void entryRuleBehaviourGroup() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:89:1: ( ruleBehaviourGroup EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:90:1: ruleBehaviourGroup EOF
            {
             before(grammarAccess.getBehaviourGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviourGroup_in_entryRuleBehaviourGroup121);
            ruleBehaviourGroup();

            state._fsp--;

             after(grammarAccess.getBehaviourGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehaviourGroup128); 

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
    // $ANTLR end "entryRuleBehaviourGroup"


    // $ANTLR start "ruleBehaviourGroup"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:97:1: ruleBehaviourGroup : ( ( rule__BehaviourGroup__Group__0 ) ) ;
    public final void ruleBehaviourGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:101:2: ( ( ( rule__BehaviourGroup__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:102:1: ( ( rule__BehaviourGroup__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:102:1: ( ( rule__BehaviourGroup__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:103:1: ( rule__BehaviourGroup__Group__0 )
            {
             before(grammarAccess.getBehaviourGroupAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:104:1: ( rule__BehaviourGroup__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:104:2: rule__BehaviourGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__0_in_ruleBehaviourGroup154);
            rule__BehaviourGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviourGroup"


    // $ANTLR start "entryRuleMetaClass"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:116:1: entryRuleMetaClass : ruleMetaClass EOF ;
    public final void entryRuleMetaClass() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:117:1: ( ruleMetaClass EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:118:1: ruleMetaClass EOF
            {
             before(grammarAccess.getMetaClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaClass_in_entryRuleMetaClass181);
            ruleMetaClass();

            state._fsp--;

             after(grammarAccess.getMetaClassRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaClass188); 

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
    // $ANTLR end "entryRuleMetaClass"


    // $ANTLR start "ruleMetaClass"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:125:1: ruleMetaClass : ( ( rule__MetaClass__Group__0 ) ) ;
    public final void ruleMetaClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:129:2: ( ( ( rule__MetaClass__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:130:1: ( ( rule__MetaClass__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:130:1: ( ( rule__MetaClass__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:131:1: ( rule__MetaClass__Group__0 )
            {
             before(grammarAccess.getMetaClassAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:132:1: ( rule__MetaClass__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:132:2: rule__MetaClass__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__0_in_ruleMetaClass214);
            rule__MetaClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaClass"


    // $ANTLR start "entryRuleBehaviour"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:144:1: entryRuleBehaviour : ruleBehaviour EOF ;
    public final void entryRuleBehaviour() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:145:1: ( ruleBehaviour EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:146:1: ruleBehaviour EOF
            {
             before(grammarAccess.getBehaviourRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_entryRuleBehaviour241);
            ruleBehaviour();

            state._fsp--;

             after(grammarAccess.getBehaviourRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBehaviour248); 

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
    // $ANTLR end "entryRuleBehaviour"


    // $ANTLR start "ruleBehaviour"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:153:1: ruleBehaviour : ( ( rule__Behaviour__Alternatives ) ) ;
    public final void ruleBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:157:2: ( ( ( rule__Behaviour__Alternatives ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:158:1: ( ( rule__Behaviour__Alternatives ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:158:1: ( ( rule__Behaviour__Alternatives ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:159:1: ( rule__Behaviour__Alternatives )
            {
             before(grammarAccess.getBehaviourAccess().getAlternatives()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:160:1: ( rule__Behaviour__Alternatives )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:160:2: rule__Behaviour__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Behaviour__Alternatives_in_ruleBehaviour274);
            rule__Behaviour__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviour"


    // $ANTLR start "entryRuleStandardBehaviour"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:172:1: entryRuleStandardBehaviour : ruleStandardBehaviour EOF ;
    public final void entryRuleStandardBehaviour() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:173:1: ( ruleStandardBehaviour EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:174:1: ruleStandardBehaviour EOF
            {
             before(grammarAccess.getStandardBehaviourRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStandardBehaviour_in_entryRuleStandardBehaviour301);
            ruleStandardBehaviour();

            state._fsp--;

             after(grammarAccess.getStandardBehaviourRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStandardBehaviour308); 

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
    // $ANTLR end "entryRuleStandardBehaviour"


    // $ANTLR start "ruleStandardBehaviour"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:181:1: ruleStandardBehaviour : ( ( rule__StandardBehaviour__Group__0 ) ) ;
    public final void ruleStandardBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:185:2: ( ( ( rule__StandardBehaviour__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:186:1: ( ( rule__StandardBehaviour__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:186:1: ( ( rule__StandardBehaviour__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:187:1: ( rule__StandardBehaviour__Group__0 )
            {
             before(grammarAccess.getStandardBehaviourAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:188:1: ( rule__StandardBehaviour__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:188:2: rule__StandardBehaviour__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group__0_in_ruleStandardBehaviour334);
            rule__StandardBehaviour__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStandardBehaviourAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStandardBehaviour"


    // $ANTLR start "entryRuleCustomBehaviour"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:200:1: entryRuleCustomBehaviour : ruleCustomBehaviour EOF ;
    public final void entryRuleCustomBehaviour() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:201:1: ( ruleCustomBehaviour EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:202:1: ruleCustomBehaviour EOF
            {
             before(grammarAccess.getCustomBehaviourRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomBehaviour_in_entryRuleCustomBehaviour361);
            ruleCustomBehaviour();

            state._fsp--;

             after(grammarAccess.getCustomBehaviourRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomBehaviour368); 

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
    // $ANTLR end "entryRuleCustomBehaviour"


    // $ANTLR start "ruleCustomBehaviour"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:209:1: ruleCustomBehaviour : ( ( rule__CustomBehaviour__Group__0 ) ) ;
    public final void ruleCustomBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:213:2: ( ( ( rule__CustomBehaviour__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:214:1: ( ( rule__CustomBehaviour__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:214:1: ( ( rule__CustomBehaviour__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:215:1: ( rule__CustomBehaviour__Group__0 )
            {
             before(grammarAccess.getCustomBehaviourAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:216:1: ( rule__CustomBehaviour__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:216:2: rule__CustomBehaviour__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomBehaviour__Group__0_in_ruleCustomBehaviour394);
            rule__CustomBehaviour__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomBehaviourAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomBehaviour"


    // $ANTLR start "entryRuleMetaReference2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:230:1: entryRuleMetaReference2 : ruleMetaReference2 EOF ;
    public final void entryRuleMetaReference2() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:231:1: ( ruleMetaReference2 EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:232:1: ruleMetaReference2 EOF
            {
             before(grammarAccess.getMetaReference2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaReference2_in_entryRuleMetaReference2423);
            ruleMetaReference2();

            state._fsp--;

             after(grammarAccess.getMetaReference2Rule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaReference2430); 

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
    // $ANTLR end "entryRuleMetaReference2"


    // $ANTLR start "ruleMetaReference2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:239:1: ruleMetaReference2 : ( ( rule__MetaReference2__Group__0 ) ) ;
    public final void ruleMetaReference2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:243:2: ( ( ( rule__MetaReference2__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:244:1: ( ( rule__MetaReference2__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:244:1: ( ( rule__MetaReference2__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:245:1: ( rule__MetaReference2__Group__0 )
            {
             before(grammarAccess.getMetaReference2Access().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:246:1: ( rule__MetaReference2__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:246:2: rule__MetaReference2__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReference2__Group__0_in_ruleMetaReference2456);
            rule__MetaReference2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaReference2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaReference2"


    // $ANTLR start "entryRuleShape"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:258:1: entryRuleShape : ruleShape EOF ;
    public final void entryRuleShape() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:259:1: ( ruleShape EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:260:1: ruleShape EOF
            {
             before(grammarAccess.getShapeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShape_in_entryRuleShape483);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getShapeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShape490); 

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
    // $ANTLR end "entryRuleShape"


    // $ANTLR start "ruleShape"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:267:1: ruleShape : ( ( rule__Shape__Alternatives ) ) ;
    public final void ruleShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:271:2: ( ( ( rule__Shape__Alternatives ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:272:1: ( ( rule__Shape__Alternatives ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:272:1: ( ( rule__Shape__Alternatives ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:273:1: ( rule__Shape__Alternatives )
            {
             before(grammarAccess.getShapeAccess().getAlternatives()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:274:1: ( rule__Shape__Alternatives )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:274:2: rule__Shape__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Shape__Alternatives_in_ruleShape516);
            rule__Shape__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getShapeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShape"


    // $ANTLR start "entryRuleLayout"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:286:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:287:1: ( ruleLayout EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:288:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout543);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout550); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:295:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:299:2: ( ( ( rule__Layout__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:300:1: ( ( rule__Layout__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:300:1: ( ( rule__Layout__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:301:1: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:302:1: ( rule__Layout__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:302:2: rule__Layout__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0_in_ruleLayout576);
            rule__Layout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleRectangle"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:316:1: entryRuleRectangle : ruleRectangle EOF ;
    public final void entryRuleRectangle() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:317:1: ( ruleRectangle EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:318:1: ruleRectangle EOF
            {
             before(grammarAccess.getRectangleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRectangle_in_entryRuleRectangle605);
            ruleRectangle();

            state._fsp--;

             after(grammarAccess.getRectangleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRectangle612); 

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
    // $ANTLR end "entryRuleRectangle"


    // $ANTLR start "ruleRectangle"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:325:1: ruleRectangle : ( ( rule__Rectangle__Group__0 ) ) ;
    public final void ruleRectangle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:329:2: ( ( ( rule__Rectangle__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:330:1: ( ( rule__Rectangle__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:330:1: ( ( rule__Rectangle__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:331:1: ( rule__Rectangle__Group__0 )
            {
             before(grammarAccess.getRectangleAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:332:1: ( rule__Rectangle__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:332:2: rule__Rectangle__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rectangle__Group__0_in_ruleRectangle638);
            rule__Rectangle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRectangle"


    // $ANTLR start "entryRuleConnection"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:344:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:345:1: ( ruleConnection EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:346:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_entryRuleConnection665);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConnection672); 

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:353:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:357:2: ( ( ( rule__Connection__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:358:1: ( ( rule__Connection__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:358:1: ( ( rule__Connection__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:359:1: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:360:1: ( rule__Connection__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:360:2: rule__Connection__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__0_in_ruleConnection698);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleText"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:372:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:373:1: ( ruleText EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:374:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText725);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText732); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:381:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:385:2: ( ( ( rule__Text__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:386:1: ( ( rule__Text__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:386:1: ( ( rule__Text__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:387:1: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:388:1: ( rule__Text__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:388:2: rule__Text__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__0_in_ruleText758);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleSprayString"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:400:1: entryRuleSprayString : ruleSprayString EOF ;
    public final void entryRuleSprayString() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:401:1: ( ruleSprayString EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:402:1: ruleSprayString EOF
            {
             before(grammarAccess.getSprayStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSprayString_in_entryRuleSprayString785);
            ruleSprayString();

            state._fsp--;

             after(grammarAccess.getSprayStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSprayString792); 

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
    // $ANTLR end "entryRuleSprayString"


    // $ANTLR start "ruleSprayString"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:409:1: ruleSprayString : ( ( rule__SprayString__Alternatives ) ) ;
    public final void ruleSprayString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:413:2: ( ( ( rule__SprayString__Alternatives ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:414:1: ( ( rule__SprayString__Alternatives ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:414:1: ( ( rule__SprayString__Alternatives ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:415:1: ( rule__SprayString__Alternatives )
            {
             before(grammarAccess.getSprayStringAccess().getAlternatives()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:416:1: ( rule__SprayString__Alternatives )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:416:2: rule__SprayString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SprayString__Alternatives_in_ruleSprayString818);
            rule__SprayString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSprayStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSprayString"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:428:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:429:1: ( ruleStringLiteral EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:430:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral845);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringLiteral852); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:437:1: ruleStringLiteral : ( ( rule__StringLiteral__NameAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:441:2: ( ( ( rule__StringLiteral__NameAssignment ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:442:1: ( ( rule__StringLiteral__NameAssignment ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:442:1: ( ( rule__StringLiteral__NameAssignment ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:443:1: ( rule__StringLiteral__NameAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getNameAssignment()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:444:1: ( rule__StringLiteral__NameAssignment )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:444:2: rule__StringLiteral__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__StringLiteral__NameAssignment_in_ruleStringLiteral878);
            rule__StringLiteral__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleMetaAttribute"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:456:1: entryRuleMetaAttribute : ruleMetaAttribute EOF ;
    public final void entryRuleMetaAttribute() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:457:1: ( ruleMetaAttribute EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:458:1: ruleMetaAttribute EOF
            {
             before(grammarAccess.getMetaAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaAttribute_in_entryRuleMetaAttribute905);
            ruleMetaAttribute();

            state._fsp--;

             after(grammarAccess.getMetaAttributeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaAttribute912); 

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
    // $ANTLR end "entryRuleMetaAttribute"


    // $ANTLR start "ruleMetaAttribute"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:465:1: ruleMetaAttribute : ( ( rule__MetaAttribute__NameAssignment ) ) ;
    public final void ruleMetaAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:469:2: ( ( ( rule__MetaAttribute__NameAssignment ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:470:1: ( ( rule__MetaAttribute__NameAssignment ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:470:1: ( ( rule__MetaAttribute__NameAssignment ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:471:1: ( rule__MetaAttribute__NameAssignment )
            {
             before(grammarAccess.getMetaAttributeAccess().getNameAssignment()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:472:1: ( rule__MetaAttribute__NameAssignment )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:472:2: rule__MetaAttribute__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaAttribute__NameAssignment_in_ruleMetaAttribute938);
            rule__MetaAttribute__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMetaAttributeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:484:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:485:1: ( ruleQualifiedName EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:486:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName965);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName972); 

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
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:493:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:497:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:498:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:498:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:499:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:500:1: ( rule__QualifiedName__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:500:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName998);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLine"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:512:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:513:1: ( ruleLine EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:514:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLine_in_entryRuleLine1025);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLine1032); 

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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:521:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:525:2: ( ( ( rule__Line__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:526:1: ( ( rule__Line__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:526:1: ( ( rule__Line__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:527:1: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:528:1: ( rule__Line__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:528:2: rule__Line__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Line__Group__0_in_ruleLine1058);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleContainer"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:540:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:541:1: ( ruleContainer EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:542:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_entryRuleContainer1085);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainer1092); 

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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:549:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:553:2: ( ( ( rule__Container__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:554:1: ( ( rule__Container__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:554:1: ( ( rule__Container__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:555:1: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:556:1: ( rule__Container__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:556:2: rule__Container__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__0_in_ruleContainer1118);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleSprayElement"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:568:1: entryRuleSprayElement : ruleSprayElement EOF ;
    public final void entryRuleSprayElement() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:569:1: ( ruleSprayElement EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:570:1: ruleSprayElement EOF
            {
             before(grammarAccess.getSprayElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSprayElement_in_entryRuleSprayElement1145);
            ruleSprayElement();

            state._fsp--;

             after(grammarAccess.getSprayElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSprayElement1152); 

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
    // $ANTLR end "entryRuleSprayElement"


    // $ANTLR start "ruleSprayElement"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:577:1: ruleSprayElement : ( ( rule__SprayElement__Alternatives ) ) ;
    public final void ruleSprayElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:581:2: ( ( ( rule__SprayElement__Alternatives ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:582:1: ( ( rule__SprayElement__Alternatives ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:582:1: ( ( rule__SprayElement__Alternatives ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:583:1: ( rule__SprayElement__Alternatives )
            {
             before(grammarAccess.getSprayElementAccess().getAlternatives()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:584:1: ( rule__SprayElement__Alternatives )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:584:2: rule__SprayElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SprayElement__Alternatives_in_ruleSprayElement1178);
            rule__SprayElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSprayElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSprayElement"


    // $ANTLR start "entryRuleMetaReferenceAsShape"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:596:1: entryRuleMetaReferenceAsShape : ruleMetaReferenceAsShape EOF ;
    public final void entryRuleMetaReferenceAsShape() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:597:1: ( ruleMetaReferenceAsShape EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:598:1: ruleMetaReferenceAsShape EOF
            {
             before(grammarAccess.getMetaReferenceAsShapeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaReferenceAsShape_in_entryRuleMetaReferenceAsShape1205);
            ruleMetaReferenceAsShape();

            state._fsp--;

             after(grammarAccess.getMetaReferenceAsShapeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaReferenceAsShape1212); 

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
    // $ANTLR end "entryRuleMetaReferenceAsShape"


    // $ANTLR start "ruleMetaReferenceAsShape"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:605:1: ruleMetaReferenceAsShape : ( ( rule__MetaReferenceAsShape__Group__0 ) ) ;
    public final void ruleMetaReferenceAsShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:609:2: ( ( ( rule__MetaReferenceAsShape__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:610:1: ( ( rule__MetaReferenceAsShape__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:610:1: ( ( rule__MetaReferenceAsShape__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:611:1: ( rule__MetaReferenceAsShape__Group__0 )
            {
             before(grammarAccess.getMetaReferenceAsShapeAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:612:1: ( rule__MetaReferenceAsShape__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:612:2: rule__MetaReferenceAsShape__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group__0_in_ruleMetaReferenceAsShape1238);
            rule__MetaReferenceAsShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaReferenceAsShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaReferenceAsShape"


    // $ANTLR start "entryRuleMetaAttributeAsShape"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:624:1: entryRuleMetaAttributeAsShape : ruleMetaAttributeAsShape EOF ;
    public final void entryRuleMetaAttributeAsShape() throws RecognitionException {
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:625:1: ( ruleMetaAttributeAsShape EOF )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:626:1: ruleMetaAttributeAsShape EOF
            {
             before(grammarAccess.getMetaAttributeAsShapeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaAttributeAsShape_in_entryRuleMetaAttributeAsShape1265);
            ruleMetaAttributeAsShape();

            state._fsp--;

             after(grammarAccess.getMetaAttributeAsShapeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMetaAttributeAsShape1272); 

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
    // $ANTLR end "entryRuleMetaAttributeAsShape"


    // $ANTLR start "ruleMetaAttributeAsShape"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:633:1: ruleMetaAttributeAsShape : ( ( rule__MetaAttributeAsShape__Group__0 ) ) ;
    public final void ruleMetaAttributeAsShape() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:637:2: ( ( ( rule__MetaAttributeAsShape__Group__0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:638:1: ( ( rule__MetaAttributeAsShape__Group__0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:638:1: ( ( rule__MetaAttributeAsShape__Group__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:639:1: ( rule__MetaAttributeAsShape__Group__0 )
            {
             before(grammarAccess.getMetaAttributeAsShapeAccess().getGroup()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:640:1: ( rule__MetaAttributeAsShape__Group__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:640:2: rule__MetaAttributeAsShape__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaAttributeAsShape__Group__0_in_ruleMetaAttributeAsShape1298);
            rule__MetaAttributeAsShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaAttributeAsShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaAttributeAsShape"


    // $ANTLR start "ruleBehaviourType"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:653:1: ruleBehaviourType : ( ( 'create' ) ) ;
    public final void ruleBehaviourType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:657:1: ( ( ( 'create' ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:658:1: ( ( 'create' ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:658:1: ( ( 'create' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:659:1: ( 'create' )
            {
             before(grammarAccess.getBehaviourTypeAccess().getCREATE_BEHAVIOUREnumLiteralDeclaration()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:660:1: ( 'create' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:660:3: 'create'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleBehaviourType1336); 

            }

             after(grammarAccess.getBehaviourTypeAccess().getCREATE_BEHAVIOUREnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehaviourType"


    // $ANTLR start "ruleColor"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:673:1: ruleColor : ( ( rule__Color__Alternatives ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:677:1: ( ( ( rule__Color__Alternatives ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:678:1: ( ( rule__Color__Alternatives ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:678:1: ( ( rule__Color__Alternatives ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:679:1: ( rule__Color__Alternatives )
            {
             before(grammarAccess.getColorAccess().getAlternatives()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:680:1: ( rule__Color__Alternatives )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:680:2: rule__Color__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Color__Alternatives_in_ruleColor1374);
            rule__Color__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "rule__MetaClass__Alternatives_7_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:691:1: rule__MetaClass__Alternatives_7_2 : ( ( ( rule__MetaClass__Group_7_2_0__0 ) ) | ( ( rule__MetaClass__Group_7_2_1__0 ) ) );
    public final void rule__MetaClass__Alternatives_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:695:1: ( ( ( rule__MetaClass__Group_7_2_0__0 ) ) | ( ( rule__MetaClass__Group_7_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==43) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:696:1: ( ( rule__MetaClass__Group_7_2_0__0 ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:696:1: ( ( rule__MetaClass__Group_7_2_0__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:697:1: ( rule__MetaClass__Group_7_2_0__0 )
                    {
                     before(grammarAccess.getMetaClassAccess().getGroup_7_2_0()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:698:1: ( rule__MetaClass__Group_7_2_0__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:698:2: rule__MetaClass__Group_7_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_0__0_in_rule__MetaClass__Alternatives_7_21409);
                    rule__MetaClass__Group_7_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetaClassAccess().getGroup_7_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:702:6: ( ( rule__MetaClass__Group_7_2_1__0 ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:702:6: ( ( rule__MetaClass__Group_7_2_1__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:703:1: ( rule__MetaClass__Group_7_2_1__0 )
                    {
                     before(grammarAccess.getMetaClassAccess().getGroup_7_2_1()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:704:1: ( rule__MetaClass__Group_7_2_1__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:704:2: rule__MetaClass__Group_7_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_1__0_in_rule__MetaClass__Alternatives_7_21427);
                    rule__MetaClass__Group_7_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMetaClassAccess().getGroup_7_2_1()); 

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
    // $ANTLR end "rule__MetaClass__Alternatives_7_2"


    // $ANTLR start "rule__Behaviour__Alternatives"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:713:1: rule__Behaviour__Alternatives : ( ( ruleStandardBehaviour ) | ( ruleCustomBehaviour ) );
    public final void rule__Behaviour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:717:1: ( ( ruleStandardBehaviour ) | ( ruleCustomBehaviour ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:718:1: ( ruleStandardBehaviour )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:718:1: ( ruleStandardBehaviour )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:719:1: ruleStandardBehaviour
                    {
                     before(grammarAccess.getBehaviourAccess().getStandardBehaviourParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStandardBehaviour_in_rule__Behaviour__Alternatives1460);
                    ruleStandardBehaviour();

                    state._fsp--;

                     after(grammarAccess.getBehaviourAccess().getStandardBehaviourParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:724:6: ( ruleCustomBehaviour )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:724:6: ( ruleCustomBehaviour )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:725:1: ruleCustomBehaviour
                    {
                     before(grammarAccess.getBehaviourAccess().getCustomBehaviourParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleCustomBehaviour_in_rule__Behaviour__Alternatives1477);
                    ruleCustomBehaviour();

                    state._fsp--;

                     after(grammarAccess.getBehaviourAccess().getCustomBehaviourParserRuleCall_1()); 

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
    // $ANTLR end "rule__Behaviour__Alternatives"


    // $ANTLR start "rule__Shape__Alternatives"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:735:1: rule__Shape__Alternatives : ( ( ruleRectangle ) | ( ruleText ) | ( ruleContainer ) | ( ruleConnection ) | ( ruleLine ) );
    public final void rule__Shape__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:739:1: ( ( ruleRectangle ) | ( ruleText ) | ( ruleContainer ) | ( ruleConnection ) | ( ruleLine ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt3=1;
                }
                break;
            case 59:
                {
                alt3=2;
                }
                break;
            case 62:
                {
                alt3=3;
                }
                break;
            case 53:
                {
                alt3=4;
                }
                break;
            case 61:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:740:1: ( ruleRectangle )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:740:1: ( ruleRectangle )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:741:1: ruleRectangle
                    {
                     before(grammarAccess.getShapeAccess().getRectangleParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRectangle_in_rule__Shape__Alternatives1509);
                    ruleRectangle();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getRectangleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:746:6: ( ruleText )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:746:6: ( ruleText )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:747:1: ruleText
                    {
                     before(grammarAccess.getShapeAccess().getTextParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_rule__Shape__Alternatives1526);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getTextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:752:6: ( ruleContainer )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:752:6: ( ruleContainer )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:753:1: ruleContainer
                    {
                     before(grammarAccess.getShapeAccess().getContainerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleContainer_in_rule__Shape__Alternatives1543);
                    ruleContainer();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getContainerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:758:6: ( ruleConnection )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:758:6: ( ruleConnection )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:759:1: ruleConnection
                    {
                     before(grammarAccess.getShapeAccess().getConnectionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleConnection_in_rule__Shape__Alternatives1560);
                    ruleConnection();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getConnectionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:764:6: ( ruleLine )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:764:6: ( ruleLine )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:765:1: ruleLine
                    {
                     before(grammarAccess.getShapeAccess().getLineParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLine_in_rule__Shape__Alternatives1577);
                    ruleLine();

                    state._fsp--;

                     after(grammarAccess.getShapeAccess().getLineParserRuleCall_4()); 

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
    // $ANTLR end "rule__Shape__Alternatives"


    // $ANTLR start "rule__SprayString__Alternatives"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:776:1: rule__SprayString__Alternatives : ( ( ruleMetaAttribute ) | ( ruleStringLiteral ) );
    public final void rule__SprayString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:780:1: ( ( ruleMetaAttribute ) | ( ruleStringLiteral ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:781:1: ( ruleMetaAttribute )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:781:1: ( ruleMetaAttribute )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:782:1: ruleMetaAttribute
                    {
                     before(grammarAccess.getSprayStringAccess().getMetaAttributeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMetaAttribute_in_rule__SprayString__Alternatives1610);
                    ruleMetaAttribute();

                    state._fsp--;

                     after(grammarAccess.getSprayStringAccess().getMetaAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:787:6: ( ruleStringLiteral )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:787:6: ( ruleStringLiteral )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:788:1: ruleStringLiteral
                    {
                     before(grammarAccess.getSprayStringAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStringLiteral_in_rule__SprayString__Alternatives1627);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getSprayStringAccess().getStringLiteralParserRuleCall_1()); 

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
    // $ANTLR end "rule__SprayString__Alternatives"


    // $ANTLR start "rule__SprayElement__Alternatives"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:798:1: rule__SprayElement__Alternatives : ( ( ruleShape ) | ( ruleMetaReferenceAsShape ) | ( ruleMetaAttributeAsShape ) );
    public final void rule__SprayElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:802:1: ( ( ruleShape ) | ( ruleMetaReferenceAsShape ) | ( ruleMetaAttributeAsShape ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
                {
                alt5=1;
                }
                break;
            case 63:
                {
                alt5=2;
                }
                break;
            case 64:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:803:1: ( ruleShape )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:803:1: ( ruleShape )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:804:1: ruleShape
                    {
                     before(grammarAccess.getSprayElementAccess().getShapeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleShape_in_rule__SprayElement__Alternatives1659);
                    ruleShape();

                    state._fsp--;

                     after(grammarAccess.getSprayElementAccess().getShapeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:809:6: ( ruleMetaReferenceAsShape )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:809:6: ( ruleMetaReferenceAsShape )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:810:1: ruleMetaReferenceAsShape
                    {
                     before(grammarAccess.getSprayElementAccess().getMetaReferenceAsShapeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMetaReferenceAsShape_in_rule__SprayElement__Alternatives1676);
                    ruleMetaReferenceAsShape();

                    state._fsp--;

                     after(grammarAccess.getSprayElementAccess().getMetaReferenceAsShapeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:815:6: ( ruleMetaAttributeAsShape )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:815:6: ( ruleMetaAttributeAsShape )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:816:1: ruleMetaAttributeAsShape
                    {
                     before(grammarAccess.getSprayElementAccess().getMetaAttributeAsShapeParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMetaAttributeAsShape_in_rule__SprayElement__Alternatives1693);
                    ruleMetaAttributeAsShape();

                    state._fsp--;

                     after(grammarAccess.getSprayElementAccess().getMetaAttributeAsShapeParserRuleCall_2()); 

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
    // $ANTLR end "rule__SprayElement__Alternatives"


    // $ANTLR start "rule__Color__Alternatives"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:826:1: rule__Color__Alternatives : ( ( ( 'black' ) ) | ( ( 'red' ) ) | ( ( 'green' ) ) | ( ( 'light_gray' ) ) | ( ( 'light_light_gray' ) ) | ( ( 'gray' ) ) | ( ( 'orange' ) ) | ( ( 'white' ) ) | ( ( 'yellow' ) ) | ( ( 'dark_blue' ) ) | ( ( 'vc_dark_blue' ) ) | ( ( 'cyan' ) ) | ( ( 'dark_green' ) ) | ( ( 'light_green' ) ) | ( ( 'light_blue' ) ) | ( ( 'medium_blue' ) ) | ( ( 'pink' ) ) );
    public final void rule__Color__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:830:1: ( ( ( 'black' ) ) | ( ( 'red' ) ) | ( ( 'green' ) ) | ( ( 'light_gray' ) ) | ( ( 'light_light_gray' ) ) | ( ( 'gray' ) ) | ( ( 'orange' ) ) | ( ( 'white' ) ) | ( ( 'yellow' ) ) | ( ( 'dark_blue' ) ) | ( ( 'vc_dark_blue' ) ) | ( ( 'cyan' ) ) | ( ( 'dark_green' ) ) | ( ( 'light_green' ) ) | ( ( 'light_blue' ) ) | ( ( 'medium_blue' ) ) | ( ( 'pink' ) ) )
            int alt6=17;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 16:
                {
                alt6=5;
                }
                break;
            case 17:
                {
                alt6=6;
                }
                break;
            case 18:
                {
                alt6=7;
                }
                break;
            case 19:
                {
                alt6=8;
                }
                break;
            case 20:
                {
                alt6=9;
                }
                break;
            case 21:
                {
                alt6=10;
                }
                break;
            case 22:
                {
                alt6=11;
                }
                break;
            case 23:
                {
                alt6=12;
                }
                break;
            case 24:
                {
                alt6=13;
                }
                break;
            case 25:
                {
                alt6=14;
                }
                break;
            case 26:
                {
                alt6=15;
                }
                break;
            case 27:
                {
                alt6=16;
                }
                break;
            case 28:
                {
                alt6=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:831:1: ( ( 'black' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:831:1: ( ( 'black' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:832:1: ( 'black' )
                    {
                     before(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_0()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:833:1: ( 'black' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:833:3: 'black'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Color__Alternatives1726); 

                    }

                     after(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:838:6: ( ( 'red' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:838:6: ( ( 'red' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:839:1: ( 'red' )
                    {
                     before(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_1()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:840:1: ( 'red' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:840:3: 'red'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Color__Alternatives1747); 

                    }

                     after(grammarAccess.getColorAccess().getREDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:845:6: ( ( 'green' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:845:6: ( ( 'green' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:846:1: ( 'green' )
                    {
                     before(grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_2()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:847:1: ( 'green' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:847:3: 'green'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Color__Alternatives1768); 

                    }

                     after(grammarAccess.getColorAccess().getGREENEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:852:6: ( ( 'light_gray' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:852:6: ( ( 'light_gray' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:853:1: ( 'light_gray' )
                    {
                     before(grammarAccess.getColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_3()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:854:1: ( 'light_gray' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:854:3: 'light_gray'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Color__Alternatives1789); 

                    }

                     after(grammarAccess.getColorAccess().getLIGHT_GRAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:859:6: ( ( 'light_light_gray' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:859:6: ( ( 'light_light_gray' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:860:1: ( 'light_light_gray' )
                    {
                     before(grammarAccess.getColorAccess().getLIGHT_LIGHT_GRAYEnumLiteralDeclaration_4()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:861:1: ( 'light_light_gray' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:861:3: 'light_light_gray'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__Color__Alternatives1810); 

                    }

                     after(grammarAccess.getColorAccess().getLIGHT_LIGHT_GRAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:866:6: ( ( 'gray' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:866:6: ( ( 'gray' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:867:1: ( 'gray' )
                    {
                     before(grammarAccess.getColorAccess().getGRAYEnumLiteralDeclaration_5()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:868:1: ( 'gray' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:868:3: 'gray'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__Color__Alternatives1831); 

                    }

                     after(grammarAccess.getColorAccess().getGRAYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:873:6: ( ( 'orange' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:873:6: ( ( 'orange' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:874:1: ( 'orange' )
                    {
                     before(grammarAccess.getColorAccess().getORANGEEnumLiteralDeclaration_6()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:875:1: ( 'orange' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:875:3: 'orange'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__Color__Alternatives1852); 

                    }

                     after(grammarAccess.getColorAccess().getORANGEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:880:6: ( ( 'white' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:880:6: ( ( 'white' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:881:1: ( 'white' )
                    {
                     before(grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_7()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:882:1: ( 'white' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:882:3: 'white'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__Color__Alternatives1873); 

                    }

                     after(grammarAccess.getColorAccess().getWHITEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:887:6: ( ( 'yellow' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:887:6: ( ( 'yellow' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:888:1: ( 'yellow' )
                    {
                     before(grammarAccess.getColorAccess().getYELLOWEnumLiteralDeclaration_8()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:889:1: ( 'yellow' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:889:3: 'yellow'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Color__Alternatives1894); 

                    }

                     after(grammarAccess.getColorAccess().getYELLOWEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:894:6: ( ( 'dark_blue' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:894:6: ( ( 'dark_blue' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:895:1: ( 'dark_blue' )
                    {
                     before(grammarAccess.getColorAccess().getDARK_BLUEEnumLiteralDeclaration_9()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:896:1: ( 'dark_blue' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:896:3: 'dark_blue'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Color__Alternatives1915); 

                    }

                     after(grammarAccess.getColorAccess().getDARK_BLUEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:901:6: ( ( 'vc_dark_blue' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:901:6: ( ( 'vc_dark_blue' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:902:1: ( 'vc_dark_blue' )
                    {
                     before(grammarAccess.getColorAccess().getVC_DARK_BLUEEnumLiteralDeclaration_10()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:903:1: ( 'vc_dark_blue' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:903:3: 'vc_dark_blue'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Color__Alternatives1936); 

                    }

                     after(grammarAccess.getColorAccess().getVC_DARK_BLUEEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:908:6: ( ( 'cyan' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:908:6: ( ( 'cyan' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:909:1: ( 'cyan' )
                    {
                     before(grammarAccess.getColorAccess().getCYANEnumLiteralDeclaration_11()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:910:1: ( 'cyan' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:910:3: 'cyan'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Color__Alternatives1957); 

                    }

                     after(grammarAccess.getColorAccess().getCYANEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:915:6: ( ( 'dark_green' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:915:6: ( ( 'dark_green' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:916:1: ( 'dark_green' )
                    {
                     before(grammarAccess.getColorAccess().getDARK_GREENEnumLiteralDeclaration_12()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:917:1: ( 'dark_green' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:917:3: 'dark_green'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__Color__Alternatives1978); 

                    }

                     after(grammarAccess.getColorAccess().getDARK_GREENEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:922:6: ( ( 'light_green' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:922:6: ( ( 'light_green' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:923:1: ( 'light_green' )
                    {
                     before(grammarAccess.getColorAccess().getLIGHT_GREENEnumLiteralDeclaration_13()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:924:1: ( 'light_green' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:924:3: 'light_green'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__Color__Alternatives1999); 

                    }

                     after(grammarAccess.getColorAccess().getLIGHT_GREENEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:929:6: ( ( 'light_blue' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:929:6: ( ( 'light_blue' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:930:1: ( 'light_blue' )
                    {
                     before(grammarAccess.getColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_14()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:931:1: ( 'light_blue' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:931:3: 'light_blue'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__Color__Alternatives2020); 

                    }

                     after(grammarAccess.getColorAccess().getLIGHT_BLUEEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:936:6: ( ( 'medium_blue' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:936:6: ( ( 'medium_blue' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:937:1: ( 'medium_blue' )
                    {
                     before(grammarAccess.getColorAccess().getVC_MEDIUM_BLUEEnumLiteralDeclaration_15()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:938:1: ( 'medium_blue' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:938:3: 'medium_blue'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Color__Alternatives2041); 

                    }

                     after(grammarAccess.getColorAccess().getVC_MEDIUM_BLUEEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:943:6: ( ( 'pink' ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:943:6: ( ( 'pink' ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:944:1: ( 'pink' )
                    {
                     before(grammarAccess.getColorAccess().getPINKEnumLiteralDeclaration_16()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:945:1: ( 'pink' )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:945:3: 'pink'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__Color__Alternatives2062); 

                    }

                     after(grammarAccess.getColorAccess().getPINKEnumLiteralDeclaration_16()); 

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
    // $ANTLR end "rule__Color__Alternatives"


    // $ANTLR start "rule__Diagram__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:957:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:961:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:962:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__02095);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__02098);
            rule__Diagram__Group__1();

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
    // $ANTLR end "rule__Diagram__Group__0"


    // $ANTLR start "rule__Diagram__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:969:1: rule__Diagram__Group__0__Impl : ( 'diagram' ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:973:1: ( ( 'diagram' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:974:1: ( 'diagram' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:974:1: ( 'diagram' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:975:1: 'diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Diagram__Group__0__Impl2126); 
             after(grammarAccess.getDiagramAccess().getDiagramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:988:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:992:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:993:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__12157);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__12160);
            rule__Diagram__Group__2();

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
    // $ANTLR end "rule__Diagram__Group__1"


    // $ANTLR start "rule__Diagram__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1000:1: rule__Diagram__Group__1__Impl : ( ( rule__Diagram__NameAssignment_1 ) ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1004:1: ( ( ( rule__Diagram__NameAssignment_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1005:1: ( ( rule__Diagram__NameAssignment_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1005:1: ( ( rule__Diagram__NameAssignment_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1006:1: ( rule__Diagram__NameAssignment_1 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1007:1: ( rule__Diagram__NameAssignment_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1007:2: rule__Diagram__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__NameAssignment_1_in_rule__Diagram__Group__1__Impl2187);
            rule__Diagram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1017:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1021:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1022:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__22217);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__22220);
            rule__Diagram__Group__3();

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
    // $ANTLR end "rule__Diagram__Group__2"


    // $ANTLR start "rule__Diagram__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1029:1: rule__Diagram__Group__2__Impl : ( 'metamodel' ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1033:1: ( ( 'metamodel' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1034:1: ( 'metamodel' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1034:1: ( 'metamodel' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1035:1: 'metamodel'
            {
             before(grammarAccess.getDiagramAccess().getMetamodelKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Diagram__Group__2__Impl2248); 
             after(grammarAccess.getDiagramAccess().getMetamodelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__Diagram__Group__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1048:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1052:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1053:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__32279);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__32282);
            rule__Diagram__Group__4();

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
    // $ANTLR end "rule__Diagram__Group__3"


    // $ANTLR start "rule__Diagram__Group__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1060:1: rule__Diagram__Group__3__Impl : ( ( rule__Diagram__Import1Assignment_3 ) ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1064:1: ( ( ( rule__Diagram__Import1Assignment_3 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1065:1: ( ( rule__Diagram__Import1Assignment_3 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1065:1: ( ( rule__Diagram__Import1Assignment_3 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1066:1: ( rule__Diagram__Import1Assignment_3 )
            {
             before(grammarAccess.getDiagramAccess().getImport1Assignment_3()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1067:1: ( rule__Diagram__Import1Assignment_3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1067:2: rule__Diagram__Import1Assignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Import1Assignment_3_in_rule__Diagram__Group__3__Impl2309);
            rule__Diagram__Import1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getImport1Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__3__Impl"


    // $ANTLR start "rule__Diagram__Group__4"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1077:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1081:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1082:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__42339);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__42342);
            rule__Diagram__Group__5();

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
    // $ANTLR end "rule__Diagram__Group__4"


    // $ANTLR start "rule__Diagram__Group__4__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1089:1: rule__Diagram__Group__4__Impl : ( 'metapackage' ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1093:1: ( ( 'metapackage' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1094:1: ( 'metapackage' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1094:1: ( 'metapackage' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1095:1: 'metapackage'
            {
             before(grammarAccess.getDiagramAccess().getMetapackageKeyword_4()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Diagram__Group__4__Impl2370); 
             after(grammarAccess.getDiagramAccess().getMetapackageKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__4__Impl"


    // $ANTLR start "rule__Diagram__Group__5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1108:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl rule__Diagram__Group__6 ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1112:1: ( rule__Diagram__Group__5__Impl rule__Diagram__Group__6 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1113:2: rule__Diagram__Group__5__Impl rule__Diagram__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__52401);
            rule__Diagram__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__6_in_rule__Diagram__Group__52404);
            rule__Diagram__Group__6();

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
    // $ANTLR end "rule__Diagram__Group__5"


    // $ANTLR start "rule__Diagram__Group__5__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1120:1: rule__Diagram__Group__5__Impl : ( ( rule__Diagram__ImportPackageAssignment_5 ) ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1124:1: ( ( ( rule__Diagram__ImportPackageAssignment_5 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1125:1: ( ( rule__Diagram__ImportPackageAssignment_5 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1125:1: ( ( rule__Diagram__ImportPackageAssignment_5 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1126:1: ( rule__Diagram__ImportPackageAssignment_5 )
            {
             before(grammarAccess.getDiagramAccess().getImportPackageAssignment_5()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1127:1: ( rule__Diagram__ImportPackageAssignment_5 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1127:2: rule__Diagram__ImportPackageAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__ImportPackageAssignment_5_in_rule__Diagram__Group__5__Impl2431);
            rule__Diagram__ImportPackageAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getImportPackageAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__5__Impl"


    // $ANTLR start "rule__Diagram__Group__6"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1137:1: rule__Diagram__Group__6 : rule__Diagram__Group__6__Impl rule__Diagram__Group__7 ;
    public final void rule__Diagram__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1141:1: ( rule__Diagram__Group__6__Impl rule__Diagram__Group__7 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1142:2: rule__Diagram__Group__6__Impl rule__Diagram__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__6__Impl_in_rule__Diagram__Group__62461);
            rule__Diagram__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__7_in_rule__Diagram__Group__62464);
            rule__Diagram__Group__7();

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
    // $ANTLR end "rule__Diagram__Group__6"


    // $ANTLR start "rule__Diagram__Group__6__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1149:1: rule__Diagram__Group__6__Impl : ( 'extension' ) ;
    public final void rule__Diagram__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1153:1: ( ( 'extension' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1154:1: ( 'extension' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1154:1: ( 'extension' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1155:1: 'extension'
            {
             before(grammarAccess.getDiagramAccess().getExtensionKeyword_6()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Diagram__Group__6__Impl2492); 
             after(grammarAccess.getDiagramAccess().getExtensionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__6__Impl"


    // $ANTLR start "rule__Diagram__Group__7"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1168:1: rule__Diagram__Group__7 : rule__Diagram__Group__7__Impl rule__Diagram__Group__8 ;
    public final void rule__Diagram__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1172:1: ( rule__Diagram__Group__7__Impl rule__Diagram__Group__8 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1173:2: rule__Diagram__Group__7__Impl rule__Diagram__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__7__Impl_in_rule__Diagram__Group__72523);
            rule__Diagram__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__8_in_rule__Diagram__Group__72526);
            rule__Diagram__Group__8();

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
    // $ANTLR end "rule__Diagram__Group__7"


    // $ANTLR start "rule__Diagram__Group__7__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1180:1: rule__Diagram__Group__7__Impl : ( ( rule__Diagram__ModelfileExtensionAssignment_7 ) ) ;
    public final void rule__Diagram__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1184:1: ( ( ( rule__Diagram__ModelfileExtensionAssignment_7 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1185:1: ( ( rule__Diagram__ModelfileExtensionAssignment_7 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1185:1: ( ( rule__Diagram__ModelfileExtensionAssignment_7 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1186:1: ( rule__Diagram__ModelfileExtensionAssignment_7 )
            {
             before(grammarAccess.getDiagramAccess().getModelfileExtensionAssignment_7()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1187:1: ( rule__Diagram__ModelfileExtensionAssignment_7 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1187:2: rule__Diagram__ModelfileExtensionAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__ModelfileExtensionAssignment_7_in_rule__Diagram__Group__7__Impl2553);
            rule__Diagram__ModelfileExtensionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getModelfileExtensionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__7__Impl"


    // $ANTLR start "rule__Diagram__Group__8"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1197:1: rule__Diagram__Group__8 : rule__Diagram__Group__8__Impl rule__Diagram__Group__9 ;
    public final void rule__Diagram__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1201:1: ( rule__Diagram__Group__8__Impl rule__Diagram__Group__9 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1202:2: rule__Diagram__Group__8__Impl rule__Diagram__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__8__Impl_in_rule__Diagram__Group__82583);
            rule__Diagram__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__9_in_rule__Diagram__Group__82586);
            rule__Diagram__Group__9();

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
    // $ANTLR end "rule__Diagram__Group__8"


    // $ANTLR start "rule__Diagram__Group__8__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1209:1: rule__Diagram__Group__8__Impl : ( ( rule__Diagram__BehaviourGroupsAssignment_8 )* ) ;
    public final void rule__Diagram__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1213:1: ( ( ( rule__Diagram__BehaviourGroupsAssignment_8 )* ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1214:1: ( ( rule__Diagram__BehaviourGroupsAssignment_8 )* )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1214:1: ( ( rule__Diagram__BehaviourGroupsAssignment_8 )* )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1215:1: ( rule__Diagram__BehaviourGroupsAssignment_8 )*
            {
             before(grammarAccess.getDiagramAccess().getBehaviourGroupsAssignment_8()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1216:1: ( rule__Diagram__BehaviourGroupsAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1216:2: rule__Diagram__BehaviourGroupsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Diagram__BehaviourGroupsAssignment_8_in_rule__Diagram__Group__8__Impl2613);
            	    rule__Diagram__BehaviourGroupsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getBehaviourGroupsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__8__Impl"


    // $ANTLR start "rule__Diagram__Group__9"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1226:1: rule__Diagram__Group__9 : rule__Diagram__Group__9__Impl ;
    public final void rule__Diagram__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1230:1: ( rule__Diagram__Group__9__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1231:2: rule__Diagram__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Diagram__Group__9__Impl_in_rule__Diagram__Group__92644);
            rule__Diagram__Group__9__Impl();

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
    // $ANTLR end "rule__Diagram__Group__9"


    // $ANTLR start "rule__Diagram__Group__9__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1237:1: rule__Diagram__Group__9__Impl : ( ( rule__Diagram__MetaClassesAssignment_9 )* ) ;
    public final void rule__Diagram__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1241:1: ( ( ( rule__Diagram__MetaClassesAssignment_9 )* ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1242:1: ( ( rule__Diagram__MetaClassesAssignment_9 )* )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1242:1: ( ( rule__Diagram__MetaClassesAssignment_9 )* )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1243:1: ( rule__Diagram__MetaClassesAssignment_9 )*
            {
             before(grammarAccess.getDiagramAccess().getMetaClassesAssignment_9()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1244:1: ( rule__Diagram__MetaClassesAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1244:2: rule__Diagram__MetaClassesAssignment_9
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Diagram__MetaClassesAssignment_9_in_rule__Diagram__Group__9__Impl2671);
            	    rule__Diagram__MetaClassesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getMetaClassesAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Group__9__Impl"


    // $ANTLR start "rule__BehaviourGroup__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1274:1: rule__BehaviourGroup__Group__0 : rule__BehaviourGroup__Group__0__Impl rule__BehaviourGroup__Group__1 ;
    public final void rule__BehaviourGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1278:1: ( rule__BehaviourGroup__Group__0__Impl rule__BehaviourGroup__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1279:2: rule__BehaviourGroup__Group__0__Impl rule__BehaviourGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__0__Impl_in_rule__BehaviourGroup__Group__02722);
            rule__BehaviourGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__1_in_rule__BehaviourGroup__Group__02725);
            rule__BehaviourGroup__Group__1();

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
    // $ANTLR end "rule__BehaviourGroup__Group__0"


    // $ANTLR start "rule__BehaviourGroup__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1286:1: rule__BehaviourGroup__Group__0__Impl : ( 'behaviour' ) ;
    public final void rule__BehaviourGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1290:1: ( ( 'behaviour' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1291:1: ( 'behaviour' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1291:1: ( 'behaviour' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1292:1: 'behaviour'
            {
             before(grammarAccess.getBehaviourGroupAccess().getBehaviourKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__BehaviourGroup__Group__0__Impl2753); 
             after(grammarAccess.getBehaviourGroupAccess().getBehaviourKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__Group__0__Impl"


    // $ANTLR start "rule__BehaviourGroup__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1305:1: rule__BehaviourGroup__Group__1 : rule__BehaviourGroup__Group__1__Impl rule__BehaviourGroup__Group__2 ;
    public final void rule__BehaviourGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1309:1: ( rule__BehaviourGroup__Group__1__Impl rule__BehaviourGroup__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1310:2: rule__BehaviourGroup__Group__1__Impl rule__BehaviourGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__1__Impl_in_rule__BehaviourGroup__Group__12784);
            rule__BehaviourGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__2_in_rule__BehaviourGroup__Group__12787);
            rule__BehaviourGroup__Group__2();

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
    // $ANTLR end "rule__BehaviourGroup__Group__1"


    // $ANTLR start "rule__BehaviourGroup__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1317:1: rule__BehaviourGroup__Group__1__Impl : ( ( rule__BehaviourGroup__NameAssignment_1 ) ) ;
    public final void rule__BehaviourGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1321:1: ( ( ( rule__BehaviourGroup__NameAssignment_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1322:1: ( ( rule__BehaviourGroup__NameAssignment_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1322:1: ( ( rule__BehaviourGroup__NameAssignment_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1323:1: ( rule__BehaviourGroup__NameAssignment_1 )
            {
             before(grammarAccess.getBehaviourGroupAccess().getNameAssignment_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1324:1: ( rule__BehaviourGroup__NameAssignment_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1324:2: rule__BehaviourGroup__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__NameAssignment_1_in_rule__BehaviourGroup__Group__1__Impl2814);
            rule__BehaviourGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourGroupAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__Group__1__Impl"


    // $ANTLR start "rule__BehaviourGroup__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1334:1: rule__BehaviourGroup__Group__2 : rule__BehaviourGroup__Group__2__Impl rule__BehaviourGroup__Group__3 ;
    public final void rule__BehaviourGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1338:1: ( rule__BehaviourGroup__Group__2__Impl rule__BehaviourGroup__Group__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1339:2: rule__BehaviourGroup__Group__2__Impl rule__BehaviourGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__2__Impl_in_rule__BehaviourGroup__Group__22844);
            rule__BehaviourGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__3_in_rule__BehaviourGroup__Group__22847);
            rule__BehaviourGroup__Group__3();

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
    // $ANTLR end "rule__BehaviourGroup__Group__2"


    // $ANTLR start "rule__BehaviourGroup__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1346:1: rule__BehaviourGroup__Group__2__Impl : ( '[' ) ;
    public final void rule__BehaviourGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1350:1: ( ( '[' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1351:1: ( '[' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1351:1: ( '[' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1352:1: '['
            {
             before(grammarAccess.getBehaviourGroupAccess().getLeftSquareBracketKeyword_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__BehaviourGroup__Group__2__Impl2875); 
             after(grammarAccess.getBehaviourGroupAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__Group__2__Impl"


    // $ANTLR start "rule__BehaviourGroup__Group__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1365:1: rule__BehaviourGroup__Group__3 : rule__BehaviourGroup__Group__3__Impl rule__BehaviourGroup__Group__4 ;
    public final void rule__BehaviourGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1369:1: ( rule__BehaviourGroup__Group__3__Impl rule__BehaviourGroup__Group__4 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1370:2: rule__BehaviourGroup__Group__3__Impl rule__BehaviourGroup__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__3__Impl_in_rule__BehaviourGroup__Group__32906);
            rule__BehaviourGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__4_in_rule__BehaviourGroup__Group__32909);
            rule__BehaviourGroup__Group__4();

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
    // $ANTLR end "rule__BehaviourGroup__Group__3"


    // $ANTLR start "rule__BehaviourGroup__Group__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1377:1: rule__BehaviourGroup__Group__3__Impl : ( ( ( rule__BehaviourGroup__Group_3__0 ) ) ( ( rule__BehaviourGroup__Group_3__0 )* ) ) ;
    public final void rule__BehaviourGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1381:1: ( ( ( ( rule__BehaviourGroup__Group_3__0 ) ) ( ( rule__BehaviourGroup__Group_3__0 )* ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1382:1: ( ( ( rule__BehaviourGroup__Group_3__0 ) ) ( ( rule__BehaviourGroup__Group_3__0 )* ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1382:1: ( ( ( rule__BehaviourGroup__Group_3__0 ) ) ( ( rule__BehaviourGroup__Group_3__0 )* ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1383:1: ( ( rule__BehaviourGroup__Group_3__0 ) ) ( ( rule__BehaviourGroup__Group_3__0 )* )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1383:1: ( ( rule__BehaviourGroup__Group_3__0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1384:1: ( rule__BehaviourGroup__Group_3__0 )
            {
             before(grammarAccess.getBehaviourGroupAccess().getGroup_3()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1385:1: ( rule__BehaviourGroup__Group_3__0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1385:2: rule__BehaviourGroup__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group_3__0_in_rule__BehaviourGroup__Group__3__Impl2938);
            rule__BehaviourGroup__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourGroupAccess().getGroup_3()); 

            }

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1388:1: ( ( rule__BehaviourGroup__Group_3__0 )* )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1389:1: ( rule__BehaviourGroup__Group_3__0 )*
            {
             before(grammarAccess.getBehaviourGroupAccess().getGroup_3()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1390:1: ( rule__BehaviourGroup__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==11) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1390:2: rule__BehaviourGroup__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group_3__0_in_rule__BehaviourGroup__Group__3__Impl2950);
            	    rule__BehaviourGroup__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBehaviourGroupAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__Group__3__Impl"


    // $ANTLR start "rule__BehaviourGroup__Group__4"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1401:1: rule__BehaviourGroup__Group__4 : rule__BehaviourGroup__Group__4__Impl ;
    public final void rule__BehaviourGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1405:1: ( rule__BehaviourGroup__Group__4__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1406:2: rule__BehaviourGroup__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group__4__Impl_in_rule__BehaviourGroup__Group__42983);
            rule__BehaviourGroup__Group__4__Impl();

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
    // $ANTLR end "rule__BehaviourGroup__Group__4"


    // $ANTLR start "rule__BehaviourGroup__Group__4__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1412:1: rule__BehaviourGroup__Group__4__Impl : ( ']' ) ;
    public final void rule__BehaviourGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1416:1: ( ( ']' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1417:1: ( ']' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1417:1: ( ']' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1418:1: ']'
            {
             before(grammarAccess.getBehaviourGroupAccess().getRightSquareBracketKeyword_4()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__BehaviourGroup__Group__4__Impl3011); 
             after(grammarAccess.getBehaviourGroupAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__Group__4__Impl"


    // $ANTLR start "rule__BehaviourGroup__Group_3__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1441:1: rule__BehaviourGroup__Group_3__0 : rule__BehaviourGroup__Group_3__0__Impl rule__BehaviourGroup__Group_3__1 ;
    public final void rule__BehaviourGroup__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1445:1: ( rule__BehaviourGroup__Group_3__0__Impl rule__BehaviourGroup__Group_3__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1446:2: rule__BehaviourGroup__Group_3__0__Impl rule__BehaviourGroup__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group_3__0__Impl_in_rule__BehaviourGroup__Group_3__03052);
            rule__BehaviourGroup__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group_3__1_in_rule__BehaviourGroup__Group_3__03055);
            rule__BehaviourGroup__Group_3__1();

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
    // $ANTLR end "rule__BehaviourGroup__Group_3__0"


    // $ANTLR start "rule__BehaviourGroup__Group_3__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1453:1: rule__BehaviourGroup__Group_3__0__Impl : ( ( rule__BehaviourGroup__BehavioursAssignment_3_0 ) ) ;
    public final void rule__BehaviourGroup__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1457:1: ( ( ( rule__BehaviourGroup__BehavioursAssignment_3_0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1458:1: ( ( rule__BehaviourGroup__BehavioursAssignment_3_0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1458:1: ( ( rule__BehaviourGroup__BehavioursAssignment_3_0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1459:1: ( rule__BehaviourGroup__BehavioursAssignment_3_0 )
            {
             before(grammarAccess.getBehaviourGroupAccess().getBehavioursAssignment_3_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1460:1: ( rule__BehaviourGroup__BehavioursAssignment_3_0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1460:2: rule__BehaviourGroup__BehavioursAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__BehavioursAssignment_3_0_in_rule__BehaviourGroup__Group_3__0__Impl3082);
            rule__BehaviourGroup__BehavioursAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getBehaviourGroupAccess().getBehavioursAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__Group_3__0__Impl"


    // $ANTLR start "rule__BehaviourGroup__Group_3__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1470:1: rule__BehaviourGroup__Group_3__1 : rule__BehaviourGroup__Group_3__1__Impl ;
    public final void rule__BehaviourGroup__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1474:1: ( rule__BehaviourGroup__Group_3__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1475:2: rule__BehaviourGroup__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BehaviourGroup__Group_3__1__Impl_in_rule__BehaviourGroup__Group_3__13112);
            rule__BehaviourGroup__Group_3__1__Impl();

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
    // $ANTLR end "rule__BehaviourGroup__Group_3__1"


    // $ANTLR start "rule__BehaviourGroup__Group_3__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1481:1: rule__BehaviourGroup__Group_3__1__Impl : ( ';' ) ;
    public final void rule__BehaviourGroup__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1485:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1486:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1486:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1487:1: ';'
            {
             before(grammarAccess.getBehaviourGroupAccess().getSemicolonKeyword_3_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__BehaviourGroup__Group_3__1__Impl3140); 
             after(grammarAccess.getBehaviourGroupAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__Group_3__1__Impl"


    // $ANTLR start "rule__MetaClass__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1504:1: rule__MetaClass__Group__0 : rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1 ;
    public final void rule__MetaClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1508:1: ( rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1509:2: rule__MetaClass__Group__0__Impl rule__MetaClass__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__0__Impl_in_rule__MetaClass__Group__03175);
            rule__MetaClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__1_in_rule__MetaClass__Group__03178);
            rule__MetaClass__Group__1();

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
    // $ANTLR end "rule__MetaClass__Group__0"


    // $ANTLR start "rule__MetaClass__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1516:1: rule__MetaClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__MetaClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1520:1: ( ( 'class' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1521:1: ( 'class' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1521:1: ( 'class' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1522:1: 'class'
            {
             before(grammarAccess.getMetaClassAccess().getClassKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MetaClass__Group__0__Impl3206); 
             after(grammarAccess.getMetaClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__0__Impl"


    // $ANTLR start "rule__MetaClass__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1535:1: rule__MetaClass__Group__1 : rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2 ;
    public final void rule__MetaClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1539:1: ( rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1540:2: rule__MetaClass__Group__1__Impl rule__MetaClass__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__1__Impl_in_rule__MetaClass__Group__13237);
            rule__MetaClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__2_in_rule__MetaClass__Group__13240);
            rule__MetaClass__Group__2();

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
    // $ANTLR end "rule__MetaClass__Group__1"


    // $ANTLR start "rule__MetaClass__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1547:1: rule__MetaClass__Group__1__Impl : ( ( rule__MetaClass__NameAssignment_1 ) ) ;
    public final void rule__MetaClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1551:1: ( ( ( rule__MetaClass__NameAssignment_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1552:1: ( ( rule__MetaClass__NameAssignment_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1552:1: ( ( rule__MetaClass__NameAssignment_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1553:1: ( rule__MetaClass__NameAssignment_1 )
            {
             before(grammarAccess.getMetaClassAccess().getNameAssignment_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1554:1: ( rule__MetaClass__NameAssignment_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1554:2: rule__MetaClass__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__NameAssignment_1_in_rule__MetaClass__Group__1__Impl3267);
            rule__MetaClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__1__Impl"


    // $ANTLR start "rule__MetaClass__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1564:1: rule__MetaClass__Group__2 : rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3 ;
    public final void rule__MetaClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1568:1: ( rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1569:2: rule__MetaClass__Group__2__Impl rule__MetaClass__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__2__Impl_in_rule__MetaClass__Group__23297);
            rule__MetaClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__3_in_rule__MetaClass__Group__23300);
            rule__MetaClass__Group__3();

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
    // $ANTLR end "rule__MetaClass__Group__2"


    // $ANTLR start "rule__MetaClass__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1576:1: rule__MetaClass__Group__2__Impl : ( ( rule__MetaClass__Group_2__0 )? ) ;
    public final void rule__MetaClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1580:1: ( ( ( rule__MetaClass__Group_2__0 )? ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1581:1: ( ( rule__MetaClass__Group_2__0 )? )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1581:1: ( ( rule__MetaClass__Group_2__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1582:1: ( rule__MetaClass__Group_2__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1583:1: ( rule__MetaClass__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1583:2: rule__MetaClass__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_2__0_in_rule__MetaClass__Group__2__Impl3327);
                    rule__MetaClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__2__Impl"


    // $ANTLR start "rule__MetaClass__Group__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1593:1: rule__MetaClass__Group__3 : rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4 ;
    public final void rule__MetaClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1597:1: ( rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1598:2: rule__MetaClass__Group__3__Impl rule__MetaClass__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__3__Impl_in_rule__MetaClass__Group__33358);
            rule__MetaClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__4_in_rule__MetaClass__Group__33361);
            rule__MetaClass__Group__4();

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
    // $ANTLR end "rule__MetaClass__Group__3"


    // $ANTLR start "rule__MetaClass__Group__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1605:1: rule__MetaClass__Group__3__Impl : ( ( rule__MetaClass__Group_3__0 )? ) ;
    public final void rule__MetaClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1609:1: ( ( ( rule__MetaClass__Group_3__0 )? ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1610:1: ( ( rule__MetaClass__Group_3__0 )? )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1610:1: ( ( rule__MetaClass__Group_3__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1611:1: ( rule__MetaClass__Group_3__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_3()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1612:1: ( rule__MetaClass__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1612:2: rule__MetaClass__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_3__0_in_rule__MetaClass__Group__3__Impl3388);
                    rule__MetaClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__3__Impl"


    // $ANTLR start "rule__MetaClass__Group__4"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1622:1: rule__MetaClass__Group__4 : rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5 ;
    public final void rule__MetaClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1626:1: ( rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1627:2: rule__MetaClass__Group__4__Impl rule__MetaClass__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__4__Impl_in_rule__MetaClass__Group__43419);
            rule__MetaClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__5_in_rule__MetaClass__Group__43422);
            rule__MetaClass__Group__5();

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
    // $ANTLR end "rule__MetaClass__Group__4"


    // $ANTLR start "rule__MetaClass__Group__4__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1634:1: rule__MetaClass__Group__4__Impl : ( ':' ) ;
    public final void rule__MetaClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1638:1: ( ( ':' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1639:1: ( ':' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1639:1: ( ':' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1640:1: ':'
            {
             before(grammarAccess.getMetaClassAccess().getColonKeyword_4()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MetaClass__Group__4__Impl3450); 
             after(grammarAccess.getMetaClassAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__4__Impl"


    // $ANTLR start "rule__MetaClass__Group__5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1653:1: rule__MetaClass__Group__5 : rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6 ;
    public final void rule__MetaClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1657:1: ( rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1658:2: rule__MetaClass__Group__5__Impl rule__MetaClass__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__5__Impl_in_rule__MetaClass__Group__53481);
            rule__MetaClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__6_in_rule__MetaClass__Group__53484);
            rule__MetaClass__Group__6();

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
    // $ANTLR end "rule__MetaClass__Group__5"


    // $ANTLR start "rule__MetaClass__Group__5__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1665:1: rule__MetaClass__Group__5__Impl : ( ( rule__MetaClass__RepresentedByAssignment_5 ) ) ;
    public final void rule__MetaClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1669:1: ( ( ( rule__MetaClass__RepresentedByAssignment_5 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1670:1: ( ( rule__MetaClass__RepresentedByAssignment_5 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1670:1: ( ( rule__MetaClass__RepresentedByAssignment_5 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1671:1: ( rule__MetaClass__RepresentedByAssignment_5 )
            {
             before(grammarAccess.getMetaClassAccess().getRepresentedByAssignment_5()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1672:1: ( rule__MetaClass__RepresentedByAssignment_5 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1672:2: rule__MetaClass__RepresentedByAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__RepresentedByAssignment_5_in_rule__MetaClass__Group__5__Impl3511);
            rule__MetaClass__RepresentedByAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getRepresentedByAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__5__Impl"


    // $ANTLR start "rule__MetaClass__Group__6"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1682:1: rule__MetaClass__Group__6 : rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7 ;
    public final void rule__MetaClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1686:1: ( rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1687:2: rule__MetaClass__Group__6__Impl rule__MetaClass__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__6__Impl_in_rule__MetaClass__Group__63541);
            rule__MetaClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__7_in_rule__MetaClass__Group__63544);
            rule__MetaClass__Group__7();

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
    // $ANTLR end "rule__MetaClass__Group__6"


    // $ANTLR start "rule__MetaClass__Group__6__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1694:1: rule__MetaClass__Group__6__Impl : ( ( rule__MetaClass__Group_6__0 )? ) ;
    public final void rule__MetaClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1698:1: ( ( ( rule__MetaClass__Group_6__0 )? ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1699:1: ( ( rule__MetaClass__Group_6__0 )? )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1699:1: ( ( rule__MetaClass__Group_6__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1700:1: ( rule__MetaClass__Group_6__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_6()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1701:1: ( rule__MetaClass__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1701:2: rule__MetaClass__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6__0_in_rule__MetaClass__Group__6__Impl3571);
                    rule__MetaClass__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__6__Impl"


    // $ANTLR start "rule__MetaClass__Group__7"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1711:1: rule__MetaClass__Group__7 : rule__MetaClass__Group__7__Impl ;
    public final void rule__MetaClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1715:1: ( rule__MetaClass__Group__7__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1716:2: rule__MetaClass__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group__7__Impl_in_rule__MetaClass__Group__73602);
            rule__MetaClass__Group__7__Impl();

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
    // $ANTLR end "rule__MetaClass__Group__7"


    // $ANTLR start "rule__MetaClass__Group__7__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1722:1: rule__MetaClass__Group__7__Impl : ( ( rule__MetaClass__Group_7__0 )? ) ;
    public final void rule__MetaClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1726:1: ( ( ( rule__MetaClass__Group_7__0 )? ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1727:1: ( ( rule__MetaClass__Group_7__0 )? )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1727:1: ( ( rule__MetaClass__Group_7__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1728:1: ( rule__MetaClass__Group_7__0 )?
            {
             before(grammarAccess.getMetaClassAccess().getGroup_7()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1729:1: ( rule__MetaClass__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1729:2: rule__MetaClass__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7__0_in_rule__MetaClass__Group__7__Impl3629);
                    rule__MetaClass__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaClassAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group__7__Impl"


    // $ANTLR start "rule__MetaClass__Group_2__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1755:1: rule__MetaClass__Group_2__0 : rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1 ;
    public final void rule__MetaClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1759:1: ( rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1760:2: rule__MetaClass__Group_2__0__Impl rule__MetaClass__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_2__0__Impl_in_rule__MetaClass__Group_2__03676);
            rule__MetaClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_2__1_in_rule__MetaClass__Group_2__03679);
            rule__MetaClass__Group_2__1();

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
    // $ANTLR end "rule__MetaClass__Group_2__0"


    // $ANTLR start "rule__MetaClass__Group_2__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1767:1: rule__MetaClass__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__MetaClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1771:1: ( ( 'alias' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1772:1: ( 'alias' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1772:1: ( 'alias' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1773:1: 'alias'
            {
             before(grammarAccess.getMetaClassAccess().getAliasKeyword_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__MetaClass__Group_2__0__Impl3707); 
             after(grammarAccess.getMetaClassAccess().getAliasKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_2__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1786:1: rule__MetaClass__Group_2__1 : rule__MetaClass__Group_2__1__Impl ;
    public final void rule__MetaClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1790:1: ( rule__MetaClass__Group_2__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1791:2: rule__MetaClass__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_2__1__Impl_in_rule__MetaClass__Group_2__13738);
            rule__MetaClass__Group_2__1__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_2__1"


    // $ANTLR start "rule__MetaClass__Group_2__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1797:1: rule__MetaClass__Group_2__1__Impl : ( ( rule__MetaClass__AliasAssignment_2_1 ) ) ;
    public final void rule__MetaClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1801:1: ( ( ( rule__MetaClass__AliasAssignment_2_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1802:1: ( ( rule__MetaClass__AliasAssignment_2_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1802:1: ( ( rule__MetaClass__AliasAssignment_2_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1803:1: ( rule__MetaClass__AliasAssignment_2_1 )
            {
             before(grammarAccess.getMetaClassAccess().getAliasAssignment_2_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1804:1: ( rule__MetaClass__AliasAssignment_2_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1804:2: rule__MetaClass__AliasAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__AliasAssignment_2_1_in_rule__MetaClass__Group_2__1__Impl3765);
            rule__MetaClass__AliasAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getAliasAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_2__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_3__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1818:1: rule__MetaClass__Group_3__0 : rule__MetaClass__Group_3__0__Impl rule__MetaClass__Group_3__1 ;
    public final void rule__MetaClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1822:1: ( rule__MetaClass__Group_3__0__Impl rule__MetaClass__Group_3__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1823:2: rule__MetaClass__Group_3__0__Impl rule__MetaClass__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_3__0__Impl_in_rule__MetaClass__Group_3__03799);
            rule__MetaClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_3__1_in_rule__MetaClass__Group_3__03802);
            rule__MetaClass__Group_3__1();

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
    // $ANTLR end "rule__MetaClass__Group_3__0"


    // $ANTLR start "rule__MetaClass__Group_3__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1830:1: rule__MetaClass__Group_3__0__Impl : ( 'icon' ) ;
    public final void rule__MetaClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1834:1: ( ( 'icon' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1835:1: ( 'icon' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1835:1: ( 'icon' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1836:1: 'icon'
            {
             before(grammarAccess.getMetaClassAccess().getIconKeyword_3_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__MetaClass__Group_3__0__Impl3830); 
             after(grammarAccess.getMetaClassAccess().getIconKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_3__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_3__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1849:1: rule__MetaClass__Group_3__1 : rule__MetaClass__Group_3__1__Impl ;
    public final void rule__MetaClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1853:1: ( rule__MetaClass__Group_3__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1854:2: rule__MetaClass__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_3__1__Impl_in_rule__MetaClass__Group_3__13861);
            rule__MetaClass__Group_3__1__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_3__1"


    // $ANTLR start "rule__MetaClass__Group_3__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1860:1: rule__MetaClass__Group_3__1__Impl : ( ( rule__MetaClass__IconAssignment_3_1 ) ) ;
    public final void rule__MetaClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1864:1: ( ( ( rule__MetaClass__IconAssignment_3_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1865:1: ( ( rule__MetaClass__IconAssignment_3_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1865:1: ( ( rule__MetaClass__IconAssignment_3_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1866:1: ( rule__MetaClass__IconAssignment_3_1 )
            {
             before(grammarAccess.getMetaClassAccess().getIconAssignment_3_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1867:1: ( rule__MetaClass__IconAssignment_3_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1867:2: rule__MetaClass__IconAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__IconAssignment_3_1_in_rule__MetaClass__Group_3__1__Impl3888);
            rule__MetaClass__IconAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getIconAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_3__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_6__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1881:1: rule__MetaClass__Group_6__0 : rule__MetaClass__Group_6__0__Impl rule__MetaClass__Group_6__1 ;
    public final void rule__MetaClass__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1885:1: ( rule__MetaClass__Group_6__0__Impl rule__MetaClass__Group_6__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1886:2: rule__MetaClass__Group_6__0__Impl rule__MetaClass__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6__0__Impl_in_rule__MetaClass__Group_6__03922);
            rule__MetaClass__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6__1_in_rule__MetaClass__Group_6__03925);
            rule__MetaClass__Group_6__1();

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
    // $ANTLR end "rule__MetaClass__Group_6__0"


    // $ANTLR start "rule__MetaClass__Group_6__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1893:1: rule__MetaClass__Group_6__0__Impl : ( 'references' ) ;
    public final void rule__MetaClass__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1897:1: ( ( 'references' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1898:1: ( 'references' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1898:1: ( 'references' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1899:1: 'references'
            {
             before(grammarAccess.getMetaClassAccess().getReferencesKeyword_6_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MetaClass__Group_6__0__Impl3953); 
             after(grammarAccess.getMetaClassAccess().getReferencesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_6__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1912:1: rule__MetaClass__Group_6__1 : rule__MetaClass__Group_6__1__Impl rule__MetaClass__Group_6__2 ;
    public final void rule__MetaClass__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1916:1: ( rule__MetaClass__Group_6__1__Impl rule__MetaClass__Group_6__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1917:2: rule__MetaClass__Group_6__1__Impl rule__MetaClass__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6__1__Impl_in_rule__MetaClass__Group_6__13984);
            rule__MetaClass__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6__2_in_rule__MetaClass__Group_6__13987);
            rule__MetaClass__Group_6__2();

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
    // $ANTLR end "rule__MetaClass__Group_6__1"


    // $ANTLR start "rule__MetaClass__Group_6__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1924:1: rule__MetaClass__Group_6__1__Impl : ( '[' ) ;
    public final void rule__MetaClass__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1928:1: ( ( '[' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1929:1: ( '[' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1929:1: ( '[' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1930:1: '['
            {
             before(grammarAccess.getMetaClassAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MetaClass__Group_6__1__Impl4015); 
             after(grammarAccess.getMetaClassAccess().getLeftSquareBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_6__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1943:1: rule__MetaClass__Group_6__2 : rule__MetaClass__Group_6__2__Impl rule__MetaClass__Group_6__3 ;
    public final void rule__MetaClass__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1947:1: ( rule__MetaClass__Group_6__2__Impl rule__MetaClass__Group_6__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1948:2: rule__MetaClass__Group_6__2__Impl rule__MetaClass__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6__2__Impl_in_rule__MetaClass__Group_6__24046);
            rule__MetaClass__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6__3_in_rule__MetaClass__Group_6__24049);
            rule__MetaClass__Group_6__3();

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
    // $ANTLR end "rule__MetaClass__Group_6__2"


    // $ANTLR start "rule__MetaClass__Group_6__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1955:1: rule__MetaClass__Group_6__2__Impl : ( ( rule__MetaClass__Group_6_2__0 )* ) ;
    public final void rule__MetaClass__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1959:1: ( ( ( rule__MetaClass__Group_6_2__0 )* ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1960:1: ( ( rule__MetaClass__Group_6_2__0 )* )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1960:1: ( ( rule__MetaClass__Group_6_2__0 )* )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1961:1: ( rule__MetaClass__Group_6_2__0 )*
            {
             before(grammarAccess.getMetaClassAccess().getGroup_6_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1962:1: ( rule__MetaClass__Group_6_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1962:2: rule__MetaClass__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6_2__0_in_rule__MetaClass__Group_6__2__Impl4076);
            	    rule__MetaClass__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMetaClassAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__2__Impl"


    // $ANTLR start "rule__MetaClass__Group_6__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1972:1: rule__MetaClass__Group_6__3 : rule__MetaClass__Group_6__3__Impl ;
    public final void rule__MetaClass__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1976:1: ( rule__MetaClass__Group_6__3__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1977:2: rule__MetaClass__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6__3__Impl_in_rule__MetaClass__Group_6__34107);
            rule__MetaClass__Group_6__3__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_6__3"


    // $ANTLR start "rule__MetaClass__Group_6__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1983:1: rule__MetaClass__Group_6__3__Impl : ( ']' ) ;
    public final void rule__MetaClass__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1987:1: ( ( ']' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1988:1: ( ']' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1988:1: ( ']' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:1989:1: ']'
            {
             before(grammarAccess.getMetaClassAccess().getRightSquareBracketKeyword_6_3()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MetaClass__Group_6__3__Impl4135); 
             after(grammarAccess.getMetaClassAccess().getRightSquareBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6__3__Impl"


    // $ANTLR start "rule__MetaClass__Group_6_2__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2010:1: rule__MetaClass__Group_6_2__0 : rule__MetaClass__Group_6_2__0__Impl rule__MetaClass__Group_6_2__1 ;
    public final void rule__MetaClass__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2014:1: ( rule__MetaClass__Group_6_2__0__Impl rule__MetaClass__Group_6_2__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2015:2: rule__MetaClass__Group_6_2__0__Impl rule__MetaClass__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6_2__0__Impl_in_rule__MetaClass__Group_6_2__04174);
            rule__MetaClass__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6_2__1_in_rule__MetaClass__Group_6_2__04177);
            rule__MetaClass__Group_6_2__1();

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
    // $ANTLR end "rule__MetaClass__Group_6_2__0"


    // $ANTLR start "rule__MetaClass__Group_6_2__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2022:1: rule__MetaClass__Group_6_2__0__Impl : ( ( rule__MetaClass__ReferencesAssignment_6_2_0 ) ) ;
    public final void rule__MetaClass__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2026:1: ( ( ( rule__MetaClass__ReferencesAssignment_6_2_0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2027:1: ( ( rule__MetaClass__ReferencesAssignment_6_2_0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2027:1: ( ( rule__MetaClass__ReferencesAssignment_6_2_0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2028:1: ( rule__MetaClass__ReferencesAssignment_6_2_0 )
            {
             before(grammarAccess.getMetaClassAccess().getReferencesAssignment_6_2_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2029:1: ( rule__MetaClass__ReferencesAssignment_6_2_0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2029:2: rule__MetaClass__ReferencesAssignment_6_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__ReferencesAssignment_6_2_0_in_rule__MetaClass__Group_6_2__0__Impl4204);
            rule__MetaClass__ReferencesAssignment_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getReferencesAssignment_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6_2__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_6_2__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2039:1: rule__MetaClass__Group_6_2__1 : rule__MetaClass__Group_6_2__1__Impl ;
    public final void rule__MetaClass__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2043:1: ( rule__MetaClass__Group_6_2__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2044:2: rule__MetaClass__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_6_2__1__Impl_in_rule__MetaClass__Group_6_2__14234);
            rule__MetaClass__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_6_2__1"


    // $ANTLR start "rule__MetaClass__Group_6_2__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2050:1: rule__MetaClass__Group_6_2__1__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2054:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2055:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2055:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2056:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_6_2_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MetaClass__Group_6_2__1__Impl4262); 
             after(grammarAccess.getMetaClassAccess().getSemicolonKeyword_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_6_2__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_7__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2073:1: rule__MetaClass__Group_7__0 : rule__MetaClass__Group_7__0__Impl rule__MetaClass__Group_7__1 ;
    public final void rule__MetaClass__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2077:1: ( rule__MetaClass__Group_7__0__Impl rule__MetaClass__Group_7__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2078:2: rule__MetaClass__Group_7__0__Impl rule__MetaClass__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7__0__Impl_in_rule__MetaClass__Group_7__04297);
            rule__MetaClass__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7__1_in_rule__MetaClass__Group_7__04300);
            rule__MetaClass__Group_7__1();

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
    // $ANTLR end "rule__MetaClass__Group_7__0"


    // $ANTLR start "rule__MetaClass__Group_7__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2085:1: rule__MetaClass__Group_7__0__Impl : ( 'behavior' ) ;
    public final void rule__MetaClass__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2089:1: ( ( 'behavior' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2090:1: ( 'behavior' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2090:1: ( 'behavior' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2091:1: 'behavior'
            {
             before(grammarAccess.getMetaClassAccess().getBehaviorKeyword_7_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__MetaClass__Group_7__0__Impl4328); 
             after(grammarAccess.getMetaClassAccess().getBehaviorKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_7__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2104:1: rule__MetaClass__Group_7__1 : rule__MetaClass__Group_7__1__Impl rule__MetaClass__Group_7__2 ;
    public final void rule__MetaClass__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2108:1: ( rule__MetaClass__Group_7__1__Impl rule__MetaClass__Group_7__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2109:2: rule__MetaClass__Group_7__1__Impl rule__MetaClass__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7__1__Impl_in_rule__MetaClass__Group_7__14359);
            rule__MetaClass__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7__2_in_rule__MetaClass__Group_7__14362);
            rule__MetaClass__Group_7__2();

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
    // $ANTLR end "rule__MetaClass__Group_7__1"


    // $ANTLR start "rule__MetaClass__Group_7__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2116:1: rule__MetaClass__Group_7__1__Impl : ( '[' ) ;
    public final void rule__MetaClass__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2120:1: ( ( '[' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2121:1: ( '[' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2121:1: ( '[' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2122:1: '['
            {
             before(grammarAccess.getMetaClassAccess().getLeftSquareBracketKeyword_7_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MetaClass__Group_7__1__Impl4390); 
             after(grammarAccess.getMetaClassAccess().getLeftSquareBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_7__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2135:1: rule__MetaClass__Group_7__2 : rule__MetaClass__Group_7__2__Impl rule__MetaClass__Group_7__3 ;
    public final void rule__MetaClass__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2139:1: ( rule__MetaClass__Group_7__2__Impl rule__MetaClass__Group_7__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2140:2: rule__MetaClass__Group_7__2__Impl rule__MetaClass__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7__2__Impl_in_rule__MetaClass__Group_7__24421);
            rule__MetaClass__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7__3_in_rule__MetaClass__Group_7__24424);
            rule__MetaClass__Group_7__3();

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
    // $ANTLR end "rule__MetaClass__Group_7__2"


    // $ANTLR start "rule__MetaClass__Group_7__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2147:1: rule__MetaClass__Group_7__2__Impl : ( ( rule__MetaClass__Alternatives_7_2 )* ) ;
    public final void rule__MetaClass__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2151:1: ( ( ( rule__MetaClass__Alternatives_7_2 )* ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2152:1: ( ( rule__MetaClass__Alternatives_7_2 )* )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2152:1: ( ( rule__MetaClass__Alternatives_7_2 )* )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2153:1: ( rule__MetaClass__Alternatives_7_2 )*
            {
             before(grammarAccess.getMetaClassAccess().getAlternatives_7_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2154:1: ( rule__MetaClass__Alternatives_7_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==11||LA15_0==43) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2154:2: rule__MetaClass__Alternatives_7_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Alternatives_7_2_in_rule__MetaClass__Group_7__2__Impl4451);
            	    rule__MetaClass__Alternatives_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMetaClassAccess().getAlternatives_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7__2__Impl"


    // $ANTLR start "rule__MetaClass__Group_7__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2164:1: rule__MetaClass__Group_7__3 : rule__MetaClass__Group_7__3__Impl ;
    public final void rule__MetaClass__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2168:1: ( rule__MetaClass__Group_7__3__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2169:2: rule__MetaClass__Group_7__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7__3__Impl_in_rule__MetaClass__Group_7__34482);
            rule__MetaClass__Group_7__3__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_7__3"


    // $ANTLR start "rule__MetaClass__Group_7__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2175:1: rule__MetaClass__Group_7__3__Impl : ( ']' ) ;
    public final void rule__MetaClass__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2179:1: ( ( ']' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2180:1: ( ']' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2180:1: ( ']' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2181:1: ']'
            {
             before(grammarAccess.getMetaClassAccess().getRightSquareBracketKeyword_7_3()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MetaClass__Group_7__3__Impl4510); 
             after(grammarAccess.getMetaClassAccess().getRightSquareBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7__3__Impl"


    // $ANTLR start "rule__MetaClass__Group_7_2_0__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2202:1: rule__MetaClass__Group_7_2_0__0 : rule__MetaClass__Group_7_2_0__0__Impl rule__MetaClass__Group_7_2_0__1 ;
    public final void rule__MetaClass__Group_7_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2206:1: ( rule__MetaClass__Group_7_2_0__0__Impl rule__MetaClass__Group_7_2_0__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2207:2: rule__MetaClass__Group_7_2_0__0__Impl rule__MetaClass__Group_7_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_0__0__Impl_in_rule__MetaClass__Group_7_2_0__04549);
            rule__MetaClass__Group_7_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_0__1_in_rule__MetaClass__Group_7_2_0__04552);
            rule__MetaClass__Group_7_2_0__1();

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
    // $ANTLR end "rule__MetaClass__Group_7_2_0__0"


    // $ANTLR start "rule__MetaClass__Group_7_2_0__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2214:1: rule__MetaClass__Group_7_2_0__0__Impl : ( 'group' ) ;
    public final void rule__MetaClass__Group_7_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2218:1: ( ( 'group' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2219:1: ( 'group' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2219:1: ( 'group' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2220:1: 'group'
            {
             before(grammarAccess.getMetaClassAccess().getGroupKeyword_7_2_0_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__MetaClass__Group_7_2_0__0__Impl4580); 
             after(grammarAccess.getMetaClassAccess().getGroupKeyword_7_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7_2_0__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_7_2_0__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2233:1: rule__MetaClass__Group_7_2_0__1 : rule__MetaClass__Group_7_2_0__1__Impl rule__MetaClass__Group_7_2_0__2 ;
    public final void rule__MetaClass__Group_7_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2237:1: ( rule__MetaClass__Group_7_2_0__1__Impl rule__MetaClass__Group_7_2_0__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2238:2: rule__MetaClass__Group_7_2_0__1__Impl rule__MetaClass__Group_7_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_0__1__Impl_in_rule__MetaClass__Group_7_2_0__14611);
            rule__MetaClass__Group_7_2_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_0__2_in_rule__MetaClass__Group_7_2_0__14614);
            rule__MetaClass__Group_7_2_0__2();

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
    // $ANTLR end "rule__MetaClass__Group_7_2_0__1"


    // $ANTLR start "rule__MetaClass__Group_7_2_0__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2245:1: rule__MetaClass__Group_7_2_0__1__Impl : ( ( rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1 ) ) ;
    public final void rule__MetaClass__Group_7_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2249:1: ( ( ( rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2250:1: ( ( rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2250:1: ( ( rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2251:1: ( rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1 )
            {
             before(grammarAccess.getMetaClassAccess().getBehaviourGroupsAssignment_7_2_0_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2252:1: ( rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2252:2: rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1_in_rule__MetaClass__Group_7_2_0__1__Impl4641);
            rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getBehaviourGroupsAssignment_7_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7_2_0__1__Impl"


    // $ANTLR start "rule__MetaClass__Group_7_2_0__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2262:1: rule__MetaClass__Group_7_2_0__2 : rule__MetaClass__Group_7_2_0__2__Impl ;
    public final void rule__MetaClass__Group_7_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2266:1: ( rule__MetaClass__Group_7_2_0__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2267:2: rule__MetaClass__Group_7_2_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_0__2__Impl_in_rule__MetaClass__Group_7_2_0__24671);
            rule__MetaClass__Group_7_2_0__2__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_7_2_0__2"


    // $ANTLR start "rule__MetaClass__Group_7_2_0__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2273:1: rule__MetaClass__Group_7_2_0__2__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_7_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2277:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2278:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2278:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2279:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_7_2_0_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MetaClass__Group_7_2_0__2__Impl4699); 
             after(grammarAccess.getMetaClassAccess().getSemicolonKeyword_7_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7_2_0__2__Impl"


    // $ANTLR start "rule__MetaClass__Group_7_2_1__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2298:1: rule__MetaClass__Group_7_2_1__0 : rule__MetaClass__Group_7_2_1__0__Impl rule__MetaClass__Group_7_2_1__1 ;
    public final void rule__MetaClass__Group_7_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2302:1: ( rule__MetaClass__Group_7_2_1__0__Impl rule__MetaClass__Group_7_2_1__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2303:2: rule__MetaClass__Group_7_2_1__0__Impl rule__MetaClass__Group_7_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_1__0__Impl_in_rule__MetaClass__Group_7_2_1__04736);
            rule__MetaClass__Group_7_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_1__1_in_rule__MetaClass__Group_7_2_1__04739);
            rule__MetaClass__Group_7_2_1__1();

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
    // $ANTLR end "rule__MetaClass__Group_7_2_1__0"


    // $ANTLR start "rule__MetaClass__Group_7_2_1__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2310:1: rule__MetaClass__Group_7_2_1__0__Impl : ( ( rule__MetaClass__BehavioursAssignment_7_2_1_0 ) ) ;
    public final void rule__MetaClass__Group_7_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2314:1: ( ( ( rule__MetaClass__BehavioursAssignment_7_2_1_0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2315:1: ( ( rule__MetaClass__BehavioursAssignment_7_2_1_0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2315:1: ( ( rule__MetaClass__BehavioursAssignment_7_2_1_0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2316:1: ( rule__MetaClass__BehavioursAssignment_7_2_1_0 )
            {
             before(grammarAccess.getMetaClassAccess().getBehavioursAssignment_7_2_1_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2317:1: ( rule__MetaClass__BehavioursAssignment_7_2_1_0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2317:2: rule__MetaClass__BehavioursAssignment_7_2_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__BehavioursAssignment_7_2_1_0_in_rule__MetaClass__Group_7_2_1__0__Impl4766);
            rule__MetaClass__BehavioursAssignment_7_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMetaClassAccess().getBehavioursAssignment_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7_2_1__0__Impl"


    // $ANTLR start "rule__MetaClass__Group_7_2_1__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2327:1: rule__MetaClass__Group_7_2_1__1 : rule__MetaClass__Group_7_2_1__1__Impl ;
    public final void rule__MetaClass__Group_7_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2331:1: ( rule__MetaClass__Group_7_2_1__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2332:2: rule__MetaClass__Group_7_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaClass__Group_7_2_1__1__Impl_in_rule__MetaClass__Group_7_2_1__14796);
            rule__MetaClass__Group_7_2_1__1__Impl();

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
    // $ANTLR end "rule__MetaClass__Group_7_2_1__1"


    // $ANTLR start "rule__MetaClass__Group_7_2_1__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2338:1: rule__MetaClass__Group_7_2_1__1__Impl : ( ';' ) ;
    public final void rule__MetaClass__Group_7_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2342:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2343:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2343:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2344:1: ';'
            {
             before(grammarAccess.getMetaClassAccess().getSemicolonKeyword_7_2_1_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MetaClass__Group_7_2_1__1__Impl4824); 
             after(grammarAccess.getMetaClassAccess().getSemicolonKeyword_7_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__Group_7_2_1__1__Impl"


    // $ANTLR start "rule__StandardBehaviour__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2361:1: rule__StandardBehaviour__Group__0 : rule__StandardBehaviour__Group__0__Impl rule__StandardBehaviour__Group__1 ;
    public final void rule__StandardBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2365:1: ( rule__StandardBehaviour__Group__0__Impl rule__StandardBehaviour__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2366:2: rule__StandardBehaviour__Group__0__Impl rule__StandardBehaviour__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group__0__Impl_in_rule__StandardBehaviour__Group__04859);
            rule__StandardBehaviour__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group__1_in_rule__StandardBehaviour__Group__04862);
            rule__StandardBehaviour__Group__1();

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
    // $ANTLR end "rule__StandardBehaviour__Group__0"


    // $ANTLR start "rule__StandardBehaviour__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2373:1: rule__StandardBehaviour__Group__0__Impl : ( ( rule__StandardBehaviour__TypeAssignment_0 ) ) ;
    public final void rule__StandardBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2377:1: ( ( ( rule__StandardBehaviour__TypeAssignment_0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2378:1: ( ( rule__StandardBehaviour__TypeAssignment_0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2378:1: ( ( rule__StandardBehaviour__TypeAssignment_0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2379:1: ( rule__StandardBehaviour__TypeAssignment_0 )
            {
             before(grammarAccess.getStandardBehaviourAccess().getTypeAssignment_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2380:1: ( rule__StandardBehaviour__TypeAssignment_0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2380:2: rule__StandardBehaviour__TypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__TypeAssignment_0_in_rule__StandardBehaviour__Group__0__Impl4889);
            rule__StandardBehaviour__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStandardBehaviourAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardBehaviour__Group__0__Impl"


    // $ANTLR start "rule__StandardBehaviour__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2390:1: rule__StandardBehaviour__Group__1 : rule__StandardBehaviour__Group__1__Impl rule__StandardBehaviour__Group__2 ;
    public final void rule__StandardBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2394:1: ( rule__StandardBehaviour__Group__1__Impl rule__StandardBehaviour__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2395:2: rule__StandardBehaviour__Group__1__Impl rule__StandardBehaviour__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group__1__Impl_in_rule__StandardBehaviour__Group__14919);
            rule__StandardBehaviour__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group__2_in_rule__StandardBehaviour__Group__14922);
            rule__StandardBehaviour__Group__2();

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
    // $ANTLR end "rule__StandardBehaviour__Group__1"


    // $ANTLR start "rule__StandardBehaviour__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2402:1: rule__StandardBehaviour__Group__1__Impl : ( ( rule__StandardBehaviour__LabelAssignment_1 )? ) ;
    public final void rule__StandardBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2406:1: ( ( ( rule__StandardBehaviour__LabelAssignment_1 )? ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2407:1: ( ( rule__StandardBehaviour__LabelAssignment_1 )? )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2407:1: ( ( rule__StandardBehaviour__LabelAssignment_1 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2408:1: ( rule__StandardBehaviour__LabelAssignment_1 )?
            {
             before(grammarAccess.getStandardBehaviourAccess().getLabelAssignment_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2409:1: ( rule__StandardBehaviour__LabelAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2409:2: rule__StandardBehaviour__LabelAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__LabelAssignment_1_in_rule__StandardBehaviour__Group__1__Impl4949);
                    rule__StandardBehaviour__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardBehaviourAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardBehaviour__Group__1__Impl"


    // $ANTLR start "rule__StandardBehaviour__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2419:1: rule__StandardBehaviour__Group__2 : rule__StandardBehaviour__Group__2__Impl ;
    public final void rule__StandardBehaviour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2423:1: ( rule__StandardBehaviour__Group__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2424:2: rule__StandardBehaviour__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group__2__Impl_in_rule__StandardBehaviour__Group__24980);
            rule__StandardBehaviour__Group__2__Impl();

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
    // $ANTLR end "rule__StandardBehaviour__Group__2"


    // $ANTLR start "rule__StandardBehaviour__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2430:1: rule__StandardBehaviour__Group__2__Impl : ( ( rule__StandardBehaviour__Group_2__0 )? ) ;
    public final void rule__StandardBehaviour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2434:1: ( ( ( rule__StandardBehaviour__Group_2__0 )? ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2435:1: ( ( rule__StandardBehaviour__Group_2__0 )? )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2435:1: ( ( rule__StandardBehaviour__Group_2__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2436:1: ( rule__StandardBehaviour__Group_2__0 )?
            {
             before(grammarAccess.getStandardBehaviourAccess().getGroup_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2437:1: ( rule__StandardBehaviour__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2437:2: rule__StandardBehaviour__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group_2__0_in_rule__StandardBehaviour__Group__2__Impl5007);
                    rule__StandardBehaviour__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStandardBehaviourAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardBehaviour__Group__2__Impl"


    // $ANTLR start "rule__StandardBehaviour__Group_2__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2453:1: rule__StandardBehaviour__Group_2__0 : rule__StandardBehaviour__Group_2__0__Impl rule__StandardBehaviour__Group_2__1 ;
    public final void rule__StandardBehaviour__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2457:1: ( rule__StandardBehaviour__Group_2__0__Impl rule__StandardBehaviour__Group_2__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2458:2: rule__StandardBehaviour__Group_2__0__Impl rule__StandardBehaviour__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group_2__0__Impl_in_rule__StandardBehaviour__Group_2__05044);
            rule__StandardBehaviour__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group_2__1_in_rule__StandardBehaviour__Group_2__05047);
            rule__StandardBehaviour__Group_2__1();

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
    // $ANTLR end "rule__StandardBehaviour__Group_2__0"


    // $ANTLR start "rule__StandardBehaviour__Group_2__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2465:1: rule__StandardBehaviour__Group_2__0__Impl : ( 'palette' ) ;
    public final void rule__StandardBehaviour__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2469:1: ( ( 'palette' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2470:1: ( 'palette' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2470:1: ( 'palette' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2471:1: 'palette'
            {
             before(grammarAccess.getStandardBehaviourAccess().getPaletteKeyword_2_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__StandardBehaviour__Group_2__0__Impl5075); 
             after(grammarAccess.getStandardBehaviourAccess().getPaletteKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardBehaviour__Group_2__0__Impl"


    // $ANTLR start "rule__StandardBehaviour__Group_2__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2484:1: rule__StandardBehaviour__Group_2__1 : rule__StandardBehaviour__Group_2__1__Impl ;
    public final void rule__StandardBehaviour__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2488:1: ( rule__StandardBehaviour__Group_2__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2489:2: rule__StandardBehaviour__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__Group_2__1__Impl_in_rule__StandardBehaviour__Group_2__15106);
            rule__StandardBehaviour__Group_2__1__Impl();

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
    // $ANTLR end "rule__StandardBehaviour__Group_2__1"


    // $ANTLR start "rule__StandardBehaviour__Group_2__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2495:1: rule__StandardBehaviour__Group_2__1__Impl : ( ( rule__StandardBehaviour__PaletteCompartmentAssignment_2_1 ) ) ;
    public final void rule__StandardBehaviour__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2499:1: ( ( ( rule__StandardBehaviour__PaletteCompartmentAssignment_2_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2500:1: ( ( rule__StandardBehaviour__PaletteCompartmentAssignment_2_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2500:1: ( ( rule__StandardBehaviour__PaletteCompartmentAssignment_2_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2501:1: ( rule__StandardBehaviour__PaletteCompartmentAssignment_2_1 )
            {
             before(grammarAccess.getStandardBehaviourAccess().getPaletteCompartmentAssignment_2_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2502:1: ( rule__StandardBehaviour__PaletteCompartmentAssignment_2_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2502:2: rule__StandardBehaviour__PaletteCompartmentAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__StandardBehaviour__PaletteCompartmentAssignment_2_1_in_rule__StandardBehaviour__Group_2__1__Impl5133);
            rule__StandardBehaviour__PaletteCompartmentAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStandardBehaviourAccess().getPaletteCompartmentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardBehaviour__Group_2__1__Impl"


    // $ANTLR start "rule__CustomBehaviour__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2516:1: rule__CustomBehaviour__Group__0 : rule__CustomBehaviour__Group__0__Impl rule__CustomBehaviour__Group__1 ;
    public final void rule__CustomBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2520:1: ( rule__CustomBehaviour__Group__0__Impl rule__CustomBehaviour__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2521:2: rule__CustomBehaviour__Group__0__Impl rule__CustomBehaviour__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomBehaviour__Group__0__Impl_in_rule__CustomBehaviour__Group__05167);
            rule__CustomBehaviour__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CustomBehaviour__Group__1_in_rule__CustomBehaviour__Group__05170);
            rule__CustomBehaviour__Group__1();

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
    // $ANTLR end "rule__CustomBehaviour__Group__0"


    // $ANTLR start "rule__CustomBehaviour__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2528:1: rule__CustomBehaviour__Group__0__Impl : ( ( rule__CustomBehaviour__NameAssignment_0 ) ) ;
    public final void rule__CustomBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2532:1: ( ( ( rule__CustomBehaviour__NameAssignment_0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2533:1: ( ( rule__CustomBehaviour__NameAssignment_0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2533:1: ( ( rule__CustomBehaviour__NameAssignment_0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2534:1: ( rule__CustomBehaviour__NameAssignment_0 )
            {
             before(grammarAccess.getCustomBehaviourAccess().getNameAssignment_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2535:1: ( rule__CustomBehaviour__NameAssignment_0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2535:2: rule__CustomBehaviour__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomBehaviour__NameAssignment_0_in_rule__CustomBehaviour__Group__0__Impl5197);
            rule__CustomBehaviour__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomBehaviourAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBehaviour__Group__0__Impl"


    // $ANTLR start "rule__CustomBehaviour__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2545:1: rule__CustomBehaviour__Group__1 : rule__CustomBehaviour__Group__1__Impl ;
    public final void rule__CustomBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2549:1: ( rule__CustomBehaviour__Group__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2550:2: rule__CustomBehaviour__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomBehaviour__Group__1__Impl_in_rule__CustomBehaviour__Group__15227);
            rule__CustomBehaviour__Group__1__Impl();

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
    // $ANTLR end "rule__CustomBehaviour__Group__1"


    // $ANTLR start "rule__CustomBehaviour__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2556:1: rule__CustomBehaviour__Group__1__Impl : ( ( rule__CustomBehaviour__LabelAssignment_1 ) ) ;
    public final void rule__CustomBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2560:1: ( ( ( rule__CustomBehaviour__LabelAssignment_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2561:1: ( ( rule__CustomBehaviour__LabelAssignment_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2561:1: ( ( rule__CustomBehaviour__LabelAssignment_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2562:1: ( rule__CustomBehaviour__LabelAssignment_1 )
            {
             before(grammarAccess.getCustomBehaviourAccess().getLabelAssignment_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2563:1: ( rule__CustomBehaviour__LabelAssignment_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2563:2: rule__CustomBehaviour__LabelAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CustomBehaviour__LabelAssignment_1_in_rule__CustomBehaviour__Group__1__Impl5254);
            rule__CustomBehaviour__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomBehaviourAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBehaviour__Group__1__Impl"


    // $ANTLR start "rule__MetaReference2__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2578:1: rule__MetaReference2__Group__0 : rule__MetaReference2__Group__0__Impl rule__MetaReference2__Group__1 ;
    public final void rule__MetaReference2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2582:1: ( rule__MetaReference2__Group__0__Impl rule__MetaReference2__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2583:2: rule__MetaReference2__Group__0__Impl rule__MetaReference2__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReference2__Group__0__Impl_in_rule__MetaReference2__Group__05289);
            rule__MetaReference2__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaReference2__Group__1_in_rule__MetaReference2__Group__05292);
            rule__MetaReference2__Group__1();

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
    // $ANTLR end "rule__MetaReference2__Group__0"


    // $ANTLR start "rule__MetaReference2__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2590:1: rule__MetaReference2__Group__0__Impl : ( ( rule__MetaReference2__NameAssignment_0 ) ) ;
    public final void rule__MetaReference2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2594:1: ( ( ( rule__MetaReference2__NameAssignment_0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2595:1: ( ( rule__MetaReference2__NameAssignment_0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2595:1: ( ( rule__MetaReference2__NameAssignment_0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2596:1: ( rule__MetaReference2__NameAssignment_0 )
            {
             before(grammarAccess.getMetaReference2Access().getNameAssignment_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2597:1: ( rule__MetaReference2__NameAssignment_0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2597:2: rule__MetaReference2__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReference2__NameAssignment_0_in_rule__MetaReference2__Group__0__Impl5319);
            rule__MetaReference2__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetaReference2Access().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReference2__Group__0__Impl"


    // $ANTLR start "rule__MetaReference2__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2607:1: rule__MetaReference2__Group__1 : rule__MetaReference2__Group__1__Impl rule__MetaReference2__Group__2 ;
    public final void rule__MetaReference2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2611:1: ( rule__MetaReference2__Group__1__Impl rule__MetaReference2__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2612:2: rule__MetaReference2__Group__1__Impl rule__MetaReference2__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReference2__Group__1__Impl_in_rule__MetaReference2__Group__15349);
            rule__MetaReference2__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaReference2__Group__2_in_rule__MetaReference2__Group__15352);
            rule__MetaReference2__Group__2();

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
    // $ANTLR end "rule__MetaReference2__Group__1"


    // $ANTLR start "rule__MetaReference2__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2619:1: rule__MetaReference2__Group__1__Impl : ( ':' ) ;
    public final void rule__MetaReference2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2623:1: ( ( ':' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2624:1: ( ':' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2624:1: ( ':' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2625:1: ':'
            {
             before(grammarAccess.getMetaReference2Access().getColonKeyword_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__MetaReference2__Group__1__Impl5380); 
             after(grammarAccess.getMetaReference2Access().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReference2__Group__1__Impl"


    // $ANTLR start "rule__MetaReference2__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2638:1: rule__MetaReference2__Group__2 : rule__MetaReference2__Group__2__Impl ;
    public final void rule__MetaReference2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2642:1: ( rule__MetaReference2__Group__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2643:2: rule__MetaReference2__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReference2__Group__2__Impl_in_rule__MetaReference2__Group__25411);
            rule__MetaReference2__Group__2__Impl();

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
    // $ANTLR end "rule__MetaReference2__Group__2"


    // $ANTLR start "rule__MetaReference2__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2649:1: rule__MetaReference2__Group__2__Impl : ( ( rule__MetaReference2__RepresentedByAssignment_2 ) ) ;
    public final void rule__MetaReference2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2653:1: ( ( ( rule__MetaReference2__RepresentedByAssignment_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2654:1: ( ( rule__MetaReference2__RepresentedByAssignment_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2654:1: ( ( rule__MetaReference2__RepresentedByAssignment_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2655:1: ( rule__MetaReference2__RepresentedByAssignment_2 )
            {
             before(grammarAccess.getMetaReference2Access().getRepresentedByAssignment_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2656:1: ( rule__MetaReference2__RepresentedByAssignment_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2656:2: rule__MetaReference2__RepresentedByAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReference2__RepresentedByAssignment_2_in_rule__MetaReference2__Group__2__Impl5438);
            rule__MetaReference2__RepresentedByAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetaReference2Access().getRepresentedByAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReference2__Group__2__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2672:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2676:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2677:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__05474);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__05477);
            rule__Layout__Group__1();

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
    // $ANTLR end "rule__Layout__Group__0"


    // $ANTLR start "rule__Layout__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2684:1: rule__Layout__Group__0__Impl : ( () ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2688:1: ( ( () ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2689:1: ( () )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2689:1: ( () )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2690:1: ()
            {
             before(grammarAccess.getLayoutAccess().getLayoutAction_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2691:1: ()
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2693:1: 
            {
            }

             after(grammarAccess.getLayoutAccess().getLayoutAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2703:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2707:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2708:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__15535);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__15538);
            rule__Layout__Group__2();

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
    // $ANTLR end "rule__Layout__Group__1"


    // $ANTLR start "rule__Layout__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2715:1: rule__Layout__Group__1__Impl : ( '(' ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2719:1: ( ( '(' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2720:1: ( '(' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2720:1: ( '(' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2721:1: '('
            {
             before(grammarAccess.getLayoutAccess().getLeftParenthesisKeyword_1()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Layout__Group__1__Impl5566); 
             after(grammarAccess.getLayoutAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1__Impl"


    // $ANTLR start "rule__Layout__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2734:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2738:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2739:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__25597);
            rule__Layout__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__25600);
            rule__Layout__Group__3();

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
    // $ANTLR end "rule__Layout__Group__2"


    // $ANTLR start "rule__Layout__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2746:1: rule__Layout__Group__2__Impl : ( ( rule__Layout__UnorderedGroup_2 ) ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2750:1: ( ( ( rule__Layout__UnorderedGroup_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2751:1: ( ( rule__Layout__UnorderedGroup_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2751:1: ( ( rule__Layout__UnorderedGroup_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2752:1: ( rule__Layout__UnorderedGroup_2 )
            {
             before(grammarAccess.getLayoutAccess().getUnorderedGroup_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2753:1: ( rule__Layout__UnorderedGroup_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2753:2: rule__Layout__UnorderedGroup_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2_in_rule__Layout__Group__2__Impl5627);
            rule__Layout__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2__Impl"


    // $ANTLR start "rule__Layout__Group__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2763:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2767:1: ( rule__Layout__Group__3__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2768:2: rule__Layout__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__35657);
            rule__Layout__Group__3__Impl();

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
    // $ANTLR end "rule__Layout__Group__3"


    // $ANTLR start "rule__Layout__Group__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2774:1: rule__Layout__Group__3__Impl : ( ')' ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2778:1: ( ( ')' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2779:1: ( ')' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2779:1: ( ')' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2780:1: ')'
            {
             before(grammarAccess.getLayoutAccess().getRightParenthesisKeyword_3()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__Layout__Group__3__Impl5685); 
             after(grammarAccess.getLayoutAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__3__Impl"


    // $ANTLR start "rule__Layout__Group_2_0__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2801:1: rule__Layout__Group_2_0__0 : rule__Layout__Group_2_0__0__Impl rule__Layout__Group_2_0__1 ;
    public final void rule__Layout__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2805:1: ( rule__Layout__Group_2_0__0__Impl rule__Layout__Group_2_0__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2806:2: rule__Layout__Group_2_0__0__Impl rule__Layout__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_0__0__Impl_in_rule__Layout__Group_2_0__05724);
            rule__Layout__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_0__1_in_rule__Layout__Group_2_0__05727);
            rule__Layout__Group_2_0__1();

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
    // $ANTLR end "rule__Layout__Group_2_0__0"


    // $ANTLR start "rule__Layout__Group_2_0__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2813:1: rule__Layout__Group_2_0__0__Impl : ( 'width' ) ;
    public final void rule__Layout__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2817:1: ( ( 'width' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2818:1: ( 'width' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2818:1: ( 'width' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2819:1: 'width'
            {
             before(grammarAccess.getLayoutAccess().getWidthKeyword_2_0_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__Layout__Group_2_0__0__Impl5755); 
             after(grammarAccess.getLayoutAccess().getWidthKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_0__0__Impl"


    // $ANTLR start "rule__Layout__Group_2_0__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2832:1: rule__Layout__Group_2_0__1 : rule__Layout__Group_2_0__1__Impl rule__Layout__Group_2_0__2 ;
    public final void rule__Layout__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2836:1: ( rule__Layout__Group_2_0__1__Impl rule__Layout__Group_2_0__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2837:2: rule__Layout__Group_2_0__1__Impl rule__Layout__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_0__1__Impl_in_rule__Layout__Group_2_0__15786);
            rule__Layout__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_0__2_in_rule__Layout__Group_2_0__15789);
            rule__Layout__Group_2_0__2();

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
    // $ANTLR end "rule__Layout__Group_2_0__1"


    // $ANTLR start "rule__Layout__Group_2_0__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2844:1: rule__Layout__Group_2_0__1__Impl : ( '=' ) ;
    public final void rule__Layout__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2848:1: ( ( '=' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2849:1: ( '=' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2849:1: ( '=' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2850:1: '='
            {
             before(grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_0_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Layout__Group_2_0__1__Impl5817); 
             after(grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_0__1__Impl"


    // $ANTLR start "rule__Layout__Group_2_0__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2863:1: rule__Layout__Group_2_0__2 : rule__Layout__Group_2_0__2__Impl ;
    public final void rule__Layout__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2867:1: ( rule__Layout__Group_2_0__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2868:2: rule__Layout__Group_2_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_0__2__Impl_in_rule__Layout__Group_2_0__25848);
            rule__Layout__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__Layout__Group_2_0__2"


    // $ANTLR start "rule__Layout__Group_2_0__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2874:1: rule__Layout__Group_2_0__2__Impl : ( ( rule__Layout__LineWidthAssignment_2_0_2 ) ) ;
    public final void rule__Layout__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2878:1: ( ( ( rule__Layout__LineWidthAssignment_2_0_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2879:1: ( ( rule__Layout__LineWidthAssignment_2_0_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2879:1: ( ( rule__Layout__LineWidthAssignment_2_0_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2880:1: ( rule__Layout__LineWidthAssignment_2_0_2 )
            {
             before(grammarAccess.getLayoutAccess().getLineWidthAssignment_2_0_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2881:1: ( rule__Layout__LineWidthAssignment_2_0_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2881:2: rule__Layout__LineWidthAssignment_2_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__LineWidthAssignment_2_0_2_in_rule__Layout__Group_2_0__2__Impl5875);
            rule__Layout__LineWidthAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getLineWidthAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_0__2__Impl"


    // $ANTLR start "rule__Layout__Group_2_1__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2897:1: rule__Layout__Group_2_1__0 : rule__Layout__Group_2_1__0__Impl rule__Layout__Group_2_1__1 ;
    public final void rule__Layout__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2901:1: ( rule__Layout__Group_2_1__0__Impl rule__Layout__Group_2_1__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2902:2: rule__Layout__Group_2_1__0__Impl rule__Layout__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_1__0__Impl_in_rule__Layout__Group_2_1__05911);
            rule__Layout__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_1__1_in_rule__Layout__Group_2_1__05914);
            rule__Layout__Group_2_1__1();

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
    // $ANTLR end "rule__Layout__Group_2_1__0"


    // $ANTLR start "rule__Layout__Group_2_1__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2909:1: rule__Layout__Group_2_1__0__Impl : ( 'color' ) ;
    public final void rule__Layout__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2913:1: ( ( 'color' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2914:1: ( 'color' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2914:1: ( 'color' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2915:1: 'color'
            {
             before(grammarAccess.getLayoutAccess().getColorKeyword_2_1_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Layout__Group_2_1__0__Impl5942); 
             after(grammarAccess.getLayoutAccess().getColorKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_1__0__Impl"


    // $ANTLR start "rule__Layout__Group_2_1__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2928:1: rule__Layout__Group_2_1__1 : rule__Layout__Group_2_1__1__Impl rule__Layout__Group_2_1__2 ;
    public final void rule__Layout__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2932:1: ( rule__Layout__Group_2_1__1__Impl rule__Layout__Group_2_1__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2933:2: rule__Layout__Group_2_1__1__Impl rule__Layout__Group_2_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_1__1__Impl_in_rule__Layout__Group_2_1__15973);
            rule__Layout__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_1__2_in_rule__Layout__Group_2_1__15976);
            rule__Layout__Group_2_1__2();

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
    // $ANTLR end "rule__Layout__Group_2_1__1"


    // $ANTLR start "rule__Layout__Group_2_1__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2940:1: rule__Layout__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__Layout__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2944:1: ( ( '=' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2945:1: ( '=' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2945:1: ( '=' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2946:1: '='
            {
             before(grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_1_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Layout__Group_2_1__1__Impl6004); 
             after(grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_1__1__Impl"


    // $ANTLR start "rule__Layout__Group_2_1__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2959:1: rule__Layout__Group_2_1__2 : rule__Layout__Group_2_1__2__Impl ;
    public final void rule__Layout__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2963:1: ( rule__Layout__Group_2_1__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2964:2: rule__Layout__Group_2_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_1__2__Impl_in_rule__Layout__Group_2_1__26035);
            rule__Layout__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__Layout__Group_2_1__2"


    // $ANTLR start "rule__Layout__Group_2_1__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2970:1: rule__Layout__Group_2_1__2__Impl : ( ( rule__Layout__LineColorAssignment_2_1_2 ) ) ;
    public final void rule__Layout__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2974:1: ( ( ( rule__Layout__LineColorAssignment_2_1_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2975:1: ( ( rule__Layout__LineColorAssignment_2_1_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2975:1: ( ( rule__Layout__LineColorAssignment_2_1_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2976:1: ( rule__Layout__LineColorAssignment_2_1_2 )
            {
             before(grammarAccess.getLayoutAccess().getLineColorAssignment_2_1_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2977:1: ( rule__Layout__LineColorAssignment_2_1_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2977:2: rule__Layout__LineColorAssignment_2_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__LineColorAssignment_2_1_2_in_rule__Layout__Group_2_1__2__Impl6062);
            rule__Layout__LineColorAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getLineColorAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_1__2__Impl"


    // $ANTLR start "rule__Layout__Group_2_2__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2993:1: rule__Layout__Group_2_2__0 : rule__Layout__Group_2_2__0__Impl rule__Layout__Group_2_2__1 ;
    public final void rule__Layout__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2997:1: ( rule__Layout__Group_2_2__0__Impl rule__Layout__Group_2_2__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:2998:2: rule__Layout__Group_2_2__0__Impl rule__Layout__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_2__0__Impl_in_rule__Layout__Group_2_2__06098);
            rule__Layout__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_2__1_in_rule__Layout__Group_2_2__06101);
            rule__Layout__Group_2_2__1();

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
    // $ANTLR end "rule__Layout__Group_2_2__0"


    // $ANTLR start "rule__Layout__Group_2_2__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3005:1: rule__Layout__Group_2_2__0__Impl : ( 'fill' ) ;
    public final void rule__Layout__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3009:1: ( ( 'fill' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3010:1: ( 'fill' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3010:1: ( 'fill' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3011:1: 'fill'
            {
             before(grammarAccess.getLayoutAccess().getFillKeyword_2_2_0()); 
            match(input,50,FollowSets000.FOLLOW_50_in_rule__Layout__Group_2_2__0__Impl6129); 
             after(grammarAccess.getLayoutAccess().getFillKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_2__0__Impl"


    // $ANTLR start "rule__Layout__Group_2_2__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3024:1: rule__Layout__Group_2_2__1 : rule__Layout__Group_2_2__1__Impl rule__Layout__Group_2_2__2 ;
    public final void rule__Layout__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3028:1: ( rule__Layout__Group_2_2__1__Impl rule__Layout__Group_2_2__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3029:2: rule__Layout__Group_2_2__1__Impl rule__Layout__Group_2_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_2__1__Impl_in_rule__Layout__Group_2_2__16160);
            rule__Layout__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_2__2_in_rule__Layout__Group_2_2__16163);
            rule__Layout__Group_2_2__2();

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
    // $ANTLR end "rule__Layout__Group_2_2__1"


    // $ANTLR start "rule__Layout__Group_2_2__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3036:1: rule__Layout__Group_2_2__1__Impl : ( '=' ) ;
    public final void rule__Layout__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3040:1: ( ( '=' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3041:1: ( '=' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3041:1: ( '=' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3042:1: '='
            {
             before(grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_2_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Layout__Group_2_2__1__Impl6191); 
             after(grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_2__1__Impl"


    // $ANTLR start "rule__Layout__Group_2_2__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3055:1: rule__Layout__Group_2_2__2 : rule__Layout__Group_2_2__2__Impl ;
    public final void rule__Layout__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3059:1: ( rule__Layout__Group_2_2__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3060:2: rule__Layout__Group_2_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_2__2__Impl_in_rule__Layout__Group_2_2__26222);
            rule__Layout__Group_2_2__2__Impl();

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
    // $ANTLR end "rule__Layout__Group_2_2__2"


    // $ANTLR start "rule__Layout__Group_2_2__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3066:1: rule__Layout__Group_2_2__2__Impl : ( ( rule__Layout__FillColorAssignment_2_2_2 ) ) ;
    public final void rule__Layout__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3070:1: ( ( ( rule__Layout__FillColorAssignment_2_2_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3071:1: ( ( rule__Layout__FillColorAssignment_2_2_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3071:1: ( ( rule__Layout__FillColorAssignment_2_2_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3072:1: ( rule__Layout__FillColorAssignment_2_2_2 )
            {
             before(grammarAccess.getLayoutAccess().getFillColorAssignment_2_2_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3073:1: ( rule__Layout__FillColorAssignment_2_2_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3073:2: rule__Layout__FillColorAssignment_2_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__FillColorAssignment_2_2_2_in_rule__Layout__Group_2_2__2__Impl6249);
            rule__Layout__FillColorAssignment_2_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getFillColorAssignment_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_2__2__Impl"


    // $ANTLR start "rule__Layout__Group_2_3__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3089:1: rule__Layout__Group_2_3__0 : rule__Layout__Group_2_3__0__Impl rule__Layout__Group_2_3__1 ;
    public final void rule__Layout__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3093:1: ( rule__Layout__Group_2_3__0__Impl rule__Layout__Group_2_3__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3094:2: rule__Layout__Group_2_3__0__Impl rule__Layout__Group_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_3__0__Impl_in_rule__Layout__Group_2_3__06285);
            rule__Layout__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_3__1_in_rule__Layout__Group_2_3__06288);
            rule__Layout__Group_2_3__1();

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
    // $ANTLR end "rule__Layout__Group_2_3__0"


    // $ANTLR start "rule__Layout__Group_2_3__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3101:1: rule__Layout__Group_2_3__0__Impl : ( 'figure' ) ;
    public final void rule__Layout__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3105:1: ( ( 'figure' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3106:1: ( 'figure' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3106:1: ( 'figure' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3107:1: 'figure'
            {
             before(grammarAccess.getLayoutAccess().getFigureKeyword_2_3_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Layout__Group_2_3__0__Impl6316); 
             after(grammarAccess.getLayoutAccess().getFigureKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_3__0__Impl"


    // $ANTLR start "rule__Layout__Group_2_3__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3120:1: rule__Layout__Group_2_3__1 : rule__Layout__Group_2_3__1__Impl rule__Layout__Group_2_3__2 ;
    public final void rule__Layout__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3124:1: ( rule__Layout__Group_2_3__1__Impl rule__Layout__Group_2_3__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3125:2: rule__Layout__Group_2_3__1__Impl rule__Layout__Group_2_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_3__1__Impl_in_rule__Layout__Group_2_3__16347);
            rule__Layout__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_3__2_in_rule__Layout__Group_2_3__16350);
            rule__Layout__Group_2_3__2();

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
    // $ANTLR end "rule__Layout__Group_2_3__1"


    // $ANTLR start "rule__Layout__Group_2_3__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3132:1: rule__Layout__Group_2_3__1__Impl : ( '=' ) ;
    public final void rule__Layout__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3136:1: ( ( '=' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3137:1: ( '=' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3137:1: ( '=' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3138:1: '='
            {
             before(grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_3_1()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Layout__Group_2_3__1__Impl6378); 
             after(grammarAccess.getLayoutAccess().getEqualsSignKeyword_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_3__1__Impl"


    // $ANTLR start "rule__Layout__Group_2_3__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3151:1: rule__Layout__Group_2_3__2 : rule__Layout__Group_2_3__2__Impl ;
    public final void rule__Layout__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3155:1: ( rule__Layout__Group_2_3__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3156:2: rule__Layout__Group_2_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_3__2__Impl_in_rule__Layout__Group_2_3__26409);
            rule__Layout__Group_2_3__2__Impl();

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
    // $ANTLR end "rule__Layout__Group_2_3__2"


    // $ANTLR start "rule__Layout__Group_2_3__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3162:1: rule__Layout__Group_2_3__2__Impl : ( ( rule__Layout__FigureAssignment_2_3_2 ) ) ;
    public final void rule__Layout__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3166:1: ( ( ( rule__Layout__FigureAssignment_2_3_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3167:1: ( ( rule__Layout__FigureAssignment_2_3_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3167:1: ( ( rule__Layout__FigureAssignment_2_3_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3168:1: ( rule__Layout__FigureAssignment_2_3_2 )
            {
             before(grammarAccess.getLayoutAccess().getFigureAssignment_2_3_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3169:1: ( rule__Layout__FigureAssignment_2_3_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3169:2: rule__Layout__FigureAssignment_2_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__FigureAssignment_2_3_2_in_rule__Layout__Group_2_3__2__Impl6436);
            rule__Layout__FigureAssignment_2_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getFigureAssignment_2_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_2_3__2__Impl"


    // $ANTLR start "rule__Rectangle__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3185:1: rule__Rectangle__Group__0 : rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 ;
    public final void rule__Rectangle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3189:1: ( rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3190:2: rule__Rectangle__Group__0__Impl rule__Rectangle__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rectangle__Group__0__Impl_in_rule__Rectangle__Group__06472);
            rule__Rectangle__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rectangle__Group__1_in_rule__Rectangle__Group__06475);
            rule__Rectangle__Group__1();

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
    // $ANTLR end "rule__Rectangle__Group__0"


    // $ANTLR start "rule__Rectangle__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3197:1: rule__Rectangle__Group__0__Impl : ( () ) ;
    public final void rule__Rectangle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3201:1: ( ( () ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3202:1: ( () )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3202:1: ( () )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3203:1: ()
            {
             before(grammarAccess.getRectangleAccess().getRectangleAction_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3204:1: ()
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3206:1: 
            {
            }

             after(grammarAccess.getRectangleAccess().getRectangleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__0__Impl"


    // $ANTLR start "rule__Rectangle__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3216:1: rule__Rectangle__Group__1 : rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 ;
    public final void rule__Rectangle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3220:1: ( rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3221:2: rule__Rectangle__Group__1__Impl rule__Rectangle__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rectangle__Group__1__Impl_in_rule__Rectangle__Group__16533);
            rule__Rectangle__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rectangle__Group__2_in_rule__Rectangle__Group__16536);
            rule__Rectangle__Group__2();

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
    // $ANTLR end "rule__Rectangle__Group__1"


    // $ANTLR start "rule__Rectangle__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3228:1: rule__Rectangle__Group__1__Impl : ( 'rectangle' ) ;
    public final void rule__Rectangle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3232:1: ( ( 'rectangle' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3233:1: ( 'rectangle' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3233:1: ( 'rectangle' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3234:1: 'rectangle'
            {
             before(grammarAccess.getRectangleAccess().getRectangleKeyword_1()); 
            match(input,52,FollowSets000.FOLLOW_52_in_rule__Rectangle__Group__1__Impl6564); 
             after(grammarAccess.getRectangleAccess().getRectangleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__1__Impl"


    // $ANTLR start "rule__Rectangle__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3247:1: rule__Rectangle__Group__2 : rule__Rectangle__Group__2__Impl ;
    public final void rule__Rectangle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3251:1: ( rule__Rectangle__Group__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3252:2: rule__Rectangle__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rectangle__Group__2__Impl_in_rule__Rectangle__Group__26595);
            rule__Rectangle__Group__2__Impl();

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
    // $ANTLR end "rule__Rectangle__Group__2"


    // $ANTLR start "rule__Rectangle__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3258:1: rule__Rectangle__Group__2__Impl : ( ( rule__Rectangle__LayoutAssignment_2 ) ) ;
    public final void rule__Rectangle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3262:1: ( ( ( rule__Rectangle__LayoutAssignment_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3263:1: ( ( rule__Rectangle__LayoutAssignment_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3263:1: ( ( rule__Rectangle__LayoutAssignment_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3264:1: ( rule__Rectangle__LayoutAssignment_2 )
            {
             before(grammarAccess.getRectangleAccess().getLayoutAssignment_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3265:1: ( rule__Rectangle__LayoutAssignment_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3265:2: rule__Rectangle__LayoutAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rectangle__LayoutAssignment_2_in_rule__Rectangle__Group__2__Impl6622);
            rule__Rectangle__LayoutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRectangleAccess().getLayoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3281:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3285:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3286:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__06658);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__06661);
            rule__Connection__Group__1();

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
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3293:1: rule__Connection__Group__0__Impl : ( () ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3297:1: ( ( () ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3298:1: ( () )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3298:1: ( () )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3299:1: ()
            {
             before(grammarAccess.getConnectionAccess().getConnectionAction_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3300:1: ()
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3302:1: 
            {
            }

             after(grammarAccess.getConnectionAccess().getConnectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3312:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3316:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3317:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__16719);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__16722);
            rule__Connection__Group__2();

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
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3324:1: rule__Connection__Group__1__Impl : ( 'connection' ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3328:1: ( ( 'connection' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3329:1: ( 'connection' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3329:1: ( 'connection' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3330:1: 'connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 
            match(input,53,FollowSets000.FOLLOW_53_in_rule__Connection__Group__1__Impl6750); 
             after(grammarAccess.getConnectionAccess().getConnectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3343:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3347:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3348:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__26781);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__26784);
            rule__Connection__Group__3();

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
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3355:1: rule__Connection__Group__2__Impl : ( ( rule__Connection__LayoutAssignment_2 ) ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3359:1: ( ( ( rule__Connection__LayoutAssignment_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3360:1: ( ( rule__Connection__LayoutAssignment_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3360:1: ( ( rule__Connection__LayoutAssignment_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3361:1: ( rule__Connection__LayoutAssignment_2 )
            {
             before(grammarAccess.getConnectionAccess().getLayoutAssignment_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3362:1: ( rule__Connection__LayoutAssignment_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3362:2: rule__Connection__LayoutAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__LayoutAssignment_2_in_rule__Connection__Group__2__Impl6811);
            rule__Connection__LayoutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getLayoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3372:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3376:1: ( rule__Connection__Group__3__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3377:2: rule__Connection__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__36841);
            rule__Connection__Group__3__Impl();

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
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3383:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__Group_3__0 )? ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3387:1: ( ( ( rule__Connection__Group_3__0 )? ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3388:1: ( ( rule__Connection__Group_3__0 )? )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3388:1: ( ( rule__Connection__Group_3__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3389:1: ( rule__Connection__Group_3__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_3()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3390:1: ( rule__Connection__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3390:2: rule__Connection__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__0_in_rule__Connection__Group__3__Impl6868);
                    rule__Connection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group_3__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3408:1: rule__Connection__Group_3__0 : rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 ;
    public final void rule__Connection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3412:1: ( rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3413:2: rule__Connection__Group_3__0__Impl rule__Connection__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__0__Impl_in_rule__Connection__Group_3__06907);
            rule__Connection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__1_in_rule__Connection__Group_3__06910);
            rule__Connection__Group_3__1();

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
    // $ANTLR end "rule__Connection__Group_3__0"


    // $ANTLR start "rule__Connection__Group_3__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3420:1: rule__Connection__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Connection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3424:1: ( ( '[' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3425:1: ( '[' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3425:1: ( '[' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3426:1: '['
            {
             before(grammarAccess.getConnectionAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Connection__Group_3__0__Impl6938); 
             after(grammarAccess.getConnectionAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__0__Impl"


    // $ANTLR start "rule__Connection__Group_3__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3439:1: rule__Connection__Group_3__1 : rule__Connection__Group_3__1__Impl rule__Connection__Group_3__2 ;
    public final void rule__Connection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3443:1: ( rule__Connection__Group_3__1__Impl rule__Connection__Group_3__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3444:2: rule__Connection__Group_3__1__Impl rule__Connection__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__1__Impl_in_rule__Connection__Group_3__16969);
            rule__Connection__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__2_in_rule__Connection__Group_3__16972);
            rule__Connection__Group_3__2();

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
    // $ANTLR end "rule__Connection__Group_3__1"


    // $ANTLR start "rule__Connection__Group_3__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3451:1: rule__Connection__Group_3__1__Impl : ( 'from' ) ;
    public final void rule__Connection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3455:1: ( ( 'from' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3456:1: ( 'from' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3456:1: ( 'from' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3457:1: 'from'
            {
             before(grammarAccess.getConnectionAccess().getFromKeyword_3_1()); 
            match(input,54,FollowSets000.FOLLOW_54_in_rule__Connection__Group_3__1__Impl7000); 
             after(grammarAccess.getConnectionAccess().getFromKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__1__Impl"


    // $ANTLR start "rule__Connection__Group_3__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3470:1: rule__Connection__Group_3__2 : rule__Connection__Group_3__2__Impl rule__Connection__Group_3__3 ;
    public final void rule__Connection__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3474:1: ( rule__Connection__Group_3__2__Impl rule__Connection__Group_3__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3475:2: rule__Connection__Group_3__2__Impl rule__Connection__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__2__Impl_in_rule__Connection__Group_3__27031);
            rule__Connection__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__3_in_rule__Connection__Group_3__27034);
            rule__Connection__Group_3__3();

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
    // $ANTLR end "rule__Connection__Group_3__2"


    // $ANTLR start "rule__Connection__Group_3__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3482:1: rule__Connection__Group_3__2__Impl : ( ( rule__Connection__FromAssignment_3_2 ) ) ;
    public final void rule__Connection__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3486:1: ( ( ( rule__Connection__FromAssignment_3_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3487:1: ( ( rule__Connection__FromAssignment_3_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3487:1: ( ( rule__Connection__FromAssignment_3_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3488:1: ( rule__Connection__FromAssignment_3_2 )
            {
             before(grammarAccess.getConnectionAccess().getFromAssignment_3_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3489:1: ( rule__Connection__FromAssignment_3_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3489:2: rule__Connection__FromAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__FromAssignment_3_2_in_rule__Connection__Group_3__2__Impl7061);
            rule__Connection__FromAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getFromAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__2__Impl"


    // $ANTLR start "rule__Connection__Group_3__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3499:1: rule__Connection__Group_3__3 : rule__Connection__Group_3__3__Impl rule__Connection__Group_3__4 ;
    public final void rule__Connection__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3503:1: ( rule__Connection__Group_3__3__Impl rule__Connection__Group_3__4 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3504:2: rule__Connection__Group_3__3__Impl rule__Connection__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__3__Impl_in_rule__Connection__Group_3__37091);
            rule__Connection__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__4_in_rule__Connection__Group_3__37094);
            rule__Connection__Group_3__4();

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
    // $ANTLR end "rule__Connection__Group_3__3"


    // $ANTLR start "rule__Connection__Group_3__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3511:1: rule__Connection__Group_3__3__Impl : ( ';' ) ;
    public final void rule__Connection__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3515:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3516:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3516:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3517:1: ';'
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_3()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Connection__Group_3__3__Impl7122); 
             after(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__3__Impl"


    // $ANTLR start "rule__Connection__Group_3__4"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3530:1: rule__Connection__Group_3__4 : rule__Connection__Group_3__4__Impl rule__Connection__Group_3__5 ;
    public final void rule__Connection__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3534:1: ( rule__Connection__Group_3__4__Impl rule__Connection__Group_3__5 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3535:2: rule__Connection__Group_3__4__Impl rule__Connection__Group_3__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__4__Impl_in_rule__Connection__Group_3__47153);
            rule__Connection__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__5_in_rule__Connection__Group_3__47156);
            rule__Connection__Group_3__5();

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
    // $ANTLR end "rule__Connection__Group_3__4"


    // $ANTLR start "rule__Connection__Group_3__4__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3542:1: rule__Connection__Group_3__4__Impl : ( 'to' ) ;
    public final void rule__Connection__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3546:1: ( ( 'to' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3547:1: ( 'to' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3547:1: ( 'to' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3548:1: 'to'
            {
             before(grammarAccess.getConnectionAccess().getToKeyword_3_4()); 
            match(input,55,FollowSets000.FOLLOW_55_in_rule__Connection__Group_3__4__Impl7184); 
             after(grammarAccess.getConnectionAccess().getToKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__4__Impl"


    // $ANTLR start "rule__Connection__Group_3__5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3561:1: rule__Connection__Group_3__5 : rule__Connection__Group_3__5__Impl rule__Connection__Group_3__6 ;
    public final void rule__Connection__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3565:1: ( rule__Connection__Group_3__5__Impl rule__Connection__Group_3__6 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3566:2: rule__Connection__Group_3__5__Impl rule__Connection__Group_3__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__5__Impl_in_rule__Connection__Group_3__57215);
            rule__Connection__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__6_in_rule__Connection__Group_3__57218);
            rule__Connection__Group_3__6();

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
    // $ANTLR end "rule__Connection__Group_3__5"


    // $ANTLR start "rule__Connection__Group_3__5__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3573:1: rule__Connection__Group_3__5__Impl : ( ( rule__Connection__ToAssignment_3_5 ) ) ;
    public final void rule__Connection__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3577:1: ( ( ( rule__Connection__ToAssignment_3_5 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3578:1: ( ( rule__Connection__ToAssignment_3_5 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3578:1: ( ( rule__Connection__ToAssignment_3_5 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3579:1: ( rule__Connection__ToAssignment_3_5 )
            {
             before(grammarAccess.getConnectionAccess().getToAssignment_3_5()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3580:1: ( rule__Connection__ToAssignment_3_5 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3580:2: rule__Connection__ToAssignment_3_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__ToAssignment_3_5_in_rule__Connection__Group_3__5__Impl7245);
            rule__Connection__ToAssignment_3_5();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getToAssignment_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__5__Impl"


    // $ANTLR start "rule__Connection__Group_3__6"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3590:1: rule__Connection__Group_3__6 : rule__Connection__Group_3__6__Impl rule__Connection__Group_3__7 ;
    public final void rule__Connection__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3594:1: ( rule__Connection__Group_3__6__Impl rule__Connection__Group_3__7 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3595:2: rule__Connection__Group_3__6__Impl rule__Connection__Group_3__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__6__Impl_in_rule__Connection__Group_3__67275);
            rule__Connection__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__7_in_rule__Connection__Group_3__67278);
            rule__Connection__Group_3__7();

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
    // $ANTLR end "rule__Connection__Group_3__6"


    // $ANTLR start "rule__Connection__Group_3__6__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3602:1: rule__Connection__Group_3__6__Impl : ( ';' ) ;
    public final void rule__Connection__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3606:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3607:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3607:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3608:1: ';'
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_6()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Connection__Group_3__6__Impl7306); 
             after(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__6__Impl"


    // $ANTLR start "rule__Connection__Group_3__7"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3621:1: rule__Connection__Group_3__7 : rule__Connection__Group_3__7__Impl rule__Connection__Group_3__8 ;
    public final void rule__Connection__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3625:1: ( rule__Connection__Group_3__7__Impl rule__Connection__Group_3__8 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3626:2: rule__Connection__Group_3__7__Impl rule__Connection__Group_3__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__7__Impl_in_rule__Connection__Group_3__77337);
            rule__Connection__Group_3__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__8_in_rule__Connection__Group_3__77340);
            rule__Connection__Group_3__8();

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
    // $ANTLR end "rule__Connection__Group_3__7"


    // $ANTLR start "rule__Connection__Group_3__7__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3633:1: rule__Connection__Group_3__7__Impl : ( ( rule__Connection__UnorderedGroup_3_7 ) ) ;
    public final void rule__Connection__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3637:1: ( ( ( rule__Connection__UnorderedGroup_3_7 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3638:1: ( ( rule__Connection__UnorderedGroup_3_7 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3638:1: ( ( rule__Connection__UnorderedGroup_3_7 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3639:1: ( rule__Connection__UnorderedGroup_3_7 )
            {
             before(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3640:1: ( rule__Connection__UnorderedGroup_3_7 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3640:2: rule__Connection__UnorderedGroup_3_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__UnorderedGroup_3_7_in_rule__Connection__Group_3__7__Impl7367);
            rule__Connection__UnorderedGroup_3_7();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__7__Impl"


    // $ANTLR start "rule__Connection__Group_3__8"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3650:1: rule__Connection__Group_3__8 : rule__Connection__Group_3__8__Impl ;
    public final void rule__Connection__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3654:1: ( rule__Connection__Group_3__8__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3655:2: rule__Connection__Group_3__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3__8__Impl_in_rule__Connection__Group_3__87397);
            rule__Connection__Group_3__8__Impl();

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
    // $ANTLR end "rule__Connection__Group_3__8"


    // $ANTLR start "rule__Connection__Group_3__8__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3661:1: rule__Connection__Group_3__8__Impl : ( ']' ) ;
    public final void rule__Connection__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3665:1: ( ( ']' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3666:1: ( ']' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3666:1: ( ']' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3667:1: ']'
            {
             before(grammarAccess.getConnectionAccess().getRightSquareBracketKeyword_3_8()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Connection__Group_3__8__Impl7425); 
             after(grammarAccess.getConnectionAccess().getRightSquareBracketKeyword_3_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3__8__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_0__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3698:1: rule__Connection__Group_3_7_0__0 : rule__Connection__Group_3_7_0__0__Impl rule__Connection__Group_3_7_0__1 ;
    public final void rule__Connection__Group_3_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3702:1: ( rule__Connection__Group_3_7_0__0__Impl rule__Connection__Group_3_7_0__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3703:2: rule__Connection__Group_3_7_0__0__Impl rule__Connection__Group_3_7_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_0__0__Impl_in_rule__Connection__Group_3_7_0__07474);
            rule__Connection__Group_3_7_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_0__1_in_rule__Connection__Group_3_7_0__07477);
            rule__Connection__Group_3_7_0__1();

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
    // $ANTLR end "rule__Connection__Group_3_7_0__0"


    // $ANTLR start "rule__Connection__Group_3_7_0__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3710:1: rule__Connection__Group_3_7_0__0__Impl : ( 'fromText' ) ;
    public final void rule__Connection__Group_3_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3714:1: ( ( 'fromText' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3715:1: ( 'fromText' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3715:1: ( 'fromText' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3716:1: 'fromText'
            {
             before(grammarAccess.getConnectionAccess().getFromTextKeyword_3_7_0_0()); 
            match(input,56,FollowSets000.FOLLOW_56_in_rule__Connection__Group_3_7_0__0__Impl7505); 
             after(grammarAccess.getConnectionAccess().getFromTextKeyword_3_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_0__0__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_0__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3729:1: rule__Connection__Group_3_7_0__1 : rule__Connection__Group_3_7_0__1__Impl rule__Connection__Group_3_7_0__2 ;
    public final void rule__Connection__Group_3_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3733:1: ( rule__Connection__Group_3_7_0__1__Impl rule__Connection__Group_3_7_0__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3734:2: rule__Connection__Group_3_7_0__1__Impl rule__Connection__Group_3_7_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_0__1__Impl_in_rule__Connection__Group_3_7_0__17536);
            rule__Connection__Group_3_7_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_0__2_in_rule__Connection__Group_3_7_0__17539);
            rule__Connection__Group_3_7_0__2();

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
    // $ANTLR end "rule__Connection__Group_3_7_0__1"


    // $ANTLR start "rule__Connection__Group_3_7_0__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3741:1: rule__Connection__Group_3_7_0__1__Impl : ( ( rule__Connection__FromLabelAssignment_3_7_0_1 ) ) ;
    public final void rule__Connection__Group_3_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3745:1: ( ( ( rule__Connection__FromLabelAssignment_3_7_0_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3746:1: ( ( rule__Connection__FromLabelAssignment_3_7_0_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3746:1: ( ( rule__Connection__FromLabelAssignment_3_7_0_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3747:1: ( rule__Connection__FromLabelAssignment_3_7_0_1 )
            {
             before(grammarAccess.getConnectionAccess().getFromLabelAssignment_3_7_0_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3748:1: ( rule__Connection__FromLabelAssignment_3_7_0_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3748:2: rule__Connection__FromLabelAssignment_3_7_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__FromLabelAssignment_3_7_0_1_in_rule__Connection__Group_3_7_0__1__Impl7566);
            rule__Connection__FromLabelAssignment_3_7_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getFromLabelAssignment_3_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_0__1__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_0__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3758:1: rule__Connection__Group_3_7_0__2 : rule__Connection__Group_3_7_0__2__Impl ;
    public final void rule__Connection__Group_3_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3762:1: ( rule__Connection__Group_3_7_0__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3763:2: rule__Connection__Group_3_7_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_0__2__Impl_in_rule__Connection__Group_3_7_0__27596);
            rule__Connection__Group_3_7_0__2__Impl();

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
    // $ANTLR end "rule__Connection__Group_3_7_0__2"


    // $ANTLR start "rule__Connection__Group_3_7_0__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3769:1: rule__Connection__Group_3_7_0__2__Impl : ( ';' ) ;
    public final void rule__Connection__Group_3_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3773:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3774:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3774:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3775:1: ';'
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_0_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Connection__Group_3_7_0__2__Impl7624); 
             after(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_0__2__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_1__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3794:1: rule__Connection__Group_3_7_1__0 : rule__Connection__Group_3_7_1__0__Impl rule__Connection__Group_3_7_1__1 ;
    public final void rule__Connection__Group_3_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3798:1: ( rule__Connection__Group_3_7_1__0__Impl rule__Connection__Group_3_7_1__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3799:2: rule__Connection__Group_3_7_1__0__Impl rule__Connection__Group_3_7_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_1__0__Impl_in_rule__Connection__Group_3_7_1__07661);
            rule__Connection__Group_3_7_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_1__1_in_rule__Connection__Group_3_7_1__07664);
            rule__Connection__Group_3_7_1__1();

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
    // $ANTLR end "rule__Connection__Group_3_7_1__0"


    // $ANTLR start "rule__Connection__Group_3_7_1__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3806:1: rule__Connection__Group_3_7_1__0__Impl : ( 'connectionText' ) ;
    public final void rule__Connection__Group_3_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3810:1: ( ( 'connectionText' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3811:1: ( 'connectionText' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3811:1: ( 'connectionText' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3812:1: 'connectionText'
            {
             before(grammarAccess.getConnectionAccess().getConnectionTextKeyword_3_7_1_0()); 
            match(input,57,FollowSets000.FOLLOW_57_in_rule__Connection__Group_3_7_1__0__Impl7692); 
             after(grammarAccess.getConnectionAccess().getConnectionTextKeyword_3_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_1__0__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_1__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3825:1: rule__Connection__Group_3_7_1__1 : rule__Connection__Group_3_7_1__1__Impl rule__Connection__Group_3_7_1__2 ;
    public final void rule__Connection__Group_3_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3829:1: ( rule__Connection__Group_3_7_1__1__Impl rule__Connection__Group_3_7_1__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3830:2: rule__Connection__Group_3_7_1__1__Impl rule__Connection__Group_3_7_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_1__1__Impl_in_rule__Connection__Group_3_7_1__17723);
            rule__Connection__Group_3_7_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_1__2_in_rule__Connection__Group_3_7_1__17726);
            rule__Connection__Group_3_7_1__2();

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
    // $ANTLR end "rule__Connection__Group_3_7_1__1"


    // $ANTLR start "rule__Connection__Group_3_7_1__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3837:1: rule__Connection__Group_3_7_1__1__Impl : ( ( rule__Connection__ConnectionLabelAssignment_3_7_1_1 ) ) ;
    public final void rule__Connection__Group_3_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3841:1: ( ( ( rule__Connection__ConnectionLabelAssignment_3_7_1_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3842:1: ( ( rule__Connection__ConnectionLabelAssignment_3_7_1_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3842:1: ( ( rule__Connection__ConnectionLabelAssignment_3_7_1_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3843:1: ( rule__Connection__ConnectionLabelAssignment_3_7_1_1 )
            {
             before(grammarAccess.getConnectionAccess().getConnectionLabelAssignment_3_7_1_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3844:1: ( rule__Connection__ConnectionLabelAssignment_3_7_1_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3844:2: rule__Connection__ConnectionLabelAssignment_3_7_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__ConnectionLabelAssignment_3_7_1_1_in_rule__Connection__Group_3_7_1__1__Impl7753);
            rule__Connection__ConnectionLabelAssignment_3_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getConnectionLabelAssignment_3_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_1__1__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_1__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3854:1: rule__Connection__Group_3_7_1__2 : rule__Connection__Group_3_7_1__2__Impl ;
    public final void rule__Connection__Group_3_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3858:1: ( rule__Connection__Group_3_7_1__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3859:2: rule__Connection__Group_3_7_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_1__2__Impl_in_rule__Connection__Group_3_7_1__27783);
            rule__Connection__Group_3_7_1__2__Impl();

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
    // $ANTLR end "rule__Connection__Group_3_7_1__2"


    // $ANTLR start "rule__Connection__Group_3_7_1__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3865:1: rule__Connection__Group_3_7_1__2__Impl : ( ';' ) ;
    public final void rule__Connection__Group_3_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3869:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3870:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3870:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3871:1: ';'
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_1_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Connection__Group_3_7_1__2__Impl7811); 
             after(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_1__2__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_2__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3890:1: rule__Connection__Group_3_7_2__0 : rule__Connection__Group_3_7_2__0__Impl rule__Connection__Group_3_7_2__1 ;
    public final void rule__Connection__Group_3_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3894:1: ( rule__Connection__Group_3_7_2__0__Impl rule__Connection__Group_3_7_2__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3895:2: rule__Connection__Group_3_7_2__0__Impl rule__Connection__Group_3_7_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_2__0__Impl_in_rule__Connection__Group_3_7_2__07848);
            rule__Connection__Group_3_7_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_2__1_in_rule__Connection__Group_3_7_2__07851);
            rule__Connection__Group_3_7_2__1();

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
    // $ANTLR end "rule__Connection__Group_3_7_2__0"


    // $ANTLR start "rule__Connection__Group_3_7_2__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3902:1: rule__Connection__Group_3_7_2__0__Impl : ( 'toText' ) ;
    public final void rule__Connection__Group_3_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3906:1: ( ( 'toText' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3907:1: ( 'toText' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3907:1: ( 'toText' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3908:1: 'toText'
            {
             before(grammarAccess.getConnectionAccess().getToTextKeyword_3_7_2_0()); 
            match(input,58,FollowSets000.FOLLOW_58_in_rule__Connection__Group_3_7_2__0__Impl7879); 
             after(grammarAccess.getConnectionAccess().getToTextKeyword_3_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_2__0__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_2__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3921:1: rule__Connection__Group_3_7_2__1 : rule__Connection__Group_3_7_2__1__Impl rule__Connection__Group_3_7_2__2 ;
    public final void rule__Connection__Group_3_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3925:1: ( rule__Connection__Group_3_7_2__1__Impl rule__Connection__Group_3_7_2__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3926:2: rule__Connection__Group_3_7_2__1__Impl rule__Connection__Group_3_7_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_2__1__Impl_in_rule__Connection__Group_3_7_2__17910);
            rule__Connection__Group_3_7_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_2__2_in_rule__Connection__Group_3_7_2__17913);
            rule__Connection__Group_3_7_2__2();

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
    // $ANTLR end "rule__Connection__Group_3_7_2__1"


    // $ANTLR start "rule__Connection__Group_3_7_2__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3933:1: rule__Connection__Group_3_7_2__1__Impl : ( ( rule__Connection__ToLabelAssignment_3_7_2_1 ) ) ;
    public final void rule__Connection__Group_3_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3937:1: ( ( ( rule__Connection__ToLabelAssignment_3_7_2_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3938:1: ( ( rule__Connection__ToLabelAssignment_3_7_2_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3938:1: ( ( rule__Connection__ToLabelAssignment_3_7_2_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3939:1: ( rule__Connection__ToLabelAssignment_3_7_2_1 )
            {
             before(grammarAccess.getConnectionAccess().getToLabelAssignment_3_7_2_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3940:1: ( rule__Connection__ToLabelAssignment_3_7_2_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3940:2: rule__Connection__ToLabelAssignment_3_7_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__ToLabelAssignment_3_7_2_1_in_rule__Connection__Group_3_7_2__1__Impl7940);
            rule__Connection__ToLabelAssignment_3_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getToLabelAssignment_3_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_2__1__Impl"


    // $ANTLR start "rule__Connection__Group_3_7_2__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3950:1: rule__Connection__Group_3_7_2__2 : rule__Connection__Group_3_7_2__2__Impl ;
    public final void rule__Connection__Group_3_7_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3954:1: ( rule__Connection__Group_3_7_2__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3955:2: rule__Connection__Group_3_7_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_2__2__Impl_in_rule__Connection__Group_3_7_2__27970);
            rule__Connection__Group_3_7_2__2__Impl();

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
    // $ANTLR end "rule__Connection__Group_3_7_2__2"


    // $ANTLR start "rule__Connection__Group_3_7_2__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3961:1: rule__Connection__Group_3_7_2__2__Impl : ( ';' ) ;
    public final void rule__Connection__Group_3_7_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3965:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3966:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3966:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3967:1: ';'
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_2_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Connection__Group_3_7_2__2__Impl7998); 
             after(grammarAccess.getConnectionAccess().getSemicolonKeyword_3_7_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_3_7_2__2__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3986:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3990:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3991:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__08035);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__1_in_rule__Text__Group__08038);
            rule__Text__Group__1();

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
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:3998:1: rule__Text__Group__0__Impl : ( () ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4002:1: ( ( () ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4003:1: ( () )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4003:1: ( () )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4004:1: ()
            {
             before(grammarAccess.getTextAccess().getTextAction_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4005:1: ()
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4007:1: 
            {
            }

             after(grammarAccess.getTextAccess().getTextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4017:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4021:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4022:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__18096);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__2_in_rule__Text__Group__18099);
            rule__Text__Group__2();

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
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4029:1: rule__Text__Group__1__Impl : ( 'text' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4033:1: ( ( 'text' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4034:1: ( 'text' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4034:1: ( 'text' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4035:1: 'text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_1()); 
            match(input,59,FollowSets000.FOLLOW_59_in_rule__Text__Group__1__Impl8127); 
             after(grammarAccess.getTextAccess().getTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4048:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4052:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4053:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__2__Impl_in_rule__Text__Group__28158);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__3_in_rule__Text__Group__28161);
            rule__Text__Group__3();

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
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4060:1: rule__Text__Group__2__Impl : ( ( rule__Text__LayoutAssignment_2 ) ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4064:1: ( ( ( rule__Text__LayoutAssignment_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4065:1: ( ( rule__Text__LayoutAssignment_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4065:1: ( ( rule__Text__LayoutAssignment_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4066:1: ( rule__Text__LayoutAssignment_2 )
            {
             before(grammarAccess.getTextAccess().getLayoutAssignment_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4067:1: ( rule__Text__LayoutAssignment_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4067:2: rule__Text__LayoutAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__LayoutAssignment_2_in_rule__Text__Group__2__Impl8188);
            rule__Text__LayoutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getLayoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4077:1: rule__Text__Group__3 : rule__Text__Group__3__Impl ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4081:1: ( rule__Text__Group__3__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4082:2: rule__Text__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__3__Impl_in_rule__Text__Group__38218);
            rule__Text__Group__3__Impl();

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
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4088:1: rule__Text__Group__3__Impl : ( ( ( rule__Text__ValueAssignment_3 ) ) ( ( rule__Text__ValueAssignment_3 )* ) ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4092:1: ( ( ( ( rule__Text__ValueAssignment_3 ) ) ( ( rule__Text__ValueAssignment_3 )* ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4093:1: ( ( ( rule__Text__ValueAssignment_3 ) ) ( ( rule__Text__ValueAssignment_3 )* ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4093:1: ( ( ( rule__Text__ValueAssignment_3 ) ) ( ( rule__Text__ValueAssignment_3 )* ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4094:1: ( ( rule__Text__ValueAssignment_3 ) ) ( ( rule__Text__ValueAssignment_3 )* )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4094:1: ( ( rule__Text__ValueAssignment_3 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4095:1: ( rule__Text__ValueAssignment_3 )
            {
             before(grammarAccess.getTextAccess().getValueAssignment_3()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4096:1: ( rule__Text__ValueAssignment_3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4096:2: rule__Text__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__ValueAssignment_3_in_rule__Text__Group__3__Impl8247);
            rule__Text__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getValueAssignment_3()); 

            }

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4099:1: ( ( rule__Text__ValueAssignment_3 )* )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4100:1: ( rule__Text__ValueAssignment_3 )*
            {
             before(grammarAccess.getTextAccess().getValueAssignment_3()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4101:1: ( rule__Text__ValueAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4101:2: rule__Text__ValueAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Text__ValueAssignment_3_in_rule__Text__Group__3__Impl8259);
            	    rule__Text__ValueAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTextAccess().getValueAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4120:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4124:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4125:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08300);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08303);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4132:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4136:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4137:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4137:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4138:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8330); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4149:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4153:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4154:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18359);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4160:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4164:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4165:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4165:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4166:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4167:1: ( rule__QualifiedName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==60) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4167:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8386);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4181:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4185:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4186:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08421);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08424);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4193:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4197:1: ( ( '.' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4198:1: ( '.' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4198:1: ( '.' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4199:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,60,FollowSets000.FOLLOW_60_in_rule__QualifiedName__Group_1__0__Impl8452); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4212:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4216:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4217:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18483);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4223:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4227:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4228:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4228:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4229:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8510); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Line__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4244:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4248:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4249:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Line__Group__0__Impl_in_rule__Line__Group__08543);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Line__Group__1_in_rule__Line__Group__08546);
            rule__Line__Group__1();

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
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4256:1: rule__Line__Group__0__Impl : ( () ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4260:1: ( ( () ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4261:1: ( () )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4261:1: ( () )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4262:1: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4263:1: ()
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4265:1: 
            {
            }

             after(grammarAccess.getLineAccess().getLineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4275:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4279:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4280:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Line__Group__1__Impl_in_rule__Line__Group__18604);
            rule__Line__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Line__Group__2_in_rule__Line__Group__18607);
            rule__Line__Group__2();

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
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4287:1: rule__Line__Group__1__Impl : ( 'line' ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4291:1: ( ( 'line' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4292:1: ( 'line' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4292:1: ( 'line' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4293:1: 'line'
            {
             before(grammarAccess.getLineAccess().getLineKeyword_1()); 
            match(input,61,FollowSets000.FOLLOW_61_in_rule__Line__Group__1__Impl8635); 
             after(grammarAccess.getLineAccess().getLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Line__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4306:1: rule__Line__Group__2 : rule__Line__Group__2__Impl ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4310:1: ( rule__Line__Group__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4311:2: rule__Line__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Line__Group__2__Impl_in_rule__Line__Group__28666);
            rule__Line__Group__2__Impl();

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
    // $ANTLR end "rule__Line__Group__2"


    // $ANTLR start "rule__Line__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4317:1: rule__Line__Group__2__Impl : ( ( rule__Line__LayoutAssignment_2 ) ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4321:1: ( ( ( rule__Line__LayoutAssignment_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4322:1: ( ( rule__Line__LayoutAssignment_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4322:1: ( ( rule__Line__LayoutAssignment_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4323:1: ( rule__Line__LayoutAssignment_2 )
            {
             before(grammarAccess.getLineAccess().getLayoutAssignment_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4324:1: ( rule__Line__LayoutAssignment_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4324:2: rule__Line__LayoutAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Line__LayoutAssignment_2_in_rule__Line__Group__2__Impl8693);
            rule__Line__LayoutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getLayoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4340:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4344:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4345:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__08729);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__1_in_rule__Container__Group__08732);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4352:1: rule__Container__Group__0__Impl : ( () ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4356:1: ( ( () ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4357:1: ( () )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4357:1: ( () )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4358:1: ()
            {
             before(grammarAccess.getContainerAccess().getContainerAction_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4359:1: ()
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4361:1: 
            {
            }

             after(grammarAccess.getContainerAccess().getContainerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4371:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4375:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4376:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__18790);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__2_in_rule__Container__Group__18793);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4383:1: rule__Container__Group__1__Impl : ( 'container' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4387:1: ( ( 'container' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4388:1: ( 'container' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4388:1: ( 'container' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4389:1: 'container'
            {
             before(grammarAccess.getContainerAccess().getContainerKeyword_1()); 
            match(input,62,FollowSets000.FOLLOW_62_in_rule__Container__Group__1__Impl8821); 
             after(grammarAccess.getContainerAccess().getContainerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4402:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4406:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4407:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__28852);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__3_in_rule__Container__Group__28855);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4414:1: rule__Container__Group__2__Impl : ( ( rule__Container__LayoutAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4418:1: ( ( ( rule__Container__LayoutAssignment_2 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4419:1: ( ( rule__Container__LayoutAssignment_2 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4419:1: ( ( rule__Container__LayoutAssignment_2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4420:1: ( rule__Container__LayoutAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getLayoutAssignment_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4421:1: ( rule__Container__LayoutAssignment_2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4421:2: rule__Container__LayoutAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__LayoutAssignment_2_in_rule__Container__Group__2__Impl8882);
            rule__Container__LayoutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getLayoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4431:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4435:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4436:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__38912);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__4_in_rule__Container__Group__38915);
            rule__Container__Group__4();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4443:1: rule__Container__Group__3__Impl : ( '[' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4447:1: ( ( '[' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4448:1: ( '[' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4448:1: ( '[' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4449:1: '['
            {
             before(grammarAccess.getContainerAccess().getLeftSquareBracketKeyword_3()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Container__Group__3__Impl8943); 
             after(grammarAccess.getContainerAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4462:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4466:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4467:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__48974);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__5_in_rule__Container__Group__48977);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4474:1: rule__Container__Group__4__Impl : ( ( rule__Container__Group_4__0 )* ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4478:1: ( ( ( rule__Container__Group_4__0 )* ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4479:1: ( ( rule__Container__Group_4__0 )* )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4479:1: ( ( rule__Container__Group_4__0 )* )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4480:1: ( rule__Container__Group_4__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_4()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4481:1: ( rule__Container__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=52 && LA21_0<=53)||LA21_0==59||(LA21_0>=61 && LA21_0<=64)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4481:2: rule__Container__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__0_in_rule__Container__Group__4__Impl9004);
            	    rule__Container__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4491:1: rule__Container__Group__5 : rule__Container__Group__5__Impl ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4495:1: ( rule__Container__Group__5__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4496:2: rule__Container__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__59035);
            rule__Container__Group__5__Impl();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4502:1: rule__Container__Group__5__Impl : ( ']' ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4506:1: ( ( ']' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4507:1: ( ']' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4507:1: ( ']' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4508:1: ']'
            {
             before(grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Container__Group__5__Impl9063); 
             after(grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group_4__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4533:1: rule__Container__Group_4__0 : rule__Container__Group_4__0__Impl rule__Container__Group_4__1 ;
    public final void rule__Container__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4537:1: ( rule__Container__Group_4__0__Impl rule__Container__Group_4__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4538:2: rule__Container__Group_4__0__Impl rule__Container__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__0__Impl_in_rule__Container__Group_4__09106);
            rule__Container__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__1_in_rule__Container__Group_4__09109);
            rule__Container__Group_4__1();

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
    // $ANTLR end "rule__Container__Group_4__0"


    // $ANTLR start "rule__Container__Group_4__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4545:1: rule__Container__Group_4__0__Impl : ( ( rule__Container__PartsAssignment_4_0 ) ) ;
    public final void rule__Container__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4549:1: ( ( ( rule__Container__PartsAssignment_4_0 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4550:1: ( ( rule__Container__PartsAssignment_4_0 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4550:1: ( ( rule__Container__PartsAssignment_4_0 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4551:1: ( rule__Container__PartsAssignment_4_0 )
            {
             before(grammarAccess.getContainerAccess().getPartsAssignment_4_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4552:1: ( rule__Container__PartsAssignment_4_0 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4552:2: rule__Container__PartsAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__PartsAssignment_4_0_in_rule__Container__Group_4__0__Impl9136);
            rule__Container__PartsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getPartsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__0__Impl"


    // $ANTLR start "rule__Container__Group_4__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4562:1: rule__Container__Group_4__1 : rule__Container__Group_4__1__Impl ;
    public final void rule__Container__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4566:1: ( rule__Container__Group_4__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4567:2: rule__Container__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Container__Group_4__1__Impl_in_rule__Container__Group_4__19166);
            rule__Container__Group_4__1__Impl();

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
    // $ANTLR end "rule__Container__Group_4__1"


    // $ANTLR start "rule__Container__Group_4__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4573:1: rule__Container__Group_4__1__Impl : ( ';' ) ;
    public final void rule__Container__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4577:1: ( ( ';' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4578:1: ( ';' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4578:1: ( ';' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4579:1: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_4_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Container__Group_4__1__Impl9194); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__Group_4__1__Impl"


    // $ANTLR start "rule__MetaReferenceAsShape__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4596:1: rule__MetaReferenceAsShape__Group__0 : rule__MetaReferenceAsShape__Group__0__Impl rule__MetaReferenceAsShape__Group__1 ;
    public final void rule__MetaReferenceAsShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4600:1: ( rule__MetaReferenceAsShape__Group__0__Impl rule__MetaReferenceAsShape__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4601:2: rule__MetaReferenceAsShape__Group__0__Impl rule__MetaReferenceAsShape__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group__0__Impl_in_rule__MetaReferenceAsShape__Group__09229);
            rule__MetaReferenceAsShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group__1_in_rule__MetaReferenceAsShape__Group__09232);
            rule__MetaReferenceAsShape__Group__1();

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
    // $ANTLR end "rule__MetaReferenceAsShape__Group__0"


    // $ANTLR start "rule__MetaReferenceAsShape__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4608:1: rule__MetaReferenceAsShape__Group__0__Impl : ( 'reference' ) ;
    public final void rule__MetaReferenceAsShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4612:1: ( ( 'reference' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4613:1: ( 'reference' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4613:1: ( 'reference' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4614:1: 'reference'
            {
             before(grammarAccess.getMetaReferenceAsShapeAccess().getReferenceKeyword_0()); 
            match(input,63,FollowSets000.FOLLOW_63_in_rule__MetaReferenceAsShape__Group__0__Impl9260); 
             after(grammarAccess.getMetaReferenceAsShapeAccess().getReferenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReferenceAsShape__Group__0__Impl"


    // $ANTLR start "rule__MetaReferenceAsShape__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4627:1: rule__MetaReferenceAsShape__Group__1 : rule__MetaReferenceAsShape__Group__1__Impl rule__MetaReferenceAsShape__Group__2 ;
    public final void rule__MetaReferenceAsShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4631:1: ( rule__MetaReferenceAsShape__Group__1__Impl rule__MetaReferenceAsShape__Group__2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4632:2: rule__MetaReferenceAsShape__Group__1__Impl rule__MetaReferenceAsShape__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group__1__Impl_in_rule__MetaReferenceAsShape__Group__19291);
            rule__MetaReferenceAsShape__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group__2_in_rule__MetaReferenceAsShape__Group__19294);
            rule__MetaReferenceAsShape__Group__2();

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
    // $ANTLR end "rule__MetaReferenceAsShape__Group__1"


    // $ANTLR start "rule__MetaReferenceAsShape__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4639:1: rule__MetaReferenceAsShape__Group__1__Impl : ( ( rule__MetaReferenceAsShape__NameAssignment_1 ) ) ;
    public final void rule__MetaReferenceAsShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4643:1: ( ( ( rule__MetaReferenceAsShape__NameAssignment_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4644:1: ( ( rule__MetaReferenceAsShape__NameAssignment_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4644:1: ( ( rule__MetaReferenceAsShape__NameAssignment_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4645:1: ( rule__MetaReferenceAsShape__NameAssignment_1 )
            {
             before(grammarAccess.getMetaReferenceAsShapeAccess().getNameAssignment_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4646:1: ( rule__MetaReferenceAsShape__NameAssignment_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4646:2: rule__MetaReferenceAsShape__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__NameAssignment_1_in_rule__MetaReferenceAsShape__Group__1__Impl9321);
            rule__MetaReferenceAsShape__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaReferenceAsShapeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReferenceAsShape__Group__1__Impl"


    // $ANTLR start "rule__MetaReferenceAsShape__Group__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4656:1: rule__MetaReferenceAsShape__Group__2 : rule__MetaReferenceAsShape__Group__2__Impl ;
    public final void rule__MetaReferenceAsShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4660:1: ( rule__MetaReferenceAsShape__Group__2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4661:2: rule__MetaReferenceAsShape__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group__2__Impl_in_rule__MetaReferenceAsShape__Group__29351);
            rule__MetaReferenceAsShape__Group__2__Impl();

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
    // $ANTLR end "rule__MetaReferenceAsShape__Group__2"


    // $ANTLR start "rule__MetaReferenceAsShape__Group__2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4667:1: rule__MetaReferenceAsShape__Group__2__Impl : ( ( rule__MetaReferenceAsShape__Group_2__0 )? ) ;
    public final void rule__MetaReferenceAsShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4671:1: ( ( ( rule__MetaReferenceAsShape__Group_2__0 )? ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4672:1: ( ( rule__MetaReferenceAsShape__Group_2__0 )? )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4672:1: ( ( rule__MetaReferenceAsShape__Group_2__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4673:1: ( rule__MetaReferenceAsShape__Group_2__0 )?
            {
             before(grammarAccess.getMetaReferenceAsShapeAccess().getGroup_2()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4674:1: ( rule__MetaReferenceAsShape__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==64) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4674:2: rule__MetaReferenceAsShape__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group_2__0_in_rule__MetaReferenceAsShape__Group__2__Impl9378);
                    rule__MetaReferenceAsShape__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMetaReferenceAsShapeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReferenceAsShape__Group__2__Impl"


    // $ANTLR start "rule__MetaReferenceAsShape__Group_2__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4690:1: rule__MetaReferenceAsShape__Group_2__0 : rule__MetaReferenceAsShape__Group_2__0__Impl rule__MetaReferenceAsShape__Group_2__1 ;
    public final void rule__MetaReferenceAsShape__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4694:1: ( rule__MetaReferenceAsShape__Group_2__0__Impl rule__MetaReferenceAsShape__Group_2__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4695:2: rule__MetaReferenceAsShape__Group_2__0__Impl rule__MetaReferenceAsShape__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group_2__0__Impl_in_rule__MetaReferenceAsShape__Group_2__09415);
            rule__MetaReferenceAsShape__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group_2__1_in_rule__MetaReferenceAsShape__Group_2__09418);
            rule__MetaReferenceAsShape__Group_2__1();

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
    // $ANTLR end "rule__MetaReferenceAsShape__Group_2__0"


    // $ANTLR start "rule__MetaReferenceAsShape__Group_2__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4702:1: rule__MetaReferenceAsShape__Group_2__0__Impl : ( 'attribute' ) ;
    public final void rule__MetaReferenceAsShape__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4706:1: ( ( 'attribute' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4707:1: ( 'attribute' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4707:1: ( 'attribute' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4708:1: 'attribute'
            {
             before(grammarAccess.getMetaReferenceAsShapeAccess().getAttributeKeyword_2_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__MetaReferenceAsShape__Group_2__0__Impl9446); 
             after(grammarAccess.getMetaReferenceAsShapeAccess().getAttributeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReferenceAsShape__Group_2__0__Impl"


    // $ANTLR start "rule__MetaReferenceAsShape__Group_2__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4721:1: rule__MetaReferenceAsShape__Group_2__1 : rule__MetaReferenceAsShape__Group_2__1__Impl ;
    public final void rule__MetaReferenceAsShape__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4725:1: ( rule__MetaReferenceAsShape__Group_2__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4726:2: rule__MetaReferenceAsShape__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__Group_2__1__Impl_in_rule__MetaReferenceAsShape__Group_2__19477);
            rule__MetaReferenceAsShape__Group_2__1__Impl();

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
    // $ANTLR end "rule__MetaReferenceAsShape__Group_2__1"


    // $ANTLR start "rule__MetaReferenceAsShape__Group_2__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4732:1: rule__MetaReferenceAsShape__Group_2__1__Impl : ( ( rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1 ) ) ;
    public final void rule__MetaReferenceAsShape__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4736:1: ( ( ( rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4737:1: ( ( rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4737:1: ( ( rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4738:1: ( rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1 )
            {
             before(grammarAccess.getMetaReferenceAsShapeAccess().getLabelPropertyAssignment_2_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4739:1: ( rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4739:2: rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1_in_rule__MetaReferenceAsShape__Group_2__1__Impl9504);
            rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaReferenceAsShapeAccess().getLabelPropertyAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReferenceAsShape__Group_2__1__Impl"


    // $ANTLR start "rule__MetaAttributeAsShape__Group__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4753:1: rule__MetaAttributeAsShape__Group__0 : rule__MetaAttributeAsShape__Group__0__Impl rule__MetaAttributeAsShape__Group__1 ;
    public final void rule__MetaAttributeAsShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4757:1: ( rule__MetaAttributeAsShape__Group__0__Impl rule__MetaAttributeAsShape__Group__1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4758:2: rule__MetaAttributeAsShape__Group__0__Impl rule__MetaAttributeAsShape__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaAttributeAsShape__Group__0__Impl_in_rule__MetaAttributeAsShape__Group__09538);
            rule__MetaAttributeAsShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MetaAttributeAsShape__Group__1_in_rule__MetaAttributeAsShape__Group__09541);
            rule__MetaAttributeAsShape__Group__1();

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
    // $ANTLR end "rule__MetaAttributeAsShape__Group__0"


    // $ANTLR start "rule__MetaAttributeAsShape__Group__0__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4765:1: rule__MetaAttributeAsShape__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__MetaAttributeAsShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4769:1: ( ( 'attribute' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4770:1: ( 'attribute' )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4770:1: ( 'attribute' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4771:1: 'attribute'
            {
             before(grammarAccess.getMetaAttributeAsShapeAccess().getAttributeKeyword_0()); 
            match(input,64,FollowSets000.FOLLOW_64_in_rule__MetaAttributeAsShape__Group__0__Impl9569); 
             after(grammarAccess.getMetaAttributeAsShapeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaAttributeAsShape__Group__0__Impl"


    // $ANTLR start "rule__MetaAttributeAsShape__Group__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4784:1: rule__MetaAttributeAsShape__Group__1 : rule__MetaAttributeAsShape__Group__1__Impl ;
    public final void rule__MetaAttributeAsShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4788:1: ( rule__MetaAttributeAsShape__Group__1__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4789:2: rule__MetaAttributeAsShape__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaAttributeAsShape__Group__1__Impl_in_rule__MetaAttributeAsShape__Group__19600);
            rule__MetaAttributeAsShape__Group__1__Impl();

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
    // $ANTLR end "rule__MetaAttributeAsShape__Group__1"


    // $ANTLR start "rule__MetaAttributeAsShape__Group__1__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4795:1: rule__MetaAttributeAsShape__Group__1__Impl : ( ( rule__MetaAttributeAsShape__NameAssignment_1 ) ) ;
    public final void rule__MetaAttributeAsShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4799:1: ( ( ( rule__MetaAttributeAsShape__NameAssignment_1 ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4800:1: ( ( rule__MetaAttributeAsShape__NameAssignment_1 ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4800:1: ( ( rule__MetaAttributeAsShape__NameAssignment_1 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4801:1: ( rule__MetaAttributeAsShape__NameAssignment_1 )
            {
             before(grammarAccess.getMetaAttributeAsShapeAccess().getNameAssignment_1()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4802:1: ( rule__MetaAttributeAsShape__NameAssignment_1 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4802:2: rule__MetaAttributeAsShape__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MetaAttributeAsShape__NameAssignment_1_in_rule__MetaAttributeAsShape__Group__1__Impl9627);
            rule__MetaAttributeAsShape__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaAttributeAsShapeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaAttributeAsShape__Group__1__Impl"


    // $ANTLR start "rule__Layout__UnorderedGroup_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4817:1: rule__Layout__UnorderedGroup_2 : ( rule__Layout__UnorderedGroup_2__0 )? ;
    public final void rule__Layout__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4822:1: ( ( rule__Layout__UnorderedGroup_2__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4823:2: ( rule__Layout__UnorderedGroup_2__0 )?
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4823:2: ( rule__Layout__UnorderedGroup_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                alt23=1;
            }
            else if ( LA23_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                alt23=1;
            }
            else if ( LA23_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4823:2: rule__Layout__UnorderedGroup_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__0_in_rule__Layout__UnorderedGroup_29662);
                    rule__Layout__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__UnorderedGroup_2"


    // $ANTLR start "rule__Layout__UnorderedGroup_2__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4833:1: rule__Layout__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Layout__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__BoldAssignment_2_4 ) ) ) ) | ({...}? => ( ( ( rule__Layout__ItalicAssignment_2_5 ) ) ) ) ) ;
    public final void rule__Layout__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4838:1: ( ( ({...}? => ( ( ( rule__Layout__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__BoldAssignment_2_4 ) ) ) ) | ({...}? => ( ( ( rule__Layout__ItalicAssignment_2_5 ) ) ) ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4839:3: ( ({...}? => ( ( ( rule__Layout__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__BoldAssignment_2_4 ) ) ) ) | ({...}? => ( ( ( rule__Layout__ItalicAssignment_2_5 ) ) ) ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4839:3: ( ({...}? => ( ( ( rule__Layout__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Layout__BoldAssignment_2_4 ) ) ) ) | ({...}? => ( ( ( rule__Layout__ItalicAssignment_2_5 ) ) ) ) )
            int alt24=6;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                alt24=2;
            }
            else if ( LA24_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                alt24=3;
            }
            else if ( LA24_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                alt24=4;
            }
            else if ( LA24_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                alt24=5;
            }
            else if ( LA24_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                alt24=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4841:4: ({...}? => ( ( ( rule__Layout__Group_2_0__0 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4841:4: ({...}? => ( ( ( rule__Layout__Group_2_0__0 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4842:5: {...}? => ( ( ( rule__Layout__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Layout__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4842:103: ( ( ( rule__Layout__Group_2_0__0 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4843:6: ( ( rule__Layout__Group_2_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4849:6: ( ( rule__Layout__Group_2_0__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4851:7: ( rule__Layout__Group_2_0__0 )
                    {
                     before(grammarAccess.getLayoutAccess().getGroup_2_0()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4852:7: ( rule__Layout__Group_2_0__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4852:8: rule__Layout__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_0__0_in_rule__Layout__UnorderedGroup_2__Impl9749);
                    rule__Layout__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4858:4: ({...}? => ( ( ( rule__Layout__Group_2_1__0 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4858:4: ({...}? => ( ( ( rule__Layout__Group_2_1__0 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4859:5: {...}? => ( ( ( rule__Layout__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Layout__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4859:103: ( ( ( rule__Layout__Group_2_1__0 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4860:6: ( ( rule__Layout__Group_2_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4866:6: ( ( rule__Layout__Group_2_1__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4868:7: ( rule__Layout__Group_2_1__0 )
                    {
                     before(grammarAccess.getLayoutAccess().getGroup_2_1()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4869:7: ( rule__Layout__Group_2_1__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4869:8: rule__Layout__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_1__0_in_rule__Layout__UnorderedGroup_2__Impl9840);
                    rule__Layout__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutAccess().getGroup_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4875:4: ({...}? => ( ( ( rule__Layout__Group_2_2__0 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4875:4: ({...}? => ( ( ( rule__Layout__Group_2_2__0 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4876:5: {...}? => ( ( ( rule__Layout__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Layout__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4876:103: ( ( ( rule__Layout__Group_2_2__0 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4877:6: ( ( rule__Layout__Group_2_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4883:6: ( ( rule__Layout__Group_2_2__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4885:7: ( rule__Layout__Group_2_2__0 )
                    {
                     before(grammarAccess.getLayoutAccess().getGroup_2_2()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4886:7: ( rule__Layout__Group_2_2__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4886:8: rule__Layout__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_2__0_in_rule__Layout__UnorderedGroup_2__Impl9931);
                    rule__Layout__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutAccess().getGroup_2_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4892:4: ({...}? => ( ( ( rule__Layout__Group_2_3__0 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4892:4: ({...}? => ( ( ( rule__Layout__Group_2_3__0 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4893:5: {...}? => ( ( ( rule__Layout__Group_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Layout__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4893:103: ( ( ( rule__Layout__Group_2_3__0 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4894:6: ( ( rule__Layout__Group_2_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4900:6: ( ( rule__Layout__Group_2_3__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4902:7: ( rule__Layout__Group_2_3__0 )
                    {
                     before(grammarAccess.getLayoutAccess().getGroup_2_3()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4903:7: ( rule__Layout__Group_2_3__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4903:8: rule__Layout__Group_2_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_2_3__0_in_rule__Layout__UnorderedGroup_2__Impl10022);
                    rule__Layout__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutAccess().getGroup_2_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4909:4: ({...}? => ( ( ( rule__Layout__BoldAssignment_2_4 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4909:4: ({...}? => ( ( ( rule__Layout__BoldAssignment_2_4 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4910:5: {...}? => ( ( ( rule__Layout__BoldAssignment_2_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Layout__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4910:103: ( ( ( rule__Layout__BoldAssignment_2_4 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4911:6: ( ( rule__Layout__BoldAssignment_2_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4917:6: ( ( rule__Layout__BoldAssignment_2_4 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4919:7: ( rule__Layout__BoldAssignment_2_4 )
                    {
                     before(grammarAccess.getLayoutAccess().getBoldAssignment_2_4()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4920:7: ( rule__Layout__BoldAssignment_2_4 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4920:8: rule__Layout__BoldAssignment_2_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__BoldAssignment_2_4_in_rule__Layout__UnorderedGroup_2__Impl10113);
                    rule__Layout__BoldAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutAccess().getBoldAssignment_2_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4926:4: ({...}? => ( ( ( rule__Layout__ItalicAssignment_2_5 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4926:4: ({...}? => ( ( ( rule__Layout__ItalicAssignment_2_5 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4927:5: {...}? => ( ( ( rule__Layout__ItalicAssignment_2_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Layout__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4927:103: ( ( ( rule__Layout__ItalicAssignment_2_5 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4928:6: ( ( rule__Layout__ItalicAssignment_2_5 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4934:6: ( ( rule__Layout__ItalicAssignment_2_5 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4936:7: ( rule__Layout__ItalicAssignment_2_5 )
                    {
                     before(grammarAccess.getLayoutAccess().getItalicAssignment_2_5()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4937:7: ( rule__Layout__ItalicAssignment_2_5 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4937:8: rule__Layout__ItalicAssignment_2_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__ItalicAssignment_2_5_in_rule__Layout__UnorderedGroup_2__Impl10204);
                    rule__Layout__ItalicAssignment_2_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutAccess().getItalicAssignment_2_5()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLayoutAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Layout__UnorderedGroup_2__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4952:1: rule__Layout__UnorderedGroup_2__0 : rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__1 )? ;
    public final void rule__Layout__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4956:1: ( rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__1 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4957:2: rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__010263);
            rule__Layout__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4958:2: ( rule__Layout__UnorderedGroup_2__1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                alt25=1;
            }
            else if ( LA25_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                alt25=1;
            }
            else if ( LA25_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4958:2: rule__Layout__UnorderedGroup_2__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__1_in_rule__Layout__UnorderedGroup_2__010266);
                    rule__Layout__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__UnorderedGroup_2__0"


    // $ANTLR start "rule__Layout__UnorderedGroup_2__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4965:1: rule__Layout__UnorderedGroup_2__1 : rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__2 )? ;
    public final void rule__Layout__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4969:1: ( rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__2 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4970:2: rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__110291);
            rule__Layout__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4971:2: ( rule__Layout__UnorderedGroup_2__2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                alt26=1;
            }
            else if ( LA26_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                alt26=1;
            }
            else if ( LA26_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4971:2: rule__Layout__UnorderedGroup_2__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__2_in_rule__Layout__UnorderedGroup_2__110294);
                    rule__Layout__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__UnorderedGroup_2__1"


    // $ANTLR start "rule__Layout__UnorderedGroup_2__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4978:1: rule__Layout__UnorderedGroup_2__2 : rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__3 )? ;
    public final void rule__Layout__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4982:1: ( rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__3 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4983:2: rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__3 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__210319);
            rule__Layout__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4984:2: ( rule__Layout__UnorderedGroup_2__3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                alt27=1;
            }
            else if ( LA27_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                alt27=1;
            }
            else if ( LA27_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                alt27=1;
            }
            else if ( LA27_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4984:2: rule__Layout__UnorderedGroup_2__3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__3_in_rule__Layout__UnorderedGroup_2__210322);
                    rule__Layout__UnorderedGroup_2__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__UnorderedGroup_2__2"


    // $ANTLR start "rule__Layout__UnorderedGroup_2__3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4991:1: rule__Layout__UnorderedGroup_2__3 : rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__4 )? ;
    public final void rule__Layout__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4995:1: ( rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__4 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4996:2: rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__4 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__310347);
            rule__Layout__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4997:2: ( rule__Layout__UnorderedGroup_2__4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                alt28=1;
            }
            else if ( LA28_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                alt28=1;
            }
            else if ( LA28_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                alt28=1;
            }
            else if ( LA28_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:4997:2: rule__Layout__UnorderedGroup_2__4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__4_in_rule__Layout__UnorderedGroup_2__310350);
                    rule__Layout__UnorderedGroup_2__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__UnorderedGroup_2__3"


    // $ANTLR start "rule__Layout__UnorderedGroup_2__4"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5004:1: rule__Layout__UnorderedGroup_2__4 : rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__5 )? ;
    public final void rule__Layout__UnorderedGroup_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5008:1: ( rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__5 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5009:2: rule__Layout__UnorderedGroup_2__Impl ( rule__Layout__UnorderedGroup_2__5 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__410375);
            rule__Layout__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5010:2: ( rule__Layout__UnorderedGroup_2__5 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 1) ) {
                alt29=1;
            }
            else if ( LA29_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 2) ) {
                alt29=1;
            }
            else if ( LA29_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 3) ) {
                alt29=1;
            }
            else if ( LA29_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 4) ) {
                alt29=1;
            }
            else if ( LA29_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getLayoutAccess().getUnorderedGroup_2(), 5) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5010:2: rule__Layout__UnorderedGroup_2__5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__5_in_rule__Layout__UnorderedGroup_2__410378);
                    rule__Layout__UnorderedGroup_2__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__UnorderedGroup_2__4"


    // $ANTLR start "rule__Layout__UnorderedGroup_2__5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5017:1: rule__Layout__UnorderedGroup_2__5 : rule__Layout__UnorderedGroup_2__Impl ;
    public final void rule__Layout__UnorderedGroup_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5021:1: ( rule__Layout__UnorderedGroup_2__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5022:2: rule__Layout__UnorderedGroup_2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__510403);
            rule__Layout__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__Layout__UnorderedGroup_2__5"


    // $ANTLR start "rule__Connection__UnorderedGroup_3_7"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5041:1: rule__Connection__UnorderedGroup_3_7 : ( rule__Connection__UnorderedGroup_3_7__0 )? ;
    public final void rule__Connection__UnorderedGroup_3_7() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7());
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5046:1: ( ( rule__Connection__UnorderedGroup_3_7__0 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5047:2: ( rule__Connection__UnorderedGroup_3_7__0 )?
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5047:2: ( rule__Connection__UnorderedGroup_3_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5047:2: rule__Connection__UnorderedGroup_3_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__UnorderedGroup_3_7__0_in_rule__Connection__UnorderedGroup_3_710439);
                    rule__Connection__UnorderedGroup_3_7__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__UnorderedGroup_3_7"


    // $ANTLR start "rule__Connection__UnorderedGroup_3_7__Impl"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5057:1: rule__Connection__UnorderedGroup_3_7__Impl : ( ({...}? => ( ( ( rule__Connection__Group_3_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Connection__Group_3_7_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Connection__Group_3_7_2__0 ) ) ) ) ) ;
    public final void rule__Connection__UnorderedGroup_3_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5062:1: ( ( ({...}? => ( ( ( rule__Connection__Group_3_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Connection__Group_3_7_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Connection__Group_3_7_2__0 ) ) ) ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5063:3: ( ({...}? => ( ( ( rule__Connection__Group_3_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Connection__Group_3_7_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Connection__Group_3_7_2__0 ) ) ) ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5063:3: ( ({...}? => ( ( ( rule__Connection__Group_3_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Connection__Group_3_7_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Connection__Group_3_7_2__0 ) ) ) ) )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1) ) {
                alt31=2;
            }
            else if ( LA31_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2) ) {
                alt31=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5065:4: ({...}? => ( ( ( rule__Connection__Group_3_7_0__0 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5065:4: ({...}? => ( ( ( rule__Connection__Group_3_7_0__0 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5066:5: {...}? => ( ( ( rule__Connection__Group_3_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Connection__UnorderedGroup_3_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5066:109: ( ( ( rule__Connection__Group_3_7_0__0 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5067:6: ( ( rule__Connection__Group_3_7_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5073:6: ( ( rule__Connection__Group_3_7_0__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5075:7: ( rule__Connection__Group_3_7_0__0 )
                    {
                     before(grammarAccess.getConnectionAccess().getGroup_3_7_0()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5076:7: ( rule__Connection__Group_3_7_0__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5076:8: rule__Connection__Group_3_7_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_0__0_in_rule__Connection__UnorderedGroup_3_7__Impl10526);
                    rule__Connection__Group_3_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectionAccess().getGroup_3_7_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5082:4: ({...}? => ( ( ( rule__Connection__Group_3_7_1__0 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5082:4: ({...}? => ( ( ( rule__Connection__Group_3_7_1__0 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5083:5: {...}? => ( ( ( rule__Connection__Group_3_7_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Connection__UnorderedGroup_3_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5083:109: ( ( ( rule__Connection__Group_3_7_1__0 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5084:6: ( ( rule__Connection__Group_3_7_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5090:6: ( ( rule__Connection__Group_3_7_1__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5092:7: ( rule__Connection__Group_3_7_1__0 )
                    {
                     before(grammarAccess.getConnectionAccess().getGroup_3_7_1()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5093:7: ( rule__Connection__Group_3_7_1__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5093:8: rule__Connection__Group_3_7_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_1__0_in_rule__Connection__UnorderedGroup_3_7__Impl10617);
                    rule__Connection__Group_3_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectionAccess().getGroup_3_7_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5099:4: ({...}? => ( ( ( rule__Connection__Group_3_7_2__0 ) ) ) )
                    {
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5099:4: ({...}? => ( ( ( rule__Connection__Group_3_7_2__0 ) ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5100:5: {...}? => ( ( ( rule__Connection__Group_3_7_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Connection__UnorderedGroup_3_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2)");
                    }
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5100:109: ( ( ( rule__Connection__Group_3_7_2__0 ) ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5101:6: ( ( rule__Connection__Group_3_7_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5107:6: ( ( rule__Connection__Group_3_7_2__0 ) )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5109:7: ( rule__Connection__Group_3_7_2__0 )
                    {
                     before(grammarAccess.getConnectionAccess().getGroup_3_7_2()); 
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5110:7: ( rule__Connection__Group_3_7_2__0 )
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5110:8: rule__Connection__Group_3_7_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__Group_3_7_2__0_in_rule__Connection__UnorderedGroup_3_7__Impl10708);
                    rule__Connection__Group_3_7_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConnectionAccess().getGroup_3_7_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__UnorderedGroup_3_7__Impl"


    // $ANTLR start "rule__Connection__UnorderedGroup_3_7__0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5125:1: rule__Connection__UnorderedGroup_3_7__0 : rule__Connection__UnorderedGroup_3_7__Impl ( rule__Connection__UnorderedGroup_3_7__1 )? ;
    public final void rule__Connection__UnorderedGroup_3_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5129:1: ( rule__Connection__UnorderedGroup_3_7__Impl ( rule__Connection__UnorderedGroup_3_7__1 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5130:2: rule__Connection__UnorderedGroup_3_7__Impl ( rule__Connection__UnorderedGroup_3_7__1 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__UnorderedGroup_3_7__Impl_in_rule__Connection__UnorderedGroup_3_7__010767);
            rule__Connection__UnorderedGroup_3_7__Impl();

            state._fsp--;

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5131:2: ( rule__Connection__UnorderedGroup_3_7__1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5131:2: rule__Connection__UnorderedGroup_3_7__1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__UnorderedGroup_3_7__1_in_rule__Connection__UnorderedGroup_3_7__010770);
                    rule__Connection__UnorderedGroup_3_7__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__UnorderedGroup_3_7__0"


    // $ANTLR start "rule__Connection__UnorderedGroup_3_7__1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5138:1: rule__Connection__UnorderedGroup_3_7__1 : rule__Connection__UnorderedGroup_3_7__Impl ( rule__Connection__UnorderedGroup_3_7__2 )? ;
    public final void rule__Connection__UnorderedGroup_3_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5142:1: ( rule__Connection__UnorderedGroup_3_7__Impl ( rule__Connection__UnorderedGroup_3_7__2 )? )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5143:2: rule__Connection__UnorderedGroup_3_7__Impl ( rule__Connection__UnorderedGroup_3_7__2 )?
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__UnorderedGroup_3_7__Impl_in_rule__Connection__UnorderedGroup_3_7__110795);
            rule__Connection__UnorderedGroup_3_7__Impl();

            state._fsp--;

            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5144:2: ( rule__Connection__UnorderedGroup_3_7__2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 1) ) {
                alt33=1;
            }
            else if ( LA33_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getConnectionAccess().getUnorderedGroup_3_7(), 2) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5144:2: rule__Connection__UnorderedGroup_3_7__2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Connection__UnorderedGroup_3_7__2_in_rule__Connection__UnorderedGroup_3_7__110798);
                    rule__Connection__UnorderedGroup_3_7__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__UnorderedGroup_3_7__1"


    // $ANTLR start "rule__Connection__UnorderedGroup_3_7__2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5151:1: rule__Connection__UnorderedGroup_3_7__2 : rule__Connection__UnorderedGroup_3_7__Impl ;
    public final void rule__Connection__UnorderedGroup_3_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5155:1: ( rule__Connection__UnorderedGroup_3_7__Impl )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5156:2: rule__Connection__UnorderedGroup_3_7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Connection__UnorderedGroup_3_7__Impl_in_rule__Connection__UnorderedGroup_3_7__210823);
            rule__Connection__UnorderedGroup_3_7__Impl();

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
    // $ANTLR end "rule__Connection__UnorderedGroup_3_7__2"


    // $ANTLR start "rule__Diagram__NameAssignment_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5169:1: rule__Diagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5173:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5174:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5174:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5175:1: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_110857); 
             after(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__NameAssignment_1"


    // $ANTLR start "rule__Diagram__Import1Assignment_3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5184:1: rule__Diagram__Import1Assignment_3 : ( RULE_STRING ) ;
    public final void rule__Diagram__Import1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5188:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5189:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5189:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5190:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getImport1STRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Diagram__Import1Assignment_310888); 
             after(grammarAccess.getDiagramAccess().getImport1STRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__Import1Assignment_3"


    // $ANTLR start "rule__Diagram__ImportPackageAssignment_5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5199:1: rule__Diagram__ImportPackageAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Diagram__ImportPackageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5203:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5204:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5204:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5205:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getImportPackageSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Diagram__ImportPackageAssignment_510919); 
             after(grammarAccess.getDiagramAccess().getImportPackageSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__ImportPackageAssignment_5"


    // $ANTLR start "rule__Diagram__ModelfileExtensionAssignment_7"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5214:1: rule__Diagram__ModelfileExtensionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Diagram__ModelfileExtensionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5218:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5219:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5219:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5220:1: RULE_STRING
            {
             before(grammarAccess.getDiagramAccess().getModelfileExtensionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Diagram__ModelfileExtensionAssignment_710950); 
             after(grammarAccess.getDiagramAccess().getModelfileExtensionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__ModelfileExtensionAssignment_7"


    // $ANTLR start "rule__Diagram__BehaviourGroupsAssignment_8"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5229:1: rule__Diagram__BehaviourGroupsAssignment_8 : ( ruleBehaviourGroup ) ;
    public final void rule__Diagram__BehaviourGroupsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5233:1: ( ( ruleBehaviourGroup ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5234:1: ( ruleBehaviourGroup )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5234:1: ( ruleBehaviourGroup )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5235:1: ruleBehaviourGroup
            {
             before(grammarAccess.getDiagramAccess().getBehaviourGroupsBehaviourGroupParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviourGroup_in_rule__Diagram__BehaviourGroupsAssignment_810981);
            ruleBehaviourGroup();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getBehaviourGroupsBehaviourGroupParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__BehaviourGroupsAssignment_8"


    // $ANTLR start "rule__Diagram__MetaClassesAssignment_9"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5244:1: rule__Diagram__MetaClassesAssignment_9 : ( ruleMetaClass ) ;
    public final void rule__Diagram__MetaClassesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5248:1: ( ( ruleMetaClass ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5249:1: ( ruleMetaClass )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5249:1: ( ruleMetaClass )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5250:1: ruleMetaClass
            {
             before(grammarAccess.getDiagramAccess().getMetaClassesMetaClassParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaClass_in_rule__Diagram__MetaClassesAssignment_911012);
            ruleMetaClass();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getMetaClassesMetaClassParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diagram__MetaClassesAssignment_9"


    // $ANTLR start "rule__BehaviourGroup__NameAssignment_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5259:1: rule__BehaviourGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BehaviourGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5263:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5264:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5264:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5265:1: RULE_ID
            {
             before(grammarAccess.getBehaviourGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__BehaviourGroup__NameAssignment_111043); 
             after(grammarAccess.getBehaviourGroupAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__NameAssignment_1"


    // $ANTLR start "rule__BehaviourGroup__BehavioursAssignment_3_0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5274:1: rule__BehaviourGroup__BehavioursAssignment_3_0 : ( ruleBehaviour ) ;
    public final void rule__BehaviourGroup__BehavioursAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5278:1: ( ( ruleBehaviour ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5279:1: ( ruleBehaviour )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5279:1: ( ruleBehaviour )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5280:1: ruleBehaviour
            {
             before(grammarAccess.getBehaviourGroupAccess().getBehavioursBehaviourParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_rule__BehaviourGroup__BehavioursAssignment_3_011074);
            ruleBehaviour();

            state._fsp--;

             after(grammarAccess.getBehaviourGroupAccess().getBehavioursBehaviourParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BehaviourGroup__BehavioursAssignment_3_0"


    // $ANTLR start "rule__MetaClass__NameAssignment_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5289:1: rule__MetaClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MetaClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5293:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5294:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5294:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5295:1: RULE_ID
            {
             before(grammarAccess.getMetaClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetaClass__NameAssignment_111105); 
             after(grammarAccess.getMetaClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__NameAssignment_1"


    // $ANTLR start "rule__MetaClass__AliasAssignment_2_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5304:1: rule__MetaClass__AliasAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__MetaClass__AliasAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5308:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5309:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5309:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5310:1: RULE_ID
            {
             before(grammarAccess.getMetaClassAccess().getAliasIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetaClass__AliasAssignment_2_111136); 
             after(grammarAccess.getMetaClassAccess().getAliasIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__AliasAssignment_2_1"


    // $ANTLR start "rule__MetaClass__IconAssignment_3_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5319:1: rule__MetaClass__IconAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__MetaClass__IconAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5323:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5324:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5324:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5325:1: RULE_STRING
            {
             before(grammarAccess.getMetaClassAccess().getIconSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__MetaClass__IconAssignment_3_111167); 
             after(grammarAccess.getMetaClassAccess().getIconSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__IconAssignment_3_1"


    // $ANTLR start "rule__MetaClass__RepresentedByAssignment_5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5334:1: rule__MetaClass__RepresentedByAssignment_5 : ( ruleShape ) ;
    public final void rule__MetaClass__RepresentedByAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5338:1: ( ( ruleShape ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5339:1: ( ruleShape )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5339:1: ( ruleShape )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5340:1: ruleShape
            {
             before(grammarAccess.getMetaClassAccess().getRepresentedByShapeParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleShape_in_rule__MetaClass__RepresentedByAssignment_511198);
            ruleShape();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getRepresentedByShapeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__RepresentedByAssignment_5"


    // $ANTLR start "rule__MetaClass__ReferencesAssignment_6_2_0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5349:1: rule__MetaClass__ReferencesAssignment_6_2_0 : ( ruleMetaReference2 ) ;
    public final void rule__MetaClass__ReferencesAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5353:1: ( ( ruleMetaReference2 ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5354:1: ( ruleMetaReference2 )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5354:1: ( ruleMetaReference2 )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5355:1: ruleMetaReference2
            {
             before(grammarAccess.getMetaClassAccess().getReferencesMetaReference2ParserRuleCall_6_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMetaReference2_in_rule__MetaClass__ReferencesAssignment_6_2_011229);
            ruleMetaReference2();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getReferencesMetaReference2ParserRuleCall_6_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__ReferencesAssignment_6_2_0"


    // $ANTLR start "rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5364:1: rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5368:1: ( ( ( RULE_ID ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5369:1: ( ( RULE_ID ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5369:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5370:1: ( RULE_ID )
            {
             before(grammarAccess.getMetaClassAccess().getBehaviourGroupsBehaviourGroupCrossReference_7_2_0_1_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5371:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5372:1: RULE_ID
            {
             before(grammarAccess.getMetaClassAccess().getBehaviourGroupsBehaviourGroupIDTerminalRuleCall_7_2_0_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetaClass__BehaviourGroupsAssignment_7_2_0_111264); 
             after(grammarAccess.getMetaClassAccess().getBehaviourGroupsBehaviourGroupIDTerminalRuleCall_7_2_0_1_0_1()); 

            }

             after(grammarAccess.getMetaClassAccess().getBehaviourGroupsBehaviourGroupCrossReference_7_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1"


    // $ANTLR start "rule__MetaClass__BehavioursAssignment_7_2_1_0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5383:1: rule__MetaClass__BehavioursAssignment_7_2_1_0 : ( ruleBehaviour ) ;
    public final void rule__MetaClass__BehavioursAssignment_7_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5387:1: ( ( ruleBehaviour ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5388:1: ( ruleBehaviour )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5388:1: ( ruleBehaviour )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5389:1: ruleBehaviour
            {
             before(grammarAccess.getMetaClassAccess().getBehavioursBehaviourParserRuleCall_7_2_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviour_in_rule__MetaClass__BehavioursAssignment_7_2_1_011299);
            ruleBehaviour();

            state._fsp--;

             after(grammarAccess.getMetaClassAccess().getBehavioursBehaviourParserRuleCall_7_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaClass__BehavioursAssignment_7_2_1_0"


    // $ANTLR start "rule__StandardBehaviour__TypeAssignment_0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5398:1: rule__StandardBehaviour__TypeAssignment_0 : ( ruleBehaviourType ) ;
    public final void rule__StandardBehaviour__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5402:1: ( ( ruleBehaviourType ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5403:1: ( ruleBehaviourType )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5403:1: ( ruleBehaviourType )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5404:1: ruleBehaviourType
            {
             before(grammarAccess.getStandardBehaviourAccess().getTypeBehaviourTypeEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBehaviourType_in_rule__StandardBehaviour__TypeAssignment_011330);
            ruleBehaviourType();

            state._fsp--;

             after(grammarAccess.getStandardBehaviourAccess().getTypeBehaviourTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardBehaviour__TypeAssignment_0"


    // $ANTLR start "rule__StandardBehaviour__LabelAssignment_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5413:1: rule__StandardBehaviour__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StandardBehaviour__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5417:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5418:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5418:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5419:1: RULE_STRING
            {
             before(grammarAccess.getStandardBehaviourAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__StandardBehaviour__LabelAssignment_111361); 
             after(grammarAccess.getStandardBehaviourAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardBehaviour__LabelAssignment_1"


    // $ANTLR start "rule__StandardBehaviour__PaletteCompartmentAssignment_2_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5428:1: rule__StandardBehaviour__PaletteCompartmentAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__StandardBehaviour__PaletteCompartmentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5432:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5433:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5433:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5434:1: RULE_STRING
            {
             before(grammarAccess.getStandardBehaviourAccess().getPaletteCompartmentSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__StandardBehaviour__PaletteCompartmentAssignment_2_111392); 
             after(grammarAccess.getStandardBehaviourAccess().getPaletteCompartmentSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StandardBehaviour__PaletteCompartmentAssignment_2_1"


    // $ANTLR start "rule__CustomBehaviour__NameAssignment_0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5443:1: rule__CustomBehaviour__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CustomBehaviour__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5447:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5448:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5448:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5449:1: RULE_ID
            {
             before(grammarAccess.getCustomBehaviourAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__CustomBehaviour__NameAssignment_011423); 
             after(grammarAccess.getCustomBehaviourAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBehaviour__NameAssignment_0"


    // $ANTLR start "rule__CustomBehaviour__LabelAssignment_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5458:1: rule__CustomBehaviour__LabelAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomBehaviour__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5462:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5463:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5463:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5464:1: RULE_STRING
            {
             before(grammarAccess.getCustomBehaviourAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__CustomBehaviour__LabelAssignment_111454); 
             after(grammarAccess.getCustomBehaviourAccess().getLabelSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBehaviour__LabelAssignment_1"


    // $ANTLR start "rule__MetaReference2__NameAssignment_0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5475:1: rule__MetaReference2__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MetaReference2__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5479:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5480:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5480:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5481:1: RULE_ID
            {
             before(grammarAccess.getMetaReference2Access().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetaReference2__NameAssignment_011487); 
             after(grammarAccess.getMetaReference2Access().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReference2__NameAssignment_0"


    // $ANTLR start "rule__MetaReference2__RepresentedByAssignment_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5490:1: rule__MetaReference2__RepresentedByAssignment_2 : ( ruleConnection ) ;
    public final void rule__MetaReference2__RepresentedByAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5494:1: ( ( ruleConnection ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5495:1: ( ruleConnection )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5495:1: ( ruleConnection )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5496:1: ruleConnection
            {
             before(grammarAccess.getMetaReference2Access().getRepresentedByConnectionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConnection_in_rule__MetaReference2__RepresentedByAssignment_211518);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getMetaReference2Access().getRepresentedByConnectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReference2__RepresentedByAssignment_2"


    // $ANTLR start "rule__Layout__LineWidthAssignment_2_0_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5505:1: rule__Layout__LineWidthAssignment_2_0_2 : ( RULE_INT ) ;
    public final void rule__Layout__LineWidthAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5509:1: ( ( RULE_INT ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5510:1: ( RULE_INT )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5510:1: ( RULE_INT )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5511:1: RULE_INT
            {
             before(grammarAccess.getLayoutAccess().getLineWidthINTTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Layout__LineWidthAssignment_2_0_211549); 
             after(grammarAccess.getLayoutAccess().getLineWidthINTTerminalRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__LineWidthAssignment_2_0_2"


    // $ANTLR start "rule__Layout__LineColorAssignment_2_1_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5520:1: rule__Layout__LineColorAssignment_2_1_2 : ( ruleColor ) ;
    public final void rule__Layout__LineColorAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5524:1: ( ( ruleColor ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5525:1: ( ruleColor )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5525:1: ( ruleColor )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5526:1: ruleColor
            {
             before(grammarAccess.getLayoutAccess().getLineColorColorEnumRuleCall_2_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleColor_in_rule__Layout__LineColorAssignment_2_1_211580);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getLineColorColorEnumRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__LineColorAssignment_2_1_2"


    // $ANTLR start "rule__Layout__FillColorAssignment_2_2_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5535:1: rule__Layout__FillColorAssignment_2_2_2 : ( ruleColor ) ;
    public final void rule__Layout__FillColorAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5539:1: ( ( ruleColor ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5540:1: ( ruleColor )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5540:1: ( ruleColor )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5541:1: ruleColor
            {
             before(grammarAccess.getLayoutAccess().getFillColorColorEnumRuleCall_2_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleColor_in_rule__Layout__FillColorAssignment_2_2_211611);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getFillColorColorEnumRuleCall_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__FillColorAssignment_2_2_2"


    // $ANTLR start "rule__Layout__FigureAssignment_2_3_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5550:1: rule__Layout__FigureAssignment_2_3_2 : ( RULE_STRING ) ;
    public final void rule__Layout__FigureAssignment_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5554:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5555:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5555:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5556:1: RULE_STRING
            {
             before(grammarAccess.getLayoutAccess().getFigureSTRINGTerminalRuleCall_2_3_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Layout__FigureAssignment_2_3_211642); 
             after(grammarAccess.getLayoutAccess().getFigureSTRINGTerminalRuleCall_2_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__FigureAssignment_2_3_2"


    // $ANTLR start "rule__Layout__BoldAssignment_2_4"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5565:1: rule__Layout__BoldAssignment_2_4 : ( ( 'bold' ) ) ;
    public final void rule__Layout__BoldAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5569:1: ( ( ( 'bold' ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5570:1: ( ( 'bold' ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5570:1: ( ( 'bold' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5571:1: ( 'bold' )
            {
             before(grammarAccess.getLayoutAccess().getBoldBoldKeyword_2_4_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5572:1: ( 'bold' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5573:1: 'bold'
            {
             before(grammarAccess.getLayoutAccess().getBoldBoldKeyword_2_4_0()); 
            match(input,65,FollowSets000.FOLLOW_65_in_rule__Layout__BoldAssignment_2_411678); 
             after(grammarAccess.getLayoutAccess().getBoldBoldKeyword_2_4_0()); 

            }

             after(grammarAccess.getLayoutAccess().getBoldBoldKeyword_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__BoldAssignment_2_4"


    // $ANTLR start "rule__Layout__ItalicAssignment_2_5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5588:1: rule__Layout__ItalicAssignment_2_5 : ( ( 'italic' ) ) ;
    public final void rule__Layout__ItalicAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5592:1: ( ( ( 'italic' ) ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5593:1: ( ( 'italic' ) )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5593:1: ( ( 'italic' ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5594:1: ( 'italic' )
            {
             before(grammarAccess.getLayoutAccess().getItalicItalicKeyword_2_5_0()); 
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5595:1: ( 'italic' )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5596:1: 'italic'
            {
             before(grammarAccess.getLayoutAccess().getItalicItalicKeyword_2_5_0()); 
            match(input,66,FollowSets000.FOLLOW_66_in_rule__Layout__ItalicAssignment_2_511722); 
             after(grammarAccess.getLayoutAccess().getItalicItalicKeyword_2_5_0()); 

            }

             after(grammarAccess.getLayoutAccess().getItalicItalicKeyword_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__ItalicAssignment_2_5"


    // $ANTLR start "rule__Rectangle__LayoutAssignment_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5611:1: rule__Rectangle__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__Rectangle__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5615:1: ( ( ruleLayout ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5616:1: ( ruleLayout )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5616:1: ( ruleLayout )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5617:1: ruleLayout
            {
             before(grammarAccess.getRectangleAccess().getLayoutLayoutParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Rectangle__LayoutAssignment_211761);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getRectangleAccess().getLayoutLayoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rectangle__LayoutAssignment_2"


    // $ANTLR start "rule__Connection__LayoutAssignment_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5626:1: rule__Connection__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__Connection__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5630:1: ( ( ruleLayout ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5631:1: ( ruleLayout )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5631:1: ( ruleLayout )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5632:1: ruleLayout
            {
             before(grammarAccess.getConnectionAccess().getLayoutLayoutParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Connection__LayoutAssignment_211792);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getLayoutLayoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__LayoutAssignment_2"


    // $ANTLR start "rule__Connection__FromAssignment_3_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5641:1: rule__Connection__FromAssignment_3_2 : ( RULE_ID ) ;
    public final void rule__Connection__FromAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5645:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5646:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5646:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5647:1: RULE_ID
            {
             before(grammarAccess.getConnectionAccess().getFromIDTerminalRuleCall_3_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Connection__FromAssignment_3_211823); 
             after(grammarAccess.getConnectionAccess().getFromIDTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__FromAssignment_3_2"


    // $ANTLR start "rule__Connection__ToAssignment_3_5"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5656:1: rule__Connection__ToAssignment_3_5 : ( RULE_ID ) ;
    public final void rule__Connection__ToAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5660:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5661:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5661:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5662:1: RULE_ID
            {
             before(grammarAccess.getConnectionAccess().getToIDTerminalRuleCall_3_5_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Connection__ToAssignment_3_511854); 
             after(grammarAccess.getConnectionAccess().getToIDTerminalRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ToAssignment_3_5"


    // $ANTLR start "rule__Connection__FromLabelAssignment_3_7_0_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5671:1: rule__Connection__FromLabelAssignment_3_7_0_1 : ( ruleText ) ;
    public final void rule__Connection__FromLabelAssignment_3_7_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5675:1: ( ( ruleText ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5676:1: ( ruleText )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5676:1: ( ruleText )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5677:1: ruleText
            {
             before(grammarAccess.getConnectionAccess().getFromLabelTextParserRuleCall_3_7_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_rule__Connection__FromLabelAssignment_3_7_0_111885);
            ruleText();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getFromLabelTextParserRuleCall_3_7_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__FromLabelAssignment_3_7_0_1"


    // $ANTLR start "rule__Connection__ConnectionLabelAssignment_3_7_1_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5686:1: rule__Connection__ConnectionLabelAssignment_3_7_1_1 : ( ruleText ) ;
    public final void rule__Connection__ConnectionLabelAssignment_3_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5690:1: ( ( ruleText ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5691:1: ( ruleText )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5691:1: ( ruleText )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5692:1: ruleText
            {
             before(grammarAccess.getConnectionAccess().getConnectionLabelTextParserRuleCall_3_7_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_rule__Connection__ConnectionLabelAssignment_3_7_1_111916);
            ruleText();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getConnectionLabelTextParserRuleCall_3_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ConnectionLabelAssignment_3_7_1_1"


    // $ANTLR start "rule__Connection__ToLabelAssignment_3_7_2_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5701:1: rule__Connection__ToLabelAssignment_3_7_2_1 : ( ruleText ) ;
    public final void rule__Connection__ToLabelAssignment_3_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5705:1: ( ( ruleText ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5706:1: ( ruleText )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5706:1: ( ruleText )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5707:1: ruleText
            {
             before(grammarAccess.getConnectionAccess().getToLabelTextParserRuleCall_3_7_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_rule__Connection__ToLabelAssignment_3_7_2_111947);
            ruleText();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getToLabelTextParserRuleCall_3_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ToLabelAssignment_3_7_2_1"


    // $ANTLR start "rule__Text__LayoutAssignment_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5716:1: rule__Text__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__Text__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5720:1: ( ( ruleLayout ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5721:1: ( ruleLayout )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5721:1: ( ruleLayout )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5722:1: ruleLayout
            {
             before(grammarAccess.getTextAccess().getLayoutLayoutParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Text__LayoutAssignment_211978);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getTextAccess().getLayoutLayoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__LayoutAssignment_2"


    // $ANTLR start "rule__Text__ValueAssignment_3"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5731:1: rule__Text__ValueAssignment_3 : ( ruleSprayString ) ;
    public final void rule__Text__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5735:1: ( ( ruleSprayString ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5736:1: ( ruleSprayString )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5736:1: ( ruleSprayString )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5737:1: ruleSprayString
            {
             before(grammarAccess.getTextAccess().getValueSprayStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSprayString_in_rule__Text__ValueAssignment_312009);
            ruleSprayString();

            state._fsp--;

             after(grammarAccess.getTextAccess().getValueSprayStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ValueAssignment_3"


    // $ANTLR start "rule__StringLiteral__NameAssignment"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5746:1: rule__StringLiteral__NameAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5750:1: ( ( RULE_STRING ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5751:1: ( RULE_STRING )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5751:1: ( RULE_STRING )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5752:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__StringLiteral__NameAssignment12040); 
             after(grammarAccess.getStringLiteralAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__NameAssignment"


    // $ANTLR start "rule__MetaAttribute__NameAssignment"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5761:1: rule__MetaAttribute__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__MetaAttribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5765:1: ( ( ruleQualifiedName ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5766:1: ( ruleQualifiedName )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5766:1: ( ruleQualifiedName )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5767:1: ruleQualifiedName
            {
             before(grammarAccess.getMetaAttributeAccess().getNameQualifiedNameParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__MetaAttribute__NameAssignment12071);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMetaAttributeAccess().getNameQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaAttribute__NameAssignment"


    // $ANTLR start "rule__Line__LayoutAssignment_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5776:1: rule__Line__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__Line__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5780:1: ( ( ruleLayout ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5781:1: ( ruleLayout )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5781:1: ( ruleLayout )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5782:1: ruleLayout
            {
             before(grammarAccess.getLineAccess().getLayoutLayoutParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Line__LayoutAssignment_212102);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLineAccess().getLayoutLayoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__LayoutAssignment_2"


    // $ANTLR start "rule__Container__LayoutAssignment_2"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5791:1: rule__Container__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__Container__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5795:1: ( ( ruleLayout ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5796:1: ( ruleLayout )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5796:1: ( ruleLayout )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5797:1: ruleLayout
            {
             before(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Container__LayoutAssignment_212133);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__LayoutAssignment_2"


    // $ANTLR start "rule__Container__PartsAssignment_4_0"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5806:1: rule__Container__PartsAssignment_4_0 : ( ruleSprayElement ) ;
    public final void rule__Container__PartsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5810:1: ( ( ruleSprayElement ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5811:1: ( ruleSprayElement )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5811:1: ( ruleSprayElement )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5812:1: ruleSprayElement
            {
             before(grammarAccess.getContainerAccess().getPartsSprayElementParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSprayElement_in_rule__Container__PartsAssignment_4_012164);
            ruleSprayElement();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getPartsSprayElementParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Container__PartsAssignment_4_0"


    // $ANTLR start "rule__MetaReferenceAsShape__NameAssignment_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5821:1: rule__MetaReferenceAsShape__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MetaReferenceAsShape__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5825:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5826:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5826:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5827:1: RULE_ID
            {
             before(grammarAccess.getMetaReferenceAsShapeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetaReferenceAsShape__NameAssignment_112195); 
             after(grammarAccess.getMetaReferenceAsShapeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReferenceAsShape__NameAssignment_1"


    // $ANTLR start "rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5836:1: rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5840:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5841:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5841:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5842:1: RULE_ID
            {
             before(grammarAccess.getMetaReferenceAsShapeAccess().getLabelPropertyIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetaReferenceAsShape__LabelPropertyAssignment_2_112226); 
             after(grammarAccess.getMetaReferenceAsShapeAccess().getLabelPropertyIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1"


    // $ANTLR start "rule__MetaAttributeAsShape__NameAssignment_1"
    // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5851:1: rule__MetaAttributeAsShape__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MetaAttributeAsShape__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5855:1: ( ( RULE_ID ) )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5856:1: ( RULE_ID )
            {
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5856:1: ( RULE_ID )
            // ../org.xspray.xtext.ui/src-gen/org/xspray/xtext/ui/contentassist/antlr/internal/InternalXspray.g:5857:1: RULE_ID
            {
             before(grammarAccess.getMetaAttributeAsShapeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MetaAttributeAsShape__NameAssignment_112257); 
             after(grammarAccess.getMetaAttributeAsShapeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaAttributeAsShape__NameAssignment_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDiagram68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__0_in_ruleDiagram94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviourGroup_in_entryRuleBehaviourGroup121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehaviourGroup128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__0_in_ruleBehaviourGroup154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaClass_in_entryRuleMetaClass181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaClass188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__0_in_ruleMetaClass214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviour_in_entryRuleBehaviour241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBehaviour248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Behaviour__Alternatives_in_ruleBehaviour274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStandardBehaviour_in_entryRuleStandardBehaviour301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStandardBehaviour308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group__0_in_ruleStandardBehaviour334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomBehaviour_in_entryRuleCustomBehaviour361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomBehaviour368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomBehaviour__Group__0_in_ruleCustomBehaviour394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaReference2_in_entryRuleMetaReference2423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaReference2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReference2__Group__0_in_ruleMetaReference2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShape_in_entryRuleShape483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShape490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Shape__Alternatives_in_ruleShape516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0_in_ruleLayout576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRectangle_in_entryRuleRectangle605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRectangle612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rectangle__Group__0_in_ruleRectangle638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConnection672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__0_in_ruleConnection698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText725 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__0_in_ruleText758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSprayString_in_entryRuleSprayString785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSprayString792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SprayString__Alternatives_in_ruleSprayString818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral845 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StringLiteral__NameAssignment_in_ruleStringLiteral878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaAttribute_in_entryRuleMetaAttribute905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaAttribute912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaAttribute__NameAssignment_in_ruleMetaAttribute938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLine_in_entryRuleLine1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLine1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Line__Group__0_in_ruleLine1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1085 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainer1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__0_in_ruleContainer1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSprayElement_in_entryRuleSprayElement1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSprayElement1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SprayElement__Alternatives_in_ruleSprayElement1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaReferenceAsShape_in_entryRuleMetaReferenceAsShape1205 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaReferenceAsShape1212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group__0_in_ruleMetaReferenceAsShape1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaAttributeAsShape_in_entryRuleMetaAttributeAsShape1265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMetaAttributeAsShape1272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaAttributeAsShape__Group__0_in_ruleMetaAttributeAsShape1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleBehaviourType1336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Color__Alternatives_in_ruleColor1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_0__0_in_rule__MetaClass__Alternatives_7_21409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_1__0_in_rule__MetaClass__Alternatives_7_21427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStandardBehaviour_in_rule__Behaviour__Alternatives1460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomBehaviour_in_rule__Behaviour__Alternatives1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRectangle_in_rule__Shape__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_rule__Shape__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainer_in_rule__Shape__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_rule__Shape__Alternatives1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLine_in_rule__Shape__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaAttribute_in_rule__SprayString__Alternatives1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringLiteral_in_rule__SprayString__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShape_in_rule__SprayElement__Alternatives1659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaReferenceAsShape_in_rule__SprayElement__Alternatives1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaAttributeAsShape_in_rule__SprayElement__Alternatives1693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Color__Alternatives1726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Color__Alternatives1747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Color__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Color__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Color__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Color__Alternatives1831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Color__Alternatives1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Color__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Color__Alternatives1894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Color__Alternatives1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Color__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Color__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Color__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Color__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Color__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Color__Alternatives2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Color__Alternatives2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__02095 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__02098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Diagram__Group__0__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__12157 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__12160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__NameAssignment_1_in_rule__Diagram__Group__1__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__22217 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__22220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Diagram__Group__2__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__32279 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__32282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Import1Assignment_3_in_rule__Diagram__Group__3__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__42339 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__42342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Diagram__Group__4__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__52401 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Diagram__Group__6_in_rule__Diagram__Group__52404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__ImportPackageAssignment_5_in_rule__Diagram__Group__5__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__6__Impl_in_rule__Diagram__Group__62461 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Diagram__Group__7_in_rule__Diagram__Group__62464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Diagram__Group__6__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__7__Impl_in_rule__Diagram__Group__72523 = new BitSet(new long[]{0x0000002200000000L});
        public static final BitSet FOLLOW_rule__Diagram__Group__8_in_rule__Diagram__Group__72526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__ModelfileExtensionAssignment_7_in_rule__Diagram__Group__7__Impl2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__8__Impl_in_rule__Diagram__Group__82583 = new BitSet(new long[]{0x0000002200000000L});
        public static final BitSet FOLLOW_rule__Diagram__Group__9_in_rule__Diagram__Group__82586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__BehaviourGroupsAssignment_8_in_rule__Diagram__Group__8__Impl2613 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__Diagram__Group__9__Impl_in_rule__Diagram__Group__92644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Diagram__MetaClassesAssignment_9_in_rule__Diagram__Group__9__Impl2671 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__0__Impl_in_rule__BehaviourGroup__Group__02722 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__1_in_rule__BehaviourGroup__Group__02725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__BehaviourGroup__Group__0__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__1__Impl_in_rule__BehaviourGroup__Group__12784 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__2_in_rule__BehaviourGroup__Group__12787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__NameAssignment_1_in_rule__BehaviourGroup__Group__1__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__2__Impl_in_rule__BehaviourGroup__Group__22844 = new BitSet(new long[]{0x0000000000000810L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__3_in_rule__BehaviourGroup__Group__22847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__BehaviourGroup__Group__2__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__3__Impl_in_rule__BehaviourGroup__Group__32906 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__4_in_rule__BehaviourGroup__Group__32909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group_3__0_in_rule__BehaviourGroup__Group__3__Impl2938 = new BitSet(new long[]{0x0000000000000812L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group_3__0_in_rule__BehaviourGroup__Group__3__Impl2950 = new BitSet(new long[]{0x0000000000000812L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group__4__Impl_in_rule__BehaviourGroup__Group__42983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__BehaviourGroup__Group__4__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group_3__0__Impl_in_rule__BehaviourGroup__Group_3__03052 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group_3__1_in_rule__BehaviourGroup__Group_3__03055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__BehavioursAssignment_3_0_in_rule__BehaviourGroup__Group_3__0__Impl3082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BehaviourGroup__Group_3__1__Impl_in_rule__BehaviourGroup__Group_3__13112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__BehaviourGroup__Group_3__1__Impl3140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__0__Impl_in_rule__MetaClass__Group__03175 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__1_in_rule__MetaClass__Group__03178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MetaClass__Group__0__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__1__Impl_in_rule__MetaClass__Group__13237 = new BitSet(new long[]{0x000001C000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__2_in_rule__MetaClass__Group__13240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__NameAssignment_1_in_rule__MetaClass__Group__1__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__2__Impl_in_rule__MetaClass__Group__23297 = new BitSet(new long[]{0x000001C000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__3_in_rule__MetaClass__Group__23300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_2__0_in_rule__MetaClass__Group__2__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__3__Impl_in_rule__MetaClass__Group__33358 = new BitSet(new long[]{0x000001C000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__4_in_rule__MetaClass__Group__33361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_3__0_in_rule__MetaClass__Group__3__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__4__Impl_in_rule__MetaClass__Group__43419 = new BitSet(new long[]{0x6830000000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__5_in_rule__MetaClass__Group__43422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MetaClass__Group__4__Impl3450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__5__Impl_in_rule__MetaClass__Group__53481 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__6_in_rule__MetaClass__Group__53484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__RepresentedByAssignment_5_in_rule__MetaClass__Group__5__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__6__Impl_in_rule__MetaClass__Group__63541 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__7_in_rule__MetaClass__Group__63544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6__0_in_rule__MetaClass__Group__6__Impl3571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group__7__Impl_in_rule__MetaClass__Group__73602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7__0_in_rule__MetaClass__Group__7__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_2__0__Impl_in_rule__MetaClass__Group_2__03676 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_2__1_in_rule__MetaClass__Group_2__03679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__MetaClass__Group_2__0__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_2__1__Impl_in_rule__MetaClass__Group_2__13738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__AliasAssignment_2_1_in_rule__MetaClass__Group_2__1__Impl3765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_3__0__Impl_in_rule__MetaClass__Group_3__03799 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_3__1_in_rule__MetaClass__Group_3__03802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__MetaClass__Group_3__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_3__1__Impl_in_rule__MetaClass__Group_3__13861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__IconAssignment_3_1_in_rule__MetaClass__Group_3__1__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6__0__Impl_in_rule__MetaClass__Group_6__03922 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6__1_in_rule__MetaClass__Group_6__03925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MetaClass__Group_6__0__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6__1__Impl_in_rule__MetaClass__Group_6__13984 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6__2_in_rule__MetaClass__Group_6__13987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MetaClass__Group_6__1__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6__2__Impl_in_rule__MetaClass__Group_6__24046 = new BitSet(new long[]{0x0000000800000010L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6__3_in_rule__MetaClass__Group_6__24049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6_2__0_in_rule__MetaClass__Group_6__2__Impl4076 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6__3__Impl_in_rule__MetaClass__Group_6__34107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MetaClass__Group_6__3__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6_2__0__Impl_in_rule__MetaClass__Group_6_2__04174 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6_2__1_in_rule__MetaClass__Group_6_2__04177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__ReferencesAssignment_6_2_0_in_rule__MetaClass__Group_6_2__0__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_6_2__1__Impl_in_rule__MetaClass__Group_6_2__14234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MetaClass__Group_6_2__1__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7__0__Impl_in_rule__MetaClass__Group_7__04297 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7__1_in_rule__MetaClass__Group_7__04300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__MetaClass__Group_7__0__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7__1__Impl_in_rule__MetaClass__Group_7__14359 = new BitSet(new long[]{0x0000080800000810L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7__2_in_rule__MetaClass__Group_7__14362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MetaClass__Group_7__1__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7__2__Impl_in_rule__MetaClass__Group_7__24421 = new BitSet(new long[]{0x0000080800000810L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7__3_in_rule__MetaClass__Group_7__24424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Alternatives_7_2_in_rule__MetaClass__Group_7__2__Impl4451 = new BitSet(new long[]{0x0000080000000812L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7__3__Impl_in_rule__MetaClass__Group_7__34482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MetaClass__Group_7__3__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_0__0__Impl_in_rule__MetaClass__Group_7_2_0__04549 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_0__1_in_rule__MetaClass__Group_7_2_0__04552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__MetaClass__Group_7_2_0__0__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_0__1__Impl_in_rule__MetaClass__Group_7_2_0__14611 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_0__2_in_rule__MetaClass__Group_7_2_0__14614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__BehaviourGroupsAssignment_7_2_0_1_in_rule__MetaClass__Group_7_2_0__1__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_0__2__Impl_in_rule__MetaClass__Group_7_2_0__24671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MetaClass__Group_7_2_0__2__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_1__0__Impl_in_rule__MetaClass__Group_7_2_1__04736 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_1__1_in_rule__MetaClass__Group_7_2_1__04739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__BehavioursAssignment_7_2_1_0_in_rule__MetaClass__Group_7_2_1__0__Impl4766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaClass__Group_7_2_1__1__Impl_in_rule__MetaClass__Group_7_2_1__14796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MetaClass__Group_7_2_1__1__Impl4824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group__0__Impl_in_rule__StandardBehaviour__Group__04859 = new BitSet(new long[]{0x0000100000000020L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group__1_in_rule__StandardBehaviour__Group__04862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__TypeAssignment_0_in_rule__StandardBehaviour__Group__0__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group__1__Impl_in_rule__StandardBehaviour__Group__14919 = new BitSet(new long[]{0x0000100000000020L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group__2_in_rule__StandardBehaviour__Group__14922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__LabelAssignment_1_in_rule__StandardBehaviour__Group__1__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group__2__Impl_in_rule__StandardBehaviour__Group__24980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group_2__0_in_rule__StandardBehaviour__Group__2__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group_2__0__Impl_in_rule__StandardBehaviour__Group_2__05044 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group_2__1_in_rule__StandardBehaviour__Group_2__05047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__StandardBehaviour__Group_2__0__Impl5075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__Group_2__1__Impl_in_rule__StandardBehaviour__Group_2__15106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__StandardBehaviour__PaletteCompartmentAssignment_2_1_in_rule__StandardBehaviour__Group_2__1__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomBehaviour__Group__0__Impl_in_rule__CustomBehaviour__Group__05167 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__CustomBehaviour__Group__1_in_rule__CustomBehaviour__Group__05170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomBehaviour__NameAssignment_0_in_rule__CustomBehaviour__Group__0__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomBehaviour__Group__1__Impl_in_rule__CustomBehaviour__Group__15227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CustomBehaviour__LabelAssignment_1_in_rule__CustomBehaviour__Group__1__Impl5254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReference2__Group__0__Impl_in_rule__MetaReference2__Group__05289 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__MetaReference2__Group__1_in_rule__MetaReference2__Group__05292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReference2__NameAssignment_0_in_rule__MetaReference2__Group__0__Impl5319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReference2__Group__1__Impl_in_rule__MetaReference2__Group__15349 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__MetaReference2__Group__2_in_rule__MetaReference2__Group__15352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__MetaReference2__Group__1__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReference2__Group__2__Impl_in_rule__MetaReference2__Group__25411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReference2__RepresentedByAssignment_2_in_rule__MetaReference2__Group__2__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__05474 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__05477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__15535 = new BitSet(new long[]{0x000E800000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__15538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Layout__Group__1__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__25597 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__25600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2_in_rule__Layout__Group__2__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__35657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__Layout__Group__3__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_0__0__Impl_in_rule__Layout__Group_2_0__05724 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_0__1_in_rule__Layout__Group_2_0__05727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__Layout__Group_2_0__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_0__1__Impl_in_rule__Layout__Group_2_0__15786 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_0__2_in_rule__Layout__Group_2_0__15789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Layout__Group_2_0__1__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_0__2__Impl_in_rule__Layout__Group_2_0__25848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__LineWidthAssignment_2_0_2_in_rule__Layout__Group_2_0__2__Impl5875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_1__0__Impl_in_rule__Layout__Group_2_1__05911 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_1__1_in_rule__Layout__Group_2_1__05914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Layout__Group_2_1__0__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_1__1__Impl_in_rule__Layout__Group_2_1__15973 = new BitSet(new long[]{0x000000001FFFF000L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_1__2_in_rule__Layout__Group_2_1__15976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Layout__Group_2_1__1__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_1__2__Impl_in_rule__Layout__Group_2_1__26035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__LineColorAssignment_2_1_2_in_rule__Layout__Group_2_1__2__Impl6062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_2__0__Impl_in_rule__Layout__Group_2_2__06098 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_2__1_in_rule__Layout__Group_2_2__06101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__Layout__Group_2_2__0__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_2__1__Impl_in_rule__Layout__Group_2_2__16160 = new BitSet(new long[]{0x000000001FFFF000L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_2__2_in_rule__Layout__Group_2_2__16163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Layout__Group_2_2__1__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_2__2__Impl_in_rule__Layout__Group_2_2__26222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__FillColorAssignment_2_2_2_in_rule__Layout__Group_2_2__2__Impl6249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_3__0__Impl_in_rule__Layout__Group_2_3__06285 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_3__1_in_rule__Layout__Group_2_3__06288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Layout__Group_2_3__0__Impl6316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_3__1__Impl_in_rule__Layout__Group_2_3__16347 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_3__2_in_rule__Layout__Group_2_3__16350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Layout__Group_2_3__1__Impl6378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_3__2__Impl_in_rule__Layout__Group_2_3__26409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__FigureAssignment_2_3_2_in_rule__Layout__Group_2_3__2__Impl6436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rectangle__Group__0__Impl_in_rule__Rectangle__Group__06472 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_rule__Rectangle__Group__1_in_rule__Rectangle__Group__06475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rectangle__Group__1__Impl_in_rule__Rectangle__Group__16533 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Rectangle__Group__2_in_rule__Rectangle__Group__16536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_rule__Rectangle__Group__1__Impl6564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rectangle__Group__2__Impl_in_rule__Rectangle__Group__26595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rectangle__LayoutAssignment_2_in_rule__Rectangle__Group__2__Impl6622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__0__Impl_in_rule__Connection__Group__06658 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group__1_in_rule__Connection__Group__06661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__1__Impl_in_rule__Connection__Group__16719 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group__2_in_rule__Connection__Group__16722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_rule__Connection__Group__1__Impl6750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__2__Impl_in_rule__Connection__Group__26781 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Connection__Group__3_in_rule__Connection__Group__26784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__LayoutAssignment_2_in_rule__Connection__Group__2__Impl6811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group__3__Impl_in_rule__Connection__Group__36841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__0_in_rule__Connection__Group__3__Impl6868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__0__Impl_in_rule__Connection__Group_3__06907 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__1_in_rule__Connection__Group_3__06910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Connection__Group_3__0__Impl6938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__1__Impl_in_rule__Connection__Group_3__16969 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__2_in_rule__Connection__Group_3__16972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_rule__Connection__Group_3__1__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__2__Impl_in_rule__Connection__Group_3__27031 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__3_in_rule__Connection__Group_3__27034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__FromAssignment_3_2_in_rule__Connection__Group_3__2__Impl7061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__3__Impl_in_rule__Connection__Group_3__37091 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__4_in_rule__Connection__Group_3__37094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Connection__Group_3__3__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__4__Impl_in_rule__Connection__Group_3__47153 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__5_in_rule__Connection__Group_3__47156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_rule__Connection__Group_3__4__Impl7184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__5__Impl_in_rule__Connection__Group_3__57215 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__6_in_rule__Connection__Group_3__57218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__ToAssignment_3_5_in_rule__Connection__Group_3__5__Impl7245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__6__Impl_in_rule__Connection__Group_3__67275 = new BitSet(new long[]{0x0700000000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__7_in_rule__Connection__Group_3__67278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Connection__Group_3__6__Impl7306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__7__Impl_in_rule__Connection__Group_3__77337 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__8_in_rule__Connection__Group_3__77340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UnorderedGroup_3_7_in_rule__Connection__Group_3__7__Impl7367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3__8__Impl_in_rule__Connection__Group_3__87397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Connection__Group_3__8__Impl7425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_0__0__Impl_in_rule__Connection__Group_3_7_0__07474 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_0__1_in_rule__Connection__Group_3_7_0__07477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rule__Connection__Group_3_7_0__0__Impl7505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_0__1__Impl_in_rule__Connection__Group_3_7_0__17536 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_0__2_in_rule__Connection__Group_3_7_0__17539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__FromLabelAssignment_3_7_0_1_in_rule__Connection__Group_3_7_0__1__Impl7566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_0__2__Impl_in_rule__Connection__Group_3_7_0__27596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Connection__Group_3_7_0__2__Impl7624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_1__0__Impl_in_rule__Connection__Group_3_7_1__07661 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_1__1_in_rule__Connection__Group_3_7_1__07664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rule__Connection__Group_3_7_1__0__Impl7692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_1__1__Impl_in_rule__Connection__Group_3_7_1__17723 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_1__2_in_rule__Connection__Group_3_7_1__17726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__ConnectionLabelAssignment_3_7_1_1_in_rule__Connection__Group_3_7_1__1__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_1__2__Impl_in_rule__Connection__Group_3_7_1__27783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Connection__Group_3_7_1__2__Impl7811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_2__0__Impl_in_rule__Connection__Group_3_7_2__07848 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_2__1_in_rule__Connection__Group_3_7_2__07851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_rule__Connection__Group_3_7_2__0__Impl7879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_2__1__Impl_in_rule__Connection__Group_3_7_2__17910 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_2__2_in_rule__Connection__Group_3_7_2__17913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__ToLabelAssignment_3_7_2_1_in_rule__Connection__Group_3_7_2__1__Impl7940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_2__2__Impl_in_rule__Connection__Group_3_7_2__27970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Connection__Group_3_7_2__2__Impl7998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__08035 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_rule__Text__Group__1_in_rule__Text__Group__08038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__18096 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Text__Group__2_in_rule__Text__Group__18099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_rule__Text__Group__1__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__2__Impl_in_rule__Text__Group__28158 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Text__Group__3_in_rule__Text__Group__28161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__LayoutAssignment_2_in_rule__Text__Group__2__Impl8188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__3__Impl_in_rule__Text__Group__38218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__ValueAssignment_3_in_rule__Text__Group__3__Impl8247 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__Text__ValueAssignment_3_in_rule__Text__Group__3__Impl8259 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08300 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8386 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08421 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rule__QualifiedName__Group_1__0__Impl8452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Line__Group__0__Impl_in_rule__Line__Group__08543 = new BitSet(new long[]{0x6830000000000000L});
        public static final BitSet FOLLOW_rule__Line__Group__1_in_rule__Line__Group__08546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Line__Group__1__Impl_in_rule__Line__Group__18604 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Line__Group__2_in_rule__Line__Group__18607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_rule__Line__Group__1__Impl8635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Line__Group__2__Impl_in_rule__Line__Group__28666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Line__LayoutAssignment_2_in_rule__Line__Group__2__Impl8693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__0__Impl_in_rule__Container__Group__08729 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_rule__Container__Group__1_in_rule__Container__Group__08732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__1__Impl_in_rule__Container__Group__18790 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_rule__Container__Group__2_in_rule__Container__Group__18793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_rule__Container__Group__1__Impl8821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__2__Impl_in_rule__Container__Group__28852 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Container__Group__3_in_rule__Container__Group__28855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__LayoutAssignment_2_in_rule__Container__Group__2__Impl8882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__3__Impl_in_rule__Container__Group__38912 = new BitSet(new long[]{0xE830000800000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Container__Group__4_in_rule__Container__Group__38915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Container__Group__3__Impl8943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group__4__Impl_in_rule__Container__Group__48974 = new BitSet(new long[]{0xE830000800000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Container__Group__5_in_rule__Container__Group__48977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__0_in_rule__Container__Group__4__Impl9004 = new BitSet(new long[]{0xE830000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__Container__Group__5__Impl_in_rule__Container__Group__59035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Container__Group__5__Impl9063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__0__Impl_in_rule__Container__Group_4__09106 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Container__Group_4__1_in_rule__Container__Group_4__09109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__PartsAssignment_4_0_in_rule__Container__Group_4__0__Impl9136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Container__Group_4__1__Impl_in_rule__Container__Group_4__19166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Container__Group_4__1__Impl9194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group__0__Impl_in_rule__MetaReferenceAsShape__Group__09229 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group__1_in_rule__MetaReferenceAsShape__Group__09232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_rule__MetaReferenceAsShape__Group__0__Impl9260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group__1__Impl_in_rule__MetaReferenceAsShape__Group__19291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group__2_in_rule__MetaReferenceAsShape__Group__19294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__NameAssignment_1_in_rule__MetaReferenceAsShape__Group__1__Impl9321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group__2__Impl_in_rule__MetaReferenceAsShape__Group__29351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group_2__0_in_rule__MetaReferenceAsShape__Group__2__Impl9378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group_2__0__Impl_in_rule__MetaReferenceAsShape__Group_2__09415 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group_2__1_in_rule__MetaReferenceAsShape__Group_2__09418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__MetaReferenceAsShape__Group_2__0__Impl9446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__Group_2__1__Impl_in_rule__MetaReferenceAsShape__Group_2__19477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaReferenceAsShape__LabelPropertyAssignment_2_1_in_rule__MetaReferenceAsShape__Group_2__1__Impl9504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaAttributeAsShape__Group__0__Impl_in_rule__MetaAttributeAsShape__Group__09538 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MetaAttributeAsShape__Group__1_in_rule__MetaAttributeAsShape__Group__09541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_rule__MetaAttributeAsShape__Group__0__Impl9569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaAttributeAsShape__Group__1__Impl_in_rule__MetaAttributeAsShape__Group__19600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MetaAttributeAsShape__NameAssignment_1_in_rule__MetaAttributeAsShape__Group__1__Impl9627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__0_in_rule__Layout__UnorderedGroup_29662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_0__0_in_rule__Layout__UnorderedGroup_2__Impl9749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_1__0_in_rule__Layout__UnorderedGroup_2__Impl9840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_2__0_in_rule__Layout__UnorderedGroup_2__Impl9931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_2_3__0_in_rule__Layout__UnorderedGroup_2__Impl10022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__BoldAssignment_2_4_in_rule__Layout__UnorderedGroup_2__Impl10113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__ItalicAssignment_2_5_in_rule__Layout__UnorderedGroup_2__Impl10204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__010263 = new BitSet(new long[]{0x000E800000000002L,0x0000000000000006L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__1_in_rule__Layout__UnorderedGroup_2__010266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__110291 = new BitSet(new long[]{0x000E800000000002L,0x0000000000000006L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__2_in_rule__Layout__UnorderedGroup_2__110294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__210319 = new BitSet(new long[]{0x000E800000000002L,0x0000000000000006L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__3_in_rule__Layout__UnorderedGroup_2__210322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__310347 = new BitSet(new long[]{0x000E800000000002L,0x0000000000000006L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__4_in_rule__Layout__UnorderedGroup_2__310350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__410375 = new BitSet(new long[]{0x000E800000000002L,0x0000000000000006L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__5_in_rule__Layout__UnorderedGroup_2__410378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__UnorderedGroup_2__Impl_in_rule__Layout__UnorderedGroup_2__510403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UnorderedGroup_3_7__0_in_rule__Connection__UnorderedGroup_3_710439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_0__0_in_rule__Connection__UnorderedGroup_3_7__Impl10526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_1__0_in_rule__Connection__UnorderedGroup_3_7__Impl10617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__Group_3_7_2__0_in_rule__Connection__UnorderedGroup_3_7__Impl10708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UnorderedGroup_3_7__Impl_in_rule__Connection__UnorderedGroup_3_7__010767 = new BitSet(new long[]{0x0700000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UnorderedGroup_3_7__1_in_rule__Connection__UnorderedGroup_3_7__010770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UnorderedGroup_3_7__Impl_in_rule__Connection__UnorderedGroup_3_7__110795 = new BitSet(new long[]{0x0700000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UnorderedGroup_3_7__2_in_rule__Connection__UnorderedGroup_3_7__110798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Connection__UnorderedGroup_3_7__Impl_in_rule__Connection__UnorderedGroup_3_7__210823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_110857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Diagram__Import1Assignment_310888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Diagram__ImportPackageAssignment_510919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Diagram__ModelfileExtensionAssignment_710950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviourGroup_in_rule__Diagram__BehaviourGroupsAssignment_810981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaClass_in_rule__Diagram__MetaClassesAssignment_911012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__BehaviourGroup__NameAssignment_111043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviour_in_rule__BehaviourGroup__BehavioursAssignment_3_011074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetaClass__NameAssignment_111105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetaClass__AliasAssignment_2_111136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__MetaClass__IconAssignment_3_111167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShape_in_rule__MetaClass__RepresentedByAssignment_511198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMetaReference2_in_rule__MetaClass__ReferencesAssignment_6_2_011229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetaClass__BehaviourGroupsAssignment_7_2_0_111264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviour_in_rule__MetaClass__BehavioursAssignment_7_2_1_011299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBehaviourType_in_rule__StandardBehaviour__TypeAssignment_011330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__StandardBehaviour__LabelAssignment_111361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__StandardBehaviour__PaletteCompartmentAssignment_2_111392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__CustomBehaviour__NameAssignment_011423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomBehaviour__LabelAssignment_111454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetaReference2__NameAssignment_011487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConnection_in_rule__MetaReference2__RepresentedByAssignment_211518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Layout__LineWidthAssignment_2_0_211549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColor_in_rule__Layout__LineColorAssignment_2_1_211580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColor_in_rule__Layout__FillColorAssignment_2_2_211611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Layout__FigureAssignment_2_3_211642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_rule__Layout__BoldAssignment_2_411678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_rule__Layout__ItalicAssignment_2_511722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Rectangle__LayoutAssignment_211761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Connection__LayoutAssignment_211792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Connection__FromAssignment_3_211823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Connection__ToAssignment_3_511854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_rule__Connection__FromLabelAssignment_3_7_0_111885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_rule__Connection__ConnectionLabelAssignment_3_7_1_111916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_rule__Connection__ToLabelAssignment_3_7_2_111947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Text__LayoutAssignment_211978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSprayString_in_rule__Text__ValueAssignment_312009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__NameAssignment12040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MetaAttribute__NameAssignment12071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Line__LayoutAssignment_212102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Container__LayoutAssignment_212133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSprayElement_in_rule__Container__PartsAssignment_4_012164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetaReferenceAsShape__NameAssignment_112195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetaReferenceAsShape__LabelPropertyAssignment_2_112226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MetaAttributeAsShape__NameAssignment_112257 = new BitSet(new long[]{0x0000000000000002L});
    }


}