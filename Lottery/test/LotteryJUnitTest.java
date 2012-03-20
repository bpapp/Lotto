/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import lottery.Lottery;

/**
 *
 * @author Papp család
 */
public class LotteryJUnitTest {

    public LotteryJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    /**
     * used to test whether the null input will throw
     * IllegalArgumentException
     */

    @Test(expected = IllegalArgumentException.class)
    public void testAnException() {
        List<Integer> listInt = null;
        org.junit.Assert.assertEquals(null, Lottery.printOut(listInt));
    }

    /**
     * testing wheter input list contains 5 elements
     */
    @Test
    public void testFiveElements() {
        List<Integer> listInt = new ArrayList<Integer>();
        listInt.add(3);
        listInt.add(5);
        listInt.add(7);
        listInt.add(9);
        org.junit.Assert.assertFalse(Lottery.checkElementsNumber(listInt));
    }
}
