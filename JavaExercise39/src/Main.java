import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ni1, ni2;

        System.out.println("Infome dois números inteiros: ");
        ni1 = input.nextInt();
        ni2 = input.nextInt();

        System.out.println("A soma desses números é: " + soma(ni1, ni2));
        System.out.println("A subtração desses números é: " + subtracao(ni1, ni2));
        System.out.println("A multiplicação desses números é: " + multiplicacao(ni1, ni2));
    }

    public static int soma(int ni1, int ni2){
        return ni1 + ni2;
    }

    public static int subtracao(int ni1, int ni2){
        return ni1 - ni2;
    }

    public static int multiplicacao(int ni1, int ni2){
        int ni3 = 0;
        for(int i = 0; i < ni2; i++) ni3 += ni1;
        return ni3;
    }
}