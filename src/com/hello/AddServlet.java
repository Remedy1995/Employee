package com.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class AddServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        System.out.println(firstname);
        System.out.println(lastname);

        Member member=new Member(firstname,lastname);

        try {
            UserDatabase userDatabase=new UserDatabase(RegisterDao.getConnection());
            userDatabase.saveUser(member);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}