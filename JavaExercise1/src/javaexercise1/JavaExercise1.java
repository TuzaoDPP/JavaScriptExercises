package javaexercise1;
import java.util.*;


public class JavaExercise1 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double number1, number2, number3, avarage;
        
        System.out.print("Type three numbers: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();
        
        avarage = (number1 + number2 + number3) / 3;
        System.out.println("The arithmetic mean is " + avarage);
    }
    
}
