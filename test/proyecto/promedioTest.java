/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyecto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author canow
 */
public class promedioTest {
    
    public promedioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testCalcularPromedio_01() {
        System.out.println("Prueba unitaria");
        System.out.println("Caso prueba: Datos validos y completos");
        
        promedio mediaAritmetica = new promedio();
        
        mediaAritmetica.setN1("15");
        mediaAritmetica.setN2("12");
        mediaAritmetica.setN3("14");
        mediaAritmetica.setN4("5");
        
        mediaAritmetica.calcularPromedio();
        String esperado = "11.5";
        
        //METODO A TESTEAR
        String resultado = mediaAritmetica.getPromedio();
        
        assertEquals(esperado, resultado);
        
    }
    @Test
    public void testCalcularPromedio_02() {
        System.out.println("Prueba unitaria");
        System.out.println("Caso prueba: Datos fuera de rango");
        
        promedio mediaAritmetica = new promedio();
        
        mediaAritmetica.setN1("21");
        mediaAritmetica.setN2("30");
        mediaAritmetica.setN3("600");
        mediaAritmetica.setN4("1000");
        
        //METODO A TESTEAR
        mediaAritmetica.calcularPromedio();
        
        String esperado = "0.0";
        
        String resultado = mediaAritmetica.getPromedio();
        
        assertEquals(esperado, resultado);
           
    }
    @Test
    public void testCalcularPromedio_03() {
        System.out.println("Prueba unitaria");
        System.out.println("Caso prueba: Campos sin datos");
        
        promedio mediaAritmetica = new promedio();
        
        mediaAritmetica.setN1("");
        mediaAritmetica.setN2("");
        mediaAritmetica.setN3("");
        mediaAritmetica.setN4("");
        
        //METODO A TESTEAR
        mediaAritmetica.calcularPromedio();
        
        String esperado = "0.0";
        
        String resultado = mediaAritmetica.getPromedio();
        
        assertEquals(esperado, resultado);
           
    }
        @Test
    public void testCalcularPromedio_04() {
        System.out.println("Prueba unitaria");
        System.out.println("Caso prueba: Datos no numericos");
        
        promedio mediaAritmetica = new promedio();
        
        //DATOS DE ENTRADA
        mediaAritmetica.setN1("Haste una profe");
        mediaAritmetica.setN2("Quiero 20");
        mediaAritmetica.setN3("si lo hace");
        mediaAritmetica.setN4("el fuego de la motivación seguira encendida");
        
        //METODO A TESTEAR
        mediaAritmetica.calcularPromedio();
        
        String esperado = "0.0";
        
        String resultado = mediaAritmetica.getPromedio();
        
        assertEquals(esperado, resultado);
           
    }
}
