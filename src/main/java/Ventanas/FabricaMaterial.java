/*
 * implementación de la fabrica abstracta, es una clase concreta que genera vistas o consultas
 * para materiales
 */
package Ventanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class FabricaMaterial implements InterfazFabrica {

    @Override
    public InterfazVista crearVista() {
        return new FormularioMaterial();
    }

    @Override
    public InterfazConsulta crearConsulta() {
        return new ConsultaMateriales();
    }

}
