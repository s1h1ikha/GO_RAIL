package gorail;

import javax.swing.table.DefaultTableModel;

public class book extends javax.swing.JFrame {

    
    public book() {
        initComponents();
    }
    
    String trno1;
    String trname1;
    String src1;
    String dest1;
    String classname1;
    String classcode1;
    String date1;
    String status1;
    printticket frame=new printticket();
    void bookfunc(String trno,String trname,String src,String dest,String classname,String classcode,String dae,String status){
        
        frame.printfunc(trno,trname,src,dest,classname,classcode,dae,status);
        tno.setText(trno);
        ccode.setText(classcode);
        source.setText(src);
        destination.setText(dest);
        date.setText(dae);   
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        source = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tno = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        destination = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        age2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ticketno = new javax.swing.JTextField();
        ccode = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        quota2 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        gender2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBackground(new java.awt.Color(102, 0, 0));
        jButton11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("BOOK TICKET");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 750, 32));

        source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceActionPerformed(evt);
            }
        });
        jPanel7.add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 203, 144, 33));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("TRAIN NO.");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 157, 79, 33));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("SOURCE");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 202, 79, 33));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("DATE.");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 255, 79, -1));

        tno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnoActionPerformed(evt);
            }
        });
        jPanel7.add(tno, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 158, 144, 33));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Quota");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 322, 44, 33));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("DESTINATION");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 202, 107, 33));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("CLASS CODE");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 156, 107, 34));

        destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationActionPerformed(evt);
            }
        });
        jPanel7.add(destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 203, 142, 33));

        Gender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        jPanel7.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 322, 71, 33));

        age2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age2ActionPerformed(evt);
            }
        });
        jPanel7.add(age2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 367, 144, 33));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setText("NO.OF TICKETS");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 247, -1, 33));

        ticketno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketnoActionPerformed(evt);
            }
        });
        jPanel7.add(ticketno, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 248, 142, 33));
        jPanel7.add(ccode, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 156, 142, 35));

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel7.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 247, 144, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                           Enter Detail Of Individual Passenger");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 299, 475, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Age");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 322, 44, 33));

        quota2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quota2.setMaximumRowCount(5);
        quota2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GN", "LD", "HO", "DF", "PH", "FT", "DP", "CK", "PT", "SS", "HP", "RE", "GNRS", "OS", "PQ", "RC(RAC)", "RS", "YU", "LB" }));
        jPanel7.add(quota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 370, 144, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Name");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 322, 71, 33));

        name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name2ActionPerformed(evt);
            }
        });
        jPanel7.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 368, 144, 30));

        gender2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel7.add(gender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 366, -1, 34));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorail/Ok-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 366, 39, 34));

        jButton12.setBackground(new java.awt.Color(102, 0, 0));
        jButton12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorail/Confirm.png"))); // NOI18N
        jButton12.setText("CONFIRM");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 569, 150, 33));

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "             Name", "            Gender", "            Age", "            Quota"
            }
        ));
        jScrollPane2.setViewportView(Table2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 450, 643, 91));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorail/logo.png"))); // NOI18N
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 112));

        jLabel2.setBackground(new java.awt.Color(153, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("       GORAIL ");
        jLabel2.setOpaque(true);
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 610, 112));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorail/back.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gorail/bk3.jpg"))); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 152, 760, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       
        this.dispose();
        frame.setVisible(true);
        PAYMENT ooo = new PAYMENT();
        ooo.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name2ActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void ticketnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticketnoActionPerformed

    private void age2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age2ActionPerformed

    private void destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationActionPerformed

    private void tnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnoActionPerformed

    private void sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             
             DefaultTableModel model = ( DefaultTableModel )Table2.getModel();
             String name22=name2.getText();
             String age22=age2.getText();
             String quot22  = quota2.getSelectedItem().toString();
             String gender22  = gender2.getSelectedItem().toString();
             name2.setText("");
             age2.setText("");
             model.addRow(new Object[] {name22,gender22,age22,quot22 });
             frame.printfunc1(name22,gender22,age22,quot22);
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        this.dispose();
        Gorail1 ob = new Gorail1();
        ob.setVisible(true);
    }//GEN-LAST:event_jLabel4MousePressed
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
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JTable Table2;
    private javax.swing.JTextField age2;
    private javax.swing.JTextField ccode;
    private javax.swing.JTextField date;
    private javax.swing.JTextField destination;
    private javax.swing.JComboBox<String> gender2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name2;
    private javax.swing.JComboBox<String> quota2;
    private javax.swing.JTextField source;
    private javax.swing.JTextField ticketno;
    private javax.swing.JTextField tno;
    // End of variables declaration//GEN-END:variables
}
