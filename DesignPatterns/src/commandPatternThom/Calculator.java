/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandPatternThom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thomasthimothee
 */
public class Calculator {
    
    private final List<Integer> calculations = new ArrayList<>();
    private int pointer = 0;

    public int Add(Integer n) {
        if (calculations.size() > 0) {
            int headOfCalcs = calculations.get(pointer);
            int result = headOfCalcs + n;
            calculations.add(result);
            pointer++;
            return result;
        } else {
            calculations.add(n);
            return n;
        }
    }
    
    public int Sub(Integer n) {
        if (calculations.size() > 0) {
            int headOfCalcs = calculations.get(pointer);
            int result = headOfCalcs - n;
            calculations.add(result);
            pointer++;
            return result;
        } else {
            calculations.add(-n);
            return -n;
        }
    }

    public int Mul(Integer n) {
        if (calculations.size() > 0) {
            int headOfCalcs = calculations.get(pointer);
            int result = headOfCalcs * n;
            calculations.add(result);
            pointer++;
            return result;
        } else {
            calculations.add(0);
            return 0;
        }
    }
    
    public int Redo() {
        if (pointer < calculations.size()-1) {
            pointer ++;
            int headOfCalcs = calculations.get(pointer);
            return headOfCalcs;
        } else {
            System.out.println("Command Reo not valid at this point");
            return calculations.get(pointer);
        }
    }
    
    public int Undo() {
        if (calculations.size() > 1) {
            pointer --;
            int headOfCalcs = calculations.get(pointer);
            return headOfCalcs;
        }
            else if (calculations.size() == 1) {
            pointer = 0;
            System.out.println("Back to beginning");
            return 0;
        } else {
            System.out.println("Command Undo not valid at this point");
            return 0;
        }
    }  

}
