package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PizzaDoce extends Pizza{

    private static List<PizzaDoce> listaPizzasDoces;

    public PizzaDoce(String nome, List<Ingrediente> listaIngredientes) {
        super(nome, listaIngredientes);
        PizzaDoce.listaPizzasDoces = new ArrayList<>();
    }
    
     public PizzaDoce() {
    PizzaDoce.listaPizzasDoces = new ArrayList<>();
     }
     
    public static List<PizzaDoce> getListaPizzasDoces() {
        return PizzaDoce.listaPizzasDoces;
    }

    public static void setListaPizzasDoces(List<PizzaDoce> listaPizzasDoces) {
        PizzaDoce.listaPizzasDoces = listaPizzasDoces;
    }

    @Override
    public boolean equals(Object obj) {
        PizzaDoce pizza = (PizzaDoce) obj;
        return Objects.equals(pizza.getNome(),super.getNome());
    }
    
    public static void validaCampoVazioAdiciona(PizzaDoce pizza) {
        if("".equals(pizza.getNome()))
            throw new CampoVazio();
        if(pizza.getListaIngredientes().isEmpty())
            throw new CampoVazio();
    }
}
