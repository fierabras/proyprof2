/*
 * interface de la fabrica abstracta, se implementa en las clases FabricaProveedor y FabricaMaterial
 */
package fabrica;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual

 */
public interface Fabrica {

    public VentanaFormulario crearVista();

    public VentanaConsulta crearConsulta();

}
