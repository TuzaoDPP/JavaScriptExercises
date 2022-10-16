import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int digits;

        System.out.println("Inform a integrer number: ");
        digits = input.nextInt();

        System.out.println("The sum is: " + sumDigits(digits));
    }

    public static int sumDigits(int number){
        int result = 0;

        while(number > 0){
            result += number %10;
            number /= 10;
        }
        return result;
    }
}