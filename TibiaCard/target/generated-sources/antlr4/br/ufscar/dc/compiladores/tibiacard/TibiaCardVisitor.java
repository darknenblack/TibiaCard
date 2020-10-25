// Generated from br/ufscar/dc/compiladores/tibiacard/TibiaCard.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.tibiacard;

  import br.ufscar.dc.compiladores.tibiacard.Arquivo;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TibiaCardParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TibiaCardVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TibiaCardParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(TibiaCardParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(TibiaCardParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#classe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasse(TibiaCardParser.ClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(TibiaCardParser.StatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(TibiaCardParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#cmdAtaque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtaque(TibiaCardParser.CmdAtaqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#cmdLute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLute(TibiaCardParser.CmdLuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#cmdCura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCura(TibiaCardParser.CmdCuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaAtaque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaAtaque(TibiaCardParser.MagiaAtaqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaCura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaCura(TibiaCardParser.MagiaCuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaAtaqueEK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaAtaqueEK(TibiaCardParser.MagiaAtaqueEKContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaCuraEK}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaCuraEK(TibiaCardParser.MagiaCuraEKContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaAtaqueED}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaAtaqueED(TibiaCardParser.MagiaAtaqueEDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaCuraED}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaCuraED(TibiaCardParser.MagiaCuraEDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaAtaqueMS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaAtaqueMS(TibiaCardParser.MagiaAtaqueMSContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaCuraMS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaCuraMS(TibiaCardParser.MagiaCuraMSContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaAtaqueRP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaAtaqueRP(TibiaCardParser.MagiaAtaqueRPContext ctx);
	/**
	 * Visit a parse tree produced by {@link TibiaCardParser#magiaCuraRP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagiaCuraRP(TibiaCardParser.MagiaCuraRPContext ctx);
}