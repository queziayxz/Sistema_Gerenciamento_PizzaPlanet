package com.mycompany.pizzaplanet.Model;

import java.util.*;

public class Cliente extends Usuario {
    
    private static List<Cliente> listaCliente;
    private Endereco endereco;

    public Cliente(String nome, String email, String senha, CPF cpf, Endereco endereco) {
        super(nome, email, senha, cpf, endereco);
        this.endereco = endereco;
        Cliente.listaCliente = new ArrayList<>();
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static List<Cliente> getListaCliente() {
        return listaCliente;
    }  

    public static void setListaCliente(List<Cliente> listaCliente) {
        Cliente.listaCliente = listaCliente;
    }
    
    
}
