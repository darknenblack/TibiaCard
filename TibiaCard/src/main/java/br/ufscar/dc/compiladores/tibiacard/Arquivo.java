package br.ufscar.dc.compiladores.tibiacard;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariane Gomes 743507 e Sabrina Miranda 743595
 * 
 * Classe responsável pela criação do arquivo de saída
 * 
 */

public class Arquivo {

    public static StringBuffer arquivo = new StringBuffer();
    public static String caminhoArquivo;
    // Lista que separa cada div do site pelo personagem correto
    public static List<String> divPersonagem = new ArrayList<String>();

    public static void AdicionaString(String texto) {
        arquivo.append(texto).append("\n");
    }

    public static String getTexto() {
        return arquivo.toString();
    }

    // O arquivo é criado com toda a estrutura de início do HTML e CSS
    public static void criaArquivo(String caminho) {
        caminhoArquivo = caminho;
        arquivo.append("<html>\n" +
                "    <head>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "        <title>Magias Tibia</title>\n" +
                "        <style type=\"text/css\">\n" +
                "            body {\n" +
                "                background-image: url('https://i.imgur.com/MqKxww7.png');\n" +
                "            }\n" +
                "            td {\n" +
                "                vertical-align: top;\n" +
                "            }\n" +
                "            #box {\n" +
                "                width: 300px;\n" +
                "                min-height: 400px;\n" +
                "                max-height: 1000px;\n" +
                "                border-style: solid;\n" +
                "                border-color: #A0522D;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #CD853F;\n" +
                "                font-family: sans-serif;\n" +
                "                font-weight: bold;\n" +
                "                background-color: #F5F5DC;\n" +
                "            }\n" +
                "\n" +
                "            #erros {\n" +
                "                margin: 0 auto;\n" +
                "                border-style: solid;\n" +
                "                border-color: #A0522D;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #CD853F;\n" +
                "                font-family: sans-serif;\n" +
                "                font-weight: bold;\n" +
                "                background-color: #F5F5DC;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip {\n" +
                "                position: relative;\n" +
                "                display: inline-block;\n" +
                "                cursor: help;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip .tooltiptext {\n" +
                "                visibility: hidden;\n" +
                "                width: 120px;\n" +
                "                text-align: center;\n" +
                "                border-radius: 6px;\n" +
                "                padding: 5px 0;\n" +
                "                position: absolute;\n" +
                "                z-index: 1;\n" +
                "                top: -5px;\n" +
                "                left: 105%;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip:hover .tooltiptext {\n" +
                "                visibility: visible;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "         \n" +
                "    <body>\n" +
                "        <table>\n" +
                "            <tr>\n");
    }
    
    // Cria div de 1 personagem
    public static void adicionaDiv(String info) {
        divPersonagem.add(info);
    }
    
    // Faz concatenação em div de 1 personagem
    public static void appendDiv(int codigo, String infoNova) {
        String infoAnterior = divPersonagem.get(codigo);
        String infoConcat = infoAnterior.concat(infoNova);
        divPersonagem.set(codigo, infoConcat);
    }

    // Grava o texto gerado no arquivo de saída
    public static void gravaArquivo() {
        for(int i = 0; i < divPersonagem.size(); i++) {
            appendDiv(i, "                </td></div>\n\n");
            arquivo.append(divPersonagem.get(i));
        }
        
        arquivo.append("            </tr>\n" +
                "        </table>\n" +
                "    </body>\n" +
                "</html>");

        try {
            Files.writeString(Paths.get(caminhoArquivo), getTexto());
        } catch (IOException e) {
        }

        System.exit(0);

    }
    
    // Retorna o URL do gif da magia requisitada
    public static String getURLMagia(String nomeMagia) {
        
        switch (nomeMagia) {
            case "exevo mas san":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/8/8a/Magia_Divine_Caldera.gif\">\n";
            case "exori san":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/6/64/Magia_Divine_Missile.gif\">\n";
            case "exevo frigo hur":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/1/13/Magia_Ice_Wave.gif\">\n";
            case "exevo vis lux":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/d/d4/Magia_Energy_Beam.gif\">\n";
            case "exevo gran vis lux":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/e/ed/Magia_Great_Energy_Beam.gif\">\n";
            case "exevo vis hur":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/c/c0/Magia_Energy_Wave.gif\">\n";
            case "exura":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/f/f5/Magia_Light_Healing.gif\">\n";
            case "exura gran":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/8/82/Magia_Intense_Healing.gif\">\n";
            case "exura vita":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/3/3c/Magia_Ultimate_Healing.gif\">\n";
            case "exura san":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/e/e0/Magia_Divine_Healing.gif\">\n";
            case "exura ico":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/9/9f/Magia_Wound_Cleansing.gif\">\n";
            case "exori gran ico":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/2/28/Magia_Annihilation.gif\">\n";
            case "exori":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/f/f5/Magia_Berserk.gif\">\n";
            case "exori ico":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/f/f9/Magia_Brutal_Strike.gif\">\n";
            case "exori gran":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/5/59/Magia_Fierce_Berserk.gif\">\n";
            case "exori mas":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/7/73/Magia_Groundshaker.gif\">\n";
            case "exori hur":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/c/ce/Magia_Whirlwind_Throw.gif\">\n";
            case "exori min":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/6/64/Magia_Front_Sweep.gif\">\n";
            case "exevo gran mas frigo":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/2/2e/Magia_Eternal_Winter.gif\">\n";
            case "exori moe ico":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/e/ec/Magia_Physical_Strike.gif\">\n";
            case "exevo gran mas tera":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/9/97/Magia_Wrath_of_Nature.gif\">\n";
            case "exevo gran mas vis":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/d/d5/Magia_Rage_of_the_Skies.gif\">\n";
            case "exevo gran mas flam":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/6/6b/Magia_Hell%27s_Core.gif\">\n";
            case "exura gran mas res":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/9/91/Magia_Mass_Healing.gif\">\n";
            case "exori con":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/c/c5/Magia_Ethereal_Spear.gif\">\n";
            case "exura gran san":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/3/3f/Magia_Salvation.gif\">\n";
            case "utura":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/9/9a/Magia_Recovery.gif\">\n";
            case "utura gran":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/f/fd/Magia_Intense_Recovery.gif\">\n";
            case "exura sio":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/9/9a/Magia_Heal_Friend.gif\">\n";
            case "exura gran ico":
                return "                            <img src=\"https://www.tibiawiki.com.br/images/e/e4/Magia_Intense_Wound_Cleansing.gif\">\n";
            default:
                return "Magia inválida!";
        }
    }
    
}
