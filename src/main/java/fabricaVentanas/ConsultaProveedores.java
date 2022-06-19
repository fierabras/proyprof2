/*
 * Este JFrame muestra el listado de todos los proveedores:
 * Permite la busqueda y filtrado por cualquier indicio en los campos de la tabla proveedores
 * Ofrece la posibilidad de agregar o modificar proveedores en la base de datos
 * Cuenta con la funcion de actualizar la consulta en caso de modificaciones a la base
 */
package fabricaVentanas;

import controlador.ControladorConsultaProveedores;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionSQL;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class ConsultaProveedores extends javax.swing.JFrame implements IConsulta {

    // constructor
    public ConsultaProveedores() {
        initComponents();
    }

    // codigo autogenerado
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonNuevoProveedor = new javax.swing.JButton();
        txbBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonModificarProveedor = new javax.swing.JButton();
        botonActualizarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de proveedores");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        botonNuevoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addUser24x24.png"))); // NOI18N
        botonNuevoProveedor.setText("Nuevo Proveedor");

        txbBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txbBuscarKeyPressed(evt);
            }
        });

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search32x32.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });

        botonModificarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alterUser24x24.png"))); // NOI18N
        botonModificarProveedor.setText("Modificar Proveedor");

        botonActualizarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh24x24.png"))); // NOI18N
        botonActualizarConsulta.setText("Actualizar");
        botonActualizarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarConsultaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonNuevoProveedor)
                .addGap(28, 28, 28)
                .addComponent(botonModificarProveedor)
                .addGap(40, 40, 40)
                .addComponent(botonActualizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(txbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBuscar)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevoProveedor)
                    .addComponent(txbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(botonModificarProveedor)
                    .addComponent(botonActualizarConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Tipo de ID", "Folio de ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Controlador del boton buscar: realiza la búsqueda o filtrado de proveedores
    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        consultarTabla();
    }//GEN-LAST:event_botonBuscarMouseClicked
    // Controlador del cuadro de texto Buscar: realiza la búsqueda o filtrado de proveedores al presionar la tecla enter
    private void txbBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            consultarTabla();
        }
    }//GEN-LAST:event_txbBuscarKeyPressed
    // controlador que actualiza el JTable1 para mostrar los cambios en la base de datos
    private void botonActualizarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarConsultaMouseClicked
        consultarTabla();
    }//GEN-LAST:event_botonActualizarConsultaMouseClicked

    // Este método es llamado desde el controlador de la VentanaPrincipal, recibe la ventana de consulta de proveedores
    // generada en la fabrica abstracta. Adicionalmente inicia un controlador (controladorConsultaProveedores)
    // para monitorear la accion sobre los botones de agregar y modificar proveedor
    @Override
    public void iniciar(IConsulta consultaP) {
        ConsultaProveedores consultaProveedores = (ConsultaProveedores) consultaP;
        consultaProveedores.setVisible(true);
        consultaProveedores.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        ControladorConsultaProveedores controladorConsultaProveedores = new ControladorConsultaProveedores(consultaProveedores);
        consultaProveedores.consultarTabla();
    }

    // Este método actualiza el Jtable1, se utiliza tambien para la búsqueda y filtrado de registros
    public void consultarTabla() {
        //Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        //Conectar a la base
        String sql = "SELECT * FROM PROVEEDORES WHERE CLAVEPROVEEDOR LIKE '%" + txbBuscar.getText() + "%' OR NOMBRE LIKE '%" + txbBuscar.getText()
                + "%' OR TIPOID LIKE '%" + txbBuscar.getText() + "%' OR FOLIOID LIKE '%" + txbBuscar.getText() + "%'";

        try (Connection conn = ConexionSQL.getConexion();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String claveProveedor = String.valueOf(rs.getInt("claveProveedor"));
                String nombre = rs.getString("nombre");
                String tipoId = rs.getString("tipoId");
                String folioId = rs.getString("folioId");

                String tbData[] = {claveProveedor, nombre, tipoId, folioId};
                DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

                tblModel.addRow(tbData);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonActualizarConsulta;
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonModificarProveedor;
    public javax.swing.JButton botonNuevoProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField txbBuscar;
    // End of variables declaration//GEN-END:variables

}
