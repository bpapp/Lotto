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
        for (int i = 0; i < 5; ++i) {
            // from 0 to 89 thus must added one
            list.add(generator.nextInt(90) + 1);
        }
        
        if (!checkElementsNumber(list)) {
            System.err.println("elements numer not equal with five!");
            return;
        }
        // sorting
        Collections.sort(list);
        System.out.println(Lottery.printOut(list));
    }

    public static String printOut(List<Integer> list) {
        if (list == null)
            throw new IllegalArgumentException("input list is null!");
                
        StringBuilder sb = new StringBuilder();
        sb.append("Lottery numbers: ");
        for (int i = 0; i < list.size(); ++i) {
            sb.append(list.get(i)).append(" ");
        }

        return sb.toString();
    }
    
    public static boolean checkElementsNumber(List<Integer> list) {
        return (list.size()==5) ? true : false;   
    }
}
