import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, greater, lower;

        System.out.print("Inform a number: ");
        number = input.nextInt();
        greater = number;
        lower = number;

        for(int i = 2; i <= 10; i++){
            System.out.print("Inform a number: ");
            number = input.nextInt();

            if(number > greater){
                greater = number;
            }
            if(number < lower){
                lower = number;
            }
        }

        System.out.println(greater + " is the biggest number");
        System.out.println(lower + " is the lowest number");


    }
}