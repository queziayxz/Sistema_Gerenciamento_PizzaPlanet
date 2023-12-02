/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaplanet.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author augus
 */

    public class Ingredientes {
    private List<String> ingredientes;
    private List<Float> valores;

    public Ingredientes() {
        ingredientes = new ArrayList<>();
        valores = new ArrayList<>();
    }

    public void adicionarIngrediente(String ingrediente, float valor) {
        ingredientes.add(ingrediente);
        valores.add(valor);
    }

    public void removerIngrediente(int index) {
    try {
        ingredientes.remove(index);
        valores.remove(index);
        System.out.println("Ingrediente removido");
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Erro: Índice inválido. Não foi possível remover o produto.");
    } catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
    }
}


    public void mostrarIngredientes() {
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println(ingredientes.get(i) + ": " + valores.get(i));
        }
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Float> getValores() {
        return valores;
    }

    public void setValores(List<Float> valores) {
        this.valores = valores;
    }
}
