/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaplanet.Model;

/**
 *
 * @author Giovanni
 */
public class CartaoDebito extends Pagamento {
    private String numConta;
    
    public CartaoDebito(double valor, String numConta) {
        super(valor);
        this.numConta = numConta;
    }
    
    @Override
    double retornaTotal() {
        return this.valor + 0.05 * this.valor;
    }
    
    @Override
    public String getID() {
        return numConta;
    }
}
