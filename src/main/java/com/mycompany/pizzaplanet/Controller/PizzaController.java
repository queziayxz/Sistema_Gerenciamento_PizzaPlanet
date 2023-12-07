package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
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
    
}
