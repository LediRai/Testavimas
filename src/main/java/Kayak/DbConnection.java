package Kayak;
import java.sql.*;

public class DbConnection {

    public static void main(String[] args) {
        //pirmas try prisijungimas tikrinamas, ar nera klaidu
        String url = "jdbc:postgresql://localhost/seleniumData";
        String user = "postgres";
        String password = "labas123";

        try {
            System.out.println("1");
            Connection connection = DriverManager.getConnection(url, user, password);
//            Statement stmt = connection.createStatement();
            String hotelsTable = "CREATE TABLE products " +
                    "(id SERIAL PRIMARY KEY," +
                    "hotel_title VARCHAR(250)," +
                    "price INT," +
                    "address VARCHAR(250)) ";
            System.out.println("1.1");
//            stmt.executeUpdate(hotelsTable);
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(hotelsTable);
                System.out.println("Table created successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PreparedStatement databaseConn (String sql){
        String url = "jdbc:postgresql://localhost/seleniumData";
        String user = "postgres";
        String password = "labas123";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static void testDbConnection() {
        String url = "jdbc:postgresql://localhost/seleniumData";
        String user = "postgres";
        String password = "labas123";

            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection to database established.");
            } catch (SQLException e) {
                System.err.println("Error connecting to database: " + e.getMessage());
            }
    }


//        public static void main(String[]args){
//            String url = "jdbc:postgresql://localhost/seleniumData";
//            String user = "postgres";
//            String password = "123456";
//            try {
//                Connection con = DriverManager.getConnection(url, user, password);
//                Statement stmt = con.createStatement();
//
//                String hotelsTable = "CREATE TABLE products " +
//                        "(id SERIAL PRIMARY KEY, " +
//                        "hotel_title VARCHAR(250), " +
//                        "price INT, " +
//                        "address VARCHAR(250))";
//
//                stmt.executeUpdate(hotelsTable);
//                System.out.println("Table created successfully!");
//
//            } catch(SQLException e){
//                e.printStackTrace();
//            }
//
//        }

}



