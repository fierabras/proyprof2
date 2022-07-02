/*
 * Esta clase genera las fabricas que producen las ventanas de proveedores o materiales
 */
package Ventanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class GeneradorFabricas {

    // el método getFabrica recibe como parametro un String que indica el tipo de fabrica a generar
    public static InterfazFabrica getFabrica(String param) {
        if (param == "proveedores") {
            return new FabricaProveedor();
        }
        if (param == "materiales") {
            return new FabricaMaterial();
        }
        return null;
    }

}
