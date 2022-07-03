/*
 * interface de la fabrica abstracta, se implementa en las clases FabricaProveedor y FabricaMaterial
 */
package fabricaVentanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual

 */
public interface IFabrica {

    public IVentanaFormulario crearVista();

    public IVentanaConsulta crearConsulta();

}
