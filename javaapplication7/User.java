//press back to return to main page!!!
//every time you perform a operation press back to see the updated results!!!
//closing the window will terminate the program
//this program is using the existing database created using DBcreate and DBmain!!!
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import static javaapplication7.DBmain.DB_URL;
import static javaapplication7.DBmain.PASS;
import static javaapplication7.DBmain.USER;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class User extends javax.swing.JFrame {

    String[] cname={"Id","Title","Author","Price","Quantity"};
    ResultSet rs,rs1;
    DefaultTableModel model1;
   
    public User() {
        initComponents();
        DefaultTableModel model=new DefaultTableModel();
       model.setColumnIdentifiers(cname);
            DefaultTableModel model1=new DefaultTableModel();
            model1.setColumnIdentifiers(cname);
            jTable2.setModel(model1);
            jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_ALL_COLUMNS);
       jTable1.setModel(model);
       jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);

       try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         rs=stmt.executeQuery("SELECT * FROM books");
           
           while(rs.next())
           {
               String ex=rs.getString(1);
               String ex1=rs.getString(2);
               String ex2=rs.getString(3);
               String ex3=rs.getString(4);
               String ex4=rs.getString(5);
               model.addRow(new Object[]{ex,ex1,ex2,ex3,ex4});
           }
          rs1=stmt.executeQuery("SELECT Author FROM books");
          while(rs1.next())
          {
              String s=rs1.getString(1);
              jb1.addItem(s);
          }
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jb1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ONLINE BOOK STORE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(197, 20, 310, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("BOOK DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 110, 30);

        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 80, 530, 100);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("AUTHOR NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 260, 110, 30);

        jb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-" }));
        jb1.setToolTipText("");
        jb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jb1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(170, 260, 130, 30);

        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 312, 530, 100);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(605, 10, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        setVisible(false);
        Front obj=new Front();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jb1ItemStateChanged
        
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
            DefaultTableModel model1=new DefaultTableModel();
            model1.setColumnIdentifiers(cname);
            jTable2.setModel(model1);
            jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_ALL_COLUMNS);
            int jb=jb1.getSelectedIndex();
            String title1=jb1.getItemAt(jb);
            rs=stmt.executeQuery("SELECT * FROM books WHERE Author='" +title1+"'");
            while(rs.next())
            {
              model1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});   
            }  
            
        
        
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
        
    }//GEN-LAST:event_jb1ItemStateChanged

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jb1;
    // End of variables declaration//GEN-END:variables
}
