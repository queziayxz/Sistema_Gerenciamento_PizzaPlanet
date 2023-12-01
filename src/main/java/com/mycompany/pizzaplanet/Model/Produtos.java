
package com.mycompany.pizzaplanet.Model;

import java.util.ArrayList;
import java.util.List;


public class Produtos {

    class Produto {
        String nome;
        float valor;
        int quantidade;

        Produto(String nome, float valor, int quantidade) {
            this.nome = nome;
            this.valor = valor;
            this.quantidade = quantidade;
        }
    }

    private List<Produto> produtos;

    public Produtos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, float valor, int quantidade) {
        produtos.add(new Produto(nome, valor, quantidade));
    }

    public void comprarProduto(int index) {
        try {
            Produto produto = produtos.get(index);
            int quantidade = produto.quantidade;
            if (quantidade == 0) {
                System.out.println("Erro: Produto esgotado. Não foi possível realizar a compra.");
            } else {
                produto.quantidade = quantidade - 1;
                System.out.println("Compra realizada com sucesso");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido. Não foi possível realizar a compra.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void removerProduto(int index) {
        try {
            produtos.remove(index);
            System.out.println("Produto Removido");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido. Não foi possível remover o produto.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void mostrarProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println(produto.nome + " valor: " + produto.valor + " Quantidade: " + produto.quantidade);
        }
    }
}
