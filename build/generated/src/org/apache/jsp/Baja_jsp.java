package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public final class Baja_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write(" \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Friendly Books</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: peachpuff\">\n");
      out.write("    <center>\n");
      out.write("        <h1>fiendly Books</h1>    \n");
      out.write(" ");

try
{
   // Conexion con bd
   Class.forName("org.gjt.mm.mysql.Driver");
   Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventario","root","160604");
   if (!conexion.isClosed())
   {
      // La consulta
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery("select * from libros"  );
     
      

      // Ponemos los resultados en un table de html
      out.println("<table border=\"1\"><tr><td>Titulo</td><td>Editorial</td><td>Autor</td><td>Paginas</td><td>Genero</td><td>Idioma</td><td>eliminar</td></tr>");
      while (rs.next())
      {
         out.println("<tr>");
         out.println("<td>"+rs.getObject("titulo")+"</td>");
         out.println("<td>"+rs.getObject("editorial")+"</td>");
         out.println("<td>"+rs.getObject("autor")+"</td>");
         out.println("<td>"+rs.getObject("paginas")+"</td>");
         out.println("<td>"+rs.getObject("genero")+"</td>");
         out.println("<td>"+rs.getObject("idioma")+"</td>");
         out.println("<td>"+"<a href=eliminar.jsp?cod="+rs.getString("titulo")+">"+"eliminar"+"</a>"+"</td>");
         out.println("</tr>");
         
      }
      out.println("</table>");

      // cierre de la conexion
      conexion.close();
   }
   else
      // Error en la conexion
      out.println("fallo");
}
catch (Exception e)
{
   // Error en algun momento.
   out.println("Excepcion "+e);
   e.printStackTrace();
}

      out.write("\n");
      out.write("    \n");
      out.write("    <a href=\"index.jsp\">Salir</a>\n");
      out.write(" </center>\n");
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
