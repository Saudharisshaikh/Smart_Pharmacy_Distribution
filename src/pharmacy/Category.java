/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moazzam
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        
        selectMed();
    }
    
      Connection con=null;
    Statement st=null;
    ResultSet  Rs=null;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        REMARKS = new javax.swing.JTextField();
        COMPANY = new javax.swing.JTextField();
        CATEGORY_NAME = new javax.swing.JTextField();
        CATEGORY_ID = new javax.swing.JTextField();
        STATUS = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        CLEARBTN = new javax.swing.JButton();
        UPDATEBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        deleteButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 28, 92));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("SELLING");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("MEDICINE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("PARTIES");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 28, 92));
        jLabel4.setText("CATEGORY_ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 28, 92));
        jLabel5.setText("MANAGE CATEGORIES");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 28, 92));
        jLabel6.setText("CATEGORY_NAME");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 28, 92));
        jLabel9.setText("REMARKS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 28, 92));
        jLabel11.setText("COMPANY");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(32, 28, 92));
        jLabel15.setText("STATUS");

        REMARKS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        REMARKS.setForeground(new java.awt.Color(32, 28, 92));

        COMPANY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        COMPANY.setForeground(new java.awt.Color(32, 28, 92));

        CATEGORY_NAME.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CATEGORY_NAME.setForeground(new java.awt.Color(32, 28, 92));

        CATEGORY_ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CATEGORY_ID.setForeground(new java.awt.Color(32, 28, 92));

        STATUS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        STATUS.setForeground(new java.awt.Color(32, 28, 92));

        addButton.setBackground(new java.awt.Color(32, 28, 92));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 204, 51));
        addButton.setText("ADD");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        CLEARBTN.setBackground(new java.awt.Color(32, 28, 92));
        CLEARBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CLEARBTN.setForeground(new java.awt.Color(255, 204, 51));
        CLEARBTN.setText("CLEAR");
        CLEARBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLEARBTNMouseClicked(evt);
            }
        });

        UPDATEBTN.setBackground(new java.awt.Color(32, 28, 92));
        UPDATEBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UPDATEBTN.setForeground(new java.awt.Color(255, 204, 51));
        UPDATEBTN.setText("UPDATE");
        UPDATEBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATEBTNMouseClicked(evt);
            }
        });

        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Category_ID", "Category_Name", "Company", "Remarks", "Status"
            }
        ));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CategoryTable);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(32, 28, 92));
        jLabel16.setText("CATEGORY LIST");

        deleteButton1.setBackground(new java.awt.Color(32, 28, 92));
        deleteButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteButton1.setForeground(new java.awt.Color(255, 204, 51));
        deleteButton1.setText("DELETE");
        deleteButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButton1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 28, 92));
        jLabel7.setText("x");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CATEGORY_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CATEGORY_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(COMPANY, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel9))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(UPDATEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(REMARKS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(CLEARBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(213, 213, 213)
                        .addComponent(jLabel7)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UPDATEBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CLEARBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(CATEGORY_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(REMARKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CATEGORY_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(COMPANY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)))
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    
     public void selectMed(){
    
        try{
//    con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharma","saud","saud123");
//    st=con.createStatement();
//    Rs=(ResulSet) st.executeQuery("SELECT * FROM SAUD.MEDICINE");
//    MedicineTable.setModel(DbUtils.resultSetToTableModel((ResultSet) Rs));

con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharma","saud","saud123");
st=con.createStatement();
Rs= st.executeQuery("SELECT * FROM SAUD.CATEGORY");
CategoryTable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel( Rs));
    
    
        }
        
        catch(SQLException e){
        
            e.printStackTrace();
        }
    }
    
    
    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        // TODO add your handling code here:
        
         
        try{

            con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharma","saud","saud123");
            PreparedStatement add=con.prepareStatement("insert into CATEGORY values(?,?,?,?,?)");
            
            add.setInt(1,Integer.valueOf(CATEGORY_ID.getText()));
            add.setString(2, CATEGORY_NAME.getText());
            add.setString(3,COMPANY.getText());
             add.setString(4, REMARKS.getText());
          add.setInt(5, Integer.valueOf(STATUS.getText()));
           
            
            
             
            
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"CATEGORY added successfully....");
             con.close();
             
             selectMed();
            
        }
        
        catch(SQLException e){
        
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_addButtonMouseClicked

    private void CLEARBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLEARBTNMouseClicked
        // TODO add your handling code here:
        
          CATEGORY_ID.setText("");
        CATEGORY_NAME.setText("");
        COMPANY.setText("");
        STATUS.setText("");
        REMARKS.setText("");
        
        
    }//GEN-LAST:event_CLEARBTNMouseClicked

    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked
        // TODO add your handling code here:
        
          DefaultTableModel model=(DefaultTableModel)CategoryTable.getModel();
        int myindex=CategoryTable.getSelectedRow();
        CATEGORY_ID.setText(model.getValueAt(myindex, 0).toString());
        CATEGORY_NAME.setText(model.getValueAt(myindex, 1).toString());
        COMPANY.setText(model.getValueAt(myindex, 2).toString());
       REMARKS.setText(model.getValueAt(myindex, 3).toString());
        STATUS.setText(model.getValueAt(myindex, 4).toString());
        
    }//GEN-LAST:event_CategoryTableMouseClicked

    private void deleteButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButton1MouseClicked
        // TODO add your handling code here:
        
        
          if(CATEGORY_ID.getText().isEmpty()){
       
           JOptionPane.showMessageDialog(this,"Enter CATEGORY to be deleted.....");
       }
       else{
       
           try{
           
               con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharma","saud","saud123");
               String id=CATEGORY_ID.getText();
               String Query="DELETE FROM SAUD.CATEGORY where CATEGORY_ID="+id;
               Statement add=con.createStatement();
               add.executeUpdate(Query);
            
               selectMed();
           
        JOptionPane.showMessageDialog(this, "CATEGORY deleted successfully.....");
           }
           catch(SQLException e){
           
               e.printStackTrace();
           }
       }
    }//GEN-LAST:event_deleteButton1MouseClicked

    private void UPDATEBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEBTNMouseClicked
        // TODO add your handling code here:
        
        
         
        if(CATEGORY_ID.getText().isEmpty()||CATEGORY_NAME.getText().isEmpty()||REMARKS.getText().isEmpty() ||STATUS.getText().isEmpty()||COMPANY.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Missing information .....");
            
        }
        
        else{
            try{
                String idd=CATEGORY_ID.getText();
                int id=Integer.parseInt(idd);
               
                
                String ss=STATUS.getText();
                int status=Integer.parseInt(ss);
               
   
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharma","saud","saud123");
            
        
        String updatequery ="Update SAUD.CATEGORY set CATEGORY_NAME = '"+CATEGORY_NAME.getText()+"'"+",COMPANY = '"+COMPANY.getText()+"'"+",REMARKS = '"+REMARKS.getText()+"'"+",STATUS = "+STATUS.getText()+"where CATEGORY_ID = "+id;
        Statement Add=con.createStatement();
        Add.executeUpdate(updatequery);
         JOptionPane.showMessageDialog(this, "CATEGORY updated successfully.....");
        
            
            }
        
        
            catch(SQLException e){
            
                
            e.printStackTrace();
        
            }
           selectMed(); 
        }
    }//GEN-LAST:event_UPDATEBTNMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        
        new Party().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        
        new SELLING().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CATEGORY_ID;
    private javax.swing.JTextField CATEGORY_NAME;
    private javax.swing.JButton CLEARBTN;
    private javax.swing.JTextField COMPANY;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JTextField REMARKS;
    private javax.swing.JTextField STATUS;
    private javax.swing.JButton UPDATEBTN;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}