
package Jframe;

import java.sql.*;

public class DBMSConnection {
    Connection connect;
    Statement statement;

    public DBMSConnection(){
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);
            connect = DriverManager.getConnection("jdbc:mysql:///IntelliLibrary", "root", "");
            statement = connect.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
        
}
