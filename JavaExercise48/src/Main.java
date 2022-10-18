import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidade;

        System.out.println("Informe quantos itens você comprou: ");
        quantidade = input.nextInt();

        double[] valores = new double[quantidade];
        double valor = 0;

        for(int i = 0; i < valores.length; i++){
            System.out.format("Informe o valor do item %d: \n", i);
            valores[i] = input.nextDouble();

            valor += valores[i];
        }
        System.out.format("O valor total gasto foi de R$ %.2f\n", valor);
        System.out.format("A média dos valores gastos é de R$ %.2f\n", valor / quantidade);

    }

}