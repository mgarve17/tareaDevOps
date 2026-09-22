/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea;

import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class Tarea {

    public static void main(String[] args) {
        
        
        boolean salir= false;
        
        //menu repetititvo
        do{
            
            System.out.println("1. crear tarea");
            System.out.println("2. marcar tarea como completada");
            System.out.println("3. eliminar tarea");
            System.out.println("4. listar tareas");
            System.out.println("5. salir");
            
            int opcion = new Scanner(System.in).nextInt();
            
            switch(opcion){
            
                case 1 -> {
                
                    
                }
                
                case 2 -> {}
                
                case 3 -> {}
                
                case 4 -> {}
                
                case 5 -> {//salir del programa
                
                    salir = true;
                }
                
                
                
            }
        }while(!salir);
    }
}
