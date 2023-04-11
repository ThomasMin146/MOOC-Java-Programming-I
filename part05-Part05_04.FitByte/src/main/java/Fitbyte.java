/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetMaxRate(){
        return 206.3 - (0.711 * age);
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return ((targetMaxRate()-restingHeartRate) * (percentageOfMaximum) + restingHeartRate);
    }
}
