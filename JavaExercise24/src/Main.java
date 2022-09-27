import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, count = 0;


        for(int i = 0; i <= 10; i++){

            System.out.print("Inform a number: ");
            number = input.nextInt();

            if(number < 0)
                count++;
        }
        System.out.println("We read " + count + " negative numbers");

    }
}