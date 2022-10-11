import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ni1, ni2;
        double nr1, nr2, nr3;

        System.out.println("Infome dois números inteiros: ");
        ni1 = input.nextInt();
        ni2 = input.nextInt();

        System.out.println("Dobro do primeiro número: " + dobro(ni1));
        System.out.println("Dobro do primeiro número: " + dobro(ni2));
        System.out.println("Fatorial do primeiro número: " + fatorial(ni1));
        System.out.println("Fatorial do primeiro número: " + fatorial(ni2));
        System.out.println("Maior entre esses números: " + maior(ni1, ni2));

        System.out.println("Infome três números reais: ");
        nr1 = input.nextDouble();
        nr2 = input.nextDouble();
        nr3 = input.nextDouble();

        System.out.println("A média dos três números: " + media(nr1, nr2, nr3));


    }

    public static int dobro(int ni){
        int dobro = ni * 2;

        return dobro;
    }

    public static int maior(int ni1, int ni2){
        int maior = 0;

        if(ni1 > ni2) maior = ni1;
        else if(ni1 < ni2) maior = ni2;
        else System.out.println("Ambos tem o mesmo valor");

        return maior;
    }

    public static int fatorial(int ni){
        int x = ni, f = x;
        while (x > 1) {
            f = f * (x - 1);
            x--;
        }

        return f;
    }

    public static double media(double nr1, double nr2, double nr3){
        double media = (nr1 + nr2 + nr3) / 3;

        return media;
    }
}