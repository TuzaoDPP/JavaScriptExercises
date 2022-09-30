import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double grade, greater, lowest;

        System.out.print("Inform your grade: ");
        grade = input.nextInt();
        greater = grade;
        lowest = grade;

        for(int i = 2; i <= 5; i++){
            System.out.print("Inform your grade: ");
            grade = input.nextInt();

            if(grade > greater)
                greater = grade;
            else {
                if(grade < lowest)
                    lowest = grade;
            }
        }
        System.out.println("Your greater grade is: " + greater);
        System.out.print("Your lowest grade is: " + lowest);

    }
}