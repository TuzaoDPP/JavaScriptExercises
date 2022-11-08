import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Informe a altura do retângulo: ");
        ret.setAltura(input.nextDouble());

        System.out.println("Informe a largura do retângulo: ");
        ret.setLargura(input.nextDouble());

        ret.exibe();
    }
}