
package proveedor;

import utilerias.ConexionBD;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import fabrica.VistaConsulta;
import fabrica.VistaFormulario;

/**
 * Autor: Jesus Armando Mendoza Romero a171117
 */

public class FormularioProveedor extends javax.swing.JFrame implements VistaFormulario {


    public FormularioProveedor() {
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


    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked
        this.guardar();
        super.dispose();        
    }//GEN-LAST:event_botonGuardarMouseClicked
    
    public void guardar(){
        if((txbNombre.getText().isEmpty())||(txbfolioId.getText().isEmpty())){
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes llenar todos los datos para continuar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        
        ConexionBD conn = ConexionBD.getConexionSQL();
        String cmd = "INSERT INTO PROVEEDORES (NOMBRE,TIPO_IDENTIFICACION,NUMERO_IDENTIFICACION) VALUES ('" + txbNombre.getText()
                + "','" + comboTipoId.getSelectedItem() + "','" + txbfolioId.getText() + "')";
        conn.insert(cmd);
    }



    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        super.dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked


    private void botonGuardarCambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarCambioMouseClicked
        this.guardarCambio();
        super.dispose();
    }//GEN-LAST:event_botonGuardarCambioMouseClicked
    
    public void guardarCambio(){
        if((this.txbNombre.getText().isEmpty())||(this.txbfolioId.getText().isEmpty())){
            JFrame frame = null;
            JOptionPane.showMessageDialog(frame, "Debes llenar todos los datos para continuar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        ConexionBD conn = ConexionBD.getConexionSQL();
        String cmd = "UPDATE PROVEEDORES SET NOMBRE='" + txbNombre.getText() + "',TIPO_IDENTIFICACION='"
                + comboTipoId.getSelectedItem() + "', NUMERO_IDENTIFICACION='" + txbfolioId.getText()
                + "' WHERE CLAVE_PROVEEDOR=" + txbClaveProveedor.getText();
        conn.update(cmd);
    }
       
    @Override
    public void iniciar() {
        this.setVisible(true);
        int ClaveSiguienteProveedor = ConexionBD.obtenerClave("SELECT MAX(CLAVE_PROVEEDOR) FROM PROVEEDORES")+1;
        this.txbClaveProveedor.setText(String.valueOf(ClaveSiguienteProveedor));        
        this.botonGuardarCambio.setVisible(false);  
    }    
    
    @Override
    public void modificar(VistaConsulta consultaProveedores, VistaFormulario vProveedor, int row) {
                
        FormularioProveedor vistaProveedor = (FormularioProveedor)vProveedor;        
        VistaConsultaProveedores consultaP = (VistaConsultaProveedores) consultaProveedores;
        
        if (consultaP.tablaProveedores.getSelectedRow()<0){
            JFrame frame=null;
            JOptionPane.showMessageDialog(frame, "Debes seleccionar un proveedor de la lista para modificarlo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);            
            vistaProveedor.dispose();
            return;            
        }
        
        vistaProveedor.setVisible(true);

        String claveProveedor = consultaP.tablaProveedores.getValueAt(row, 0).toString();
        String nombre = consultaP.tablaProveedores.getValueAt(row, 1).toString();
        String tipoId = consultaP.tablaProveedores.getValueAt(row, 2).toString();
        String folioId = consultaP.tablaProveedores.getValueAt(row, 3).toString();

        vistaProveedor.txbClaveProveedor.setText(claveProveedor);
        vistaProveedor.txbNombre.setText(nombre);
        vistaProveedor.comboTipoId.setSelectedItem(tipoId);
        vistaProveedor.txbfolioId.setText(folioId);
        vistaProveedor.botonGuardar.setVisible(false);        
        
        consultaP.tablaProveedores.clearSelection();
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
