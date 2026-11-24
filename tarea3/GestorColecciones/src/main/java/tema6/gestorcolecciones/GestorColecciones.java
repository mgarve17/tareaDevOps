/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema6.gestorcolecciones;

import java.util.Scanner;

/**
 *
 * @author M
 */
public class GestorColecciones {

    public static void main(String[] args) {
       
        Coleccion binder = new Coleccion();
        boolean salir = false;
         do{
             
             int opcion = mostrarMenu();
             
             switch(opcion){
             
                 case 1 -> {
                 
                     añadirCartaEnColeccion(binder);
                 }
                 
                 case 2 -> {
                 
                     borrarCarta(binder);
                 }
                 
                 case 3 -> {
                 
                     mostrarColeccion(binder);
                 }
                 
                 case 4 -> {
                 
                     salir = true;
                 }
                 
                 default -> {System.out.println("DEFAULT");}
             }
             
             
         }while(!salir);
    }

    private static int mostrarMenu() throws NumberFormatException {
        System.out.println("Añadir carta al binder");
        System.out.println("Borar carta del binder");
        System.out.println("Mostrar binder");
        int opcion = Integer.parseInt(new Scanner(System.in).nextLine().trim());
        return opcion;
    }
    
    private static void añadirCartaEnColeccion(Coleccion binder){
    
        System.out.println("NOMBRE:");
        String nombre = new Scanner(System.in).nextLine();
        
        System.out.println("EXPANSIÓN: ");
        String expansion =  new Scanner(System.in).nextLine();
        System.out.println("Nº EN LA EXPANSION");
        String numero =  new Scanner(System.in).nextLine();
        
        Carta carta = new Carta(nombre, numero, expansion);
        
        binder.añadir(carta);
        
        
    }
    
    private static void borrarCarta(Coleccion binder){
    
        System.out.println("Codigo de la carta");
        String code = new Scanner(System.in).nextLine();
        
        if (binder.borrar(code)) {
            System.out.println("Carta borrada");
        } else {
            System.out.println("No se encontró una carta para borrar");
        }
    }
    
    private static void mostrarColeccion(Coleccion binder){
    
        binder.mostrar();
    }
}
