package br.ufscar.dc.compiladores.tibiacard;

import br.ufscar.dc.compiladores.tibiacard.TibiaCardParser.ProgramaContext;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author Ariane Gomes 743507 e Sabrina Miranda 743595
 * 
 * Classe principal
 * 
 */

public class Principal {    
    public static void main(String args[]) throws IOException {
        
        // Chamada para criação dos arquivos
        Arquivo.criaArquivo(args[1]);

        // Criação da linguagem AlgumaLexer e seus tokens
        CharStream cs = CharStreams.fromFileName(args[0]);
        TibiaCardLexer lexer = new TibiaCardLexer(cs);

        // Criação do parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TibiaCardParser parser = new TibiaCardParser(tokens);
        
        // Gerenciamento de erros no parcer com override do syntaxError
        MeuErrorListener mel = new MeuErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(mel);
        
        // Criação da parte semântica
        ProgramaContext arvore = parser.programa();
        Semantico as = new Semantico();
        as.visitPrograma(arvore);
        
        parser.programa();
        
        Arquivo.gravaArquivo();
           
    }
}