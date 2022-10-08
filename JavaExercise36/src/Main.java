import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber, secondNumber, result;
        int operation;

        System.out.print("Infom two numbers: ");
        firstNumber = input.nextDouble();
        secondNumber = input.nextDouble();

        System.out.println("Infom 1 to sum");
        System.out.println("Infom 2 to subtract");
        System.out.println("Infom 3 to multiply");
        System.out.println("Infom 4 to divide");
        operation = input.nextInt();

        result = Calculator(firstNumber, secondNumber, operation);

        System.out.print("The result of the operation is: " + result);
    }

    public static double Calculator(double N1, double N2, int operation){

        double result = 0.0;

        switch(operation){
            case 1:
                result = N1 + N2;
                Print("Summing");
                break;
            case 2:
                result = N1 - N2;
                Print("Subtracting");
                break;
            case 3:
                result = N1 * N2;
                Print("Multipling");
                break;
            case 4:
                result = N1 / N2;
                Print("Dividing");
                break;
        }
        return result;

    }

    public static void Print(String operation){
        System.out.println("The calculator is " + operation);
    }
}