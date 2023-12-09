package com.mycompany.pizzaplanet.Excecoes;

public class CpfJaCadastrado extends RuntimeException{

    public CpfJaCadastrado() {
        super("CPF já cadastrado");
    }
    
}
