/*
 * implementación de la fabrica abstracta, es una clase concreta que genera vistas o consultas
 * para materiales
 */
package materiales;

import fabrica.Fabrica;
import fabrica.VentanaConsulta;
import fabrica.VentanaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class FabricaMaterial implements Fabrica {

    @Override
    public VentanaFormulario crearVista() {
        return new FormularioMaterial();
    }

    @Override
    public VentanaConsulta crearConsulta() {
        return new ConsultaMateriales();
    }

}
