/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professordelphi.locadora.dao;

import com.professordelphi.locadora.dto.DtoCliente;
import java.sql.SQLException;
/**
 *
 * @author Henrique
 */
public class DaoCliente extends DtoCliente{
    public DaoCliente(){
    
}
public  void persistencia(String s){

if (s.equalsIgnoreCase("Limpar")){//IgnoreCase ignora maiúsculo e minusculo
limpar();
}
if (s.equalsIgnoreCase("Incluir")){
setSql("INSERT INTO cliente (cliente_nome, cliente_cpf, cliente_telefone, cliente_celular, cliente_endereco, cliente_email, cliente_usuario, cliente_senha)"+
"VALUES ('"+getCliente_nome()+"','"+
                       getCliente_cpf()+"','"+
                       getCliente_telefone()+"','"+
                       getCliente_celular()+"','"+
                       getCliente_endereco()+"','"+
                       getCliente_email()+"','"+
                       getCliente_usuario()+"','"+
                       getCliente_senha()+"')");
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
    setSql("Delet FROM cliente WHERE cliente_id="+Integer.toString(getCliente_id()));
    try{
        meustate.executeUpdate(getSql());
        setMensagem("Operação com sucesso");
    }catch(SQLException ex){
        setMensagem("Operação cancelada");
    }
}
if(s.equalsIgnoreCase("Atualizar")){
    setSql("UPDATE cliente SET nomeCliente="+getCliente_nome()
    +"',cliente_endereco='"+getCliente_endereco()
    +"',cliente_telefone='"+getCliente_telefone()
    +"',cliente_celular='"+getCliente_celular()
    +"',cliente_cpf='"+getCliente_cpf()
    +"',cliente_email='"+getCliente_email()
    +"',cliente_endereco='"+getCliente_endereco()
    +"',cliente_usuario='"+getCliente_usuario()
    +"',cliente_senha='"+getCliente_senha()
    +"'WHERE cliente_id="+Integer.toString(getCliente_id()));
 try{
        meustate.executeUpdate(getSql());
        setMensagem("Operação com sucesso");
    }catch(SQLException ex){
        setMensagem("Operação cancelada");
    }
}
if(s.equalsIgnoreCase("Localizar")){
    setSql("Selec*from cliente where func_cpf="+getCliente_cpf()+"'");
 try{
    rs=meustate.executeQuery(getSql());
    rs.next();
    setCliente_id(rs.getInt("cliente_id"));
    setCliente_nome(rs.getString("cliente_nome"));
    setCliente_endereco(rs.getString("cliente_endereco"));
    setCliente_telefone(rs.getString("cliente_telefone"));
    setCliente_celular(rs.getString("cliente_celular"));
    setCliente_cpf(rs.getString("cliente_cpf"));
    setCliente_email(rs.getString("cliente_email"));
    setCliente_usuario(rs.getString("cliente_usuario"));
    setCliente_senha(rs.getString("cliente_senha"));
    
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
    setCliente_id(0);
    setCliente_nome("");
    setCliente_endereco("");
    setCliente_telefone("");
    setCliente_celular("");
    setCliente_cpf("");
    setCliente_email("");
    setCliente_usuario("");
    setCliente_senha("");
    
    setMensagem("Sistema de Cadastro de Clientes");
}
public String listarFuncionario(String tabela){
    String listagem=null;
    if(tabela.equalsIgnoreCase("Listar")){
        setMensagem("Cadastro de clientes");
        
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
    rs=meustate.executeQuery("select*from cliente");
    while (rs.next()){
    setCliente_id(rs.getInt("cliente_id"));
    setCliente_nome(rs.getString("cliente_nome"));
    setCliente_endereco(rs.getString("cliente_endereco"));
    setCliente_telefone(rs.getString("cliente_telefone"));
    setCliente_celular(rs.getString("cliente_celular"));
    setCliente_cpf(rs.getString("cliente_cpf"));
    setCliente_email(rs.getString("cliente_email"));
    setCliente_usuario(rs.getString("cliente_usuario"));
    setCliente_senha(rs.getString("cliente_senha"));

    listagem=listagem
            +"<tr><td>"+getCliente_id()
            +"</td><td>"+getCliente_nome()
            +"</td><td>"+getCliente_endereco()
            +"</td><td>"+getCliente_telefone()
            +"</td><td>"+getCliente_celular()
            +"</td><td>"+getCliente_cpf()
            +"</td><td>"+getCliente_email()
            +"</td><td>"+getCliente_usuario()
            +"</td><td>"+getCliente_senha()
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
        

