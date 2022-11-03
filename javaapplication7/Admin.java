//press back to return to main page!!!
//every time you perform a operation press back to see the updated results!!!
//closing the window will terminate the program
//this program is using the existing database created using DBcreate and DBmain!!!
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin extends javax.swing.JFrame {

    ResultSet rs,rs1;
    int it,i1,i2;

    public Admin() {
        initComponents();
         try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         rs=stmt.executeQuery("SELECT Id FROM books");
         
           while(rs.next())
           {
               String ex=rs.getString(1);
               id1.addItem(ex);
           }
           rs1=stmt.executeQuery("SELECT Title FROM books");
           while(rs1.next())
           {
               String ex1=rs1.getString(1);
               t1.addItem(ex1);
               t2.addItem(ex1);
           }
       }
       catch(Exception e){
           System.out.println(e);
       }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JComboBox<>();
        id1 = new javax.swing.JComboBox<>();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Id2 = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Title = new javax.swing.JTextField();
        Price2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ONLINE BOOK STORE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 210, 21);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Quantity:");
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 110, 70, 20);

        jLabel4.setText("ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 60, 16);

        t1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-" }));
        t1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t1ItemStateChanged(evt);
            }
        });
        t1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                t1ComponentHidden(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(80, 70, 260, 22);

        t2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-" }));
        t2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t2ItemStateChanged(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(80, 110, 260, 22);

        id1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-" }));
        id1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                id1ItemStateChanged(evt);
            }
        });
        getContentPane().add(id1);
        id1.setBounds(140, 160, 220, 30);
        getContentPane().add(tf1);
        tf1.setBounds(430, 70, 110, 22);
        getContentPane().add(tf2);
        tf2.setBounds(430, 110, 110, 22);

        jButton1.setText("Update Price");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 70, 140, 22);

        jButton2.setText("Update Quantity");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 110, 140, 22);

        jButton3.setText("DELETE ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(420, 160, 210, 30);

        jLabel7.setText("ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 260, 40, 16);

        jLabel8.setText("Author");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 320, 70, 16);

        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 380, 70, 16);
        getContentPane().add(Id2);
        Id2.setBounds(150, 250, 130, 30);
        getContentPane().add(Author);
        Author.setBounds(150, 310, 130, 30);
        getContentPane().add(Quantity);
        Quantity.setBounds(150, 370, 130, 30);

        jLabel10.setText("Title");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 260, 70, 16);

        jLabel11.setText("Price");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 320, 70, 16);

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(430, 370, 220, 40);
        getContentPane().add(Title);
        Title.setBounds(380, 250, 260, 30);
        getContentPane().add(Price2);
        Price2.setBounds(380, 310, 260, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Title");
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 70, 80, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Title");
        jLabel13.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 110, 80, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Price:");
        jLabel14.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 70, 60, 20);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(610, 10, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_t1ComponentHidden
       
    }//GEN-LAST:event_t1ComponentHidden

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
       
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        setVisible(false);
        Front obj=new Front();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        int a=Integer.parseInt(Id2.getText());
        String b=Author.getText();
        int c=Integer.parseInt(Quantity.getText());
        String d=Title.getText();
        float e=Float.parseFloat(Price2.getText());
        Id2.setText("");
        Author.setText("");
        Quantity.setText("");
        Title.setText("");
        Price2.setText("");
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO books VALUES('"+a+"','"+d+"','"+b+"','"+e+"','"+c+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String id=id1.getItemAt(it);
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         stmt.executeUpdate("DELETE FROM books WHERE id = '"+id+"'");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void id1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_id1ItemStateChanged
        
        it=id1.getSelectedIndex();
    }//GEN-LAST:event_id1ItemStateChanged

    private void t1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t1ItemStateChanged
        
        i1=t1.getSelectedIndex();
    }//GEN-LAST:event_t1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        float price=Float.parseFloat(tf1.getText());
        String title=t1.getItemAt(i1);
        tf1.setText("");
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         stmt.executeUpdate("UPDATE books SET Price= '" +price+"' WHERE Title = '" +title+"'");
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t2ItemStateChanged
        
        i2=t2.getSelectedIndex();
    }//GEN-LAST:event_t2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int quantity=Integer.parseInt(tf2.getText());
        String title=t2.getItemAt(i2);
        tf2.setText("");
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
         Statement stmt = conn.createStatement();){
         stmt.executeUpdate("UPDATE books SET Quantity= '" +quantity+"' WHERE Title = '" +title+"'");
           System.out.println("Done");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JTextField Id2;
    private javax.swing.JTextField Price2;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Title;
    private javax.swing.JComboBox<String> id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JComboBox<String> t1;
    private javax.swing.JComboBox<String> t2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
