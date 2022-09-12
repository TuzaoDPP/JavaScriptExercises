package javaexercise5;
import java.util.*;

public class JavaExercise5 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double celsius, fahrenheit;
        
        System.out.print("Inform the temperature: ");
        celsius = input.nextDouble();
        //System.out.println("The temperature in Celsius is: " + celsius + "Cº");
        
        fahrenheit = celsius * 1.8 + 32;
        System.out.println("This temperature in Fahrenheit is: " + fahrenheit + "F");
        
    }
    
}
