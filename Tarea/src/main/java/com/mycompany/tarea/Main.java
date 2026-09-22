/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tarea;

import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class Main {

    public static void main(String[] args) {

        boolean salir = false;
        GestorTareas gestor = new GestorTareas();

        //menu repetititvo
        do {

            System.out.println("1. crear tarea");
            System.out.println("2. marcar tarea como completada");
            System.out.println("3. eliminar tarea");
            System.out.println("4. listar tareas");
            System.out.println("5. salir");

            int opcion = new Scanner(System.in).nextInt();

            switch (opcion) {

                case 1 -> {//añadir nombre y desc de la tarea

                    gestor.crearTarea();
                }

                case 2 -> {//completar tarea

                    System.out.println("Nombre de la tarea: ");
                    String nombre = new Scanner(System.in).nextLine().trim();

                    if (gestor.buscarTarea(nombre) == null) {//validar que no es nulo

                        System.out.println("No hay tareas con ese nombre");
                    } else {//crear objeto tarea para

                        Tarea tarea = gestor.buscarTarea(nombre);
                        gestor.completarTarea(tarea);
                    }

                }

                case 3 -> {//borrar tarea
                    
                    System.out.println("Nombre de la tarea: ");
                    String nombre = new Scanner(System.in).nextLine().trim();
                    
                     if (gestor.buscarTarea(nombre) == null) {//validar que no es nulo

                        System.out.println("No hay tareas con ese nombre");
                    } else {

                        Tarea tarea = gestor.buscarTarea(nombre);
                        gestor.eliminarTarea(tarea);
                    }
                    
                }

                case 4 -> {//mostrar el listado de las tareas
                    
                    gestor.listarTareas();
                }

                case 5 -> {//salir del programa

                    salir = true;
                }

            }
        } while (!salir);
    }
}
