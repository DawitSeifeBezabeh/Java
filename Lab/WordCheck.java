import java.util.Scanner;

public class WordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a word (or 'quit' to stop): ");
            String word = scanner.nextLine().toLowerCase();
            if (word.equals("quit")) break;

            String moved = word.substring(1) + word.charAt(0);
            String reversed = new StringBuilder(moved).reverse().toString();

            if (reversed.equals(word)) {
                System.out.println(word + " has the property.");
            } else {
                System.out.println(word + " does not have the property.");
            }
        }
        scanner.close();
    }
}