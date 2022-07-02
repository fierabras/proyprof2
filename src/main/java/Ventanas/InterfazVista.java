/*
 * interface InterfazVista que contiene los metodos iniciar y modificar vista
 * se implementa en VistaMaterial y VistaProveedor tanto para realizar inseciones
 * como para modificar registros seleccionados en el Jtable correspondiente
 */
package Ventanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public interface InterfazVista {

    public void iniciar(InterfazVista vista);

    public void modificar(InterfazConsulta consulta, InterfazVista vista, int row);

}
