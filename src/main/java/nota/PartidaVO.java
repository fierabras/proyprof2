
package nota;

import material.MaterialVO;


public class PartidaVO {
    private int claveNota;
    private int clavePartida;
    private String uuidNota;
    private String uuidPartida;
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

    public String getUuidNota() {
        return uuidNota;
    }

    public void setUuidNota(String uuidNota) {
        this.uuidNota = uuidNota;
    }

    public String getUuidPartida() {
        return uuidPartida;
    }

    public void setUuidPartida(String uuidPartida) {
        this.uuidPartida = uuidPartida;
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
