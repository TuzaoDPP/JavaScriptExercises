package javaexercise7;
import java.util.*;

public class JavaExercise7 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double weight, fatten, loseWeight, newWeight;
        
        System.out.print("Inform your weight: ");
        weight = input.nextDouble();
        
        fatten = (weight * 15) / 100;
        newWeight = weight + fatten;
        System.out.println("if you gain 15% weight, your new weight will be " + newWeight + " Kg");
        
        loseWeight = (weight * 20) / 100;
        newWeight = weight - loseWeight;
        System.out.println("if you lose 20% weight, your new weight will be " + newWeight + " Kg");
        
        
    }
    
}
