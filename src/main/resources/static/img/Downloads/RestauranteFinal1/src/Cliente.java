import static java.awt.SystemColor.text;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.*;



public class Cliente extends javax.swing.JFrame {
private Socket s;
  
    public Cliente() {
        initComponents();
        this.setLocationRelativeTo(this);
      
        try{
            //Solicitud de conexion al servidor
            guiConversacion.append ("Conectando..... \n");
            s = new Socket("192.168.0.4." , 1200);
            guiConversacion.append ("Conectando..... \n");
            
        } catch (IOException ex){
            System.out.println(ex);
            guiConversacion.append("ERROR de conexion" +ex+ "\n");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        guiConversacion = new javax.swing.JTextArea();
        guiMensaje = new javax.swing.JTextField();
        guiEnviar = new javax.swing.JButton();
        guiRecibir = new javax.swing.JButton();
        guiRecibirObjeto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        guiConversacion.setBackground(new java.awt.Color(0, 102, 51));
        guiConversacion.setColumns(20);
        guiConversacion.setRows(5);
        jScrollPane1.setViewportView(guiConversacion);

        guiMensaje.setForeground(new java.awt.Color(255, 204, 0));
        guiMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiMensajeActionPerformed(evt);
            }
        });

        guiEnviar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guiEnviar.setText("Enviar");
        guiEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiEnviarActionPerformed(evt);
            }
        });

        guiRecibir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guiRecibir.setText("Recibir");
        guiRecibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiRecibirActionPerformed(evt);
            }
        });

        guiRecibirObjeto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guiRecibirObjeto.setText("Recibir adicionales del menu");
        guiRecibirObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiRecibirObjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(guiMensaje)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(guiEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(guiRecibir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(guiRecibirObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guiEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guiRecibir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guiRecibirObjeto, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
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

    private void guiMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guiMensajeActionPerformed

    private void guiEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiEnviarActionPerformed
         String mensaje  = guiMensaje.getText();
       if (mensaje.isEmpty() == false) {
           
       try {
           DataOutputStream cableSalida = new DataOutputStream(s.getOutputStream());
           cableSalida.writeUTF(mensaje);
            guiConversacion.append ("Servidor" +mensaje+"\n");
            guiMensaje.setText("");
       } catch (IOException ex){
               System.out.println (ex);
               guiConversacion.append ("ERROR enviar:" +ex+"\n");
       }
       
     }
    }//GEN-LAST:event_guiEnviarActionPerformed

    private void guiRecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiRecibirActionPerformed
         try{
          DataInputStream cableEntrada = new DataInputStream (s.getInputStream());
          String mensaje = cableEntrada.readUTF();
          guiConversacion.append("Cliente" +mensaje+ "\n" );
      } catch (IOException ex){
          System.out.println(ex);
                guiConversacion.append("ERROR recibir: " + ex + "\n" );
      }
    }//GEN-LAST:event_guiRecibirActionPerformed

    private void guiRecibirObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiRecibirObjetoActionPerformed
    try{
        ObjectInputStream entrada = new ObjectInputStream (s.getInputStream());
        Actualizacion update = (Actualizacion) entrada.readObject();
        guiConversacion.append("Actualizacion");
        if (update.importante == true){
            guiConversacion.append("Importante");
        }      
    }catch (IOException|ClassNotFoundException ex){
                System.out.println(ex);
                guiConversacion.append("ERROR recibir actualizacion: " + ex + "\n");
                
        }
    }//GEN-LAST:event_guiRecibirObjetoActionPerformed

    
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea guiConversacion;
    private javax.swing.JButton guiEnviar;
    private javax.swing.JTextField guiMensaje;
    private javax.swing.JButton guiRecibir;
    private javax.swing.JButton guiRecibirObjeto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
