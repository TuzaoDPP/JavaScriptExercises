/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexercise4;
import java.util.*;

public class JavaExercise4 {
    
    //Program to calculate the area of a Rhombus
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float bigDiagonal, smallDiagonal, rhombusArea;
        
        System.out.print("Type the length of the small diagonal: ");
        smallDiagonal = input.nextFloat();
        
        System.out.print("Type the length of the big diagonal: ");
        bigDiagonal = input.nextFloat();
        
        rhombusArea = (smallDiagonal * bigDiagonal / 2);
        System.out.println("The area of the Rhombus is : " + rhombusArea);
        
    }
    
}
