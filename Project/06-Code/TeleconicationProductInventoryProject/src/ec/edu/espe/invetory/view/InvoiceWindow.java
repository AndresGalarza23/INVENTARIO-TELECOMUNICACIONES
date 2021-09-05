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
public class InvoiceWindow extends javax.swing.JFrame {

    CustomerController customer = new CustomerController();
    ProductController product = new ProductController();

    /**
     * Creates new form InvoiceWindow
     */
    public InvoiceWindow() {
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

        PnlButtoms1 = new javax.swing.JPanel();
        BtmAdd1 = new javax.swing.JButton();
        BtmDelete1 = new javax.swing.JButton();
        BtmUpdate1 = new javax.swing.JButton();
        BtmDisplay1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        PnlInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNames = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLavel = new javax.swing.JLabel();
        txtIdInvoice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtQuantitySale3 = new javax.swing.JTextField();
        txtIdSale3 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaSale3 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        PnlButtoms6 = new javax.swing.JPanel();
        BtmAdd = new javax.swing.JButton();
        BtmDisplay6 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtArea1 = new javax.swing.JTextArea();

        BtmAdd1.setText("ADD");
        BtmAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmAdd1ActionPerformed(evt);
            }
        });

        BtmDelete1.setText("DELETE");
        BtmDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmDelete1ActionPerformed(evt);
            }
        });

        BtmUpdate1.setText("UPDATE");
        BtmUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmUpdate1ActionPerformed(evt);
            }
        });

        BtmDisplay1.setText("DISPLAY");
        BtmDisplay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmDisplay1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlButtoms1Layout = new javax.swing.GroupLayout(PnlButtoms1);
        PnlButtoms1.setLayout(PnlButtoms1Layout);
        PnlButtoms1Layout.setHorizontalGroup(
            PnlButtoms1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtoms1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(BtmAdd1)
                .addGap(47, 47, 47)
                .addComponent(BtmDelete1)
                .addGap(51, 51, 51)
                .addComponent(BtmUpdate1)
                .addGap(51, 51, 51)
                .addComponent(BtmDisplay1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlButtoms1Layout.setVerticalGroup(
            PnlButtoms1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtoms1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PnlButtoms1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtmAdd1)
                    .addComponent(BtmDelete1)
                    .addComponent(BtmUpdate1)
                    .addComponent(BtmDisplay1))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("ACCENT OF THE FUTURE");

        jLabel2.setText("Cedula");

        jLabel3.setText("Names");

        jLabel4.setText("Last Name");

        jLabel5.setText("Phone");

        jLabel6.setText("Address");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        jLavel.setText("Invoice N:");

        jLabel7.setText("Date:");

        jLabel22.setText("Quantity:");

        txtaSale3.setColumns(20);
        txtaSale3.setRows(5);
        jScrollPane5.setViewportView(txtaSale3);

        jLabel23.setText("Product ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdSale3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(39, 39, 39)
                        .addComponent(txtQuantitySale3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdSale3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtQuantitySale3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlInputLayout = new javax.swing.GroupLayout(PnlInput);
        PnlInput.setLayout(PnlInputLayout);
        PnlInputLayout.setHorizontalGroup(
            PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInputLayout.createSequentialGroup()
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlInputLayout.createSequentialGroup()
                        .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlInputLayout.createSequentialGroup()
                                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlInputLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addGroup(PnlInputLayout.createSequentialGroup()
                                                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLavel))
                                                .addGap(41, 41, 41)
                                                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                    .addComponent(txtLastName)
                                                    .addComponent(txtCedula)
                                                    .addComponent(txtNames)
                                                    .addComponent(txtPhone)
                                                    .addComponent(txtIdInvoice))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlInputLayout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlInputLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PnlInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlInputLayout.setVerticalGroup(
            PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLavel)
                    .addComponent(txtIdInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtmAdd.setText("CONFIRM");
        BtmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmAddActionPerformed(evt);
            }
        });

        BtmDisplay6.setText("DISPLAY");
        BtmDisplay6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmDisplay6ActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlButtoms6Layout = new javax.swing.GroupLayout(PnlButtoms6);
        PnlButtoms6.setLayout(PnlButtoms6Layout);
        PnlButtoms6Layout.setHorizontalGroup(
            PnlButtoms6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtoms6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(BtmAdd)
                .addGap(63, 63, 63)
                .addComponent(btnCancel)
                .addGap(95, 95, 95)
                .addComponent(jButton1)
                .addGap(74, 74, 74)
                .addComponent(BtmDisplay6)
                .addContainerGap(560, Short.MAX_VALUE))
        );
        PnlButtoms6Layout.setVerticalGroup(
            PnlButtoms6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtoms6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PnlButtoms6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtmAdd)
                    .addComponent(btnCancel)
                    .addComponent(BtmDisplay6)
                    .addComponent(jButton1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        txtArea1.setColumns(20);
        txtArea1.setRows(5);
        jScrollPane6.setViewportView(txtArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlButtoms6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(PnlInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(PnlButtoms6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed

    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped

        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }

    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void BtmAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmAdd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtmAdd1ActionPerformed

    private void BtmDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmDelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtmDelete1ActionPerformed

    private void BtmUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmUpdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtmUpdate1ActionPerformed

    private void BtmDisplay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmDisplay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtmDisplay1ActionPerformed

    private void BtmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmAddActionPerformed

        Integer cedula, phone;
        String names, lastName, address;
        Integer quantityS, idSale;

        if (txtCedula.getText().length() == 0 || txtNames.getText().length() == 0
                || txtLastName.getText().length() == 0
                || txtAddress.getText().length() == 0
                || txtPhone.getText().length() == 0
                || txtIdInvoice.getText().length() == 0
                || txtQuantitySale3.getText().length() == 0
                || txtDate.getText().length() == 0
                || txtIdSale3.getText().length() == 0) {

            JOptionPane.showConfirmDialog(null, "Enter Information", "OK", JOptionPane.DEFAULT_OPTION);
            BtmAdd.enable(false);

        } else {
            BtmAdd.enable(true);
            cedula = Integer.parseInt(this.txtCedula.getText());
            names = this.txtNames.getText();
            lastName = this.txtLastName.getText();
            address = this.txtAddress.getText();
            phone = Integer.parseInt(this.txtPhone.getText());
            customer.add(cedula, names, lastName, address, phone);
            
            quantityS = Integer.parseInt(this.txtQuantitySale3.getText());
            idSale = Integer.parseInt(this.txtIdSale3.getText());
            product.sale(idSale, quantityS, txtaSale3);
        }
        txtCedula.setText("");
        txtNames.setText("");
        txtLastName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtQuantitySale3.setText("");
        txtIdSale3.setText("");
        txtIdInvoice.setText("");
        txtDate.setText("");
        
        

    }//GEN-LAST:event_BtmAddActionPerformed

    private void BtmDisplay6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmDisplay6ActionPerformed

        customer.display(txtArea);

    }//GEN-LAST:event_BtmDisplay6ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtCedula.setText("");
        txtNames.setText("");
        txtLastName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.hide();
        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.setVisible(true);

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
            java.util.logging.Logger.getLogger(InvoiceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmAdd;
    private javax.swing.JButton BtmAdd1;
    private javax.swing.JButton BtmAdd2;
    private javax.swing.JButton BtmAdd3;
    private javax.swing.JButton BtmAdd4;
    private javax.swing.JButton BtmAdd5;
    private javax.swing.JButton BtmDelete1;
    private javax.swing.JButton BtmDelete2;
    private javax.swing.JButton BtmDelete3;
    private javax.swing.JButton BtmDelete4;
    private javax.swing.JButton BtmDelete5;
    private javax.swing.JButton BtmDisplay1;
    private javax.swing.JButton BtmDisplay2;
    private javax.swing.JButton BtmDisplay3;
    private javax.swing.JButton BtmDisplay4;
    private javax.swing.JButton BtmDisplay5;
    private javax.swing.JButton BtmDisplay6;
    private javax.swing.JButton BtmUpdate1;
    private javax.swing.JButton BtmUpdate2;
    private javax.swing.JButton BtmUpdate3;
    private javax.swing.JButton BtmUpdate4;
    private javax.swing.JButton BtmUpdate5;
    private javax.swing.JPanel PnlButtoms1;
    private javax.swing.JPanel PnlButtoms2;
    private javax.swing.JPanel PnlButtoms3;
    private javax.swing.JPanel PnlButtoms4;
    private javax.swing.JPanel PnlButtoms5;
    private javax.swing.JPanel PnlButtoms6;
    private javax.swing.JPanel PnlInput;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLavel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtArea1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtIdInvoice;
    private javax.swing.JTextField txtIdSale;
    private javax.swing.JTextField txtIdSale1;
    private javax.swing.JTextField txtIdSale2;
    private javax.swing.JTextField txtIdSale3;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNames;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtQuantitySale;
    private javax.swing.JTextField txtQuantitySale1;
    private javax.swing.JTextField txtQuantitySale2;
    private javax.swing.JTextField txtQuantitySale3;
    private javax.swing.JTextField txtSale;
    private javax.swing.JTextField txtSale1;
    private javax.swing.JTextField txtSale2;
    private javax.swing.JTextArea txtaSale;
    private javax.swing.JTextArea txtaSale1;
    private javax.swing.JTextArea txtaSale2;
    private javax.swing.JTextArea txtaSale3;
    // End of variables declaration//GEN-END:variables
}