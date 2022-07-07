/*
 * implementación de la fabrica abstracta, es una clase concreta que genera vistas o consultas
 * para proveedores
 */
package proveedor;

import fabrica.Fabrica;
import fabrica.VistaConsulta;
import fabrica.VistaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual

 */
public class FabricaVistasProveedor implements Fabrica {

    @Override
    public VistaFormulario crearVista() {
        return new FormularioProveedor();
    }

    @Override
    public VistaConsulta crearConsulta() {
        return new VistaConsultaProveedores();
    }

}
