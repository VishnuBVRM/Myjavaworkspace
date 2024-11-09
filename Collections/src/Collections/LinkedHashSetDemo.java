package Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		System.out.println(s.isEmpty());
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		System.out.println(s);
		
		s.add(100);
		System.out.println(s);
		
		s.add(null);
		System.out.println(s);
		
		boolean existed = s.contains(123);
		System.out.println(existed);
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove(100));
		System.out.println(s.add(123));
		
		System.out.println(s);
	}
}
