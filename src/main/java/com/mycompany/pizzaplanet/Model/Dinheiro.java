/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaplanet.Model;

/**
 *
 * @author Giovanni
 */
public class Dinheiro extends Pagamento {
    public Dinheiro(double valor) {
        super(valor);
    }
    
    @Override
    double retornaTotal() {
        return this.valor - 0.1 * this.valor;
    }
    
    @Override
    public String getID() {
        return "";
    }
}
