package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
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
      out.write("\t\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write(" <nav id=\"tf-menu\" class=\"navbar navbar-default navbar-fixed-top\" style=\"background-color:#9ACD32\">\n");
      out.write("\t\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        \n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling --><style>.paging{background-color:grey; color:black;}</style>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <li class=\"paging\"><a href=\"index.jsp\" class=\"page-scroll\">Home</a></li>          \n");
      out.write("            <li><a href=\"aboutUs.jsp\" class=\"page-scroll\">About Us</a></li>\n");
      out.write("            <li><a href=\"news.jsp\" class=\"page-scroll\">News</a></li>           \n");
      out.write("            <li><a href=\"services.jsp\" class=\"page-scroll\">Services</a></li>\n");
      out.write("\t\t\t<li><a href=\"login.jsp\" class=\"page-scroll\">Login</a></li>\n");
      out.write("\t\t\t<li><a href=\"register.jsp\" class=\"page-scroll\">Register</a></li>\n");
      out.write("\t\t\t<li><a href=\"contactUs.jsp\" class=\"page-scroll\">Contact</a></li>\n");
      out.write("                        <li><a href=\"suggestionPage.jsp\" class=\"page-scroll\">Suggest Us</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"accountDetails.jsp\" class=\"page-scroll\"> <b style=\"font-family: cursive; color: #761c19\">Welcome  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  </b></a></li>\n");
      out.write("                        ");

                            String user = (String)session.getAttribute("user");
                             if(user!=null){
                        
      out.write("\n");
      out.write("                        <li><a href=\"logout.jsp\" class=\"page-scroll\"> <b style=\"font-family: cursive; color: #761c19\">logout</b></a></li>\n");
      out.write("                         ");
 }
      out.write("\n");
      out.write("\t</ul>           \n");
      out.write("        </div>         \n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <br><br><br><br>\n");
      out.write("</body>\n");
      out.write("</html>  \n");
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
