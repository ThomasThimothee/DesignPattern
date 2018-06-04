/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorPattern;

import java.util.Comparator;

/**
 *
 * @author thomasthimothee
 */
public interface ComparatorDecorator extends Comparator<Integer> {
    
    int getNumberOfComparisons();
    
}