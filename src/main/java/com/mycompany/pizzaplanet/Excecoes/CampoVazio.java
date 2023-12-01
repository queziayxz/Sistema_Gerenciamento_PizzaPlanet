package com.mycompany.pizzaplanet.Excecoes;

public class CampoVazio extends RuntimeException {

    public CampoVazio() {
        super("O campos vazios");
    }
    
}
