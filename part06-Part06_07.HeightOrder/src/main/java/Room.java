/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Thomas
 */
public class Room {
    private ArrayList<Person> personList;
    
    public Room(){
        personList = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.personList.add(person);
    }
    
    public boolean isEmpty(){
        return this.personList.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.personList;
    }
    
    public Person shortest(){
        if(personList.isEmpty()){
            return null;
        }
        
        Person shortestPerson = new Person("shortest", 300);
        
        for(Person person:personList){
            if(shortestPerson.getHeight()>person.getHeight()){
                shortestPerson = new Person(person.getName(), person.getHeight());
            }
        }
        
        return shortestPerson;
    }
    
    public Person take(){
        if(personList.isEmpty()){
            return null;
        }
        Person tempPerson = shortest();
        personList.remove(shortest());
        return tempPerson;
    }
    
}
