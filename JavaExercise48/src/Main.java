import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quantidade;

        System.out.println("Informe quantos itens você comprou: ");
        quantidade = input.nextInt();

        double[] valores = new double[quantidade];

        for(int i = 0; i < valores.length; i++){
            System.out.format("Informe o valor do item %d: \n", (i + 1));
            valores[i] = input.nextDouble();
        }
        System.out.format("O valor total gasto foi de R$ %.2f\n", valorTotal(valores));
        System.out.format("A média dos valores gastos é de R$ %.2f\n", media(valores, quantidade));
    }

    public static double valorTotal(double[] valores){
        double valor = 0;
        for(int i = 0; i < valores.length; i++){
            valor += valores[i];
        }
        return valor;
    }
    public static double media(double[] valores, int quantidade){
        return valorTotal(valores) / quantidade;
    }
}