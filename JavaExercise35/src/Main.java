import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int channel, c2 = 0, c5 = 0, c7 = 0, c12 = 0, interviwed;

        System.out.println("Enter a channel");
        System.out.println("Channel 2\nChannel 5\nChannel 7\nChannel 12");
        channel = input.nextInt();
        System.out.println("Enter the channel zero to end");

        while(channel > 0){
            System.out.print("Enter a channel: ");
            channel = input.nextInt();

                switch (channel){
                    case 2:
                        System.out.println("Channel 2");
                        c2++;
                        break;
                    case 5:
                        System.out.println("Channel 5");
                        c5++;
                        break;
                    case 7:
                        System.out.println("Channel 7");
                        c7++;
                        break;
                    case 12:
                        System.out.println("Channel 12");
                        c12++;
                        break;
                    default:
                        System.out.println("This channel don't exist");
                }

            }
            interviwed = c2 + c5 + c7 + c12;
            System.out.println(interviwed + " persons was interviwed");
            System.out.println((c2 * 100 / interviwed) + "% watched channel 2");
            System.out.println((c5 * 100 / interviwed)+ "% watched channel 5");
            System.out.println((c7 * 100 / interviwed) + "% watched channel 7");
            System.out.println((c12 * 100 / interviwed) + "% watched channel 12");
        }
    }
