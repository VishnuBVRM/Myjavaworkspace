import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		num1 = num2 = sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		num1 = in.nextInt();
		
		System.out.println("Please enter second number:");
		num2 = in.nextInt();
	
		sum = num1 + num2;
		
		System.out.println(sum);

	}

}
