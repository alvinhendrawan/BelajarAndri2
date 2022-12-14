/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 201011400342
 */
package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alvin Hendrawan
 */
public class FormUtama extends javax.swing.JFrame {
    public static FormMahasiswa formMahasiswa;
    public static FormMataKuliah formMataKuliah;

    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        setUkuranLokasiFrame(0.8, true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        mdiDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        aplikasiMenu = new javax.swing.JMenu();
        deskripsiMenuItem = new javax.swing.JMenuItem();
        aksesMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        keluarMenuItem = new javax.swing.JMenuItem();
        masterDataMenu = new javax.swing.JMenu();
        mahasiswaMenuItem = new javax.swing.JMenuItem();
        mataKuliahMenuItem = new javax.swing.JMenuItem();
        transaksiMenu = new javax.swing.JMenu();
        nilaiMenuItem = new javax.swing.JMenuItem();
        laporanMenu = new javax.swing.JMenu();
        nilaiLaporanMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mahasiswaLaporanMenuItem = new javax.swing.JMenuItem();
        mataKuliahLaporanMenuItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Administrasi Nilai");

        javax.swing.GroupLayout mdiDesktopPaneLayout = new javax.swing.GroupLayout(mdiDesktopPane);
        mdiDesktopPane.setLayout(mdiDesktopPaneLayout);
        mdiDesktopPaneLayout.setHorizontalGroup(
            mdiDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        mdiDesktopPaneLayout.setVerticalGroup(
            mdiDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        aplikasiMenu.setText("Aplikasi");

        deskripsiMenuItem.setText("Deskripsi");
        aplikasiMenu.add(deskripsiMenuItem);

        aksesMenuItem.setText("Login");
        aplikasiMenu.add(aksesMenuItem);
        aplikasiMenu.add(jSeparator1);

        keluarMenuItem.setText("Keluar");
        keluarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarMenuItemActionPerformed(evt);
            }
        });
        aplikasiMenu.add(keluarMenuItem);

        jMenuBar1.add(aplikasiMenu);

        masterDataMenu.setText("Master Data");

        mahasiswaMenuItem.setText("Mahasiswa");
        mahasiswaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mahasiswaMenuItemActionPerformed(evt);
            }
        });
        masterDataMenu.add(mahasiswaMenuItem);

        mataKuliahMenuItem.setText("Mata Kuliah");
        mataKuliahMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mataKuliahMenuItemActionPerformed(evt);
            }
        });
        masterDataMenu.add(mataKuliahMenuItem);

        jMenuBar1.add(masterDataMenu);

        transaksiMenu.setText("Transaksi");

        nilaiMenuItem.setText("Nilai");
        transaksiMenu.add(nilaiMenuItem);

        jMenuBar1.add(transaksiMenu);

        laporanMenu.setText("Laporan");

        nilaiLaporanMenuItem.setText("Nilai");
        laporanMenu.add(nilaiLaporanMenuItem);
        laporanMenu.add(jSeparator2);

        mahasiswaLaporanMenuItem.setText("Mahasiswa");
        laporanMenu.add(mahasiswaLaporanMenuItem);

        mataKuliahLaporanMenuItem.setText("Mata Kuliah");
        laporanMenu.add(mataKuliahLaporanMenuItem);

        jMenuBar1.add(laporanMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUkuranLokasiFrame(double skala, boolean tengah) {
        Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int) (skala * dimensi.getWidth()), (int) (skala * dimensi.getHeight()));
        
        if (tengah) {
            setLocation((int) ((dimensi.getWidth() - getWidth()) / 2), 
                    (int) ((dimensi.getHeight() - getHeight()) / 2));
        }
    }
    
    private void keluarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarMenuItemActionPerformed

    private void mahasiswaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mahasiswaMenuItemActionPerformed
        // TODO add your handling code here:
        if ((formMahasiswa != null) && formMahasiswa.isVisible()) {
            try {
                formMahasiswa.setSelected(true);
            } catch (PropertyVetoException ex) {
                
            }
        } else {
            formMahasiswa = new FormMahasiswa();
            mdiDesktopPane.add(formMahasiswa);
            formMahasiswa.setVisible(true);
        }
    }//GEN-LAST:event_mahasiswaMenuItemActionPerformed

    private void mataKuliahMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mataKuliahMenuItemActionPerformed
        // TODO add your handling code here:
        if ((formMataKuliah != null) && formMataKuliah.isVisible()) {
            try {
                formMataKuliah.setSelected(true);
            } catch (PropertyVetoException ex) {
            }
        } else {
            formMataKuliah = new FormMataKuliah();
            mdiDesktopPane.add(formMataKuliah);
            formMataKuliah.setVisible(true);
        }
    }//GEN-LAST:event_mataKuliahMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aksesMenuItem;
    private javax.swing.JMenu aplikasiMenu;
    private javax.swing.JMenuItem deskripsiMenuItem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem keluarMenuItem;
    private javax.swing.JMenu laporanMenu;
    private javax.swing.JMenuItem mahasiswaLaporanMenuItem;
    private javax.swing.JMenuItem mahasiswaMenuItem;
    private javax.swing.JMenu masterDataMenu;
    private javax.swing.JMenuItem mataKuliahLaporanMenuItem;
    private javax.swing.JMenuItem mataKuliahMenuItem;
    private javax.swing.JDesktopPane mdiDesktopPane;
    private javax.swing.JMenuItem nilaiLaporanMenuItem;
    private javax.swing.JMenuItem nilaiMenuItem;
    private javax.swing.JMenu transaksiMenu;
    // End of variables declaration//GEN-END:variables
}
