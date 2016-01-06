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
public class testvoterlogin extends HttpServlet {
   
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
           String l= "Select *from tvlogin;";
            ResultSet rs1=dao.DBService.selectData(l);
           // String q="select *from voter;";
          // ResultSet rs=dao.DBService.selectData(q);

        while(rs1.next() ){
            String vid1=rs1.getString("vid");
            String pass1=rs1.getString(2);
            String q="select *from voter;";
           ResultSet rs=dao.DBService.selectData(q);
           while(rs.next())
           {
           String vid2=rs.getString(1);
           String pass2=rs.getString(13);
           if((vid1.contentEquals(vid2))&& (pass2.contentEquals(pass1)))
           {
           String q1="insert into rtestcase1 (vid,pass,result) values ('"+vid2+"','"+pass2+"','"+"yes"+"');";
           int r=dao.DBService.updateData(q1);
           if(r==1)
           {
           String q3="insert into testcaseresult1 values ();";
           int r1=dao.DBService.updateData(q3);
           }
           }}
           while(rs1.next()){

               String vid2=rs.getString(1);
               String pass2=rs.getString(13);
 if((vid1!=vid2)&&(pass1!=pass2))
           {
 String q2="insert into rtestcase1 (vid,pass,result) values ('"+vid1+"','"+pass1+"','"+"no"+"');";
 int w=dao.DBService.updateData(q2);
 if(w==1)
 {
 String q4="insert into testcaseresult2 values ();";
 int r2=dao.DBService.updateData(q4);
 }
 }
                }
            }
            
            out.println("<html>");out.println("<head>");out.println("<font color='#0FFFFF'>you have comlete your testing process</font><br>");out.println("</head>");
            out.println("<body bgcolor='#009FFF'>");
            out.print("click here to the result:-");
            out.print("<a href='voterlogintestresult'>click");out.print("</a>");
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
            Logger.getLogger(testvoterlogin.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(testvoterlogin.class.getName()).log(Level.SEVERE, null, ex);
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
