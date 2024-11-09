package exception_handling;

public class ErrorDemo {
	public void m1() {
		System.out.println("Java");
		m2();
	}
	public void m2() {
		System.out.println("Python");
		m1();
	}
	public static void main(String[] args) {
		ErrorDemo d = new ErrorDemo();
		d.m1();
	}
}
