/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kkyd
 */
public class updatecandidate extends HttpServlet {
   
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String newpass = request.getParameter("newpass");
           int c=0;
             for(int i=1;i<=newpass.length();i++)
                 {
                 c++;
            }
                 if(c<5)
                 {
                 out.print("please enter more than 4 charecter in new pass");
                 }
 else
                 {
            String oldpass=request.getParameter("oldpass");
            String cid=request.getParameter("cid");
            String q1="select *from candidate where pass='"+oldpass+"';";
            ResultSet rs=dao.DBService.selectData(q1);
          
            if(rs.next())
            {
           String pass1=rs.getString(14);
           out.print(pass1);

           if(pass1.equals(oldpass))
           {

           String r="update candidate set pass='"+newpass+"' where cid="+cid+"; ";
           
                    int rs1=dao.DBService.updateData(r);
                    out.print(rs1);
          out.print("PASSWORD CHANGED SUCCESSFULLY");
           }
           else
           {
               out.print("please enter the correct old password....!!!");
               out.print("<a href='updatecandidate.jsp'>CLICK HERE</a>");


            }

            }
            }
        }catch(Exception weeewew)
        {
         out.print(weeewew.getMessage());
        }
         finally { 
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
        processRequest(request, response);
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
        processRequest(request, response);
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
