/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

/**
 *
 * @author thomasthimothee
 */
public class ControlPanelSpeedDisplay implements Observer{

    @Override
    public void update(Object o) {
        System.out.println("control panel speed is: " + (Double) o);    }
    
}
