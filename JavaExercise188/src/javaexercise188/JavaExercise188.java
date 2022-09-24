package javaexercise188;
import java.util.*;

public class JavaExercise188 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeroDiaria, valorDiaria, taxa;
        
        System.out.print("Informe quantos dias você ficara no hotel: ");
        numeroDiaria = entrada.nextInt();
        
        valorDiaria = numeroDiaria * 500;
        
        if(numeroDiaria < 15){
            taxa = numeroDiaria * 15;
            System.out.println("O valor da diária será R$" + valorDiaria + " e a taxa de serviço diária será de R$15, totalizando: " + (taxa + valorDiaria));
        }else{
            if(numeroDiaria == 15){
                taxa = numeroDiaria * 10;
                System.out.println("O valor da diária será R$" + valorDiaria + " e a taxa de serviço diária será de R$10, totalizando: " + (taxa + valorDiaria));
            }else{
                if(numeroDiaria > 15){
                    taxa = numeroDiaria * 5;
                    System.out.println("O valor da diária será R$" + valorDiaria + " e a taxa de serviço diária será de R$5, totalizando: " + (taxa + valorDiaria));
                }
            }
        }
    }
    
}
