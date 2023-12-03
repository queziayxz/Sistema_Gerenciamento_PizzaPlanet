package com.mycompany.pizzaplanet.Controller;

//import das models
import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Cliente;
import java.io.FileWriter;
import java.io.IOException;

import java.util.*;
import javax.swing.JOptionPane;

public class ClienteController {
    
    public static boolean loginCliente(String email, String senha) throws IOException, CampoVazio {
        Cliente.validaCamposLogin(email, senha);
        BancoDeDados.leBD(BancoDeDados.getBancoCliente());
        for (Cliente user : Cliente.getListaCliente()) {
            if (email.equals(user.getEmail()) && senha.equals(user.getSenha())) {
                return true;
            }
        }
        return false;
    }
    
    public static void CadastroCliente(Cliente usuario) throws IOException {
        Gson gson = new Gson();
        BancoDeDados conn = new BancoDeDados();
        
        try {
            BancoDeDados.leBD(BancoDeDados.getBancoCliente());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoCliente());
            Cliente.getListaCliente().add(usuario);
            
            String jsonUsuario = gson.toJson(Cliente.getListaCliente());
            writer.write(jsonUsuario);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new IOException();
        } 
    }
}
