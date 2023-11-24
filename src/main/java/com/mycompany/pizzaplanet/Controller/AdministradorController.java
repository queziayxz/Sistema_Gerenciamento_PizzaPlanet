package com.mycompany.pizzaplanet.Controller;

//import das models
import com.mycompany.pizzaplanet.Model.Administrador;
import com.mycompany.pizzaplanet.Model.BancoDeDados;

//import das dependências
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

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
    
    public static void cadastroAdm(Administrador adm)
    {
        Gson gson = new Gson();
        BancoDeDados banco = new BancoDeDados();
        
        try {
            BancoDeDados.leBDAdm(BancoDeDados.getBancoAdministrador());
            Administrador.getListaAdm().add(adm);
            String jsonAdm = gson.toJson(Administrador.getListaAdm());
            FileWriter write = new FileWriter(BancoDeDados.getBancoAdministrador());
            write.write(jsonAdm);
            write.flush();
            write.close();
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Administrador não cadastrado!!");
        }
    }
}
