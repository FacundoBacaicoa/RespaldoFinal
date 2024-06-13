package gestiongimnasio.DAO;

import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Facu
 */

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "gimnasio";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base");
                
            }

        }
         return connection;
    }
}
