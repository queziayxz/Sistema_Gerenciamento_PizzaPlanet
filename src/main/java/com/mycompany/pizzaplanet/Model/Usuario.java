package com.mycompany.pizzaplanet.Model;

public class Usuario {
    private String nome, email, senha;
    private CPF cpf;
    

    public Usuario(String nome, String email, String senha, CPF cpf, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }

    public CPF getCpf() {
        return cpf;
    }
}
