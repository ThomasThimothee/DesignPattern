/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandPatternThom;

/**
 *
 * @author thomasthimothee
 */
public class Mul implements Command{

    private final Calculator calc;
    private final int numToAdd;

    public Mul(Calculator calc, int number) {
        this.calc = calc;
        this.numToAdd = number;
    }

    @Override
    public void execute() {
        System.out.println(calc.Mul(numToAdd));
    }
    
}
