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
public class ExerciseManagement {
    private ArrayList<String> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }
    
    
    
    public ArrayList<String> exerciseList(){
        return this.exercises;
    }
    
    public void add(String exercise){
        this.exercises.add(exercise);
    }
    
}
