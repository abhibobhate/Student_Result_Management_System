/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package college.portal;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ABHITHOR GAMING
 */
public class Add_New_Student extends javax.swing.JFrame {

    /**
     * Creates new form Add_New_Student
     */
    public Add_New_Student() {
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
        jLabel1 = new javax.swing.JLabel();
        J1 = new javax.swing.JLabel();
        BranchName = new javax.swing.JLabel();
        RollNumber = new javax.swing.JLabel();
        FathersName1 = new javax.swing.JLabel();
        Name2 = new javax.swing.JLabel();
        Name3 = new javax.swing.JLabel();
        coursename = new javax.swing.JComboBox<>();
        branchName = new javax.swing.JComboBox<>();
        FathersName = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        rollnumber = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddNewStudent.setBackground(new java.awt.Color(51, 102, 255));
        AddNewStudent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        AddNewStudent.setText("Add New Student");
        AddNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewStudentActionPerformed(evt);
            }
        });
        jPanel1.add(AddNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 30));

        AddNewResult.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        AddNewResult.setText("Add New Result");
        AddNewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewResultActionPerformed(evt);
            }
        });
        jPanel1.add(AddNewResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 160, 30));

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
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        jLabel1.setText(".");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 10, -1));

        J1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        J1.setText("Course Name");
        getContentPane().add(J1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 80, 20));

        BranchName.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        BranchName.setText("Branch Name");
        getContentPane().add(BranchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, 20));

        RollNumber.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        RollNumber.setText("Roll Number");
        getContentPane().add(RollNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 90, 20));

        FathersName1.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        FathersName1.setText("Father's Name");
        getContentPane().add(FathersName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 110, 30));

        Name2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        Name2.setText("Gender");
        getContentPane().add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 80, 30));

        Name3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        Name3.setText("Name");
        getContentPane().add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 80, 30));

        coursename.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        coursename.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "M.tech", "BCA", "MCA", "MSC" }));
        coursename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursenameActionPerformed(evt);
            }
        });
        getContentPane().add(coursename, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 80, 30));

        branchName.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        branchName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "IT", "Civil", "Electronics", "Maths" }));
        getContentPane().add(branchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 80, 30));

        FathersName.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        FathersName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FathersNameActionPerformed(evt);
            }
        });
        getContentPane().add(FathersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 120, 30));

        Gender.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 80, 30));

        rollnumber.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        rollnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnumberActionPerformed(evt);
            }
        });
        getContentPane().add(rollnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 120, 30));

        name.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 120, 30));

        Save.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/college/portal/save.png"))); // NOI18N
        Save.setText(" Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 120, 40));

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

    private void coursenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursenameActionPerformed

    private void FathersNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FathersNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FathersNameActionPerformed

    private void rollnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollnumberActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        String course1=(String)(coursename.getSelectedItem());
        String branch1=(String)(branchName.getSelectedItem());
        String roll=rollnumber.getText();
        String name1=this.name.getText();
        String father=FathersName.getText();
        String gender1=(String)(Gender.getSelectedItem());
        
        if(course1.equals("BCA") || course1.equals("MCA")){
            if(!branch1.equals("CS")){
                JOptionPane.showMessageDialog(null, "Selected Branch is not present in this Course");
                return;
            }
            if(course1.equals("BCA") && roll.charAt(0)!='3'){
                JOptionPane.showMessageDialog(null, "For BCA Course , Roll number should initilize with 3");
                return;
            }
            if(course1.equals("MCA") && roll.charAt(0)!='4'){
                JOptionPane.showMessageDialog(null, "For MCA Course , Roll number should initilize with 4");
                return;
            }
        }
        if(course1.equals("B.Tech") || course1.equals("M.Tech")){
            if(course1.equals("B.Tech") && roll.charAt(0)!='1'){
                JOptionPane.showMessageDialog(null, "For B.Tech Course , Roll number should initilize with 1");
                return;
            }
            if(course1.equals("M.Tech") && roll.charAt(0)!='2'){
                JOptionPane.showMessageDialog(null, "For M.Tech Course , Roll number should initilize with 2");
                return;
            }
        }
        
        if(course1.equals("MSC")){
            if(!branch1.equals("Maths")){
                JOptionPane.showMessageDialog(null, "Selected Branch is not present in this Course");
                return;
            }
            if(roll.charAt(0)!='5'){
                JOptionPane.showMessageDialog(null, "For Msc Course , Roll number should initilize with 5");
                return;
            }
        }
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/portal","root","Abhi@123");
           
            Statement st=con.createStatement();
//            st.executeUpdate("insert into student(rollno,course,branch,name,fathername,gender) values(rollno,course,branch,name,fathername,gender)");
            int executeUpdate = st.executeUpdate("insert into student(rollno,course,branch,name,fathername,gender) values('"+roll+"','"+course1+"','"+branch1+"','"+name1+"','"+father+"','"+gender1+"') ");
               JOptionPane.showMessageDialog(null, "Data Updated Successfully");
               setVisible(false);
               new Add_New_Student().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminHome().setVisible(true);
        
    }//GEN-LAST:event_LogOutActionPerformed

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
            java.util.logging.Logger.getLogger(Add_New_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_New_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_New_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_New_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_New_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewResult;
    private javax.swing.JButton AddNewStudent;
    private javax.swing.JButton AllStudentResult;
    private javax.swing.JLabel BranchName;
    private javax.swing.JTextField FathersName;
    private javax.swing.JLabel FathersName1;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JLabel J1;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JButton RegisteredStudent;
    private javax.swing.JLabel RollNumber;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> branchName;
    private javax.swing.JComboBox<String> coursename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rollnumber;
    // End of variables declaration//GEN-END:variables
}
