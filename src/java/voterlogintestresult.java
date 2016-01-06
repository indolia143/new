/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kkyd
 */
public class voterlogintestresult extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet voterlogintestresult</title>");  
            out.println("</head>");
            out.println("<body>");
           
            out.println("<h1><font color='lightgreen'><center>-:VOTER LOGIN TEST RESULT:-</center></fon></h1>");
            out.println("<center><table border='2' bgcolor='lightpink' rowspace='2' colspace='2' width='500' height='500' >");
            out.print("<tr><td><font color='green'>-:vid:-</font></td><td><font color='green'>-:password:-</font></td><td><font color='green'>-:test result:-</font></td>");
            out.print("<td><font color='green'>-: True vid:-</font></td><td><font color='green'>-:True password:-</font></td></tr>");
            String q="select *from rtestcase1;";
              ResultSet rs=dao.DBService.selectData(q);
            
            String q1="select *from voter;";
          
            ResultSet rs1=dao.DBService.selectData(q1);
            while(rs.next()&&rs1.next())
            {
            String vid=rs.getString("vid");
            String pass=rs.getString("pass");
             String result=rs.getString("result"); 
            String vid1=rs1.getString("vid");
            String pass1=rs1.getString("pass");

            out.print("<tr>");
            out.print("<td>"+vid+"</td>");out.print("<td>"+pass+"</td>");out.print("<td>"+result+"</td>");
             if((vid.contentEquals(vid1))&&(pass.contentEquals(pass1)))
            {

            out.print("<td>"+vid1+"</td>");out.print("<td>"+pass1+"</td>");
            
                }

                
            out.print("</tr>");
            }

out.print("</table></center>");out.println("<br>please click here to check the final test result:");
out.println("<a href='vfinaltestresult' target='parent'>clickhere</a>");

            out.println("</body>");
            out.println("</html>");
          
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(voterlogintestresult.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(voterlogintestresult.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
