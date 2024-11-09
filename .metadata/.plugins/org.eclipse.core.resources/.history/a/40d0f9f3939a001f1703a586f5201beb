import java.util.HashMap;
import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();  // Convert to lowercase for case-insensitive counting
        scanner.close();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {  // Check if character is a letter
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Letter counts:");
        for (char c : letterCount.keySet()) {
            System.out.println(c + ": " + letterCount.get(c));
        }
    }
}
