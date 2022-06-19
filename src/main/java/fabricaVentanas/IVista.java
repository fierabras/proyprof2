/*
 * interface IVista que contiene los metodos iniciar y modificar vista
 * se implementa en VistaMaterial y VistaProveedor tanto para realizar inseciones
 * como para modificar registros seleccionados en el Jtable correspondiente
 */
package fabricaVentanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public interface IVista {

    public void iniciar(IVista vista);

    public void modificar(IConsulta consulta, IVista vista, int row);

}
