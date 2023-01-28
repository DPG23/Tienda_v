package Paquetes;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Main {

 
    public static void main(String[] args) {
     Usuario vUsuario01=new Usuario("Carlos", "carlos01");
     Usuario vUsuario02=new Usuario("Maribel", "maribel02");
     Usuario vUsuario03=new Usuario("Luis", "luis03");
     
     
     System.out.println("El nombre del primer usuario es " + vUsuario01.getNombre ());
     System.out.println("La contraseña del primer usuario es " + vUsuario01.getContraseña());
     System.out.println("El nombre del segundo usuario es " + vUsuario02.getNombre ());
     System.out.println("La contraseña del segundo usuario es " + vUsuario02.getContraseña());
     System.out.println("El nombre del tercer usuario es " + vUsuario03.getNombre ());
     System.out.println("La contraseña del tercer usuario es " + vUsuario03.getContraseña());
     
     Película vPelícula01=new Película("3:22:10", "Accion", "Antony Russo", 2019 );
     Película vPelícula02=new Película("1:58:20", "Accion", "David Ayer", 2017);
     
     System.out.println("El tiempo de la primer pelicual es de " + vPelícula01.getTiempo());
     System.out.println("El tipo de la primer pelicual es de " + vPelícula01.getTipo());
     System.out.println("El nombre del del director de la primer pelicula es " + vPelícula01.getDirector());
     System.out.println("El año de la primer pelicula es " + vPelícula01.getAño());
     System.out.println("El tiempo de la primer pelicual es de " + vPelícula02.getTiempo());
     System.out.println("El tipo de la primer pelicual es de " + vPelícula02.getTipo());
     System.out.println("El nombre del del director de la primer pelicula es " + vPelícula02.getDirector());
     System.out.println("El año de la primer pelicula es " + vPelícula02.getAño());
     
     Documental vDocumental01=new Documental("5", "deporte", "Figo", 2022 );
     Documental vDocumental02=new Documental("1", "deporte", "Cristiano Ronaldo", 2015);
     
     System.out.println("La cantidad de capitulos es de " + vDocumental01.getCapitulos());
     System.out.println("El tipo del primer documental es de " + vDocumental01.getTipo());
     System.out.println("El nombre del del director del primer documental es " + vDocumental01.getDirector());
     System.out.println("El año del primer documental es " + vDocumental01.getAño());
     System.out.println("La cantidad de capitulos es de " + vDocumental02.getCapitulos());
     System.out.println("El tipo del segundo documental es de " + vDocumental02.getTipo());
     System.out.println("El nombre del del director del segundo documental es " + vDocumental02.getDirector());
     System.out.println("El año del segundo documental es " + vDocumental02.getAño());
      
     
     Serie vSerie01=new Serie("1", "13", "Crimen", "Nicky Jam", 2018 );
     Serie vSerie02=new Serie("1", "9", "Accion", "Lee Jung-Jae", 2021 );
     Serie vSerie03=new Serie("1", "60", "Crimen", "Juan Pablo Urrego", 2017 );
   
     
     System.out.println("La cantidad de temporadas es de " + vSerie01.getTemporadas());
     System.out.println("La cantidad de capitulos es de " + vSerie01.getCapitulos());
     System.out.println("Eltipo de serie es de " + vSerie01.getTipo());
     System.out.println("El nombre del director de la primer serie es " + vSerie01.getDirector());
     System.out.println("El año de la primer serie es" + vSerie01.getAño());
     
     
     //Administrador vAdministrador = new Administrador();
        Usuario vAdministrador = new Administrador();
        vAdministrador.ejecutarInicioSesion();
     
     
     /*Destructor*/
     
     vUsuario01 = null;
     vUsuario02 =null;
     vUsuario03 = null;
     vPelícula01 = null;
     vPelícula02 = null;
     vDocumental01 = null;
     vDocumental02 = null;
     vSerie01 = null;
     vSerie02 = null;
     vSerie03 =null;
    }
    
}
