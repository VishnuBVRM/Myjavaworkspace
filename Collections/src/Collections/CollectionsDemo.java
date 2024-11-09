package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(44,55,66,77,88,99);
		System.out.println(list);
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		int index = Collections.binarySearch(list, 99);
		System.out.println(index);
		
	}
}
// collections vs collection vs collections