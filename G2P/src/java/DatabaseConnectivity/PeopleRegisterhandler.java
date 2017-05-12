/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ankush
 */
public class PeopleRegisterhandler {
    
     public   Connection con ;
     public   Statement st ;
     public   PreparedStatement pst ;
     
     public ResultSet rs ;
     int flag =0;
     
     public PeopleRegisterhandler(){
         con = Connectivity.getConnection1();
         st  = Connectivity.createStatement1();
         rs = null;
         pst=null;
     }
     public int  registerPeople(String email, String password) {
         String query = "insert into peoplelogin values(?,?,?,?,?)";
         try {
             pst = con.prepareStatement(query);
             pst.setString(1, email);
             pst.setString(2, password);
             pst.setString(3, null);
             pst.setString(4, null);
             pst.setString(5, null);
             
             flag= pst.executeUpdate();
             return flag ;
         } catch (SQLException ex) {
             Logger.getLogger(PeopleRegisterhandler.class.getName()).log(Level.SEVERE, null, ex);
         }
          return flag ;
     }
    
}
