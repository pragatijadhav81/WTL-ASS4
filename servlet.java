import java.io.IOException;  
import java.io.PrintWriter;   
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class servlet extends HttpServlet {  
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String user=request.getParameter("username");  
    String pwd=request.getParameter("password");  
          
    if(user.equals("admin")&&pwd.equals("admin"))
    {
        out.print("<h2>Welcome</h2>"+user);
    }
    else
    {
        RequestDispatcher rd=request.getRequestDispatcher("newhtml.html");
        rd.forward(request, response);
    }
   }  
}  
