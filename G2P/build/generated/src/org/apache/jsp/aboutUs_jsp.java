package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("     ");

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
      out.write("  <div class=\"row\">\n");
      out.write("\t\t\t <div class=\"col-md-6 \"><br><br><br>\n");
      out.write("\t\t\t <div style=\"margin-left:150px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px; height:auto; width:1070px; \"); >\n");
      out.write("\t<font style=\"font-size:20px; color:blue\">\n");
      out.write("\t\t\t  \n");
      out.write("\t  \n");
      out.write("   <b><center><p style=\"font-size:33px ;color:purple \">ABOUT US</p></b>\n");
      out.write("   <p style=\"font-size:18px ;color:black; color:purple \">What We Do</p></b><br>\n");
      out.write("   <font size=\"4\" color=\"purple\"><b>G2P : Goverment to People is a plateform that provide aa the information about government.It is provided by their respresentives itself.Apart from this it can also be used vote and the policies.\n");
      out.write("   </b></font>\n");
      out.write("   </center>\n");
      out.write("   <br><br>\n");
      out.write("   <div class=\"row\">\n");
      out.write("\t\t\t <div class=\"col-md-6\">\n");
      out.write("\t\t\t <div style=\"margin-left:30px;\">\n");
      out.write("\t\t\t  <img src=\"img/2.jpg\" class=\"thumbnail\" style=\"float:left; width:450px; height:370px;\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t </div><br><br><br>\n");
      out.write("            \n");
      out.write("             <div class=\"col-md-6 \">\t\t\t\t\n");
      out.write("                \n");
      out.write("\t\t\t\t\t        <div class=\"col-md-12\">\n");
      out.write("                                    <label style=\"font-size:20px; color:purple\"><b>PROVIDE DETAILED POLICIES INFORMATIONS</b></label><br>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                                    <label style=\"font-size:20px; color:purple\"><b>CAN VOTE AND GIVEN RATTINGS</b></label><br>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                                    <label style=\"font-size:20px; color:purple\"><b>CAN DISCUSS OVER ANY POLITICAL MATTER</b></label><br>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                                    <label style=\"font-size:20px; color:purple\"><b>CAN FORCE LEADERS TO GIVE ANSWERS</b></label><br>\n");
      out.write("                            </div>\n");
      out.write("        </div>\n");
      out.write("\t\t</div>\n");
      out.write("   <br><br><br><br><br>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</b>\n");
      out.write("\t</font>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("\t<br><br>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
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
