/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Tamanho;
import java.io.FileWriter;
import java.io.IOException;

public class TamanhoController {
        public static void adiciona(Tamanho tamanho) throws IOException {
        Gson gson = new Gson();
        //inicia os arquivos
        BancoDeDados conn = new BancoDeDados();
        
        try {
            //le o banco, transformando o json em objeto
            BancoDeDados.leBDTamanho(BancoDeDados.getBancoTamanho());

            //adiciona o novo ingrediente a lista
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoTamanho())) {
                //adiciona o novo ingrediente a lista
                Tamanho.getListaTamanhos().add(tamanho);
                //transforma a lista em json
                String jsonTamanho = gson.toJson(tamanho.getListaTamanhos());
                //escreve no arquivo
                writer.write(jsonTamanho);
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException();
        } 
    }
    
    public static void edita(String nomeBanco, String nomeEdita, int quantidadePecasEdita, double valorEdita) throws CampoVazio, IOException {
        if("".equals(nomeEdita)) {
            throw new CampoVazio();
        }
        
        BancoDeDados banco = new BancoDeDados();
        Tamanho tamanhoEdita = new Tamanho(nomeEdita, quantidadePecasEdita, valorEdita);

        try {

            BancoDeDados.leBDTamanho(BancoDeDados.getBancoTamanho());

            for(int i = 0; i < Tamanho.getListaTamanhos().size(); i++) {
                if(nomeBanco.equals(Tamanho.getListaTamanhos().get(i).getNome())) {
                    Tamanho.getListaTamanhos().set(i, tamanhoEdita);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoTamanho())) {
                String jsonTamanho = gson.toJson(Tamanho.getListaTamanhos());
                writer.write(jsonTamanho);
                writer.flush();
            }
            
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void deleta(String nome)throws IOException {
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDTamanho(BancoDeDados.getBancoTamanho());
            for(int i = 0; i < Tamanho.getListaTamanhos().size(); i++) {
                if(nome.equals(Tamanho.getListaTamanhos().get(i).getNome())) {
                    Tamanho.getListaTamanhos().remove(i);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoTamanho())) {
                String jsonTamanho = gson.toJson(Tamanho.getListaTamanhos());
                writer.write(jsonTamanho);
                writer.flush();
            }
            
        } catch(IOException e) {
            throw new IOException();
        }
    }
}
