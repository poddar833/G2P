package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

public final class news_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("A", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("A", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        ");

        
        HashMap hm = (HashMap)application.getAttribute("news");

        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t<div class=\"col-md-offset-6\">\n");
      out.write("\t\t\t<font size=\"5\" color=\"#9ACD32\"><b>Headlines of the day</b></font>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t\t <div class=\"col-md-6 \"><br><br><br>\n");
      out.write("\t\t\t <div style=\"margin-left:70px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:450px; height:auto; width:1070px;\">\n");
      out.write("\t<font style=\"font-size:20px; color:blue\">\n");
      out.write("\t\n");
      out.write("                \n");
      out.write("        <a href=\"http://localhost:8084/G2P/HandleNews?file=1.pdf\">1. ");
      out.print(hm.get(1) );
      out.write("</a><br><br>\n");
      out.write("\n");
      out.write("\t<a href=\"http://localhost:8084/G2P/HandleNews?file=2.pdf\">2. ");
      out.print(hm.get(2) );
      out.write("</a><br><br>\n");
      out.write("\t\n");
      out.write("\t<a href=\"http://localhost:8084/G2P/HandleNews?file=3.pdf\">3. ");
      out.print(hm.get(3) );
      out.write("</a><br><br>\n");
      out.write("\t\n");
      out.write("\t<a href=\"http://localhost:8084/G2P/HandleNews?file=4.pdf\">4. ");
      out.print(hm.get(4) );
      out.write("</a><br><br>\n");
      out.write("\t\n");
      out.write("\t<a href=\"http://localhost:8084/G2P/HandleNews?file=5.pdf\">5. ");
      out.print(hm.get(5) );
      out.write("</a><br><br>\n");
      out.write("\t\n");
      out.write("\t<a href=\"http://localhost:8084/G2P/HandleNews?file=6.pdf\">6. ");
      out.print(hm.get(6) );
      out.write("</a><br><br>\n");
      out.write("    \n");
      out.write("\t<a href=\"http://localhost:8084/G2P/HandleNews?file=7.pdf\">7. ");
      out.print(hm.get(7) );
      out.write("</a><br><br>\n");
      out.write("\n");
      out.write("\t<a href=\"http://localhost:8084/G2P/HandleNews?file=8.pdf\">8. ");
      out.print(hm.get(8) );
      out.write("</a><br><br>\n");
      out.write("\n");
      out.write("\t<a href=\"http://localhost:8084/G2P/HandleNews?file=9.pdf\">9. ");
      out.print(hm.get(9) );
      out.write("</a><br><br>\n");
      out.write("        \n");
      out.write("        <a href=\"http://localhost:8084/G2P/HandleNews?file=10.pdf\">10. ");
      out.print(hm.get(10) );
      out.write("</a><br><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t</b>\n");
      out.write("\t</font>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("\t<br><br>\n");
      out.write("    <nav id=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("               <center> <p>ALL RIGHTS RESERVED. COPYRIGHT © 2016.  </p> </center>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
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
