package com.mycompany.pizzaplanet.Model;

import java.util.*;


abstract public class Pagamento {
    double valor;
    static List<Pagamento> listaPix = new ArrayList<>();
    static List<Pagamento> listaCartao = new ArrayList<>();


    public Pagamento(double valor) {
        this.valor = valor;
    }

    public static List<Pagamento> getListaPix() {
        return listaPix;
    }

    public static void setListaPix(List<Pagamento> listaPix) {
        Pagamento.listaPix = listaPix;
    }
    
    public static List<Pagamento> getListaCartao() {
        return listaCartao;
    }

    public static void setListaCartao(List<Pagamento> listaCartao) {
        Pagamento.listaCartao = listaCartao;
    }
    
    
    
    abstract double retornaTotal();

    abstract public String getID();
}
