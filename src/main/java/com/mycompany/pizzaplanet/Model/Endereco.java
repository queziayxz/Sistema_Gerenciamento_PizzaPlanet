/*
- Giovanni Almeida Dutra - 202065032AB
- Quezia Emanuelly da Silva Oliveira - 202265561C
- Augusto Benedito Carvalho da Silva - 202265552C
*/

package com.mycompany.pizzaplanet.Model;

import com.mycompany.pizzaplanet.Excecoes.CampoVazio;
import com.mycompany.pizzaplanet.Excecoes.EnderecoInvalido;

public class Endereco {
    private String rua, numero, bairro, cep, cidade, estado;

    public Endereco(String rua, String numero, String bairro, String cep, String cidade, String estado) throws CampoVazio, EnderecoInvalido{
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
    
    public static void validaEnderecoVazio(String rua, String numero, String bairro, String cep, String cidade, String estado) throws CampoVazio {
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
    public static void validaNumeroEndereco(String numero) throws EnderecoInvalido {
        if(!numero.matches("[0-9].*"))
            throw new EnderecoInvalido();
    }
}
