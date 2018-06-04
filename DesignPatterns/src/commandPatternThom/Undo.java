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
public class Undo implements Command{
    private final Calculator calc;

    public Undo(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void execute() {
        System.out.println(calc.Undo());
    }
}
