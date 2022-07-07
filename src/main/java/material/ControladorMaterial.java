/*
 * Este controlador monitorea las acciones sobre los botones botonNuevoMaterial, botonModificarMaterial,
 * la tabla jTable1 de la instancia fabricaVentanas.VistaConsultaMateriales
 */
package material;

import fabrica.GeneradorFabricas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import fabrica.Fabrica;
import fabrica.VistaFormulario;

/**
 * @author  Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual 
 */
public class ControladorMaterial implements ActionListener {

    private VistaConsultaMateriales consultaMateriales;
    private int selectedRow;


    public ControladorMaterial(VistaConsultaMateriales consultaMateriales) {
        this.consultaMateriales = consultaMateriales;
        this.consultaMateriales.botonNuevoMaterial.addActionListener(this);
        this.consultaMateriales.botonModificarMaterial.addActionListener(this);
        this.consultaMateriales.tablaMateriales.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    selectedRow = consultaMateriales.tablaMateriales.getSelectedRow();
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (consultaMateriales.botonNuevoMaterial.isFocusOwner()) {        
            Fabrica iFabrica = GeneradorFabricas.obtenerFabrica("materiales");
            VistaFormulario iVistaM = iFabrica.crearVista();
            iVistaM.iniciar();
        }

        if (consultaMateriales.botonModificarMaterial.isFocusOwner()) {
            Fabrica iFabrica = GeneradorFabricas.obtenerFabrica("materiales");
            FormularioMaterial vistaMaterial = (FormularioMaterial) iFabrica.crearVista();
            vistaMaterial.modificar(consultaMateriales, vistaMaterial, selectedRow);
        }
    }

}
