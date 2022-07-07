/*
 * Esta es la clase principal donde inicia el programa, inicia el controlador
 * para dar seguimiento a las acciones sobre los botones de la ventana principal
 */
package inicio;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual 
 */
public class Main {

    public static void main(String[] args) {

        VistaPrincipal ventanaPrincipal = new VistaPrincipal();
        ventanaPrincipal.setVisible(true);     
        ControladorVentanaPrincipal controlVentanaPrincipal = new ControladorVentanaPrincipal(ventanaPrincipal);
    }

}
