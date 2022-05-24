package com.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RegisterDao {

  private static  Connection connection;


   static Connection getConnection() throws SQLException {



            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");

return connection;
    }
}