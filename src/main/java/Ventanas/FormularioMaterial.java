/*
 * Esta clase despliega una ventana para el registro o modificacion de un material
 */
package fabricaVentanas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.ConexionSQL;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 * Materia: Diseño de Intefases Docente: Ing.Mario Andres Cuevas Gutierrez
 */
public class VistaMaterial extends javax.swing.JFrame implements IVista {

    //constructor
    public VistaMaterial() {
        initComponents();
    }

    //codigo autogenerado
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
        txbClaveMaterial = new javax.swing.JTextField();
        txbDescripcion = new javax.swing.JTextField();
        txbPrecio = new javax.swing.JTextField();
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

        txbClaveMaterial.setEditable(false);

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
                            .addComponent(txbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbClaveMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(110, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbClaveMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonGuardarCambio)
                    .addComponent(botonCancelar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Controlador de acciones del boton guardar, solicita la conexion a la base de datos
    // y envía la orden para la insercion del registro
    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked
        if((txbDescripcion.getText().isEmpty())||(txbPrecio.getText().isEmpty())){
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes llenar todos los datos para continuar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        }        
        ConexionSQL conn = ConexionSQL.getConexionSQL();
        String cmd = "INSERT INTO MATERIALES (DESCRIPCION,PRECIO) VALUES ('" + txbDescripcion.getText() + "','" + txbPrecio.getText() + "')";
        conn.insert(cmd);
        super.dispose();
    }//GEN-LAST:event_botonGuardarMouseClicked

    // controlador del boton Cancelar, cierra la vista en pantalla
    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        super.dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    //controlador del boton guardar cambios, solicita la conexion a la base de datos
    // y ordena un update a la base
    private void botonGuardarCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarCambioMouseClicked
        if((txbDescripcion.getText().isEmpty())||(txbPrecio.getText().isEmpty())){
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes llenar todos los datos para continuar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        }         
        ConexionSQL conn = ConexionSQL.getConexionSQL();
        String cmd = "UPDATE MATERIALES SET DESCRIPCION='" + txbDescripcion.getText() + "',PRECIO='"
                + txbPrecio.getText() + "' WHERE CLAVEMATERIAL=" + txbClaveMaterial.getText();
        conn.update(cmd);
        super.dispose();
    }//GEN-LAST:event_botonGuardarCambioMouseClicked

    // Metodo inciar: se implementa de la interface IVista, recibe la ventana generada por la fabrica
    // abstracta contenida en el controlador ControladorConsultaMateriales. Se conecta a la base de datos
    // para obtener la clave del ultimo registro en la tabla Materiales para mostrar la clave del siguiente
    // material
    @Override
    public void iniciar(IVista vistaM) {
        VistaMaterial vistaMaterial = (VistaMaterial) vistaM;
        vistaMaterial.setVisible(true);
        int ClaveSiguienteProveedor = ConexionSQL.obtenerClave("SELECT MAX(CLAVEMATERIAL) FROM MATERIALES") + 1;
        vistaMaterial.txbClaveMaterial.setText(String.valueOf(ClaveSiguienteProveedor));
        vistaMaterial.botonGuardarCambio.setVisible(false);
    }

    // Metodo modificar: se implementa de la interface IVista, recibe la ventana generada por la fabrica
    // abstracta contenida en el controlador ControladorConsultaMateriales, la consulta de materiales y
    // el indice del registro seleccionado dentro del Jtable1
    @Override
    public void modificar(IConsulta consultaMateriales, IVista vMaterial, int row) {

        VistaMaterial vistaMaterial = (VistaMaterial) vMaterial;
        ConsultaMateriales consultaM = (ConsultaMateriales) consultaMateriales;

        if (consultaM.jTable1.getSelectedRow() < 0) {
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes seleccionar un material de la lista para modificarlo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            vistaMaterial.dispose();
            return;
        }

        vistaMaterial.setVisible(true);        
        String claveMaterial = consultaM.jTable1.getValueAt(row, 0).toString();
        String descripcion = consultaM.jTable1.getValueAt(row, 1).toString();
        String precio = consultaM.jTable1.getValueAt(row, 2).toString();

        vistaMaterial.txbClaveMaterial.setText(claveMaterial);
        vistaMaterial.txbDescripcion.setText(descripcion);
        vistaMaterial.txbPrecio.setText(precio);

        vistaMaterial.botonGuardar.setVisible(false);

        consultaM.jTable1.clearSelection();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonGuardar;
    public javax.swing.JButton botonGuardarCambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txbClaveMaterial;
    public javax.swing.JTextField txbDescripcion;
    public javax.swing.JTextField txbPrecio;
    // End of variables declaration//GEN-END:variables

}
