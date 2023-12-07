package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import java.util.ArrayList;
import java.util.List;

public class PizzaSalgada extends Pizza{

    private static List<PizzaSalgada> listaPizzasSalgadas;
    
    public PizzaSalgada(String nome, List<Ingrediente> listaIngredientes) {
        super(nome, listaIngredientes);
        PizzaSalgada.listaPizzasSalgadas = new ArrayList<>();
    }

    public static List<PizzaSalgada> getListaPizzasSalgadas() {
        return listaPizzasSalgadas;
    }

    public static void setListaPizzasSalgadas(List<PizzaSalgada> listaPizzasSalgadas) {
        PizzaSalgada.listaPizzasSalgadas = listaPizzasSalgadas;
    }
    
    public static void validaCampoVazioAdiciona(PizzaSalgada pizza) throws CampoVazio {
        if("".equals(pizza.getNome()))
            throw new CampoVazio();
        if(pizza.getListaIngredientes().isEmpty())
            throw new CampoVazio();
    }
    
}
