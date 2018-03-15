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
public class courseinfo extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst;

    ResultSet s=null,b;
    /**
     * Creates new form courseinfo
     */
    String[] a=new String[10];
    public courseinfo(int i,ResultSet rs){
        b=rs;
        if(i==1){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
         
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c1>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
           
              while(s.next()){
           
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
          if(i==2){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
          
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c2>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
              
              while(s.next()){
             
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
            if(i==3){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
            
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c3>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
            
              while(s.next()){
 
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
              if(i==4){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
        
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c4>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
         
              while(s.next()){
            
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
                if(i==5){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
           
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c5>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
            
              while(s.next()){
               
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
                  if(i==6){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
          
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c6>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
          
              while(s.next()){
                 
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
                    if(i==7){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
              
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c7>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
          
              while(s.next()){
             
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
                      if(i==8){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
            
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c8>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
            
              while(s.next()){
               
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
                        if(i==9){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
               
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c9>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
       
              while(s.next()){
                 
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
                          if(i==10){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost/userdetails","root","1234");
               
              int j=0;
              while(j<10){
                  a[j]=null;
                  j++;
              } 
              j=0;
              String sql;
              sql="select * from college where c10>0";
              pst=conn.prepareStatement(sql);
              s=pst.executeQuery();
         
              while(s.next()){
             
                  a[j]=s.getString("CollegeName");
                  j++;
              }
              
              
           } 
     catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
      }
        }
        initComponents();
    }
    public courseinfo() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText(a[0]);

        jLabel2.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText(a[1]);

        jLabel3.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText(a[2]);

        jLabel4.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText(a[3]);

        jLabel5.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText(a[6]);

        jLabel6.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText(a[4]);

        jLabel7.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText(a[5]);

        jLabel8.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText(a[7]);

        jLabel9.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText(a[8]);

        jLabel11.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText(a[9]);

        jButton1.setFont(new java.awt.Font("AR CENA", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      home f=new home(b);
      f.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(courseinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
