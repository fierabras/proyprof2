package proveedor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilerias.ConexionBD;

/**
 *
 */
public class ProveedorBO {

    public ProveedorVO obtenerProveedor(String claveProveedor) {

        ProveedorVO proveedorVO = new ProveedorVO();
        String consultaSql = "SELECT * FROM PROVEEDORES WHERE CLAVE_PROVEEDOR = " + claveProveedor;

        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);

        proveedorVO.setClaveProvedor(Integer.parseInt(consulta.get(0).get("CLAVE_PROVEEDOR").toString()));
        proveedorVO.setNombre(consulta.get(0).get("NOMBRE").toString());
        proveedorVO.setTipoId(consulta.get(0).get("TIPO_IDENTIFICACION").toString());
        proveedorVO.setFoliId(consulta.get(0).get("NUMERO_IDENTIFICACION").toString());

        return proveedorVO;
    }

    public void cargarTabla(JTable tablaProveedors, String txbBuscar) {

        DefaultTableModel model = (DefaultTableModel) tablaProveedors.getModel();
        model.setRowCount(0);
       
        String sql = "SELECT * FROM PROVEEDORES WHERE CLAVE_PROVEEDOR LIKE '%" + txbBuscar + "%' OR NOMBRE LIKE '%" + txbBuscar
                + "%' OR TIPO_IDENTIFICACION LIKE '%" + txbBuscar + "%' OR NUMERO_IDENTIFICACION LIKE '%" + txbBuscar + "%'";

        try ( Connection conn = ConexionBD.getConexion();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String claveProveedor = String.valueOf(rs.getInt("CLAVE_PROVEEDOR"));
                String nombre = rs.getString("NOMBRE");
                String tipoId = rs.getString("TIPO_IDENTIFICACION");
                String folioId = rs.getString("NUMERO_IDENTIFICACION");

                String tbData[] = {claveProveedor, nombre, tipoId, folioId};
                DefaultTableModel tblModel = (DefaultTableModel) tablaProveedors.getModel();

                tblModel.addRow(tbData);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
