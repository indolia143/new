
import javax.servlet.*;
import java.io.*;
class NewServlet extends GenericServlet
{
int count=0;

    
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
          count++;
        PrintWriter out=res.getWriter();
        out.print("Page is visited"+count+"times");
        throw new UnsupportedOperationException("Not supported yet.");

    }
}