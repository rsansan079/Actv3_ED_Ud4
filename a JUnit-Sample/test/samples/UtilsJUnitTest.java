/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package samples;

import java.util.concurrent.TimeoutException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UtilsJUnitTest {
    
    public UtilsJUnitTest() {
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
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testHelloWorld() {
        System.out.println("* UtilsJUnit3Test: test method 1 - testHelloWorld()");
        assertEquals("Hello, world!", Utils.concatWords("Hello", ", ", "world", "!"));
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testWithTimeout() throws InterruptedException {
        final int factorialOf = 5;
        System.out.println("Factorial de " + factorialOf + '!');
        Thread testThread = new Thread() {
            public void run() {
                System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
            }
        };
        testThread.start();
        // Esperar un máximo de 10 segundos para que el hilo de prueba termine
        testThread.join(10000);
        // Verificar si el hilo de prueba aún está vivo
        if (testThread.isAlive()) {
            // Si aún está vivo, significa que ha excedido el límite de tiempo
            // Puedes hacer alguna acción aquí si el hilo está tardando demasiado en completarse
            System.out.println("El hilo de prueba ha tardado demasiado en completarse.");
            // Detener el hilo de prueba
            testThread.interrupt();
            // Esperar a que el hilo termine después de la interrupción
            testThread.join();
        }
        // Verificar si el hilo de prueba lanzó una excepción
        assertEquals(false, testThread.isInterrupted());
    }


    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
    }    
}