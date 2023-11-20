package com.mycompany.pizzaplanet;

//import das models
import com.mycompany.pizzaplanet.Controller.ClienteController;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.CPF;
import com.mycompany.pizzaplanet.Model.Cliente;
import com.mycompany.pizzaplanet.Model.Endereco;
import com.mycompany.pizzaplanet.Model.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaPlanet {

    public static void main(String[] args) {
        //amém!!!
        try {
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBD(BancoDeDados.getBancoCliente());
            
                
            for(Cliente cliente : Cliente.getListaCliente()) {
                System.out.println("Email:"+cliente.getEmail());
                System.out.println("Senha:"+cliente.getSenha());
            }
            
        } catch (IOException ex) {
            System.out.println("Cliente nao cadastrado");
        }
    }
}
