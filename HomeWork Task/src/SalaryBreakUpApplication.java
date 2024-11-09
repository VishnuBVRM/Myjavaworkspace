import java.util.Scanner;

public class SalaryBreakUpApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		// Enter the Employee Details
		
		System.out.println("Enter the EmployeeID: ");
		int employeeId = scanner.nextInt();
		System.out.println("Enter the EmployeeName: ");
		String employeeName = scanner.next();
		System.out.println("Enter the EmployeeBasicSalary: ");
		double employeeBasicSalary = scanner.nextDouble();
		
		// Salary Cuttings Details
		
		// HRS is House Rent Allowance
		double hra = 0.15 * employeeBasicSalary;
		// PF is Provident Fund
		double pf = 0.05 * employeeBasicSalary;
		// TA is Tavelling Allowance
		double ta = 0.02 * employeeBasicSalary;
		// ESI is Employee's State Insurence
		double esi = 0.025 * employeeBasicSalary;
		// PT is Professional Tax
		double pt = 200;
		
		//Calculate the Gross Pay and Net Pay
		
		// GROSS PAY Calculate
		double grossPay = employeeBasicSalary - hra - pf - ta - esi - pt ;
		
		// NET PAY Calculate
		double netPay = grossPay - pf - pt ;
		
		// print the Breaking Salary Details
		
		System.out.println("EmployeeID : "+ employeeId);
		System.out.println("EmployeeName : "+ employeeName);
		System.out.println("EmployeeSalary : "+ employeeBasicSalary);
		System.out.println("HRA : "+ hra);
		System.out.println("PF : "+ pf);
		System.out.println("TA : "+ ta);
		System.out.println("ESI : "+ esi);
		System.out.println("PT : "+ pt);
		System.out.println("GrossPy : "+ grossPay);
		System.out.println("NetPay : "+ netPay);
		
	}

}
