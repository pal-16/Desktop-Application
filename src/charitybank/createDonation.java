/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charitybank;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ankit
 */
public class createDonation extends javax.swing.JFrame {

        public static String u;

        public static String kk;

        public createDonation() {
                initComponents();
                setLocationRelativeTo(null);

        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                t3 = new javax.swing.JComboBox();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                t9 = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                t4 = new javax.swing.JComboBox();
                jLabel8 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                t2 = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                t1 = new javax.swing.JTextField();
                t6 = new javax.swing.JTextField();
                t7 = new javax.swing.JTextField();
                t20 = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                t8 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                jLabel1.setText("Donor Detail Form");

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel2.setText("Donor No");

                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel3.setText("Donation Type");

                t3.setModel(new javax.swing.DefaultComboBoxModel(
                                new String[] { "Food", "Clothes", "Accessories", "Books", "Money" }));

                jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel4.setText("Quantity");

                jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel5.setText("Country");

                jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel6.setText("Age");

                t9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t9ActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel7.setText("Sex");

                t4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", " " }));

                jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel8.setText("Donor Name");

                jLabel20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel20.setText("Quant");

                jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel9.setText("City");

                jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jLabel10.setText("Mobile");

                jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
                jButton1.setText("Submit");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Back to Home");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup().addComponent(jButton2)
                                                                                .addGap(36, 36, 36))
                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(t9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                80,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addContainerGap()
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel7,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                37,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel3)
                                                                                                                                .addComponent(jLabel6,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                28,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(41, 41, 41)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                55,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel8))))
                                                                                .addGap(20, 20, 20)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                                .addComponent(t1,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                80,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(t4, 0,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(t3, 0,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(t2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                80,
                                                                                                                Short.MAX_VALUE))))
                                                                .addGap(77, 77, 77)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                40,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel9,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                40,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(jLabel10,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                39,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(t20,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                82,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(t6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                82,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(t7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                82,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(t8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                82,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGap(0, 107, Short.MAX_VALUE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(41, 41, 41)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                73,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup().addGap(161, 161, 161)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4)
                                                                .addComponent(t20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                21,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(t1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8).addComponent(t2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel3)
                                                                                                .addComponent(t3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel9)
                                                                                                .addComponent(t7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel7)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(t4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel10)
                                                                                                                .addComponent(t8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(t6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel6).addComponent(t9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                31,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(48, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void t9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_t9ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_t9ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                String a = t1.getText();
                String b = t2.getText();
                String c = t3.getSelectedItem().toString();
                String d = t4.getSelectedItem().toString();
                String e = t20.getText();
                String f = t6.getText();
                String g = t7.getText();
                String h = t8.getText();
                String i = t9.getText();
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection cn = DriverManager.getConnection("jdbc:mysql:///bloodbank", "root", "tata2000@P");
                        PreparedStatement smt = cn.prepareStatement("insert into newdonorr values(?,?,?,?,?,?,?,?,?)");
                        smt.setString(1, a);
                        smt.setString(2, b);
                        smt.setString(3, d);
                        smt.setString(4, i);
                        smt.setString(5, c);
                        smt.setString(6, e);
                        smt.setString(7, f);
                        smt.setString(8, g);
                        smt.setString(9, h);

                        smt.executeUpdate();
                        ///// coding to update quantityy table
                        kk = t3.getSelectedItem().toString();
                        if (kk.equals("Food")) {
                                smt = cn.prepareStatement("select packets from quantityy where group11='" + kk + "'");
                        }
                        if (kk.equals("Clothes")) {
                                smt = cn.prepareStatement("select packets from quantityy where group11='" + kk + "'");
                        }
                        if (kk.equals("Accessories")) {
                                smt = cn.prepareStatement("select packets from quantityy where group11='" + kk + "'");
                        }
                        if (kk.equals("Books")) {
                                smt = cn.prepareStatement("select packets from quantityy where group11='" + kk + "'");
                        }
                        if (kk.equals("Money")) {
                                smt = cn.prepareStatement("select packets from quantityy where group11='" + kk + "'");
                        }
                        ResultSet jj = smt.executeQuery();
                        jj.next();
                        int ff = jj.getInt(1);
                        int quant = Integer.parseInt(e);
                        ff = ff + quant;
                        smt = cn.prepareStatement("update quantityy set packets=? where group11=?");
                        smt.setInt(1, ff);
                        smt.setString(2, kk);
                        smt.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Data Inserted", "Success", JOptionPane.PLAIN_MESSAGE);
                } catch (Exception l) {
                        System.out.println("ZZZZZ:" + l);
                }
                homepage oo = new homepage();
                oo.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                homepage oo = new homepage();
                oo.setVisible(true);
                this.dispose();
        }// GEN-LAST:event_jButton2ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel. For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(createDonation.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(createDonation.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(createDonation.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(createDonation.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new createDonation().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JTextField t1;
        private javax.swing.JTextField t2;
        private javax.swing.JComboBox t3;
        private javax.swing.JComboBox t4;
        private javax.swing.JTextField t6;
        private javax.swing.JTextField t7;
        private javax.swing.JTextField t8;
        private javax.swing.JTextField t9;
        private javax.swing.JTextField t20;
        // End of variables declaration//GEN-END:variables
}
