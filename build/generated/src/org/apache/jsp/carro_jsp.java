package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.professordelphi.locadora.dao.DaoCarro carro = null;
      synchronized (_jspx_page_context) {
        carro = (com.professordelphi.locadora.dao.DaoCarro) _jspx_page_context.getAttribute("carro", PageContext.PAGE_SCOPE);
        if (carro == null){
          carro = new com.professordelphi.locadora.dao.DaoCarro();
          _jspx_page_context.setAttribute("carro", carro, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("carro"), request);
      out.write('\n');
      out.write('\n');

    try{
        carro.persistencia(request.getParameter ("btmovimento"));
             
    }catch (NullPointerException erro){
        carro.limpar();
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Cadastro de Carros</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        <box1>\n");
      out.write("        <div class=\"mãe\">\n");
      out.write("            <div class=\"topo\"</div>\n");
      out.write("                <div class=\"corpo\">\n");
      out.write("                    <div class=\"corpointerno\">\n");
      out.write("                    <form name=\"form1\" action=\"carro.jsp\" method=\"POST\">\n");
      out.write("                        <h1>");
      out.print(carro.getMensagem());
      out.write("</h1><br>\n");
      out.write("                        <div class=\"boxtexto2\">\n");
      out.write("                        <div class=\"boxtexto1\">\n");
      out.write("                        <label>Codigo</label> \n");
      out.write("                        </div>                           \n");
      out.write("                        <input type=\"text\" name=\"carro_id\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCarro)_jspx_page_context.findAttribute("carro")).getCarro_id())));
      out.write("\" readonly/> <br>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"boxtexto1\">\n");
      out.write("                        <label>Marca</label>\n");
      out.write("                        </div>\n");
      out.write("                        <input type =\"text\" name=\"carro_marca\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCarro)_jspx_page_context.findAttribute("carro")).getCarro_marca())));
      out.write("\" /> <br>\n");
      out.write("                        <div class=\"boxtexto1\">\n");
      out.write("                        <label>Modelo</label>\n");
      out.write("                        </div>\n");
      out.write("                        <input type =\"text\" name=\"carro_modelo\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCarro)_jspx_page_context.findAttribute("carro")).getCarro_modelo())));
      out.write("\" /> <br>\n");
      out.write("                        <div class=\"boxtexto1\">\n");
      out.write("                        <label>Ano</label>\n");
      out.write("                        </div>\n");
      out.write("                        <input type =\"text\" name=\"carro_ano\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCarro)_jspx_page_context.findAttribute("carro")).getCarro_ano())));
      out.write("\" /> <br>\n");
      out.write("                        <div class=\"boxtexto1\">\n");
      out.write("                        <label>Cor</label>\n");
      out.write("                        </div>\n");
      out.write("                        <input type =\"text\" name=\"carro_cor\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCarro)_jspx_page_context.findAttribute("carro")).getCarro_cor())));
      out.write("\" /> <br>\n");
      out.write("                        <div class=\"boxtexto1\">\n");
      out.write("                        <label>Placa</label>\n");
      out.write("                        </div>\n");
      out.write("                        <input type =\"text\" name=\"carro_placa\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.professordelphi.locadora.dao.DaoCarro)_jspx_page_context.findAttribute("carro")).getCarro_placa())));
      out.write("\" /> <br>\n");
      out.write("                         <br>                                          \n");
      out.write("                        <input type=\"submit\" value=\"Incluir\" name=\"btmovimento\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Excluir\" name=\"btmovimento\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Atualizar\" name=\"btmovimento\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Localizar\" name=\"btmovimento\"/>\n");
      out.write("                        <input type=\"submit\" value=\"Limpar\" name=\"btmovimento\"/>\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                        </div>                      \n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"index.jsp\">Retornar</a>\n");
      out.write("                        <div class=\"rodape\"></div>\n");
      out.write("        </div>\n");
      out.write("       </box1>\n");
      out.write("    \n");
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
