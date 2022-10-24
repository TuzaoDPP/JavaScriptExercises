import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] personagens = new String[]{"Chun-li", "Zaguief", "Blanka", "Guile", "Ryu", "Dhalsim"};
        int vitorias;

        for(int i = 0; i < 5; i++){
            System.out.println("Ken x " + personagens[i]);
        }

        System.out.println("Quantas lutas você venceu ?");
        vitorias = input.nextInt();

        while(vitorias < 6){
            System.out.println("\nInsira uma nova ficha! [Aperte 1]");
            input.nextInt();

            System.out.println("\nQuantas lutas você venceu ?");
            vitorias = input.nextInt();
        }
        System.out.println("\nParabéns!");
    }
}