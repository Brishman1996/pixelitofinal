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
public class loginTest {
    
    public loginTest() {
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
     * Test of main method, of class login.
     */
    @Test
    public void testLogin_01() {
        System.out.println("Prueba de integración");
        System.out.println("Caso prueba: Usuario existente");
        
        login iniciarSesion = new login();
        
        //VALORES DE ENTRADA
        String usuario = "canowolf@hotmail.com";
        String contraseña = "brishman";
        
        String alerta = "";
        
        boolean Resultado;
        
        if(alerta.length() == 0){
            Resultado = true;
        }
        
        iniciarSesion.setContraseña(contraseña);
        iniciarSesion.setUsuarios(usuario);
        
        Resultado = iniciarSesion.inciarSesion();
        
        assertTrue(Resultado);
        
    }
    @Test
    public void testLogin_02() {
        System.out.println("Prueba de integración");
        System.out.println("Caso prueba: Formulario vacio");
        
        login iniciarSesion = new login();
        
        //VALORES DE ENTRADA
        String usuario = "";
        String contraseña = "";
        
        String alerta = "";
        
        boolean Resultado;
        
        if(alerta.length() > 0){
            Resultado = false;
        }
        
        iniciarSesion.setContraseña(contraseña);
        iniciarSesion.setUsuarios(usuario);
        
        Resultado = iniciarSesion.inciarSesion();
        
        assertFalse(Resultado);
        
    }
    @Test
    public void testLogin_03() {
        System.out.println("Prueba de integración");
        System.out.println("Caso prueba: Usuario no existente");
        
        login iniciarSesion = new login();
        
        //VALORES DE ENTRADA
        String usuario = "UsuarioNoRegistrado";
        String contraseña = "OtraContraseña";
        
        String alerta = "";
        
        boolean Resultado;
        
        iniciarSesion.setContraseña(contraseña);
        iniciarSesion.setUsuarios(usuario);
        
        alerta = iniciarSesion.verAlerta();
        
        if(alerta.length() > 0){
            Resultado = false;
        }
        
        Resultado = iniciarSesion.inciarSesion();
        
        assertFalse(Resultado);   
    }
}
