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
public class testcandidateupdate extends HttpServlet {
   
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
             String l="select *from ucandidate;";
            ResultSet rs1=dao.DBService.selectData(l);
            while(rs1.next())
            {
             String cid1=rs1.getString("cid");
            String pass1=rs1.getString("pass");
            String cpass1=rs1.getString("cpass");
           String q="select *from candidate;";
           ResultSet rs=dao.DBService.selectData(q);
           while(rs.next())
           {
           String cid2=rs.getString(1);
           String pass2=rs.getString(14);
           if((cid2.equals(cid1))&& (pass2.equals(pass1))&&(pass2.equals(cpass1)))
           {
           String q1="insert into uctestcase1 (cid,pass,cpass,result) values ('"+cid1+"','"+pass1+"','"+cpass1+"','"+"yes"+"');";
           int r=dao.DBService.updateData(q1);
           if(r==1)
           {
           String q3="insert into ucvalidtest1 values ();";
           int r1=dao.DBService.updateData(q3);
           }
           }
 else
           {
 String q2="insert into  uctestcase1  (cid,pass,cpass,result) values ('"+cid1+"','"+pass1+"',"+cpass1+",'"+"no"+"');";
 int w=dao.DBService.updateData(q2);
 if(w==1)
 {
 String q4="insert into ucinvalid1 values ();";
 int r2=dao.DBService.updateData(q4);
 }
 }
                }
            }

            out.println("<html>");out.println("<head>");out.println("<font color='#0FFFFF'>you have comlete your testing process</font><br>");out.println("</head>");
            out.println("<body bgcolor='#009FFF'>");
            out.print("click here to the result:-");
            out.print("<a href='cupdatetestresult'>click");out.print("</a>");
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
            Logger.getLogger(testcandidateupdate.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(testcandidateupdate.class.getName()).log(Level.SEVERE, null, ex);
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
