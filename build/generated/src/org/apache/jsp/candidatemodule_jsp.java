package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidatemodule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body BGCOLOR=\"LIGHTGREEN\">\n");
      out.write("\n");
      out.write("        <font color=\"blue\">\n");
      out.write("     <center><h2>CANDIDATE HOME </h2></center></hr>\n");
      out.write("        </font>\n");
      out.write("         <table align=\"right\" bgcolor=\"lightred\" border=\"2\">\n");
      out.write("            <tr><td>\n");
      out.write("        <form action=\"action1.jsp\" method=\"post\">\n");
      out.write("            <input type=\"submit\" value=\"LOGOUT\">\n");
      out.write("        </form></tr></td></table>\n");
      out.write(" <table align=\"left\" bgcolor=\"lightyellow\" border=\"2\">\n");
      out.write("            <tr><td>\n");
      out.write("        <form action=\"updatecandidate.jsp\" >\n");
      out.write("\n");
      out.write("            <input type=\"submit\" name=\"update\" value=\"UPDATE ACCOUNT\">\n");
      out.write("            </td></tr></table>\n");
      out.write("        </form>\n");
      out.write("        <table align=\"center\" bgcolor=\"lightsky\" border=\"2\">\n");
      out.write("            <tr><td>\n");
      out.write("\n");
      out.write("        <form action=\"addandeditpromises.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("            <input type=\"submit\"  value=\"ADD and EDIT PROMISES\">\n");
      out.write("        </form></td></tr></table>\n");
      out.write("                    <table align=\"lefr\" bgcolor=\"lightyellow\" border=\"2\">\n");
      out.write("            <tr><td>\n");
      out.write("        <form action=\"answer\" method=\"post\">\n");
      out.write("\n");
      out.write("            <input type=\"submit\"  value=\"READ QUESTIONS\"/></form></td></tr></table>\n");
      out.write("       \n");
      out.write("             <form action=\"giveanswer.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("            <input type=\"submit\"  value=\"ANSWER QUESTIONS\"/></form>\n");
      out.write("       \n");
      out.write("                \n");
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
