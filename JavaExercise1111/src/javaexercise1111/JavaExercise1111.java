package javaexercise1111;
import java.util.*;

public class JavaExercise1111 {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        double nota1, nota2, media;
        
        System.out.print("Informe duas notas: ");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 7){
            System.out.format("Você está aprovado(a): %.2f\n", media);
        }else{
            System.out.format("Você está reprovado(a): %.2f\n", media);
        }
        
    }
    
}
