import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Inform a number: ");
        number = input.nextInt();

        for(int i = 0; i <= number; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        System.out.println("These are the odd numbers");

    }
}