package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body>\n");
      out.write("<form   method=\"post\" action=\"voteresult\">\n");
      out.write("  <label>ENTER SELECT THE RESULT YEAR:\n");
      out.write("  <select  name=\"year\">\n");
      out.write("    <option value=\"1990\">1990</option>\n");
      out.write("    <option value=\"1991\">1991</option>\n");
      out.write("    <option value=\"1992\">1992</option>\n");
      out.write("    <option value=\"1993\">1993</option>\n");
      out.write("    <option value=\"1994\">1994</option>\n");
      out.write("    <option value=\"1995\">1995</option>\n");
      out.write("    <option value=\"1996\">1996</option>\n");
      out.write("    <option value=\"1997\">1997</option>\n");
      out.write("    <option value=\"1998\">1998</option>\n");
      out.write("    <option value=\"1999\">1999</option>\n");
      out.write("    <option value=\"2000\">2000</option>\n");
      out.write("    <option value=\"2001\">2001</option>\n");
      out.write("    <option value=\"2002\">2002</option>\n");
      out.write("    <option value=\"2003\">2003</option>\n");
      out.write("    <option value=\"2004\">2004</option>\n");
      out.write("    <option value=\"2005\">2005</option>\n");
      out.write("    <option value=\"2006\">2006</option>\n");
      out.write("    <option value=\"2007\">2007</option>\n");
      out.write("    <option value=\"2008\">2008</option>\n");
      out.write("    <option value=\"2009\">2009</option>\n");
      out.write("    <option value=\"2010\">2010</option>\n");
      out.write("    <option value=\"2011\">2011</option>\n");
      out.write("    <option value=\"2012\">2012</option>\n");
      out.write("    <option value=\"2013\">2013</option>\n");
      out.write("  </select>\n");
      out.write("  </label>\n");
      out.write("    <input type=\"submit\"  value=\"submit\"/>\n");
      out.write("</form>\n");
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
