package samples;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import samples.Vectors;

/**
 *
 * @author rsansan079
 */
public class VectorsJUnit4Test {
    
    public VectorsJUnit4Test() {
    }
    
    @Before
    public  void setUpClass() {
    }
    
    @After
    public  void tearDownClass() {
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void equalsCheck() {
 System . out .println( " *VectoresJUnit4Test:EqualsCheck() " );
  assertTrue( Vectors . equal( new int [] {}, new int [] {}));
 assertTrue( Vectors . equal( new int [] { 0 }, new int [] { 0 }));
 assertTrue( Vectors . equal( new int [] { 0 , 0 }, new int [] { 0 , 0 }));
 assertTrue( Vectors . equal( new int [] { 0 , 0 , 0 }, new int [] { 0 , 0 , 0 }));
 assertTrue( Vectors . equal( new int [] { 5 , 6 , 7 }, new int [] { 5 , 6 , 7 }));
 assertFalse( Vectors . equal( new int [] {}, new int [] { 0 }));
 assertFalse( Vectors . equal( new int [] { 0 }, new int [] { 0 , 0 }));
 assertFalse( Vectors . equal( new int [] { 0 , 0 }, new int [] { 0 , 0 , 0 }));
 assertFalse( Vectors . equal( new int [] { 0 , 0 , 0 }, new int [] { 0 , 0 }));
 assertFalse( Vectors . equal( new int [] { 0 , 0 }, new int [] { 0 }));
 assertFalse( Vectors . equal( new int [] { 0 }, new int [] {}));
 assertFalse( Vectors . equal( new int [] { 0 , 0 , 0 }, new int [] { 0 , 0 , 1 }));
 assertFalse( Vectors . equal( new int [] { 0 , 0 , 0 }, new int [] { 0 , 1 , 0 }));
 assertFalse( Vectors . equal( new int [] { 0 , 0 , 0 }, new int [] { 1 , 0 , 0 }));
 assertFalse( Vectors . equal( new int [] { 0 , 0 , 1 }, new int [] { 0 , 0 , 3 }));  
}

    /**
     * Test of ScalarMultiplicationCheck method, of class Vectors.
     */
    @Test
   public void ScalarMultiplicationCheck() {
 System . out .println( " * VectoresJUnit4Test: ScalarMultiplicationCheck() " );
  assertEquals( 0 , Vectors . scalarMultiplication( new int [] { 0 , 0 }, new int [] { 0 , 0 }));
 assertEquals( 39 , Vectors . scalarMultiplication( new int [] { 3 , 4 }, new int [] { 5 , 6 }));
 assertEquals( - 39 , Vectors . scalarMultiplication( new int [] { - 3 , 4 }, new int [] { 5 , - 6 }));
 assertEquals( 0 , Vectors . scalarMultiplication( new int [] { 5 , 9 }, new int [] { - 9 , 5 }));
 assertEquals( 100 , Vectors . scalarMultiplication( new int [] { 6 , 8 }, new int [] { 6 , 8 })); 
}
    
}