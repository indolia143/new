package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class voterlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function checkPassword(str)\n");
      out.write("    { var re = /^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])\\w{4,}$/; return re.test(str); }\n");
      out.write("    function checkForm(form) { \n");
      out.write("        if(form.pass.value != \"\" && form.pass.value == form.pwd2.value)\n");
      out.write("        { if(!checkPassword(form.pass.value)) { alert(\"The password you have entered is not valid!\");\n");
      out.write("                form.pass.focus(); return false; } }\n");
      out.write("        else\n");
      out.write("        { alert(\"Error: Please check that you've entered and confirmed your password!\");\n");
      out.write("            form.pass.focus(); return false; } return true; }\n");
      out.write("</script>\n");
      out.write("<body bgcolor=\"#00FFFF\" bottommargin=\"6\"><center>-:VOTER LOGIN PAGE:-</center><br><br><br><br>\n");
      out.write("         <table align=\"center\" bgcolor=\"lightgreen\" border=\"2\"><tr>\n");
      out.write("<form method=\"POST\" action=\"votervalidate\" onSubmit=\"return checkForm(this);\">\n");
      out.write("    <tr><td>  Voter ID:<td><input type=\"text\" name=\"id\"/></td></td></tr>\n");
      out.write("             <tr>\n");
      out.write("        <p> <td>Enter Password:<td> <input type=\"password\" name=\"pass\" maxlength=\"10\" requiredplaceholder=\"pass should contain\n");
      out.write("                                           atleast one small,capital latter& no \"></td></td></p></tr>\n");
      out.write("        <tr> <p><td>confirm Password:<td> <input type=\"password\" name=\"pwd2\" maxlength=\"10\"></td></td></p></tr>\n");
      out.write("     \n");
      out.write("     <tr><td> <p><input type=\"submit\" value=\"login\"></p></td><td><input type=\"reset\" value=\"reset\"/></td></tr> </form></tr></table>\n");
      out.write(" </body>");
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
