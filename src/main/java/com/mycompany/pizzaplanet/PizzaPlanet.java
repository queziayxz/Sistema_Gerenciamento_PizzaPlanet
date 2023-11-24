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

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class PizzaPlanet {

    public static void main(String[] args) {
        //amém!!!
        try {
            BancoDeDados banco = new BancoDeDados();
            Cadastro telaCadastro = new Cadastro();
            telaCadastro.setVisible(true);

//                Login frameLogin = new Login();
//                ImageIcon icon = new ImageIcon("src\\main\\java\\com\\mycompany\\pizzaplanet\\Imagens\\Pizza.jpg");
//                JLabel img_login = new JLabel();
//                img_login.setText("img_login");
//                img_login.setIcon(icon);
//                frameLogin.add(img_login);
//                frameLogin.pack();
//                frameLogin.setVisible(true);
//                icon.setImage(icon.getImage().getScaledInstance(img_login.getWidth(), img_login.getHeight(), 1));
//                img_login.repaint();
//                img_login.setVisible(true);
            
        } catch (Exception e) {
            System.out.println("Cliente nao cadastrado");
        }
    }
}
