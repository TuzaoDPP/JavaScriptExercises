import java.util.*;

public class Main {
    public static double calculateDistance(double speed, double time){
        return speed * (time / 60);
    }

    public static double calculateSpeed(double distance, double time){
        return distance / (time / 60);
    }

    public static double calculateTime(double distance, double speed){
        return (distance / speed);
    }

    public static double convertHtoM(double distance, double speed){
        return calculateTime(distance, speed) * 60;
    }

    public static double convertMtoH(double distance, double speed){
        return calculateTime(distance, speed) / 60;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distance, speed, time;
        int option;

        System.out.println("---Option Menu---");
        System.out.println("Type [1] if you want to calculate distance\nType [2] if you want to calculate speed\nType [3] if you want to calculate time\n");
        option = input.nextInt();

        switch(option){
            case 1:
                System.out.println("Inform the average speed (in kilometers per hour) of your vehicle: ");
                speed = input.nextDouble();
                System.out.println("Inform the time (in minutes) you will spend driving: ");
                time = input.nextDouble();

                System.out.println("The distance to be traveled is: " + calculateDistance(speed, time) + "km");
                System.out.format("%.2f minutes converted to %.2f hour(s)\n", time, convertMtoH(calculateDistance(speed, time), speed));
                break;
            case 2:
                System.out.println("Inform the distance (in kilometers) to be traveled: ");
                distance = input.nextDouble();
                System.out.println("Inform the time (in minutes) you will spend driving: ");
                time = input.nextDouble();

                System.out.format("The average speed of the travel is: %.2f km/h", calculateSpeed(distance, time));
                System.out.format("%.2f minutes converted to %.2f hour(s)\n", time, convertMtoH(distance, calculateSpeed(distance, time)));
                break;
            case 3:
                System.out.println("Inform the distance (in kilometers) to be traveled: ");
                distance = input.nextDouble();
                System.out.println("Inform the average speed (in kilometers per hour) of your vehicle: ");
                speed = input.nextDouble();

                System.out.format("The time you will be traveling is: %.2f hour(s) or %.2f minutes", calculateTime(distance, speed), convertHtoM(distance, speed));
                break;
            default: System.out.println("This option don't exist");
        }
    }
}