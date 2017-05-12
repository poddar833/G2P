package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accountDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"script/jquery-3.1.1.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String n = (String)session.getAttribute("user");
            if(n==null){
               
        
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("user", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Guest", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    ");

    }
else{
    String user = (String)session.getAttribute("user");
    
      out.write("\n");
      out.write("    \n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("user", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression(" ${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("    ");
} 
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t<div class=\"col-md-offset-6\">\n");
      out.write("\t\t\t<font size=\"5\" color=\"#9ACD32\"><b>Personalize your account</b></font>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t\t <div class=\"col-md-6 \"><br><br><br>\n");
      out.write("\t\t\t <div style=\"margin-left:50px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:450px; height:auto; width:1070px;\">\n");
      out.write("\t<font style=\"font-size:20px; color:blue\">\n");
      out.write("\t\t\t  \n");
      out.write("         <div class=\"form-group\">\n");
      out.write("             \n");
      out.write("             ");

                 String user =(String)session.getAttribute("user");
                if(user=="Admin")
                response.sendRedirect("adminOptions.jsp");
             else{
                
             
      out.write("\n");
      out.write("             \n");
      out.write("              <script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$('#div1').click(function(){\n");
      out.write("\t$('#div2').show();\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("              <script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$('#div1a').click(function(){\n");
      out.write("\t$('#div2a').show();\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("              <script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$('#div1b').click(function(){\n");
      out.write("\t$('#div2b').show();\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("              <script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$('#div1c').click(function(){\n");
      out.write("\t$('#div2c').show();\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>Email Address/Adhar Card No:</b></label>\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b> <a href=\"#\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a></b></label>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>  Address :</b></label>\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b> <a href=\"#\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a></b></label>\n");
      out.write("                    \n");
      out.write("                <input id=\"div2a\" type=\"text\"   style=\" display:none\"/>\n");
      out.write("\n");
      out.write("                <input id=\"div1a\" type=\"button\" value=\"click Me\" />\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>  News Preference : </b></label>\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b> <a href=\"#\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a></b></label>\n");
      out.write("                    \n");
      out.write("                <input id=\"div2b\" type=\"text\"   style=\" display:none\"/>\n");
      out.write("\n");
      out.write("                <input id=\"div1b\" type=\"button\" value=\"click Me\" />\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                                        \n");
      out.write("\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>  Location : </b></label>\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b> <a href=\"#\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a></b></label>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <input id=\"div2c\" type=\"text\"   style=\" display:none\"/>\n");
      out.write("\n");
      out.write("                <input id=\"div1c\" type=\"button\" value=\"click Me\" />\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("         </div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</b>\n");
      out.write("\t</font>\n");
      out.write("        <center><input  id=\"divabc\" type=\"submit\" value=\"Submit\" ></center> \n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("                    \n");
      out.write("    </div>\n");
      out.write("                           \n");
      out.write("    </div>\n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("        \n");
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
