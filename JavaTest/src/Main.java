public class Main {
    public static void main(String[] args) {
        long number = 1;
        while(number > 0){
            if(isPrime(number)) System.out.println(number + " is Prime");
            number++;
        }
    }

    public static boolean isPrime(long number) {
        for(int i = 2; i < number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}