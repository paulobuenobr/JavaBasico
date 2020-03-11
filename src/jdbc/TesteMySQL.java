package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TesteMySQL {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/r10","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from paraguai");
            while (rs.next()) {
                System.out.println(rs.getString("passaporte"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
