/*
 * implementación de la fabrica abstracta, es una clase concreta que genera vistas o consultas
 * para materiales
 */
package materiales;

import fabricaVentanas.IVentanaConsulta;
import fabricaVentanas.IFabrica;
import fabricaVentanas.IVentanaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class FabricaMaterial implements IFabrica {

    @Override
    public IVentanaFormulario crearVista() {
        return new FormularioMaterial();
    }

    @Override
    public IVentanaConsulta crearConsulta() {
        return new ConsultaMateriales();
    }

}
