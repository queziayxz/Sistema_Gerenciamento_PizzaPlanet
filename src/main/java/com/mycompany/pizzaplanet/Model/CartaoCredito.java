package com.mycompany.pizzaplanet.Model;

public class CartaoCredito extends Pagamento {
    private String numConta;

    public CartaoCredito(double valor, String numConta) {
        super(valor);
        this.numConta = numConta;
    }
    
    @Override
    public double retornaTotal() {
        return this.valor + 0.1 * this.valor;
    }
    
    @Override
    public String getID() {
        return numConta;
    }
}
