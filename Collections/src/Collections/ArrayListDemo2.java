package Collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		//normal ArrayList
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		
		al.add("Java");
		al.add("Python");
		System.out.println(al);
		
		Object obj = al.get(0);
		int i =(Integer) obj;
		System.out.println(i);
		
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Python");
		
		System.out.println(courses);
		
		String course = courses.get(0);
		System.out.println(course);
	}
}
