package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.CartaoCredito;
import com.mycompany.pizzaplanet.Model.Pagamento;
import com.mycompany.pizzaplanet.Model.Pix;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Giovanni
 */
public class PagamentoController {
        
    public static void adicionaPix(Pagamento pagamento) throws IOException {
        Gson gson = new Gson();
        //inicia os arquivos
        BancoDeDados conn = new BancoDeDados();
        
        try {
            //le o banco, transformando o json em objeto
            BancoDeDados.leBDPagamentoPix(BancoDeDados.getBancoPagamentoPix());

            //adiciona o novo ingrediente a lista
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoPagamentoPix())) {
                //adiciona o novo ingrediente a lista
                Pagamento.getListaPix().add(pagamento);
                //transforma a lista em json
                String jsonPix = gson.toJson(pagamento.getListaPix());
                //escreve no arquivo
                writer.write(jsonPix);
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException();
        } 
    }
    
    public static void adicionaCartao(Pagamento pagamento) throws IOException {
        Gson gson = new Gson();
        //inicia os arquivos
        BancoDeDados conn = new BancoDeDados();
        
        try {
            //le o banco, transformando o json em objeto
            BancoDeDados.leBDPagamentoCartao(BancoDeDados.getBancoPagamentoCartao());

            //adiciona o novo ingrediente a lista
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoPagamentoCartao())) {
                //adiciona o novo ingrediente a lista
                Pagamento.getListaCartao().add(pagamento);
                //transforma a lista em json
                String jsonCartao = gson.toJson(pagamento.getListaCartao());
                //escreve no arquivo
                writer.write(jsonCartao);
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException();
        } 
    }
    
    public static void editaPix(Pix pixBanco, Pix pixNovo) throws IOException {

        try {
            BancoDeDados.leBDPagamentoPix(BancoDeDados.getBancoPagamentoPix());
            
            for(int i = 0; i < Pagamento.getListaPix().size(); i++) {
                if(pixBanco.getID().equals(Pix.getListaPix().get(i).getID())) {
                    Pagamento.getListaPix().set(i, pixNovo);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoPagamentoPix())) {
                String jsonPix = gson.toJson(Pagamento.getListaPix());
                writer.write(jsonPix);
                writer.flush();
            }
            
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void editaCartao(CartaoCredito cartaoBanco, CartaoCredito cartaoNovo) throws IOException {

        try {
            BancoDeDados.leBDPagamentoCartao(BancoDeDados.getBancoPagamentoCartao());
            
            for(int i = 0; i < Pagamento.getListaCartao().size(); i++) {
                if(cartaoBanco.getID().equals(Pix.getListaCartao().get(i).getID())) {
                    Pagamento.getListaCartao().set(i, cartaoNovo);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoPagamentoCartao())) {
                String jsonCartao = gson.toJson(Pagamento.getListaCartao());
                writer.write(jsonCartao);
                writer.flush();
            }
            
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void deletaPix(String nome)throws IOException {
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPagamentoPix(BancoDeDados.getBancoPagamentoPix());
            for(int i = 0; i < Pix.getListaPix().size(); i++) {
                if(nome.equals(Pix.getListaPix().get(i).getID())) {
                    Pix.getListaPix().remove(i);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoPagamentoPix())) {
                String jsonPix = gson.toJson(Pix.getListaPix());
                writer.write(jsonPix);
                writer.flush();
            }
            
        } catch(IOException e) {
            throw new IOException();
        }
    }
    
    public static void deletaCartao(String nome)throws IOException {
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPagamentoCartao(BancoDeDados.getBancoPagamentoCartao());
            for(int i = 0; i < CartaoCredito.getListaCartao().size(); i++) {
                if(nome.equals(CartaoCredito.getListaCartao().get(i).getID())) {
                    CartaoCredito.getListaCartao().remove(i);
                }
            }
            
            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoPagamentoCartao())) {
                String jsonCartao = gson.toJson(CartaoCredito.getListaCartao());
                writer.write(jsonCartao);
                writer.flush();
            }
            
        } catch(IOException e) {
            throw new IOException();
        }
    }
}
