/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Controller;

//import das models
import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.CpfJaCadastrado;
import com.mycompany.pizzaplanet.Excecoes.ErroLogin;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Cliente;
import java.io.FileWriter;
import java.io.IOException;

import java.util.*;
import javax.swing.JOptionPane;

public class ClienteController {
    
    public static boolean loginCliente(String email, String senha) throws IOException, CampoVazio, ErroLogin {
        Cliente.validaCamposLogin(email, senha);
        BancoDeDados.leBD(BancoDeDados.getBancoCliente());
        for (Cliente user : Cliente.getListaCliente()) {
            if (email.equals(user.getEmail()) && senha.equals(user.getSenha())) {
                Cliente.setClienteLogado(user);
                return true;
            }
        }
        throw new ErroLogin();
    }
    
    public static void CadastroCliente(Cliente usuario) throws IOException, CpfJaCadastrado {
        Gson gson = new Gson();
        BancoDeDados conn = new BancoDeDados();
        try {
            BancoDeDados.leBD(BancoDeDados.getBancoCliente());
            
            for(Cliente usuarioBanco : Cliente.getListaCliente()) {
                if(usuario.getCpf().getCpf().equals(usuarioBanco.getCpf().getCpf())) {
                    throw new CpfJaCadastrado();
                }
            }
            
            FileWriter writer = new FileWriter(BancoDeDados.getBancoCliente());
            Cliente.getListaCliente().add(usuario);
            
            String jsonUsuario = gson.toJson(Cliente.getListaCliente());
            writer.write(jsonUsuario);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new IOException();
        } catch (CpfJaCadastrado e) {
            throw new CpfJaCadastrado();
        } 
    }
}
