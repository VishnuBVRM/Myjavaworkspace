
public class Test3 {
	public static void main(String[] args) {
		try {
		System.out.println("hi");
		System.exit(0);
		System.out.println(10/0);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("hello");
	}
		finally {
			System.out.println("bye");
		}
	}	
}
