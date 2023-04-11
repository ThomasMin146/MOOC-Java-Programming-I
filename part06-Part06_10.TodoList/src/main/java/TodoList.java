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
public class TodoList {
    private ArrayList<String> toDoList;
    
    public TodoList(){
        toDoList = new ArrayList<>();
    }
    
    public void add(String task){
        toDoList.add(task);
    }
    
    public void print(){
        for(int i = 0; i <toDoList.size();i++){
            System.out.println(i+1+": "+toDoList.get(i));
        }
    }
    
    public void remove(int number){
        toDoList.remove(number-1);
    }
}
