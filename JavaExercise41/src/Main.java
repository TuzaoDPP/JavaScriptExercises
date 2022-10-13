import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Inform a number: ");
        number = input.nextInt();

        while(!pair(number)){
            System.out.println("Inform a number: ");
            number = input.nextInt();

            if(pair(number)) System.out.println("This number is even");
            else System.out.println("This number is odd");
        }

    }

    public static boolean pair(int n){
        return n % 2 == 0;

    }
}