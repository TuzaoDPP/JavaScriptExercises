import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        double v, vo, t, h, times;

        times = 2 /0.1;
        t = 0;

        System.out.print("Inform the inicial velocity: ");
        vo = input.nextDouble();

        System.out.print("t(s) \t\t h(s) (m) \t\t v(s) (m/s) \t\t");
        for(i = 0; i <= times; i++){
            v = vo - 9.8 * t;
            h = vo * t - (9.8 * Math.pow(t, 2) / 2);

            System.out.format("%.2f \t\t %.2f \t\t %.2f \t\t \n", t, h, v);

            t+= 0.1;
        }

    }
}