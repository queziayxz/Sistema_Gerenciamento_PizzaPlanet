package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.PizzaDoce;
import com.mycompany.pizzaplanet.Model.PizzaSalgada;
import java.io.FileWriter;
import java.io.IOException;

public class PizzaController {
    
    public static void adicionaPizzaSalgada(PizzaSalgada pizza) throws IOException {
        try {
            
            Gson gson = new Gson();
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPizzaSalgada(BancoDeDados.getBancoPizzaSalgada());
            PizzaSalgada.getListaPizzasSalgadas().add(pizza);
            
            String arquivoPizza = gson.toJson(PizzaSalgada.getListaPizzasSalgadas());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPizzaSalgada());
            writer.write(arquivoPizza);
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void editaPizzaSalgada(PizzaSalgada pizzabanco, PizzaSalgada pizzaEdita) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados.leBDPizzaSalgada(BancoDeDados.getBancoPizzaSalgada());
            
            //pega o indice na lista da pizza que está no banco
            int indexPizzaBanco = PizzaSalgada.getListaPizzasSalgadas().indexOf(pizzabanco);
            //altera o que está no banco para o novo
            PizzaSalgada.getListaPizzasSalgadas().set(indexPizzaBanco, pizzaEdita);
            //transforma a lista em json
            String arquivPizza = gson.toJson(PizzaSalgada.getListaPizzasSalgadas());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPizzaSalgada());
            //escreve no arquivo a nova lista editada
            writer.write(arquivPizza);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void deletaPizzaSalgada(PizzaSalgada pizza) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados.leBDPizzaSalgada(BancoDeDados.getBancoPizzaSalgada());
            PizzaSalgada.getListaPizzasSalgadas().remove(pizza);
            
            String arquivoPizza = gson.toJson(PizzaSalgada.getListaPizzasSalgadas());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPizzaSalgada());
            writer.write(arquivoPizza);
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            throw new IOException();
        }
    }
    public static void adicionaPizzaDoce(PizzaDoce pizza) throws IOException {
        try {
            
            Gson gson = new Gson();
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDPizzaDoce(BancoDeDados.getBancoPizzaDoce());
            PizzaDoce.getListaPizzasDoces().add(pizza);
            
            String arquivoPizza = gson.toJson(PizzaDoce.getListaPizzasDoces());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPizzaDoce());
            writer.write(arquivoPizza);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void editaPizzaDoce(PizzaDoce pizzabanco, PizzaDoce pizzaEdita) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados.leBDPizzaDoce(BancoDeDados.getBancoPizzaDoce());
            System.out.println(pizzabanco.getNome());
            //pega o indice na lista da pizza que está no banco
            int indexPizzaBanco = PizzaDoce.getListaPizzasDoces().indexOf(pizzabanco);
            //altera o que está no banco para o novo
            PizzaDoce.getListaPizzasDoces().set(indexPizzaBanco, pizzaEdita);
            //transforma a lista em json
            String arquivPizza = gson.toJson(PizzaDoce.getListaPizzasDoces());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPizzaDoce());
            //escreve no arquivo a nova lista editada
            writer.write(arquivPizza);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new IOException();
        }
    }
    
    public static void deletaPizzaDoce(PizzaDoce pizza) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados.leBDPizzaDoce(BancoDeDados.getBancoPizzaDoce());
            PizzaDoce.getListaPizzasDoces().remove(pizza);
            String arquivoPizza = gson.toJson(PizzaDoce.getListaPizzasDoces());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoPizzaDoce());
            writer.write(arquivoPizza);
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            throw new IOException();
        }
    }   
}
