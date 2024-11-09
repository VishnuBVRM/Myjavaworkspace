package Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(1001, "vishnu@gmail.com");
		hm.put(1002, "vardha@gmail.com");
		hm.put(1003, "chintala@gmail.com");
		hm.put(1004, "chowdary@gmail.com");
		
		System.out.println(hm);
		
		hm.put(1002, "chinnu@gmail.com");
		System.out.println(hm);
		
		hm.put(1005, "king@gmail.com");
		System.out.println(hm);
		
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		
		Collection<String> values = hm.values();
		System.out.println(values);
		
		for(Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey()+"-------"+entry.getValue());
			
		}
	}
}
