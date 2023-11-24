/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;

/**
 *
 * @author khiem
 */
public class MainFrame extends javax.swing.JFrame {

    private JPanel panelSanPham;
    private JPanel panelDoiSP;
    private JPanel panelDotGG;
    private JPanel panelKhachHang;
    private JPanel panelPhieuGG;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        GetPanel();
    }

    public void GetPanel() {

        FrameSanPham frameSanPham = new FrameSanPham();
        panelSanPham = frameSanPham.getSanPhamPanel();
        panelSanPham.setVisible(true);
        panelSanPham.setBounds(0, 0, 1300, 700);

        FrameDoiSP frameDoiSP = new FrameDoiSP();
        panelDoiSP = frameDoiSP.getDoiSPPanel();
        panelDoiSP.setVisible(false);
        panelDoiSP.setBounds(0, 0, 1300, 700);

        FrameDotGiamGia frameDotGG = new FrameDotGiamGia();
        panelDotGG = frameDotGG.getPanelDotGG();
        panelDotGG.setVisible(false);
        panelDotGG.setBounds(0, 0, 1300, 700);

        FrameKhachHang frameKhachHang = new FrameKhachHang();
        panelKhachHang = frameKhachHang.getKhachHangPanel();
        panelKhachHang.setVisible(false);
        panelKhachHang.setBounds(0, 0, 1300, 700);

        MainPanel.add(panelSanPham);
        MainPanel.add(panelDoiSP);
        MainPanel.add(panelDotGG);
        MainPanel.add(panelKhachHang);

        setResizable(false);
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSanPham = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHoaDon = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnDoiSP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnDotGG = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnPhieuGG = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnKhachHang = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bán Váy");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnSanPham.setBackground(new java.awt.Color(204, 204, 255));
        btnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseClicked(evt);
            }
        });

        jLabel1.setText("Sản phẩm");

        javax.swing.GroupLayout btnSanPhamLayout = new javax.swing.GroupLayout(btnSanPham);
        btnSanPham.setLayout(btnSanPhamLayout);
        btnSanPhamLayout.setHorizontalGroup(
            btnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSanPhamLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btnSanPhamLayout.setVerticalGroup(
            btnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSanPhamLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnHoaDon.setBackground(new java.awt.Color(204, 204, 255));
        btnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseClicked(evt);
            }
        });

        jLabel3.setText("Hóa Đơn");

        javax.swing.GroupLayout btnHoaDonLayout = new javax.swing.GroupLayout(btnHoaDon);
        btnHoaDon.setLayout(btnHoaDonLayout);
        btnHoaDonLayout.setHorizontalGroup(
            btnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        btnHoaDonLayout.setVerticalGroup(
            btnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHoaDonLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(19, 19, 19))
        );

        btnDoiSP.setBackground(new java.awt.Color(204, 204, 255));
        btnDoiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiSPMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Đổi sản phẩm");

        javax.swing.GroupLayout btnDoiSPLayout = new javax.swing.GroupLayout(btnDoiSP);
        btnDoiSP.setLayout(btnDoiSPLayout);
        btnDoiSPLayout.setHorizontalGroup(
            btnDoiSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnDoiSPLayout.setVerticalGroup(
            btnDoiSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDoiSPLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnDotGG.setBackground(new java.awt.Color(204, 204, 255));
        btnDotGG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDotGGMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đợt giảm giá");

        javax.swing.GroupLayout btnDotGGLayout = new javax.swing.GroupLayout(btnDotGG);
        btnDotGG.setLayout(btnDotGGLayout);
        btnDotGGLayout.setHorizontalGroup(
            btnDotGGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnDotGGLayout.setVerticalGroup(
            btnDotGGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDotGGLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnPhieuGG.setBackground(new java.awt.Color(204, 204, 255));
        btnPhieuGG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPhieuGGMouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phiếu giảm giá");

        javax.swing.GroupLayout btnPhieuGGLayout = new javax.swing.GroupLayout(btnPhieuGG);
        btnPhieuGG.setLayout(btnPhieuGGLayout);
        btnPhieuGGLayout.setHorizontalGroup(
            btnPhieuGGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPhieuGGLayout.setVerticalGroup(
            btnPhieuGGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPhieuGGLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnKhachHang.setBackground(new java.awt.Color(204, 204, 255));
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Khách hàng");

        javax.swing.GroupLayout btnKhachHangLayout = new javax.swing.GroupLayout(btnKhachHang);
        btnKhachHang.setLayout(btnKhachHangLayout);
        btnKhachHangLayout.setHorizontalGroup(
            btnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnKhachHangLayout.setVerticalGroup(
            btnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKhachHangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoiSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDotGG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhieuGG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDotGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPhieuGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(1300, 700));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseClicked
        panelSanPham.setVisible(true);
        panelDoiSP.setVisible(false);
        panelDotGG.setVisible(false);
//        panelPhieuGG.setVisible(false);
        panelKhachHang.setVisible(false);
    }//GEN-LAST:event_btnSanPhamMouseClicked

    private void btnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHoaDonMouseClicked

    private void btnDoiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiSPMouseClicked
        panelSanPham.setVisible(false);
        panelDoiSP.setVisible(true);
        panelDotGG.setVisible(false);
//        panelPhieuGG.setVisible(false);
        panelKhachHang.setVisible(false);
    }//GEN-LAST:event_btnDoiSPMouseClicked

    private void btnDotGGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDotGGMouseClicked
        panelSanPham.setVisible(false);
        panelDoiSP.setVisible(false);
        panelDotGG.setVisible(true);
//        panelPhieuGG.setVisible(false);
        panelKhachHang.setVisible(false);
    }//GEN-LAST:event_btnDotGGMouseClicked

    private void btnPhieuGGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhieuGGMouseClicked
//        panelSanPham.setVisible(true);
//        panelDoiSP.setVisible(false);
//        panelDotGG.setVisible(false);
////        panelPhieuGG.setVisible(false);
//        panelKhachHang.setVisible(false);
    }//GEN-LAST:event_btnPhieuGGMouseClicked

    private void btnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseClicked
        panelSanPham.setVisible(false);
        panelDoiSP.setVisible(false);
        panelDotGG.setVisible(false);
//        panelPhieuGG.setVisible(false);
        panelKhachHang.setVisible(true);
    }//GEN-LAST:event_btnKhachHangMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel btnDoiSP;
    private javax.swing.JPanel btnDotGG;
    private javax.swing.JPanel btnHoaDon;
    private javax.swing.JPanel btnKhachHang;
    private javax.swing.JPanel btnPhieuGG;
    private javax.swing.JPanel btnSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
