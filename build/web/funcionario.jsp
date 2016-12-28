<%-- 
    Document   : funcionario
    Created on : 25/04/2015, 10:39:14
    Author     : Henrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="funcionario" scope="page" class ="com.professordelphi.locadora.dao.DaoFuncionario"/>
<jsp:setProperty name="funcionario" property="*"/>

<%
    try{
        funcionario.persistencia(request.getParameter ("btmovimento"));
             
    }catch (NullPointerException erro){
        funcionario.limpar();
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cadastro de Funcionarios</title>
        <%--<link href="estilo.css" rel="stylesheet" type="text/css">--%>
        <link rel="stylesheet" href="css/style.css">        
    </head>
    <body>
        <div class="mãe">
            <div class="topo"</div>
                <div class="corpo">
                    <div class="corpointerno">
                    <form name="form1" action="funcionario.jsp" method="POST">
                        <h1><%=funcionario.getMensagem()%></h1><br>
                        <div class="label">Codigo 
                        <input type="text" name="func_id" value="<jsp:getProperty name="funcionario" property="func_id"/>" readonly/> <br>
                        </div>
                        <label>Nome</label>
                        <input type ="text" name="func_nome" value="<jsp:getProperty name="funcionario" property="func_nome"/>" /> <br>
                        
                        <label>Endereço</label>
                        <input type ="text" name="func_endereco" value="<jsp:getProperty name="funcionario" property="func_endereco"/>" /> <br>
                        
                        <label>Telefone</label>
                        <input type ="text" name="func_telefone" value="<jsp:getProperty name="funcionario" property="func_telefone"/>" /> <br>
                        
                        <label>Celular</label>
                        <input type ="text" name="func_celular" value="<jsp:getProperty name="funcionario" property="func_celular"/>" /> <br>
                        
                        <label>CPF</label>
                        <input type ="text" name="func_cpf" value="<jsp:getProperty name="funcionario" property="func_cpf"/>" /> <br>
                        
                        <label>Email</label>
                        <input type ="text" name="func_email" value="<jsp:getProperty name="funcionario" property="func_email"/>" /> <br>
                        
                        <label>Usuario</label>
                        <input type ="text" name="func_usuario" value="<jsp:getProperty name="funcionario" property="func_usuario"/>" /> <br>
                       
                        <label>Senha</label>
                        <input type ="text" name="func_senha" value="<jsp:getProperty name="funcionario" property="func_senha"/>" /> <br>
                       
                        <input type="submit" value="Incluir" name="btmovimento"/>
                        <input type="submit" value="Excluir" name="btmovimento"/>
                        <input type="submit" value="Atualizar" name="btmovimento"/>
                        <input type="submit" value="Localizar" name="btmovimento"/>
                        <input type="submit" value="Limpar" name="btmovimento"/>
                        <a href="index.jsp">Retornar</a>
                    </form>
                           </div>                   
                        </div>
                        
                        <div class="rodape"></div>
        </div>
        
    </body> 
</html>






