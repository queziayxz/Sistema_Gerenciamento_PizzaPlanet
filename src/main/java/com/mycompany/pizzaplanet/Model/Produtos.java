
package com.mycompany.pizzaplanet.Model;

import java.util.ArrayList;
import java.util.List;


public class Produtos {

    private String nome;
    private float valor;
    private int quantidade;
    private List<Produtos> produtos;

    public Produtos(String nome, float valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    public void comprarProduto(int index) {
        try {
            Produtos produto = produtos.get(index);
            int quantidade = produto.getQuantidade();
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
            Produtos produto = produtos.get(i);
            System.out.println(produto.getNome() + " valor: " + produto.getValor() + " Quantidade: " + produto.getQuantidade());
        }
    }
}
