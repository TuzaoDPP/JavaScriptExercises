package javaexercise101;
import java.util.*;

public class JavaExercise101 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Type a number: ");
        number = input.nextInt();
        
        System.out.println("the predecessor of this number is: " + (number - 1));
        System.out.println("the successor of this number is: " + (number + 1));
        System.out.println("Twice that number is: " + (number * 2));
        System.out.println("Half of that number is: " + (number / 2));
        System.out.println("This number squared  is: " + Math.pow(number, 2));
        System.out.println("This number cubed is: " + Math.pow(number, 3));
        System.out.format("The square root of that number is: %.2f \n" , Math.sqrt(number));
        System.out.format("The cubic root of that number is: %.2f \n" , Math.cbrt(number));
        
        
    }
    
}
