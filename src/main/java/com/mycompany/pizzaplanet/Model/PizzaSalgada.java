package com.mycompany.pizzaplanet.Model;

import java.util.List;

public class PizzaSalgada extends Pizza{

    private static List<PizzaSalgada> listaPizzasSalgadas;
    
    public PizzaSalgada(String nome, List<Ingrediente> listaIngredientes, Tamanho tamanhoPizza) {
        super(nome, listaIngredientes, tamanhoPizza);
    }

    public static List<PizzaSalgada> getListaPizzasSalgadas() {
        return listaPizzasSalgadas;
    }

    public static void setListaPizzasSalgadas(List<PizzaSalgada> listaPizzasSalgadas) {
        PizzaSalgada.listaPizzasSalgadas = listaPizzasSalgadas;
    }
    
}
