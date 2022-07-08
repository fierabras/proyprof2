package material;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utilerias.ConexionBD;
import fabrica.VistaConsulta;
import fabrica.VistaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class FormularioMaterial extends javax.swing.JFrame implements VistaFormulario {

    MaterialBO materialBO = new MaterialBO();

    public FormularioMaterial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        campoClaveMaterial = new javax.swing.JTextField();
        campoDescripcion = new javax.swing.JTextField();
        campoPrecio = new javax.swing.JTextField();
        botonGuardarCambio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kardex del material reciclado");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chatarra64x48.png"))); // NOI18N
        jLabel1.setText("   Material");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Clave");

        jLabel3.setText("Descripción");

        jLabel4.setText("Precio");

        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok24x24.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarMouseClicked(evt);
            }
        });

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete24x24.png"))); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });

        campoClaveMaterial.setEditable(false);

        botonGuardarCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok24x24.png"))); // NOI18N
        botonGuardarCambio.setText("Guardar Cambio");
        botonGuardarCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarCambioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGuardarCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCancelar)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoClaveMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(110, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoClaveMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonGuardarCambio)
                    .addComponent(botonCancelar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked
        if ((campoDescripcion.getText().isEmpty()) || (campoPrecio.getText().isEmpty())) {
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes llenar todos los datos para continuar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        materialBO.guardarMaterial(campoDescripcion.getText(), campoPrecio.getText());
        super.dispose();
    }//GEN-LAST:event_botonGuardarMouseClicked

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void botonGuardarCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarCambioMouseClicked
        if ((this.campoDescripcion.getText().isEmpty()) || (this.campoPrecio.getText().isEmpty())) {
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes llenar todos los datos para continuar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        materialBO.actualizarMaterial(campoClaveMaterial.getText(), campoDescripcion.getText(), campoPrecio.getText());
        super.dispose();
    }//GEN-LAST:event_botonGuardarCambioMouseClicked

    @Override
    public void iniciar() {
        this.setVisible(true);
        int ClaveSiguienteProveedor = ConexionBD.obtenerClave("SELECT MAX(CLAVE_MATERIAL) FROM MATERIALES") + 1;
        this.campoClaveMaterial.setText(String.valueOf(ClaveSiguienteProveedor));
        this.botonGuardarCambio.setVisible(false);
    }

    @Override
    public void modificar(VistaConsulta consultaMateriales, VistaFormulario vMaterial, int row) {

        FormularioMaterial formularioMaterial = (FormularioMaterial) vMaterial;
        VistaConsultaMateriales consultaM = (VistaConsultaMateriales) consultaMateriales;

        if (consultaM.tablaMateriales.getSelectedRow() < 0) {
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes seleccionar un material de la lista para modificarlo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            formularioMaterial.dispose();
            return;
        }

        formularioMaterial.setVisible(true);
        String claveMaterial = consultaM.tablaMateriales.getValueAt(row, 0).toString();
        String descripcion = consultaM.tablaMateriales.getValueAt(row, 1).toString();
        String precio = consultaM.tablaMateriales.getValueAt(row, 2).toString();

        formularioMaterial.campoClaveMaterial.setText(claveMaterial);
        formularioMaterial.campoDescripcion.setText(descripcion);
        formularioMaterial.campoPrecio.setText(precio);

        formularioMaterial.botonGuardar.setVisible(false);

        consultaM.tablaMateriales.clearSelection();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonGuardar;
    public javax.swing.JButton botonGuardarCambio;
    public javax.swing.JTextField campoClaveMaterial;
    public javax.swing.JTextField campoDescripcion;
    public javax.swing.JTextField campoPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
