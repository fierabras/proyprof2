
package nota;

import proveedor.ProveedorVO;
import java.util.List;


public class NotaVO {
    private int claveNota;
    private String fecha;
    private ProveedorVO proveedor = new ProveedorVO();
    private List<PartidaVO> listaPartidas;
    private double pesoTotal;
    private double total;

    public int getClaveNota() {
        return claveNota;
    }

    public void setClaveNota(int claveNota) {
        this.claveNota = claveNota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ProveedorVO getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorVO proveedor) {
        this.proveedor = proveedor;
    }

    public List<PartidaVO> getListaPartidas() {
        return listaPartidas;
    }

    public void setListaPartidas(List<PartidaVO> listaPartidas) {
        this.listaPartidas = listaPartidas;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
    
    
}
