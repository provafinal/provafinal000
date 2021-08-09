package br.com.tech4me.provafinal.shared;

import java.util.List;

public class ProdutoDto {
    private String id;
    private String nome;
    private int valor;
    private int quant;
    private List<Venda> vendasMs;
    
    public String getId() {
        return id;
    }
    public List<Venda> getVendasMs() {
        return vendasMs;
    }
    public void setVendasMs(List<Venda> vendasMs) {
        this.vendasMs = vendasMs;
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
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    
}
