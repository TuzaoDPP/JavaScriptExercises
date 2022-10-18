import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numSorteados = new int[6];
        int[] numJogados = new int[6];
        int acerto = 0;

        for(int i = 0; i < 6; i ++){
            System.out.println("Insira o numero "+ (i +1) + " que foi sorteado");
            numSorteados[i] = input.nextInt();
        }

        for(int i = 0; i < 6; i ++){
            System.out.println("Insira o numero "+ (i +1) + " que você jogou.");
            numJogados[i] = input.nextInt();
        }

        for (int i = 0; i < numSorteados.length; i++) {

            for (int j = 0; j < numJogados.length; j++) {

                if (numJogados[j] == numSorteados[i]) {
                    acerto++;
                }
            }
        }

        System.out.format("Você acertou %d número(s)\n", acerto);

    }
}