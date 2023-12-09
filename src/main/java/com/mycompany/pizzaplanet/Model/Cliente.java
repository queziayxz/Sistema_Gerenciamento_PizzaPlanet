package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import java.util.*;

public class Cliente extends Usuario {
    
    private static List<Cliente> listaCliente;
    private Endereco endereco;
    private static Cliente clienteLogado;

    public Cliente(String nome, String email, String senha, CPF cpf, Endereco endereco) throws CampoVazio {
        super(nome, email, senha, cpf);
        this.endereco = endereco;
        Cliente.listaCliente = new ArrayList<>();
    }
    
    public Cliente(String email, String senha) {
        Cliente.clienteLogado.setEmail(email);
        Cliente.clienteLogado.setSenha(senha);
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

    public static Cliente getClienteLogado() {
        return clienteLogado;
    }

    public static void setClienteLogado(Cliente clienteLogado) {
        Cliente.clienteLogado = clienteLogado;
    }
}
