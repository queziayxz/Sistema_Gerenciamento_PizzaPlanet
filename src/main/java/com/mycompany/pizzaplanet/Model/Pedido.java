package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private String formaPagamento;
    private List<Pizza> pizza;
    private Tamanho tamanho;
    private double valorTotal;

    public Pedido() {
    }

    public Pedido(Cliente cliente, String formaPagamento, List<Pizza> pizza, Tamanho tamanho) {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.pizza = new ArrayList<>();
        this.tamanho = tamanho;
    }

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
    
    public static void verificaPizzaTamanhoVazia(String pizzaSalgada, String pizzaDoce, Tamanho tamanho)throws CampoVazio {
        if(pizzaSalgada == null && pizzaDoce == null)
            throw new CampoVazio();
        if(tamanho == null)
            throw new CampoVazio();
    }    
}
