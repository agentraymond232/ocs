/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chintu
 */
import java.sql.*;
import javax.swing.*;
public class register extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null,pst2=null;
ResultSet rs=null;
    /**
     * Creates new form register
     */
    public register() {
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

        jTextField5 = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        emailid = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        registerbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rank = new javax.swing.JTextField();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lastname.setBackground(new java.awt.Color(0, 0, 51));
        lastname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        getContentPane().add(lastname);
        lastname.setBounds(450, 200, 270, 30);

        emailid.setBackground(new java.awt.Color(0, 0, 51));
        emailid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailid.setForeground(new java.awt.Color(255, 255, 255));
        emailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailidActionPerformed(evt);
            }
        });
        getContentPane().add(emailid);
        emailid.setBounds(450, 250, 270, 30);

        username.setBackground(new java.awt.Color(0, 0, 51));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(450, 350, 270, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Last Name :");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 210, 90, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("E-mail id:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 260, 63, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("User name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 360, 78, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 410, 76, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Re-enter Password:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 460, 137, 20);

        password.setBackground(new java.awt.Color(0, 0, 51));
        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(450, 400, 270, 30);

        password2.setBackground(new java.awt.Color(0, 0, 51));
        password2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password2.setForeground(new java.awt.Color(255, 255, 255));
        password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password2ActionPerformed(evt);
            }
        });
        getContentPane().add(password2);
        password2.setBounds(450, 450, 270, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Sign-up");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 80, 92, 29);

        registerbutton.setBackground(new java.awt.Color(0, 0, 51));
        registerbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registerbutton.setForeground(new java.awt.Color(255, 255, 255));
        registerbutton.setText("Register");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(registerbutton);
        registerbutton.setBounds(420, 500, 110, 25);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("First Name :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 160, 90, 17);

        firstname.setBackground(new java.awt.Color(0, 0, 51));
        firstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(firstname);
        firstname.setBounds(450, 150, 270, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Rank:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 310, 60, 17);

        rank.setBackground(new java.awt.Color(0, 0, 51));
        rank.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rank.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rank);
        rank.setBounds(450, 300, 270, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailidActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password2ActionPerformed

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        String Firstname=firstname.getText();
        String Lastname=lastname.getText();
        String Emailid=emailid.getText();
        String Username=username.getText();
        String Password=password.getText();
        String Repassword=password2.getText();
        int RanK = Integer.parseInt(rank.getText());
        if(Password.equals(Repassword)){
             try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
       
           String sql,sql2;
          
           sql2="select * from student where UserName='{Username}' or Rank='{RanK}'";
          
            pst2=conn.prepareStatement(sql2);
           rs=pst2.executeQuery();
           
           if(rs.next()){
               JOptionPane.showMessageDialog(null,"Username or rank already exists");
           }else{
           sql="insert into student values('"+Firstname+"','"+Lastname+"','"+Emailid+"',+'"+Username+"','"+Password+"',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,'"+RanK+"',0,1)";
          pst=conn.prepareStatement(sql);
          pst.executeUpdate();
                      JOptionPane.showMessageDialog(null,"registration successful");
                      Loginpage l=new Loginpage();
                      l.setVisible(true);
                      this.dispose();
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }  
        }else{
                        JOptionPane.showMessageDialog(null,"re-enter password");

        }
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentHidden

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailid;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField rank;
    private javax.swing.JButton registerbutton;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
