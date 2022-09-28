import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temperature, totalTemperature = 0, average;

        for(int i = 1; i <= 10; i++){
            System.out.print("Inform the day temperature: ");
            temperature = input.nextInt();

            totalTemperature = totalTemperature + temperature;
        }
        average = totalTemperature / 10;
        System.out.println("The average temperature in 10 days is: " + average);

    }
}