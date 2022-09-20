package javaexercise13;
import java.util.*;

public class JavaExercise13 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double grade1, grade2, grade3, average;
        
        System.out.print("Inform three grades: ");
        grade1 = input.nextDouble();
        grade2 = input.nextDouble();
        grade3 = input.nextDouble();
        
        average = (grade1 + grade2 + grade3) / 3;
        
        if((average >= 0) && (average < 3)){
            System.out.println("You are flunked: " + average);
        }else{
            if((average >= 3) && (average < 7)){
                System.out.println("You must do the exam: " + average);
            }else{
                   System.out.println("You are approved: " + average);
                }
            } 
        }
    
    
}
