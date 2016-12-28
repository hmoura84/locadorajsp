/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professordelphi.locadora.dao;

import com.professordelphi.locadora.dto.DtoFuncionario;
import java.sql.SQLException;

public class DaoFuncionario extends DtoFuncionario{
    public DaoFuncionario(){
    
}

public  void persistencia(String s){

if (s.equalsIgnoreCase("Limpar")){//IgnoreCase ignora maiúsculo e minusculo
limpar();
}
if (s.equalsIgnoreCase("Incluir")){
setSql("INSERT INTO funcionario (func_nome, func_cpf, func_telefone, func_celular, func_endereco, func_email, func_usuario, func_senha)"+
            "VALUES ('"+getFunc_nome()+"','"+
                       getFunc_cpf()+"','"+
                       getFunc_telefone()+"','"+
                       getFunc_celular()+"','"+
                       getFunc_endereco()+"','"+
                       getFunc_email()+"','"+
                       getFunc_usuario()+"','"+
                       getFunc_senha()+"')");
    System.out.println(getSql());
try{
    meustate.executeUpdate(getSql());
    limpar();
    setMensagem("Operação efetuada com sucesso!");
}catch (SQLException ex){
    setMensagem("Operação cancelada" + getSql() + ex);
}
}
if(s.equalsIgnoreCase("Excluir")){
    setSql("Delet FROM funcionario WHERE func_id="+Integer.toString(getFunc_id()));
    try{
        meustate.executeUpdate(getSql());
        setMensagem("Operação com sucesso");
    }catch(SQLException ex){
        setMensagem("Operação cancelada");
    }
}
if(s.equalsIgnoreCase("Atualizar")){
    setSql("UPDATE funcionario SET nomeFunc="+getFunc_nome()
    +"',func_endereco='"+getFunc_endereco()
    +"',func_telefone='"+getFunc_telefone()
    +"',func_celular='"+getFunc_celular()
    +"',func_cpf='"+getFunc_cpf()
    +"',func_email='"+getFunc_email()
    +"',func_endereco='"+getFunc_endereco()
    +"',func_usuario='"+getFunc_usuario()
    +"',func_senha='"+getFunc_senha()
    +"'WHERE func_id="+Integer.toString(getFunc_id()));
 try{
        meustate.executeUpdate(getSql());
        setMensagem("Operação com sucesso");
    }catch(SQLException ex){
        setMensagem("Operação cancelada");
    }
}
if(s.equalsIgnoreCase("Localizar")){
    setSql("Selec*from funcionario where func_cpf="+getFunc_cpf()+"'");
 try{
    rs=meustate.executeQuery(getSql());
    rs.next();
    setFunc_id(rs.getInt("func_id"));
    setFunc_nome(rs.getString("func_nome"));
    setFunc_endereco(rs.getString("func_endereco"));
    setFunc_telefone(rs.getString("func_telefone"));
    setFunc_celular(rs.getString("func_celular"));
    setFunc_cpf(rs.getString("func_cpf"));
    setFunc_email(rs.getString("func_email"));
    setFunc_usuario(rs.getString("func_usuario"));
    setFunc_senha(rs.getString("func_senha"));
    
    setMensagem("Operação com sucesso");
    }catch(SQLException ex){
        setMensagem("Operação cancelada");
    }
  }
}
/**
 *
 *
 * @author Henrique
 */
public void limpar(){
    setFunc_id(0);
    setFunc_nome("");
    setFunc_endereco("");
    setFunc_telefone("");
    setFunc_celular("");
    setFunc_cpf("");
    setFunc_email("");
    setFunc_usuario("");
    setFunc_senha("");
    
    setMensagem("Sistema de Cadastro de Funcionário");
}
public String listarFuncionario(String tabela){
    String listagem=null;
    if(tabela.equalsIgnoreCase("Listar")){
        setMensagem("Cadastro de funcionário");
        
        listagem="<h1>"+getMensagem()+"</h1><table border=2>"
        +"<tr><td alin='ceter'><h4>Codigo</h4>"
        +"</td><td alin='ceter'><h4>Nome</h4>"
        +"</td><td alin='ceter'><h4>Endereco</h4>"
        +"</td><td alin='ceter'><h4>Tel</h4>"
        +"</td><td alin='ceter'><h4>Cel</h4>"
        +"</td><td alin='ceter'><h4>CPF</h4>"
        +"</td><td alin='ceter'><h4>Email</h4>"
        +"</td><td alin='ceter'><h4>Usuario</h4>"
        +"</td><td alin='ceter'><h4>Senha</h4>"
        +"</td></tr>";
    try{
    rs=meustate.executeQuery("select*from funcionario");
    while (rs.next()){
    setFunc_id(rs.getInt("func_id"));
    setFunc_nome(rs.getString("func_nome"));
    setFunc_endereco(rs.getString("func_endereco"));
    setFunc_telefone(rs.getString("func_telefone"));
    setFunc_celular(rs.getString("func_celular"));
    setFunc_cpf(rs.getString("func_cpf"));
    setFunc_email(rs.getString("func_email"));
    setFunc_usuario(rs.getString("func_usuario"));
    setFunc_senha(rs.getString("func_senha"));

    listagem=listagem
            +"<tr><td>"+getFunc_id()
            +"</td><td>"+getFunc_nome()
            +"</td><td>"+getFunc_endereco()
            +"</td><td>"+getFunc_telefone()
            +"</td><td>"+getFunc_celular()
            +"</td><td>"+getFunc_cpf()
            +"</td><td>"+getFunc_email()
            +"</td><td>"+getFunc_usuario()
            +"</td><td>"+getFunc_senha()
            +"</td></tr>";
    }// fim while
    listagem=listagem+"</table>";
}//fim try
    catch(SQLException erro){
        setMensagem("Operação cancelada"+erro);
    }//fim catch
}//fim if
    return listagem;
}//fim metodo
}