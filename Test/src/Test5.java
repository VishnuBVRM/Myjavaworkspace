
public class Test5 {
	public static void main(String[] args) {
		
	try {
		System.out.println(10/0);
	}catch (ArithmeticException e) {
		System.out.println("Can't divided a nimber with 0");
	}
	try {
		System.out.println(10/0);
	}catch (RuntimeException e) {
		System.out.println("Can't divided a nimber with 0");
	}
	try {
		System.out.println(10/0);
	}catch (Exception e) {
		System.out.println("Can't divided a nimber with 0");
	}
	try {
		System.out.println(10/0);
	}catch (Throwable e) {
		System.out.println("Can't divided a nimber with 0");
	}
	}
}
