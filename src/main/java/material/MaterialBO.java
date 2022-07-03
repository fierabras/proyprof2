package material;

import javax.swing.JTable;
import fabrica.VistaConsulta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import utilerias.ConexionSQL;

/**
 *
 * @author paco
 */
public class MaterialBO {

    public void guardarMaterial() {

    }

    public void obtenerMaterial() {

    }

    public void obtenerListaMateriales() {

    }

    public void cargarTabla(JTable tablaMateriales, String txbBuscar) {
        
        DefaultTableModel model = (DefaultTableModel) tablaMateriales.getModel();
        model.setRowCount(0);

        String sql = "SELECT * FROM MATERIALES WHERE CLAVE_MATERIAL LIKE '%" + txbBuscar + "%' OR DESCRIPCION LIKE '%" + txbBuscar
                + "%' OR PRECIO LIKE '%" + txbBuscar + "%'";
        
        System.out.println("instrucción enviada: " + sql);

        try ( Connection conn = ConexionSQL.getConexion();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String claveMaterial = String.valueOf(rs.getInt("CLAVE_MATERIAL"));
                String descripcion = rs.getString("DESCRIPCION");
                String precio = String.valueOf(rs.getString("PRECIO"));

                String tbData[] = {claveMaterial, descripcion, precio};
                DefaultTableModel tblModel = (DefaultTableModel) tablaMateriales.getModel();

                tblModel.addRow(tbData);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
          
    }

    public void actualizarMaterial() {

    }

    public void eliminarMaterial() {

    }

}
