
package nota;

import material.MaterialVO;


public class PartidaVO {
    private int claveNota;
    private int clavePartida;
    private double cantidad;
    private MaterialVO material= new MaterialVO();    
    private double subtotal;

    public int getClaveNota() {
        return claveNota;
    }

    public void setClaveNota(int claveNota) {
        this.claveNota = claveNota;
    }

    public int getClavePartida() {
        return clavePartida;
    }

    public void setClavePartida(int clavePartida) {
        this.clavePartida = clavePartida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public MaterialVO getMaterial() {
        return material;
    }

    public void setMaterial(MaterialVO material) {
        this.material = material;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
}
