/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandPattern;

/**
 *
 * @author Tobias
 */
public class MultiplyCommand implements Command
{
    private Operation ope;
    private double value;

    public MultiplyCommand(Operation ope, double value)
    {
        this.ope = ope;
        this.value = value;
    }
    
    
    @Override
    public void execute()
    {
        ope.multiply(value);
    }

    @Override
    public Command getInverse()
    {
        return new DivideCommand(ope, value);
    }
    
}
