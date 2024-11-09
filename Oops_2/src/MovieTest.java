
public class MovieTest {

	public static void main(String[] args) {
		Movie m1 = new Movie (111, "Devara", "Koratala Shiva");
		Movie m2 = new Movie (222, "RRR", "SS Rajamouli");
		Movie m3 = new Movie (333, "STUDENT NO.1", "SS Rajamouli");
		Movie m4 = m1;
	
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
	
		// == Operator always meant for reference comparison
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		System.out.println(m1==m4);
		
		String s1 = new String ("java");
		String s2 = new String ("java");
		System.out.println(s1.equals(s2));
	}
}
