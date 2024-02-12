/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sample.Utils;

/**
 *
 * @author rsansan079
 */
public class UtilsJUnit4Test {
    
    public UtilsJUnit4Test() {
    }
    
    @BeforeAll 
public static void setUpClass() throws Exception {
  System . out .println( " * UtilsJUnit4Test: método @BeforeClass " ); 
}
    
    @AfterAll
    public static void tearDownClass() throws Exception {
  System . out .println( " * UtilsJUnit4Test: método @AfterClass " ); 
}
    
    @BeforeEach
    public void setUp() {
         System . out .println( " * UtilsJUnit4Test: @Antes del método " );
    }
    
    @AfterEach
    public void tearDown() {
  System . out .println( " * UtilsJUnit4Test: método @After " );  
}

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
     public void helloWorldCheck() { 
    System . out .println( " * UtilsJUnit4Test: método de prueba 1 - helloWorldCheck() " ); 
    assertEquals( " ¡Hola, mundo! " , Utils . concatWords( " Hola " , " , " , " mundo " , " ! " ));   
     }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test(timeout = 1000 ) 
     public void testWithTimeout() {
         final int factorialOf = 1 + (int) (30000 * Math.random());
    System.out.println("informática" + factorialOf + '!'); 
    System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf)); 
     }


    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
    public void temporalmenteDisabledTest() throws Exception{
System . out .println( "  UtilsJUnit4Test: método de prueba 4 - checkExpectedException()" );
 assertEquals( " Malm \u 00f6 " , Utils . normalizeWord( " Malmö \u 0308 " ));
    }
    
    @Test
    public void checkExpectedException() {
   System . out .println( " * UtilsJUnit4Test: método de prueba 3 - checkExpectedException()" ); 
 final int factorialOf = - 5 ;
 System.out.println(factorialOf + " ! = " + Utils . computeFactorial(factorialOf));
    }

    
    
    
    
    
}
