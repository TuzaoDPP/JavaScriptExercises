import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao, jankenpo = 0;

        System.out.println("------Menu de Opções------");
        System.out.print("[1] Pedra\n[2] Papel\n[3] Tesoura\n");

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o número referente a sua escolha: ");
            opcao = input.nextInt();

            escolha(opcao);
            imprimeRandom(jankenpo);
        }
    }
    public static int random(int jankenpo){
        jankenpo = (int)(Math.random() * 3) + 1;
        return jankenpo;
    }

    public static void escolha(int opcao){
        switch(opcao){
            case 1:
                System.out.println("Pedra!");
                break;
            case 2:
                System.out.println("Papel!");
                break;
            case 3:
                System.out.println("Tesoura!");
                break;
            default: System.out.println("Essa opção não existe");
        }
    }
    public static void imprimeRandom(int jankenpo){
        switch(random(jankenpo)){
            case 1:
                System.out.println("x\nPedra!\n");
                break;
            case 2:
                System.out.println("x\nPapel!\n");
                break;
            case 3:
                System.out.println("x\nTesoura!\n");
                break;
        }
    }
}