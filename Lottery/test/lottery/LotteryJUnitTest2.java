/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Papp Béla
 */
public class LotteryJUnitTest2 {

    public LotteryJUnitTest2() {
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

    @Test
    public void testAnException() {
        List<Integer> list = Lottery.doProduceRandomNumbers();

        for (int i = 0, j = 1; i < list.size() - 1; i++, j++) {
            if (list.get(i) > list.get(j) || list.get(i) == list.get(j)) {
                throw new IllegalArgumentException("multiple numbers or wrong ordering!");
            }
        }
    }
}
