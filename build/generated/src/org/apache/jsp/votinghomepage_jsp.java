package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class votinghomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <hr>\n");
      out.write("    <marquee direction=\"right\" ><h1>ONLINE VOTING HOME PAGE</h1></marquee>\n");
      out.write("    <hr>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"votinglist.jsp\" method=\"post\">\n");
      out.write("    <table align=\"left\" bgcolor=\"pink\" border=\"2\">\n");
      out.write("            <td>\n");
      out.write("                \n");
      out.write("                   LOGIN ID: <input type=\"text\"name=\"vid\"><br>\n");
      out.write("                   LOGIN PASSWORD:<input type=\"password\" name=\"hashpass\"><br>\n");
      out.write("                   <input type=\"submit\" name=\"submit\" value=\"SUBMIT\"><br>\n");
      out.write("                <input type=\"reset\" name=\"reset\" value=\"RESET\">\n");
      out.write("               \n");
      out.write("            </td>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("     </form>\n");
      out.write("    </body>\n");
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
