package Restaurante;


import java.io.*; 
/**
 *
 * @author stbst
 */
public class FacturaBebidas implements Serializable{

    String nombre;
    int medida;
    String Tamaño;
    int tipoBebidaIndice;
    String TipoBebida;
    String comida;
   
       int total;

    public FacturaBebidas(String nombre, int medida, String Tamaño, int tipoBebidaIndice, String TipoBebida, String comida) {
        this.nombre = nombre;
        this.medida = medida;
        this.Tamaño = Tamaño;
        this.tipoBebidaIndice = tipoBebidaIndice;
        this.TipoBebida = TipoBebida;
        this.comida = comida;
        
        total  = medida *4;
        
       if (tipoBebidaIndice > 3) {
          total += 500;  
        } 
    }
     
    
}
