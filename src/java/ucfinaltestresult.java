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
public class ucfinaltestresult extends HttpServlet {
   
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
               int c=0;
           int c1=0;

            String q="select *from ucvalidtest1;";
           ResultSet rs=dao.DBService.selectData(q);

            while(rs.next())
            {

           String result1=rs.getString(1);
            c=Integer.parseInt(result1);
            }
            String q1="select *from ucinvalid1;";
            ResultSet rs1=dao.DBService.selectData(q1);

            while(rs1.next())
            {
            String result2=rs1.getString(1);
            c1=Integer.parseInt(result2);
            }

out.println("<font color='lightgreen' size='10'>total no of correct test case result:</font>"+" "+"<font size='10'>"+c+"</font><br>");
out.println("<font color='lightgreen' size='10'>total no of wrong test case result:</font>"+"<font size='10'>"+c1+"</font><br>");
           out.println("<font color='lightgreen' size='10'>total correct case %:</font>"+" "+"<font size='10'>"+ (c*100)/(c1+c)+"</font><br>");
            out.println("<font color='lightgreen' size='10'>total fail case %:</font>"+" "+"<font size='10'>"+(c1*100)/(c1+c)+"</font><br>");
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
            Logger.getLogger(ucfinaltestresult.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ucfinaltestresult.class.getName()).log(Level.SEVERE, null, ex);
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
