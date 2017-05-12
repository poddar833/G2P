/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletClasses;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ankush
 */
public class Uploadpdf extends HttpServlet {
    public void init(){}
    public  void service(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException{
        String  n = req.getParameter("news");
        String temp = req.getParameter("headline");
        int key = Integer.parseInt(temp);
        System.out.println(key);
        System.out.println(n);
        ServletContext sc =  getServletContext();
        HashMap news = (HashMap)sc.getAttribute("news");
        news.put(key, n);
        sc.setAttribute("news",news);
        res.sendRedirect("adminOptions.jsp");
    }
    public void destroy(){}

}
