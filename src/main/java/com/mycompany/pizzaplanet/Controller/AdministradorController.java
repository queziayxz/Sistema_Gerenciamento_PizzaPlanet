/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Controller;

//import das models
import com.mycompany.pizzaplanet.Model.Administrador;
import com.mycompany.pizzaplanet.Model.BancoDeDados;

//import das dependências
import com.google.gson.Gson;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.ErroLogin;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

public class AdministradorController {
    public static boolean loginAdm(String email, String senha) throws IOException, CampoVazio, ErroLogin {
            
            Administrador.validaCamposLogin(email, senha);
            BancoDeDados banco = new BancoDeDados();
            BancoDeDados.leBDAdm(BancoDeDados.getBancoAdministrador());
            for (Administrador user : Administrador.getListaAdm()) {
                if (email.equals(user.getEmail()) && senha.equals(user.getSenha())) {
                    return true;
                }
            }
            throw new ErroLogin();
    }
}
