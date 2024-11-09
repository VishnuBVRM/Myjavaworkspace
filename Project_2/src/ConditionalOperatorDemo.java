import java.util.Scanner;

public class ConditionalOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z, max, min;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter the first number: ");
		x = in.nextInt();
		
		System.out.println("Please enter the second number: ");
		y = in.nextInt();
		
		System.out.println("Please enter the thire number: ");
		z = in.nextInt();
		
		max = (x>y) && (x>z) ? x : (y>z) ? y : z;
		min = (x<y) && (y<z) ? x : (y<z) ? y : z;
		
		System.out.println("Max of " + x + "," + y + " and " + z +" is " + max);
		System.out.println("Min of " + x + "," + y + " and " + z +" is " + min);

	}

}
