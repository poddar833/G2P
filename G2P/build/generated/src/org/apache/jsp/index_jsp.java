package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("   \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>G2P</title>    \n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"  href=\"css/bootstrap.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\"  href=\"css/bootstrap-min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.css\">\n");
      out.write("    <!-- Stylesheet\n");
      out.write("    ================================================== -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"  href=\"css/stylee.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/responsive.css\">\t\n");
      out.write("\t<script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"script/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"script/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"script/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<style>\n");
      out.write("\t\t\tbody\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tbackground-image: url('img/24.jpg');\n");
      out.write("\t\t\t\t\tbackground-attachment: fixed;\n");
      out.write("\t\t\t\t\tbackground-size: 100% 100%;\n");
      out.write("\t\t\t\t\tfont-size:30px;\n");
      out.write("\t\t\t\t\tfont-color:black;\n");
      out.write("\t\t\t\t\tmargin-top:60px;\n");
      out.write("\t\t\t\t\ttext-align:center;\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <!-- Navigation\n");
      out.write("    ==========================================-->\n");
      out.write("    \n");
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
      out.write("    <br><br><br><br>\n");
      out.write("   <b><center><p style=\"font-size:40px ;color:black \">New to G2P?</p></b></center>\n");
      out.write("   ");

   
   
         HashMap news = new HashMap();
         
         application.setAttribute("news", news);
   
      out.write("\n");
      out.write("   <br>\n");
      out.write("   <div class=\"row\">\n");
      out.write("   \n");
      out.write("   <div class=\"btn btn-danger col-md-2 \" style=\"color:black; margin-left:570px; background-color:#9ACD32\"><b><a href=\"register.jsp\" style=\"color:black;\">Register Now </a></b></div>\n");
      out.write("   </div>\n");
      out.write("   <br><br><br><br> <br><br><br>\n");
      out.write("   <b><center><p style=\"font-size:35px ;color:black \">OUR SERVICES</p></b>\n");
      out.write("   <p style=\"font-size:18px ;color:black \">What We Do With Love</p></b></center>\n");
      out.write("   <br><br>\n");
      out.write("   <div class=\"container\">\n");
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
      out.write("  \n");
      out.write("   <br><br><br><br>\n");
      out.write("   <b><center><p style=\"font-size:33px ;color:black \">ABOUT US</p></b>\n");
      out.write("   <p style=\"font-size:18px ;color:black \">What We Do</p></b><br>\n");
      out.write("   <font size=\"4\" color=\"black\"><b>G2P : Goverment to People is a plateform that provide aa the information about government.It is provided by their respresentives itself.Apart from this it can also be used vote and the policies.\n");
      out.write("   </b></font>\n");
      out.write("   </center>\n");
      out.write("   <br><br>\n");
      out.write("   <div class=\"row\">\n");
      out.write("\t\t\t <div class=\"col-md-6\">\n");
      out.write("\t\t\t <div style=\"margin-left:90px;\">\n");
      out.write("\t\t\t  <img src=\"img/2.jpg\" class=\"thumbnail\" style=\"float:left; width:450px; height:370px;\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t </div><br><br><br>\n");
      out.write("            \n");
      out.write("             <div class=\"col-md-6 \">\t\t\t\t\n");
      out.write("                \n");
      out.write("\t\t\t\t\t        <div class=\"col-md-12\">\n");
      out.write("                                    <label style=\"font-size:20px; color:black\"><b>PROVIDE DETAILED POLICIES INFORMATIONS</b></label><br>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                                    <label style=\"font-size:20px; color:black\"><b>CAN VOTE AND GIVEN RATTINGS</b></label><br>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                                    <label style=\"font-size:20px; color:black\"><b>CAN DISCUSS OVER ANY POLITICAL MATTER</b></label><br>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                                    <label style=\"font-size:20px; color:black\"><b>CAN FORCE LEADERS TO GIVE ANSWERS</b></label><br>\n");
      out.write("                            </div>\n");
      out.write("        </div>\n");
      out.write("\t\t</div>\n");
      out.write("   <br><br><br><br><br>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <nav id=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("                <center><p>ALL RIGHTS RESERVED. COPYRIGHT © 2016.</p> </center>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("  </body>\n");
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
