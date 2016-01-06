package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class votermodule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#9FFFF8\" border=\"3\">\n");
      out.write("        \n");
      out.write("        <font color=\"blue\">\n");
      out.write("     <center><h2>VOTER HOME </h2></center>\n");
      out.write("        </font>\n");
      out.write(" <table align=\"right\" border=\"2\">\n");
      out.write("     <tr><td><form action=\"action1.jsp\" method=\"post\">\n");
      out.write("         ");
session.invalidate();
      out.write("\n");
      out.write("     <input type=\"submit\" value=\"logout\">\n");
      out.write("     </form>\n");
      out.write("\n");
      out.write("         </td></tr></table><table align=\"left\" bgcolor=\"#FFF8FF\" border=\"2\">\n");
      out.write("             <tr><td> <form action=\"updatevoter.jsp\" >\n");
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"update\" value=\"UPDATE ACCOUNT\">\n");
      out.write("        </form></td></tr></table>\n");
      out.write("        <table align=\"center\" bgcolor=\"pink\" border=\"2s\" >\n");
      out.write("            <tr><td>\n");
      out.write("     <form action=\"candidateinfo.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"viewcandi\" value=\"CANDIDATE INFORMATION \">\n");
      out.write("     </form><td></tr></table>\n");
      out.write("     <table align=\"left\" border=\"2\" bgcolor=\"#01FF99\"><tr><td>\n");
      out.write("        <form action=\"result.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"result\" value=\"ELECTION RESULT\">\n");
      out.write("        </form></td></tr></table><br><br>\n");
      out.write("     <table align=\"left\" border=\"2\" bgcolor=\"#01FF99\"><tr><td>\n");
      out.write("        <form action=\"askquestion.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"ask\" value=\"ASK QUESTION\">\n");
      out.write("        </form></td></tr>\n");
      out.write("     </table><br><br><br>\n");
      out.write("        CLICK HERE FOR CAST THE VOTE : <a href=\"votinghomepage.jsp\"> -> </a>\n");
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
