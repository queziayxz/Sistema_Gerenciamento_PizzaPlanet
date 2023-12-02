/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzaplanet.Model;

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

    public double getPreco() {
        return valor;
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
}