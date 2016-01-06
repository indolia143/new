package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class scriptmodule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>Untitled Document</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("#Layer1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:396px;\n");
      out.write("\ttop:46px;\n");
      out.write("\twidth:1072px;\n");
      out.write("\theight:774px;\n");
      out.write("\tz-index:1;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body><center><caption><font color=\"#00FF00\" style=\"background-repeat:inherit\">-:TESTING SCRIPT MODULES LISTS:-</font></caption></center>\n");
      out.write("<div id=\"Layer1\">\n");
      out.write("  <dl>\n");
      out.write("    <form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("       <table width=\"49%\" border=\"2\" cellspacing=\"3\" cellpadding=\"4\">\n");
      out.write("         <tr>\n");
      out.write("           <th width=\"20%\" scope=\"col\">TEST SCRIPT NO </th>\n");
      out.write("           <th width=\"80%\" scope=\"col\">NAME OF MODULES FOR TEST SCRIPT </th>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("           <th scope=\"row\"><a href=\"testvoterlogin\">1</a></th>\n");
      out.write("           <td>VOTER LOGIN </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("\n");
      out.write("           <th scope=\"row\"><a href=\"testcandidatelogin\" target=\"_blank\">2</a></th>\n");
      out.write("           <td>CANDIDATE LOGIN </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("           <th scope=\"row\"><a href=\"testscriptforadminlogin.jsp\" target=\"_blank\">3</a>&nbsp;</th>\n");
      out.write("           <td>ADMIN LOGIN </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("           <th scope=\"row\"><a href=\"testvoterupdate\" target=\"_blank\">4</a></th>\n");
      out.write("           <td>VOTER UPDATE ACCOUNT </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("           <th scope=\"row\"><a href=\"testcandidateupdate\" target=\"_blank\">5</a></th>\n");
      out.write("           <td>CANDIDATE UPDATE ACCOUNT </td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("           <th scope=\"row\"><a href=\"vtesttologinelectionday\" target=\"_blank\">6</a></th>\n");
      out.write("           <td>VOTER LOGIN DURING ELECTION</td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("           <th scope=\"row\">&nbsp;</th>\n");
      out.write("           <td>&nbsp;</td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("           <th scope=\"row\">&nbsp;</th>\n");
      out.write("           <td>&nbsp;</td>\n");
      out.write("         </tr>\n");
      out.write("         <tr>\n");
      out.write("           <th scope=\"row\">&nbsp;</th>\n");
      out.write("           <td>&nbsp;</td>\n");
      out.write("         </tr>\n");
      out.write("      </table>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("    <dt>&nbsp;</dt>\n");
      out.write("  </dl>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
