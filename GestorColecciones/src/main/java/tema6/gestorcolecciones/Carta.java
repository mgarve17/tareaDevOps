/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.gestorcolecciones;

/**
 *
 * @author M
 */
public class Carta {
    
    private String nombre;
    private String numero;
    private String expansion;
    private String codigo;

    public Carta(String nombre, String numero, String expansion) {
        this.nombre = nombre;
        this.numero = numero;
        this.expansion = expansion;
        this.codigo = generarCodigo(nombre, expansion, numero);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    //generar codigo único de carta
    private String generarCodigo(String nombre, String expansion, String numero){
    
        String code = nombre.substring(0, 3).concat(expansion.substring(0, 3).concat(numero));
        return code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    @Override
    public String toString() {
        return nombre + ", " + numero + ", " + expansion;
    }
    
    
}
