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
public class DtoCliente extends Conexao {
    private int cliente_id;
    private String cliente_nome;
    private String cliente_endereco;
    private String cliente_telefone;
    private String cliente_celular;
    private String cliente_email;
    private String cliente_cpf;
    private String cliente_usuario;
    private String cliente_senha;

    /**
     * @return the cliente_id
     */
    public int getCliente_id() {
        return cliente_id;
    }

    /**
     * @param cliente_id the cliente_id to set
     */
    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    /**
     * @return the cliente_nome
     */
    public String getCliente_nome() {
        return cliente_nome;
    }

    /**
     * @param cliente_nome the cliente_nome to set
     */
    public void setCliente_nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }

    /**
     * @return the cliente_endereco
     */
    public String getCliente_endereco() {
        return cliente_endereco;
    }

    /**
     * @param cliente_endereco the cliente_endereco to set
     */
    public void setCliente_endereco(String cliente_endereco) {
        this.cliente_endereco = cliente_endereco;
    }

    /**
     * @return the cliente_telefone
     */
    public String getCliente_telefone() {
        return cliente_telefone;
    }

    /**
     * @param cliente_telefone the cliente_telefone to set
     */
    public void setCliente_telefone(String cliente_telefone) {
        this.cliente_telefone = cliente_telefone;
    }

    /**
     * @return the cliente_celular
     */
    public String getCliente_celular() {
        return cliente_celular;
    }

    /**
     * @param cliente_celular the cliente_celular to set
     */
    public void setCliente_celular(String cliente_celular) {
        this.cliente_celular = cliente_celular;
    }

    /**
     * @return the cliente_email
     */
    public String getCliente_email() {
        return cliente_email;
    }

    /**
     * @param cliente_email the cliente_email to set
     */
    public void setCliente_email(String cliente_email) {
        this.cliente_email = cliente_email;
    }

    /**
     * @return the cliente_cpf
     */
    public String getCliente_cpf() {
        return cliente_cpf;
    }

    /**
     * @param cliente_cpf the cliente_cpf to set
     */
    public void setCliente_cpf(String cliente_cpf) {
        this.cliente_cpf = cliente_cpf;
    }

    /**
     * @return the cliente_usuario
     */
    public String getCliente_usuario() {
        return cliente_usuario;
    }

    /**
     * @param cliente_usuario the cliente_usuario to set
     */
    public void setCliente_usuario(String cliente_usuario) {
        this.cliente_usuario = cliente_usuario;
    }

    /**
     * @return the cliente_senha
     */
    public String getCliente_senha() {
        return cliente_senha;
    }

    /**
     * @param cliente_senha the cliente_senha to set
     */
    public void setCliente_senha(String cliente_senha) {
        this.cliente_senha = cliente_senha;
    }
    
}
