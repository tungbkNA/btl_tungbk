/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group2.ui;

import com.group2.dao.ThongKeDAO;
import com.group2.swing.ModelChart;
import com.group2.swing.ModelPolarAreaChart;
import com.group2.swing.ScrollBarCustom;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author HieuHoang
 */
public class ThongKeUI extends javax.swing.JPanel {

    ThongKeDAO thongKeDAO = new ThongKeDAO();

    /**
     * Creates new form TKUI
     */
    public ThongKeUI() {
        initComponents();
        for (Integer year : thongKeDAO.getYears()) {
            comboBoxSuggestion2.addItem(year);
        }
        designScrollBar();
        polarAreaChart1.addItem(new ModelPolarAreaChart(new Color(62, 197, 0), "Gym", thongKeDAO.thongKeGoiTap("gym")));
        polarAreaChart1.addItem(new ModelPolarAreaChart(new Color(40, 62, 81), "Yoga", thongKeDAO.thongKeGoiTap("yoga")));
        polarAreaChart1.addItem(new ModelPolarAreaChart(new Color(38, 204, 254), "Boxing", thongKeDAO.thongKeGoiTap("boxing")));
        polarAreaChart1.start();

        polarAreaChart2.addItem(new ModelPolarAreaChart(new Color(52, 148, 203), "Khách hàng", thongKeDAO.thongKeKhachHang()));
        polarAreaChart2.addItem(new ModelPolarAreaChart(new Color(175, 67, 237), "Hội viên", thongKeDAO.thongKeHoiVien()));

        polarAreaChart2.start();

        chart.addLegend("Gói tập", new Color(240, 80, 83));
        chart.addLegend("Sản phẩm", new Color(0, 78, 146));
        
        int nam = (int) comboBoxSuggestion2.getSelectedItem();

        chart.getModel().clear();
        chart.getBlankPlotChart().setMaxValues(0);

        for (int i = 1; i <= 12; i++) {
            chart.addData(new ModelChart("Tháng " + i, new double[]{thongKeDAO.thongKeGoiTapTheoThang(i, nam), thongKeDAO.thongKeSanPhamTheoThang(i, nam),}));
        }
//      

        chart.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnTK = new javax.swing.JPanel();
        gradientBackGround1 = new com.group2.swing.GradientBackGround();
        polarAreaChart1 = new com.group2.swing.PolarAreaChart();
        polarAreaChart2 = new com.group2.swing.PolarAreaChart();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gradientBackGround4 = new com.group2.swing.GradientBackGround();
        chart = new com.group2.swing.Chart();
        comboBoxSuggestion2 = new com.group2.swing.ComboBoxSuggestion();
        jLabel4 = new javax.swing.JLabel();

        setOpaque(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        pnTK.setOpaque(false);

        gradientBackGround1.setBorderRadius(5);
        gradientBackGround1.setShadowColor(new java.awt.Color(0, 4, 40));
        gradientBackGround1.setShadowOpacity(0.3F);

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thống kê số lượng khách hàng và hội viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông kê lượng đăng ký của hội viên theo loại gói tập");

        javax.swing.GroupLayout gradientBackGround1Layout = new javax.swing.GroupLayout(gradientBackGround1);
        gradientBackGround1.setLayout(gradientBackGround1Layout);
        gradientBackGround1Layout.setHorizontalGroup(
            gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround1Layout.createSequentialGroup()
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientBackGround1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(gradientBackGround1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(polarAreaChart2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addGap(78, 78, 78)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientBackGround1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(polarAreaChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(68, 68, 68))))
        );
        gradientBackGround1Layout.setVerticalGroup(
            gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gradientBackGround1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(polarAreaChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(polarAreaChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        gradientBackGround4.setBorderRadius(10);
        gradientBackGround4.setShadowColor(new java.awt.Color(0, 4, 40));
        gradientBackGround4.setShadowOpacity(0.3F);

        comboBoxSuggestion2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboBoxSuggestion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSuggestion2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Doanh thu của phòng tập trong năm");

        javax.swing.GroupLayout gradientBackGround4Layout = new javax.swing.GroupLayout(gradientBackGround4);
        gradientBackGround4.setLayout(gradientBackGround4Layout);
        gradientBackGround4Layout.setHorizontalGroup(
            gradientBackGround4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientBackGround4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                    .addGroup(gradientBackGround4Layout.createSequentialGroup()
                        .addGroup(gradientBackGround4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        gradientBackGround4Layout.setVerticalGroup(
            gradientBackGround4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientBackGround4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(comboBoxSuggestion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnTKLayout = new javax.swing.GroupLayout(pnTK);
        pnTK.setLayout(pnTKLayout);
        pnTKLayout.setHorizontalGroup(
            pnTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientBackGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gradientBackGround4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTKLayout.setVerticalGroup(
            pnTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTKLayout.createSequentialGroup()
                .addComponent(gradientBackGround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradientBackGround4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnTK);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSuggestion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSuggestion2ActionPerformed
        // TODO add your handling code here:

        int nam = (int) comboBoxSuggestion2.getSelectedItem();
        chart.getModel().clear();
        chart.getBlankPlotChart().setMaxValues(0);

        for (int i = 1; i <= 12; i++) {
            chart.addData(new ModelChart("Tháng " + i, new double[]{thongKeDAO.thongKeGoiTapTheoThang(i, nam), thongKeDAO.thongKeSanPhamTheoThang(i, nam),}));
        }
        chart.start();

    }//GEN-LAST:event_comboBoxSuggestion2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group2.swing.Chart chart;
    private com.group2.swing.ComboBoxSuggestion comboBoxSuggestion2;
    private com.group2.swing.GradientBackGround gradientBackGround1;
    private com.group2.swing.GradientBackGround gradientBackGround4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnTK;
    private com.group2.swing.PolarAreaChart polarAreaChart1;
    private com.group2.swing.PolarAreaChart polarAreaChart2;
    // End of variables declaration//GEN-END:variables

    private void designScrollBar() {
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());

        jScrollPane1.setHorizontalScrollBar(new ScrollBarCustom());
    }
}
