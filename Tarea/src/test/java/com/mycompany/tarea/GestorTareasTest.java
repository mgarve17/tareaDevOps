/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tarea;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author daw2
 */
public class GestorTareasTest {
    
    public GestorTareasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of crearTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testCrearTarea() {
        System.out.println("crearTarea");
        GestorTareas instance = new GestorTareas();
        instance.crearTarea();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testEliminarTarea() {
        System.out.println("eliminarTarea");
        Tarea tarea = null;
        GestorTareas instance = new GestorTareas();
        instance.eliminarTarea(tarea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTareas method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testListarTareas() {
        System.out.println("listarTareas");
        GestorTareas instance = new GestorTareas();
        instance.listarTareas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completarTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testCompletarTarea() {
        System.out.println("completarTarea");
        Tarea tarea = null;
        GestorTareas instance = new GestorTareas();
        instance.completarTarea(tarea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTarea method, of class GestorTareas.
     */
    @org.junit.jupiter.api.Test
    public void testBuscarTarea() {
        System.out.println("buscarTarea");
        String nombre = "";
        GestorTareas instance = new GestorTareas();
        Tarea expResult = null;
        Tarea result = instance.buscarTarea(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
