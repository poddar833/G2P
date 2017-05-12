package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DatabaseConnectivity.Connectivity;
import java.sql.Statement;
import java.sql.Connection;

public final class postDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("     ");

    String temp = request.getParameter("id");
    int id      = Integer.parseInt(temp);
    Connection c = Connectivity.getConnection1();
    String sql   = "select * from post where p_id=?";
    PreparedStatement pst = c.prepareStatement(sql);
    pst.setInt(1, id);
    ResultSet rs = pst.executeQuery();
    
    while(rs.next()){
    
      out.write("\n");
      out.write("    \n");
      out.write("  <div class=\"row\">\n");
      out.write("\t\t\t <div class=\"col-md-6 \"><br><br><br>\n");
      out.write("\t\t\t <div style=\"margin-left:150px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px; height:auto; width:1070px; \"); >\n");
      out.write("\t<font style=\"font-size:20px; color:blue\">\n");
      out.write("\t\t\t  \n");
      out.write("\t  \n");
      out.write("   <b><center><p style=\"font-size:33px ;color:purple \">News Details</p></b>\n");
      out.write("   <p style=\"font-size:18px ;color:black; color:purple \"></p></b><br>\n");
      out.write("   <font size=\"4\" color=\"purple\"><b>");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("   </b></font>\n");
      out.write("   </center>\n");
      out.write("   <br><br>\n");
      out.write("   \n");
      out.write("   <div class=\"row\">\n");
      out.write("\t\t\t <div class=\"col-md-6\">\n");
      out.write("\t\t\t <div style=\"margin-left:30px;\">\n");
      out.write("\t\t\t  <img src=\"img/2.jpg\" class=\"thumbnail\" style=\"float:left; width:450px; height:370px;\">\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t </div><br><br><br>\n");
      out.write("            \n");
      out.write("             <div class=\"col-md-6 \">\t\t\t\t\n");
      out.write("                \n");
      out.write("                 <div class=\"col-md-12\" style=\"overflow-y: scroll\">\n");
      out.write("                                    <b>");
      out.print(rs.getString(3));
      out.write("</b><br>\n");
      out.write("                                                </div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("        </div>\n");
      out.write("\t\t</div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("   <br><br>\n");
      out.write("   <center> WE WELOCOME YOUR FEEDBACKS FOR THE IMPROVEMENTS OF GOVERNANCE  </center>\n");
      out.write("   <div class=\"container\">\n");
      out.write("\t\t\t\n");
      out.write("            <br><br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-6 col-md-offset-2\">\n");
      out.write("            <form role=\"form\" class=\"form-horizontal\" action=\"loginServlet\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>Email Address:</b></label>\n");
      out.write("                    <div class=\"col-md-9\">\n");
      out.write("                       <input type=\"text\" class=\"form-control\" id=\"uname\" name=\"email\" maxlength=\"40\" placeholder=\"Email/Adhar No\"/>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"uname\" class=\"control-label col-md-3\" required><b>Comment:</b></label>\n");
      out.write("                    <div class=\"col-md-9\">\n");
      out.write("                      \n");
      out.write("                        <textarea name=\"cmnts\"  rows=\"5\" cols=\"37\"\">\n");
      out.write("                            \n");
      out.write("                        </textarea>\n");
      out.write("                        \n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("\t\t\t\t\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"btn col-md-3 col-md-offset-6\"  style=\"color:white;background-color:#9ACD32\"><b><input type=\"submit\" value=\"Comment\"></b></div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("\t\t\t</div><br><br>\n");
      out.write("\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("   \n");
      out.write("      \n");
      out.write("   <br><br><br><br><br>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</b>\n");
      out.write("\t</font>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    \n");
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
