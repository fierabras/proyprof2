/*
 * Esta clase representa a un proveedor de materiales reciclados
 */
package proveedor;

/**
 * Autor: Jesus Armando Mendoza Romero
 * a171117
 *
 */
public class ProveedorVO {
    
    private int claveProvedor;
    private String nombre;
    private String tipoId;
    private String foliId;  

    public int getClaveProvedor() {
        return claveProvedor;
    }

    public void setClaveProvedor(int claveProvedor) {
        this.claveProvedor = claveProvedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getFoliId() {
        return foliId;
    }

    public void setFoliId(String foliId) {
        this.foliId = foliId;
    }

}
