package org.example;

import java.util.ArrayList;
import java.util.List;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void editarProduto(String nomeAntigo, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getNome().equals(nomeAntigo)) {
                produtos.set(i, novoProduto);
                return;
            }
        }
        System.out.println("Erro: Produto não encontrado. Não foi possível editar.");
    }

    public void excluirProduto(String nome) {
        produtos.removeIf(produto -> produto.getNome().equals(nome));
    }

    public Produto consultarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos);
    }
}
