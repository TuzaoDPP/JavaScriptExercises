package javaexercise16;
import java.util.*;

public class JavaExercise16 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int planeta;
        double vInicial, tempo, velocidade, altura;
        
        System.out.println("Digite o número referente ao planeta que você irá arremessar a bola: ");
        System.out.println("1 para Mercúrio. Gravidade = 3,7 m/s²");
        System.out.println("2 para Vênus. Gravidade = 8,8 m/s²");
        System.out.println("3 para Terra. Gravidade = 9,8 m/s²");
        System.out.println("4 para Marte. Gravidade = 3,8 m/s²");
        System.out.println("5 para Júpter. Gravidade = 26,4 m/s²");
        System.out.println("6 para Saturno. Gravidade = 11,5 m/s²");
        System.out.println("7 para Urano. Gravidade = 9,3 m/s²");
        System.out.println("8 para Netuno. Gravidade = 12,2 m/s²");
        System.out.println("9 para Plutão(Planeta Anão). Gravidade = 0,6 m/s²");
        planeta = entrada.nextInt();
        
        System.out.print("Informe a velocidade inicial do arremesso (v0): ");
        vInicial = entrada.nextDouble();
        
        System.out.print("Informe o tempo em que a bola foi arremessada: ");
        tempo = entrada.nextDouble();
        
        if(planeta == 1){
            velocidade = vInicial - (3.7 * tempo);
            altura = vInicial * tempo - (3.7 * (Math.pow(tempo,2)) / 2);
            System.out.format("A velocidade de arremesso da bola em Mercúrio será %.2f e a altura %.2f.", velocidade, altura);
        }else{
            if(planeta == 2){
                velocidade = vInicial - (8.8 * tempo);
                altura = vInicial * tempo - (8.8 * (Math.pow(tempo,2)) / 2);
                System.out.format("A velocidade de arremesso da bola em Vênus será %.2f e a altura %.2f.", velocidade, altura);
            }else{
                if(planeta == 3){
                    velocidade = vInicial - (9.8 * tempo);
                    altura = vInicial * tempo - (9.8 * (Math.pow(tempo,2)) / 2);
                    System.out.format("A velocidade de arremesso da bola na Terra será %.2f e a altura %.2f.", velocidade, altura);  
                }else {
                    if(planeta == 4){
                        velocidade = vInicial - (3.8 * tempo);
                        altura = vInicial * tempo - (3.8 * (Math.pow(tempo,2)) / 2);
                        System.out.format("A velocidade de arremesso da bola em Marte será %.2f e a altura %.2f.", velocidade, altura);
                    }else{
                        if(planeta == 5){
                            velocidade = vInicial - (26.4 * tempo);
                            altura = vInicial * tempo - (26.4 * (Math.pow(tempo,2)) / 2);
                            System.out.format("A velocidade de arremesso da bola na Júpter será %.2f e a altura %.2f.", velocidade, altura);
                        }else{
                            if(planeta == 6){
                                velocidade = vInicial - (11.5 * tempo);
                                altura = vInicial * tempo - (11.5 * (Math.pow(tempo,2)) / 2);
                                System.out.format("A velocidade de arremesso da bola em Saturno será %.2f e a altura %.2f.", velocidade, altura);
                            }else{
                                if(planeta == 7){
                                    velocidade = vInicial - (9.3 * tempo);
                                    altura = vInicial * tempo - (9.3 * (Math.pow(tempo,2)) / 2);
                                    System.out.format("A velocidade de arremesso da bola em Urano será %.2f e a altura %.2f.", velocidade, altura);
                                }else{
                                    if(planeta == 8){
                                        velocidade = vInicial - (12.2 * tempo);
                                        altura = vInicial * tempo - (12.2 * (Math.pow(tempo,2)) / 2);
                                        System.out.format("A velocidade de arremesso da bola em Netuno será %.2f e a altura %.2f.", velocidade, altura);
                                    }else{
                                        if(planeta == 9){
                                            velocidade = vInicial - (0.6 * tempo);
                                            altura = vInicial * tempo - (0.6 * (Math.pow(tempo,2)) / 2);
                                            System.out.format("A velocidade de arremesso da bola em Plutão será %.2f e a altura %.2f.", velocidade, altura);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
}
