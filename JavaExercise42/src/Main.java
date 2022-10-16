import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number;

        System.out.println("Inform a number");
        number = input.nextDouble();

        System.out.println(reverse(number));
    }

    public static double reverse(double number){
        double reverse = 0;

        while(number != 0){
            reverse *= 10;
            reverse += number % 10;
            number = Math.round(number/10);
        }
        return reverse;
    }
}