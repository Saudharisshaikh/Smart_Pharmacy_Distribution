/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moazzam
 */
public class SELLING extends javax.swing.JFrame {

    /**
     * Creates new form SELLING
     */
    
    
    int quant;
    public SELLING() {
        initComponents();
        
       selectMed();
       showdate();
      
    }
    
    
    public void update(){
    
        int newqty;
        newqty=oldqty-Integer.valueOf(Quantity.getText());
     try{
            
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharma","saud","saud123");
             
        
        String updatequery ="Update SAUD.MEDICINE set QUANTITY = "+newqty+""+"where MED_ID = "+id;
        Statement Add=con.createStatement();
        Add.executeUpdate(updatequery);
         
        
              }
        
        
            catch(SQLException e){
            
                
            e.printStackTrace();
        
            }
           
    selectMed();
    }
    
    
    public void showdate(){
    
    Date d=new Date();
    SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
    
    date.setText(format.format(d));
    }

    Connection con=null;
    Statement st=null;
    ResultSet  Rs=null;
    
     public void selectMed(){
    
        try{
//    con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharma","saud","saud123");
//    st=con.createStatement();
//    Rs=(ResulSet) st.executeQuery("SELECT * FROM SAUD.MEDICINE");
//    MedicineTable.setModel(DbUtils.resultSetToTableModel((ResultSet) Rs));

con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharma","saud","saud123");
st=con.createStatement();
Rs= st.executeQuery("SELECT * FROM SAUD.MEDICINE");
MedicineTable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel( Rs));
    
    
        }
        
