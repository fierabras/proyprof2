package utilerias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * @author: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class ConexionBD {

    private static ConexionBD conexionSQL;
    private static Connection conexion;

    private ConexionBD() {
        conexion = ConexionBD.conectar();
    }

    public static ConexionBD getConexionSQL() {
        if (conexionSQL == null) {
            return ConexionBD.conexionSQL = new ConexionBD();
        }
        return conexionSQL;
    }

    public static Connection getConexion() {
        try {
            if ((ConexionBD.conexion == null) || (ConexionBD.conexion.isClosed())) {
                ConexionBD.conexion = ConexionBD.conectar();
                return ConexionBD.conexion;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
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

        try ( Connection conn = this.conectar();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Se ha guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String sentencia) {
        String sql = sentencia;

        try ( Connection conn = this.conectar();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
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

        try ( Connection conn = ConexionBD.conectar();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            claveSiguiente = rs.getInt(1);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return claveSiguiente;
    }

    public static List<Map<String, Object>> consultaSql(String query) {

        try ( Connection connection = ConexionBD.conectar();  
                Statement statement = connection.createStatement();  
                ResultSet resultSet = statement.executeQuery(query);) {

            ResultSetMetaData metaDatos = resultSet.getMetaData();
            int Columnas = metaDatos.getColumnCount();
            String[] nombreColumna = new String[Columnas];

            for (int i = 0; i < Columnas; i++) {
                nombreColumna[i] = metaDatos.getColumnLabel(i + 1);
            }

            List<Map<String, Object>> registros = new ArrayList<>();

            while (resultSet.next()) {
                Map<String, Object> registro = new LinkedHashMap<>();
                for (int i = 0; i < Columnas; i++) {
                    registro.put(nombreColumna[i], resultSet.getObject(i + 1));
                }
                registros.add(registro);
            }
            return registros;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
