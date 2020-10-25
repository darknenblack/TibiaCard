package br.ufscar.dc.compiladores.tibiacard;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Ariane Gomes 743507 e Sabrina Miranda 743595
 * 
 * Classe responsável por tratar os erros sintáticos
 * 
 */

public class MeuErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, 
                            int charPositionInLine, String msg, RecognitionException e) {
        
        Token t = (Token) offendingSymbol;
        String erro = t.getText();
        
        if(!erro.equals("<EOF>")) 
            // Mostra mensagem de erro sintático e salva no arquivo de saída
            Arquivo.AdicionaString("                    <div id=\"erros\">" + 
                    "Erro sintático próximo à " + erro + "</div>\n");

    }
}