/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexercise3;
import java.util.*;

public class JavaExercise3 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        float dollarQuote, userMoney;
        
        System.out.print("Type the current dollar exchange in reais: ");
        dollarQuote = input.nextFloat();
        
        System.out.print("Type your money amount in dollar: ");
        userMoney = input.nextFloat();
        
        System.out.println("Your money amount in reais is: " + (userMoney * dollarQuote));
    }
    
}
