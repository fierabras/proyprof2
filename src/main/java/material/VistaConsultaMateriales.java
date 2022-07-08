package material;

import java.awt.event.KeyEvent;
import fabrica.VistaConsulta;

/**
 * @autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class VistaConsultaMateriales extends javax.swing.JFrame implements VistaConsulta {

    private int selectedRow;
    MaterialBO materialBO = new MaterialBO();
    
    public VistaConsultaMateriales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botonNuevoMaterial = new javax.swing.JButton();
        campoBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonModificarMaterial = new javax.swing.JButton();
        botonActualizarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMateriales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de materiales reciclados");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        botonNuevoMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add24x24.png"))); // NOI18N
        botonNuevoMaterial.setText("Nuevo Material");

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
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(botonModificarMaterial)
                    .addComponent(botonActualizarConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaMateriales.setAutoCreateRowSorter(true);
        tablaMateriales.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaMateriales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaMateriales);

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


    private void botonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseClicked
        materialBO.cargarTabla(this.tablaMateriales, this.campoBuscar.getText());
    }//GEN-LAST:event_botonBuscarMouseClicked

    private void campoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            materialBO.cargarTabla(this.tablaMateriales, this.campoBuscar.getText());
        }
    }//GEN-LAST:event_campoBuscarKeyPressed

    private void botonActualizarConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarConsultaMouseClicked
        materialBO.cargarTabla(this.tablaMateriales, this.campoBuscar.getText());
    }//GEN-LAST:event_botonActualizarConsultaMouseClicked

    @Override
    public void iniciar() {
        this.setVisible(true);
        this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        ControladorMaterial controladorMaterial = new ControladorMaterial(this);
        materialBO.cargarTabla(this.tablaMateriales, this.campoBuscar.getText());  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonActualizarConsulta;
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonModificarMaterial;
    public javax.swing.JButton botonNuevoMaterial;
    public javax.swing.JTextField campoBuscar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaMateriales;
    // End of variables declaration//GEN-END:variables
}
