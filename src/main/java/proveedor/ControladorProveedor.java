/*
 * Este controlador monitorea las acciones sobre los botones botonNuevoProveedor, botonModificarProveedor,
 * la tabla tablaProveedores de la instancia fabricaVentanas.VistaConsultaProveedores
 */
package proveedor;

import proveedor.VistaConsultaProveedores;
import fabrica.GeneradorFabricas;
import proveedor.FormularioProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import fabrica.Fabrica;
import fabrica.VistaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual 
 */
public class ControladorProveedor implements ActionListener {

    //Variables para almacenar la instancia de VistaConsultaProveedores y
    // el indice del registro seleccionado dentro de la tabla JTabl1 de VistaConsultaProveedores
    private VistaConsultaProveedores consultaProveedores;
    private int selectedRow;

    // Se asigna el monitoreo a las acciones sobre botonNuevoProveedor, botonModificarProveedor
    // y el registro seleccionado en tablaProveedores de VistaConsultaProveedores
    public ControladorProveedor(VistaConsultaProveedores consultaProveedores) {
        this.consultaProveedores = consultaProveedores;
        this.consultaProveedores.botonNuevoProveedor.addActionListener(this);
        this.consultaProveedores.botonModificarProveedor.addActionListener(this);
        this.consultaProveedores.tablaProveedores.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) {
                    selectedRow = consultaProveedores.tablaProveedores.getSelectedRow();
                }
            }
        });
    }

    // Al presionar botonNuevoProveedor o botonModificarProveedor el sistema invoca a la fabrica
    // abstracta y genera las ventanas correspondientes, en este caso, del tipo VistaFormulario 
    @Override
    public void actionPerformed(ActionEvent e) {

        if (consultaProveedores.botonNuevoProveedor.isFocusOwner()) {
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            Fabrica iFabrica = GeneradorFabricas.obtenerFabrica("proveedores");
            VistaFormulario iVistaP = iFabrica.crearVista();
            iVistaP.iniciar();
        }
        if (consultaProveedores.botonModificarProveedor.isFocusOwner()) {
            // se implementa el modelo abstract factory para la generacion de consultas y vistas
            Fabrica iFabrica = GeneradorFabricas.obtenerFabrica("proveedores");
            FormularioProveedor vistaProveedor = (FormularioProveedor) iFabrica.crearVista();
            vistaProveedor.modificar(consultaProveedores, vistaProveedor, selectedRow);
        }
    }
}
