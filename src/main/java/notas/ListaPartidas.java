
package notas;

import java.util.ArrayList;
import java.util.List;

public class ListaPartidas {
    
    private List<Partida> lista = new ArrayList();
    
    public void agregarPartida(Partida partida){
        lista.add(partida);
    }
    
    public void eliminarPartida(int numeroPartida){
        lista.remove(numeroPartida);
    }
    
    public List<Partida> obtenerListaPartidas(){
        return lista;
    }
    
}
