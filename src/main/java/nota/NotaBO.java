
package nota;

import java.util.List;



public class NotaBO  {

    
    ListaPartida listaPartidas = new ListaPartida();
        
    public NotaBO(){
        
    }
    
    public void agregarPartida(PartidaVO partida){
        this.listaPartidas.agregarPartida(partida);        
    }
    
    public void obtenerPartida(){
        
    } 
   
    
    public List<PartidaVO> obtenerPartidas(){
        return this.listaPartidas.obtenerListaPartidas();
    }
    
    public void guardarNota(VistaNota formulario){
        
    }
    
     public void eliminarPartida(int numeroPartida){
        this.listaPartidas.eliminarPartida(numeroPartida);
    }
    
    public void cancelarCaptura(){
        
    }
      
    
}