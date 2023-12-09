/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.ErroValorNumerico;
import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private float valor;
    private int quantidade;
    private static List<Produto> ListaProdutos;

    public Produto(String nome, float valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        Produto.ListaProdutos = new ArrayList<>();
    }

    public Produto() {
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

    public static void setlistaProdutos(List<Produto> produto) {
        Produto.ListaProdutos = produto;
    }

    public static List<Produto> getListaProdutos() {
        return ListaProdutos;
    }

    public void adicionarProduto(Produto produto) {
        Produto.ListaProdutos.add(produto);
    }

    public static void validaCampoVazioCadastro(String nome, String quantidade, String valor) throws CampoVazio {
        if (nome == null || nome.trim().isEmpty() || quantidade == null || quantidade.trim().isEmpty() || valor == null || valor.trim().isEmpty()) {
            throw new CampoVazio();
        }
    }

    public static void validaCampoNumerico(String quantidade, String valor) throws ErroValorNumerico {
        try {
            Integer.parseInt(quantidade);
        } catch (NumberFormatException e) {
            throw new ErroValorNumerico("A quantidade precisa ser um valor inteiro");
        }
        try {
            Float.parseFloat(valor);
        } catch (NumberFormatException e) {
            throw new ErroValorNumerico("O campo valor do produto precisa ser um valor numérico!");
        }
    }
}
