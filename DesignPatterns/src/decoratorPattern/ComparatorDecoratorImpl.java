/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorPattern;


public class ComparatorDecoratorImpl implements ComparatorDecorator {
    
    int comparisons = 0;
    
    @Override
    public int getNumberOfComparisons() {
        return comparisons;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        comparisons++;
        return o1.compareTo(o2);
    }
    
}