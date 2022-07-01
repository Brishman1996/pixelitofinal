/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pack_clase;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author JeanPool
 */
public class PagosTest {
    
    public PagosTest() {
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
     * Test of getCodigo method, of class Pagos.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Pagos instance = new Pagos();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApe_nom method, of class Pagos.
     */
    @Test
    public void testGetApe_nom() {
        System.out.println("getApe_nom");
        Pagos instance = new Pagos();
        String expResult = "";
        String result = instance.getApe_nom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarreras method, of class Pagos.
     */
    @Test
    public void testGetCarreras() {
        System.out.println("getCarreras");
        Pagos instance = new Pagos();
        String expResult = "";
        String result = instance.getCarreras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeses_pagos method, of class Pagos.
     */
    @Test
    public void testGetMeses_pagos() {
        System.out.println("getMeses_pagos");
        Pagos instance = new Pagos();
        int expResult = 0;
        int result = instance.getMeses_pagos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Pagos.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Pagos instance = new Pagos();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApe_nom method, of class Pagos.
     */
    @Test
    public void testSetApe_nom() {
        System.out.println("setApe_nom");
        String ape_nom = "";
        Pagos instance = new Pagos();
        instance.setApe_nom(ape_nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarreras method, of class Pagos.
     */
    @Test
    public void testSetCarreras() {
        System.out.println("setCarreras");
        String carreras = "";
        Pagos instance = new Pagos();
        instance.setCarreras(carreras);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeses_pagos method, of class Pagos.
     */
    @Test
    public void testSetMeses_pagos() {
        System.out.println("setMeses_pagos");
        int meses_pagos = 0;
        Pagos instance = new Pagos();
        instance.setMeses_pagos(meses_pagos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ImporteCompra method, of class Pagos.
     */
    @Test
    public void testImporteCompra() {
        System.out.println("ImporteCompra");
        Pagos instance = new Pagos();
        double expResult = 0.0;
        double result = instance.ImporteCompra();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
