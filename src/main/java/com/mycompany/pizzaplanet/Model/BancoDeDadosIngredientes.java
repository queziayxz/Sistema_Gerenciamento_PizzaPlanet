/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaplanet.Model;

/**
 *
 * @author augus
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.pizzaplanet.Excecoes.ErrorBancoDeDados;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import javax.swing.JOptionPane;

public class BancoDeDadosIngredientes {
    private String pastaBanco = "Banco_De_Dados";
    private static File bancoIngredientes;

    public BancoDeDadosIngredientes() {
        BancoDeDadosIngredientes.bancoIngredientes = new File(this.pastaBanco+"\\BancoDeDadosIngredientes.json");
    }

    public static void leBDIngredientes(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Ingredientes>>(){}.getType();
                Ingredientes.setListaIngredientes(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new ErrorBancoDeDados();
            }
        }
        arquivoJson.close();
        writer.close();
    }

    public String getPastaBanco() {
        return pastaBanco;
    }

    public static File getBancoIngredientes() {
        return bancoIngredientes;
    }
}
