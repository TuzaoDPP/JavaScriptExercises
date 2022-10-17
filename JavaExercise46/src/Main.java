import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] age = new int[10];
        int sum = 0;

        for(int i = 0; i < age.length; i++){

            System.out.format("inform the age of the person%d: \n", i);
            age[i] = input.nextInt();
            sum += age[i];
        }

        for(int i = 0; i < age.length; i++){

            System.out.format("%d\t", age[i]);
        }

        System.out.format("\nThe age average is: %d\n", ageAverage(age, sum));
    }

    public static int ageAverage(int[] age, int sum){
        return sum / age.length;
    }
}