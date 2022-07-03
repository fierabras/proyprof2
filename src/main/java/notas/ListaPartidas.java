
package notas;

import java.util.ArrayList;
import java.util.List;

public class ListaPartidas {
    
    private List<PartidaVO> lista = new ArrayList();
    
    public void agregarPartida(PartidaVO partida){
        lista.add(partida);
    }
    
    public void eliminarPartida(int numeroPartida){
        lista.remove(numeroPartida);
    }
    
    public List<PartidaVO> obtenerListaPartidas(){
        return lista;
    }
    
}
