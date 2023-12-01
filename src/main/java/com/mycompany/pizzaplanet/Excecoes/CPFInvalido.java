package com.mycompany.pizzaplanet.Excecoes;

public class CPFInvalido extends RuntimeException {

    public CPFInvalido() {
        super("CPF inválido");
    }
    
}
