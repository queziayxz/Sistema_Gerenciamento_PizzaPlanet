/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Excecoes;

public class CpfJaCadastrado extends RuntimeException{

    public CpfJaCadastrado() {
        super("CPF já cadastrado");
    }
    
}
