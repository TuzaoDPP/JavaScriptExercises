import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroUsuario, pontuacao = 0;
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random() * 10);
        }

        System.out.println("Informe um número: ");
        numeroUsuario = input.nextInt();

        for (int j : vetor) {
            if (numeroUsuario == j) {
                System.out.println("KABOOM!\n Você escolheu um número igual ao da lista");
                break;
            } else {
                pontuacao++;
                System.out.println("Informe um número: ");
                numeroUsuario = input.nextInt();
            }
        }

        for (int k : vetor) {
            System.out.println(k);
        }
        System.out.println("-------------\nPontuação: " + pontuacao);
    }
}