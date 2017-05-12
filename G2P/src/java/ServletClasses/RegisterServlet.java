package ServletClasses;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DatabaseConnectivity.*;
/**
 *
 * @author Ankush
 */
public class RegisterServlet extends HttpServlet {
    public void init(){
    }
    public  void  service(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
        String type =  req.getParameter("type");
        String email =  req.getParameter("email");
        String password =  req.getParameter("pass");
        ServletContext sc  = getServletContext();
       int flag =0;
        PeopleRegisterhandler prh = new PeopleRegisterhandler();
        
        RepRegisterHandler rrh = new RepRegisterHandler();
        
        RequestDispatcher rd1 =req.getRequestDispatcher("errorPage.jsp");
        RequestDispatcher rd2 =req.getRequestDispatcher("login.jsp");
        
        
        
        if(type.equals("people")){
            flag = 0;
            flag = prh.registerPeople(email, password);
            
            if(flag>=1){
                rd2.forward(req, res);
            }
            else 
                rd2.forward(req, res);
        }
        
        
        else if(type.equals("rep")){
            flag=0;
           flag = rrh.registerPeople(email, password);
           if(flag>=1){
                rd2.forward(req, res);
            }
            else 
                rd2.forward(req, res);
            
        }
            
        
    }
    
    public void destroy(){}

   
}
