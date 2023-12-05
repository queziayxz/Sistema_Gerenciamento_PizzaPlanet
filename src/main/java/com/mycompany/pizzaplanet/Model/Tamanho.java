/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.ErroValorNumerico;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author augus
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tamanho {

    public static Object getlistaTamanho() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nome;
    private int quantidadePecas;
    private double valor;
    private static List<Tamanho> listaTamanhos = new ArrayList<>();

    public Tamanho(String nome, int quantidadePecas, double valor) {
        this.nome = nome;
        this.quantidadePecas = quantidadePecas;
        this.valor = valor;
    }

    public void imprimirNomeTamanhoPreco() {
        System.out.println("Nome: " + nome + ", Tamanho: " + quantidadePecas + ", Preço: " + valor + "Pedaços");
    }

    public void imprimirNomeTamanho() {
        System.out.println("Nome: " + nome + ", Tamanho: " + quantidadePecas + "Pedaços");
    }

    public static void criarTamanho(String nome, int quantidadePecas, double valor) {
        Tamanho tamanho = new Tamanho(nome, quantidadePecas, valor);
        listaTamanhos.add(tamanho);
    }

    public static void removerTamanho(String nome) {
        Iterator<Tamanho> iterator = listaTamanhos.iterator();
        while (iterator.hasNext()) {
            Tamanho tamanho = iterator.next();
            if (tamanho.nome.equals(nome)) {
                iterator.remove();
                break;
            }
        }
    }

    public static List<Tamanho> getListaTamanhos() {
        return listaTamanhos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public double getValor() {
        return valor;
    }
    
    public static void setListaTamanhos(List<Tamanho> listaTamanhos) {
        Tamanho.listaTamanhos = listaTamanhos;
    }
    
    public static void validaCampoVazioCadastro(String nome) throws CampoVazio {
        if("".equals(nome))
            throw new CampoVazio();
    }
    
    public static void validaCampoInteiro(String quantidade) throws ErroValorNumerico {
        if(!quantidade.matches("^[0-9]+$"))
            throw new ErroValorNumerico();
    }
    
}
