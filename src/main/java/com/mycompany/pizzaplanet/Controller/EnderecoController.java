package com.mycompany.pizzaplanet.Controller;

import com.mycompany.pizzaplanet.Model.Endereco;

public class EnderecoController {
    
    public static boolean validarInput(Endereco endereco) {
       if(endereco.getBairro().isEmpty()) return false;
       if(endereco.getCep().isEmpty()) return false;
       if(endereco.getCidade().isEmpty()) return false;
       if(endereco.getEstado().isEmpty()) return false;
       if(endereco.getNumero().isEmpty()) return false;
       if(endereco.getRua().isEmpty()) return false;
       
//       if(input.matches(".*\\P{L}.*")) return false;
       
       return true;
   }
   
   public static boolean validarInputNumerico(String input) {
       if("".equals(input)) return false;
       
       if(!input.matches("\\d+")) return false;
       
       return true;
   }
   
   public static boolean validarCEP(String input) {
       if("".equals(input)) return false;

       String aux1, aux2; 
       aux1 = input.substring(0, 5);
       aux2 = input.substring(6);
       
       if(!aux1.matches("\\d+")) return false;
       
       if(!aux2.matches("\\d+")) return false;

       if(!"-".equals(input.charAt(5))) return false;

       return true;
   }
    
}
