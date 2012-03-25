package lottery;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Papp Béla
 */
public class LotteryTest {

    public LotteryTest() {
    }

    @Test
    public void testIfRightNumberInList() {
        List<Integer> list = Lottery.generate();

        for (int i = 0; i < list.size() - 1; i++) {
            // wheter numbers are in increasing order 
            assertFalse("numbers aren't in increasing order", list.get(i) > list.get(i + 1));
            // test wheter numbers aren't equals
            assertFalse("numbers are equals", list.get(i) == list.get(i + 1));
        }
    }

    @Test
    public void testNumberOfListsElements() {
        List<Integer> list = Lottery.generate();
        assertTrue("list size not equal with five!", list.size() == 5);
    }
}
