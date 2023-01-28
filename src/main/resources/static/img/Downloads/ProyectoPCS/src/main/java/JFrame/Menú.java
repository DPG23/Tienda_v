package JFrame;

import javax.swing.JOptionPane;

public class Menú extends javax.swing.JFrame {

    /**
     * Creates new form Menú
     */
    public Menú() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BHBDC = new javax.swing.JButton();
        BHBSEN = new javax.swing.JButton();
        BHBDX = new javax.swing.JButton();
        BHBTA = new javax.swing.JButton();
        BHBEQ = new javax.swing.JButton();
        BHBCASA = new javax.swing.JButton();
        BCombos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setIconImages(null);

        BHBDC.setBackground(new java.awt.Color(153, 153, 255));
        BHBDC.setText("Hamburguesa doble carne");
        BHBDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHBDCActionPerformed(evt);
            }
        });

        BHBSEN.setBackground(new java.awt.Color(153, 153, 255));
        BHBSEN.setText("Hamburguesa sencilla ");
        BHBSEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHBSENActionPerformed(evt);
            }
        });

        BHBDX.setBackground(new java.awt.Color(153, 153, 255));
        BHBDX.setText("Hamburguesa deluxe");
        BHBDX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHBDXActionPerformed(evt);
            }
        });

        BHBTA.setBackground(new java.awt.Color(153, 153, 255));
        BHBTA.setText("Tocinoburguesa");
        BHBTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHBTAActionPerformed(evt);
            }
        });

        BHBEQ.setBackground(new java.awt.Color(153, 153, 255));
        BHBEQ.setText("Hamburguesa extra queso");
        BHBEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHBEQActionPerformed(evt);
            }
        });

        BHBCASA.setBackground(new java.awt.Color(153, 153, 255));
        BHBCASA.setText("Hamburguesa de la casa");
        BHBCASA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHBCASAActionPerformed(evt);
            }
        });

        BCombos.setBackground(new java.awt.Color(153, 153, 153));
        BCombos.setText("Combos");
        BCombos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCombos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCombosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setText("Hamburguesas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BHBCASA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHBTA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHBSEN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BHBDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHBDX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHBEQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(BCombos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BHBDC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BHBSEN, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BHBDX, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BHBCASA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BHBTA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BCombos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BHBEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCombosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCombosActionPerformed
        MenúCombos MC = new MenúCombos();
        MC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BCombosActionPerformed

    private void BHBSENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHBSENActionPerformed
        JOptionPane.showMessageDialog(null,"¡Se ha agregado una hamburguesa sencilla a su compra!");
        Opcion o = new Opcion();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BHBSENActionPerformed

    private void BHBCASAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHBCASAActionPerformed
        JOptionPane.showMessageDialog(null,"¡Se ha agregado una hamburguesa de la casa a su compra!");
        Opcion o = new Opcion();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BHBCASAActionPerformed

    private void BHBTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHBTAActionPerformed
        JOptionPane.showMessageDialog(null,"¡Se ha agregado una Tocinoburguesa a su compra!");
        Opcion o = new Opcion();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BHBTAActionPerformed

    private void BHBDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHBDCActionPerformed
        JOptionPane.showMessageDialog(null,"¡Se ha agregado una hamburguesa doble carne a su compra!");
        Opcion o = new Opcion();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BHBDCActionPerformed

    private void BHBDXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHBDXActionPerformed
        JOptionPane.showMessageDialog(null,"¡Se ha agregado una hamburguesa deluxe a su compra!");
        Opcion o = new Opcion();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BHBDXActionPerformed

    private void BHBEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHBEQActionPerformed
        JOptionPane.showMessageDialog(null,"¡Se ha agregado una hamburguesa extra queso a su compra!");
        Opcion o = new Opcion();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BHBEQActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCombos;
    private javax.swing.JButton BHBCASA;
    private javax.swing.JButton BHBDC;
    private javax.swing.JButton BHBDX;
    private javax.swing.JButton BHBEQ;
    private javax.swing.JButton BHBSEN;
    private javax.swing.JButton BHBTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
