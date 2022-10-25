/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz;

import excepciones.EjemplarInexistenteError;
import excepciones.LectorNoRegistradoError;
import gestion.datos.GestionDatos;
import gestion.inventario.Ejemplar;
import gestion.inventario.Reservacion;
import gestion.personas.Lector;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grupo 2
 */
public class DialogReservacionEjemplar extends javax.swing.JDialog {

    private GestionDatos datos;

    public DialogReservacionEjemplar(java.awt.Frame parent, boolean modal, GestionDatos datos) {
        super(parent, modal);
        this.datos = datos;
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEjemplarReservacion = new javax.swing.JTextField();
        txtDocumentoLector = new javax.swing.JTextField();
        txtDiaReservacion = new javax.swing.JTextField();
        txtMesReservacion = new javax.swing.JTextField();
        txtAnioReservacion = new javax.swing.JTextField();
        botonRegistrarReservacion = new javax.swing.JButton();
        botonCerrarVentana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel1.setText("Reservación de Ejemplar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 30, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Codigo de ejemplar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("DNI del Solicitante:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 105, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel4.setText("---------- Fecha de Reservación ----------");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 10, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Dia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 200, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Mes:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 195, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Año:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 195, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 70);
        jPanel1.add(txtEjemplarReservacion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 70);
        jPanel1.add(txtDocumentoLector, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 110);
        jPanel1.add(txtDiaReservacion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 110);
        jPanel1.add(txtMesReservacion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 110);
        jPanel1.add(txtAnioReservacion, gridBagConstraints);

        botonRegistrarReservacion.setText("Registrar");
        botonRegistrarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarReservacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(60, 0, 10, 0);
        jPanel1.add(botonRegistrarReservacion, gridBagConstraints);

        botonCerrarVentana.setText("Cancelar ");
        botonCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarVentanaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 80, 0);
        jPanel1.add(botonCerrarVentana, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarReservacionActionPerformed
        Ejemplar ejemplarReservado = null;
        Lector lectorReserva = null;
        
        try {
            ejemplarReservado = datos.buscarEjemplar(txtEjemplarReservacion.getText());
            
            lectorReserva = datos.buscarLector(Integer.parseInt(txtDocumentoLector.getText()));
            
            GregorianCalendar fechaReservacionEjemplar = new GregorianCalendar(Integer.parseInt(txtAnioReservacion.getText()),
                                                                               Integer.parseInt(txtMesReservacion.getText()),
                                                                               Integer.parseInt(txtDiaReservacion.getText()));
        
            new Reservacion(lectorReserva, ejemplarReservado, fechaReservacionEjemplar);
            
            datos.escribirDatosObra();
            this.setVisible(false);
            
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Reservacion realizada con exito.");
            
        } catch (EjemplarInexistenteError ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Codigo de ejemplar incorrecto");
        } catch (LectorNoRegistradoError ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Este lector no se encuentra registrado");
        } catch( NumberFormatException ex ) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Valor para fecha incorrecto");
        }
    }//GEN-LAST:event_botonRegistrarReservacionActionPerformed

    private void botonCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVentanaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botonCerrarVentanaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarVentana;
    private javax.swing.JButton botonRegistrarReservacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnioReservacion;
    private javax.swing.JTextField txtDiaReservacion;
    private javax.swing.JTextField txtDocumentoLector;
    private javax.swing.JTextField txtEjemplarReservacion;
    private javax.swing.JTextField txtMesReservacion;
    // End of variables declaration//GEN-END:variables
}
