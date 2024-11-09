package Collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class TraversalDemo {
	public static void main(String[] args) {
		ArrayList<Double> salaries = new ArrayList<Double>();
		salaries.add(55000.00);
		salaries.add(60000.00);
		salaries.add(65000.00);
		salaries.add(70000.00);
		salaries.add(25000.00);
		System.out.println("Using dor Loop");
		for(int index=0; index<salaries.size(); index++) {
			System.out.println(salaries.get(index));
		}
		
		System.out.println("Using ListItertor form v1.2");
		ListIterator<Double> itr = salaries.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Using for each loop v1.5");
		for(Double salary : salaries) {
			System.out.println(salary);
		}
		
		System.out.println("Using forEach() from v1.8 with method References");
		salaries.forEach(System.out :: println);
		
		System.out.println("Using forEach() from v1.8 wih Lambda Expressions");
		salaries.forEach((salary)-> System.out.println(salary));
	}
}
