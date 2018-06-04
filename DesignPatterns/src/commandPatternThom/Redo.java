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
public class Redo implements Command{
    private final Calculator calc;

    public Redo(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void execute() {
        System.out.println(calc.Redo());
    }    
}
