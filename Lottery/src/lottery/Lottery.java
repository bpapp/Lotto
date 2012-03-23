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
    
public static List<Integer> doProduceRandomNumbers() {
    
    Random generator = new Random();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; ++i) {
            // from 0 to 89 thus must added one
            int nextInt = generator.nextInt(90) + 1;
            if (!list.contains(nextInt)) {
                    list.add(nextInt);
            }
            else {
                --i;
            }
        }

        if (list.size() != 5) {
            throw new IllegalArgumentException("elements numer not equal with five!");
        }
        // sorting
        Collections.sort(list);
        return list;
}
    
    public static void main(String[] args) {

        List<Integer> list = Lottery.doProduceRandomNumbers();
        // printing
        if (list == null) {
            throw new IllegalArgumentException("input list is null!");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Lottery numbers: ");
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb.toString());
    }
}