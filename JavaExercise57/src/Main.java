import java.util.*;

public class Main {
    public static void pesquisaSequencial(int[]notas, int valor){
        int i;
        for (i = 0; i < 6; i++) {
            if (valor == notas[i]) {
                System.out.format("Achei o valor %d na posição %d\n", valor, i);
                break;
            }
        }
        if (i == 6)
            System.out.println("Elemento não encontrado\n");
    }

    public static void pesquisaBinaria(int[]notas, int valor){
        int inicio = 0, meio, fim = 5, contador = 0;

        while(inicio <= fim){
            meio = (inicio + fim)/2;
            contador++;

            if(valor == notas[meio]){
                System.out.println("Elemento " + valor + " encontrado na posição " + meio);
                break;
            }else if(valor > notas[meio]){
                inicio = meio + 1;
            }else
                fim = meio -1;
        }

        System.out.println("O número de comparações foi: " + contador);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] notas = new int[6];
        int i, valor, escolha;

        for (i = 0; i < 6; i++) {
            System.out.print("Informe uma nota: ");
            notas[i] = input.nextInt();
        }

        System.out.println("Escolha uma forma de pesquisa");
        System.out.println("[1] Escolha Sequencial\n[2] Escolha Binária");
        escolha = input.nextInt();

        switch (escolha){
            case 1:
                do {
                    System.out.print("informe a nota que você quer encontrar: ");
                    valor = input.nextInt();

                    pesquisaSequencial(notas, valor);

                } while (valor >= 0);
                break;
            case 2:
                do {
                    System.out.print("informe a nota que você quer encontrar: ");
                    valor = input.nextInt();

                    pesquisaBinaria(notas, valor);

                } while (valor >= 0);
                break;
            default: System.out.println("Essa opção não existe");
        }

    }
}