package Ventanas;

import controlador.Fecha;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import materiales.Material;
import notas.*;

/**
 *
 * @author Jesus Armando Mendoza Romero
 */
public class FormularioNota extends javax.swing.JFrame {

    public FormularioNota() {
        initComponents();
        tablaPartidas.setModel(tablaModelo);
        this.mostrarSubtotal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCaptura = new javax.swing.JPanel();
        etiquetaCodigoMaterial = new javax.swing.JLabel();
        campoClaveMaterial = new javax.swing.JTextField();
        etiquetaDescripcionMaterial = new javax.swing.JLabel();
        etiquetaCantidad = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JTextField();
        etiquetaPrecio = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        etiquetaSubtotal = new javax.swing.JLabel();
        etiquetaSubtotalDato = new javax.swing.JLabel();
        botonBuscarMaterial = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaFechaDato = new javax.swing.JLabel();
        etiquetaFolio = new javax.swing.JLabel();
        etiquetaFolioDato = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etiquetaProveedor = new javax.swing.JLabel();
        campoClaveProveedor = new javax.swing.JTextField();
        botonBuscarProveedor = new javax.swing.JButton();
        etiquetaProveedorDato = new javax.swing.JLabel();
        botonAgregarPartida = new javax.swing.JButton();
        panelPartidas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPartidas = new javax.swing.JTable();
        panelTotales = new javax.swing.JPanel();
        etiquetaPesoTotal = new javax.swing.JLabel();
        etiquetaPesoTotalDato = new javax.swing.JLabel();
        etiquetaTotal = new javax.swing.JLabel();
        etiquetaTotalDato = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCaptura.setBackground(new java.awt.Color(204, 204, 204));
        panelCaptura.setForeground(new java.awt.Color(204, 204, 204));

        etiquetaCodigoMaterial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaCodigoMaterial.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaCodigoMaterial.setText("Clave Material");

        campoClaveMaterial.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        etiquetaDescripcionMaterial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaDescripcionMaterial.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaDescripcionMaterial.setText("Aluminio");

        etiquetaCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaCantidad.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaCantidad.setText("Cantidad");

        campoCantidad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        campoCantidad.setText("0.00");
        campoCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCantidadFocusLost(evt);
            }
        });

        etiquetaPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaPrecio.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaPrecio.setText("Precio");

        campoPrecio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        campoPrecio.setText("0.00");
        campoPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoPrecioFocusLost(evt);
            }
        });

        etiquetaSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaSubtotal.setText("Subtotal");

        etiquetaSubtotalDato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiquetaSubtotalDato.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaSubtotalDato.setText("");

        botonBuscarMaterial.setForeground(new java.awt.Color(51, 51, 51));
        botonBuscarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        etiquetaFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaFecha.setForeground(new java.awt.Color(204, 204, 204));
        etiquetaFecha.setText("Fecha");

        etiquetaFechaDato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaFechaDato.setForeground(new java.awt.Color(204, 204, 204));
        etiquetaFechaDato.setText(Fecha.obtenerFechaHoy());

        etiquetaFolio.setBackground(new java.awt.Color(204, 204, 204));
        etiquetaFolio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaFolio.setText("Folio");

        etiquetaFolioDato.setBackground(new java.awt.Color(204, 204, 204));
        etiquetaFolioDato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaFolioDato.setForeground(new java.awt.Color(255, 0, 51));
        etiquetaFolioDato.setText("1054");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        etiquetaProveedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaProveedor.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaProveedor.setText("Proveedor");

        botonBuscarProveedor.setForeground(new java.awt.Color(102, 102, 102));
        botonBuscarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom.png"))); // NOI18N

        etiquetaProveedorDato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaProveedorDato.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaProveedorDato.setText(".");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaProveedor)
                .addGap(12, 12, 12)
                .addComponent(campoClaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBuscarProveedor)
                .addGap(18, 18, 18)
                .addComponent(etiquetaProveedorDato, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaProveedor)
                    .addComponent(campoClaveProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarProveedor)
                    .addComponent(etiquetaProveedorDato, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaFecha)
                .addGap(18, 18, 18)
                .addComponent(etiquetaFechaDato, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaFolio)
                .addGap(41, 41, 41)
                .addComponent(etiquetaFolioDato)
                .addGap(36, 36, 36))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFecha)
                    .addComponent(etiquetaFechaDato)
                    .addComponent(etiquetaFolio)
                    .addComponent(etiquetaFolioDato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        botonAgregarPartida.setForeground(new java.awt.Color(51, 51, 51));
        botonAgregarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ok24x24.png"))); // NOI18N
        botonAgregarPartida.setText("Agregar");
        botonAgregarPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarPartidaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCapturaLayout = new javax.swing.GroupLayout(panelCaptura);
        panelCaptura.setLayout(panelCapturaLayout);
        panelCapturaLayout.setHorizontalGroup(
            panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCapturaLayout.createSequentialGroup()
                .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCapturaLayout.createSequentialGroup()
                        .addComponent(botonBuscarMaterial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoClaveMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etiquetaCodigoMaterial))
                .addGap(18, 18, 18)
                .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPrecio))
                .addGap(18, 18, 18)
                .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCapturaLayout.createSequentialGroup()
                        .addComponent(etiquetaSubtotal)
                        .addGap(20, 486, Short.MAX_VALUE))
                    .addGroup(panelCapturaLayout.createSequentialGroup()
                        .addComponent(etiquetaSubtotalDato, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiquetaDescripcionMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregarPartida)
                        .addGap(26, 26, 26))))
        );
        panelCapturaLayout.setVerticalGroup(
            panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCapturaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCapturaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaCantidad)
                            .addComponent(etiquetaCodigoMaterial)
                            .addComponent(etiquetaPrecio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCapturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaSubtotal)))
                .addGap(4, 4, 4)
                .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCapturaLayout.createSequentialGroup()
                        .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonBuscarMaterial)
                            .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaSubtotalDato)
                                .addComponent(etiquetaDescripcionMaterial)
                                .addComponent(botonAgregarPartida)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(panelCapturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoClaveMaterial)
                        .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panelPartidas.setBackground(new java.awt.Color(255, 255, 255));

        tablaPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Descripción", "Precio", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPartidas.setColumnSelectionAllowed(true);
        tablaPartidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaPartidas);
        tablaPartidas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout panelPartidasLayout = new javax.swing.GroupLayout(panelPartidas);
        panelPartidas.setLayout(panelPartidasLayout);
        panelPartidasLayout.setHorizontalGroup(
            panelPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelPartidasLayout.setVerticalGroup(
            panelPartidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        etiquetaPesoTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiquetaPesoTotal.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaPesoTotal.setText("Peso Total");

        etiquetaPesoTotalDato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiquetaPesoTotalDato.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaPesoTotalDato.setText("0.00");

        etiquetaTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etiquetaTotal.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaTotal.setText("TOTAL");

        etiquetaTotalDato.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        etiquetaTotalDato.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaTotalDato.setText("0.00");

        botonCancelar.setBackground(new java.awt.Color(153, 51, 0));
        botonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("CANCELAR");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });

        botonGuardar.setBackground(new java.awt.Color(0, 102, 51));
        botonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("GUARDAR");

        javax.swing.GroupLayout panelTotalesLayout = new javax.swing.GroupLayout(panelTotales);
        panelTotales.setLayout(panelTotalesLayout);
        panelTotalesLayout.setHorizontalGroup(
            panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTotalesLayout.createSequentialGroup()
                        .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaTotalDato, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTotalesLayout.createSequentialGroup()
                        .addComponent(etiquetaPesoTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaPesoTotalDato, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTotalesLayout.setVerticalGroup(
            panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalesLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPesoTotal)
                    .addComponent(etiquetaPesoTotalDato))
                .addGap(18, 18, 18)
                .addGroup(panelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTotal)
                    .addComponent(etiquetaTotalDato))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCaptura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelPartidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCaptura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPartidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarPartidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarPartidaMouseClicked

        if (this.campoClaveMaterial.getText().equals("")) {
            Component frame = new JFrame();
            JOptionPane.showMessageDialog(frame,
                    "Debe capturar la clave del material",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        Partida partida = new Partida();
        Material material = new Material();

        material.claveMaterial = Integer.parseInt(this.campoClaveMaterial.getText());
        material.descripcion = this.etiquetaDescripcionMaterial.getText();
        material.precio = Double.valueOf(this.campoPrecio.getText());

        partida.cantidad = Double.valueOf(this.campoCantidad.getText());
        partida.material = material;
        partida.subtotal = material.precio * partida.cantidad;

        this.Nota.agregarPartida(partida);
        this.recargarTablaPartidas();        
        this.desglosarListaPartidas();
        this.limpiarCapturaPartida();
        this.mostrarSubtotal();
        this.mostrarTotales();
    }//GEN-LAST:event_botonAgregarPartidaMouseClicked

    private void campoCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCantidadFocusLost
        this.mostrarSubtotal();
    }//GEN-LAST:event_campoCantidadFocusLost

    private void campoPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPrecioFocusLost
        this.mostrarSubtotal();
    }//GEN-LAST:event_campoPrecioFocusLost

    private void campoCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCantidadFocusGained
        this.campoCantidad.selectAll();
    }//GEN-LAST:event_campoCantidadFocusGained

    private void campoPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPrecioFocusGained
        this.campoPrecio.selectAll();
    }//GEN-LAST:event_campoPrecioFocusGained

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void limpiarCapturaPartida() {
        this.campoClaveMaterial.setText("");
        this.etiquetaDescripcionMaterial.setText("");
        this.campoPrecio.setText("0.00");
        this.campoCantidad.setText("0.00");
        this.campoClaveMaterial.requestFocus();
    }

    private void recargarTablaPartidas() {

        tablaModelo.setRowCount(0);

        for (int i = 0; i<Nota.obtenerPartidas().size(); i++ ) {
            double cantidad = Nota.obtenerPartidas().get(i).cantidad;
            String descripcion = Nota.obtenerPartidas().get(i).material.descripcion;
            double precio = Nota.obtenerPartidas().get(i).material.precio;
            double subtotal = Nota.obtenerPartidas().get(i).subtotal;
            Object[] filaPartida = {cantidad, descripcion, precio, subtotal};
            this.tablaModelo.addRow(filaPartida);
        }
    }
    
    private void mostrarSubtotal(){
        double subtotal;
        subtotal = Double.valueOf(this.campoCantidad.getText()) * Double.valueOf(this.campoPrecio.getText());
        this.etiquetaSubtotalDato.setText(String.valueOf(subtotal));
    }
    
    private void mostrarTotales(){
        Double total=0.0;
        Double totalPeso=0.0;
        
        for (int i = 0; i<Nota.obtenerPartidas().size(); i++ ) {
            total+=Nota.obtenerPartidas().get(i).subtotal;       
        }
        
        for (int i = 0; i<Nota.obtenerPartidas().size(); i++ ) {
            totalPeso+=Nota.obtenerPartidas().get(i).cantidad;       
        }
        
        this.etiquetaTotalDato.setText(String.valueOf(total));
        this.etiquetaPesoTotalDato.setText(String.valueOf(totalPeso));
    }
    
    
    private void desglosarListaPartidas() {

        for (int i = 0; i<Nota.obtenerPartidas().size(); i++ ){
            System.out.println(
                            "Numero de partida: " + (i+1) +
                            "  Cantidad: " + Nota.obtenerPartidas().get(i).cantidad +
                            "  Descripción: " + Nota.obtenerPartidas().get(i).material.descripcion +
                            "  Precio: " + Nota.obtenerPartidas().get(i).material.precio +
                            "  Subtotal: " + Nota.obtenerPartidas().get(i).subtotal
                            
            );
     
        }
        System.out.println("\n ----------------------------------------------------------------------");
 
    }
    
    
    Notas Nota = new Notas();
    String columnas[] = {"Cantidad", "Descripción", "Precio", "Subtotal"};
    DefaultTableModel tablaModelo = new DefaultTableModel(columnas, 0);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPartida;
    private javax.swing.JButton botonBuscarMaterial;
    private javax.swing.JButton botonBuscarProveedor;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoClaveMaterial;
    private javax.swing.JTextField campoClaveProveedor;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JLabel etiquetaCantidad;
    private javax.swing.JLabel etiquetaCodigoMaterial;
    private javax.swing.JLabel etiquetaDescripcionMaterial;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaFechaDato;
    private javax.swing.JLabel etiquetaFolio;
    private javax.swing.JLabel etiquetaFolioDato;
    private javax.swing.JLabel etiquetaPesoTotal;
    private javax.swing.JLabel etiquetaPesoTotalDato;
    private javax.swing.JLabel etiquetaPrecio;
    private javax.swing.JLabel etiquetaProveedor;
    private javax.swing.JLabel etiquetaProveedorDato;
    private javax.swing.JLabel etiquetaSubtotal;
    private javax.swing.JLabel etiquetaSubtotalDato;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel etiquetaTotalDato;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCaptura;
    private javax.swing.JPanel panelPartidas;
    private javax.swing.JPanel panelTotales;
    private javax.swing.JTable tablaPartidas;
    // End of variables declaration//GEN-END:variables
}
