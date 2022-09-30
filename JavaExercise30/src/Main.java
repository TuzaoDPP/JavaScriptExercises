import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gender, male = 0, female = 0;
        double weight;

        System.out.println("Options menu\n1 - Male\n2 - Female");

        for(int i = 1; i <= 10; i++){
            System.out.println("Enter the number refering to your gender: ");
            gender = input.nextInt();

            if((gender > 2) || (gender < 1))
                System.out.println("This option don't exist ");

            System.out.println("Inform your weight: ");
            weight = input.nextDouble();

            if((gender == 1) && (weight >= 60) && (weight <= 80))
                male++;
            else
                if((gender == 2) && (weight >= 50) && (weight <= 70))
                    female++;
        }
        System.out.println(male + " mens have the weight between 60 and 80 kg");
        System.out.println(female + " womens have the weight between 50 and 70 kg");


    }
}