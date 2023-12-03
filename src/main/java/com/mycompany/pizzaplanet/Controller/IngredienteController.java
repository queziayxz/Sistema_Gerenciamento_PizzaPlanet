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
            BancoDeDados.leBD(BancoDeDados.getBancoIngrediente());
            for(Ingrediente ingre : Ingrediente.getlistaIngrediente()) {
                System.out.println(ingre.getNome());
            }
            FileWriter writer = new FileWriter(BancoDeDados.getBancoIngrediente());
            //adiciona o novo ingrediente a lista
            Ingrediente.getlistaIngrediente().add(ingrediente);
            
            
//            //transforma a lista em json
//            String jsonIngrediente = gson.toJson(ingrediente.getlistaIngrediente());
//            //escreve no arquivo
//            writer.write(jsonIngrediente);
//            writer.flush();
//            writer.close();
        } catch (IOException e) {
            throw new IOException();
        } 
    }
    
//    public void adicionarIngrediente(String ingrediente, int quantidade) {
//        ingredientes.add(ingrediente);
//        quantidadeAdicionada.add(quantidade);
//    }
    
}
