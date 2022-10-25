/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz;

import gestion.datos.GestionDatos;
import gestion.inventario.Ejemplar;
import java.util.List;

/**
 *
 * @author martin
 */
public class DialogObservacionEjemplar extends javax.swing.JDialog {

    private GestionDatos datos;
    private Integer indice;

    public DialogObservacionEjemplar(java.awt.Frame parent, boolean modal, GestionDatos datos, Integer indice) {
        super(parent, modal);
        this.datos = datos;
        this.indice = indice;
        
        initComponents();
        recuperarObservacion();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaDeTexto = new javax.swing.JTextArea();
        botonHacerObservacion = new javax.swing.JButton();
        botonCerrarVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Observacion de Ejemplar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jLabel1, gridBagConstraints);

        cajaDeTexto.setColumns(20);
        cajaDeTexto.setRows(5);
        jScrollPane1.setViewportView(cajaDeTexto);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        botonHacerObservacion.setText("Hecho");
        botonHacerObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHacerObservacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 50, 0);
        jPanel1.add(botonHacerObservacion, gridBagConstraints);

        botonCerrarVentana.setText("Cancelar");
        botonCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarVentanaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 50, 0);
        jPanel1.add(botonCerrarVentana, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonHacerObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHacerObservacionActionPerformed
        List<Ejemplar> ejemplares = datos.listaEjemplares();
        
        ejemplares.get(indice).setObservaciones(cajaDeTexto.getText());
        
        datos.escribirDatosObra();
        this.setVisible(false);
        
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Se realizo una observacion al ejemplar " + ejemplares.get(indice).getCodigoBarras());
    }//GEN-LAST:event_botonHacerObservacionActionPerformed

    private void botonCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVentanaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarVentanaActionPerformed

    private void recuperarObservacion() {
        List<Ejemplar> ejemplares = datos.listaEjemplares();
        
        String observacionExistente = ejemplares.get(indice).getObservaciones();
        
        cajaDeTexto.setText(observacionExistente);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarVentana;
    private javax.swing.JButton botonHacerObservacion;
    private javax.swing.JTextArea cajaDeTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
