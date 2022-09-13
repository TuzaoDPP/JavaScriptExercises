package javaexercise6;
import java.util.*;

public class JavaExercise6 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double salary, increase;
        
        System.out.print("Inform your salary: ");
        salary = input.nextDouble();
        
        increase = salary * 0.25;
        System.out.println("Your salary with a 25% increase is: " + (salary + increase));
        
        
    }
    
}
