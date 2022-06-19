/*
 * Este controlador monitorea las acciones sobre los botones botonNuevoMaterial, botonModificarMaterial,
 * la tabla jTable1 de la instancia fabricaVentanas.ConsultaMateriales
 */
package controlador;

import fabricaVentanas.ConsultaMateriales;
import fabricaVentanas.GeneradorFabricas;
import fabricaVentanas.IFabrica;
import fabricaVentanas.IVista;
import fabricaVentanas.VistaMaterial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class ControladorConsultaMateriales implements ActionListener {

    // Variables para almacenar la instancia de ConsultaMateriales y 
    // el indice del registro seleccionado dentro de la tabla JTable1 de ConsultaMateriales
    private ConsultaMateriales consultaMateriales;
    private int selectedRow;

    // Establecemos el monitoreo sobre los botones y el registro seleccionado en JTable1  
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

    // Al presionar botonNuevoMaterial o botonModificarMaterial el sistema invoca a la fabrica
    // abstracta y genera las ventanas correspondientes, en este caso, del tipo IVista    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (consultaMateriales.botonNuevoMaterial.isFocusOwner()) {
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            IFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            IVista iVistaM = iFabrica.crearVista();
            iVistaM.iniciar(iVistaM);
        }

        if (consultaMateriales.botonModificarMaterial.isFocusOwner()) {
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            IFabrica iFabrica = GeneradorFabricas.getFabrica("materiales");
            VistaMaterial vistaMaterial = (VistaMaterial) iFabrica.crearVista();
            vistaMaterial.modificar(consultaMateriales, vistaMaterial, selectedRow);
        }
    }

}
