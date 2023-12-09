/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Controller.AdministradorController;
import java.util.*;

public class Administrador extends Usuario 
{
    private static List<Administrador> listaAdm;
    
    public Administrador(String nome, String email, String senha, CPF cpf) {
        super(nome, email, senha, cpf);
        this.listaAdm = new ArrayList<>();
    }

    public Administrador()
    {
        this.listaAdm = new ArrayList<>();
    }
    
    public static void setListaAdm(List<Administrador> listaAdm) {
        Administrador.listaAdm = listaAdm;
    }

    public static List<Administrador> getListaAdm() {
        return listaAdm;
    }
    
}
