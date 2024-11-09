package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Python","Angular","React");
		
		Consumer<String> consumer = (value) -> System.out.println(value);
		System.out.println("-------- Passing Consumer object ---------");
		courses.forEach(consumer);
		
		System.out.println("-------- Passing Lambda Expression ---------");
		courses.forEach((value) -> System.out.println(value));
		
		System.out.println("-------- Passing Metod References ---------");
		courses.forEach(System.out :: println);
		
		List<Double> salaries = Arrays.asList(55000.0,45000.0,35000.0,65000.0);
		List<Double> filteredsalaries = new ArrayList<Double>();
		//write logic
		/*salaries.forEach((salary)->{
			if(salary >= 40000) {
				filteredsalaries.add(salary);
			}
		});*/
		for(Double salary : salaries) {
			if(salary >= 40000)
				filteredsalaries.add(salary);
		}
		System.out.println(filteredsalaries);
		
	}
}
