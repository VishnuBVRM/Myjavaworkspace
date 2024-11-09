import java.util.Scanner;
public class SumCountReverseDemo {
		// TODO Auto-generated method stub

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Input a number from user
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();
		        
		        // Initialize variables for sum, count, and reverse
		        int sum = 0, count = 0, reverse = 0;
		        int temp = Math.abs(number); // Use absolute value for calculation
		        
		        while (temp != 0) {
		            int digit = temp % 10; // Get the last digit
		            
		            sum += digit;           // Sum of digits
		            count++;                // Count of digits
		            reverse = reverse * 10 + digit; // Reverse the number
		            
		            temp /= 10; // Remove the last digit
		        }
		        
		        // Output results
		        //System.out.println("Sum of digits: " + sum);
		        System.out.println("Count of digits: " + count);
		        System.out.println("Reverse of digits: " + (number < 0 ? -reverse : reverse));
		        
		        scanner.close();
		    }
}
