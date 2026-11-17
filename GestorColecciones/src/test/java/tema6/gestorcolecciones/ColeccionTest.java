/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tema6.gestorcolecciones;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dam206@iesmhp.local
 */
public class ColeccionTest {
    
    private Coleccion binder;
    
    public ColeccionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        binder = new Coleccion();
        
        Carta espeon = new Carta("ESPEON-EX","117","turbolimite");
        binder.añadir(espeon);
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of añadir method, of class Coleccion.
     */
    @org.junit.jupiter.api.Test
    public void testAñadir() {
        System.out.println("a\u00f1adir");
        Carta empoleon = new Carta("EMPOLEON","TURBOLIMITE","011");
        boolean expResult = true;
        boolean result = binder.añadir(empoleon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of borrar method, of class Coleccion.
     */
    @org.junit.jupiter.api.Test
    public void testBorrar() {
        System.out.println("borrar");
        String codigo = "ESPtur117";
        boolean expResult = true;
        boolean result = binder.borrar(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of mostrar method, of class Coleccion.
     */
    @org.junit.jupiter.api.Test
    public void testMostrar() {
        System.out.println("mostrar");
        binder.mostrar();
        
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
