package com.bridgelabz.employeepayroll;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getConnection {
    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is loaded");

        final String url = "jdbc:mysql://localhost:3306/payroll_service";
        final String userName = "root";
        final String password = "K@inu786";

        Connection connection = DriverManager.getConnection(url, userName, password);
        return connection;
    }
}