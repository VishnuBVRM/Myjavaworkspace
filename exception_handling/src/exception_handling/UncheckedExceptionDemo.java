package exception_handling;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50};
		String s = "vishnu";
		
		try {
			System.out.println(a[1]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No Element is Existed.");
		}
		try {
			char c = s.charAt(0);
			System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("No Element is Existed.");
		}
	}
} 
