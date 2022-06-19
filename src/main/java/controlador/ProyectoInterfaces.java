/*
 * Esta es la clase principal donde inicia el programa, inicia el controlador
 * para dar seguimiento a las acciones sobre los botones de la ventana principal
 */
package controlador;

import vista.VentanaPrincipal;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class ProyectoInterfaces {

    public static void main(String[] args) {

        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        ControladorVentanaPrincipal controlVentanaPrincipal = new ControladorVentanaPrincipal(ventanaPrincipal);
    }

}
