package exception_handling;

public class FinallyDemo {
	public static void main(String[] args) {
		String s = null;
		
		System.out.println("hello");
		try {
			System.exit(0);
			System.out.println(s.charAt(0));
		}catch (NullPointerException e) {
			System.out.println("nothing");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("tata");
	}
}
