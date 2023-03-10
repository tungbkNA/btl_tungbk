/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group2.swing;

import java.awt.Color;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JWindow;

/**
 *
 * @author HieuHoang
 */
public class Alert extends javax.swing.JDialog {

    public enum AlertType {
        ERROR, SUCCESS
    }

    /**
     * Creates new form Alert
     */
    public Alert(Window parent, String title, String msg, AlertType type) {
        super(parent);
        initComponents();
        setLocationRelativeTo(parent);
        setBackground(new Color(0, 0, 0, 0));
        lblMes.setText(msg);
        if (type == AlertType.ERROR) {

            imageView1.setImage(new ImageIcon(getClass().getResource("/com/group2/icons/icons8_box_important_100px.png")));
            lblTitle.setText(title);
            lblTitle.setForeground(new Color(216, 82, 97));
            btn.setBackground(new Color(216, 82, 97));
            btn.setText("OK :-(");
        } else {
            imageView1.setImage(new ImageIcon(getClass().getResource("/com/group2/icons/icons8_ok_100px.png")));
            lblTitle.setText(title);
            lblTitle.setForeground(new Color(45, 210, 132));
            btn.setBackground(new Color(45, 210, 132));
            btn.setText("DONE!");
        }
        setVisible(true);
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
        lblTitle = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        btn = new com.group2.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(330, 167));
        setModal(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageView1.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icons/icons8_box_important_100px.png"))); // NOI18N
        getContentPane().add(imageView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 40, 40));

        gradientBackGround1.setBorderRadius(10);
        gradientBackGround1.setShadowColor(new java.awt.Color(40, 62, 81));
        gradientBackGround1.setLayout(null);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Tiltle");
        gradientBackGround1.add(lblTitle);
        lblTitle.setBounds(10, 20, 310, 30);

        lblMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMes.setForeground(new java.awt.Color(40, 62, 81));
        lblMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMes.setText("Message");
        gradientBackGround1.add(lblMes);
        lblMes.setBounds(10, 50, 310, 15);

        btn.setBackground(new java.awt.Color(204, 0, 51));
        btn.setForeground(new java.awt.Color(255, 255, 255));
        btn.setText("OK");
        btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        gradientBackGround1.add(btn);
        btn.setBounds(130, 80, 70, 25);

        getContentPane().add(gradientBackGround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 125));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
      setVisible(false);
    }//GEN-LAST:event_btnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group2.swing.Button btn;
    private com.group2.swing.GradientBackGround gradientBackGround1;
    private com.group2.swing.ImageView imageView1;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
