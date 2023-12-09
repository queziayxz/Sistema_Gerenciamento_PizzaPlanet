/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Model;

public class Dinheiro extends Pagamento {
    public Dinheiro(double valor) {
        super(valor);
    }
    
    @Override
    public double retornaTotal() {
        return this.valor - 0.1 * this.valor;
    }
    
    @Override
    public String getID() {
        return "";
    }
}
