/*
* Este controlador implementa un ActionListener sobre los botones de la vista.VentanaPrincipal
*/
package inicio;

import fabricaVentanas.GeneradorFabricas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import fabricaVentanas.VentanaPrincipal;
import fabricaVentanas.IVentanaConsulta;
import fabricaVentanas.IFabrica;

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
            IFabrica iFabrica = GeneradorFabricas.getFabrica("proveedores");
            IVentanaConsulta iConsultaP = iFabrica.crearConsulta();            
            iConsultaP.iniciar(iConsultaP);            
        }
        if (ventanaPrincipal.botonMateriales.isFocusOwner()){                           
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            IFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            IVentanaConsulta iConsultaM = iFabrica.crearConsulta();
            iConsultaM.iniciar(iConsultaM);
        }
    }
    
}
