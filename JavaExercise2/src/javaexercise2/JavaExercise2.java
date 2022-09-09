/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexercise2;
import java.util.*;


public class JavaExercise2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int birthYear, currentYear, currentAge, futureAge;
        
        System.out.print("Type your birth year: ");
        birthYear = input.nextInt();
        
        System.out.print("Type the current year: ");
        currentYear = input.nextInt();
        
        currentAge = currentYear - birthYear;
        System.out.println("Your age is: " + currentAge);
        
        futureAge = 2050 - currentYear;
        System.out.println("Your age in 2050 will be: " + (currentAge + futureAge));
        
    }
    
}
