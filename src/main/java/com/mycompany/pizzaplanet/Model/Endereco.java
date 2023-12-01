package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Controller.EnderecoController;
import com.mycompany.pizzaplanet.Excecoes.CampoVazio;

public class Endereco {
    private String rua, numero, bairro, cep, cidade, estado;

    public Endereco(String rua, String numero, String bairro, String cep, String cidade, String estado) throws CampoVazio{
        this.validaEnderecoVazio(rua,numero,bairro,cep,cidade,estado);
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
    
    private void validaEnderecoVazio(String rua, String numero, String bairro, String cep, String cidade, String estado) throws CampoVazio {
        if(rua == null || "".equals(rua))
            throw new CampoVazio();
        if(cep == null || "".equals(cep))
            throw new CampoVazio();
        if(cidade == null || "".equals(cidade))
            throw new CampoVazio();
        if(estado == null || "".equals(estado))
            throw new CampoVazio();
        if(numero == null || "".equals(numero))
            throw new CampoVazio();
        if(bairro == null || "".equals(bairro))
            throw new CampoVazio();
    }
}
