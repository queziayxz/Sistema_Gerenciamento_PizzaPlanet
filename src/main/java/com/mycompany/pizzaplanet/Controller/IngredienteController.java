package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Ingrediente;
import java.io.FileWriter;
import java.io.IOException;

public class IngredienteController {

    public static void adiciona(Ingrediente ingrediente) throws IOException {
        Gson gson = new Gson();
        //inicia os arquivos
        BancoDeDados conn = new BancoDeDados();
        
        try {
            //le o banco, transformando o json em objeto
            BancoDeDados.leBDIngrediente(BancoDeDados.getBancoIngrediente());

            //adiciona o novo ingrediente a lista
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoIngrediente())) {
                //adiciona o novo ingrediente a lista
                Ingrediente.getlistaIngrediente().add(ingrediente);
                //transforma a lista em json
                String jsonIngrediente = gson.toJson(ingrediente.getlistaIngrediente());
                //escreve no arquivo
                writer.write(jsonIngrediente);
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException();
        } 
    }
    
    public static void edita(Ingrediente ingreBanco, Ingrediente ingreNovo) throws CampoVazio, IOException {
//        if("".equals(nomeEdita)) {
//            throw new CampoVazio();
//        }
        
        System.out.println(ingreBanco.getNome());

        try {
            BancoDeDados.leBDIngrediente(BancoDeDados.getBancoIngrediente());
            
            for(int i = 0; i < Ingrediente.getlistaIngrediente().size(); i++) {
                if(ingreBanco.getNome().equals(Ingrediente.getlistaIngrediente().get(i).getNome())) {
                    Ingrediente.getlistaIngrediente().set(i, ingreNovo);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoIngrediente())) {
                String jsonIngrediente = gson.toJson(Ingrediente.getlistaIngrediente());
                writer.write(jsonIngrediente);
                writer.flush();
            }
            
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void deleta(String nome)throws IOException {
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDIngrediente(BancoDeDados.getBancoIngrediente());
            for(int i = 0; i < Ingrediente.getlistaIngrediente().size(); i++) {
                if(nome.equals(Ingrediente.getlistaIngrediente().get(i).getNome())) {
                    Ingrediente.getlistaIngrediente().remove(i);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoIngrediente())) {
                String jsonIngrediente = gson.toJson(Ingrediente.getlistaIngrediente());
                writer.write(jsonIngrediente);
                writer.flush();
            }
            
        } catch(IOException e) {
            throw new IOException();
        }
    }
}
