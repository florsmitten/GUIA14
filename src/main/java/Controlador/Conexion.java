package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String server;
    private static String user;
    private static String password;

    public Conexion() {
    }

    public static Connection getConnection() throws SQLException {

        server = "jdbc:sqlserver://DESKTOP-FLOR\\SQLEXPRESS:1433;databaseName=Programacion_Avanzada";
        user = "user";
        password = "1234";

        return DriverManager.getConnection(server, user, password);
    }

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException var1) {
            var1.printStackTrace();
        }

    }
}
