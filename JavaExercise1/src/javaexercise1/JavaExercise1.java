/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexercise1;
import java.util.*;


public class JavaExercise1 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero1, numero2, numero3, media;
        
        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        numero3 = entrada.nextInt();
        
        media = (numero1 + numero2 + numero3) / 3;
        System.out.println("A média aritmética é " + media);
    }
    
}
