/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ets_tarea_03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author daldo
 */
public class MiPrimerPrograma1Test {
    
    @Test
    public void test1() {
        double resultado = MiPrimerPrograma1.calculadora(7.0, 3.0, 1);
        assertEquals(10.0, resultado, 0.0);
    }
    
    @Test
    public void test2() {
        double resultado = MiPrimerPrograma1.calculadora(12.0, 3.0, 2);
        assertEquals(9.0, resultado, 0.0);
    }
    
    @Test
    public void test3() {
        double resultado = MiPrimerPrograma1.calculadora(5.0, 3.0, 3);
        assertEquals(15.0, resultado, 0.0);
    }
    
    @Test
    public void test4() {
        double resultado = MiPrimerPrograma1.calculadora(21, 3.0, 4);
        assertEquals(10.0, resultado, 0.0);
    }
    
    @Test
    public void test5() {
        double resultado = MiPrimerPrograma1.calculadora(40.0, 10.0, 2);
        assertEquals(33.0, resultado, 0.0);
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
     * Test of main method, of class MiPrimerPrograma1.
     *
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MiPrimerPrograma1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculadora method, of class MiPrimerPrograma1.
     *
    @Test
    public void testCalculadora() {
        System.out.println("calculadora");
        double a = 0.0;
        double b = 0.0;
        int operacion = 0;
        double expResult = 0.0;
        double result = MiPrimerPrograma1.calculadora(a, b, operacion);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
