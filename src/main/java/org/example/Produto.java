package org.example;


import org.apache.commons.lang3.StringUtils;

public class Produto {
    String nome;
    String descricao;
    String categoria;
    double precoUnitario;
    int quantidadeEmEstoque;

    public Produto(String nome, String descricao, String categoria, double precoUnitario, int quantidadeEmEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.precoUnitario = precoUnitario;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public boolean isValid() {
        return !StringUtils.isAnyEmpty(nome, descricao, categoria) &&
                precoUnitario != 0 && quantidadeEmEstoque >= 0;
    }

}





