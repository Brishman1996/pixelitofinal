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
public class registrarseTest {
    
    public registrarseTest() {
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

    /**
     * Test of setAlerta method, of class registrarse.
     */
    @Test
    public void testRegister_01() {
        System.out.println("Prueba de intragración");
        System.out.println("Caso prueba: Datos completos y validos");
        
        registrarse registro = new registrarse();
        
        //VALORES DE ENTRADA
        String nombre="Emilio";
        String apellidos="Vargas Contrera";
        String correo="emilio@certus.com";
        String contraseña="lamejorcontraseña2022";
        
        String alerta = "";
        
        boolean Resultado;
        
        registro.setNombre(nombre);
        registro.setApellidos(apellidos);
        registro.setCorreo(correo);
        registro.setContraseña(contraseña);
        
        alerta = registro.verAlerta();
        
        if(alerta.length() > 0){
            Resultado = false;
        }
        
        Resultado = registro.registrarUsuario();
        
        assertTrue(Resultado);
        
    }
    @Test
    public void testRegister_02() {
        System.out.println("Prueba de intragración");
        System.out.println("Caso prueba: Datos completos y no validos");
        
        registrarse registro = new registrarse();
        
        //VALORES DE ENTRADA
        String nombre="123456789";
        String apellidos="123456789";
        String correo="elmejor416d1s";
        String contraseña="lamejorcontraseña";
        
        String alerta = "";
        
        boolean Resultado;
        
        registro.setNombre(nombre);
        registro.setApellidos(apellidos);
        registro.setCorreo(correo);
        registro.setContraseña(contraseña);
        
        alerta = registro.verAlerta();
        
        if(alerta.length() == 0){
            Resultado = true;
        }
        
        Resultado = registro.registrarUsuario();
        
        assertFalse(Resultado);
        
    }
    
    @Test
    public void testRegister_03() {
        System.out.println("Prueba de intragración");
        System.out.println("Caso prueba: Datos incompletos o vacios");
        
        registrarse registro = new registrarse();
        
        //VALORES DE ENTRADA
        String nombre="";
        String apellidos="";
        String correo="";
        String contraseña="";
        
        String alerta = "";
        
        boolean Resultado;
        
        registro.setNombre(nombre);
        registro.setApellidos(apellidos);
        registro.setCorreo(correo);
        registro.setContraseña(contraseña);
        
        alerta = registro.verAlerta();
        
        if(alerta.length() == 0){
            Resultado = true;
        }
        
        Resultado = registro.registrarUsuario();
        
        assertFalse(Resultado);
        
    }
    @Test
    public void testRegister_04() {
        System.out.println("Prueba de intragración");
        System.out.println("Caso prueba: Datos de usuario existentes");
        
        registrarse registro = new registrarse();
        
        //VALORES DE ENTRADA
        String nombre="Emilio";
        String apellidos="Vargas Contrera";
        String correo="emilio@certus.com";
        String contraseña="lamejorcontraseña2022";
        
        String alerta = "";
        
        boolean Resultado;
        
        registro.setNombre(nombre);
        registro.setApellidos(apellidos);
        registro.setCorreo(correo);
        registro.setContraseña(contraseña);
        
        alerta = registro.verAlerta();
        
        if(alerta.length() == 0){
            Resultado = true;
        }
        
        Resultado = registro.registrarUsuario();
        
        assertFalse(Resultado);
        
    }
}
