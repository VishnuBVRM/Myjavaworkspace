import java.util.Arrays;
public class ArraysDemo {

	public static void main(String[] args) {
		
		// Array Declaration
		int[] arr1;
		int []arr2;
		int arr3[];
		
		// Array Creation
		arr1 = new int [6];
		arr2 = new int [0];
	 // arr3 = new int [-10]; // invalid
		
		// arr3 = new int [Integer.MAX_VALUE]; //Exception
		System.out.println(Integer.MAX_VALUE);
		
		//Array Initialization
		arr1[0] = 44;
		arr1[1] = 55;
		arr1[2] = 66;
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		// arr1[6] = 100; //RE
		
		// Declaration, Creation and Initialization in a single line.
		  int[] arr4 = new int[] {44,55,66,77,88,88,99};
		  
		int [] arr5 = {44,55,66,55,66,77,88,88,99};
		
		System.out.println(arr4);
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr5);
		System.out.println(Arrays.toString(arr5));
		
		System.out.println(arr4.length);
		
		System.out.println(arr4[0]);
		System.out.println(arr4[arr4.length-1]);
		
		//Travesal
		
		int[] subjectMarks = {44,55,66,77,88,88,99};
		
		System.out.println("Using for loop");
		
		for(int index = 0; index < subjectMarks.length; index++) {
			System.out.println("Subject " + (index+1)+"Marks is " + subjectMarks[index]);
		}
		
		System.out.println("Using while loop");
		int i = 0;
		while(i < subjectMarks.length) {
			System.out.println("Subject " +(i+1)+ "Marks is " +subjectMarks[i]);
			i++;
		}
		
		System.out.println("Using for each loop or enhanced for loop ");
		for (int eachSubjectMarks : subjectMarks) {
			System.out.println(eachSubjectMarks);
		}
		double [] salaries = {55000.0, 45000.0, 65000.0, 75000.0, 85000.0, 95000.0};
		
		System.out.println("Salaries in order: ");
		for (double salary : salaries) {
            System.out.println(salary);
        }
				
		double totalSalary = 0;
		double highestSalary = salaries[0];
		double lowestSalary = salaries[0];
		
        for (double salary : salaries) {
        	totalSalary += salary;
        	if(salary > highestSalary) {
        		highestSalary = salary;
        	}
        	
        	if(salary < lowestSalary) {
        		lowestSalary = salary;
        	}
        }
        
            System.out.println("Total Salary: " + totalSalary);
            System.out.println("Highest Salary: " + highestSalary);
            System.out.println("Lowest Salary: " + lowestSalary);
        

	}

}
