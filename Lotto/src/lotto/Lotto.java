package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Készíts egy olyan programot, ami egy lottóhúzást szimulál: véletlenszerűen generál öt darab
 * különböző 1 és 90 közötti számot, és ezeket kiírja a kimenetre növekvő sorrendben, szóközökkel
 * elválasztva. A programnak az egyes lehetséges húzásokat (kvázi) egyenlő valószínűséggel kell
 * generálnia.
 * @author Papp család
 */
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        Random generator = new Random();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; ++i) {
            // from 0 to 89 thus must added one
            list.add(generator.nextInt(90) + 1);
        }
        // sorting
        Collections.sort(list);
        System.out.println(lotto.printOut(list));
    }

    private String printOut(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Lottoszamok: ");
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i)).append(" ");
        }

        return sb.toString();
    }
}
