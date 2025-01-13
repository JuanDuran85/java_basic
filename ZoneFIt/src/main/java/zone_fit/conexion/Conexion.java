package zone_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        String dbName = "zona_fit_db";
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        String userName = "dummy";
        String password = "dummy";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }

        return conexion;
    }

    public static void main(String[] args) {
        var connection = Conexion.getConexion();
        if (connection != null){
            System.out.println("Conexion exitosa a: " + connection);
        } else {
            System.out.println("Conexion fallida");
        }
    }
}
