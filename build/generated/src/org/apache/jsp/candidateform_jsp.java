package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class candidateform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body bgcolor=\"silver\">\n");
      out.write("    <form action=\"candidate\" method=\"post\">\n");
      out.write("    <font color=\"green\">\n");
      out.write("        <center><h2><u>CANDIDATE REGISTRATION FORM</u></h2></center><BR>\n");
      out.write("            <h4>please fill correct information in the fields:</h4>\n");
      out.write("    </font>\n");
      out.write("<table width=\"862\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <!--DWLayoutTable-->\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"11\" height=\"24\">&nbsp;</td>\n");
      out.write("    <td width=\"131\" valign=\"top\">FIRST NAME : </td>\n");
      out.write("    <td width=\"199\" valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"text\" name=\"fname\" />\n");
      out.write("        </label>\n");
      out.write("     </td>\n");
      out.write("    <td width=\"120\" valign=\"top\">LAST NAME: </td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"text\" name=\"lname\" />\n");
      out.write("        </label>\n");
      out.write("       </td>\n");
      out.write("    <td width=\"125\">&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"29\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">DATE OF BIRTH:</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("             <select name=\"month\" onchange=\"return wait_for_load(this, event, function() { editor_date_month_change(this, 'birthday_day','birthday_year'); });\">\n");
      out.write("<option value=\"na\">Month</option>\n");
      out.write("<option value=\"1\">January</option>\n");
      out.write("<option value=\"2\">February</option>\n");
      out.write("<option value=\"3\">March</option>\n");
      out.write("<option value=\"4\">April</option>\n");
      out.write("<option value=\"5\">May</option>\n");
      out.write("<option value=\"6\">June</option>\n");
      out.write("<option value=\"7\">July</option>\n");
      out.write("<option value=\"8\">August</option>\n");
      out.write("<option value=\"9\">September</option>\n");
      out.write("<option value=\"10\">October</option>\n");
      out.write("<option value=\"11\">November</option>\n");
      out.write("<option value=\"12\">December</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<select name=\"day\">\n");
      out.write("<option value=\"na\">Day</option>\n");
      out.write("<option value=\"1\">1</option>\n");
      out.write("<option value=\"2\">2</option>\n");
      out.write("<option value=\"3\">3</option>\n");
      out.write("<option value=\"4\">4</option>\n");
      out.write("<option value=\"5\">5</option>\n");
      out.write("<option value=\"6\">6</option>\n");
      out.write("<option value=\"7\">7</option>\n");
      out.write("<option value=\"8\">8</option>\n");
      out.write("<option value=\"9\">9</option>\n");
      out.write("<option value=\"10\">10</option>\n");
      out.write("<option value=\"11\">11</option>\n");
      out.write("<option value=\"12\">12</option>\n");
      out.write("<option value=\"13\">13</option>\n");
      out.write("<option value=\"14\">14</option>\n");
      out.write("<option value=\"15\">15</option>\n");
      out.write("<option value=\"16\">16</option>\n");
      out.write("<option value=\"17\">17</option>\n");
      out.write("<option value=\"18\">18</option>\n");
      out.write("<option value=\"19\">19</option>\n");
      out.write("<option value=\"20\">20</option>\n");
      out.write("<option value=\"21\">21</option>\n");
      out.write("<option value=\"22\">22</option>\n");
      out.write("<option value=\"23\">23</option>\n");
      out.write("<option value=\"24\">24</option>\n");
      out.write("<option value=\"25\">25</option>\n");
      out.write("<option value=\"26\">26</option>\n");
      out.write("<option value=\"27\">27</option>\n");
      out.write("<option value=\"28\">28</option>\n");
      out.write("<option value=\"29\">29</option>\n");
      out.write("<option value=\"30\">30</option>\n");
      out.write("<option value=\"31\">31</option>\n");
      out.write("</select>\n");
      out.write("<select name=\"year\">\n");
      out.write("<option value=\"na\">Year</option>\n");
      out.write("<option value=\"2009\">2009</option>\n");
      out.write("<option value=\"2008\">2008</option>\n");
      out.write("<option value=\"2007\">2007</option>\n");
      out.write("<option value=\"2006\">2006</option>\n");
      out.write("<option value=\"2005\">2005</option>\n");
      out.write("<option value=\"2004\">2004</option>\n");
      out.write("<option value=\"2003\">2003</option>\n");
      out.write("<option value=\"2002\">2002</option>\n");
      out.write("<option value=\"2001\">2001</option>\n");
      out.write("<option value=\"2000\">2000</option>\n");
      out.write("<option value=\"1999\">1999</option>\n");
      out.write("<option value=\"1998\">1998</option>\n");
      out.write("<option value=\"1997\">1997</option>\n");
      out.write("<option value=\"1996\">1996</option>\n");
      out.write("<option value=\"1995\">1995</option>\n");
      out.write("<option value=\"1994\">1994</option>\n");
      out.write("<option value=\"1993\">1993</option>\n");
      out.write("<option value=\"1992\">1992</option>\n");
      out.write("<option value=\"1991\">1991</option>\n");
      out.write("<option value=\"1990\">1990</option>\n");
      out.write("<option value=\"1989\">1989</option>\n");
      out.write("<option value=\"1988\">1988</option>\n");
      out.write("<option value=\"1987\">1987</option>\n");
      out.write("<option value=\"1986\">1986</option>\n");
      out.write("<option value=\"1985\">1985</option>\n");
      out.write("<option value=\"1984\">1984</option>\n");
      out.write("<option value=\"1983\">1983</option>\n");
      out.write("<option value=\"1982\">1982</option>\n");
      out.write("<option value=\"1981\">1981</option>\n");
      out.write("<option value=\"1980\">1980</option>\n");
      out.write("<option value=\"1979\">1979</option>\n");
      out.write("<option value=\"1978\">1978</option>\n");
      out.write("<option value=\"1977\">1977</option>\n");
      out.write("<option value=\"1976\">1976</option>\n");
      out.write("<option value=\"1975\">1975</option>\n");
      out.write("<option value=\"1974\">1974</option>\n");
      out.write("<option value=\"1973\">1973</option>\n");
      out.write("<option value=\"1972\">1972</option>\n");
      out.write("<option value=\"1971\">1971</option>\n");
      out.write("<option value=\"1970\">1970</option>\n");
      out.write("<option value=\"1969\">1969</option>\n");
      out.write("<option value=\"1968\">1968</option>\n");
      out.write("<option value=\"1967\">1967</option>\n");
      out.write("<option value=\"1966\">1966</option>\n");
      out.write("<option value=\"1965\">1965</option>\n");
      out.write("<option value=\"1964\">1964</option>\n");
      out.write("<option value=\"1963\">1963</option>\n");
      out.write("<option value=\"1962\">1962</option>\n");
      out.write("<option value=\"1961\">1961</option>\n");
      out.write("<option value=\"1960\">1960</option>\n");
      out.write("<option value=\"1959\">1959</option>\n");
      out.write("<option value=\"1958\">1958</option>\n");
      out.write("<option value=\"1957\">1957</option>\n");
      out.write("<option value=\"1956\">1956</option>\n");
      out.write("<option value=\"1955\">1955</option>\n");
      out.write("<option value=\"1954\">1954</option>\n");
      out.write("<option value=\"1953\">1953</option>\n");
      out.write("<option value=\"1952\">1952</option>\n");
      out.write("<option value=\"1951\">1951</option>\n");
      out.write("<option value=\"1950\">1950</option>\n");
      out.write("<option value=\"1949\">1949</option>\n");
      out.write("<option value=\"1948\">1948</option>\n");
      out.write("<option value=\"1947\">1947</option>\n");
      out.write("<option value=\"1946\">1946</option>\n");
      out.write("<option value=\"1945\">1945</option>\n");
      out.write("<option value=\"1944\">1944</option>\n");
      out.write("<option value=\"1943\">1943</option>\n");
      out.write("<option value=\"1942\">1942</option>\n");
      out.write("<option value=\"1941\">1941</option>\n");
      out.write("<option value=\"1940\">1940</option>\n");
      out.write("<option value=\"1939\">1939</option>\n");
      out.write("<option value=\"1938\">1938</option>\n");
      out.write("<option value=\"1937\">1937</option>\n");
      out.write("<option value=\"1936\">1936</option>\n");
      out.write("<option value=\"1935\">1935</option>\n");
      out.write("<option value=\"1934\">1934</option>\n");
      out.write("<option value=\"1933\">1933</option>\n");
      out.write("<option value=\"1932\">1932</option>\n");
      out.write("<option value=\"1931\">1931</option>\n");
      out.write("<option value=\"1930\">1930</option>\n");
      out.write("<option value=\"1929\">1929</option>\n");
      out.write("<option value=\"1928\">1928</option>\n");
      out.write("<option value=\"1927\">1927</option>\n");
      out.write("<option value=\"1926\">1926</option>\n");
      out.write("<option value=\"1925\">1925</option>\n");
      out.write("<option value=\"1924\">1924</option>\n");
      out.write("<option value=\"1923\">1923</option>\n");
      out.write("<option value=\"1922\">1922</option>\n");
      out.write("<option value=\"1921\">1921</option>\n");
      out.write("<option value=\"1920\">1920</option>\n");
      out.write("<option value=\"1919\">1919</option>\n");
      out.write("<option value=\"1918\">1918</option>\n");
      out.write("<option value=\"1917\">1917</option>\n");
      out.write("<option value=\"1916\">1916</option>\n");
      out.write("<option value=\"1915\">1915</option>\n");
      out.write("<option value=\"1914\">1914</option>\n");
      out.write("<option value=\"1913\">1913</option>\n");
      out.write("<option value=\"1912\">1912</option>\n");
      out.write("<option value=\"1911\">1911</option>\n");
      out.write("<option value=\"1910\">1910</option>\n");
      out.write("<option value=\"1909\">1909</option>\n");
      out.write("</select>\n");
      out.write("        </label>\n");
      out.write("    </td>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <td height=\"29\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">EMAIL ID: </td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"email\" name=\"email\"pattern=\"^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(.\\w{2,3})+$\" required placeholder=\"Enter a valid email address\"/>\n");
      out.write("        </label>\n");
      out.write("    </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"23\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">FATHER'S NAME: </td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"text\" name=\"faname\" />\n");
      out.write("        </label>\n");
      out.write("   </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"26\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">ADDRESS:</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"text\" name=\"address\" />\n");
      out.write("        </label>\n");
      out.write("     </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"26\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\"> </td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        \n");
      out.write("        </label>\n");
      out.write("       </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"26\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">PASSWORD:</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("          <input type=\"PASSWORD\" name=\"pass\" maxlength=\"10\" />\n");
      out.write("        </label>\n");
      out.write("       </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"24\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\"> </td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("       \n");
      out.write("        </label>\n");
      out.write("      </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"23\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">PARTY ID : </td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"text\" name=\"pid\" />\n");
      out.write("        </label>\n");
      out.write("       </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"25\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">MOBILE NO: </td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"text\" name=\"mobno\" />\n");
      out.write("        </label>\n");
      out.write("       </td>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("   <td height=\"26\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">SEX:</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("     \n");
      out.write("        <label>\n");
      out.write("          <input type=\"radio\" name=\"sex\" value=\"male\" />\n");
      out.write("          male</label>\n");
      out.write("        <label>\n");
      out.write("        <input type=\"radio\" name=\"sex\" value=\"female\" />\n");
      out.write("female</label>\n");
      out.write("<br />\n");
      out.write("        <label></label>\n");
      out.write("        <br />\n");
      out.write("      </p>\n");
      out.write("      </td>\n");
      out.write("   \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td height=\"26\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">STATUS:</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      \n");
      out.write("        <label>\n");
      out.write("          <input type=\"radio\" name=\"status\" value=\"married\" />\n");
      out.write("          married</label>\n");
      out.write("        <label>\n");
      out.write("        <input type=\"radio\" name=\"status\" value=\"unmarried\" />\n");
      out.write("unmarried</label>\n");
      out.write("<br />\n");
      out.write("        <label></label>\n");
      out.write("        <br />\n");
      out.write("      </p>\n");
      out.write("     </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"30\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">CATEGORY:</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("      <select name=\"category\">\n");
      out.write("        <option value=\"GENERAL\">GENERAL</option>\n");
      out.write("        <option value=\"OBC\">OBC</option>\n");
      out.write("        <option value=\"sc/st\">SC/ST</option>\n");
      out.write("        <option value=\"others\">others</option>\n");
      out.write("        </select>\n");
      out.write("        </label>\n");
      out.write("      </td>\n");
      out.write("    <td width=\"100\" valign=\"top\">IMAGE: </td>\n");
      out.write("    <td colspan=\"3\" valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"file\" name=\"imagepath\" />\n");
      out.write("        </label>\n");
      out.write("       </td>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"29\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">QUALIFICATION:</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <select name=\"qualification\">\n");
      out.write("          <option value=\"HIGH SCHOOL\">HIGH SCHOOL</option>\n");
      out.write("          <option value=\"INTERMIDIATE\">INTERMEDIATE</option>\n");
      out.write("          <option value=\"GRADUATE\">GRADUATE</option>\n");
      out.write("          <option value=\"POSTGRADUATE\">POSTGRADUATE</option>\n");
      out.write("        </select>\n");
      out.write("        </label>\n");
      out.write("       </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"29\">&nbsp;</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"submit\" name=\"submit\" value=\"SUBMIT\" />\n");
      out.write("        </label>\n");
      out.write("</td>\n");
      out.write("    <td valign=\"top\">\n");
      out.write("      <label>\n");
      out.write("        <input type=\"RESET\" name=\"reset\" value=\"RESET\" />\n");
      out.write("        </label>\n");
      out.write("    </td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"702\">&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("    <td>&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("    </form>\n");
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