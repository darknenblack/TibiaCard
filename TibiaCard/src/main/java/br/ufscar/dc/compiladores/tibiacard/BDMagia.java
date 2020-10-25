package br.ufscar.dc.compiladores.tibiacard;

import java.util.HashMap;

/**
 *
 * @author Ariane Gomes 743507 e Sabrina Miranda 743595
 * 
 * Classe responsável pela criação de um banco de dados das magias e seus custos de mana
 * 
 */

public class BDMagia {
    
    private final HashMap<String, Integer> tabela;
    
    public BDMagia() {
        this.tabela = new HashMap<>();
    }
    
    public int getMana(String nome) {
        return tabela.get(nome);
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    // Inicializa as magias com o seus respectivos custos de mana
    public void inicializarFree() {
        tabela.put("exevo frigo hur", 25);
        tabela.put("exevo vis lux", 40);
        tabela.put("exevo gran vis lux", 110);
        tabela.put("exevo vis hur", 170);
        tabela.put("exura", 20);
        tabela.put("exura gran", 70);
        tabela.put("exura vita", 160);
        tabela.put("exura san", 160);
        tabela.put("exura ico", 40);
    }
    public void inicializarPremium(){
        tabela.put("exori gran ico", 500);        
        tabela.put("exori", 115);
        tabela.put("exori ico", 30);
        tabela.put("exori gran", 340);
        tabela.put("exori mas", 160);
        tabela.put("exori hur", 40);    
        tabela.put("exori min", 200);       
        tabela.put("exevo gran mas tera", 1050);
        tabela.put("exori moe ico", 20);
        tabela.put("exevo gran mas frigo", 1050);
        tabela.put("exevo gran mas flam", 1100);
        tabela.put("exevo gran mas vis", 600);
        tabela.put("exura gran mas res", 150);
        tabela.put("exevo mas san", 160);
        tabela.put("exori san", 20);
        tabela.put("exori con", 20);
        tabela.put("exura gran san", 60);
        tabela.put("utura", 75);
        tabela.put("utura gran", 165);
        tabela.put("exura sio", 150);
        tabela.put("exura gran ico", 200);
    }
}
