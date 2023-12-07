package com.mycompany.pizzaplanet.Model;

import java.util.List;

public class PizzaDoce extends Pizza{

    private static List<PizzaDoce> listaPizzasDoces;
    
    public PizzaDoce(String nome, List<Ingrediente> listaIngredientes, Tamanho tamanhoPizza) {
        super(nome, listaIngredientes, tamanhoPizza);
    }
    
    public static List<PizzaDoce> getListaPizzasDoces() {
        return PizzaDoce.listaPizzasDoces;
    }

    public static void setListaPizzasDoces(List<PizzaDoce> listaPizzasDoces) {
        PizzaDoce.listaPizzasDoces = listaPizzasDoces;
    }
}