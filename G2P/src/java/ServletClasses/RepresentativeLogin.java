/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletClasses;

import DatabaseConnectivity.PeopleLoginHandler;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DatabaseConnectivity.*;
/**
 *
 * @author Ankush
 */
public class RepresentativeLogin extends HttpServlet {
    
    public void init(){}
    
    
    public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
        String email = req.getParameter("email");
        String pass  = req.getParameter("pass");
        String type = req.getParameter("type");
        PrintWriter out = res.getWriter();
        int flag =0;
        ServletContext sc  = getServletContext();
        HttpSession s = req.getSession(true);
        RequestDispatcher rd1 = req.getRequestDispatcher("addpost.jsp");
        
        
        RepresentativeLoginHandler rlh = new RepresentativeLoginHandler();
        
        flag =  rlh.loginHandler(email, pass);
      
       if(flag==1){
           s.setAttribute("user", email);
           rd1.forward(req, res);
       }
       else
           res.sendRedirect("error.jsp");
    }
    
    
    public void destoy(){}

    
}
