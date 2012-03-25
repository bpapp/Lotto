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

    public static List<Integer> generate() {

        Random generator = new Random();
        List<Integer> list = new ArrayList<Integer>();
        
        while (list.size() < 5) {
            // from 0 to 89 thus must added one
            int next = generator.nextInt(90) + 1;
            if (!list.contains(next)) {
                list.add(next);
            }
        }

        // sorting
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {

        List<Integer> list = Lottery.generate();

        StringBuilder sb = new StringBuilder();
        sb.append("Lottery numbers: ");
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i)).append(" ");
        }
        // printing
        System.out.println(sb.toString());
    }
}