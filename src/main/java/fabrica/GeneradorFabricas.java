/*
 * Esta clase genera las fabricas que producen las ventanas de proveedores o materiales
 */
package fabrica;

import proveedores.FabricaProveedor;
import materiales.FabricaMaterial;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual 
 */
public class GeneradorFabricas {

    // el método getFabrica recibe como parametro un String que indica el tipo de fabrica a generar
    public static Fabrica getFabrica(String param) {
        if (param == "proveedores") {
            return new FabricaProveedor();
        }
        if (param == "materiales") {
            return new FabricaMaterial();
        }
        return null;
    }

}
