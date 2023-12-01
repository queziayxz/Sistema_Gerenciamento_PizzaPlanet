package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import java.util.*;

public class Cliente extends Usuario {
    
    private static List<Cliente> listaCliente;
    private Endereco endereco;

    public Cliente(String nome, String email, String senha, CPF cpf, Endereco endereco) throws CampoVazio {
        super(nome, email, senha, cpf);
        this.validaCadastroVazio(nome, email, senha);
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
    
    private void validaCadastroVazio(String nome, String email, String senha) throws CampoVazio {
        if(nome == null || "".equals(nome))
            throw new CampoVazio();
        if(email == null || "".equals(email))
            throw new CampoVazio();
        if(senha == null || "".equals(senha))
            throw new CampoVazio();
    }
    
}
