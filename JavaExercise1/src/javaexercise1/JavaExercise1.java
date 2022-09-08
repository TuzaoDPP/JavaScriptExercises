/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexercise1;
import java.util.*;


public class JavaExercise1 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int number1, number2, number3, avarage;
        
        System.out.print("Type the first number: ");
        number1 = entrada.nextInt();
        
        System.out.print("Type the second number: ");
        number2 = entrada.nextInt();
        
        System.out.print("Type the third number: ");
        number3 = entrada.nextInt();
        
        avarage = (number1 + number2 + number3) / 3;
        System.out.println("The arithmetic mean is " + avarage);
    }
    
}
