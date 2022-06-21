/*
 * Este JFrame muestra el listado de todos los materiales:
 * Permite la busqueda y filtrado por cualquier indicio en los campos de la tabla Materiales
 * Ofrece la posibilidad de agregar o modificar materiales en la base de datos
 * Cuenta con la funcion de actualizar la consulta en caso de modificaciones a la base
 */
package fabricaVentanas;

import controlador.ControladorConsultaMateriales;
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
public class ConsultaMateriales extends javax.swing.JFrame implements IConsulta {

    // constructor
    public ConsultaMateriales() {
        initComponents();
    }

    // Codigo autogenerado
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botonNuevoMaterial = new javax.swing.JButton();
        txbBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonModificarMaterial = new javax.swing.JButton();
        botonActualizarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de materiales reciclados");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        botonNuevoMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add24x24.png"))); // NOI18N
        botonNuevoMaterial.setText("Nuevo Material");

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

        botonModificarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit24x24.png"))); // NOI18N
        botonModificarMaterial.setText("Modificar Material");

        botonActualizarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh24x24.png"))); // NOI18N
        botonActualizarConsulta.setText("Actualizar");
        botonActualizarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarConsultaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(botonNuevoMaterial)
                .addGap(27, 27, 27)
                .addComponent(botonModificarMaterial)
                .addGap(34, 34, 34)
                .addComponent(botonActualizarConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscar)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevoMaterial)
                    .addComponent(txbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(botonModificarMaterial)
                    .addComponent(botonActualizarConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Descripción", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // controlador de botonBuscar
    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        consultarTabla();

    }//GEN-LAST:event_botonBuscarMouseClicked
    // controlador que ejecuta la búsqueda o filtrado al presionar la tecla enter en el cuadro de búsqueda
    private void txbBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            consultarTabla();
        }
    }//GEN-LAST:event_txbBuscarKeyPressed

    // controlador que actualiza el JTable1 para mostrar los cambios en la base de datos
    private void botonActualizarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarConsultaMouseClicked
        consultarTabla();
    }//GEN-LAST:event_botonActualizarConsultaMouseClicked

    // Este método es llamado desde el controlador de la VentanaPrincipal, recibe la ventana de consulta de materiales
    // generada en la fabrica abstracta. Adicionalmente inicia un controlador (controladorConsultaMateriales)
    // para monitorear la accion sobre los botones de agregar y modificar material
    @Override
    public void iniciar(IConsulta consultaM) {
        ConsultaMateriales consultaMateriales = (ConsultaMateriales) consultaM;
        consultaMateriales.setVisible(true);
        consultaMateriales.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        ControladorConsultaMateriales controladorConsultaMateriales = new ControladorConsultaMateriales(consultaMateriales);
        consultaMateriales.consultarTabla();
    }

    // Este método actualiza el Jtable1, se utiliza tambien para la búsqueda y filtrado de registros
    public void consultarTabla() {

        //Limpiar la tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        // Conectar a la base
        String sql = "SELECT * FROM MATERIALES WHERE CLAVEMATERIAL LIKE '%" + txbBuscar.getText() + "%' OR DESCRIPCION LIKE '%" + txbBuscar.getText()
                + "%' OR PRECIO LIKE '%" + txbBuscar.getText() + "%'";

        try (Connection conn = ConexionSQL.getConexion();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String claveMaterial = String.valueOf(rs.getInt("claveMaterial"));
                String descripcion = rs.getString("descripcion");
                String precio = String.valueOf(rs.getString("precio"));

                String tbData[] = {claveMaterial, descripcion, precio};
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
    public javax.swing.JButton botonModificarMaterial;
    public javax.swing.JButton botonNuevoMaterial;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField txbBuscar;
    // End of variables declaration//GEN-END:variables
}
