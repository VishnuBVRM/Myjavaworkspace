
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer ("Java");
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer s1 = new StringBuffer ("Python");
		StringBuffer s2 = new StringBuffer ("Python");
		
		System.out.println(s1==s2);
		System.out.println(s2.equals(s2));
		
	}
}
