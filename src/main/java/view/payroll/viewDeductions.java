/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.payroll;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import database.CRUDOperations; 
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author hetpatel
 */
public class viewDeductions extends javax.swing.JFrame {

    /**
     * Creates new form viewAllowance
     */
    
    MongoDatabase database;
    MongoCollection<Document> empDoc;
    CRUDOperations crud = new CRUDOperations();
     int row = -1;
    public viewDeductions( MongoDatabase database) {
        initComponents();
        this.database = database;
        empDoc = crud.getCollection("airplanes", this.database);
        
//        getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
//        pack();
        setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        fetchEmployees();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        deductionTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        updateDeductionBtn = new javax.swing.JButton();
        deleteDeductionBtn = new javax.swing.JButton();
        addDeductionBtn = new javax.swing.JButton();
        deleteDeductionBtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        deductionTable.setBackground(new java.awt.Color(0, 51, 102));
        deductionTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deductionTable.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        deductionTable.setForeground(new java.awt.Color(255, 255, 255));
        deductionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Reason for Deduction", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        deductionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deductionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(deductionTable);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ViewDeductions.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        updateDeductionBtn.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        updateDeductionBtn.setText("Update Deductions");
        updateDeductionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDeductionBtnActionPerformed(evt);
            }
        });

        deleteDeductionBtn.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        deleteDeductionBtn.setText("Delete Deductions");
        deleteDeductionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDeductionBtnActionPerformed(evt);
            }
        });

        addDeductionBtn.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        addDeductionBtn.setText("Add Deductions");
        addDeductionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeductionBtnActionPerformed(evt);
            }
        });

        deleteDeductionBtn1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        deleteDeductionBtn1.setText("Refresh");
        deleteDeductionBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDeductionBtn1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DEDUCTIONS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteDeductionBtn1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(addDeductionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(updateDeductionBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteDeductionBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(updateDeductionBtn)
                .addGap(35, 35, 35)
                .addComponent(deleteDeductionBtn)
                .addGap(32, 32, 32)
                .addComponent(addDeductionBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteDeductionBtn1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(607, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please Select A Row to Update");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void addDeductionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeductionBtnActionPerformed
        // TODO add your handling code here:
        AddDeductions addDeductions = new AddDeductions(this.database);
        addDeductions.setDefaultCloseOperation(1);
    }//GEN-LAST:event_addDeductionBtnActionPerformed

    private void updateDeductionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDeductionBtnActionPerformed
        // TODO add your handling code here:
        if(row > -1)
        {
            
            ObjectId empid =  (ObjectId) deductionTable.getValueAt(row, 0);
            UpdateDeductions updatedeductions = new UpdateDeductions(this.database,empid);
            updatedeductions.setDefaultCloseOperation(1);
            
        }else{
        
        JOptionPane.showMessageDialog(this,"Please select row");
        }   
        
    }//GEN-LAST:event_updateDeductionBtnActionPerformed

    private void deductionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deductionTableMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
        row = source.rowAtPoint( evt.getPoint() );
    }//GEN-LAST:event_deductionTableMouseClicked

    private void deleteDeductionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDeductionBtnActionPerformed
        // TODO add your handling code here:
         if(row > -1)
        {
            ObjectId empid =  (ObjectId) deductionTable.getValueAt(row, 0);
            
            int input = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Be honest...",
			JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            // 0=ok, 2=cancel
            
            if(input == 0){

                crud.deleteDocumentById("_id", empid, crud.getCollection("payrollDeduction", this.database));
                JOptionPane.showMessageDialog(this,"Record was deleted successfully");
                
               
                
                fetchEmployees();
            }
            
        }else{
        
        JOptionPane.showMessageDialog(this,"Please select row");
        }  
 
    }//GEN-LAST:event_deleteDeductionBtnActionPerformed

    public void fetchEmployees(){
        
        empDoc = crud.getCollection("payrollDeduction", this.database);
        
        String[] columnNames = {"ID","Deduction_Reason", "Amount"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0){
                    @Override
                    public boolean isCellEditable(int row, int column) {
                       //all cells false
                       return false;
                    };
            };
        
        MongoCursor<Document> cursor = empDoc.find().iterator();
        try {
            while(cursor.hasNext()) {      
                Document doc = cursor.next();
//                String ifManager = doc.get("Designation").toString().equals("Manager") ? "Self" : doc.get("manager").toString() ;
                
                model.addRow(new Object[] {doc.get("_id"), doc.get("Reason"),doc.get("Amount")
                });
            }
        } finally {
            cursor.close();
        }
        deductionTable.setModel(model);
        
    }
    private void deleteDeductionBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDeductionBtn1ActionPerformed
        // TODO add your handling code here:
        fetchEmployees();
    }//GEN-LAST:event_deleteDeductionBtn1ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(viewDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDeductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new viewDeductions().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDeductionBtn;
    private javax.swing.JTable deductionTable;
    private javax.swing.JButton deleteDeductionBtn;
    private javax.swing.JButton deleteDeductionBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateDeductionBtn;
    // End of variables declaration//GEN-END:variables
}
