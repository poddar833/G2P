package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <br><br><br><br>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <br><br><br>\n");
      out.write("     \n");
      out.write("\t <div class=\"container\">\n");
      out.write("   <div class=\"row\">\n");
      out.write("   <div class=\"col-md-6 col-md-offset-1\">\n");
      out.write("   <div class=\"col-md-2\">\n");
      out.write("     <img src=\"img/14.jpg\" class=\"thumbnail\" style=\"height:100px; padding-top:20px;\">\n");
      out.write("   </div>\n");
      out.write("\t <div class=\"col-md-7\" style=\"padding-top:20px;\">\n");
      out.write("\t<label style=\"font-family:Arial Black; font-size:20px;color:black\"><a href=\"Group.html\" style=\"color:Black\" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Groups</a></label>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   <div class=\"col-md-5\">\n");
      out.write("   <div class=\"col-md-3\">\n");
      out.write("     <img src=\"img/21.png\" class=\"thumbnail\" style=\"height:100px; padding-top:20px;\">\n");
      out.write("    </div>\n");
      out.write("\t <div class=\"col-md-7\" style=\"padding-top:20px;\">\n");
      out.write("\t <label style=\"font-family:Arial Black; font-size:20px;color:black\"><a href=\"Discuss.html\" style=\"color:Black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Discuss</a></label>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   <br>\n");
      out.write("   <div class=\"row\">\n");
      out.write("   <div class=\"col-md-6 col-md-offset-1\">\n");
      out.write("   <div class=\"col-md-2\">\n");
      out.write("     <img src=\"img/20.jpg\" class=\"thumbnail\" style=\"height:100px; padding-top:20px;\">\n");
      out.write("   </div>\n");
      out.write("\t <div class=\"col-md-7\" style=\"padding-top:20px;\">\n");
      out.write("\t<label style=\"font-family:Arial Black; font-size:20px;color:black\"><a href=\"PoleSurvey.html\" style=\"color:Black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pole Servey</a></label>\n");
      out.write("\t</div>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   <div class=\"col-md-5\">\n");
      out.write("   <div class=\"col-md-3\">\n");
      out.write("     <img src=\"img/16.jpg\" class=\"thumbnail\" style=\"height:100px; padding-top:20px;\">\n");
      out.write("    </div>\n");
      out.write("\t <div class=\"col-md-7\" style=\"padding-top:20px;\">\n");
      out.write("\t <label style=\"font-family:Arial Black; font-size:20px;color:black\"><a href=\"Blog.html\" style=\"color:Black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Blog</a></label>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   <br>\n");
      out.write("   \n");
      out.write("   <div class=\"row\">\n");
      out.write("   <div class=\"col-md-6 col-md-offset-1\">\n");
      out.write("   <div class=\"col-md-2\">\n");
      out.write("     <img src=\"img/12.jpg\" class=\"thumbnail\" style=\"height:100px; padding-top:20px;\">\n");
      out.write("   </div>\n");
      out.write("\t <div class=\"col-md-7\" style=\"padding-top:20px;\">\n");
      out.write("\t<label style=\"font-family:Arial Black; font-size:20px;color:black\"><a href=\"Talk.html\" style=\"color:Black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Talk</a></label>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   <div class=\"col-md-5\">\n");
      out.write("   <div class=\"col-md-3\">\n");
      out.write("     <img src=\"img/15.jpg\" class=\"thumbnail\" style=\"height:100px; padding-top:20px;\">\n");
      out.write("    </div>\n");
      out.write("\t <div class=\"col-md-7\" style=\"padding-top:20px;\">\n");
      out.write("\t <label style=\"font-family:Arial Black; font-size:20px;color:black\"><a href=\"Do.html\" style=\"color:Black\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Do</a></label>\n");
      out.write("   </div>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   </div>\n");
      out.write("\t\n");
      out.write("\t<br><br>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <nav id=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("               <center> <p>ALL RIGHTS RESERVED. COPYRIGHT © 2016.  </p>  </center>\n");
      out.write("            \n");
      out.write("\t\t\t\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
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
