package com.mycompany.pizzaplanet.Controller;

//import das models
import com.mycompany.pizzaplanet.Model.Administrador;

import java.util.*;

public class AdministradorController {
    public static boolean login(String email, String senha, List<Administrador> listaUser) {
        for (Administrador user : listaUser) {
            if (email.equals(user.getEmail())) {
                if (senha.equals(user.getSenha())) {
                    System.out.println("Sucesso!");
                    return true;
                }
                
                System.out.println("Senha incorreta!");
                return false;
            }
            
            System.out.println("Email incorreto!");
            return false;
        }
        
        return false;
    }
}
