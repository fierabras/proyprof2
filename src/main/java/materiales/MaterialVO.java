/*
 * Esta clase representa un material reciclado
 */
package materiales;

/**
 * Autor: Jesus Armando Mendoza Romero
 * a171117 
 */
public class MaterialVO {
    
    private int claveMaterial;
    private String descripcion;
    private double precio;   

    public int getClaveMaterial() {
        return claveMaterial;
    }

    public void setClaveMaterial(int claveMaterial) {
        this.claveMaterial = claveMaterial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
