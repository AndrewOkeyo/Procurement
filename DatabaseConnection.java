package Procurement.Application.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*Create Connection*/
public class DatabaseConnection {
   public Connection getConnection(Connection connection){
       connection =null;
       
       String  url=("jdbc:mysql://localhost:3306/procurement");
       String password=("procurement");
       String database=("procurement");
       try{
       Class.forName("com.mysql.jdbcDriver ") ;
       connection=DriverManager.getConnection(url,database,password);
       
   }catch(SQLException |ClassNotFoundException ex){
       JOptionPane.showMessageDialog(null,"Connection",ex.getMessage(), JOptionPane.ERROR_MESSAGE);
   }
       return connection;
   }
  
   /*Close Connection*/
   public void closeConnection(Connection connection){
       try{
           connection.close();
       }catch(SQLException ex){
       JOptionPane.showMessageDialog(null,"Connection",ex.getMessage(), JOptionPane.ERROR_MESSAGE);    
       }
   }
}
