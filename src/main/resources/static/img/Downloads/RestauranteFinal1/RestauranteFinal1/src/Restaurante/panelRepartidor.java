/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author Carlos
 */
public class panelRepartidor extends javax.swing.JPanel {
 String pedido;
    int tiempo;
    int demorar;
    
    int progresoActual=0;
   public final static int progresoFinal=100; // final aqui proteger la variable o constante para q no varie no modificar
                                              //public final static para que vaya cualquier lado 
                                                  // de mi proyecto pero mo se puede modificar
   
   private HiloRepartidor actualizador; //importatte esto use para el llamado de la clase hilocorrededor
    /**
     * Creates new form panelCorredor
     */
    public panelRepartidor() {
        initComponents();
        
        
    }
    
 public panelRepartidor(String pedido, int tiempo, int demorar) { //para que me lea esos datos estos contructores 
       this();  ///este this llamamos a  public panelCorredor()  initComponents(); llamamos a la clase o como llamar
        this.pedido = pedido;         //para que asigne los atributos de clases y reciba todos los valores y parametros
        this.tiempo = tiempo;   //asi se crea mis objetos
        this.demorar = demorar;
        // 1.crear hilo                 //este this es decirle especificamente a los objetos o atributos q llame
        actualizador = new HiloRepartidor("HiloRepartidor"+pedido, this); //para instanciar esto le llega de parte de clase hilo
  //2 iniciar ejecucion de hilo con start     // iniciar para que se ejecute no con run
  actualizador.start();
  //3. gui
  guiNombres.setText(pedido);
  guiEstadoorden.setText("Listo");
  
    }
public void actualizar(){
    if(guiProgeso.getValue()<progresoFinal){
        this.guiEstadoorden.setText("Entrega en Camino");
        this.guiProgeso.setValue(guiProgeso.getValue()+tiempo);
    }else{
        this.guiEstadoorden.setText("Entregado");
    }
  
   
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiNombres = new javax.swing.JLabel();
        guiEstadoorden = new javax.swing.JLabel();
        guiProgeso = new javax.swing.JProgressBar();

        guiNombres.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        guiNombres.setForeground(new java.awt.Color(0, 153, 153));
        guiNombres.setText("jLabel1");

        guiEstadoorden.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        guiEstadoorden.setForeground(new java.awt.Color(0, 153, 153));
        guiEstadoorden.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guiProgeso, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(guiNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guiEstadoorden, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guiNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guiEstadoorden, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(guiProgeso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel guiEstadoorden;
    private javax.swing.JLabel guiNombres;
    private javax.swing.JProgressBar guiProgeso;
    // End of variables declaration//GEN-END:variables
}