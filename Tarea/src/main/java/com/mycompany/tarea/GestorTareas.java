/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class GestorTareas {

    private List<Tarea> listado;

    public GestorTareas() {
        listado = new ArrayList<>();

    }

    public void crearTarea() {//crear una tarea y añadirla al listado

        System.out.println("Nombre de tarea: ");
        String nombreTarea = new Scanner(System.in).nextLine();

        System.out.println("Descripción: ");
        String descripcion = new Scanner(System.in).nextLine();

        //crear objeto tarea
        Tarea tarea = new Tarea(nombreTarea, descripcion);

        if (añadirTarea(tarea)) {//meterlo en lista

            System.out.println("Tarea añadida");
        } else {

            System.out.println("No se pudo añadir la tarea");
        }
    }

    private boolean añadirTarea(Tarea tarea) {//añadir la tarea al listado

        return listado.add(tarea);
    }

    public void eliminarTarea(Tarea tarea) {//buscar la tarea en la lista y si existe eliminarlo

        Iterator<Tarea> iter = listado.iterator();

        while (iter.hasNext()) {//recorrer la lista para buscar la tarea

            Tarea t = iter.next();

            if (t.getNombre().equals(tarea.getNombre())) {//borrarla si la encuentra

                iter.remove();
                System.out.println("Tarea eliminada");
            }
        }
    }

    //devolver un listado de las tareas y su estado
    public void listarTareas() {

        if (!listado.isEmpty()) {//comprbar que no esté vacía
            for (Tarea tarea : listado) {

                System.out.println(tarea.toString());
            }
        } else {

            System.out.println("No hay tareas");
        }

    }

    //marcar tarea como completada (cambiar boolean: false = sin terminar true= terminada)
    public void completarTarea(Tarea tarea) {

        if (!listado.isEmpty()) {
            
            Iterator<Tarea> iter = listado.iterator();
            
            while(iter.hasNext()){
            
                Tarea t = iter.next();
                
                if (t.getNombre().equals(tarea.getNombre())) {//si esta la tarea en la lista le cambia el estado
                    
                    t.setEstado(true);
                }
            }
        }

    }
    
    public Tarea buscarTarea(String nombre){
    
        Tarea t = null;
        if (!listado.isEmpty()) {//comprbar que no esté vacía
            for (Tarea tarea : listado) {

                if (tarea.getNombre().equals(nombre)) {
                    
                    t = tarea;
                }
                
            }
        } else {

            System.out.println("No hay tareas");
        }
        
        return t;
    }

}
