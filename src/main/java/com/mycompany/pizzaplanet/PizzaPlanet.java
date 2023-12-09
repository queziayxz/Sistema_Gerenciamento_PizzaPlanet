/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet;

//import das models
import com.mycompany.pizzaplanet.Controller.ClienteController;
import com.mycompany.pizzaplanet.Model.Administrador;
import com.mycompany.pizzaplanet.Model.BancoDeDados;
import com.mycompany.pizzaplanet.Model.CPF;
import com.mycompany.pizzaplanet.Model.Cliente;
import com.mycompany.pizzaplanet.Model.Endereco;
import com.mycompany.pizzaplanet.Model.Usuario;

//import das views
import com.mycompany.pizzaplanet.View.Cadastro;
import com.mycompany.pizzaplanet.View.Login;
import com.mycompany.pizzaplanet.View.Pedidos.AcompanharPedido;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class PizzaPlanet {

    public static void main(String[] args) {

        try {

            BancoDeDados banco = new BancoDeDados();
            Cadastro telaCadastro = new Cadastro();
            telaCadastro.setVisible(true);

        } catch (Exception e) {
            System.out.println("Cliente nao cadastrado");
        }
    }
}
