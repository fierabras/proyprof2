
package notas;

import Ventanas.FormularioNota;
import java.util.List;
import utilerias.ConexionSQL;


public class Notas  {

    
    ListaPartidas listaPartidas = new ListaPartidas();
        
    public Notas(){
        
    }
    
    public void agregarPartida(Partida partida){
        this.listaPartidas.agregarPartida(partida);        
    }
    
    public void eliminarPartida(int numeroPartida){
        this.listaPartidas.eliminarPartida(numeroPartida);
    }
    
    public List<Partida> obtenerPartidas(){
        return this.listaPartidas.obtenerListaPartidas();
    }
    
    public void guardarNota(FormularioNota formulario){
        /*ConexionSQL conn = ConexionSQL.getConexionSQL();
        String cmd = "INSERT INTO NOTAS (CLAVE_NOTA,FECHA,CLAVE_PROVEEDOR, PESO_TOTAL, TOTAL) VALUES ('" + formulario. txbNombre.getText()
                + "','" + comboTipoId.getSelectedItem() + "','" + txbfolioId.getText() + "')";
        conn.insert(cmd);
        super.dispose(); */
    }
    
    public void cancelarCaptura(){
        
    }
      
    
}