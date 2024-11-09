import java.util.HashSet;
import java.util.Scanner;

public class New_2 {
	public static int main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();
	
	
		HashSet<Character> set = new HashSet<>();
		int maxLength = 0;
		int start = 0;
		int end = 0;
		String s;
		while (end < s.length()) {
			char currentChar = s.charAt(end);
			if (!set.contains(currentChar))
			{
				set.add(currentChar);
				maxLength = Math.max(maxLength, end - start + 1);
				end++;
				} else {
					set.remove(s.charAt(start));
					start++;
					}
			}
		return maxLength;
		}
	}