import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word;

        System.out.println("Enter a word: ");
        word = input.nextLine();

        System.out.println("The number of vowels is: " + countVowels(word));
    }

    public static int countVowels(String word){
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            if((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o') || (word.charAt(i) == 'u')){
                count++;
            }
        }
        return count;
    }
}