        catch(SQLException e){
        
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        Medname = new javax.swing.JTextField();
        Invoice_ID = new javax.swing.JTextField();
        PrintBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        ADDTOBILL = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Clearbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BilTxt = new javax.swing.JTextArea();
        Clearbutton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 28, 92));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 28, 92));
        jLabel4.setText("INVOICE_NO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 28, 92));
        jLabel5.setText("BILLLING");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 28, 92));
        jLabel6.setText("MEDICINE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 28, 92));
        jLabel11.setText("QTY");

        Quantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Quantity.setForeground(new java.awt.Color(32, 28, 92));
        Quantity.setText("3");

        Medname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Medname.setForeground(new java.awt.Color(32, 28, 92));

        Invoice_ID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Invoice_ID.setForeground(new java.awt.Color(32, 28, 92));

        PrintBtn.setBackground(new java.awt.Color(32, 28, 92));
        PrintBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(255, 204, 51));
        PrintBtn.setText("Print");
        PrintBtn.setActionCommand("ADD To");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });

        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Company", "Category", "EXP", "Badge_no", "Remarks"
            }
        ));
        MedicineTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        MedicineTable.setRowHeight(25);
        MedicineTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedicineTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 28, 92));
        jLabel7.setText("MEDICINE LIST");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 28, 92));
        jLabel8.setText("SELLER");

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(32, 28, 92));
        date.setText("DATE");

        ADDTOBILL.setBackground(new java.awt.Color(32, 28, 92));
        ADDTOBILL.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ADDTOBILL.setForeground(new java.awt.Color(255, 204, 51));
        ADDTOBILL.setText("ADD To Bill");
        ADDTOBILL.setActionCommand("ADD To");
        ADDTOBILL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDTOBILLMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 28, 92));
        jLabel10.setText("BILL");

        Clearbutton.setBackground(new java.awt.Color(32, 28, 92));
        Clearbutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Clearbutton.setForeground(new java.awt.Color(255, 204, 51));
        Clearbutton.setText("CLEAR");
        Clearbutton.setActionCommand("ADD To");
        Clearbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearbuttonMouseClicked(evt);
            }
        });

        BilTxt.setColumns(20);
        BilTxt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        BilTxt.setRows(5);
        BilTxt.setText("                ***************** PHARMA CENTRE ***************\\n  ID  MEDICINE  QTY  PRICE   TOTAL             ");
        BilTxt.setToolTipText("");
        jScrollPane2.setViewportView(BilTxt);

        Clearbutton1.setBackground(new java.awt.Color(32, 28, 92));
        Clearbutton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Clearbutton1.setForeground(new java.awt.Color(255, 204, 51));
        Clearbutton1.setText("DELETE");
        Clearbutton1.setActionCommand("ADD To");
        Clearbutton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clearbutton1MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 28, 92));
        jLabel9.setText("x");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(242, 242, 242)
                .addComponent(date)
                .addGap(54, 54, 54)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Medname, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(Invoice_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(726, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ADDTOBILL)
                        .addGap(35, 35, 35)
                        .addComponent(Clearbutton)
                        .addGap(34, 34, 34)
                        .addComponent(Clearbutton1)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(345, 345, 345))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(date)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Invoice_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Medname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clearbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ADDTOBILL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("MEDICINE");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("PARTY");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("CATEGORY");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(428, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MedicineTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedicineTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model=(DefaultTableModel)MedicineTable.getModel();
        int myindex=MedicineTable.getSelectedRow();
        
        Medname.setText(model.getValueAt(myindex, 1).toString());
      //  Quantity.setText(model.getValueAt(myindex,2).toString());
         price=Integer.valueOf(model.getValueAt(myindex, 6).toString());
         oldqty=Integer.valueOf(model.getValueAt(myindex, 2).toString());
          id=Integer.valueOf(model.getValueAt(myindex, 0).toString());
//        CATEGORY_ID.setText(model.getValueAt(myindex, 0).toString());
//        CATEGORY_NAME.setText(model.getValueAt(myindex, 1).toString());
//        COMPANY.setText(model.getValueAt(myindex, 2).toString());
//        REMARKS.setText(model.getValueAt(myindex, 3).toString());
//        STATUS.setText(model.getValueAt(myindex, 4).toString());

    }//GEN-LAST:event_MedicineTableMouseClicked

    private void ClearbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearbuttonMouseClicked
        // TODO add your handling code here:
        
        Medname.setText("");
        Quantity.setText("");
        Invoice_ID.setText("");
    }//GEN-LAST:event_ClearbuttonMouseClicked

    private void Clearbutton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Clearbutton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Clearbutton1MouseClicked

    
    int price,i=0,id,oldqty;
    private void ADDTOBILLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDTOBILLMouseClicked
        // TODO add your handling code here:
       
        if(Medname.getText().isEmpty()||Quantity.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(this, "Missing Information.....");
        
        }
        else{
            
            update();
            
        i++;
        if(i==1){
        
         quant=Integer.parseInt(Quantity.getText());
        BilTxt.setText(BilTxt.getText()+"          ***************PHARMA CENTER**************\n         ID    MEDICINE    QTY    PRICE      TOTAL\n"+"         "+i+"    "+Medname.getText()+"    \t"+Quantity.getText()+"    \t"+price+"   "+quant*price+"   ");
        }
        
        else{
        
        BilTxt.setText(BilTxt.getText()+"          ***************PHARMA CENTER**************\n         ID    MEDICINE    QTY    PRICE      TOTAL\n"+"         "+i+"    "+Medname.getText()+"    \t"+Quantity.getText()+"    \t"+price+"   "+quant*price+"   ");
        }
        }
    }//GEN-LAST:event_ADDTOBILLMouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        // TODO add your handling code here:
        
        
        try{
        
            BilTxt.print();
        }
        catch(Exception e){
        
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
     new Medicine().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        new Party().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(SELLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SELLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SELLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SELLING.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELLING().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDTOBILL;
    private javax.swing.JTextArea BilTxt;
    private javax.swing.JButton Clearbutton;
    private javax.swing.JButton Clearbutton1;
    private javax.swing.JTextField Invoice_ID;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JTextField Medname;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField Quantity;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
