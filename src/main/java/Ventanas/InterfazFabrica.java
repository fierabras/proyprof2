/*
 * interface de la fabrica abstracta, se implementa en las clases FabricaProveedor y FabricaMaterial
 */
package fabricaVentanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public interface IFabrica {

    public IVista crearVista();

    public IConsulta crearConsulta();

}
