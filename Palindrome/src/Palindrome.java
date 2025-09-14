import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Palindrome {

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int length = word.length();

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type 'q' to quit the program.");

        while (true) {
            System.out.print("\nPlease enter a word: ");
            String word1 = input.nextLine();

            if (word1.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (isPalindrome(word1)) {
                System.out.println(word1 + " is a palindrome!");
            } else {
                System.out.println(word1 + " is NOT a palindrome.");
            }
        }

        input.close();
    }
}