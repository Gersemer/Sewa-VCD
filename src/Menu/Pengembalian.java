/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Pengembalian.java
 *
 * Created on 25 Nov 13, 22:06:06
 */
package Menu;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import javax.xml.soap.Text;
import java.sql.Connection;
import java.sql.Statement;  
import java.sql.ResultSet;
import javax.swing.table.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Windows Seven
 */
public class Pengembalian extends javax.swing.JFrame {
    DefaultComboBoxModel sudahmengembalikan;
    DefaultTableModel modeltab;
    ResultSet rs=null;
    private Statement stat;
    private ResultSet res;

    /** Creates new form Pengembalian */
    public Pengembalian() {
        initComponents();
        sudahmengembalikan=new DefaultComboBoxModel();
        cbsudahmengembalikan.setModel(sudahmengembalikan);
        cbsudahmengembalikan.addItem("Sudah");
        cbsudahmengembalikan.addItem("Belum");
        modeltab = new DefaultTableModel();
        tablepengembalian.setModel(modeltab);
        modeltab.addColumn("NIK");
        modeltab.addColumn("No.VCD");
        modeltab.addColumn("Sudah Mengembalikan");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NIK = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btok = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();
        txtnik = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnovcd = new javax.swing.JTextField();
        cbsudahmengembalikan = new javax.swing.JComboBox();
        bthapus = new javax.swing.JButton();
        btcancel1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablepengembalian = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pengembalian VCD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel1)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NIK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NIK.setText("NIK");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(":");

        btok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btok.setText("SIMPAN");
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });

        btcancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        txtnik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("No. VCD");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText(":");

        txtnovcd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbsudahmengembalikan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bthapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bthapus.setText("HAPUS");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        btcancel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btcancel1.setText("RESET");
        btcancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(NIK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbsudahmengembalikan, javax.swing.GroupLayout.Alignment.TRAILING, 0, 214, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnovcd)
                            .addComponent(txtnik, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btcancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bthapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btcancel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIK)
                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtnovcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbsudahmengembalikan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bthapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcancel)
                    .addComponent(btcancel1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tablepengembalian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tablepengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NIK", "Nomer VCD", "Sudah Kembali"
            }
        ));
        tablepengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablepengembalian);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

public void tampilkan()
{
    String user="root";
    String pass="";
    String host="localhost";
    String db="rental_vcd";
    String url;
    String driver="com.mysql.jdbc.Driver";
    modeltab.setNumRows(0);
    try
    {
    Class.forName(driver);
    url="jdbc:mysql://"+host+"/"+db;
    Connection koneksi = DriverManager.getConnection(url,user,pass);
    Statement kal = koneksi.createStatement();
    String query2 = "SELECT * FROM pengembalian";
    ResultSet tampil = kal.executeQuery(query2);
    while(tampil.next())
        {
            modeltab.addRow(new Object[]{
                tampil.getString("nik"),tampil.getString("no_vcd"),tampil.getString("sdh_kembali")});
        }
    kal.close();
    koneksi.close();
    }
    catch(Exception e)
    {System.err.println(e.getMessage());}
}
public void bersihkan()
{  
   txtnik.setText(null);
   txtnovcd.setText(null);
   
}
    
private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
// TODO add your handling code here:
   new Menu().setVisible(true);
   dispose();
}//GEN-LAST:event_btcancelActionPerformed

private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
// TODO add your handling code here:
   String user="root";
    String pass="";
    String host="localhost";
    String db="rental_vcd";
    String url;
    String driver="com.mysql.jdbc.Driver";
    String jenis_kelamin;
    
try
{
    Class.forName(driver);
    url="jdbc:mysql://"+host+"/"+db;
    Connection koneksi =DriverManager.getConnection(url, user, pass);
    Statement kal=koneksi.createStatement();
    String query="INSERT INTO pengembalian  VALUES('"+txtnik.getText()+"','"+txtnovcd.getText()
            +"','"+cbsudahmengembalikan.getSelectedItem()+"')";
    
    if(!kal.execute(query))
    {
        JOptionPane.showMessageDialog(this,"Data Berhasil Disimpan");

     
    }
    kal.close();
    koneksi.close();
}
catch(Exception e)
{
    System.err.println(e.getMessage());
    
}
}//GEN-LAST:event_btokActionPerformed

private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
   tampilkan();
}//GEN-LAST:event_formWindowActivated

private void tablepengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepengembalianMouseClicked
// TODO add your handling code here:
   int      row=tablepengembalian.getSelectedRow();
            txtnik.setText(tablepengembalian.getValueAt(row, 0).toString());
            txtnovcd.setText(tablepengembalian.getValueAt(row, 1).toString());
            cbsudahmengembalikan.setSelectedItem(tablepengembalian.getValueAt(row, 2));
}//GEN-LAST:event_tablepengembalianMouseClicked

private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
// TODO add your handling code here:
   int Data=JOptionPane.showConfirmDialog(this,"Apakah Anda yakin ingin menghapus data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (Data==0)
       {
            JOptionPane.showMessageDialog(this,"Data Berhasil dihapus ");
       }
    
        String user="root";
        String pass="";
        String host="localhost";
        String db="rental_vcd";
        String url;
        String driver ="com.mysql.jdbc.Driver";
        String jenis_kelamin;
        
        try{
            String nik = txtnik.getText();
            Class.forName(driver);
            url="jdbc:mysql://"+host+"/"+db;
            Connection koneksi=DriverManager.getConnection(url,user,pass);
            java.sql.Statement kal=koneksi.createStatement();
            String query="DELETE FROM pengembalian WHERE nik='"+nik+"'";
       
        kal.execute(query);
        tablepengembalian.repaint();
        tampilkan();
    
        kal.close();
        koneksi.close();
        }
      catch(Exception e)
      {
          System.err.println(e.getMessage());
      }
}//GEN-LAST:event_bthapusActionPerformed

    private void btcancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancel1ActionPerformed
        // TODO add your handling code here:
        bersihkan();
    }//GEN-LAST:event_btcancel1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Pengembalian().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIK;
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btcancel1;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btok;
    private javax.swing.JComboBox cbsudahmengembalikan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablepengembalian;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtnovcd;
    // End of variables declaration//GEN-END:variables
}