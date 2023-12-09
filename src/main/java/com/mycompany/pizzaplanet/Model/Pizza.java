package com.mycompany.pizzaplanet.Model;

import java.util.*;

public class Pizza {
    private String nome;
    private List<Ingrediente> listaIngredientes;
//    private Tamanho tamanhoPizza;

    public Pizza(String nome, List<Ingrediente> listaIngredientes) {
        this.nome = nome;
        this.listaIngredientes = listaIngredientes;
//        this.tamanhoPizza = tamanhoPizza;
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

//    public Tamanho getTamanhoPizza() {
//        return tamanhoPizza;
//    }
//
//    public void setTamanhoPizza(Tamanho tamanhoPizza) {
//        this.tamanhoPizza = tamanhoPizza;
//    }
}
