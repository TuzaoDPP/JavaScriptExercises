package javaexercise14;
import java.util.*;

public class JavaExercise14 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double weight, height, bmi;
        
        System.out.print("Inform your weight in kilograms: ");
        weight = input.nextDouble();
        System.out.print("Inform your height in meters: ");
        height = input.nextDouble();
        
        bmi = weight / Math.pow(height, 2);
        
        if(bmi < 20){
            System.out.format("You are underweight: %.2f\n", bmi);
        }else{
            if((bmi >= 20) && (bmi <25)){
                System.out.format("You are healthy: %.2f\n", bmi);
            }else{
                if((bmi >= 25) && (bmi <30)){
                    System.out.format("You are overweight: %.2f\n", bmi);
                }else{
                    if((bmi >= 35) && (bmi <40)){
                        System.out.format("You are obese: %.2f\n", bmi);
                    }else{
                        if(bmi >= 40){
                            System.out.format("You are morbidly obese: %.2f\n", bmi);
                        }
                    }
                }
            }
        }

        
    }
    
}
