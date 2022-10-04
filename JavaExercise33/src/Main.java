import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sons, interviewed = 0;
        double salary, sumSons = 0, sumSalary = 0;

        System.out.println("Enter a negative salary to end");
        salary = input.nextDouble();

        if (salary < 0)
            System.out.println("No data was coleted");
        else {
            while (salary >= 0) {
                sumSalary += salary;

                System.out.println("Inform your sons quantity");
                sons = input.nextInt();
                sumSons += sons;

                interviewed++;

                System.out.println("Enter a negative salary to end");
                salary = input.nextDouble();
            }

            System.out.println("Salary average = " + (sumSalary / interviewed));
            System.out.println("Sons average = " + (sumSons / interviewed));

        }
    }
}