package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;

public class Usuario {
    private String nome, email, senha;
    private CPF cpf;
    

    public Usuario(String nome, String email, String senha, CPF cpf) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }

    public Usuario() {
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
    
    public static void validaCamposLogin(String email, String senha) throws CampoVazio {
        if("".equals(email) || "".equals(senha))
            throw new CampoVazio();
    }
}
