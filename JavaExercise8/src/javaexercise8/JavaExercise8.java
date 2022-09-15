package javaexercise8;
import java.util.*;

public class JavaExercise8 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double radius, length, area, volume;
        
        System.out.print("Inform the sphere radius: ");
        radius = input.nextDouble();
        
        length = 2 * Math.PI * radius;
        System.out.format("The sphere length is %.2f %n", length);
        
        area = Math.PI * Math.pow(radius, 2);
        System.out.format("The sphere area is %.2f %n", area);
        
        volume = 0.75 * Math.PI * Math.pow(radius, 3);
        System.out.format("The sphere volume is %.2f %n", volume);
        
    }
    
}
