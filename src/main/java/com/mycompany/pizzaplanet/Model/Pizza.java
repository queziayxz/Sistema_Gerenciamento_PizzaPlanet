/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Model;

import java.util.*;

public class Pizza {
    private String nome;
    private List<Ingrediente> listaIngredientes;

    public Pizza(String nome, List<Ingrediente> listaIngredientes) {
        this.nome = nome;
        this.listaIngredientes = listaIngredientes;
    }

    public Pizza() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getListaIngredientes() {
        return this.listaIngredientes;
    }

    public void setListaIngredientes(List<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
