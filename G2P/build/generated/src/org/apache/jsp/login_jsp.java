package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("       ");

        String n = (String)session.getAttribute("user");
            if(n!=null){
                response.sendRedirect("index.jsp");
            }
            else{
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("user", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Guest", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("        ");
} 
      out.write("\n");
      out.write("        <br><br><br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t<div class=\"col-md-offset-6\">\n");
      out.write("\t\t\t<label class=\"control-label col-md-3\" style=\"font-family:ArialBlack\"><font size=\"5\" color=\"#9ACD32\"><b>LOGIN</b></font></label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("            <br><br>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-6 col-md-offset-2\">\n");
      out.write("            <form role=\"form\" class=\"form-horizontal\" action=\"loginServlet\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>Email Address/Adhar Card No:</b></label>\n");
      out.write("                    <div class=\"col-md-9\">\n");
      out.write("                       <input type=\"text\" class=\"form-control\" id=\"uname\" name=\"email\" maxlength=\"40\" placeholder=\"Email/Adhar No\"/>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"pwd\" class=\"control-label col-md-3\" required><b>Password:</b></label>\n");
      out.write("                    <div class=\"col-md-9\">\n");
      out.write("                       <input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"pass\" maxlength=\"40\" placeholder=\"Password\"/>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label class=\"control-label col-md-3\"><b>UserType</b></label>\n");
      out.write("\t\t\t\t<div class=\"col-md-9\">\n");
      out.write("                                    <select class=\"form-control\" required  name=\"type\">\n");
      out.write("                                        <option value=\"people\">People</option>\n");
      out.write("                                        <option value=\"admin\">Admin</option>\n");
      out.write("                                        <option selected value=\"rep\">Representative</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"btn col-md-3 col-md-offset-6\"  style=\"color:white;background-color:#9ACD32\"><b><input type=\"submit\" value=\"Login\"></b></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("\t\t\t</div><br><br>\n");
      out.write("\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("          <br><br>\n");
      out.write("              \n");
      out.write("        <script src=\"./scripts/jquery-2.1.4.min.js\"></script>\n");
      out.write("        <script src=\"./scripts/bootstrap.min.js\"></script>\n");
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
