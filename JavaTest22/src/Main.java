import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] jankenpo = {1, 2, 3};
        int number;

        System.out.println("-----Option menu-----");
        System.out.println("[1] Paper\n[2] Scizor\n[3] Rock\n");

        for(int i = 0; i < jankenpo.length; i++){
            System.out.println("Type the number refering to option you want");
            number = input.nextInt();
            switch(number){
                case 1:
                    option("Paper!");
                    break;
                case 2:
                    option("Scizor!");
                    break;
                case 3:
                    option("Rock!");
                    break;
            }
        }
        machine(jankenpo);
    }
    public static int[] random(int[] psr){
        for(int i = 0; i < psr.length; i++){

            psr[i] = (int)(Math.random() * 3) + 1;
        }
        return psr;
    }
    public static void machine(int[] opm){
        for(int i = 0; i < opm.length; i++){
            if(random(opm)[i] == 1) System.out.println("\nThe machine choose: Paper!");
            else if(random(opm)[i] == 2) System.out.println("\nThe machine choose: Scizor!");
            else if(random(opm)[i] == 3) System.out.println("\nThe machine choose: Rock!");
        }
    }
    public static void option(String option){
        System.out.println("You choose: " + option);
    }
}