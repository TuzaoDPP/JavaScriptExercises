package javaexercise15;
import java.util.*;

public class JavaExercise15 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double a, b, c, delta, x1, x2;
        
        System.out.print("Inform the three numbers in the equation: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        delta = Math.pow(b,2) - 4 * a * c;
        
        if(delta < 0){
            System.out.println("Don't exist real root");
        }else{
            if(delta == 0){
                x1 = (-b) / (2 * a);
                System.out.println("Exist only one real root: " + x1);
            }else {
                if(delta > 0){
                    x1 = (-b + Math.sqrt(delta) / (2 * a));
                    x2 = (-b - Math.sqrt(delta) / (2 * a));
                    System.out.format("Exist two real roots: %.2f e %.2f \n", x1, x2);
                }
            }
        }
        
    }
    
}
