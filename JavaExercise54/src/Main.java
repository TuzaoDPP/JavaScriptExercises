import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5];

        for(int i = 0; i < 4; i++){
            System.out.println("Informe o nome do(a) aluno(a): ");
            nomes[i] = input.next();

            System.out.println("Informe a nota do(a) aluno(a): ");
            notas[i] = input.nextDouble();
        }

        for(int i = 0; i < 4; i++){
            System.out.println(nomes[i] + ": " + notas[i]);
        }

        System.out.println("A media das notas é: " + media(notas));
        System.out.println("A maior nota foi: " + maiorNota(notas));
        System.out.println("A menor nota foi: " + menorNota(notas));

        System.out.println("\nLista dos alunos acima da média");
        for(int i = 0; i <= 4; i++) {
            if(notas[i] > media(notas))
                System.out.println(nomes[i]);
        }

        System.out.println("\nLista dos alunos abaixo da média");
        for(int i = 0; i <= 4; i++) {
            if(notas[i] < media(notas))
                System.out.println(nomes[i]);
        }
    }

    public static double media(double[] notas){
        double soma = 0, media;
        for(int i = 0; i < 4; i++){
            soma += notas[i];
        }
        media = soma / notas.length;
        return media;
    }

    public static double maiorNota(double[] notas){
        double maior = 0;
        for(int i = 0; i < 4; i++){
            if(notas[i] > maior) maior = notas[i];
        }
        return maior;
    }

    public static double menorNota(double[] notas){
        double menor = 10;
        for(int i = 0; i < 4; i++){
            if(notas[i] < menor) menor = notas[i];
        }
        return menor;
    }
}