package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Clase para gestionar la conexión a una base de datos MariaDB.
 */
public class Conection {
    private static Connection connection;

    public Conection() {
    }

    /**
     * Establece la conexión a la base de datos.
     *
     * @return Objeto Connection si la conexión es exitosa, null en caso de error.
     */
    public static Connection Conection() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3307/cashin", "root", "");
            Statement st = connection.createStatement();
            System.out.println("Conexion Exitosa");
            return connection;
        } catch (SQLException e) {
            System.out.println("Error en conexión local " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    /**
     * Cierra la conexión a la base de datos.
     */
    public static void closeConection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexion cerrada");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion" + e);
            }
        }
    }
}
