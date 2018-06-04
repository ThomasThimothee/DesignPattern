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
public class Invoker {

    public void run(Command com) {
        com.execute();
    }

}
