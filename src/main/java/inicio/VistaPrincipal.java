package inicio;

import nota.VistaConsultaNotas;
import reportes.Reporte;

/**
 * Autor: Jesus Armando Mendoza Romero a171117 Ingenieria en Software Virtual
 */
public class VistaPrincipal extends javax.swing.JFrame {

    // Constructor     
    public VistaPrincipal() {
        initComponents();
    }

    // Código autogenerado por Netbeans 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonProveedores = new javax.swing.JButton();
        botonMateriales = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonNotas = new javax.swing.JButton();
        botonReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo48x48.png"))); // NOI18N
        jLabel1.setText("  Colectivo Recolectores del Norte S. C. de R.L. de C.V.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        botonProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/users32x32.png"))); // NOI18N
        botonProveedores.setText("    Proveedores");

        botonMateriales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonMateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inventory32x32.png"))); // NOI18N
        botonMateriales.setText("    Materiales");

        botonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close32x32.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });

        botonNotas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notas2_32x32.png"))); // NOI18N
        botonNotas.setText("Notas");
        botonNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonNotasMouseClicked(evt);
            }
        });

        botonReportes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notas32x32.png"))); // NOI18N
        botonReportes.setText("Reporte");
        botonReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonReportesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botonProveedores)
                .addGap(28, 28, 28)
                .addComponent(botonMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        // Cierra el sistema al presionar el botonSalir
        System.exit(0);
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNotasMouseClicked
        VistaConsultaNotas consultaNotas = new VistaConsultaNotas();
        consultaNotas.setVisible(true);
        consultaNotas.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_botonNotasMouseClicked

    private void botonReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReportesMouseClicked
        MiniConsultaFechas miniConsulta = new MiniConsultaFechas(this, true);
        miniConsulta.setVisible(true);
        while (miniConsulta.isVisible()) {

        }
        if (miniConsulta.getCancelado()) {
            return;
        }
        String fechaInicial = miniConsulta.getFechaInicial();
        String fechaFinal = miniConsulta.getFechaFinal();

        Reporte.reporteCompraMateriales(fechaInicial, fechaFinal);

        miniConsulta.dispose();

    }//GEN-LAST:event_botonReportesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonMateriales;
    private javax.swing.JButton botonNotas;
    public javax.swing.JButton botonProveedores;
    public javax.swing.JButton botonReportes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
