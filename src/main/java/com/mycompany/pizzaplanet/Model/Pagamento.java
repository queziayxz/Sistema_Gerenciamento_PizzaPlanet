/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Model;

import java.util.*;

abstract public class Pagamento {
    double valor;
    String nome;
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
    
    abstract public double retornaTotal();

    abstract public String getID();
}
