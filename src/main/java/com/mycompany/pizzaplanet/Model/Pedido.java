/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import java.io.*;
import java.util.*;

public class Pedido implements Serializable {
    private Cliente cliente;
    private String formaPagamento;
    private List<Pizza> pizza;
    private Tamanho tamanho;
    private Produto produto;
    private double valorTotal;
    private String status;
    private static List<Pedido> listaPedidos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Cliente cliente, String formaPagamento, List<Pizza> pizza, Tamanho tamanho) {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.produto = new Produto();
    }

    public Pedido(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    //getters e setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public List<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(List<Pizza> pizza) {
        this.pizza = pizza;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public static List<Pedido> getListaPedidos() {
        return Pedido.listaPedidos;
    }

    public static void setListaPedidos(List<Pedido> listaPedidos) {
        Pedido.listaPedidos = listaPedidos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public static void verificaPizzaTamanhoVazia(String pizzaSalgada, String pizzaDoce, Tamanho tamanho)throws CampoVazio {
        if(pizzaSalgada == null && pizzaDoce == null)
            throw new CampoVazio();
        if(tamanho == null)
            throw new CampoVazio();
    }    
}
