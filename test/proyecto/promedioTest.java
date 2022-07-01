/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author canow
 */
public class promedioTest {
    
    public promedioTest() {
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
     * Test of setN3 method, of class promedio.
     */
    @Test
    public void testSetN3() {
        System.out.println("setN3");
        String n3 = "";
        promedio instance = new promedio();
        instance.setN3(n3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setN4 method, of class promedio.
     */
    @Test
    public void testSetN4() {
        System.out.println("setN4");
        String n4 = "";
        promedio instance = new promedio();
        instance.setN4(n4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPromedio method, of class promedio.
     */
    @Test
    public void testGetPromedio() {
        System.out.println("getPromedio");
        promedio instance = new promedio();
        String expResult = "";
        String result = instance.getPromedio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRendimiento method, of class promedio.
     */
    @Test
    public void testGetRendimiento() {
        System.out.println("getRendimiento");
        promedio instance = new promedio();
        String expResult = "";
        String result = instance.getRendimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPromedio method, of class promedio.
     */
    @Test
    public void testCalcularPromedio() {
        System.out.println("calcularPromedio");
        promedio instance = new promedio();
        instance.calcularPromedio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinarRendimiento method, of class promedio.
     */
    @Test
    public void testDeterminarRendimiento() {
        System.out.println("determinarRendimiento");
        promedio instance = new promedio();
        instance.determinarRendimiento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class promedio.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        promedio.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
