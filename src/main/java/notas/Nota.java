
package notas;

import proveedores.Proveedor;
import java.util.List;


public class Nota {
    public int claveNota;
    public String fecha;
    public Proveedor proveedor = new Proveedor();
    public List<Partida> listaPartidas;
    public double pesoTotal;
    public double total;
}
