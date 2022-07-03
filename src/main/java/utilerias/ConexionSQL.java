
package utilerias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 * @author: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class ConexionSQL {


    private static ConexionSQL conexionSQL;
    private static Connection conexion;


    private ConexionSQL() {
        conexion = ConexionSQL.conectar();
    }

    public static ConexionSQL getConexionSQL() {
        if (conexionSQL == null) {
            return ConexionSQL.conexionSQL = new ConexionSQL();
        }
        return conexionSQL;
    }

    public static Connection getConexion() {
        try {
            if ((ConexionSQL.conexion == null) || (ConexionSQL.conexion.isClosed())) {
                ConexionSQL.conexion = ConexionSQL.conectar();
                return ConexionSQL.conexion;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

    private static Connection conectar() {
        String url = "jdbc:sqlite:database/DATOS_RECICLADORA.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Se ha conectado correctamente a la base de datos DATOS_RECICLADORA.db");
        return conn;
    }


    public void insert(String sentencia) {

        String sql = sentencia;

        try (Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Se ha insertado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void update(String sentencia) {
        String sql = sentencia;

        try (Connection conn = this.conectar();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Se ha modificado el registro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public static int obtenerClave(String sentencia) {
        int claveSiguiente = 0;
        String sql = sentencia;

        try (Connection conn = ConexionSQL.conectar();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            claveSiguiente = rs.getInt(1);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return claveSiguiente;
    }
    
    
    public static ResultSet obtenerRegistro(String sentencia){
        ResultSet resultado=null;
        
        try (Connection conn = ConexionSQL.conectar();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sentencia)) {
            
            System.out.println("Se ha devuelto el resultSet rs");
            return rs;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }   

}
