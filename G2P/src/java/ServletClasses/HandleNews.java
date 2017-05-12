 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ankush
 */
public class HandleNews extends HttpServlet {
    public void  init(){}
    public void service(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
        String filename = req.getParameter("file");
        String  path  = "F://" + filename;
        res.setContentType("application/pdf");
        File f =new File(path);
        FileInputStream file = new FileInputStream(f);
        OutputStream  ro =  res.getOutputStream();
        int data;
        while((data=file.read())!=-1){
        ro.write(data);
        }
        
        
    }
    public void destroy(){}

}
