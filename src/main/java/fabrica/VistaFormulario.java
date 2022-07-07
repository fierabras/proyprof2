/*
 * interface VistaFormulario que contiene los metodos iniciar y modificar vista
 * se implementa en VistaMaterial y VistaProveedor tanto para realizar inseciones
 * como para modificar registros seleccionados en el Jtable correspondiente
 */
package fabrica;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual

 */
public interface VistaFormulario {

    public void iniciar();
    public void modificar(VistaConsulta consulta, VistaFormulario vista, int row);

}
