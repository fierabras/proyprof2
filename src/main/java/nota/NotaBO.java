
package nota;


import java.util.List;
import proveedor.ProveedorBO;

import utilerias.Fecha;



public class NotaBO  {

    ListaPartida listaPartidas = new ListaPartida();           
 
    public void agregarPartida(PartidaVO partida){
        this.listaPartidas.agregarPartida(partida);        
    }
    
    public void obtenerPartida(){
        
    } 
   
    
    public List<PartidaVO> obtenerPartidas(){
        return this.listaPartidas.obtenerListaPartidas();
    }
    
    public void guardarNota(String claveProveedor, List<PartidaVO> listaPartidas){
        /*
        ProveedorBO proveedorBO = new ProveedorBO();
        
        String fecha = Fecha.obtenerFechaHoy();        
        double pesoTotal
        
        */
        
        
        
    }
    
    private void guardarPartidas(List<PartidaVO> listaPartidas){
        
    }
    
     public void eliminarPartida(int numeroPartida){
        this.listaPartidas.eliminarPartida(numeroPartida);
    }
    
    public void cancelarCaptura(){
        
    }  
        
    /* Metodo para probar la lista de partidas
    private void desglosarListaPartidasCLI() {

        for (int i = 0; i<NotaBO.obtenerPartidas().size(); i++ ){
            System.out.println(
                            "Numero de partida: " + (i+1) +
                            "  Cantidad: " + NotaBO.obtenerPartidas().get(i).getCantidad() +
                            "  Descripción: " + NotaBO.obtenerPartidas().get(i).getMaterial().getDescripcion() +
                            "  Precio: " + NotaBO.obtenerPartidas().get(i).getMaterial().getPrecio() +
                            "  Subtotal: " + NotaBO.obtenerPartidas().get(i).getSubtotal()
            );
     
        }
        System.out.println("\n ----------------------------------------------------------------------");
 
    }*/     
    
}