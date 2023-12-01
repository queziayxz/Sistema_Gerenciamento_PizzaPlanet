package com.mycompany.pizzaplanet.Controller;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Model.Usuario;
import java.util.*;

public class UsuarioController {
    
    public static boolean validarNome(String input) {
       if("".equals(input)) return false;
       
       if(input.matches(".*\\P{L}.*")) return false;
       
       return true;
   }
    
    public static boolean validarEmail(String input) {
        if("".equals(input)) return false;
        
        if("".equals(input.substring(0, input.indexOf('@')))) {
            System.out.println("Email inválido!");
            return false;
        }
        
        if(!"@email.com".equals(input.substring(input.indexOf('@')))) {
            System.out.println("Email inválido!");
            return false;
        }
        
        return true;
    }
    
    public static boolean validarSenha(String input) {
        if(input.length() < 5) {
            System.out.println("Senha muito curta!");
            return false;
        }
        
        if(input.length() > 14) {
            System.out.println("Senha muito longa!");
            return false;
        }
        
        if(!input.matches(".*[^A-Za-z0-9].*")) {
            System.out.println("Senha precisa conter pelo menos um caracter especial!");
            return false;
        }
        
        return true;
    }
    
    public static void validaCamposLogin(String email, String senha) throws CampoVazio {
        if("".equals(email) || "".equals(senha))
            throw new CampoVazio();
    }
    
}
