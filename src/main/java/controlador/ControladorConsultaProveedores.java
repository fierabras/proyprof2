/*
 * Este controlador monitorea las acciones sobre los botones botonNuevoProveedor, botonModificarProveedor,
 * la tabla jTable1 de la instancia fabricaVentanas.ConsultaProveedores
 */
package controlador;

import fabricaVentanas.ConsultaProveedores;
import fabricaVentanas.GeneradorFabricas;
import fabricaVentanas.IFabrica;
import fabricaVentanas.IVista;
import fabricaVentanas.VistaProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class ControladorConsultaProveedores implements ActionListener {

    //Variables para almacenar la instancia de ConsultaProveedores y
    // el indice del registro seleccionado dentro de la tabla JTabl1 de ConsultaProveedores
    private ConsultaProveedores consultaProveedores;
    private int selectedRow;

    // Se asigna el monitoreo a las acciones sobre botonNuevoProveedor, botonModificarProveedor
    // y el registro seleccionado en jTable1 de ConsultaProveedores
    public ControladorConsultaProveedores(ConsultaProveedores consultaProveedores) {
        this.consultaProveedores = consultaProveedores;
        this.consultaProveedores.botonNuevoProveedor.addActionListener(this);
        this.consultaProveedores.botonModificarProveedor.addActionListener(this);
        this.consultaProveedores.jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    selectedRow = consultaProveedores.jTable1.getSelectedRow();
                }
            }
        });
    }

    // Al presionar botonNuevoProveedor o botonModificarProveedor el sistema invoca a la fabrica
    // abstracta y genera las ventanas correspondientes, en este caso, del tipo IVista 
    @Override
    public void actionPerformed(ActionEvent e) {

        if (consultaProveedores.botonNuevoProveedor.isFocusOwner()) {
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            IFabrica iFabrica = GeneradorFabricas.getFabrica("proveedores");
            IVista iVistaP = iFabrica.crearVista();
            iVistaP.iniciar(iVistaP);
        }
        if (consultaProveedores.botonModificarProveedor.isFocusOwner()) {
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            IFabrica iFabrica = GeneradorFabricas.getFabrica("proveedores");
            VistaProveedor vistaProveedor = (VistaProveedor) iFabrica.crearVista();
            vistaProveedor.modificar(consultaProveedores, vistaProveedor, selectedRow);
        }
    }
}
