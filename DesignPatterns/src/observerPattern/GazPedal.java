/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import java.util.ArrayList;

/**
 *
 * @author thomasthimothee
 */
public class GazPedal implements Observable {
    private double speed;
    private ArrayList<Observer> observers;

    public GazPedal(double speed) {
        this.speed = speed;
        observers = new ArrayList();
    }

    public void pressPedal() {       
       if (this.speed < 200){
           this.speed += 5;
       }
       
        this.notifyObservers();
    }
    
    public void releasePedal() {       
       if (this.speed > 5){
           this.speed -= 5;
       }
       else this.speed = 0;
       
        this.notifyObservers();
    }    

    @Override
    public void notifyObservers() {
        this.observers.forEach((o) -> {
            o.update(speed);
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
