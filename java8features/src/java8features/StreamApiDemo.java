package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class StreamApiDemo {
	public static void main(String[] args) {
		List<Double> salaries = Arrays.asList(55000.0,45000.0,35000.0,65000.0);
		
		Stream<Double> stream = salaries.stream();
		Predicate<Double> predicate = (value)-> value >=40000;
		stream
		.filter(predicate)
		.forEach(System.out::println);
		
		System.out.println("-----filter salaries < 50000-----");
		salaries
		.stream()
		.filter((salary)-> salary <50000)
		.forEach(System.out::println);
		
		List<String> courses = Arrays.asList("Python","Java","Angular","React","Js");
		System.err.println("-------filter course names start with J-------");
		courses
		.stream()
		.filter((course)-> course.startsWith("J"))
		.forEach(System.out::println);
		
		System.out.println("-------filter courses where course name length is >= 5 characters-------");
		courses
		.stream()
		.filter((course)-> course.length() >= 5)
		.forEach(System.out::println);
		
		System.out.println(salaries);
		
		System.out.println("-------update each salary by 2000 and display updated salaries-------");
		salaries
		.stream()
		.map((salary) -> salary + 2000.0)
		.forEach(System.out::println);
		
		System.out.println("-------update each salary by 10% and display updated salaries-------");
		salaries
		.stream()
		.map((salary) -> salary + salary * .1)
		.forEach(System.out::println);
		
		System.out.println("-------Display total salary-------");
		System.out.println(salaries);
		Double totalSalary = salaries
		.stream()
		.reduce((sal1, sal2)-> sal1+sal2)
		.get();
		System.out.println(totalSalary);
		
		System.out.println("--------------");
		
		totalSalary = salaries
		.stream()
		.mapToDouble((salary)-> salary)
		.sum();
		System.out.println(totalSalary);
		
		System.out.println("-------Average Salary-------");
		double avgSalary = salaries
				.stream()
				.mapToDouble((salary)-> salary)
				.average()
				.getAsDouble();
		System.out.println(avgSalary);
		
		System.out.println("-------Max Salary-------");
		double maxSalary = salaries
				.stream()
				.mapToDouble((salary)-> salary)
				.max()
				.getAsDouble();
		System.out.println(maxSalary);
		
		System.out.println("-------Min Salary-------");
		double minSalary = salaries
				.stream()
				.mapToDouble((salary)-> salary)
				.min()
				.getAsDouble();
		System.out.println(minSalary);
		
	}
}
