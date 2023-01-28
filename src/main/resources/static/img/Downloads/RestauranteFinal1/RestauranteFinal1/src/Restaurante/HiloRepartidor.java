/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.sleep;

/**
 *
 * @author Carlos
 */
public class HiloRepartidor extends Thread{
     panelRepartidor referencia;          //hacer una variable se lo por parametro al hilo que esta abajo y se lo asigno***
    //2 Crearlo: Constructor  // con que datos voy a trabajar mi hilo sobre un panel (panel corrededores) al que este asignado
    public HiloRepartidor(String nombre, panelRepartidor referencia) {//poner parametros para que se lo envie al contructor      paso2
   super();                          //para llamar a la clase, en te caso llamamos a la superclase (generico)la que es superior con
                             //super para llamar a thread
      //2.2 Configurar Atributos de thread
      
      //2.2.1 name(String) :   nombre tiene para identificarlo
     this.setName(nombre);  //setname que asigne caulquier nombre paso 1
      //2.2.2 priority (int): prioridad min 1-10max
      this.setPriority( MAX_PRIORITY); // es igual que poner un 10
      //2.2.3 daemon(boolean): tipo usuario/daemon
      this.setDaemon(true); //todo los hilos van hacer usuarios //para terminar el hilo para pausar
      
      this.referencia = referencia; //aqui*** se lo asigno
    } 
    
    
    //3funcion: metodo principal  el comportamiento    // que hace el hilo como responde
//atencion run() no se ejecuta directamente
    @Override
    public void run() {
      while(true){
        System.out.println(getName()+"run");   
        referencia.actualizar(); //llamar para actualizar
          try {
              sleep(100*referencia.tiempo);          //esto es que diga esperese milisegundo para hacer la pausa en milisegundos (1000milisegundo e es suficiente
          } catch (InterruptedException ex) {  //esto pausa el hilo
              System.out.println(ex);
          }
        
      }
    }
}
