import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int h, m, s;

        System.out.println("Inform the hour: ");
        h = input.nextInt();
        System.out.println("Inform the minutes: ");
        m = input.nextInt();
        System.out.println("Inform the seconds: ");
        s = input.nextInt();

        System.out.println("This hour in seconds is: " + conversion(h, m, s));
    }

    public static int conversion(int h, int m, int s){
        return (h * 3600) + (m * 60) + s;
    }
}