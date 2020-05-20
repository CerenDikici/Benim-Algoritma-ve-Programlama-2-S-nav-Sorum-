/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomasyon;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAHMİ
 */
public class Tablo extends javax.swing.JFrame {
    
    DefaultTableModel tablo = new DefaultTableModel();
    
public Tablo() {
    initComponents();
    gosterge_tablosu.setModel(tablo);
    tablo.setColumnIdentifiers(new String[] {"Ad", "Soyadı", "Numara", "Plaka", "Saat"});
    
}

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        oto_ad = new javax.swing.JTextField();
        oto_soyad = new javax.swing.JTextField();
        oto_numara = new javax.swing.JTextField();
        oto_plaka = new javax.swing.JTextField();
        oto_giriş_saati = new javax.swing.JTextField();
        rtn_giriş = new javax.swing.JButton();
        rtn_iptal = new javax.swing.JButton();
        rtn_çıkış = new javax.swing.JButton();
        rtn_sonlandır = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gosterge_tablosu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Müşteri Girişi");
        setLocation(new java.awt.Point(200, 100));

        jLabel1.setText("Müşteri Adı:");

        jLabel2.setText("Soyadı:");

        jLabel3.setText("İletişim Numarası:");

        jLabel4.setText("Araç Plakası:");

        jLabel5.setText("Giriş Saati:");

        oto_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oto_adActionPerformed(evt);
            }
        });

        oto_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oto_soyadActionPerformed(evt);
            }
        });

        rtn_giriş.setBackground(new java.awt.Color(255, 153, 255));
        rtn_giriş.setText("Kaydet");
        rtn_giriş.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rtn_giriş.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtn_girişActionPerformed(evt);
            }
        });

        rtn_iptal.setBackground(java.awt.Color.red);
        rtn_iptal.setText("İptal");
        rtn_iptal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rtn_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtn_iptalActionPerformed(evt);
            }
        });

        rtn_çıkış.setBackground(new java.awt.Color(255, 255, 0));
        rtn_çıkış.setText("Çıkış Yap");
        rtn_çıkış.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rtn_çıkış.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtn_çıkışActionPerformed(evt);
            }
        });

        rtn_sonlandır.setBackground(new java.awt.Color(0, 255, 255));
        rtn_sonlandır.setText("Sistemi Sonlandır");
        rtn_sonlandır.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rtn_sonlandır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtn_sonlandırActionPerformed(evt);
            }
        });

        gosterge_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gosterge_tablosu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oto_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oto_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oto_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oto_numara, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oto_giriş_saati, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rtn_sonlandır, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(rtn_çıkış, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rtn_iptal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rtn_giriş, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(oto_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(oto_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(oto_numara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(oto_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(oto_giriş_saati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rtn_giriş)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rtn_iptal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rtn_çıkış)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rtn_sonlandır)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oto_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oto_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oto_adActionPerformed

    private void oto_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oto_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oto_soyadActionPerformed

    private void rtn_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtn_iptalActionPerformed
      oto_ad.setText("");
      oto_soyad.setText("");
      oto_numara.setText("");
      oto_plaka.setText("");
      oto_giriş_saati.setText("");
    }//GEN-LAST:event_rtn_iptalActionPerformed
               
    private void rtn_girişActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtn_girişActionPerformed
      String ad= oto_ad.getText();
      String soyadı= oto_soyad.getText();
      String numara= oto_numara.getText();
      String plaka= oto_plaka.getText();
      String saat= oto_giriş_saati.getText();
      oto_ad.setText("");
      oto_soyad.setText("");
      oto_numara.setText("");
      oto_plaka.setText("");
      oto_giriş_saati.setText("");
      String save_message= "Kayıt Tamamlandı";
      JOptionPane.showMessageDialog(rootPane, save_message);
      tablo.addRow(new String[] {ad,soyadı,numara,plaka,saat});
    }//GEN-LAST:event_rtn_girişActionPerformed

    private void rtn_çıkışActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtn_çıkışActionPerformed
       Double hesap;
       String giriş_saati = JOptionPane.showInputDialog("Giriş Saati");
       String çıkış_saati = JOptionPane.showInputDialog("Çıkış Saati");
       Double giriş_saat = Double.parseDouble(giriş_saati);
       Double çıkış_saat = Double.parseDouble(çıkış_saati);
       Double saat_farkı = (çıkış_saat - giriş_saat);
       hesap = saat_farkı * 5;
       JOptionPane.showMessageDialog(rootPane, "Tutar : "+String.valueOf(hesap));
       tablo.removeRow(gosterge_tablosu.getSelectedRow());
    }//GEN-LAST:event_rtn_çıkışActionPerformed

    private void rtn_sonlandırActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtn_sonlandırActionPerformed
       dispose();
    }//GEN-LAST:event_rtn_sonlandırActionPerformed

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
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gosterge_tablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField oto_ad;
    private javax.swing.JTextField oto_giriş_saati;
    private javax.swing.JTextField oto_numara;
    private javax.swing.JTextField oto_plaka;
    private javax.swing.JTextField oto_soyad;
    private javax.swing.JButton rtn_giriş;
    private javax.swing.JButton rtn_iptal;
    private javax.swing.JButton rtn_sonlandır;
    private javax.swing.JButton rtn_çıkış;
    // End of variables declaration//GEN-END:variables
}
