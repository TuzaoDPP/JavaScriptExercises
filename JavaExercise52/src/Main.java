public class Main {
    public static void main(String[] args) {

        int[][] random = new int[5][5];

        imprimeR(gerador(random));
        imprimeMM(random);
    }

    public static int[][] gerador(int[][] random) {
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                random[linha][coluna] = (int) (Math.random() * 100);
            }
        }
        return random;
    }
    public static int maiorNumero(int[][] random) {
        int maior = 0;

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (random[linha][coluna] > maior) maior = random[linha][coluna];
            }
        }
        return maior;
    }
    public static int menorNumero(int[][] random) {
        int menor = 100;

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (random[linha][coluna]  < menor) menor = random[linha][coluna];
            }
        }
        return menor;
    }

    public static void imprimeR(int[][] random) {
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                System.out.print(random[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
    public static void imprimeMM(int[][] random){
        System.out.format("O maior número da matriz é %d\n", maiorNumero(random));
        System.out.format("O menor número da matriz é %d\n", menorNumero(random));
    }
}
