
package estructurasrepasosegundoparcialcomparacionstring;


public class EstructurasRepasoSegundoParcialComparacionString {

    
    public static void main(String[] args) {
        String palabra1 = "ANA";
        String palabra2 = "Ana";
        if(palabra1.compareTo(palabra2)>0){
            System.out.println("La palabra 1 es mayor");
            System.out.println("resultado de la comparación " + palabra1.compareTo(palabra2));
        }else{
            System.out.println("La palabra 1 es menor");
            System.out.println("resultado de la comparación " + palabra1.compareTo(palabra2));
        }
    }
    
}
