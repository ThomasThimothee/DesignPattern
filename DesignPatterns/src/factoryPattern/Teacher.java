/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryPattern;

/**
 *
 * @author thomasthimothee
 */
public class Teacher implements IPerson{

    @Override
    public void talk() {
        System.out.println("I am a Teacher");    }
    
}
