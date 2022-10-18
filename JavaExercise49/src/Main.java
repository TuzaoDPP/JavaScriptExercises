import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int numeroUsuario, soma = 0;

        for(int i = 0; i < numeros.length; i++){

            numeros[i] = (int)(Math.random() * 9) + 1;
        }

        System.out.println("Informe um numero de 1 a 10: ");
        numeroUsuario = input.nextInt();

        for(int i = 0; i < numeros.length; i++){

            if(numeroUsuario == numeros[i]){
                soma++;
                System.out.format("Você acertou o valor da posição %d\n----------------------------------\n", i);
            }
        }
        System.out.format("Total de acertos: %d\n\n", soma);

        for(int i = 0; i < numeros.length; i++){

            System.out.format("Posição %d, valor %d\n", i, numeros[i]);
        }

    }

}