/*
 * implementación de la fabrica abstracta, es una clase concreta que genera vistas o consultas
 * para proveedores
 */
package proveedores;

import fabrica.Fabrica;
import fabrica.VentanaConsulta;
import fabrica.VentanaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual

 */
public class FabricaProveedor implements Fabrica {

    @Override
    public VentanaFormulario crearVista() {
        return new FormularioProveedor();
    }

    @Override
    public VentanaConsulta crearConsulta() {
        return new ConsultaProveedores();
    }

}
