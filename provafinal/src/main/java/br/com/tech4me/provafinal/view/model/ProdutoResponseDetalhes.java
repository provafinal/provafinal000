package br.com.tech4me.provafinal.view.model;

import java.util.List;

import br.com.tech4me.provafinal.shared.Venda;

public class ProdutoResponseDetalhes {
    private String id;
    private String nome;
    private int valor;
    private List<Venda> vendas;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public List<Venda> getVendas() {
        return vendas;
    }
    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}
