/*
* Este controlador implementa un ActionListener sobre los botones de la vista.VentanaPrincipal
*/
package controlador;

import Ventanas.GeneradorFabricas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Ventanas.VentanaPrincipal;
import Ventanas.InterfazConsulta;
import Ventanas.InterfazFabrica;

/**
 * Autor: Jesus Armando Mendoza Romero
 * a171117
 */
public class ControladorVentanaPrincipal implements ActionListener {
    
    // variable que almacena la instancia de VentanaPrincipal
    private VentanaPrincipal ventanaPrincipal;   

    // implementación del ActionListener sobre los botones: botonProveedores y botonMateriales
    // de la VentanaPrincipal
    public ControladorVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;        
        this.ventanaPrincipal.botonProveedores.addActionListener(this);
        this.ventanaPrincipal.botonMateriales.addActionListener(this);
    }
    
    // este método dispara al generador de fabricas abstractas e inicia las consultas de
    // proveedores o materiales dependiendo del boton presionado
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (ventanaPrincipal.botonProveedores.isFocusOwner()){                           
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            InterfazFabrica iFabrica = GeneradorFabricas.getFabrica("proveedores");
            InterfazConsulta iConsultaP = iFabrica.crearConsulta();            
            iConsultaP.iniciar(iConsultaP);            
        }
        if (ventanaPrincipal.botonMateriales.isFocusOwner()){                           
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            InterfazFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            InterfazConsulta iConsultaM = iFabrica.crearConsulta();
            iConsultaM.iniciar(iConsultaM);
        }
    }
    
}
