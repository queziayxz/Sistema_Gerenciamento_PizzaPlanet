/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaplanet.Model;

import java.util.List;

/**
 *
 * @author Giovanni
 */
public class Pix extends Pagamento {
    private String chave;
    
    public Pix(double valor, String chave) {
        super(valor);
        this.chave = chave;
    }
    
    @Override
    double retornaTotal() {
        return this.valor;
    }

    @Override
    public String getID() {
        return chave;
    }

    public static List<Pagamento> getListaPix() {
        return listaPix;
    }

    public static List<Pagamento> getListaCartao() {
        return listaCartao;
    }
    
    
    
}
