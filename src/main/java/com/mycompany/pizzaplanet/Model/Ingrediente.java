package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.ErroValorNumerico;
import java.util.ArrayList;
import java.util.List;

public class Ingrediente {

    private String nome;
    private static List<Ingrediente> listaIngrediente;
//    private List<Integer> quantidadeAdicionada;

    public Ingrediente(String nome) {
        this.nome = nome;
        listaIngrediente = new ArrayList<>();
//        quantidadeAdicionada = new ArrayList<>();
    }

    public static List<Ingrediente> getlistaIngrediente() {
        return Ingrediente.listaIngrediente;
    }

    public static void setlistaIngrediente(List<Ingrediente> ingredientes) {
        Ingrediente.listaIngrediente = ingredientes;
    }

//    public List<Integer> getQuantidadeAdicionada() {
//        return quantidadeAdicionada;
//    }
//
//    public void setQuantidadeAdicionada(List<Integer> quantidadeAdicionada) {
//        this.quantidadeAdicionada = quantidadeAdicionada;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
//    public void removerIngrediente(int index) {
//        try {
//            listaIngrediente.remove(index);
//            quantidadeAdicionada.remove(index);
//            System.out.println("Ingrediente removido");
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Erro: Índice inválido. Não foi possível remover o produto.");
//        } catch (Exception e) {
//            System.out.println("Erro: " + e.getMessage());
//        }
//    }

//    public void mostrarIngredientes() {
//        for (int i = 0; i < listaIngrediente.size(); i++) {
//            System.out.println(listaIngrediente.get(i) + ": " + quantidadeAdicionada.get(i));
//        }
//    }
    
    public static void validaCampoVazioCadastro(String nome) throws CampoVazio {
        if("".equals(nome))
            throw new CampoVazio();
    }
    
    public static void validaCampoInteiro(String quantidade) throws ErroValorNumerico {
        if(!quantidade.matches("^[0-9]+$"))
            throw new ErroValorNumerico();
    }
    
}
