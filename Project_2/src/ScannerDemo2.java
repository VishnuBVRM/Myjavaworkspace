import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2, sum;
		num1 = num2 = sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		num1 = in.nextFloat();
		
		System.out.println("Please enter second number:");
		num2 = in.nextFloat();
	
		sum = num1 + num2;
		
		System.out.println(sum);


	}

}
