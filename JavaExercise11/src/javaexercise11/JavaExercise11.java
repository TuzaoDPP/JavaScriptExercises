package javaexercise11;
import java.util.*;

public class JavaExercise11 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double valorAlcool, valorGasolina, porcentagem;
        
        System.out.print("Informe o valor do álcool: ");
        valorAlcool = entrada.nextDouble();
        
        System.out.print("Informe o valor da gasolina: ");
        valorGasolina = entrada.nextDouble();
        
        porcentagem = (valorAlcool / valorGasolina) * 100;
        
        if(porcentagem < 70){
          System.out.println("Compensa mais usar álcool");
        }else{
          System.out.println("Compensa mais usar gasolina");
        }
        
        System.out.print("A porcentagem é: " + porcentagem);
    }
    
}
