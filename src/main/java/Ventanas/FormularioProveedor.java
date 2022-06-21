/*
 * Esta clase despliega una ventana para el registro o modificacion de un proveedor
 */
package fabricaVentanas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

/**
 * Autor: Jesus Armando Mendoza Romero
 * a171117
 * Ingenieria en Software Virtual
 * Materia: Diseño de Intefases
 * Docente: Ing.Mario Andres Cuevas Gutierrez
 */

public class VistaProveedor extends javax.swing.JFrame implements IVista {

    //constructor
    public VistaProveedor() {
        initComponents();
    }

    // codigo autogenerado
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        txbClaveProveedor = new javax.swing.JTextField();
        txbNombre = new javax.swing.JTextField();
        txbfolioId = new javax.swing.JTextField();
        comboTipoId = new javax.swing.JComboBox<>();
        botonGuardarCambio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kardex del proveedor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/persona48x48.png"))); // NOI18N
        jLabel1.setText("   Proveedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Clave");

        jLabel3.setText("Nombre");

        jLabel4.setText("TipoId");

        jLabel5.setText("Numero de Id");

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

        txbClaveProveedor.setEditable(false);

        comboTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IFE", "LICENCIA", "PASAPORTE" }));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbClaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbfolioId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(botonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardarCambio)
                        .addGap(64, 64, 64)
                        .addComponent(botonCancelar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbClaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comboTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txbfolioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonCancelar)
                    .addComponent(botonGuardarCambio))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Controlador de acciones del boton guardar, solicita la conexion a la base de datos
    // y envía la orden para la insercion del registro
    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked
        if((txbNombre.getText().isEmpty())||(txbfolioId.getText().isEmpty())){
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes llenar todos los datos para continuar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        
        ConexionSQL conn = ConexionSQL.getConexionSQL();
        String cmd = "INSERT INTO PROVEEDORES (NOMBRE,TIPOID,FOLIOID) VALUES ('" + txbNombre.getText()
                + "','" + comboTipoId.getSelectedItem() + "','" + txbfolioId.getText() + "')";
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
        if((txbNombre.getText().isEmpty())||(txbfolioId.getText().isEmpty())){
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes llenar todos los datos para continuar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        ConexionSQL conn = ConexionSQL.getConexionSQL();
        String cmd = "UPDATE PROVEEDORES SET NOMBRE='" + txbNombre.getText() + "',TIPOID='"
                + comboTipoId.getSelectedItem() + "', FOLIOID='" + txbfolioId.getText()
                + "' WHERE CLAVEPROVEEDOR=" + txbClaveProveedor.getText();
        conn.update(cmd);
        super.dispose();
    }//GEN-LAST:event_botonGuardarCambioMouseClicked

    // Metodo inciar: se implementa de la interface IVista, recibe la ventana generada por la fabrica
    // abstracta contenida en el controlador ControladorConsultaProveedores. Se conecta a la base de datos
    // para obtener la clave del ultimo registro en la tabla Proveedores para mostrar la clave del siguiente
    // material
    @Override
    public void iniciar(IVista vistaP) {
        VistaProveedor vistaProveedor = (VistaProveedor)vistaP;
        vistaProveedor.setVisible(true);
        int ClaveSiguienteProveedor = ConexionSQL.obtenerClave("SELECT MAX(CLAVEPROVEEDOR) FROM PROVEEDORES")+1;
        vistaProveedor.txbClaveProveedor.setText(String.valueOf(ClaveSiguienteProveedor));        
        vistaProveedor.botonGuardarCambio.setVisible(false);  
    }
    
    // Metodo modificar: se implementa de la interface IVista, recibe la ventana generada por la fabrica
    // abstracta contenida en el controlador ControladorConsultaProveedores, la consulta de proveedores y
    // el indice del registro seleccionado dentro del Jtable1
    @Override
    public void modificar(IConsulta consultaProveedores, IVista vProveedor, int row) {
                
        VistaProveedor vistaProveedor = (VistaProveedor)vProveedor;        
        ConsultaProveedores consultaP = (ConsultaProveedores) consultaProveedores;
        
        if (consultaP.jTable1.getSelectedRow()<0){
            JFrame frame=null;
            JOptionPane.showMessageDialog(frame, "Debes seleccionar un proveedor de la lista para modificarlo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);            
            vistaProveedor.dispose();
            return;            
        }
        
        vistaProveedor.setVisible(true);

        String claveProveedor = consultaP.jTable1.getValueAt(row, 0).toString();
        String nombre = consultaP.jTable1.getValueAt(row, 1).toString();
        String tipoId = consultaP.jTable1.getValueAt(row, 2).toString();
        String folioId = consultaP.jTable1.getValueAt(row, 3).toString();

        vistaProveedor.txbClaveProveedor.setText(claveProveedor);
        vistaProveedor.txbNombre.setText(nombre);
        vistaProveedor.comboTipoId.setSelectedItem(tipoId);
        vistaProveedor.txbfolioId.setText(folioId);
        vistaProveedor.botonGuardar.setVisible(false);
        
        
        consultaP.jTable1.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCancelar;
    public javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonGuardarCambio;
    public javax.swing.JComboBox<String> comboTipoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txbClaveProveedor;
    public javax.swing.JTextField txbNombre;
    public javax.swing.JTextField txbfolioId;
    // End of variables declaration//GEN-END:variables
   
}
