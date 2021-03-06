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
public class AddCommand implements Command
{
    private final Operation ope;
    private final double value;

    public AddCommand(Operation ope, double value)
    {
        this.ope = ope;
        this.value = value;
    }
    
    @Override
    public void execute()
    {
        ope.add(value);
    }

    @Override
    public Command getInverse()
    {
        return new SubtractCommand(ope, value);
    }
    
}
