public class Main {
    public static void main(String[] args) {

        int t, above19 = 0, below16 = 0;
        double temperature, sum = 0, greater, lower;

        lower = greater = 19.06 + 0.211 * Math.cos(0.08721) + (-5.51 * Math.sin(0.08721));

        for (t = 1; t <= 48; t++) {
            temperature = 19.06 + 0.211 * Math.cos(0.08721 * t) + (-5.51 * Math.sin(0.08721 * t));

            System.out.format("temperature at the hour %d = %.2f \n", t, temperature);
            sum += temperature;

            if(temperature > greater) greater = temperature;

            if(temperature < lower) lower = temperature;

            if(temperature > 19) above19 ++;

            if(temperature < 16) below16 ++;
        }

        System.out.format("The average is = %.2f\n", sum / 48);
        System.out.format("Greater = %.2f\n", greater);
        System.out.format("Lower = %.2f\n", lower);
        System.out.format("Above 19 we have: %d\n", above19);
        System.out.format("Below 16 we have: %d\n", below16);

    }
}