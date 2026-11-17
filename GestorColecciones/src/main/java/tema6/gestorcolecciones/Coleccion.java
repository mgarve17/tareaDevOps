/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.gestorcolecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author M
 */
public class Coleccion {
    
    private List<Carta> binder;

    public Coleccion() {
        
        binder = new ArrayList<>();
    }
    
    public boolean añadir(Carta carta){
    
       return binder.add(carta);
    }
    
    //borrar por codigo
    public boolean borrar(String codigo){
    
        return binder.removeIf( carta -> carta.getCodigo().equals(codigo));
    }
    
    //mostrar toda la coleccion
    public void mostrar(){
    
        if (!binder.isEmpty()) {
            
            binder.forEach(carta -> {System.out.println(carta);});
            
        }
    }
    
    
}
