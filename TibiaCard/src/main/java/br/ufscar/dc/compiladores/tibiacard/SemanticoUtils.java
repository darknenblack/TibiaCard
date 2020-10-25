package br.ufscar.dc.compiladores.tibiacard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariane Gomes 743507 e Sabrina Miranda 743595
 * 
 * Classe responsável por recuperar e tratar informações da gramática
 * 
 */

public class SemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, TibiaCardParser.Declaracao_localContext ctx) {
        String classe = ctx.classe().getText();

        switch (classe) {
            case "master sorcerer":
                return TabelaDeSimbolos.Classe.MASTER_SORCERER;

            case "royal paladin":
                return TabelaDeSimbolos.Classe.ROYAL_PALADIN;

            case "elite knight":
                return TabelaDeSimbolos.Classe.ELITE_KNIGHT;

            case "elder druid":
                return TabelaDeSimbolos.Classe.ELDER_DRUID;

            default:
                Arquivo.AdicionaString("                    <div id=\"erros\">" + 
                    "Classe " + classe + " não existente</div>\n");
                return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }
    
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, String nomePersonagem) {
        if (tabela.existe(nomePersonagem)) {
            return tabela.verificar(nomePersonagem);
        } else {
            return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }
    
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, TibiaCardParser.MagiaAtaqueContext ctx) {
        if (ctx.magiaAtaqueED() != null) {
            return TabelaDeSimbolos.Classe.ELDER_DRUID;
        } else if (ctx.magiaAtaqueEK() != null) {
            return TabelaDeSimbolos.Classe.ELITE_KNIGHT;
        } else if (ctx.magiaAtaqueMS() != null) {
            return TabelaDeSimbolos.Classe.MASTER_SORCERER;
        } else if (ctx.magiaAtaqueRP() != null) {
            return TabelaDeSimbolos.Classe.ROYAL_PALADIN;
        } else {
            return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }
    
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, TibiaCardParser.MagiaCuraContext ctx) {
        if (ctx.magiaCuraED() != null) {
            return TabelaDeSimbolos.Classe.ELDER_DRUID;
        } else if (ctx.magiaCuraEK() != null) {
            return TabelaDeSimbolos.Classe.ELITE_KNIGHT;
        } else if (ctx.magiaCuraMS() != null) {
            return TabelaDeSimbolos.Classe.MASTER_SORCERER;
        } else if (ctx.magiaCuraRP() != null) {
            return TabelaDeSimbolos.Classe.ROYAL_PALADIN;
        } else {
            return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }
}
