/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea;

/**
 *
 * @author daw2
 */
public class Tarea {
    
    private String nombre;
    private String desc;
    private boolean estado;

    public Tarea(String nombre, String desc) {
        this.nombre = nombre;
        this.desc = desc;
        estado = false;//generar la tarea como no completada por defecto
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombre=" + nombre + ", desc=" + desc + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
