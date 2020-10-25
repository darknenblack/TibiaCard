package br.ufscar.dc.compiladores.tibiacard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ariane Gomes 743507 e Sabrina Miranda 743595
 * 
 * Classe responsável pela criação e recuperação de informações da tabela de símbolos
 * 
 */

public class TabelaDeSimbolos {
    public enum Classe {
        MASTER_SORCERER,
        ROYAL_PALADIN,
        ELITE_KNIGHT,
        ELDER_DRUID,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        Classe classe;
        boolean status;
        List<String> magias;
        int codigo;

        private EntradaTabelaDeSimbolos(String nome, Classe classe, boolean status, int codigo) {
            this.nome = nome;
            this.classe = classe;
            this.status = status;
            this.magias = new ArrayList<>();
            this.codigo = codigo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, Classe classe, String status, int codigo) {
        if(status.equals("sim"))
            tabela.put(nome, new EntradaTabelaDeSimbolos(nome, classe, true, codigo));
        else
            tabela.put(nome, new EntradaTabelaDeSimbolos(nome, classe, false, codigo));
    }
    
    public void adicionarMagia(String nome, String magia) {
        tabela.get(nome).magias.add(magia);
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public Classe verificar(String nome) {
        return tabela.get(nome).classe;
    }
    
    public boolean verificarStatus(String nome) {
        return tabela.get(nome).status;
    }
    
    public int veriticarCodigo(String nome) {
        return tabela.get(nome).codigo;
    }
}