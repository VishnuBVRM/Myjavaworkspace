
public class Employee {
	int employeeId;
	String employeeName;
	long employeeMobile;
	Address employeeAddress;// Entity Reference
	
	public Employee(int employeeId, String employeeName, long employeeMobile, Address employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeMobile = employeeMobile;
		this.employeeAddress = employeeAddress;
	}
	public void displayEmployee() {
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Mobile:"+employeeMobile);
		employeeAddress.displayAddress();
		
		
	}
	


}
