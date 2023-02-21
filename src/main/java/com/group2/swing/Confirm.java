/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group2.swing;

import java.awt.Color;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JWindow;

/**
 *
 * @author HieuHoang
 */
public class Confirm extends javax.swing.JDialog {
    
    private int index = 0;

    /**
     * Creates new form Confirm
     */
    public Confirm(Window parent, String msg) {
        super(parent);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        jLabel1.setText(msg);
        setLocationRelativeTo(parent);
        
        setVisible(true);
    }
    
    public int getAnswer() {
        return index;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageView1 = new com.group2.swing.ImageView();
        gradientBackGround1 = new com.group2.swing.GradientBackGround();
        button1 = new com.group2.swing.Button();
        button2 = new com.group2.swing.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(333, 148));
        setModal(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageView1.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icons/icons8_help_100px.png"))); // NOI18N
        getContentPane().add(imageView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 40, 40));

        gradientBackGround1.setBorderRadius(10);
        gradientBackGround1.setShadowColor(new java.awt.Color(40, 62, 81));
        gradientBackGround1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button1.setBackground(new java.awt.Color(1, 87, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("YES");
        button1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        gradientBackGround1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 50, -1));

        button2.setBackground(new java.awt.Color(244, 67, 54));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("NO");
        button2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        gradientBackGround1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bạn có muốn xóa nhân viên này không ?");
        gradientBackGround1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, 30));

        getContentPane().add(gradientBackGround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 330, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        index = 0;
        dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        index = 1;
        dispose();
    }//GEN-LAST:event_button2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group2.swing.Button button1;
    private com.group2.swing.Button button2;
    private com.group2.swing.GradientBackGround gradientBackGround1;
    private com.group2.swing.ImageView imageView1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}