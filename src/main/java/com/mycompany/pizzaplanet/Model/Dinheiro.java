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
