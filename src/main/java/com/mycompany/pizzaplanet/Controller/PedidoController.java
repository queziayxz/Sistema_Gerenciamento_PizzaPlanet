package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.CartaoCredito;
import com.mycompany.pizzaplanet.Model.CartaoDebito;
import com.mycompany.pizzaplanet.Model.Dinheiro;
import com.mycompany.pizzaplanet.Model.Pedido;
import com.mycompany.pizzaplanet.Model.Pix;
import com.mycompany.pizzaplanet.Model.Pizza;
import java.io.FileWriter;
import java.io.IOException;

public class PedidoController {
    
    public static void calculaValor(Pedido pedido) {
        double valorTotal = pedido.getTamanho().getValor();
        if(pedido.getPizza().size() > 1) {
            valorTotal *= 2;
        }
        if(pedido.getProduto() != null) {
            valorTotal += pedido.getProduto().getValor();
        }
        if(pedido.getFormaPagamento().equals("Pix")) {
            Pix pix = new Pix(valorTotal,"123456");
            valorTotal = pix.retornaTotal();
        } else if(pedido.getFormaPagamento().equals("Cartão de Crédito")) {
            CartaoCredito cartCredito = new CartaoCredito(valorTotal,"123456789");
            valorTotal = cartCredito.retornaTotal();
        } else if(pedido.getFormaPagamento().equals("Cartão de Débito")) {
            CartaoDebito cartDebito = new CartaoDebito(valorTotal,"123456789");
            valorTotal = cartDebito.retornaTotal();
        } else {
            Dinheiro dinheiro = new Dinheiro(valorTotal);
            valorTotal = dinheiro.retornaTotal();
        }
        
        pedido.setValorTotal(valorTotal);
   }
    
    public static void adicionaPedido(Pedido pedido) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPedido(BancoDeDados.getBancoPedido());
            Pedido.getListaPedidos().add(pedido);
            
            String arquivoPedido = gson.toJson(Pedido.getListaPedidos());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPedido());
            writer.write(arquivoPedido);
            writer.flush();
            writer.close();
            
        } catch(IOException e) {
            throw new IOException();
        }
    }
    
     public static void alteraStatusPedido(Pedido pedido, String status) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPedido(BancoDeDados.getBancoPedido());
            
            for(int i = 0; i < Pedido.getListaPedidos().size(); i++) {
                if(pedido.getCliente().getNome().equals(Pedido.getListaPedidos().get(i).getCliente().getNome())) {
                    pedido.setStatus(status);
                    Pedido.getListaPedidos().set(i, pedido);
                    break;
                }
            }
            
            //transforma a lista em json
            String arquivoPedido = gson.toJson(Pedido.getListaPedidos());
            //escreve no arquivo
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPedido());
            writer.write(arquivoPedido);
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            System.out.println("error");
        }
    }
    
    public static void adicionaPedidoProducao(Pedido pedido) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPedido(BancoDeDados.getBancoPedido());
            
            for(int i = 0; i < Pedido.getListaPedidos().size(); i++) {
                if(pedido.getCliente().getNome().equals(Pedido.getListaPedidos().get(i).getCliente().getNome())) {
                    pedido.setStatus("Em Produção");
                    Pedido.getListaPedidos().set(i, pedido);
                    break;
                }
            }
            
            //transforma a lista em json
            String arquivoPedido = gson.toJson(Pedido.getListaPedidos());
            //escreve no arquivo
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPedido());
            writer.write(arquivoPedido);
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            System.out.println("error");
        }
    }
    
}
