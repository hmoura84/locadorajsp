<%-- 
    Document   : cliente
    Created on : 26/12/2016, 14:59:10
    Author     : Henrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="cliente" scope="page" class ="com.professordelphi.locadora.dao.DaoCliente"/>
<jsp:setProperty name="cliente" property="*"/>

<%
    try{
        cliente.persistencia(request.getParameter ("btmovimento"));
             
    }catch (NullPointerException erro){
        cliente.limpar();
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cadastro de Clientes</title>
        <%--<link href="estilo.css" rel="stylesheet" type="text/css">--%>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="mãe">
            <div class="topo"</div>
                <div class="corpo">
                    <div class="corpointerno">
                    <form name="form1" action="cliente.jsp" method="POST">
                        <h1><%=cliente.getMensagem()%></h1><br>
                        <div class="boxtexto1">
                        <label>Codigo</label> 
                        </div>
                        <input type="text" name="cliente_id" value="<jsp:getProperty name="cliente" property="cliente_id"/>" readonly/> <br>
                        <div class="boxtexto1">
                        <label>Nome</label>
                        </div>
                        <input type ="text" name="cliente_nome" value="<jsp:getProperty name="cliente" property="cliente_nome"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Endereço</label>
                        </div>
                        <input type ="text" name="cliente_endereco" value="<jsp:getProperty name="cliente" property="cliente_endereco"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Telefone</label>
                        </div>
                        <input type ="text" name="cliente_telefone" value="<jsp:getProperty name="cliente" property="cliente_telefone"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Celular</label>
                        </div>
                        <input type ="text" name="cliente_celular" value="<jsp:getProperty name="cliente" property="cliente_celular"/>" /> <br>
                        <div class="boxtexto1">
                        <label>CPF</label>
                        </div>
                        <input type ="text" name="cliente_cpf" value="<jsp:getProperty name="cliente" property="cliente_cpf"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Email</label>
                        </div>
                        <input type ="text" name="cliente_email" value="<jsp:getProperty name="cliente" property="cliente_email"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Usuario</label>
                        </div>
                        <input type ="text" name="cliente_usuario" value="<jsp:getProperty name="cliente" property="cliente_usuario"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Senha</label>
                        </div>
                        <input type ="text" name="cliente_senha" value="<jsp:getProperty name="cliente" property="cliente_senha"/>" /> <br>
                        <br>
                        <input type="submit" value="Incluir" name="btmovimento"/>
                        <input type="submit" value="Excluir" name="btmovimento"/>
                        <input type="submit" value="Atualizar" name="btmovimento"/>
                        <input type="submit" value="Localizar" name="btmovimento"/>
                        <input type="submit" value="Limpar" name="btmovimento"/>
                        
                    </form>
                        <a href="index.jsp">Retornar</a>
                         </div> 
                        
                        </div>
                        
                        <div class="rodape"></div>
        </div>
       
    </body>
</html>
