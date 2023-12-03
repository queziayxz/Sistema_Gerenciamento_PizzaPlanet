package com.mycompany.pizzaplanet.Excecoes;

public class ErroValorNumerico extends RuntimeException{

    public ErroValorNumerico() {
        super("Campo numérico inválido");
    }
    
}
