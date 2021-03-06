/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorywithagent;

import agents.Customer1;
import jade.core.AID;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ali Tahoon
 */
public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */
    public mainForm() {
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

        txtProduct = new javax.swing.JTextField();
        txtPrise = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuy = new javax.swing.JButton();
        btnStartAgents = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        txtCustInfo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtProduct.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtProduct.setPreferredSize(new java.awt.Dimension(150, 30));

        txtPrise.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPrise.setPreferredSize(new java.awt.Dimension(150, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Products :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("balance :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Quantity :");

        btnBuy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuy.setText("set values");
        btnBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnStartAgents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStartAgents.setText("Are you sure !");
        btnStartAgents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStartAgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartAgentsActionPerformed(evt);
            }
        });

        tblData.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Products", "Prise", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        txtCustInfo.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Customer ID :");

        jButton1.setText("change price");

        jButton2.setText("Add offer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBuy)
                        .addGap(166, 166, 166)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnStartAgents)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jButton2)
                                .addGap(132, 132, 132)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCustInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuy)
                    .addComponent(btnStartAgents)))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartAgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartAgentsActionPerformed

        String customer = txtCustInfo.getText();
        try {
            jade.core.Runtime r = jade.core.Runtime.instance();
            Profile p = new ProfileImpl("localhost", 9000, "mainplateform");
            ContainerController cc = r.createMainContainer(p);
//            AgentController rma = cc.createNewAgent("rma", "jade.tools.rma.rma", null);
//            rma.start();
            AgentController cust = cc.createNewAgent(customer, "agents.Customer1", null);
            cust.start();
            AgentController factory = cc.createNewAgent("Factory", "agents.factory", null);
            factory.start();
//            myProjectsTools.setOpenForm(new mainForm(), "Main Form");
        } catch (StaleProxyException ex) {
            Logger.getLogger(FactoryWithAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnStartAgentsActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        String product = txtProduct.getText();
        double prise = Double.parseDouble(txtPrise.getText());
        int Quntity = Integer.parseInt(jTextField3.getText());
        String reciever = txtCustInfo.getText();
//        new Customer1(product, prise, Quntity);
        Customer1 c = new Customer1();
        c.setProduct(product);
        c.setPrise(prise);
        c.setQuantity(Quntity);
    }//GEN-LAST:event_btnBuyActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        DefaultTableModel tbl = (DefaultTableModel) tblData.getModel();
        tbl.addRow(o1);
        tbl.addRow(o2);
        tbl.addRow(o3);

//        HashMap<Double, Integer> product1 = new HashMap<>();
//        HashMap<Double, Integer> product2 = new HashMap<>();
//        HashMap<Double, Integer> product3 = new HashMap<>();
//
//        product1.put(4.5,50);
//        product2.put(5.5,40);
//        product3.put(6.5,30);
//        
//        for (Map.Entry<Double, Integer> c : product1.entrySet()) {
//            
//            tbl.addRow("product1", c.getKey() ,c.getValue());
//            
//        }
//        Object obj1[] = {"kiwi", "10.5", "10"};
//        Object obj2[] = {"orange", "6.0", "50"};
//        Object obj3[] = {"apple", "10.01", "20"};
//
//        tbl.addRow(obj1);
//        tbl.addRow(obj2);
//        tbl.addRow(obj3);

    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public static String p1 = "kiwi", p2 = "orange", p3 = "apple";
    public static double price1 = 50.5, price2 = 60.5, price3 = 40.5;
    public static int amount1 = 100, amount2 = 120, amount3 = 90;
    Object o1[] = {p1, price1, amount1};
    Object o2[] = {p2, price2, amount2};
    Object o3[] = {p3, price3, amount3};

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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnStartAgents;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCustInfo;
    private javax.swing.JTextField txtPrise;
    private javax.swing.JTextField txtProduct;
    // End of variables declaration//GEN-END:variables
}
