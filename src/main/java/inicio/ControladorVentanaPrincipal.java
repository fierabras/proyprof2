/*
* Este controlador implementa un ActionListener sobre los botones de la vista.VistaPrincipal
*/
package inicio;

import fabrica.GeneradorFabricas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import fabrica.Fabrica;
import fabrica.VistaConsulta;

/**
 * @author: Jesus Armando Mendoza Romero a171117
 */
public class ControladorVentanaPrincipal implements ActionListener {
    
    // variable que almacena la instancia de VistaPrincipal
    private VistaPrincipal ventanaPrincipal;   

    // implementación del ActionListener sobre los botones: botonProveedores y botonMateriales
    // de la VistaPrincipal
    public ControladorVentanaPrincipal(VistaPrincipal ventanaPrincipal) {
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
            Fabrica iFabrica = GeneradorFabricas.getFabrica("proveedores");
            VistaConsulta iConsultaP = iFabrica.crearConsulta();            
            iConsultaP.iniciar(iConsultaP);            
        }
        if (ventanaPrincipal.botonMateriales.isFocusOwner()){                           
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            Fabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            VistaConsulta iConsultaM = iFabrica.crearConsulta();
            iConsultaM.iniciar(iConsultaM);
        }
    }
    
}
