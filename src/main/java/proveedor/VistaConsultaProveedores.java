
package proveedor;

import java.awt.event.KeyEvent;
import fabrica.VistaConsulta;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class VistaConsultaProveedores extends javax.swing.JFrame implements VistaConsulta {

    ProveedorBO proveedorBO = new ProveedorBO();
    
    public VistaConsultaProveedores() {
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
        tablaProveedores = new javax.swing.JTable();

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

        tablaProveedores.setAutoCreateRowSorter(true);
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProveedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaProveedores);

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


    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        proveedorBO.cargarTabla(tablaProveedores, this.txbBuscar.getText());
    }//GEN-LAST:event_botonBuscarMouseClicked
   
    private void txbBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            proveedorBO.cargarTabla(tablaProveedores, this.txbBuscar.getText());
        }
    }//GEN-LAST:event_txbBuscarKeyPressed

    private void botonActualizarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarConsultaMouseClicked
        proveedorBO.cargarTabla(tablaProveedores, this.txbBuscar.getText());
    }//GEN-LAST:event_botonActualizarConsultaMouseClicked

    @Override
    public void iniciar() {      
        this.setVisible(true);
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        ControladorProveedor controladorConsultaProveedores = new ControladorProveedor(this);
        proveedorBO.cargarTabla(tablaProveedores, this.txbBuscar.getText());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonActualizarConsulta;
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonModificarProveedor;
    public javax.swing.JButton botonNuevoProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaProveedores;
    public javax.swing.JTextField txbBuscar;
    // End of variables declaration//GEN-END:variables

}
