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
public class GradeStatistics {
    private double average;
    private int gradeCounterZero;
    private int gradeCounterOne;
    private int gradeCounterTwo;
    private int gradeCounterThree;
    private int gradeCounterFour;
    private int gradeCounterFive;

    public GradeStatistics() {
        this.average = 0;
        this.gradeCounterZero = 0;
        this.gradeCounterOne = 0;
        this.gradeCounterTwo = 0;
        this.gradeCounterThree = 0;
        this.gradeCounterFour = 0;
        this.gradeCounterFive = 0;
        
    }

    public double pointAverages(ArrayList<Integer> numList){
        int tempSum = 0;
        int tempCounter = 0;
        
        for(int num:numList){
            if(num >=0 && num <= 100){
                tempSum += num;
                tempCounter++;
            }
        }
        this.average = 1.0*tempSum/tempCounter;
        return average;
    }
    
    public double passedPointAverages(ArrayList<Integer> numList){
        int tempSum = 0;
        int tempCounter = 0;
        
        for(int num:numList){
            if(num >=50 && num <= 100){
                tempSum += num;
                tempCounter++;
            }
        }
        if(tempCounter==0){
            return 0;
        } else {
            this.average = 1.0*tempSum/tempCounter;
            return average;
        }
        
    }
    
    public double passPercentage(ArrayList<Integer> numList){
        int tempPassing = 0;
        int tempParticipants = 0;
        
        for(int num:numList){
            if(num >=0 && num <= 100){
                tempParticipants++;
                if(num >=50 && num <= 100){
                    tempPassing++;
                }
            }
        }
        double passPercentage = 100.0*tempPassing/tempParticipants;
        return passPercentage;
    }
    
    public void gradeCounter(ArrayList<Integer> numList){
        
        
        for(int num:numList){
            if(num >=0 && num < 50){
                this.gradeCounterZero++;
            } else if (num >=50 && num < 60){
                this.gradeCounterOne++;
            } else if (num >=60 && num < 70){
                this.gradeCounterTwo++;
            } else if (num >=70 && num < 80){
                this.gradeCounterThree++;
            } else if (num >=80 && num < 90){
                this.gradeCounterFour++;
            }else if (num >=90 && num <= 100){
                this.gradeCounterFive++;
            }
        }
    }

    public int getGrade(int i) {
        if(i == 5){
            return gradeCounterFive;
        } else if (i == 4){
            return gradeCounterFour;
        } else if (i == 3){
            return gradeCounterThree;
        } else if (i == 2){
            return gradeCounterTwo;
        } else if (i == 1){
            return gradeCounterOne;
        } else if (i == 0){
            return gradeCounterZero;
        }
        
        return -1;
    }

    
    
}
