
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Hospital","harsh","1234");
           
            return con;
        }
        catch(Exception e)
        {
          return null;
        }
    }
    
}
