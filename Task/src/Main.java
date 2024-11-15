import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String input = "aabbccddeeabcdefg+hijk";
        countRepeatingLetters(input);
    }

    public static void countRepeatingLetters(String input) {
        HashMap<Character, Integer> letterCount = new HashMap<>();

        // Count frequency of each letter
        for (char c : input.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }

        // Print letters that are repeating
        System.out.println("Repeating letters:");
        for (HashMap.Entry<Character, Integer> entry : letterCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
