/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cinema;

import static com.mycompany.cinema.user_f_movie1.t1;
import static com.mycompany.cinema.user_f_movie1.t2;
import static com.mycompany.cinema.user_f_movie1.t3;
import static com.mycompany.cinema.user_f_movie1.t4;
import static com.mycompany.cinema.user_f_movie1.t5;
import static com.mycompany.cinema.user_f_movie1.t6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class popu extends JFrame {
      Connection con;
       Statement ST;
       ResultSet rs;

    /**
     * Creates new form popu
     */
    public popu() {
        initComponents();
    
        try
        {
        
            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
             con =DriverManager.getConnection(conninfo,"dialaa","12345");
             con .setAutoCommit(false);
            
            
 
          
         
        
            con.commit();
            con.close();
            
       }
        
      catch(Exception ex )
       {
            System.out.println(ex.getMessage());
          JOptionPane.showMessageDialog(null , " not connected");
              
       }   
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        s4 = new javax.swing.JSpinner();
        s2 = new javax.swing.JSpinner();
        s1 = new javax.swing.JSpinner();
        r4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        s3 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\CE_Diala\\3rd year\\DataBase\\cinema\\src\\pic\\popcccccc2.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 610, 270));

        s4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 30));

        s2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 130, 30));

        s1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        s1.setToolTipText("");
        jPanel1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 130, 30));

        r4.setBackground(new java.awt.Color(252, 219, 225));
        r4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        r4.setText("Large");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        jPanel1.add(r4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 70, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel2.setText("Here you can choose the size of popcorn that suits you, and you can also choose the quantity ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 560, 20));

        jLabel4.setFont(new java.awt.Font("Candara", 2, 14)); // NOI18N
        jLabel4.setText("you want .");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        r1.setBackground(new java.awt.Color(253, 219, 225));
        r1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        r1.setText("Junior");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, -1));

        r2.setBackground(new java.awt.Color(252, 219, 225));
        r2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        r2.setText("Small");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 70, -1));

        r3.setBackground(new java.awt.Color(252, 219, 225));
        r3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        r3.setText("Medium");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });
        jPanel1.add(r3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, -1));

        s3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 130, 30));

        jButton1.setBackground(new java.awt.Color(255, 236, 239));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Back");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\CE_Diala\\3rd year\\DataBase\\cinema\\src\\pic\\bbbaaaccckkk (3).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        int x=1;
       s1.setValue(x);
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        int x=1;
       s2.setValue(x);
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
        int x=1;
       s3.setValue(x);
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
        int x=1;
       s4.setValue(x);
    }//GEN-LAST:event_r4ActionPerformed

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
            java.util.logging.Logger.getLogger(popu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JSpinner s1;
    private javax.swing.JSpinner s2;
    private javax.swing.JSpinner s3;
    private javax.swing.JSpinner s4;
    // End of variables declaration//GEN-END:variables
}
