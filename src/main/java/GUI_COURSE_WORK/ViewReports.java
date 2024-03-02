/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_COURSE_WORK;

/**
 *
 * @author pc
 */
public class ViewReports extends javax.swing.JFrame {

    /**
     * Creates new form ViewReports
     */
    public ViewReports() {
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

        jButton1 = new javax.swing.JButton();
        viewCustomer = new javax.swing.JButton();
        bestInCustomer = new javax.swing.JButton();
        allCustomer = new javax.swing.JButton();
        shortByQTY = new javax.swing.JButton();
        ShortByAmount = new javax.swing.JButton();
        odrShortByAmount = new javax.swing.JButton();
        allOders = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewCustomer.setBackground(new java.awt.Color(0, 255, 51));
        viewCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        viewCustomer.setText("View Customers");
        viewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerActionPerformed(evt);
            }
        });

        bestInCustomer.setBackground(new java.awt.Color(0, 255, 51));
        bestInCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bestInCustomer.setForeground(new java.awt.Color(255, 255, 255));
        bestInCustomer.setText("Best in Customers");
        bestInCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestInCustomerActionPerformed(evt);
            }
        });

        allCustomer.setBackground(new java.awt.Color(0, 255, 51));
        allCustomer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        allCustomer.setForeground(new java.awt.Color(255, 255, 255));
        allCustomer.setText("All Customers");
        allCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allCustomerActionPerformed(evt);
            }
        });

        shortByQTY.setBackground(new java.awt.Color(0, 0, 204));
        shortByQTY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        shortByQTY.setForeground(new java.awt.Color(255, 255, 255));
        shortByQTY.setText("Categorized By QTY");
        shortByQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortByQTYActionPerformed(evt);
            }
        });

        ShortByAmount.setBackground(new java.awt.Color(0, 0, 204));
        ShortByAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ShortByAmount.setForeground(new java.awt.Color(255, 255, 255));
        ShortByAmount.setText("Categorized By Amount");
        ShortByAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShortByAmountActionPerformed(evt);
            }
        });

        odrShortByAmount.setBackground(new java.awt.Color(102, 102, 102));
        odrShortByAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        odrShortByAmount.setForeground(new java.awt.Color(255, 255, 255));
        odrShortByAmount.setText("Orders By Amount");
        odrShortByAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odrShortByAmountActionPerformed(evt);
            }
        });

        allOders.setBackground(new java.awt.Color(102, 102, 102));
        allOders.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        allOders.setForeground(new java.awt.Color(255, 255, 255));
        allOders.setText("All Orders");
        allOders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allOdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bestInCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShortByAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shortByQTY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(odrShortByAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allOders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(viewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(bestInCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(allCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shortByQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odrShortByAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShortByAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allOders, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void odrShortByAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odrShortByAmountActionPerformed
        new OrderByAmount().setVisible(true);
        dispose();
    }//GEN-LAST:event_odrShortByAmountActionPerformed

    private void allOdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allOdersActionPerformed
        new AllOrders().setVisible(true);
        dispose();
    }//GEN-LAST:event_allOdersActionPerformed

    private void ShortByAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShortByAmountActionPerformed
        new SortByAmount().setVisible(true);
        dispose();
    }//GEN-LAST:event_ShortByAmountActionPerformed

    private void viewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerActionPerformed
       new ViewCustomers().setVisible(true);
       dispose();
    }//GEN-LAST:event_viewCustomerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FashionShop().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bestInCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestInCustomerActionPerformed
        new BestInCustomers().setVisible(true);
        dispose();
    }//GEN-LAST:event_bestInCustomerActionPerformed

    private void allCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allCustomerActionPerformed
        new AllCustomerReports().setVisible(true);
        dispose();
    }//GEN-LAST:event_allCustomerActionPerformed

    private void shortByQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortByQTYActionPerformed
        new ShortByQTY().setVisible(true);
        dispose();
    }//GEN-LAST:event_shortByQTYActionPerformed

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
            java.util.logging.Logger.getLogger(ViewReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShortByAmount;
    private javax.swing.JButton allCustomer;
    private javax.swing.JButton allOders;
    private javax.swing.JButton bestInCustomer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton odrShortByAmount;
    private javax.swing.JButton shortByQTY;
    private javax.swing.JButton viewCustomer;
    // End of variables declaration//GEN-END:variables
}
