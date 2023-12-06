package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.ErroValorNumerico;
import java.util.ArrayList;
import java.util.List;

public class Ingrediente {

    private String nome;
    private String categoria;
    private static List<Ingrediente> listaIngrediente;

    public Ingrediente(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
        Ingrediente.listaIngrediente = new ArrayList<>();
//        quantidadeAdicionada = new ArrayList<>();
    }

    public static List<Ingrediente> getlistaIngrediente() {
        return Ingrediente.listaIngrediente;
    }

    public static void setlistaIngrediente(List<Ingrediente> ingredientes) {
        Ingrediente.listaIngrediente = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }   
    
    public static void validaCampoVazioCadastro(String nome) throws CampoVazio {
        if("".equals(nome))
            throw new CampoVazio();
    }
}
