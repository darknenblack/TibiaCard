// Generated from br/ufscar/dc/compiladores/tibiacard/TibiaCard.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.tibiacard;

  import br.ufscar.dc.compiladores.tibiacard.Arquivo;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TibiaCardParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, PalavrasChave=50, Delimitador=51, 
		Abre=52, Fecha=53, Virgula=54, Nome=55, Nivel=56, Mana=57, MagiaAtaque=58, 
		MagiaCura=59, Comentario=60, WhiteSpace=61, ErroComentario=62, ANY=63;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_declaracao_local = 2, RULE_classe = 3, 
		RULE_status = 4, RULE_cmd = 5, RULE_cmdAtaque = 6, RULE_cmdLute = 7, RULE_cmdCura = 8, 
		RULE_magiaAtaque = 9, RULE_magiaCura = 10, RULE_magiaAtaqueEK = 11, RULE_magiaCuraEK = 12, 
		RULE_magiaAtaqueED = 13, RULE_magiaCuraED = 14, RULE_magiaAtaqueMS = 15, 
		RULE_magiaCuraMS = 16, RULE_magiaAtaqueRP = 17, RULE_magiaCuraRP = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "declaracao_local", "classe", "status", "cmd", "cmdAtaque", 
			"cmdLute", "cmdCura", "magiaAtaque", "magiaCura", "magiaAtaqueEK", "magiaCuraEK", 
			"magiaAtaqueED", "magiaCuraED", "magiaAtaqueMS", "magiaCuraMS", "magiaAtaqueRP", 
			"magiaCuraRP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio personagem'", "'level'", "'premium account'", "'fim personagem'", 
			"'master sorcerer'", "'royal paladin'", "'elite knight'", "'elder druid'", 
			"'sim'", "'nao'", "'Ataque'", "'('", "')'", "'Lute'", "'Cure'", "'exori gran ico'", 
			"'exori'", "'exori ico'", "'exori gran'", "'exori min'", "'exori mas'", 
			"'exori hur'", "'exura gran ico'", "'exura ico'", "'exevo gran mas frigo'", 
			"'exevo frigo hur'", "'exori moe ico'", "'exevo gran frigo hur'", "'exevo tera hur'", 
			"'exevo gran mas tera'", "'exura sio'", "'exura gran mas res'", "'exevo flam hur'", 
			"'exevo vis lux'", "'exevo gran vis lux'", "'exevo vis hur'", "'exevo gran mas flam'", 
			"'exevo gran mas vis'", "'exura'", "'exura gran'", "'exura vita'", "'exevo mas san'", 
			"'exori san'", "'exori con'", "'exori gran con'", "'exura san'", "'exura gran san'", 
			"'utura'", "'utura gran'", null, "':'", null, null, "','", null, null, 
			null, null, null, null, null, "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PalavrasChave", "Delimitador", "Abre", "Fecha", "Virgula", 
			"Nome", "Nivel", "Mana", "MagiaAtaque", "MagiaCura", "Comentario", "WhiteSpace", 
			"ErroComentario", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TibiaCard.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TibiaCardParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				declaracao_local();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				{
				setState(45);
				cmd();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(TibiaCardParser.Nome, 0); }
		public List<TerminalNode> Delimitador() { return getTokens(TibiaCardParser.Delimitador); }
		public TerminalNode Delimitador(int i) {
			return getToken(TibiaCardParser.Delimitador, i);
		}
		public ClasseContext classe() {
			return getRuleContext(ClasseContext.class,0);
		}
		public TerminalNode Nivel() { return getToken(TibiaCardParser.Nivel, 0); }
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(Nome);
			setState(53);
			match(Delimitador);
			setState(54);
			classe();
			setState(55);
			match(Nivel);
			setState(56);
			match(Delimitador);
			setState(57);
			match(T__1);
			setState(58);
			status();
			setState(59);
			match(Delimitador);
			setState(60);
			match(T__2);
			setState(61);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasseContext extends ParserRuleContext {
		public ClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasseContext classe() throws RecognitionException {
		ClasseContext _localctx = new ClasseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatusContext extends ParserRuleContext {
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdAtaqueContext cmdAtaque() {
			return getRuleContext(CmdAtaqueContext.class,0);
		}
		public CmdLuteContext cmdLute() {
			return getRuleContext(CmdLuteContext.class,0);
		}
		public CmdCuraContext cmdCura() {
			return getRuleContext(CmdCuraContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				cmdAtaque();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				cmdLute();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				cmdCura();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtaqueContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(TibiaCardParser.Nome, 0); }
		public List<TerminalNode> Virgula() { return getTokens(TibiaCardParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(TibiaCardParser.Virgula, i);
		}
		public List<MagiaAtaqueContext> magiaAtaque() {
			return getRuleContexts(MagiaAtaqueContext.class);
		}
		public MagiaAtaqueContext magiaAtaque(int i) {
			return getRuleContext(MagiaAtaqueContext.class,i);
		}
		public CmdAtaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtaque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterCmdAtaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitCmdAtaque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitCmdAtaque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtaqueContext cmdAtaque() throws RecognitionException {
		CmdAtaqueContext _localctx = new CmdAtaqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdAtaque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__10);
			setState(73);
			match(T__11);
			setState(74);
			match(Nome);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				match(Virgula);
				setState(76);
				magiaAtaque();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Virgula );
			setState(81);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLuteContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(TibiaCardParser.Nome, 0); }
		public CmdLuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterCmdLute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitCmdLute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitCmdLute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLuteContext cmdLute() throws RecognitionException {
		CmdLuteContext _localctx = new CmdLuteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdLute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__13);
			setState(84);
			match(T__11);
			setState(85);
			match(Nome);
			setState(86);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCuraContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(TibiaCardParser.Nome, 0); }
		public List<TerminalNode> Virgula() { return getTokens(TibiaCardParser.Virgula); }
		public TerminalNode Virgula(int i) {
			return getToken(TibiaCardParser.Virgula, i);
		}
		public List<MagiaCuraContext> magiaCura() {
			return getRuleContexts(MagiaCuraContext.class);
		}
		public MagiaCuraContext magiaCura(int i) {
			return getRuleContext(MagiaCuraContext.class,i);
		}
		public CmdCuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterCmdCura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitCmdCura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitCmdCura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCuraContext cmdCura() throws RecognitionException {
		CmdCuraContext _localctx = new CmdCuraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdCura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__14);
			setState(89);
			match(T__11);
			setState(90);
			match(Nome);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(Virgula);
				setState(92);
				magiaCura();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Virgula );
			setState(97);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaAtaqueContext extends ParserRuleContext {
		public MagiaAtaqueEKContext magiaAtaqueEK() {
			return getRuleContext(MagiaAtaqueEKContext.class,0);
		}
		public MagiaAtaqueEDContext magiaAtaqueED() {
			return getRuleContext(MagiaAtaqueEDContext.class,0);
		}
		public MagiaAtaqueRPContext magiaAtaqueRP() {
			return getRuleContext(MagiaAtaqueRPContext.class,0);
		}
		public MagiaAtaqueMSContext magiaAtaqueMS() {
			return getRuleContext(MagiaAtaqueMSContext.class,0);
		}
		public MagiaAtaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaAtaque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaAtaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaAtaque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaAtaque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaAtaqueContext magiaAtaque() throws RecognitionException {
		MagiaAtaqueContext _localctx = new MagiaAtaqueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_magiaAtaque);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				magiaAtaqueEK();
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				magiaAtaqueED();
				}
				break;
			case T__41:
			case T__42:
			case T__43:
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				magiaAtaqueRP();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				magiaAtaqueMS();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaCuraContext extends ParserRuleContext {
		public MagiaCuraEKContext magiaCuraEK() {
			return getRuleContext(MagiaCuraEKContext.class,0);
		}
		public MagiaCuraEDContext magiaCuraED() {
			return getRuleContext(MagiaCuraEDContext.class,0);
		}
		public MagiaCuraRPContext magiaCuraRP() {
			return getRuleContext(MagiaCuraRPContext.class,0);
		}
		public MagiaCuraMSContext magiaCuraMS() {
			return getRuleContext(MagiaCuraMSContext.class,0);
		}
		public MagiaCuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaCura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaCura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaCura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaCura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaCuraContext magiaCura() throws RecognitionException {
		MagiaCuraContext _localctx = new MagiaCuraContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_magiaCura);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				magiaCuraEK();
				}
				break;
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				magiaCuraED();
				}
				break;
			case T__45:
			case T__46:
			case T__47:
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				magiaCuraRP();
				}
				break;
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				magiaCuraMS();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaAtaqueEKContext extends ParserRuleContext {
		public MagiaAtaqueEKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaAtaqueEK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaAtaqueEK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaAtaqueEK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaAtaqueEK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaAtaqueEKContext magiaAtaqueEK() throws RecognitionException {
		MagiaAtaqueEKContext _localctx = new MagiaAtaqueEKContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_magiaAtaqueEK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaCuraEKContext extends ParserRuleContext {
		public MagiaCuraEKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaCuraEK; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaCuraEK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaCuraEK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaCuraEK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaCuraEKContext magiaCuraEK() throws RecognitionException {
		MagiaCuraEKContext _localctx = new MagiaCuraEKContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_magiaCuraEK);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaAtaqueEDContext extends ParserRuleContext {
		public MagiaAtaqueEDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaAtaqueED; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaAtaqueED(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaAtaqueED(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaAtaqueED(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaAtaqueEDContext magiaAtaqueED() throws RecognitionException {
		MagiaAtaqueEDContext _localctx = new MagiaAtaqueEDContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_magiaAtaqueED);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaCuraEDContext extends ParserRuleContext {
		public MagiaCuraEDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaCuraED; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaCuraED(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaCuraED(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaCuraED(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaCuraEDContext magiaCuraED() throws RecognitionException {
		MagiaCuraEDContext _localctx = new MagiaCuraEDContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_magiaCuraED);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaAtaqueMSContext extends ParserRuleContext {
		public MagiaAtaqueMSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaAtaqueMS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaAtaqueMS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaAtaqueMS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaAtaqueMS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaAtaqueMSContext magiaAtaqueMS() throws RecognitionException {
		MagiaAtaqueMSContext _localctx = new MagiaAtaqueMSContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_magiaAtaqueMS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaCuraMSContext extends ParserRuleContext {
		public MagiaCuraMSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaCuraMS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaCuraMS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaCuraMS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaCuraMS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaCuraMSContext magiaCuraMS() throws RecognitionException {
		MagiaCuraMSContext _localctx = new MagiaCuraMSContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_magiaCuraMS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaAtaqueRPContext extends ParserRuleContext {
		public MagiaAtaqueRPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaAtaqueRP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaAtaqueRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaAtaqueRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaAtaqueRP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaAtaqueRPContext magiaAtaqueRP() throws RecognitionException {
		MagiaAtaqueRPContext _localctx = new MagiaAtaqueRPContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_magiaAtaqueRP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MagiaCuraRPContext extends ParserRuleContext {
		public MagiaCuraRPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_magiaCuraRP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).enterMagiaCuraRP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TibiaCardListener ) ((TibiaCardListener)listener).exitMagiaCuraRP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TibiaCardVisitor ) return ((TibiaCardVisitor<? extends T>)visitor).visitMagiaCuraRP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MagiaCuraRPContext magiaCuraRP() throws RecognitionException {
		MagiaCuraRPContext _localctx = new MagiaCuraRPContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_magiaCuraRP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\3\7\3\61\n\3\f\3"+
		"\16\3\64\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\6\bP\n\b\r\b\16\bQ\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\6\n`\n\n\r\n\16\na\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\5\13j\n\13\3\f\3\f\3\f\3\f\5\fp\n\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\f\3\2\7\n\3\2"+
		"\13\f\3\2\22\30\3\2\31\32\3\2\33 \3\2!\"\3\2#(\3\2)+\3\2,/\3\2\60\63\2"+
		"z\2(\3\2\2\2\4+\3\2\2\2\6\65\3\2\2\2\bA\3\2\2\2\nC\3\2\2\2\fH\3\2\2\2"+
		"\16J\3\2\2\2\20U\3\2\2\2\22Z\3\2\2\2\24i\3\2\2\2\26o\3\2\2\2\30q\3\2\2"+
		"\2\32s\3\2\2\2\34u\3\2\2\2\36w\3\2\2\2 y\3\2\2\2\"{\3\2\2\2$}\3\2\2\2"+
		"&\177\3\2\2\2()\5\4\3\2)\3\3\2\2\2*,\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2"+
		"\2\2-.\3\2\2\2.\62\3\2\2\2/\61\5\f\7\2\60/\3\2\2\2\61\64\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\7\3\2\2\66\67"+
		"\79\2\2\678\7\65\2\289\5\b\5\29:\7:\2\2:;\7\65\2\2;<\7\4\2\2<=\5\n\6\2"+
		"=>\7\65\2\2>?\7\5\2\2?@\7\6\2\2@\7\3\2\2\2AB\t\2\2\2B\t\3\2\2\2CD\t\3"+
		"\2\2D\13\3\2\2\2EI\5\16\b\2FI\5\20\t\2GI\5\22\n\2HE\3\2\2\2HF\3\2\2\2"+
		"HG\3\2\2\2I\r\3\2\2\2JK\7\r\2\2KL\7\16\2\2LO\79\2\2MN\78\2\2NP\5\24\13"+
		"\2OM\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\17\2\2T\17\3"+
		"\2\2\2UV\7\20\2\2VW\7\16\2\2WX\79\2\2XY\7\17\2\2Y\21\3\2\2\2Z[\7\21\2"+
		"\2[\\\7\16\2\2\\_\79\2\2]^\78\2\2^`\5\26\f\2_]\3\2\2\2`a\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2bc\3\2\2\2cd\7\17\2\2d\23\3\2\2\2ej\5\30\r\2fj\5\34\17\2"+
		"gj\5$\23\2hj\5 \21\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\25\3\2\2"+
		"\2kp\5\32\16\2lp\5\36\20\2mp\5&\24\2np\5\"\22\2ok\3\2\2\2ol\3\2\2\2om"+
		"\3\2\2\2on\3\2\2\2p\27\3\2\2\2qr\t\4\2\2r\31\3\2\2\2st\t\5\2\2t\33\3\2"+
		"\2\2uv\t\6\2\2v\35\3\2\2\2wx\t\7\2\2x\37\3\2\2\2yz\t\b\2\2z!\3\2\2\2{"+
		"|\t\t\2\2|#\3\2\2\2}~\t\n\2\2~%\3\2\2\2\177\u0080\t\13\2\2\u0080\'\3\2"+
		"\2\2\t-\62HQaio";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}