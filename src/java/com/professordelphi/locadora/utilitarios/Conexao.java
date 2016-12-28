/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professordelphi.locadora.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Valter
 */
public class Conexao {
    private String sql;
    private String mensagem,
            caminho="jdbc:mysql://localhost/locadora",
            usuario="root",
            senha="";
    protected Connection con;
    protected Statement meustate;
    protected ResultSet rs;
    
    public Conexao(){
        super();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(caminho,usuario,senha);
            meustate=con.createStatement();
            
            
        }catch(SQLException ex){
            setMensagem("Banco de dados não encontrado: "+ ex);
            
    }catch(ClassNotFoundException ex){
        setMensagem("Class JDBC não encontrada:" + ex);
    }
            
    
}
    public String getSql(){
        return sql;
    }
public void setSql(String sql){
    this.sql = sql;
}
    public String getMensagem(){
        return mensagem;
    }
    
    public void setMensagem(String mensagem){
        this.mensagem=mensagem;
    }
}