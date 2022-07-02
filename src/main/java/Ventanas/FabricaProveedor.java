/*
 * implementación de la fabrica abstracta, es una clase concreta que genera vistas o consultas
 * para proveedores
 */
package Ventanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class FabricaProveedor implements InterfazFabrica {

    @Override
    public InterfazVista crearVista() {
        return new FormularioProveedor();
    }

    @Override
    public InterfazConsulta crearConsulta() {
        return new ConsultaProveedores();
    }

}
