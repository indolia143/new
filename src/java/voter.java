/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import dao.DBService;
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
 * @author indolia
 */
public class voter extends HttpServlet {

    

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
String mobno = request.getParameter("mobno");
for(int i=1;i<=(mobno.length());i++)
{
c1++;
}
if(c1<10)
{
out.print("please enter the valid 10 mobile numbers");
}
 else
{

String pass=request.getParameter("pass");

for(int i=1;i<=(pass.length());i++)
            {

            c++;
            }
            if(c<5)
            {
            out.println("please rnter more than 4  password charecter");


            }
 else
            {



                       String hashpass=request.getParameter("hashpass");


String pass2=("12"+hashpass);

        String fname = request.getParameter("fname");
              String lname = request.getParameter("lname");

               String faname = request.getParameter("faname");
                  String email = request.getParameter("email");
                     String imagepath = request.getParameter("imagepath");


                  String address = request.getParameter("address");
                    String status = request.getParameter("status");
                     String category = request.getParameter("category");
                      String sex = request.getParameter("sex");
                   String month= request.getParameter("month");
                   String day= request.getParameter("day");
                    String year= request.getParameter("year");
                         String dob= day+month+year;

        String  q = "insert into voter (fname,lname,faname,dob,sex,address,email,imagepath,category,mobno,status,pass,hashpass) values ('"+fname+"','"+lname+"','"+faname+"','"+dob+"','"+sex+"','"+address+"','"+email+"','"+imagepath+"','"+category+"','"+mobno+"','"+status+"','"+pass+"','"+pass2+"');";
       String q1="insert into tvlogin (fname,pass) values('"+fname+"','"+pass+"');";
        int  ps = dao.DBService.updateData(q);
        int ps1=dao.DBService.updateData(q1);
          if((ps==1)&& (ps1==1) )
          {
          out.print("<font size='5' color='blue'>Congrats, You are Registered successfully</font><br>");
          out.print(ps+" Row(s) inserted");
          String q2="select *from voter where pass= "+pass+";";
          ResultSet rs=DBService.selectData(q2);
          if(rs.next())
          {
          String vid1=rs.getString(1);
          out.print("your id:"+vid1);
          }
                }
 else
          {
 out.print("not register successfully");
 }
    
    }}
        }
    finally

    {
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
            Logger.getLogger(voter.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(voter.class.getName()).log(Level.SEVERE, null, ex);
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


