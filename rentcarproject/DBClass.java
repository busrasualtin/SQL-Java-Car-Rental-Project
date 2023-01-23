/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcarproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author busra
 */
public class DBClass {
    public static void main(String[] args) {
    // Load the JDBC driver
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println("Error loading JDBC driver: " + e.getMessage());
      return;
    }

    // Establish a connection to the database
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/mydb","root","12345678"
      );
    } catch (SQLException e) {
      System.out.println("Error establishing connection: " + e.getMessage());
      return;
    }

    // Use the connection to perform database operations
    // ...

    // Close the connection when you are done with it
    try {
      connection.close();
    } catch (SQLException e) {
      System.out.println("Error closing connection: " + e.getMessage());
    }
  } 
}
