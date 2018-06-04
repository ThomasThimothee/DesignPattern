/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryPattern;

import static factoryPattern.PersonType.STUDENT;
import static factoryPattern.PersonType.TEACHER;

/**
 *
 * @author thomasthimothee
 */
public class FactoryDemo {

    public static void main(String[] args) {
        PersonFactory pf = new PersonFactory();

        //we create object without exposing the creation logic to the client and 
        // refer to newly created object using a common interface.
        IPerson person1 = pf.getPerson(STUDENT);
        IPerson person2 = pf.getPerson(TEACHER);

        person1.talk();
        person2.talk();
    }

}
