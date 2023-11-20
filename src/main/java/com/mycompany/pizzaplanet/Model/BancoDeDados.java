package com.mycompany.pizzaplanet.Model;

//import das models
import com.mycompany.pizzaplanet.Model.Administrador;
import com.mycompany.pizzaplanet.Model.Cliente;

import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import javax.swing.JOptionPane;

public class BancoDeDados {
    private String pastaBanco = "Banco_De_Dados";
    private static File bancoCliente;
    private static File bancoAdministrador;
//    private static List<Cliente> listaDeCliente;
//    private static List<Administrador> listaDeAdministrador;
    
    public BancoDeDados() {
        BancoDeDados.bancoCliente = new File(this.pastaBanco+"\\BancoDeDadosCliente.json");
        BancoDeDados.bancoAdministrador = new File(this.pastaBanco+"\\BancoDeDadosAdministrador.json");
    }
    
    public static void leBD(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Cliente>>(){}.getType();
                Cliente.setListaCliente(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao transformar os valores em objeto");
            }
        }
        arquivoJson.close();
        writer.close();
        
    }
    
    public String getPastaBanco() {
        return pastaBanco;
    }

    public static File getBancoCliente() {
        return bancoCliente;
    }

    public static File getBancoAdministrador() {
        return bancoAdministrador;
    }
    
    
}
