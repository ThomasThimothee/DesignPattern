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
public class Car {
    private String color;
    
    private GazPedal gz;
    private ControlPanelSpeedDisplay cpsd;
    private DigitalSpeedDisplay dsp;
    
    private Thermometer th;
    private ControlPanelTemperatureDisplay cptd;
    private DigitalTemperatureDisplay dtp;
    

    public Car(String color) {
        this.color = color;
        this.gz = new GazPedal(0);
        this.cpsd = new ControlPanelSpeedDisplay();
        this.dsp = new DigitalSpeedDisplay();
        this.gz.addObserver(cpsd);
        this.gz.addObserver(dsp);
        this.th = new Thermometer();
        this.cptd = new ControlPanelTemperatureDisplay();
        this.dtp = new DigitalTemperatureDisplay();
        th.addObserver(cptd);
        th.addObserver(dtp);
        th.checkTemperature();
        
    }
    
    public void speedUp(){
        gz.pressPedal();
    }
    
    public void slowDown(){
        gz.releasePedal();
    }
    
    public void checkTemperature(){
        th.checkTemperature();
    }
    
}
