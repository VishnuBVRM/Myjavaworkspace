
public class EmployeeTest {

	public static void main(String[] args) {
		Address employeeAddress = new Address("Hyderabad",  "TG", "India");
		
		Employee emp = new Employee(1001, "Vishnu", 9988665544L, employeeAddress);
		
		emp.displayEmployee();

	}

}
