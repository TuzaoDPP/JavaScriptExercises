import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] number = new int[5];

        for(int i = 0; i < number.length; i++){

            System.out.format("Inform the number %d: ", i);
            number[i] = input.nextInt();
        }

        for(int i = number.length - 1; i >= 0; i--){

            System.out.format("%d\t", number[i]);

        }

    }
}