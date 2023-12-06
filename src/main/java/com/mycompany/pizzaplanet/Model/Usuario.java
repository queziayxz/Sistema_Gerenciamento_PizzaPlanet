package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;

public abstract class Usuario {
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
    
    public static void validaCadastroVazio(String nome, String email, String senha) throws CampoVazio {
        if(nome == null || "".equals(nome))
            throw new CampoVazio();
        if(email == null || "".equals(email))
            throw new CampoVazio();
        if(senha == null || "".equals(senha))
            throw new CampoVazio();
    }
}
