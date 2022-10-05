import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int studentCount = 0;
        double grade, gradeSum = 0, approved = 0, reproved = 0;

        System.out.println("Enter a negative grade to end");
        grade = input.nextDouble();

        if (grade < 0)
            System.out.println("Is not possible to get a negative grade");
        else {
            while (grade >= 0) {
                gradeSum += grade;
                studentCount++;

                System.out.println("Informe mais uma nota");
                grade = input.nextInt();

                if (grade >= 70)
                    approved++;
                else
                    reproved++;

                System.out.println("\nEnter a negative grade to end\n");
            }

            System.out.println("Grade average = " + (gradeSum / studentCount));
            System.out.println("Students quantity = " + studentCount);
            System.out.println("Approveds =  " + approved);
            System.out.println("Reproveds = " + reproved);
        }
    }
}