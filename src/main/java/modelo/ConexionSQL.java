/*
 * Esta clase se encarga de la conexion a la base de datos y la ejecucion de consultas, inserciones,
 * actualizaciones y pruebas de conexion a la base de datos.
 * Se implementa el patron singleton sobre la clase principal (ConexionSQL) y sobre la instancia
 * de la conexion a la base datos (ConexionSQL.conexion)
 */
package modelo;

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
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class ConexionSQL {

    // variables que almacenan la instancia de la clase y la instancia de la conexion
    // ambas son privadas por lo cual no se permite el acceso desde otras clases
    private static ConexionSQL conexionSQL;
    private static Connection conexion;

    // Implementación del singleton sobre la clase principal: ConexionSQL
    private ConexionSQL() {
        conexion = ConexionSQL.conectar();
    }

    public static ConexionSQL getConexionSQL() {
        if (conexionSQL == null) {
            return ConexionSQL.conexionSQL = new ConexionSQL();
        }
        return conexionSQL;
    }

    // Implementación del singleton sobre la conexion a la base, valída si la conexion es nula
    // o ha sido cerrada ya que en la mayoria del código se emplemento “Java try with resources”
    // para cerrar automaticamente las conexiones y evitar que se queden abiertas por descuido del programador
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

    // Metodo para realizar la conexion a la base de datos, retorna una conexion,
    // es privado por lo cual no se puede acceder a el desde otras clases
    private static Connection conectar() {
        // ruta de la base de datos, se utiliza el driver jdbc de SQLite para la conexion
        String url = "jdbc:sqlite:database/proyectoInterfaces.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    // Método que realiza la insecion de registros en la bases, recibe como 
    // parametro la sentencia SQL a ejecutar en forma de String
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

    // Método para ejecutar sentencias de actualizacion, recibe como parametro
    // la sentencia SQL a ejecutar en forma de String
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

    // Metodo para obtener la última clave registrada de materiales o proveedores 
    // recibe la sentencia en SQL y devuelve un entero con valor de la clave
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

}
