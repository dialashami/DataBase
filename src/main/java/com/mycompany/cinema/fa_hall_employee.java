/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class fa_hall_employee extends javax.swing.JFrame {
   Connection con;
       Statement ST;
       PreparedStatement ps;
       ResultSet rs;
    /**
     * Creates new form fa_hall_employee
     */
    public fa_hall_employee() {
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

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        refresh_ALL = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        refresh_ALL1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("HALL & EMPLOYEES ");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "H_ID", "reservation_times", "reservation_times"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable2.setBackground(new java.awt.Color(51, 51, 51));
        jTable2.setForeground(new java.awt.Color(204, 204, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "ID", "Salary", "phone_number"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable3.setBackground(new java.awt.Color(51, 51, 51));
        jTable3.setForeground(new java.awt.Color(204, 204, 204));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "HALL", "EMPLOYEE"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        refresh_ALL.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\cinema\\cinema4\\src\\pic\\Refresh-Icon (1).png")
        );
        refresh_ALL.setPreferredSize(new java.awt.Dimension(20, 20));
        refresh_ALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_ALLActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("GO TO HALLS");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("GO TO EMPLOYEE ");
        jButton2.setActionCommand("GO TO EMPLOYEES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("EMPLOYEE NAME");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("EMPLOYEE ID");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("HALL ID");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setActionCommand("ADD HALL TO EMPLOYEE");
        jButton1.setLabel("CONIECT HALL &EMPLOYEE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("DECONIECT HALL &EMPLOYEE");
        jButton4.setActionCommand("ADD HALL TO EMPLOYEE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("HALL & EMPLOYEES ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 2, 390, 60));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable4.setBackground(new java.awt.Color(51, 51, 51));
        jTable4.setForeground(new java.awt.Color(204, 204, 204));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "H_ID", "reservation_times", "reservation_times"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 62, 320, 120));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable5.setBackground(new java.awt.Color(51, 51, 51));
        jTable5.setForeground(new java.awt.Color(204, 204, 204));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "ID", "Salary", "phone_number"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 192, 320, 140));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable6.setBackground(new java.awt.Color(51, 51, 51));
        jTable6.setForeground(new java.awt.Color(204, 204, 204));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "HALL", "EMPLOYEE"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 62, 150, 260));

        refresh_ALL1.setIcon(new ImageIcon("C:\\Users\\hp\\Downloads\\cinema\\cinema4\\src\\pic\\Refresh-Icon (1).png")
        );
        refresh_ALL1.setPreferredSize(new java.awt.Dimension(20, 20));
        refresh_ALL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_ALL1ActionPerformed(evt);
            }
        });
        jPanel1.add(refresh_ALL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 22, 40, 30));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 102, 102));
        jButton5.setText("GO TO HALLS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 392, 170, -1));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 102));
        jButton6.setText("GO TO EMPLOYEE ");
        jButton6.setActionCommand("GO TO EMPLOYEES");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 422, 170, -1));

        jTextField4.setBackground(new java.awt.Color(102, 102, 102));
        jTextField4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 352, 100, 20));

        jTextField5.setBackground(new java.awt.Color(102, 102, 102));
        jTextField5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 382, 100, 20));

        jTextField6.setBackground(new java.awt.Color(102, 102, 102));
        jTextField6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 412, 100, 20));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("EMPLOYEE NAME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 412, 130, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("EMPLOYEE ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 382, 100, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("HALL ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 352, 58, -1));

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(204, 204, 204));
        jButton7.setActionCommand("ADD HALL TO EMPLOYEE");
        jButton7.setLabel("CONIECT HALL &EMPLOYEE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 442, 260, -1));

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 204));
        jButton8.setText("DECONIECT HALL &EMPLOYEE");
        jButton8.setActionCommand("ADD HALL TO EMPLOYEE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 472, 260, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Desktop\\CE_Diala\\3rd year\\DataBase\\cinema\\src\\pic\\show_all.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblMod1 = (DefaultTableModel) jTable1.getModel();
        int index=jTable1.getSelectedRow();
        if (index != -1 && index < tblMod1.getRowCount())
        {

            String  IDH=tblMod1.getValueAt(index, 0).toString();
            String  RTIME=tblMod1.getValueAt(index, 1).toString();
            String  NUM_SEAT=tblMod1.getValueAt(index, 2).toString();

            jTextField1.setText(IDH);

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel tblMod2 = (DefaultTableModel) jTable2.getModel();
        int index=jTable2.getSelectedRow();
        if (index != -1 && index < tblMod2.getRowCount())
        {

            String  name=tblMod2.getValueAt(index, 0).toString();
            String  IDE=tblMod2.getValueAt(index, 1).toString();
            String  Salary=tblMod2.getValueAt(index, 2).toString();
            String  phone_number=tblMod2.getValueAt(index, 3).toString();

            jTextField2.setText(IDE);
            jTextField3.setText(name);

        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        DefaultTableModel tblMod3 = (DefaultTableModel) jTable3.getModel();
        int index=jTable3.getSelectedRow();
        if (index != -1 && index < tblMod3.getRowCount())
        {

            String  IDH=tblMod3.getValueAt(index, 1).toString();
            String  IDE=tblMod3.getValueAt(index, 0).toString();

            jTextField1.setText(IDH);
            jTextField2.setText(IDE);
        }

        String nameE="";

        String IDEE=jTextField2.getText();
        try
        {
            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
            con =DriverManager.getConnection(conninfo,"dialaa","12345");
            con .setAutoCommit(false);

            String qury2="SELECT * FROM cinema.employee where eid= '"+IDEE+"'";
            ST=con.createStatement();             ///////////////////////////////////////////////////////////
            rs=ST.executeQuery(qury2);
            if (rs.next())
            {
                nameE=rs.getString(1);

            }
            jTextField3.setText(nameE);

            con.commit();
            con.close();
        }
        catch(Exception ex )
        {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null , " not connected");

        }

    }//GEN-LAST:event_jTable3MouseClicked

    private void refresh_ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_ALLActionPerformed
        try{

            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
            con =DriverManager.getConnection(conninfo,"dialaa","12345");
            con .setAutoCommit(false);

            String qury2="SELECT * FROM cinema.e_h ";
            ST=con.createStatement(ResultSet .TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=ST.executeQuery(qury2);
            DefaultTableModel tblMod3 = (DefaultTableModel) jTable3.getModel();
            tblMod3.setRowCount(0);
            while (rs.next())
            {
                tblMod3.addRow(new String []{rs.getString(2),rs.getString(1) });
            }

            String qury="SELECT * FROM cinema.employee  ";
            ST=con.createStatement(ResultSet .TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=ST.executeQuery(qury);
            DefaultTableModel tblMod2 = (DefaultTableModel) jTable2.getModel();
            tblMod2.setRowCount(0);
            while (rs.next())
            {
                tblMod2.addRow(new String []{rs.getString(1),rs.getString(2),rs.getString(5),rs.getString(6)});
            }

            String qury1="SELECT * FROM cinema.hall  ";
            ST=con.createStatement(ResultSet .TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=ST.executeQuery(qury1);
            DefaultTableModel tblMod1 = (DefaultTableModel) jTable1.getModel();
            tblMod1.setRowCount(0);
            while (rs.next())
            {
                tblMod1.addRow(new String []{rs.getString(1),rs.getString(2),rs.getString(3) });
            }

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");

            con.commit();
            con.close();
        }
        catch(Exception ex )
        {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null , " not connected");

        }
    }//GEN-LAST:event_refresh_ALLActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String HID=jTextField1.getText();
        String EID=jTextField2.getText();

        try
        {
            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
            con =DriverManager.getConnection(conninfo,"diala","12345");
            con .setAutoCommit(false);

            String qury2="INSERT INTO cinema.e_h (eid2, hid2 ) VALUES (?, ?)";
            ps=con .prepareStatement(qury2);

            ps.setString(1, EID);
            ps.setString(2, HID);

            ps .executeUpdate();
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null , "Done");

        }

        catch(Exception ex )
        {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null , " not connected");

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //  String HID=jTextField1.getText();
        // String EID=jTextField2.getText();

        try
        {
            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
            con =DriverManager.getConnection(conninfo,"dialaa","12345");
            con .setAutoCommit(false);

            DefaultTableModel tblMod3 = (DefaultTableModel) jTable3.getModel();
            int index=jTable3.getSelectedRow();

            String  EID=tblMod3.getValueAt(index, 0).toString();
            String  HID=tblMod3.getValueAt(index, 1).toString();

            String qury2="DELETE FROM cinema.e_h where(eid2=? and hid2=?)";
            ps=con .prepareStatement(qury2);

            ps.setString(1, EID);
            ps.setString(2, HID);
            ps .executeUpdate();

            String qury3="DELETE FROM cinema.employee  where(eid2=?)";
            ps=con .prepareStatement(qury3);
            ps.setString(1, EID);
            ps .executeUpdate();

            String qury4="DELETE FROM cinema.hall  where( hid2=?)";
            ps=con .prepareStatement(qury4);
            ps.setString(1, HID);
            ps .executeUpdate();

            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null , "Done");

        }

        catch(Exception ex )
        {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null , " not connected");

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        DefaultTableModel tblMod1 = (DefaultTableModel) jTable1.getModel();
        int index=jTable1.getSelectedRow();
        if (index != -1 && index < tblMod1.getRowCount())
        {

            String  IDH=tblMod1.getValueAt(index, 0).toString();
            String  RTIME=tblMod1.getValueAt(index, 1).toString();
            String  NUM_SEAT=tblMod1.getValueAt(index, 2).toString();

            jTextField1.setText(IDH);

        }

    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        DefaultTableModel tblMod2 = (DefaultTableModel) jTable2.getModel();
        int index=jTable2.getSelectedRow();
        if (index != -1 && index < tblMod2.getRowCount())
        {

            String  name=tblMod2.getValueAt(index, 0).toString();
            String  IDE=tblMod2.getValueAt(index, 1).toString();
            String  Salary=tblMod2.getValueAt(index, 2).toString();
            String  phone_number=tblMod2.getValueAt(index, 3).toString();

            jTextField2.setText(IDE);
            jTextField3.setText(name);

        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        DefaultTableModel tblMod3 = (DefaultTableModel) jTable3.getModel();
        int index=jTable3.getSelectedRow();
        if (index != -1 && index < tblMod3.getRowCount())
        {

            String  IDH=tblMod3.getValueAt(index, 1).toString();
            String  IDE=tblMod3.getValueAt(index, 0).toString();

            jTextField1.setText(IDH);
            jTextField2.setText(IDE);
        }

        String nameE="";

        String IDEE=jTextField2.getText();
        try
        {
            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
            con =DriverManager.getConnection(conninfo,"dialaa","12345");
            con .setAutoCommit(false);

            String qury2="SELECT * FROM cinema.employee where eid= '"+IDEE+"'";
            ST=con.createStatement();             ////////////////////////////////////////////////////////////
            rs=ST.executeQuery(qury2);
            if (rs.next())
            {
                nameE=rs.getString(1);

            }
            jTextField3.setText(nameE);

            con.commit();
            con.close();
        }
        catch(Exception ex )
        {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null , " not connected");

        }

    }//GEN-LAST:event_jTable6MouseClicked

    private void refresh_ALL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_ALL1ActionPerformed
        try{

            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
            con =DriverManager.getConnection(conninfo,"dialaa","12345");
            con .setAutoCommit(false);

            String qury2="SELECT * FROM cinema.e_h ";
            ST=con.createStatement(ResultSet .TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=ST.executeQuery(qury2);
            DefaultTableModel tblMod3 = (DefaultTableModel) jTable3.getModel();
            tblMod3.setRowCount(0);
            while (rs.next())
            {
                tblMod3.addRow(new String []{rs.getString(2),rs.getString(1) });
            }

            String qury="SELECT * FROM cinema.employee  ";
            ST=con.createStatement(ResultSet .TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=ST.executeQuery(qury);
            DefaultTableModel tblMod2 = (DefaultTableModel) jTable2.getModel();
            tblMod2.setRowCount(0);
            while (rs.next())
            {
                tblMod2.addRow(new String []{rs.getString(1),rs.getString(2),rs.getString(5),rs.getString(6)});
            }

            String qury1="SELECT * FROM cinema.hall  ";
            ST=con.createStatement(ResultSet .TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=ST.executeQuery(qury1);
            DefaultTableModel tblMod1 = (DefaultTableModel) jTable1.getModel();
            tblMod1.setRowCount(0);
            while (rs.next())
            {
                tblMod1.addRow(new String []{rs.getString(1),rs.getString(2),rs.getString(3) });
            }

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");

            con.commit();
            con.close();
        }
        catch(Exception ex )
        {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null , " not connected");

        }
    }//GEN-LAST:event_refresh_ALL1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        String HID=jTextField1.getText();
        String EID=jTextField2.getText();

        try
        {
            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
            con =DriverManager.getConnection(conninfo,"dialaa","12345");
            con .setAutoCommit(false);

            String qury2="INSERT INTO cinema.e_h (eid2, hid2 ) VALUES (?, ?)";
            ps=con .prepareStatement(qury2);

            ps.setString(1, EID);
            ps.setString(2, HID);

            ps .executeUpdate();
            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null , "Done");

        }

        catch(Exception ex )
        {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null , " not connected");

        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //  String HID=jTextField1.getText();
        // String EID=jTextField2.getText();

        try
        {
            DriverManager.registerDriver(new  org.postgresql.Driver());
            String conninfo="jdbc:postgresql://localhost:5432/postgres";
            con =DriverManager.getConnection(conninfo,"dialaa","12345");
            con .setAutoCommit(false);

            DefaultTableModel tblMod3 = (DefaultTableModel) jTable3.getModel();
            int index=jTable3.getSelectedRow();

            String  EID=tblMod3.getValueAt(index, 1).toString();
            String  HID=tblMod3.getValueAt(index, 2).toString();

            String qury2="DELETE FROM cinema.e_h where(eid2=? and hid2=?)";
            ps=con .prepareStatement(qury2);

            ps.setString(1, EID);
            ps.setString(2, HID);
            ps .executeUpdate();

            String qury3="DELETE FROM cinema.employee  where( eid=?)";
            ps=con .prepareStatement(qury3);
            ps.setString(1, EID);
            ps .executeUpdate();

            String qury4="DELETE FROM cinema.hall  where( hid=?)";
            ps=con .prepareStatement(qury4);
            ps.setString(1, HID);
            ps .executeUpdate();

            con.commit();
            con.close();
            JOptionPane.showMessageDialog(null , "Done");

        }

        catch(Exception ex )
        {

            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null , " not connected");

        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(fa_hall_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fa_hall_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fa_hall_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fa_hall_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fa_hall_employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton refresh_ALL;
    private javax.swing.JButton refresh_ALL1;
    // End of variables declaration//GEN-END:variables
}
