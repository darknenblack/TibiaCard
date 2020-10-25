// Generated from br/ufscar/dc/compiladores/tibiacard/TibiaCard.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.tibiacard;

  import br.ufscar.dc.compiladores.tibiacard.Arquivo;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TibiaCardParser}.
 */
public interface TibiaCardListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TibiaCardParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TibiaCardParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(TibiaCardParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(TibiaCardParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(TibiaCardParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(TibiaCardParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#classe}.
	 * @param ctx the parse tree
	 */
	void enterClasse(TibiaCardParser.ClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#classe}.
	 * @param ctx the parse tree
	 */
	void exitClasse(TibiaCardParser.ClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(TibiaCardParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(TibiaCardParser.StatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(TibiaCardParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(TibiaCardParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#cmdAtaque}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtaque(TibiaCardParser.CmdAtaqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#cmdAtaque}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtaque(TibiaCardParser.CmdAtaqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#cmdLute}.
	 * @param ctx the parse tree
	 */
	void enterCmdLute(TibiaCardParser.CmdLuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#cmdLute}.
	 * @param ctx the parse tree
	 */
	void exitCmdLute(TibiaCardParser.CmdLuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#cmdCura}.
	 * @param ctx the parse tree
	 */
	void enterCmdCura(TibiaCardParser.CmdCuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#cmdCura}.
	 * @param ctx the parse tree
	 */
	void exitCmdCura(TibiaCardParser.CmdCuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaAtaque}.
	 * @param ctx the parse tree
	 */
	void enterMagiaAtaque(TibiaCardParser.MagiaAtaqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaAtaque}.
	 * @param ctx the parse tree
	 */
	void exitMagiaAtaque(TibiaCardParser.MagiaAtaqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaCura}.
	 * @param ctx the parse tree
	 */
	void enterMagiaCura(TibiaCardParser.MagiaCuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaCura}.
	 * @param ctx the parse tree
	 */
	void exitMagiaCura(TibiaCardParser.MagiaCuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaAtaqueEK}.
	 * @param ctx the parse tree
	 */
	void enterMagiaAtaqueEK(TibiaCardParser.MagiaAtaqueEKContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaAtaqueEK}.
	 * @param ctx the parse tree
	 */
	void exitMagiaAtaqueEK(TibiaCardParser.MagiaAtaqueEKContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaCuraEK}.
	 * @param ctx the parse tree
	 */
	void enterMagiaCuraEK(TibiaCardParser.MagiaCuraEKContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaCuraEK}.
	 * @param ctx the parse tree
	 */
	void exitMagiaCuraEK(TibiaCardParser.MagiaCuraEKContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaAtaqueED}.
	 * @param ctx the parse tree
	 */
	void enterMagiaAtaqueED(TibiaCardParser.MagiaAtaqueEDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaAtaqueED}.
	 * @param ctx the parse tree
	 */
	void exitMagiaAtaqueED(TibiaCardParser.MagiaAtaqueEDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaCuraED}.
	 * @param ctx the parse tree
	 */
	void enterMagiaCuraED(TibiaCardParser.MagiaCuraEDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaCuraED}.
	 * @param ctx the parse tree
	 */
	void exitMagiaCuraED(TibiaCardParser.MagiaCuraEDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaAtaqueMS}.
	 * @param ctx the parse tree
	 */
	void enterMagiaAtaqueMS(TibiaCardParser.MagiaAtaqueMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaAtaqueMS}.
	 * @param ctx the parse tree
	 */
	void exitMagiaAtaqueMS(TibiaCardParser.MagiaAtaqueMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaCuraMS}.
	 * @param ctx the parse tree
	 */
	void enterMagiaCuraMS(TibiaCardParser.MagiaCuraMSContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaCuraMS}.
	 * @param ctx the parse tree
	 */
	void exitMagiaCuraMS(TibiaCardParser.MagiaCuraMSContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaAtaqueRP}.
	 * @param ctx the parse tree
	 */
	void enterMagiaAtaqueRP(TibiaCardParser.MagiaAtaqueRPContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaAtaqueRP}.
	 * @param ctx the parse tree
	 */
	void exitMagiaAtaqueRP(TibiaCardParser.MagiaAtaqueRPContext ctx);
	/**
	 * Enter a parse tree produced by {@link TibiaCardParser#magiaCuraRP}.
	 * @param ctx the parse tree
	 */
	void enterMagiaCuraRP(TibiaCardParser.MagiaCuraRPContext ctx);
	/**
	 * Exit a parse tree produced by {@link TibiaCardParser#magiaCuraRP}.
	 * @param ctx the parse tree
	 */
	void exitMagiaCuraRP(TibiaCardParser.MagiaCuraRPContext ctx);
}