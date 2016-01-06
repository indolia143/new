package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class b_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\n");
      out.write("\n");
      out.write("<body bgcolor=\"orange\">\n");
      out.write("<!--  To change this template, choose Tools | Templates  and open the template in the editor.  -->\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<br />\n");
      out.write("<form action=\"register.jsp\">\n");
      out.write("<input type=\"submit\" name=\"VREG\" value=\"REGISTER NOW\"/>\n");
      out.write("</form>\n");
      out.write("<form action=\"voterlogin.jsp\" method=\"post\" >\n");
      out.write("    <input type=\"submit\" value=\"VOTER LOGIN\"/>\n");
      out.write("</form>\n");
      out.write("<form action=\"candidatelogin.jsp\">\n");
      out.write("    <input type=\"submit\" value=\"CANDIDATE LOGIN\"/>\n");
      out.write("</form>\n");
      out.write("<form action=\"adminlogin.jsp\">\n");
      out.write("    <input type=\"submit\" value=\"ADMIN LOGIN\"/>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("  <h4><U> CONTACT FOR MORE INFORMATION:</U></h4>\n");
      out.write("  <table width=\"330\">\n");
      out.write("    <!--DWLayoutTable-->\n");
      out.write("    <tr>\n");
      out.write("      <td> 1.AJAY SINGH:</td>\n");
      out.write("      <td>09634473389</td>\n");
      out.write("      <td width=\"24\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td> 2.AMIT KUMAR SHARMA:</td>\n");
      out.write("      <td>09997408909</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td> 3.ANANT GARG:</td>\n");
      out.write("      <td>09760346314</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td> 4.DHARMENDRA SINGH:</td>\n");
      out.write("      <td>07500609488</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("  </table>\n");
      out.write("  <br/>\n");
      out.write("  <h4>FOR MORE INFORMATION LOGIN:</h4>\n");
      out.write("  <h2> <em> <a href=\"www.indolia143@gmail.com\">www.indolia143@gmail.com</a></em></h2>\n");
      out.write("</body>\n");
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
