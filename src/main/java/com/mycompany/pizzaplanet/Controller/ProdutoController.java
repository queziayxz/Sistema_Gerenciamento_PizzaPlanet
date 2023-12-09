/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.Produto;
import java.io.FileWriter;
import java.io.IOException;

public class ProdutoController {
    public static void adiciona(Produto produto) throws IOException {
        Gson gson = new Gson();
        BancoDeDados conn = new BancoDeDados();
        
        try {
            BancoDeDados.leBDProduto(BancoDeDados.getBancoProduto());

            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoProduto())) {
                Produto.getListaProdutos().add(produto);
                String jsonProduto = gson.toJson(Produto.getListaProdutos());
                writer.write(jsonProduto);
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException();
        } 
    }
    
    public static void edita(String nomeBanco, String nomeEdita, float valor, int quantidade) throws CampoVazio, IOException {
        if("".equals(nomeEdita)) {
            throw new CampoVazio();
        }
        
        BancoDeDados banco = new BancoDeDados();
        Produto prodEdita = new Produto(nomeEdita, valor, quantidade);

        try {
            BancoDeDados.leBDProduto(BancoDeDados.getBancoProduto());

            for(int i = 0; i < Produto.getListaProdutos().size(); i++) {
                if(nomeBanco.equals(Produto.getListaProdutos().get(i).getNome())) {
                    Produto.getListaProdutos().set(i, prodEdita);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoProduto())) {
                String jsonProduto = gson.toJson(Produto.getListaProdutos());
                writer.write(jsonProduto);
                writer.flush();
            }
            
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void deleta(String nome)throws IOException {
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDProduto(BancoDeDados.getBancoProduto());
            for(int i = 0; i < Produto.getListaProdutos().size(); i++) {
                if(nome.equals(Produto.getListaProdutos().get(i).getNome())) {
                    Produto.getListaProdutos().remove(i);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoProduto())) {
                String jsonProduto = gson.toJson(Produto.getListaProdutos());
                writer.write(jsonProduto);
                writer.flush();
            }
            
        } catch(IOException e) {
            throw new IOException();
        }
    }
}
