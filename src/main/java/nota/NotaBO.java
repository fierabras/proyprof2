package nota;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import utilerias.ConexionBD;

import utilerias.Fecha;

public class NotaBO {

    ListaPartida listaPartidas = new ListaPartida();

    public void agregarPartida(PartidaVO partida) {
        this.listaPartidas.agregarPartida(partida);
    }

    public void obtenerPartida() {

    }

    public List<PartidaVO> obtenerPartidas() {
        return this.listaPartidas.obtenerListaPartidas();
    }

    public void guardarNotaBD(String claveProveedor, List<PartidaVO> listaPartidas) {

        UUID uuid = UUID.randomUUID();
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

    public void guardarPartidasBD(List<PartidaVO> listaPartidas, String uuidNota) {
        
        System.out.println("guardarPartidasBD uuidNota: "+ uuidNota);
        String claveNota= this.obtenerClaveNota(uuidNota);
        
        ConexionBD conn = ConexionBD.getConexionSQL();
        for (int i = 0; i < listaPartidas.size(); i++) {
            UUID uuid = UUID.randomUUID();
            String sentenciaSql = "INSERT INTO PARTIDAS (CLAVE_NOTA,CLAVE_PARTIDA,CANTIDAD,CLAVE_MATERIAL,DESCRIPCION,PRECIO,SUBTOTAL,UUID_NOTA,UUID_PARTIDA) "
                    + "VALUES ('" + claveNota + "','" + (i+1) + "','"  + listaPartidas.get(i).getCantidad() + "','" + listaPartidas.get(i).getMaterial().getClaveMaterial()
                    + "','" + listaPartidas.get(i).getMaterial().getDescripcion()+ "','" + listaPartidas.get(i).getMaterial().getPrecio()
                    + "','" + listaPartidas.get(i).getSubtotal() + "','" + uuidNota  + "','" + uuid.toString() +"')";
            conn.insert(sentenciaSql);
            System.out.println("Sentencia de insert partida: " + sentenciaSql);
        }        
    }
    
    public String obtenerClaveNota(String uuidNota){
        
        String clave;        
        String consultaSql = "SELECT * FROM NOTAS WHERE UUID_NOTA = '" + uuidNota + "'";
        System.out.println(consultaSql);
        System.out.println("obtenerClaveNota uuidNota: "+ uuidNota);

        List<Map<String, Object>> consulta = ConexionBD.consultaSql(consultaSql);        
        clave =consulta.get(0).get("CLAVE_NOTA").toString();

        return clave;
    }
    

    public void eliminarPartida(int numeroPartida) {
        this.listaPartidas.eliminarPartida(numeroPartida);
    }

    public void cancelarCaptura() {

    }

    
}
