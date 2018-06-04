/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author thomasthimothee
 */
public class Thermometer implements Observable {

    private float temperature;
    private ArrayList<Observer> observers;

    public Thermometer() {
        this.observers = new ArrayList();
    }
    
    public void checkTemperature(){
        float minT = -30.0f;
        float maxT = 30.0f;
        Random rand = new Random();
        temperature = rand.nextFloat() * (maxT - minT) + minT;
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach((o) -> {
            o.update(temperature);
        });
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

}
