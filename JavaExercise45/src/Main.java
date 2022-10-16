import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Inform a number: ");
        number = input.nextInt();

        if(isPrime(number)) System.out.println("This number is Prime");
        else System.out.println("This number is not Prime");
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}