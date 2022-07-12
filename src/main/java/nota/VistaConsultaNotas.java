
package nota;

import java.awt.event.KeyEvent;

/**
 *
 * @author paco
 */
public class VistaConsultaNotas extends javax.swing.JFrame {

    
    NotaBO notaBO = new NotaBO();
    
    public VistaConsultaNotas() {
        initComponents();
        notaBO.cargarTabla(tablaNotas, campoBuscar.getText());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonNuevaNota = new javax.swing.JButton();
        campoBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonActualizarConsulta = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        botonNuevaNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add32x32.png"))); // NOI18N
        botonNuevaNota.setText("Nueva Nota");
        botonNuevaNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNuevaNotaMouseClicked(evt);
            }
        });

        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscarKeyPressed(evt);
            }
        });

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search32x32.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBuscarMouseClicked(evt);
            }
        });

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete24x24.png"))); // NOI18N
        botonCancelar.setText("Cancelar Nota");

        botonActualizarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh24x24.png"))); // NOI18N
        botonActualizarConsulta.setText("Actualizar");
        botonActualizarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarConsultaMouseClicked(evt);
            }
        });

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notas32x32.png"))); // NOI18N
        botonConsultar.setText("Consultar Nota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonNuevaNota)
                .addGap(28, 28, 28)
                .addComponent(botonCancelar)
                .addGap(31, 31, 31)
                .addComponent(botonConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(botonActualizarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBuscar)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevaNota)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(botonCancelar)
                    .addComponent(botonConsultar)
                    .addComponent(botonActualizarConsulta))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tablaNotas.setAutoCreateRowSorter(true);
        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave Nota", "Fecha", "Proveedor", "Peso Total", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaNotas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaNotas);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            notaBO.cargarTabla(tablaNotas, campoBuscar.getText());
        }
    }//GEN-LAST:event_campoBuscarKeyPressed

    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        notaBO.cargarTabla(tablaNotas, campoBuscar.getText());
    }//GEN-LAST:event_botonBuscarMouseClicked

    private void botonActualizarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarConsultaMouseClicked
        notaBO.cargarTabla(tablaNotas, campoBuscar.getText());
    }//GEN-LAST:event_botonActualizarConsultaMouseClicked

    private void botonNuevaNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNuevaNotaMouseClicked
        FormularioNota formularioNota = new FormularioNota();
        formularioNota.setVisible(true);
        formularioNota.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_botonNuevaNotaMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonActualizarConsulta;
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonConsultar;
    public javax.swing.JButton botonNuevaNota;
    public javax.swing.JTextField campoBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaNotas;
    // End of variables declaration//GEN-END:variables
}
