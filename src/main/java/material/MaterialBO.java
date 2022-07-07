package material;

import javax.swing.JTable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import utilerias.ConexionBD;

/**
 * * @author Jesus Armando Mendoza Romero
 */
public class MaterialBO implements MaterialDao {

    @Override
    public void guardarMaterial(String descripcion, String precio) {
        ConexionBD conn = ConexionBD.getConexionSQL();
        String cmd = "INSERT INTO MATERIALES (DESCRIPCION,PRECIO) VALUES ('" + descripcion + "','" + precio + "')";
        conn.insert(cmd);
    }

    @Override
    public MaterialVO obtenerMaterial(String claveMaterial) {
        MaterialVO materialVO = new MaterialVO();
        String consultaSql = "SELECT * FROM MATERIALES WHERE CLAVE_MATERIAL = " + claveMaterial;
        
        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);
        
        materialVO.setClaveMaterial(Integer.parseInt(consulta.get(0).get("CLAVE_MATERIAL").toString()));
        materialVO.setDescripcion(consulta.get(0).get("DESCRIPCION").toString());
        materialVO.setPrecio(Double.parseDouble(consulta.get(0).get("PRECIO").toString()));          
        
        return materialVO;
    }

    @Override
    public void obtenerListaMateriales() {

    }

    @Override
    public void cargarTabla(JTable tablaMateriales, String txbBuscar) {

        DefaultTableModel model = (DefaultTableModel) tablaMateriales.getModel();
        model.setRowCount(0);

        String sql = "SELECT * FROM MATERIALES WHERE CLAVE_MATERIAL LIKE '%" + txbBuscar + "%' OR DESCRIPCION LIKE '%" + txbBuscar
                + "%' OR PRECIO LIKE '%" + txbBuscar + "%'";
        

        try ( Connection conn = ConexionBD.getConexion();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

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

    @Override
    public void actualizarMaterial(String clave, String descripcion, String precio) {
        ConexionBD conn = ConexionBD.getConexionSQL();
        String cmd = "UPDATE MATERIALES SET DESCRIPCION='" + descripcion + "',PRECIO='"
                + precio + "' WHERE CLAVE_MATERIAL=" + clave;
        conn.update(cmd);
    }

    @Override
    public void eliminarMaterial() {

    }

}
