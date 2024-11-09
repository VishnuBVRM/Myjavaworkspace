package Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<>(Comparator.reverseOrder());
		s.add(100);
		s.add(100);
		s.add(100);
		s.add(100);
		s.add(100);
		System.out.println(s);
		
		s.add(100);
		System.out.println(s);
		
		s.add(null);
		System.out.println(s);
		
		boolean existed = s.contains(123);
		System.out.println(existed);
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove(100));
		System.out.println(s);
	}
}
