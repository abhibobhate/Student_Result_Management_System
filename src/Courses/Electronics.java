/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Courses;
import college.portal.*;
/**
 *
 * @author ABHITHOR GAMING
 */
public class Electronics extends javax.swing.JFrame {

    /**
     * Creates new form Electronics
     */
    public Electronics() {
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

        jPanel1 = new javax.swing.JPanel();
        AddNewStudent = new javax.swing.JButton();
        AddNewResult = new javax.swing.JButton();
        RegisteredStudent = new javax.swing.JButton();
        AllStudentResult = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddNewStudent.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        AddNewStudent.setText("Add New Student");
        AddNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStudentActionPerformed(evt);
            }
        });
        jPanel1.add(AddNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 30));

        AddNewResult.setBackground(new java.awt.Color(51, 102, 255));
        AddNewResult.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AddNewResult.setText("Add New Result");
        AddNewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewResultActionPerformed(evt);
            }
        });
        jPanel1.add(AddNewResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, 30));

        RegisteredStudent.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        RegisteredStudent.setText("Registered Student");
        RegisteredStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisteredStudentActionPerformed(evt);
            }
        });
        jPanel1.add(RegisteredStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 160, 30));

        AllStudentResult.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        AllStudentResult.setText("All Student Result");
        AllStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllStudentResultActionPerformed(evt);
            }
        });
        jPanel1.add(AllStudentResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 30));

        LogOut.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        LogOut.setText("Log Out");
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 120, 40));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel6.setText("Roll Number");

        jPanel2.setBackground(new java.awt.Color(255, 102, 153));

        jLabel10.setBackground(new java.awt.Color(255, 102, 204));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setText("Electronics Department");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Add_New_Student().setVisible(true);
    }//GEN-LAST:event_AddNewStudentActionPerformed

    private void AddNewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Add_New_Result().setVisible(true);
    }//GEN-LAST:event_AddNewResultActionPerformed

    private void RegisteredStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisteredStudentActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Registered_Student().setVisible(true);
    }//GEN-LAST:event_RegisteredStudentActionPerformed

    private void AllStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllStudentResultActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new All_Student_Result().setVisible(true);
    }//GEN-LAST:event_AllStudentResultActionPerformed

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
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Electronics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewResult;
    private javax.swing.JButton AddNewStudent;
    private javax.swing.JButton AllStudentResult;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton RegisteredStudent;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
