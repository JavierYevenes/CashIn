package models;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Javier Yévenes
 */
public class Conection {
    public Conection(){
        
    }
    public static Connection Conection(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/cashin_db", "root", "");
            Statement st = cn.createStatement();
            System.out.println("Conexion Exitosa");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexión local " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return(null);
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
