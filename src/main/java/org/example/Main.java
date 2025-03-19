package org.example;

import java.sql.*;

public class Main {



    public static void main(String[] args) throws SQLException {

        String database_path = "//c:/Users/ALEXANDRU/OneDrive/Documente/Database1.accdb";
        Connection conn= DriverManager.getConnection("jdbc:ucanaccess:" + database_path + ";memory=true");

        if(conn != null) {
            System.out.println("Connected to database");
        }
        else {
            System.out.println("Not connected to database");
        }

        String sql = "select * from persoane";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) {
            System.out.println(rs.getString(1) + " "
                            + rs.getString(2) + " "
                            + rs.getString(3));
        }

        conn.close();
        stmt.close();
        rs.close();

        assert conn != null;
        conn.close();
   }
}