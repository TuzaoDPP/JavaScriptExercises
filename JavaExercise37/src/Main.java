import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double carga, cargaMax, valor;
        char resposta;

        System.out.print("Informe a carga máxima do seu caminhão: ");
        carga = input.nextDouble();

        System.out.println("Você gostaria de cadastrar o seu caminhão no nosso sistema ?\nDigite [s] para sim\nDigite [n] para não");
        resposta = input.next().charAt(0);

        switch(resposta){
            case 's':
                System.out.println("Conectando ao banco de dados ...\nCaminhão cadastrado!\n");
                cargaMax = calculoCarga(carga);
                System.out.println("A carga máxima que você pode transportar é: " + cargaMax);

                valor = calculoTaxa(cargaMax);
                System.out.println("O valor a ser pago é: " + valor);
                break;
            case 'n':
                System.out.println("Obrigado por usar nosso sistema.\nVolte sempre\n");
                break;
        }
    }

    public static double calculoCarga(double carga){

        double cargaMax, margem;

        margem = (carga / 100) * 5;
        cargaMax = carga - margem;

        return cargaMax;
    }

    public static double calculoTaxa(double cargaMax){

        double valor;

        valor = cargaMax * 120.54;

        return valor;
    }
}