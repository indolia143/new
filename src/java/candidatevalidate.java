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
public class candidatevalidate extends HttpServlet {
   
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
            String username=request.getParameter("username");
            if(username!=null)
            {

            String newpass = request.getParameter("pass");
            for(int i=1;i<=newpass.length();i++)
            {

            c++;
            }
            if(c<5)
            {
            out.println("please rnter more than 4 password charecter");


            }
 else
            {
                String id=request.getParameter("id");
            String q1="select *from candidate where pass="+newpass+" and vid="+id+";";
            ResultSet rs=dao.DBService.selectData(q1);
            if(rs.next())
            {
           String pass1=rs.getString(13);

           if(pass1.equals(newpass))
           {
           RequestDispatcher rs1=request.getRequestDispatcher("candidatemodule.jsp");
             rs1.forward(request, response);
           }
           else
           {
               RequestDispatcher rs1=request.getRequestDispatcher("testscriptforlogincandidate.jsp");
             rs1.forward(request, response);


            }

            }
 else
            {
     RequestDispatcher rs1=request.getRequestDispatcher("testscriptforlogincandidate.jsp");
             rs1.forward(request, response);

 }
            }
            }
 else
            {


            String newpass = request.getParameter("pass");
            for(int i=1;i<=newpass.length();i++)
            {

            c++;
            }
            if(c<5)
            {
            out.println("please rnter more than 4 password charecter");


            }
 else
            {
                String id=request.getParameter("id");
            String q1="select *from candidate where pass="+newpass+" and vid="+id+";";
            ResultSet rs=dao.DBService.selectData(q1);
            if(rs.next())
            {
           String pass1=rs.getString(13);

           if(pass1.equals(newpass))
           {
           RequestDispatcher rs1=request.getRequestDispatcher("candidatemodule.jsp");
             rs1.forward(request, response);
           }
           else
           {
               RequestDispatcher rs1=request.getRequestDispatcher("candidatelogin.jsp");
             rs1.forward(request, response);


            }

            }
 else
            {
     RequestDispatcher rs1=request.getRequestDispatcher("candidatelogin.jsp");
             rs1.forward(request, response);

 }
            }}
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
            Logger.getLogger(candidatevalidate.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(candidatevalidate.class.getName()).log(Level.SEVERE, null, ex);
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
