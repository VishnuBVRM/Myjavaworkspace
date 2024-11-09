
public class MethosDemo_1 {
	// static method
	public static void findSquare (int num) {
		int square = num * num;
		System.out.println(square);
		
	}
	// Instance Method
	public static void findCube(int num) {
		int cube = num * num * num;
		System.out.println(cube);
	}
	
	public static int findMax (int num1, int num2){
	int max = (num1 > num2) ? num1 : num2;
	return max ;
}
	
	public static double findTotal(double num1, double num2){
		return num1+num2;
	}
	
	public static double findAvg(double num1, double num2) {
		double total = findTotal(num1,num2);
		double avg = total/2;
		return avg;
	}
	public static void main(String[] args) {
		double avg = findAvg(55.3, 65.3);
		System.out.println(avg);
	// Accessing Instance methods
				
		MethosDemo_1 m = new MethosDemo_1();
		m.findCube (10);
		
		// Accessing Static methods
		findSquare(5);                //  Directly within sample class
		m.findSquare(10);               // Reference Variable
		MethosDemo_1.findSquare(20);      // Using Class Name
	}

}
