package zone_fit.connection;

import java.sql.DriverManager;

public class Connection {

    public static java.sql.Connection getConexion() {
        java.sql.Connection connection = null;
        String dbName = "zona_fit_db";
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        String userName = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            System.out.println("Connection Error: " + e.getMessage());
        }

        return connection;
    }

    public static void main(String[] args) {
        var connection = Connection.getConexion();
        if (connection != null) {
            System.out.println("Connection success: " + connection);
        } else {
            System.out.println("Connection failed");
        }
    }
}
