package exception_handling;

class Employee{
	int employeeId;
	String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	@Override
	public void finalize() {
		System.out.println("finalize()");
	}
	
}
public class FinalizeMethodDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Vishnu");
		Employee e2 = new Employee(2002, "Vardhan");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("- - - - - - - - - - -");
		e1=e2;//1 Assigning one reference to another reference.
		System.out.println(e1);
		System.out.println(e2);
		
		//Anonymous object
		new Employee(3003,"Chintala");//2. Anonymous object eligible for garbage collector
		
		Employee e3 = new Employee (4004, "Chowdary");
		e3=null; //3. Nullifying reference
		
		//Request JVM to call Garbage Collector
		System.gc();
		}
}
