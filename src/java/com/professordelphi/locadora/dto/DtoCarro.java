/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professordelphi.locadora.dto;

import com.professordelphi.locadora.utilitarios.Conexao;
/**
 *
 * @author Henrique
 */
public class DtoCarro extends Conexao{
    private int carro_id;
    private String carro_marca;
    private String carro_modelo;
    private String carro_ano;
    private String carro_cor;
    private String carro_placa;

    /**
     * @return the carro_id
     */
    public int getCarro_id() {
        return carro_id;
    }

    /**
     * @param carro_id the carro_id to set
     */
    public void setCarro_id(int carro_id) {
        this.carro_id = carro_id;
    }

    /**
     * @return the carro_marca
     */
    public String getCarro_marca() {
        return carro_marca;
    }

    /**
     * @param carro_marca the carro_marca to set
     */
    public void setCarro_marca(String carro_marca) {
        this.carro_marca = carro_marca;
    }

    /**
     * @return the carro_modelo
     */
    public String getCarro_modelo() {
        return carro_modelo;
    }

    /**
     * @param carro_modelo the carro_modelo to set
     */
    public void setCarro_modelo(String carro_modelo) {
        this.carro_modelo = carro_modelo;
    }

    /**
     * @return the carro_ano
     */
    public String getCarro_ano() {
        return carro_ano;
    }

    /**
     * @param carro_ano the carro_ano to set
     */
    public void setCarro_ano(String carro_ano) {
        this.carro_ano = carro_ano;
    }

    /**
     * @return the carro_cor
     */
    public String getCarro_cor() {
        return carro_cor;
    }

    /**
     * @param carro_cor the carro_cor to set
     */
    public void setCarro_cor(String carro_cor) {
        this.carro_cor = carro_cor;
    }

    /**
     * @return the carro_placa
     */
    public String getCarro_placa() {
        return carro_placa;
    }

    /**
     * @param carro_placa the carro_placa to set
     */
    public void setCarro_placa(String carro_placa) {
        this.carro_placa = carro_placa;
    }
       
}
