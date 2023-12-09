package com.mycompany.pizzaplanet.Model;

import java.util.List;

public class Pix extends Pagamento {
    private String chave;
    
    public Pix(double valor, String chave) {
        super(valor);
        this.chave = chave;
    }
    
    @Override
    public double retornaTotal() {
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
