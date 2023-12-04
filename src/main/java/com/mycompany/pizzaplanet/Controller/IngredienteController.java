package com.mycompany.pizzaplanet.Controller;

import com.google.gson.Gson;
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
            for(Ingrediente ingre : Ingrediente.getlistaIngrediente()) {
                System.out.println(ingre.getNome());
            }
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
}
