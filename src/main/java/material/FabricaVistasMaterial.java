/*
 * implementación de la fabrica abstracta, es una clase concreta que genera vistas o consultas
 * para materiales
 */
package material;

import fabrica.Fabrica;
import fabrica.VistaConsulta;
import fabrica.VistaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class FabricaVistasMaterial implements Fabrica {

    @Override
    public VistaFormulario crearVista() {
        return new FormularioMaterial();
    }

    @Override
    public VistaConsulta crearConsulta() {
        return new VistaConsultaMateriales();
    }

}
