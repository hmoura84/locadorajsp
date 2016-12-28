package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      com.professordelphi.locadora.dao.DaoCliente cliente = null;
      synchronized (_jspx_page_context) {
        cliente = (com.professordelphi.locadora.dao.DaoCliente) _jspx_page_context.getAttribute("cliente", PageContext.PAGE_SCOPE);
        if (cliente == null){
          cliente = new com.professordelphi.locadora.dao.DaoCliente();
          _jspx_page_context.setAttribute("cliente", cliente, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("cliente"), request);
      out.write('\n');
      out.write('\n');

    try{
        cliente.persistencia(request.getParameter ("btmovimento"));
             
    }catch (NullPointerException erro){
        cliente.limpar();
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Cadastro de Clientes</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mãe\">\n");
      out.write("            <div class=\"topo\"</div>\n");
      out.write("                <div class=\"corpo\">\n");
      out.write("                    <div class=\"corpointerno\">\n");
      out.write("                    <form name=\"form1\" action=\"cliente.jsp\" method=\"POST\">\n");
      out.write("                        <h1>");
      out.print(cliente.getMensagem());
      out.write("</h1><br>\n");
      out.write("                        <label>Codigo</label> \n");
      out.write("                        <input type=\"text\" name=\"cliente_id\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_id())));
      out.write("\" readonly/> <br>\n");
      out.write("                        \n");
      out.write("                        <label>Nome</label>\n");
      out.write("                        <input type =\"text\" name=\"cliente_nome\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_nome())));
      out.write("\" /> <br>\n");
      out.write("                        \n");
      out.write("                        <label>Endereço</label>\n");
      out.write("                        <input type =\"text\" name=\"cliente_endereco\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_endereco())));
      out.write("\" /> <br>\n");
      out.write("                        \n");
      out.write("                        <label>Telefone</label>\n");
      out.write("                        <input type =\"text\" name=\"cliente_telefone\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_telefone())));
      out.write("\" /> <br>\n");
      out.write("                        \n");
      out.write("                        <label>Celular</label>\n");
      out.write("                        <input type =\"text\" name=\"cliente_celular\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_celular())));
      out.write("\" /> <br>\n");
      out.write("                        \n");
      out.write("                        <label>CPF</label>\n");
      out.write("                        <input type =\"text\" name=\"cliente_cpf\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_cpf())));
      out.write("\" /> <br>\n");
      out.write("                        \n");
      out.write("                        <label>Email</label>\n");
      out.write("                        <input type =\"text\" name=\"cliente_email\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_email())));
      out.write("\" /> <br>\n");
      out.write("                        \n");
      out.write("                        <label>Usuario</label>\n");
      out.write("                        <input type =\"text\" name=\"cliente_usuario\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_usuario())));
      out.write("\" /> <br>\n");
      out.write("                       \n");
      out.write("                        <label>Senha</label>\n");
      out.write("                        <input type =\"text\" name=\"cliente_senha\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCliente)_jspx_page_context.findAttribute("cliente")).getCliente_senha())));
      out.write("\" /> <br>\n");
      out.write("                       \n");
      out.write("                        <input type=\"submit\" value=\"Incluir\" name=\"btmovimento\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Excluir\" name=\"btmovimento\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Atualizar\" name=\"btmovimento\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Localizar\" name=\"btmovimento\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Limpar\" name=\"btmovimento\"/>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                         </div>                     \n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"index.jsp\">Retornar</a>\n");
      out.write("                        <div class=\"rodape\"></div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
