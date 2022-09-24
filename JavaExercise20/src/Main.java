import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age, gender, payment;

        System.out.print("Inform your age: ");
        age = input.nextInt();

        System.out.println("Enter the number relative to your gender : \n 1 to Masculine\n 2 to Feminine");
        gender = input.nextInt();

        if(gender == 1){
            if(age <= 15){
                payment = 60;
                System.out.println("Your monthly payment will be " + payment);
            }else{
                if((age >= 16) && (age <= 18)) {
                    payment = 75;
                    System.out.println("Your monthly payment will be " + payment);
                }else{
                    if((age >= 19) && (age <= 30)) {
                        payment = 90;
                        System.out.println("Your monthly payment will be " + payment);
                    }else{
                        if((age >= 31) && (age <= 40)) {
                            payment = 85;
                            System.out.println("Your monthly payment will be " + payment);
                        }else{
                            if(age > 40) {
                                payment = 80;
                                System.out.println("Your monthly payment will be " + payment);
                            }
                        }
                    }
                }
            }
        }else{
            if(gender == 2){
                if(age <= 18){
                    payment = 60;
                    System.out.println("Your monthly payment will be " + payment);
                }else{
                    if((age >= 19) && (age <= 25)) {
                        payment = 90;
                        System.out.println("Your monthly payment will be " + payment);
                    }else{
                        if((age >= 26) && (age <= 40)) {
                            payment = 85;
                            System.out.println("Your monthly payment will be " + payment);
                        }else{
                            if(age > 40) {
                                payment = 80;
                                System.out.println("Your monthly payment will be " + payment);
                            }
                        }
                    }
                }
            }
        }

    }
}