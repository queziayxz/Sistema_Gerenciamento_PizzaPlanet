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
    private static File bancoPizzaDoce;
    private static File bancoPizzaSalgada;
    private static File bancoPagamentoPix;
    private static File bancoPagamentoCartao;
    private static File bancoPedido;
    private static File bancoPedidoProducao;
    

//    private static List<Cliente> listaDeCliente;
//    private static List<Administrador> listaDeAdministrador;
    
    public BancoDeDados() {
        BancoDeDados.bancoCliente = new File(this.pastaBanco+"\\BancoDeDadosCliente.json");
        BancoDeDados.bancoAdministrador = new File(this.pastaBanco+"\\BancoDeDadosAdministrador.json");
        BancoDeDados.bancoIngrediente = new File(this.pastaBanco+"\\BancoDeDadosIngrediente.json");
        BancoDeDados.bancoTamanho = new File(this.pastaBanco+"\\BancoDeDadosTamanho.json");
        BancoDeDados.bancoProduto = new File(this.pastaBanco+"\\BancoDeDadosProduto.json");
        BancoDeDados.bancoPizzaDoce = new File(this.pastaBanco+"\\BancoDeDadosPizzaDoce.json");
        BancoDeDados.bancoPizzaSalgada = new File(this.pastaBanco+"\\BancoDeDadosPizzaSalgada.json");
        BancoDeDados.bancoPagamentoPix = new File(this.pastaBanco+"\\BancoDeDadosPagamentoPix.json");
        BancoDeDados.bancoPagamentoCartao = new File(this.pastaBanco+"\\BancoDeDadosPagamentoCartao.json");
        BancoDeDados.bancoPedido = new File(this.pastaBanco+"\\BancoDeDadosPedido.json");
        BancoDeDados.bancoPedidoProducao = new File(this.pastaBanco+"\\BancoDeDadosPedidoProducao.json");
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
//        System.out.println("entrou");
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
//        System.out.println("entrou");
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
    public static void leBDProduto(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Produto>>(){}.getType();
                Produto.setlistaProdutos(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
    }
    public static void leBDPizzaDoce(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<PizzaDoce>>(){}.getType();
                PizzaDoce.setListaPizzasDoces(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
    }
    public static void leBDPizzaSalgada(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<PizzaSalgada>>(){}.getType();
                PizzaSalgada.setListaPizzasSalgadas(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
    }
    
    public static void leBDPagamentoPix(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Pagamento>>(){}.getType();
                Pagamento.setListaPix(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
    }
    
    public static void leBDPagamentoCartao(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Pagamento>>(){}.getType();
                Pagamento.setListaCartao(gson.fromJson(arquivoJson, type));
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
    }
    
    public static void leBDPedido(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Pedido>>(){}.getType();
                List<Pedido> pedido = gson.fromJson(arquivoJson,type);
                Pedido.setListaPedidos(pedido);
            } catch (Exception e) {
                throw new IOException();
            } finally {
                arquivoJson.close();
                writer.close();
            }
        }
    }
    
    public static void leBDPedidoProducao(File bancoDeDados) throws IOException
    {
        Gson gson = new Gson();
        FileWriter writer = new FileWriter(bancoDeDados,true);
        BufferedReader  arquivoJson = new BufferedReader (new FileReader(bancoDeDados));
        if(arquivoJson.ready()) {
            try {
                Type type = new TypeToken<List<Pedido>>(){}.getType();
                List<Pedido> pedido = gson.fromJson(arquivoJson,type);
                Pedido.setListaPedidosProducao(pedido);
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

    public static File getBancoPizzaDoce() {
        return bancoPizzaDoce;
    }
    
    public static File getBancoPagamentoPix() {
        return bancoPagamentoPix;
    }
    
    public static File getBancoPagamentoCartao() {
        return bancoPagamentoCartao;
    }

    public static File getBancoPizzaSalgada() {
        return bancoPizzaSalgada;
    }

    public static File getBancoPedido() {
        return bancoPedido;
    }

    public static File getBancoPedidoProducao() {
        return bancoPedidoProducao;
    }

    public static void setBancoPedidoProducao(File bancoPedidoProducao) {
        BancoDeDados.bancoPedidoProducao = bancoPedidoProducao;
    }
    
}