
package DatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ankush
 */
public class Connectivity {
   public static  Connection con ;
   public static  Statement st ;
  
   
    
    //change the username and password accordingly
   private  final static  String USERNAME = "SYSTEM"; 
   private final static  String PASSWORD = "SYSTEM";
    
    //change the drivername and url accordingly for mysql 
    
  private  final static String DRIVER = "oracle.jdbc.OracleDriver";
  private final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    
    
    static{
       try {
           Class.forName(DRIVER);
       } catch (Exception ex) {
           System.out.println("Exception occured");
       }
        }
    
    public static Connection getConnection1(){
       try {
           con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
       } catch (SQLException ex) {
           Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
       }
        return con;
    }
    
    public static Statement createStatement1(){
       try {
           st  = con.createStatement();
           System.out.print(st);
       } catch (SQLException ex) {
           Logger.getLogger(Connectivity.class.getName()).log(Level.SEVERE, null, ex);
       }
        return st;
    }
    
}
