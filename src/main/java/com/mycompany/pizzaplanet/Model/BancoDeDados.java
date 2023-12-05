package com.mycompany.pizzaplanet.Model;

//import das models
import com.mycompany.pizzaplanet.Model.Administrador;
import com.mycompany.pizzaplanet.Model.Cliente;

import java.util.*;
import javax.swing.*;
import com.google.gson.*;
//import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mycompany.pizzaplanet.Excecoes.ErroValorNumerico;
//import java.io.BufferedReader;
import java.io.*;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.lang.reflect.Type;

public class BancoDeDados {
    private String pastaBanco = "Banco_De_Dados";
    private static File bancoCliente;
    private static File bancoAdministrador;
    private static File bancoIngrediente;
    private static File bancoTamanho;
    private static File bancoProduto;
//    private static List<Cliente> listaDeCliente;
//    private static List<Administrador> listaDeAdministrador;
    
    public BancoDeDados() {
        BancoDeDados.bancoCliente = new File(this.pastaBanco+"\\BancoDeDadosCliente.json");
        BancoDeDados.bancoAdministrador = new File(this.pastaBanco+"\\BancoDeDadosAdministrador.json");
        BancoDeDados.bancoIngrediente = new File(this.pastaBanco+"\\BancoDeDadosIngrediente.json");
        BancoDeDados.bancoTamanho = new File(this.pastaBanco+"\\BancoDeDadosTamanho.json");
        BancoDeDados.bancoProduto = new File(this.pastaBanco+"\\BancoDeDadosProduto.json");
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
    
    public static void leBDAdm(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Administrador>>(){}.getType();
                Administrador.setListaAdm(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
    }
    public static void leBDIngrediente(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Ingrediente>>(){}.getType();
                Ingrediente.setlistaIngrediente(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
    }
    
    public static void leBDTamanho(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Tamanho>>(){}.getType();
                Tamanho.setListaTamanhos(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
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

    public static File getBancoIngrediente() {
        return bancoIngrediente;
    }

    public static File getBancoTamanho() {
        return bancoTamanho;
    }

    public static File getBancoProduto() {
        return bancoProduto;
    }
}
