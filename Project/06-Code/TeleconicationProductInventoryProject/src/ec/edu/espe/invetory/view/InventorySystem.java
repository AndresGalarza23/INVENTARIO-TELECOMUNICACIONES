/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.view;

import ec.edu.espe.invetory.controller.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class InventorySystem extends javax.swing.JFrame {

    /**
     * Creates new form InventorySystem
     */
    ProductController product = new ProductController();
    ProviderController provider = new ProviderController();
    InvoiceController invoice = new InvoiceController();
    CustomerController customer = new CustomerController();
    
    public InventorySystem() {
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

        jFrame1 = new javax.swing.JFrame();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btmExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnProduct = new javax.swing.JMenu();
        sbtnAdd = new javax.swing.JMenuItem();
        sbtnDelete = new javax.swing.JMenuItem();
        sbntEdit = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnProvider = new javax.swing.JMenu();
        smnAddProvider = new javax.swing.JMenuItem();
        smnEditProvider = new javax.swing.JMenuItem();
        smnDeleteProvider = new javax.swing.JMenuItem();
        mnCustomer = new javax.swing.JMenu();
        smnDeleteCustomer = new javax.swing.JMenuItem();
        smnEditCustomer = new javax.swing.JMenuItem();
        mnInvoice = new javax.swing.JMenu();
        smnAddInvoice = new javax.swing.JMenuItem();
        smnDeleteInvoice = new javax.swing.JMenu();
        smnDeleteCedula = new javax.swing.JMenuItem();
        smnDeleteId = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Inventory System");

        btmExit.setText("EXIT");
        btmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btmExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(124, 124, 124)
                .addComponent(btmExit)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        mnProduct.setText("Product");

        sbtnAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        sbtnAdd.setText("Add");
        sbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtnAddActionPerformed(evt);
            }
        });
        mnProduct.add(sbtnAdd);

        sbtnDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        sbtnDelete.setText("Delete");
        sbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtnDeleteActionPerformed(evt);
            }
        });
        mnProduct.add(sbtnDelete);

        sbntEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        sbntEdit.setText("Edit");
        sbntEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbntEditActionPerformed(evt);
            }
        });
        mnProduct.add(sbntEdit);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Search");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnProduct.add(jMenuItem4);

        jMenuBar1.add(mnProduct);

        mnProvider.setText("Provider");

        smnAddProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        smnAddProvider.setText("Add");
        smnAddProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnAddProviderActionPerformed(evt);
            }
        });
        mnProvider.add(smnAddProvider);

        smnEditProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        smnEditProvider.setText("Edit");
        smnEditProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnEditProviderActionPerformed(evt);
            }
        });
        mnProvider.add(smnEditProvider);

        smnDeleteProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        smnDeleteProvider.setText("Delete");
        smnDeleteProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDeleteProviderActionPerformed(evt);
            }
        });
        mnProvider.add(smnDeleteProvider);

        jMenuBar1.add(mnProvider);

        mnCustomer.setText("Customer");

        smnDeleteCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        smnDeleteCustomer.setText("Delete");
        smnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDeleteCustomerActionPerformed(evt);
            }
        });
        mnCustomer.add(smnDeleteCustomer);

        smnEditCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        smnEditCustomer.setText("Edit");
        smnEditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnEditCustomerActionPerformed(evt);
            }
        });
        mnCustomer.add(smnEditCustomer);

        jMenuBar1.add(mnCustomer);

        mnInvoice.setText("Invoice");

        smnAddInvoice.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        smnAddInvoice.setText("New");
        smnAddInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnAddInvoiceActionPerformed(evt);
            }
        });
        mnInvoice.add(smnAddInvoice);

        smnDeleteInvoice.setText("Delete");

        smnDeleteCedula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        smnDeleteCedula.setText("Cedula");
        smnDeleteCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDeleteCedulaActionPerformed(evt);
            }
        });
        smnDeleteInvoice.add(smnDeleteCedula);

        smnDeleteId.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, 0));
        smnDeleteId.setText("ID");
        smnDeleteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDeleteIdActionPerformed(evt);
            }
        });
        smnDeleteInvoice.add(smnDeleteId);

        mnInvoice.add(smnDeleteInvoice);

        jMenuBar1.add(mnInvoice);

        mnExit.setText("Exit");
        jMenuBar1.add(mnExit);

        setJMenuBar(jMenuBar1);

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

    private void btmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btmExitActionPerformed

    private void sbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtnAddActionPerformed
        this.hide();
        ProductWindow prodW = new ProductWindow();
        prodW.setVisible(true);

    }//GEN-LAST:event_sbtnAddActionPerformed

    private void smnAddProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnAddProviderActionPerformed
        this.hide();
        ProviderWindow provW = new ProviderWindow();
        provW.setVisible(true);
        

    }//GEN-LAST:event_smnAddProviderActionPerformed

    private void smnDeleteProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDeleteProviderActionPerformed
        
        Integer idD = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to Delete"));
        provider.delete(idD);

    }//GEN-LAST:event_smnDeleteProviderActionPerformed

    private void sbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtnDeleteActionPerformed
        
        Integer idD = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to Delete"));
        product.delete(idD);

    }//GEN-LAST:event_sbtnDeleteActionPerformed

    private void sbntEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbntEditActionPerformed
        
        Integer idUpdate = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to update"));
        String nameUpdate = JOptionPane.showInputDialog("Enter name of product to update");
        String brandUpdate = JOptionPane.showInputDialog("Enter brand of product to update");
        Double purchasePriceUpdate = Double.parseDouble(JOptionPane.showInputDialog("Enter Purchase Price of product to update"));
        Double salePriceUpdate = Double.parseDouble(JOptionPane.showInputDialog("Enter Sale Price of product to update"));
        
        product.update(idUpdate, nameUpdate, brandUpdate, purchasePriceUpdate, salePriceUpdate);

    }//GEN-LAST:event_sbntEditActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        this.hide();
        SearchWindow searchW = new SearchWindow();
        searchW.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void smnEditProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnEditProviderActionPerformed
        Integer idU = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to update"));
        String nameU = JOptionPane.showInputDialog("Enter name of product to update");
        Integer phoneNumberU = Integer.parseInt(JOptionPane.showInputDialog("Enter  phone Number to update "));
        String addressU = JOptionPane.showInputDialog("Enter address to update");
        provider.update(idU, nameU, phoneNumberU, addressU);
    }//GEN-LAST:event_smnEditProviderActionPerformed

    private void smnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDeleteCustomerActionPerformed
        Integer cedulaD = Integer.parseInt(JOptionPane.showInputDialog("Enter Cedula to Delete"));
        customer.delete(cedulaD);        // TODO add your handling code here:
    }//GEN-LAST:event_smnDeleteCustomerActionPerformed

    private void smnEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnEditCustomerActionPerformed
        Integer cedulaU = Integer.parseInt(JOptionPane.showInputDialog("Enter cedula to update"));
        String namesU = JOptionPane.showInputDialog("Enter names of Customer to update");
        String lastNameU = JOptionPane.showInputDialog("Enter last name of Customer to update");
        String addressU = JOptionPane.showInputDialog("Enter address of customer to update");
        int phoneU = Integer.parseInt(JOptionPane.showInputDialog("Enter phone of customer to update"));
        customer.update(cedulaU, namesU, lastNameU, addressU, phoneU);        
    }//GEN-LAST:event_smnEditCustomerActionPerformed

    private void smnAddInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnAddInvoiceActionPerformed
     this.hide();
     InvoiceWindow invoiceWindow =new InvoiceWindow();
     invoiceWindow.setVisible(true);
     
        
        
    }//GEN-LAST:event_smnAddInvoiceActionPerformed

    private void smnDeleteCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDeleteCedulaActionPerformed
       Integer cedulaD = Integer.parseInt(JOptionPane.showInputDialog("Enter Invoice Cedula to Delete"));
        invoice.deleteCedula(cedulaD);
    }//GEN-LAST:event_smnDeleteCedulaActionPerformed

    private void smnDeleteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDeleteIdActionPerformed
                                                 
       Integer idD = Integer.parseInt(JOptionPane.showInputDialog("Enter Invoice Id to Delete"));
        invoice.deleteId(idD);
      
    }//GEN-LAST:event_smnDeleteIdActionPerformed

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
            java.util.logging.Logger.getLogger(InventorySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventorySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventorySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventorySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventorySystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmExit;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnCustomer;
    private javax.swing.JMenu mnExit;
    private javax.swing.JMenu mnInvoice;
    private javax.swing.JMenu mnProduct;
    private javax.swing.JMenu mnProvider;
    private javax.swing.JMenuItem sbntEdit;
    private javax.swing.JMenuItem sbtnAdd;
    private javax.swing.JMenuItem sbtnDelete;
    private javax.swing.JMenuItem smnAddInvoice;
    private javax.swing.JMenuItem smnAddProvider;
    private javax.swing.JMenuItem smnDeleteCedula;
    private javax.swing.JMenuItem smnDeleteCustomer;
    private javax.swing.JMenuItem smnDeleteId;
    private javax.swing.JMenu smnDeleteInvoice;
    private javax.swing.JMenuItem smnDeleteProvider;
    private javax.swing.JMenuItem smnEditCustomer;
    private javax.swing.JMenuItem smnEditProvider;
    // End of variables declaration//GEN-END:variables
}
