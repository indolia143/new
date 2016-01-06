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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kkyd
 */
public class candidateinformation extends HttpServlet {
   
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
             String fname=request.getParameter("fname");
            String lname=request.getParameter("lname");
           String q="select *from candidate where fname="+fname+" and lname="+lname+";";
        ResultSet rs=dao.DBService.selectData(q);
          
           if(rs.next())
           {
           String faname=rs.getString(4);
           String sex=rs.getString(5);
            String address=rs.getString(7);
             String category=rs.getString(10);
              String pid=rs.getString(15);
              out.print("<html>");
              out.print("<body bgcolor='lightgreen'> ");
              out.print("Father name is:"+faname);
              out.print("<br>");
              out.print("Gender is:"+sex);
               out.print("<br>");
              out.print("Address of candidate is:"+address);
               out.print("<br>");
              out.print("Category of candidate is:"+category);
               out.print("<br>");
              out.print("Party id is:"+pid);
               out.print("<br>");
              out.print("</body>");
              out.print("</html>");
           }
 else
           {
  RequestDispatcher rs1=request.getRequestDispatcher("votermodule.jsp");
             rs1.forward(request, response);

 }
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
            Logger.getLogger(candidateinformation.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(candidateinformation.class.getName()).log(Level.SEVERE, null, ex);
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
