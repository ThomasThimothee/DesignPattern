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
public class PersonFactory {
    public IPerson getPerson(PersonType personType){
        IPerson person = null;
        switch(personType){
            case STUDENT:
                person = new Student();
                break;
                
            case TEACHER:
                person = new Teacher();
                break;
            
            default:
                break;
        }
        return person;
    }
}
