package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?&rewriteBatchedStatements=true&useSSL=false&serverTimezone=UTC", "root", "yangcheng");
        System.out.println(conn);
    }
}
