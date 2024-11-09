package exception_handling;

public class FinallyDemo2 {
	public static void main(String[] args) {
		
		try {
			System.out.println("Risky Code");
		}catch (Exception e) {
			System.out.println("Handling Code");
		}finally {
			System.out.println("Cleap Up Code");
		}
	}
}
