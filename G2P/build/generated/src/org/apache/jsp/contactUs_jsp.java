package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          ");

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
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("\t\t\t <div class=\"col-md-6 \"><br><br><br>\n");
      out.write("\t\t\t <div style=\"margin-left:130px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:450px; height:auto; width:1070px;\">\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t<div id=\"contact\" class=\"page\">\n");
      out.write("<div class=\"container\">\n");
      out.write("    <!-- Title Page -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span12\">\n");
      out.write("            <div class=\"title-page\">\n");
      out.write("                <h2 class=\"title\">Get in Touch</h2>\n");
      out.write("                <h3 class=\"title-description\">We’re currently accepting new client projects. We look forward to serving you.</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Title Page -->\n");
      out.write("    \n");
      out.write("    <!-- Contact Form -->\n");
      out.write("    <div class=\"row\">\n");
      out.write("    \t<div class=\"span9\">\n");
      out.write("        \n");
      out.write("            <form id=\"contact-form\" class=\"contact-form\" action=\"EmailServlet\" method=\"post\">\n");
      out.write("            \t<p class=\"contact-name\">\n");
      out.write("            \t\t<input id=\"contact_name\" type=\"text\" placeholder=\"Full Name\"  name=\"name\" />\n");
      out.write("                </p>\n");
      out.write("                <p class=\"contact-email\">\n");
      out.write("                \t<input id=\"contact_email\" type=\"text\" placeholder=\"Email Address\"  name=\"email\" />\n");
      out.write("                </p>\n");
      out.write("                <p class=\"contact-message\">\n");
      out.write("                \t<textarea id=\"contact_message\" placeholder=\"Your Message\" name=\"message\" rows=\"15\" cols=\"40\"></textarea>\n");
      out.write("                </p>\n");
      out.write("                <p class=\"contact-submit\">\n");
      out.write("                    <input type=\"submit\"  style=\"color:#DE5E60; \"value=\"Send Your Message\"/>\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <div id=\"response\">\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"span3\">\n");
      out.write("        \t<div class=\"contact-details\">\n");
      out.write("        \t\t<h3>Contact Details</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">poddar833@gmail.com</a></li>\n");
      out.write("                    <li>(+91)9669870142</li>\n");
      out.write("                    <li>\n");
      out.write("                        Glucili.com\n");
      out.write("                        <br>\n");
      out.write("                        B-55 , Lakshmi Nagar , \n");
      out.write("                        <br>\n");
      out.write("                        New Delhi -110059\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Contact Form -->\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t </div>\n");
      out.write("    </div>\n");
      out.write("    <br><br><br><br>\n");
      out.write("   <nav id=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("               <center> <p>ALL RIGHTS RESERVED. COPYRIGHT © 2016.  </p>  </center>\n");
      out.write("            \n");
      out.write("\t\t\t\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
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
