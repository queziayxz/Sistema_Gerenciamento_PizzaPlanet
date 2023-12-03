package com.mycompany.pizzaplanet.Excecoes;

public class ErroLogin extends RuntimeException {

    public ErroLogin() {
        super("E-mail ou senha inválidos");
    }
    
}
