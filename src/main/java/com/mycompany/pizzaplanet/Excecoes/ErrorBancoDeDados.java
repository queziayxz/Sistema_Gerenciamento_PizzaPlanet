package com.mycompany.pizzaplanet.Excecoes;

public class ErrorBancoDeDados extends RuntimeException{

    public ErrorBancoDeDados() {
        super("Erro de banco de dados");
    }
    
}
