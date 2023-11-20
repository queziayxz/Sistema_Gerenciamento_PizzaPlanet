package com.mycompany.pizzaplanet.Model;

public class Endereco {
    private String rua, numero, bairro, cep, cidade, estado;

    public Endereco(String rua, String numero, String bairro, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    
   public static boolean validarInput(String input) {
       if("".equals(input)) return false;
       
       if(input.matches(".*\\P{L}.*")) return false;
       
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
