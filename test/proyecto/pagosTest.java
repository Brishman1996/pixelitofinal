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
public class pagosTest {

    public pagosTest() {
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
     * Test of resultado method, of class pagos.
     */
    @Test
    public void testPagos_01() {
        System.out.println("Prueba de integración");
        System.out.println("Caso prueba: Datos completos y validos");
        System.out.println("Descripcion: Resultado esperado con una longitud mayor a 114");

        //DATOS DE ENTRADA
        String codigo = "002";
        String apellidosNombres = "Brishman Neeson Canol Leon";
        String carreras = "ADMINISTRACION DE SISTEMAS";
        String mesesPagos = "5";

        pagos constanciaPago = new pagos();

        constanciaPago.setCodigo(codigo);
        constanciaPago.setApe_nom(apellidosNombres);
        constanciaPago.setCarreras(carreras);
        constanciaPago.setMeses_pagos(mesesPagos);

        System.out.println("Longitud campo" + constanciaPago.getMeses_pagos());

        int var = 0;
        boolean alert = false;

        switch (var) {
            case 0:
                if (constanciaPago.getCodigo() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 1:
                if (String.valueOf(constanciaPago.getApe_nom()).length() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 2:
                if (String.valueOf(constanciaPago.getCarreras()).length() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 3:
                if (constanciaPago.getMeses_pagos() == 0) {
                    var++;
                    alert = true;
                    break;
                };
        }

        
        //RESULTADO ESPERADO
        String esperado="Resultado con longitud > 114";
        
        //LONGITUD DE RESULTADO
        String resultado;
        if (constanciaPago.resultado().length() == 114) {
            resultado = "Resultado sin cambios de longitud = 114";
        } else {
            resultado = "Resultado con longitud > 114";
        }
        
        //VALIDANDO ALERTA DE CAMPOS
        assertFalse(alert);
       
        //VALIDANDO IGUALDAD
        assertEquals(esperado, resultado);
    }
    @Test

    public void testPagos_02() {
        System.out.println("Prueba de integración");
        System.out.println("Caso prueba: Datos completo no válidos");
        System.out.println("Descripcion: Resultado esperado con una longitud igual a 114");

        //DATOS DE ENTRADA
        String codigo = "dsffxcfd";
        String apellidosNombres = "161616";
        String carreras = "FONTANERO";
        String mesesPagos = "0";

        pagos constanciaPago = new pagos();

        constanciaPago.setCodigo(codigo);
        constanciaPago.setApe_nom(apellidosNombres);
        constanciaPago.setCarreras(carreras);
        constanciaPago.setMeses_pagos(mesesPagos);


        int var = 0;
        boolean alert = false;

        switch (var) {
            case 0:
                if (constanciaPago.getCodigo() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 1:
                if (String.valueOf(constanciaPago.getApe_nom()).length() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 2:
                if (String.valueOf(constanciaPago.getCarreras()).length() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 3:
                if (constanciaPago.getMeses_pagos() == 0) {
                    var++;
                    alert = true;
                    break;
                };
        }

        
        //RESULTADO ESPERADO
        String esperado="Resultado sin cambios de longitud = 114";
        
        //LONGITUD DE RESULTADO
        String resultado;
        if (constanciaPago.resultado().length() == 114) {
            resultado = "Resultado sin cambios de longitud = 114";
        } else {
            resultado = "Resultado con longitud > 114";
        }
        
        //VALIDANDO ALERTA DE CAMPOS
        assertTrue(alert);
       
        //VALIDANDO IGUALDAD
        assertEquals(esperado, resultado);

    }
    @Test
        public void testPagos_03() {
        System.out.println("Prueba de integración");
        System.out.println("Caso prueba: Datos vácios");
        System.out.println("Descripcion: Resultado esperado con una longitud igual a 114");

        //DATOS DE ENTRADA
        String codigo = "";
        String apellidosNombres = "";
        String carreras = "";
        String mesesPagos = "";

        pagos constanciaPago = new pagos();

        constanciaPago.setCodigo(codigo);
        constanciaPago.setApe_nom(apellidosNombres);
        constanciaPago.setCarreras(carreras);
        constanciaPago.setMeses_pagos(mesesPagos);


        int var = 0;
        boolean alert = false;

        switch (var) {
            case 0:
                if (constanciaPago.getCodigo() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 1:
                if (String.valueOf(constanciaPago.getApe_nom()).length() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 2:
                if (String.valueOf(constanciaPago.getCarreras()).length() == 0) {
                    var++;
                    alert = true;
                    break;
                };
            case 3:
                if (constanciaPago.getMeses_pagos() == 0) {
                    var++;
                    alert = true;
                    break;
                };
        }

        
        //RESULTADO ESPERADO
        String esperado="Resultado sin cambios de longitud = 114";
        
        //LONGITUD DE RESULTADO
        String resultado;
        if (constanciaPago.resultado().length() == 114) {
            resultado = "Resultado sin cambios de longitud = 114";
        } else {
            resultado = "Resultado con longitud > 114";
        }
        
        //VALIDANDO ALERTA DE CAMPOS
        assertTrue(alert);
       
        //VALIDANDO IGUALDAD
        assertEquals(esperado, resultado);

    }
}
