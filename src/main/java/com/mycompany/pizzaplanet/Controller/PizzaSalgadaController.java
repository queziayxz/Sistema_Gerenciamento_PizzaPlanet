package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.PizzaSalgada;
import java.io.FileWriter;
import java.io.IOException;

public class PizzaSalgadaController {
    
    public static void adiciona(PizzaSalgada pizza) throws IOException {
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
    
}
