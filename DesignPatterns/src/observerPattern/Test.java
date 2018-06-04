/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import static java.lang.Thread.sleep;

/**
 *
 * @author thomasthimothee
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Car car1 = new Car ("blue");
        car1.speedUp();
        sleep(2000);
        car1.speedUp();
        sleep(2000);
        car1.slowDown();
        sleep(2000);
        car1.checkTemperature();
        
    }
}
