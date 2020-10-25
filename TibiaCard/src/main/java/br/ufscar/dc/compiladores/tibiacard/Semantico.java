package br.ufscar.dc.compiladores.tibiacard;

import br.ufscar.dc.compiladores.tibiacard.TabelaDeSimbolos.Classe;

/**
 *
 * @author Ariane Gomes 743507 e Sabrina Miranda 743595
 * 
 * Classe responsável por tratar os erros semânticos e as saídas de informação formatadas
 * 
 */

public class Semantico extends TibiaCardBaseVisitor<Void> {

    TabelaDeSimbolos tabela;
    BDMagia manaFree;
    BDMagia manaPremium;
    // Variável criada para relacionar cada personagem à uma div/card do site
    int codigoPersonagem = 0;

    @Override
    public Void visitPrograma(TibiaCardParser.ProgramaContext ctx) {
        tabela = new TabelaDeSimbolos();

        manaFree = new BDMagia();
        manaFree.inicializarFree();
        manaPremium = new BDMagia();
        manaPremium.inicializarPremium();

        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_local(TibiaCardParser.Declaracao_localContext ctx) {
        if (ctx.classe() != null) {
            Classe classe
                    = SemanticoUtils.verificarClasse(tabela, ctx);
            String classeDiv;
            String nomePersonagem = ctx.Nome().getText();
            
            // Tratamento para inserir o nome da classe no arquivo de saída
            switch (classe) {
                case MASTER_SORCERER:
                    classeDiv = "Master Sorcerer";
                    break;
                case ROYAL_PALADIN:
                    classeDiv = "Royal Paladin";
                    break;
                case ELITE_KNIGHT:
                    classeDiv = "Elite Knight";
                    break;
                case ELDER_DRUID:
                    classeDiv = "Elder Druid";
                    break;
                default:
                    classeDiv = "Classe inválida";
                    break;
            }

            if (tabela.existe(nomePersonagem)) {
                Arquivo.AdicionaString("                    <div id=\"erros\">" + 
                    "Personagem " + nomePersonagem + " já declarado anteriormente</div>\n");
            } else if(ctx.status() != null) {
                String status = ctx.status().getText();
                
                tabela.adicionar(nomePersonagem, classe, status, codigoPersonagem);
                
                if (status.equals("sim")) status = "Premium Account";
                else status = "Free Account";
                
                String div = "                <td><div id=\"box\">\n"
                        + "                    <h1><font color=\"#8B4513\">" + nomePersonagem + "</font></h1>\n"
                        + "                    <font color=\"#A0522D\">Classe:</font> " + classeDiv + "<br>\n"
                        + "                    <font color=\"#A0522D\">" + status + "</font><p><p><p>\n"
                        + "                    <img src=\"https://i.imgur.com/Skixelz.png\"></img>\n";
                
                Arquivo.adicionaDiv(div);
                codigoPersonagem++;
            }

        }
        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitCmdAtaque(TibiaCardParser.CmdAtaqueContext ctx) {
        int totalMana = 0;
        String nomePersonagem = ctx.Nome().getText();
        Classe classePersonagem = SemanticoUtils.verificarClasse(tabela, nomePersonagem);

        if (!tabela.existe(nomePersonagem)) {
            Arquivo.AdicionaString("                    <div id=\"erros\">" + 
                "Personagem " + nomePersonagem + " não declarado</div>\n");
        } else {
            int codigo = tabela.veriticarCodigo(nomePersonagem);
            Arquivo.appendDiv(codigo, 
                    "                    <h3><font color=\"#CD0000\">Magias de Ataque</font></h3><p>\n");
            // Percorre todas as magias de ataque, as valida e as imprime no arquivo de saída
            for (var ma : ctx.magiaAtaque()) {
                Classe classeMagia = SemanticoUtils.verificarClasse(tabela, ma);
                String nomeMagia = ma.getText();
                String urlMagia = Arquivo.getURLMagia(nomeMagia);
                
                if (classeMagia == TabelaDeSimbolos.Classe.INVALIDO) {
                    Arquivo.appendDiv(codigo, 
                    "                    <font color=\"#CD853F\">Magia \"" + nomeMagia + "\" não é de ataque!</font><p>\n");
                } else if (classeMagia != classePersonagem) {
                    Arquivo.appendDiv(codigo, 
                    "                    <font color=\"#CD853F\">Magia \"" + nomeMagia + "\" não é dessa classe!</font><p>\n");
                } else {
                    int mana = 0;
                    
                    /* Verifica status do personagem 
                    * Se um personagem é Free Account, ele somente poderá soltar magias Free Account
                    * Se um personagem é Premium Account, ele pode soltar tanto as magias Premium Account
                    * quanto as Free Account */
                    if (!tabela.verificarStatus(nomePersonagem)) {
                        if (manaFree.existe(nomeMagia)) {
                            //Procura a magia no BDMagia e retorna o custo de mana
                            mana = manaFree.getMana(nomeMagia);
                    
                            tabela.adicionarMagia(nomePersonagem, nomeMagia);
                            
                            Arquivo.appendDiv(codigo, 
                                    "                    <div href=\"#\" class=\"tooltip\"><u>"
                                    + nomeMagia + "</u>\n"
                                    + "                        <div class=\"tooltiptext\">\n"
                                    + urlMagia + "                        </div>\n"
                                    + "                    </div><br>\n"
                                    + "                    <font color=\"#EE0000\">Custo de mana:</font> " 
                                    + mana + "<p>\n");
                        } else {
                            Arquivo.appendDiv(codigo, 
                    "                    <font color=\"#CD853F\">Magia \"" + nomeMagia + "\" é somente para Premium Accounts!</font><p>\n");
                        }
                    }else{
                        tabela.adicionarMagia(nomePersonagem, nomeMagia);

                        //Procura a magia no BDMagia e retorna o custo de mana
                        if (manaFree.existe(nomeMagia)) {
                            mana = manaFree.getMana(nomeMagia);
                        }else{
                            mana = manaPremium.getMana(nomeMagia);
                        }
                        Arquivo.appendDiv(codigo, 
                                "                    <div href=\"#\" class=\"tooltip\"><u>"
                                + nomeMagia + "</u>\n"
                                + "                        <div class=\"tooltiptext\">\n"
                                + urlMagia + "                        </div>\n"
                                + "                    </div><br>\n"
                                + "                    <font color=\"#EE0000\">Custo de mana:</font> " 
                                + mana + "<p>\n");
                    }
                    
                    totalMana += mana;
                }
            }       
            
            Arquivo.appendDiv(codigo,
                    "                    <font color=\"#EE0000\">Mana total gasta em Ataques:</font> "
                    + totalMana + "<p><p>\n"
                    + "                    <img src=\"https://i.imgur.com/Skixelz.png\"></img>\n");
        }

        return super.visitCmdAtaque(ctx);
    }

    @Override
    public Void visitCmdCura(TibiaCardParser.CmdCuraContext ctx) {
        int totalMana = 0;
        String nomePersonagem = ctx.Nome().getText();
        Classe classePersonagem = SemanticoUtils.verificarClasse(tabela, nomePersonagem);

        if (!tabela.existe(nomePersonagem)) {
            Arquivo.AdicionaString("                    <div id=\"erros\">" + 
                "Personagem " + nomePersonagem + " não declarado</div>\n");
        } else {
            int codigo = tabela.veriticarCodigo(nomePersonagem);
            Arquivo.appendDiv(codigo, 
                    "                    <h3><font color=\"#006400\">Magias de Cura</font></h3><p>\n");
            // Percorre todas as magias de cura, as valida e as imprime no arquivo de saída
            for (var mc : ctx.magiaCura()) {
                Classe classeMagia = SemanticoUtils.verificarClasse(tabela, mc);
                String nomeMagia = mc.getText();
                String urlMagia = Arquivo.getURLMagia(nomeMagia);
                
                if (classeMagia == TabelaDeSimbolos.Classe.INVALIDO) {
                    Arquivo.appendDiv(codigo, 
                    "                    <font color=\"#CD853F\">Magia \"" + nomeMagia + "\" não é de cura!</font><p>\n");
                } else if (classeMagia != classePersonagem) {
                    Arquivo.appendDiv(codigo, 
                    "                    <font color=\"#CD853F\">Magia \"" + nomeMagia + "\" não é dessa classe!</font><p>\n");
                } else {
                    int mana = 0;
                    
                    /* Verifica status do personagem 
                    * Se um personagem é Free Account, ele somente poderá soltar magias Free Account
                    * Se um personagem é Premium Account, ele pode soltar tanto as magias Premium Account
                    * quanto as Free Account */
                    if (!tabela.verificarStatus(nomePersonagem)) {
                        if (manaFree.existe(nomeMagia)) {
                            //Procura a magia no BDMagia e retorna o custo de mana
                            mana = manaFree.getMana(nomeMagia);
                    
                            tabela.adicionarMagia(nomePersonagem, nomeMagia);
                            
                            Arquivo.appendDiv(codigo, 
                                    "                    <div href=\"#\" class=\"tooltip\"><u>"
                                    + nomeMagia + "</u>\n"
                                    + "                        <div class=\"tooltiptext\">\n"
                                    + urlMagia + "                        </div>\n"
                                    + "                    </div><br>\n"
                                    + "                    <font color=\"#228B22\">Custo de mana:</font> " 
                                    + mana + "<p>\n");
                        } else {
                            Arquivo.appendDiv(codigo, 
                    "                    <font color=\"#CD853F\">Magia \"" + nomeMagia + "\" é somente para Premium Accounts!</font><p>\n");
                        }
                    }else{
                        tabela.adicionarMagia(nomePersonagem, nomeMagia);

                        //Procura a magia no BDMagia e retorna o custo de mana
                        if (manaFree.existe(nomeMagia)) {
                            mana = manaFree.getMana(nomeMagia);
                        }else{
                            mana = manaPremium.getMana(nomeMagia);
                        }
                        Arquivo.appendDiv(codigo, 
                                "                    <div href=\"#\" class=\"tooltip\"><u>"
                                + nomeMagia + "</u>\n"
                                + "                        <div class=\"tooltiptext\">\n"
                                + urlMagia + "                        </div>\n"
                                + "                    </div><br>\n"
                                + "                    <font color=\"#228B22\">Custo de mana:</font> " 
                                + mana + "<p>\n");
                    }
                    
                    totalMana += mana;
                }
            }       
            
            Arquivo.appendDiv(codigo,
                    "                    <font color=\"#228B22\">Mana total gasta em Curas:</font> "
                    + totalMana + "<p><p>\n"
                    + "                    <img src=\"https://i.imgur.com/Skixelz.png\"></img>\n");
            
        }

        return super.visitCmdCura(ctx);
    }
}
