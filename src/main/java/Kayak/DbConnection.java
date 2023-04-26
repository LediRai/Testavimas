package Kayak;
import java.sql.*;

public class DbConnection {

    public static void main(String[] args) {
//        DbConnection tableCreation = new DbConnection();
//        tableCreation.

        //pirmas try prisijungimas tikrinamas, ar nera klaidu
        String url = "jdbc:postgresql://localhost/seleniumData";
        String user = "postgres";
        String password = "morengas1";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            String hotelsTable = "CREATE TABLE products " +
                    "(id SERIAL PRIMARY KEY," +
                    "hotel_title VARCHAR(250)" +
                    "price INT" +
                    "address VARCHAR(250)) ";

            stmt.executeUpdate(hotelsTable);
            System.out.println("Table created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
         // return null;
    }

    public static PreparedStatement databaseCon(String sql) {
        String url = "jdbc:postgresql://localhost/seleniumData";
        String user = "postgres";
        String password = "morengas1";
        //connection to data base
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt;
        } catch (
                SQLException e) {
            System.err.println(e.getMessage());
            return null;

        }
    }
}



