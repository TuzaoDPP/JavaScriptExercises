import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] notas = new int[5][5];

        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                System.out.format("Informe a nota %d da coluna %d\n", (linha + 1), (coluna + 1));
                notas[linha][coluna] = input.nextInt();
            }
        }

        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                System.out.print(notas[linha][coluna] + "\t");
            }
            System.out.println();
        }

    }
}