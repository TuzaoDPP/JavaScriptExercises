package javaexercise121;
import java.util.*;

public class JavaExercise121 {

    
    public static void main(String[] args) {
        
        double number ;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inform a number: ");
        number = input.nextDouble();
        
        if(number < 0) {
            System.out.println("There is no real negative number root.");
            System.out.println("We are converting to a positive number");
            System.out.println("The root of " + -number + " is = " + Math.sqrt(-number));
        }else {
            System.out.println("The root of " + number + " is = " + Math.sqrt(number));
        }

        
    }
    
}
