
package com.vistasJorge;
import gestiongimnasio.DAO.MembresiaData;
import gestiongimnasio.Entidades.Socio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jorge
 */
public class RegistrarMembresiaForm extends JDialog {

    /**
     * Creates new form NewJInternalFrame
     */
    public RegistrarMembresiaForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        buttonOK = new javax.swing.JButton();

        contentPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cantidad De Pases");
        contentPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 40));
        contentPane.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 190, 40));

        jLabel2.setText("Duracion del mes");
        contentPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 40));
        contentPane.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 60, 40));

        jLabel3.setText("SocioId");
        contentPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 40));
        contentPane.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 190, 40));

        buttonOK.setText("Registrar membresia");
        contentPane.add(buttonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOK;
    private javax.swing.JPanel contentPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
