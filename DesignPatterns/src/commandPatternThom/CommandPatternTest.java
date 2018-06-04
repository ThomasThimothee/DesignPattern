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
public class CommandPatternTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        ScannerWordUser scw = new ScannerWordUser(calc);
        while(true){
            scw.Run();
        }
        
    }
}
