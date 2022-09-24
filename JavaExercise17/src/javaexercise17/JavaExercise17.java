package javaexercise17;
import java.util.*;

public class JavaExercise17 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double ladoA, ladoB, ladoC;
        
        System.out.print("Informe os três lados do triângulo: ");
        ladoA = entrada.nextDouble();
        ladoB = entrada.nextDouble();
        ladoC = entrada.nextDouble();
        
        if((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)){
            System.out.println("Analisamos os valores informados e realmente, você tem um triângulo.");
        }else{
            System.out.println("Esse valores não formam um triângulo");
        }
        
    }
    
}
