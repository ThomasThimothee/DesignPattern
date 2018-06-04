/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandPatternThom;

import java.util.Scanner;

/**
 *
 * @author thomasthimothee
 */
public class ScannerWordUser {

    private final Calculator calc;
    private final Scanner scan = new Scanner(System.in);
    private final Invoker inv = new Invoker();

    public ScannerWordUser(Calculator calc) {
        this.calc = calc;
    }

    public void Run() {
        while (true) {
            System.out.print(">");
            String input = scan.nextLine();
            String operator = input.split(" ")[0];
            int value;
            Command com;

            switch (operator) {
                case "Add":
                    value = Integer.parseInt(input.split(" ")[1]);
                    com = new Add(calc, value);
                    inv.run(com);
                    break;
                
                case "Sub":
                    value = Integer.parseInt(input.split(" ")[1]);
                    com = new Sub(calc, value);
                    inv.run(com);
                    break;
                
                case "Mul":
                    value = Integer.parseInt(input.split(" ")[1]);
                    com = new Mul(calc, value);
                    inv.run(com);
                    break;
                    
                case "Undo":
                    com = new Undo(calc);
                    inv.run(com);
                    break;
                    
                case "Redo":
                    com = new Redo(calc);
                    inv.run(com);
                    break;
                
                default:
                    break;
            }

        }
    }
}