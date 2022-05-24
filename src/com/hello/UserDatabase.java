package com.hello;



import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDatabase {
    Connection connection;

    public UserDatabase(Connection connection) {

        this.connection = connection;
    }


    public boolean saveUser(Member member) {
        boolean set = false;
        try {
            String query = "insert into employers(firstname,lastname)values(?,?)";

            PreparedStatement preparedStatement = this.connection.prepareStatement(query);

            preparedStatement.setString(1, member.getFirstname());
            preparedStatement.setString(2, member.getLastname());
            preparedStatement.executeUpdate();
            set = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }
}