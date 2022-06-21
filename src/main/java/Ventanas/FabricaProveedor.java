/*
 * implementación de la fabrica abstracta, es una clase concreta que genera vistas o consultas
 * para proveedores
 */
package fabricaVentanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class FabricaProveedor implements IFabrica {

    @Override
    public IVista crearVista() {
        return new VistaProveedor();
    }

    @Override
    public IConsulta crearConsulta() {
        return new ConsultaProveedores();
    }

}
