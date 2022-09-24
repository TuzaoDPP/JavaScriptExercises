package javaexercise19;
import java.util.*;

public class JavaExercise19 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int apto, numeroDiaria, valorDiaria;
        
        System.out.println("Digite o número referente ao tipo de apartamento que você irá se hospedar:");
        System.out.println("1 para apartamento simples");
        System.out.println("2 para apartamento duplo");
        apto = entrada.nextInt();

        System.out.print("Informe quantos dias você ficara no hotel: ");
        numeroDiaria = entrada.nextInt();
        
        
        if((apto == 1)){
            if(numeroDiaria < 10){
                valorDiaria = 100 * numeroDiaria; 
                System.out.println("O valor da diária será R$" + valorDiaria);
            }else{
                if((numeroDiaria > 10)&&(numeroDiaria < 15)){
                    valorDiaria = 90 * numeroDiaria; 
                    System.out.println("O valor da diária será R$" + valorDiaria);
                }else{
                    if(numeroDiaria > 15){
                        valorDiaria = 80 * numeroDiaria; 
                        System.out.println("O valor da diária será R$" + valorDiaria);
                    }
                }
            }
        }else{
            if(apto == 2){
                if(numeroDiaria < 10){
                    valorDiaria = 140 * numeroDiaria; 
                    System.out.println("O valor da diária será R$" + valorDiaria);
                }else{
                    if((numeroDiaria > 10)&&(numeroDiaria < 15)){
                        valorDiaria = 120 * numeroDiaria; 
                        System.out.println("O valor da diária será R$" + valorDiaria);
                    }else{
                        if(numeroDiaria > 15){
                            valorDiaria = 100 * numeroDiaria; 
                            System.out.println("O valor da diária será R$" + valorDiaria);
                        }
                    }
                }
            }
        }
        
    }
    
}
