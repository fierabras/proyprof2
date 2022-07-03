/*
 * interface IVentanaFormulario que contiene los metodos iniciar y modificar vista
 * se implementa en VistaMaterial y VistaProveedor tanto para realizar inseciones
 * como para modificar registros seleccionados en el Jtable correspondiente
 */
package fabricaVentanas;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual

 */
public interface IVentanaFormulario {

    public void iniciar(IVentanaFormulario vista);

    public void modificar(IVentanaConsulta consulta, IVentanaFormulario vista, int row);

}
