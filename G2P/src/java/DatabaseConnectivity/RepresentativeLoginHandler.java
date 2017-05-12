/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ankush
 */
public class RepresentativeLoginHandler {
    
    
     public   Connection con ;
     public   Statement st ;
     public ResultSet rs ;
     int flag =0;
     
     
      public RepresentativeLoginHandler(){
         con = Connectivity.getConnection1();
         st  = Connectivity.createStatement1();
         rs = null;
     }
    
     public int loginHandler(String email , String password) {
         
        // System.out.println("hello we are  in the loginHandler");
         
         String query = "select * from replogin";
         try {
             rs = st.executeQuery(query);
           System.out.println("value of rs " + rs);
             while(rs.next()){
            String tempEmail = rs.getString(1);
            String tempPass  = rs.getString(2);
                 System.out.println(tempEmail);
                 System.out.println(tempPass);
                 
                if((tempEmail.equals(email))  && (tempPass.equals(password)))
                    flag =1;
                }
         } catch (SQLException ex) {
             Logger.getLogger(PeopleLoginHandler.class.getName()).log(Level.SEVERE, null, ex);
         }
            
         return flag ;
     }
     
     
     
}
