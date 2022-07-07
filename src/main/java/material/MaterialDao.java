
package material;


import javax.swing.JTable;


/**
 *
 * @author paco
 */
public interface MaterialDao {
    
    public void guardarMaterial(String descripcion, String precio);

    public MaterialVO obtenerMaterial(String claveMaterial);   

    public void obtenerListaMateriales();

    public void cargarTabla(JTable tablaMateriales, String txbBuscar);    
    
    public void actualizarMaterial(String clave, String descripcion, String precio);

    public void eliminarMaterial();

    
    
}
