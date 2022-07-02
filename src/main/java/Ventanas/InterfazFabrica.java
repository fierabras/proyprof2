/*
 * interface de la fabrica abstracta, se implementa en las clases FabricaProveedor y FabricaMaterial
 */
package Ventanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public interface InterfazFabrica {

    public InterfazVista crearVista();

    public InterfazConsulta crearConsulta();

}
