package com.mycompany.pizzaplanet.Model;

public class CartaoDebito extends Pagamento {
    private String numConta;
    
    public CartaoDebito(double valor, String numConta) {
        super(valor);
        this.numConta = numConta;
    }
    
    @Override
    public double retornaTotal() {
        return this.valor + 0.05 * this.valor;
    }
    
    @Override
    public String getID() {
        return numConta;
    }
}
