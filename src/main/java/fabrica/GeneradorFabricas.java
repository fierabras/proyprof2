/*
 * Esta clase genera las fabricas que producen las ventanas de proveedores o materiales
 */
package fabrica;

import proveedor.FabricaVistasProveedor;
import material.FabricaVistasMaterial;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual 
 */
public class GeneradorFabricas {

    // el método obtenerFabrica recibe como parametro un String que indica el tipo de fabrica a generar
    public static Fabrica obtenerFabrica(String param) {
        if (param == "proveedores") {
            return new FabricaVistasProveedor();
        }
        if (param == "materiales") {
            return new FabricaVistasMaterial();
        }
        return null;
    }

}
