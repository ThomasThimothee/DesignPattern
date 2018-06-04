/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DecoratorPattern {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(1000000));
        }

        ComparatorDecorator decor = new ComparatorDecoratorImpl();
        Collections.sort(list, decor);
        System.out.println(decor.getNumberOfComparisons());
    }

}
