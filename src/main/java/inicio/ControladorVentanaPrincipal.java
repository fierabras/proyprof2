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

    private VistaPrincipal ventanaPrincipal;

    public ControladorVentanaPrincipal(VistaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.ventanaPrincipal.botonProveedores.addActionListener(this);
        this.ventanaPrincipal.botonMateriales.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (ventanaPrincipal.botonProveedores.isFocusOwner()) {

            Fabrica iFabrica = GeneradorFabricas.obtenerFabrica("proveedores");
            VistaConsulta iConsultaP = iFabrica.crearConsulta();
            iConsultaP.iniciar();
        }
        if (ventanaPrincipal.botonMateriales.isFocusOwner()) {

            Fabrica iFabrica = GeneradorFabricas.obtenerFabrica("materiales");
            VistaConsulta iConsultaM = iFabrica.crearConsulta();
            iConsultaM.iniciar();
        }
    }

}
