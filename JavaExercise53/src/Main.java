public class Main {
    public static void main(String[] args) {

        int[] vetor = {12, 45, 3, 2, 52};
        System.out.println("O número 45 se encontra na posição: " + encontraPosicao(vetor, 45));
        System.out.println("O número 52 se encontra na posição: " + encontraPosicao(vetor, 52));
    }

    public static int encontraPosicao(int[] vetor, int numero){
        if (vetor == null) return -1;

        int len = vetor.length;
        int i = 0;

        while (i < len) {
            if (vetor[i] == numero) return i;
            else i=i+1;
        }
        return -1;
    }
}