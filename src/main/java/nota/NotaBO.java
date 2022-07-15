package nota;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilerias.ConexionBD;

import utilerias.Fecha;

public class NotaBO {

    ListaPartida listaPartidas = new ListaPartida();
    String uuidNota;

    public void agregarPartida(PartidaVO partida) {
        this.listaPartidas.agregarPartida(partida);
    }

    public static String obtenerFolioSiguiente() {

        String clave;
        String consultaSql = "SELECT MAX(CLAVE_NOTA) FROM NOTAS";

        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);
        int folio = 1 + ((int) consulta.get(0).get("MAX(CLAVE_NOTA)"));
        clave = String.valueOf(folio);
        return clave;
    }

    public List<PartidaVO> obtenerPartidas() {
        return this.listaPartidas.obtenerListaPartidas();
    }

    public void guardarNotaBD(String claveProveedor, List<PartidaVO> listaPartidas) {

        UUID uuid = UUID.randomUUID();
        uuidNota = uuid.toString();
        String fecha = Fecha.obtenerFechaHoy();
        double total = 0.0;
        double pesoTotal = 0.0;

        for (int i = 0; i < listaPartidas.size(); i++) {
            total += listaPartidas.get(i).getSubtotal();
        }
        for (int i = 0; i < listaPartidas.size(); i++) {
            pesoTotal += listaPartidas.get(i).getCantidad();
        }

        ConexionBD conn = ConexionBD.getConexionSQL();
        String sentenciaSql = "INSERT INTO NOTAS (FECHA, CLAVE_PROVEEDOR, PESO_TOTAL, TOTAL, UUID_NOTA) "
                + "VALUES ('" + fecha + "','" + claveProveedor + "','" + pesoTotal + "','" + total + "','" + uuid.toString() + "')";
        conn.insert(sentenciaSql);

        System.out.println("guardarNotaBD uuidNota: " + uuid.toString());
        this.guardarPartidasBD(listaPartidas, uuid.toString());

    }

    public String getUuidNota() {
        return uuidNota;
    }

    public void setUuidNota(String uuidNota) {
        this.uuidNota = uuidNota;
    }

    public void guardarPartidasBD(List<PartidaVO> listaPartidas, String uuidNota) {

        System.out.println("guardarPartidasBD uuidNota: " + uuidNota);
        String claveNota = this.obtenerClaveNota(uuidNota);

        ConexionBD conn = ConexionBD.getConexionSQL();
        for (int i = 0; i < listaPartidas.size(); i++) {
            UUID uuid = UUID.randomUUID();
            String sentenciaSql = "INSERT INTO PARTIDAS (CLAVE_NOTA,CLAVE_PARTIDA,CANTIDAD,CLAVE_MATERIAL,PRECIO,SUBTOTAL,UUID_NOTA,UUID_PARTIDA) "
                    + "VALUES ('" + claveNota + "','" + (i + 1) + "','" + listaPartidas.get(i).getCantidad() + "','" + listaPartidas.get(i).getMaterial().getClaveMaterial()
                    + "','" + listaPartidas.get(i).getMaterial().getPrecio() + "','" + listaPartidas.get(i).getSubtotal() + "','" + uuidNota + "','" + uuid.toString() + "')";
            conn.insert(sentenciaSql);
            System.out.println("Sentencia de insert partida: " + sentenciaSql);
        }
    }

    public String obtenerClaveNota(String uuidNota) {

        String clave;
        String consultaSql = "SELECT * FROM NOTAS WHERE UUID_NOTA = '" + uuidNota + "'";
      

        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);
        clave = consulta.get(0).get("CLAVE_NOTA").toString();

        return clave;
    }
    
    public String obtenerUuidNota(String claveNota) {

        String uuidNota;
        String consultaSql = "SELECT * FROM NOTAS WHERE CLAVE_NOTA = '" + claveNota + "'";
        

        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);
        uuidNota = consulta.get(0).get("UUID_NOTA").toString();

        return uuidNota;
    }

    public void eliminarPartida(int numeroPartida) {
        this.listaPartidas.eliminarPartida(numeroPartida);
    }

    public void cargarTabla(JTable tablaNotas, String txbBuscar) {

        DefaultTableModel model = (DefaultTableModel) tablaNotas.getModel();
        model.setRowCount(0);

        String sql = "SELECT * FROM NOTAS N INNER JOIN PROVEEDORES P ON P.CLAVE_PROVEEDOR = N.CLAVE_PROVEEDOR WHERE CLAVE_NOTA LIKE '%"
                + txbBuscar + "%' OR FECHA LIKE '%" + txbBuscar + "%' OR P.NOMBRE LIKE '%" + txbBuscar + "%' OR PESO_TOTAL LIKE '%"
                + txbBuscar + "%' OR TOTAL LIKE '%" + txbBuscar + "%'";

        try ( Connection conn = ConexionBD.getConexion();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String claveNota = String.valueOf(rs.getInt("CLAVE_NOTA"));
                String fecha = rs.getString("FECHA");
                String nombre = rs.getString("NOMBRE");
                String pesoTotal = rs.getString("PESO_TOTAL");
                String total = rs.getString("TOTAL");

                String tbData[] = {claveNota, fecha, nombre, pesoTotal, total};
                DefaultTableModel tblModel = (DefaultTableModel) tablaNotas.getModel();

                tblModel.addRow(tbData);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
