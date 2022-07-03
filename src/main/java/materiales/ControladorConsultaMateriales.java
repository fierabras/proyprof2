/*
 * Este controlador monitorea las acciones sobre los botones botonNuevoMaterial, botonModificarMaterial,
 * la tabla jTable1 de la instancia fabricaVentanas.ConsultaMateriales
 */
package materiales;

import materiales.ConsultaMateriales;
import fabricaVentanas.GeneradorFabricas;
import materiales.FormularioMaterial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import fabricaVentanas.IFabrica;
import fabricaVentanas.IVentanaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 
 */
public class ControladorConsultaMateriales implements ActionListener {

    private ConsultaMateriales consultaMateriales;
    private int selectedRow;


    public ControladorConsultaMateriales(ConsultaMateriales consultaMateriales) {
        this.consultaMateriales = consultaMateriales;
        this.consultaMateriales.botonNuevoMaterial.addActionListener(this);
        this.consultaMateriales.botonModificarMaterial.addActionListener(this);
        this.consultaMateriales.jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    selectedRow = consultaMateriales.jTable1.getSelectedRow();
                }
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (consultaMateriales.botonNuevoMaterial.isFocusOwner()) {        
            IFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            IVentanaFormulario iVistaM = iFabrica.crearVista();
            iVistaM.iniciar(iVistaM);
        }

        if (consultaMateriales.botonModificarMaterial.isFocusOwner()) {
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            IFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            FormularioMaterial vistaMaterial = (FormularioMaterial) iFabrica.crearVista();
            vistaMaterial.modificar(consultaMateriales, vistaMaterial, selectedRow);
        }
    }

}