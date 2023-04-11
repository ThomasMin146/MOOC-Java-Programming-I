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
public class Stack {
    private ArrayList<String> stringList;
    
    public Stack(){
        this.stringList = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(stringList.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public void add(String value){
        this.stringList.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stringList;
    }
    
    public String take(){
        String topOfTheStack = this.stringList.get(this.stringList.size()-1);
        this.stringList.remove(this.stringList.size()-1);
        return topOfTheStack;
    }
}
