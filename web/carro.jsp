<%-- 
    Document   : carro
    Created on : 27/12/2016, 14:41:27
    Author     : Henrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="carro" scope="page" class ="com.professordelphi.locadora.dao.DaoCarro"/>
<jsp:setProperty name="carro" property="*"/>

<%
    try{
        carro.persistencia(request.getParameter ("btmovimento"));
             
    }catch (NullPointerException erro){
        carro.limpar();
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cadastro de Carros</title>
<%--<link href="estilo.css" rel="stylesheet" type="text/css">--%>
        <link rel="stylesheet" href="css/style.css">
    </head>
    
        <box1>
        <div class="mãe">
            <div class="topo"</div>
                <div class="corpo">
                    <div class="corpointerno">
                    <form name="form1" action="carro.jsp" method="POST">
                        <h1><%=carro.getMensagem()%></h1><br>
                        <div class="boxtexto2">
                        <div class="boxtexto1">
                        <label>Codigo</label> 
                        </div>                           
                        <input type="text" name="carro_id" value="<jsp:getProperty name="carro" property="carro_id"/>" readonly/> <br>
                        </div>
                        <div class="boxtexto1">
                        <label>Marca</label>
                        </div>
                        <input type ="text" name="carro_marca" value="<jsp:getProperty name="carro" property="carro_marca"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Modelo</label>
                        </div>
                        <input type ="text" name="carro_modelo" value="<jsp:getProperty name="carro" property="carro_modelo"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Ano</label>
                        </div>
                        <input type ="text" name="carro_ano" value="<jsp:getProperty name="carro" property="carro_ano"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Cor</label>
                        </div>
                        <input type ="text" name="carro_cor" value="<jsp:getProperty name="carro" property="carro_cor"/>" /> <br>
                        <div class="boxtexto1">
                        <label>Placa</label>
                        </div>
                        <input type ="text" name="carro_placa" value="<jsp:getProperty name="carro" property="carro_placa"/>" /> <br>
                         <br>                                          
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
       </box1>
    
</html>
