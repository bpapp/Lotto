/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Papp család
 */
public class Lottery {
 public static void main(String[] args) {
       
        Random generator = new Random();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; ++i) {
            // from 0 to 89 thus must added one
            list.add(generator.nextInt(90) + 1);
        }
        // sorting
        Collections.sort(list);
        System.out.println(Lottery.printOut(list));
    }

    private static String printOut(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Lottery numbers: ");
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i)).append(" ");
        }

        return sb.toString();
    }
}
