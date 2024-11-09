
class MyCalc{
	public static int findMax(int a, int b) {
		return (a>b) ? a:b;
	}
	
	public static long findMax(long a, long b) {
		return (a>b) ? a:b;
}
	public static double findMax(double a, double b) {
		return (a>b) ? a:b;
}
	
	/*public static void sum(int a, int b) {
		System.out.println("java");
	}*/
	
	// Variable Length Argument Method or Var Arg Method
	// Added in java 1.5v
	public static void sum(int... a) {
		// System.out.println("java");
		int total = 0;
		for(int x : a) {
			total += x;
		}
		System.out.println(total);
	}
}
public class OverLoadingDemo {
	public static void main(String... args) {
		MyCalc.sum();
		MyCalc.sum(10, 20);
		MyCalc.sum(10, 20, 30);
		MyCalc.sum(10, 20, 30, 40);
		MyCalc.sum(10, 20, 30, 40, 50);
		
		MyCalc.sum (new int [] {11, 22, 33, 44, 55, 66});
		
		int maxInt = MyCalc.findMax(100, 200);
		System.out.println(maxInt);
		
		long maxLong = MyCalc.findMax(9988776655L, 8877665544L);
		System.out.println(maxLong);
		
		double maxDouble = MyCalc.findMax(55000.00, 60000.00);
		System.out.println(maxDouble);
	}
}

