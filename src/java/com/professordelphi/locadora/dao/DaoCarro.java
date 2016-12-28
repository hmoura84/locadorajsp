/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.professordelphi.locadora.dao;

import com.professordelphi.locadora.dto.DtoCarro;
import java.sql.SQLException;
/**
 *
 * @author Henrique
 */
public class DaoCarro extends DtoCarro{
    public DaoCarro(){
    
}
public  void persistencia(String s){

if (s.equalsIgnoreCase("Limpar")){//IgnoreCase ignora maiúsculo e minusculo
limpar();
}
if (s.equalsIgnoreCase("Incluir")){
setSql("INSERT INTO carro (carro_marca, carro_modelo, carro_ano, carro_cor, carro_placa)"+
"VALUES ('"+getCarro_marca()+"','"+
                       getCarro_modelo()+"','"+
                       getCarro_ano()+"','"+
                       getCarro_cor()+"','"+                       
                       getCarro_placa()+"')");
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
    setSql("Delet FROM carro WHERE carro_id="+Integer.toString(getCarro_id()));
    try{
        meustate.executeUpdate(getSql());
        setMensagem("Operação com sucesso");
    }catch(SQLException ex){
        setMensagem("Operação cancelada");
    }
}
if(s.equalsIgnoreCase("Atualizar")){
    //Continuar aqui, verificar se nomeCliente existe em DaoFuncionario como nomeFuncionario.
    setSql("UPDATE carro SET marcaCarro="+getCarro_marca()
    +"',carro_modelo='"+getCarro_modelo()
    +"',carro_ano='"+getCarro_ano()
    +"',carro_cor='"+getCarro_cor()
    +"',carro_placa='"+getCarro_placa()
    +"'WHERE carro_id="+Integer.toString(getCarro_id()));
 try{
        meustate.executeUpdate(getSql());
        setMensagem("Operação com sucesso");
    }catch(SQLException ex){
        setMensagem("Operação cancelada");
    }
}
if(s.equalsIgnoreCase("Localizar")){
    setSql("Selec*from carro where carro_placa="+getCarro_placa()+"'");
 try{
    rs=meustate.executeQuery(getSql());
    rs.next();
    setCarro_id(rs.getInt("carro_id"));
    setCarro_marca(rs.getString("carro_marca"));
    setCarro_modelo(rs.getString("carro_modelo"));
    setCarro_ano(rs.getString("carro_ano"));
    setCarro_cor(rs.getString("carro_cor"));
    setCarro_placa(rs.getString("carro_placa"));
    
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
    
    setCarro_id(0);
    setCarro_marca("");
    setCarro_modelo("");
    setCarro_ano("");
    setCarro_cor("");
    setCarro_placa("");
          
    setMensagem("Sistema de Cadastro de Carros");
}
public String listarCarro(String tabela){
    String listagem=null;
    if(tabela.equalsIgnoreCase("Listar")){
        setMensagem("Cadastro de carros");
        
        listagem="<h1>"+getMensagem()+"</h1><table border=2>"
        +"<tr><td alin='ceter'><h4>Codigo</h4>"
        +"</td><td alin='ceter'><h4>Marca</h4>"
        +"</td><td alin='ceter'><h4>Modelo</h4>"
        +"</td><td alin='ceter'><h4>Ano</h4>"
        +"</td><td alin='ceter'><h4>Cor</h4>"
        +"</td><td alin='ceter'><h4>Placa</h4>"
        +"</td></tr>";
    try{
    rs=meustate.executeQuery("select*from carro");
    while (rs.next()){
    setCarro_id(rs.getInt("carro_id"));
    setCarro_marca(rs.getString("carro_marca"));
    setCarro_modelo(rs.getString("carro_modelo"));
    setCarro_ano(rs.getString("carro_ano"));
    setCarro_cor(rs.getString("carro_cor"));
    setCarro_placa(rs.getString("carro_placa"));    
        
    listagem=listagem
            +"<tr><td>"+getCarro_id()
            +"</td><td>"+getCarro_marca()
            +"</td><td>"+getCarro_modelo()
            +"</td><td>"+getCarro_ano()
            +"</td><td>"+getCarro_cor()
            +"</td><td>"+getCarro_placa()
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
