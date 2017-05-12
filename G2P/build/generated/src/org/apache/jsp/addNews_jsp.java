package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addNews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String n = (String)session.getAttribute("user");
            if(n==null){
                response.sendRedirect("login.jsp");
            }
            else{
        
      out.write("\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("user", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("admin", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("         ");
 } 
      out.write("\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <div class=\"col-md-10\">\n");
      out.write("\t\t\t<div class=\"col-md-offset-6\">\n");
      out.write("\t\t\t<label class=\"control-label col-md-3\"style=\"font-family:ArialBlack\"><font size=\"5\" color=\"#9ACD32\">Add News</font></label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div><br><br><br>\n");
      out.write("\t\t\t<div class=\"col-md-6 col-md-offset-2\">\n");
      out.write("                            <form role=\"form\" class=\"form-horizontal\" action=\"Uploadpdf\" method=\"post\"   >\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>Headline:</b></label>\n");
      out.write("                    <div class=\"col-md-9\">\n");
      out.write("                       <input type=\"text\" class=\"form-control\" id=\"uname\"  name=\"news\"  placeholder=\"headline\"/>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>Upload File:</b></label>\n");
      out.write("                    <div class=\"col-md-9\">\n");
      out.write("                        <input type=\"file\" class=\"form-control\" id=\"uname\" name=\"uname\"/>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("\t\t\t\t \n");
      out.write("                \n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label class=\"control-label col-md-3\"><b>Headline Number:</b></label>\n");
      out.write("\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("                                    <select class=\"form-control\"  name=\"headline\">\n");
      out.write("                                        <option value=\"1\">1</option>\n");
      out.write("                                        <option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t<option value=\"4\">4</option>\n");
      out.write("\t\t\t\t\t<option value=\"5\">5</option>\n");
      out.write("\t\t\t\t\t<option value=\"6\">6</option>\n");
      out.write("\t\t\t\t\t<option value=\"7\">7</option>\n");
      out.write("\t\t\t\t\t<option value=\"8\">8</option>\n");
      out.write("                                        <option value=\"9\">9</option>\n");
      out.write("\t\t\t\t\t<option value=\"10\">10</option>\n");
      out.write("                                        <option selected>Headine number</option>\n");
      out.write("                    </select>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                        <div class=\"btn col-md-3 col-md-offset-6\" style=\"color:white;background-color:#9ACD32;\"><button type=\"submit\"><b>Flash News</b></button></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("        \n");
      out.write("       \n");
      out.write("   \n");
      out.write("        \n");
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
