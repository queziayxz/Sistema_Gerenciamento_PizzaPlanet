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
    
    
    
//    public static void cadastroAdm(Administrador adm)
//    {
//        Gson gson = new Gson();
//        BancoDeDados banco = new BancoDeDados();
//        
//        try {
//            BancoDeDados.leBDAdm(BancoDeDados.getBancoAdministrador());
//            Administrador.getListaAdm().add(adm);
//            String jsonAdm = gson.toJson(Administrador.getListaAdm());
//            FileWriter write = new FileWriter(BancoDeDados.getBancoAdministrador());
//            write.write(jsonAdm);
//            write.flush();
//            write.close();
//        } catch(IOException e) {
//            JOptionPane.showMessageDialog(null, "Administrador não cadastrado!!");
//        }
//    }
}
