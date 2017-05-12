
package ServletClasses;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ankush
 */
public class loginServlet extends HttpServlet {
    public void init(){
         ServletContext sc = getServletContext();
         int count =0;
         sc.setAttribute("countPost", count);
         
        
         
        ServletContext sc1 =  getServletContext();
        HashMap news = new HashMap();
        sc1.setAttribute("news", news);
         
    }
    public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
        
        String email = req.getParameter("email");
        String pass  = req.getParameter("pass");
        String type = req.getParameter("type");
        PrintWriter out = res.getWriter();
        ServletContext sc  = getServletContext();
         HttpSession s = req.getSession(true);
        RequestDispatcher rd1 =req.getRequestDispatcher("errorPage.jsp");
        RequestDispatcher rd2 =req.getRequestDispatcher("PeopleLogin");
        RequestDispatcher rd3 =req.getRequestDispatcher("RepresentativeLogin");
        
        if(type.equals("admin")){
            if(email.equals("admin@g2p")  && pass.equals("admin@g2p"))
              s.setAttribute("user", "Admin");
              res.sendRedirect("adminOptions.jsp");
        }
        else if(type.equals("people")){
            rd2.forward(req, res);
        }
        else if(type.equals("rep")){
            rd3.forward(req, res);
        }
        else 
            rd1.forward(req, res);
        
    }
    public void destroy(){}

   

}
