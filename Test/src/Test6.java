
public class Test6 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			System.out.println("Java");
		}
		try {
			System.out.println("Python");
		}catch (Exception e) {
			System.out.println("Java");
		}
		}
	}
