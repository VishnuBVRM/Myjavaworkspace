
public class Customer {
	private int customerId;
	private String customerName;
	BankAccount[] customerBankAccounts;
	
	public Customer(int customerId, String customerName, BankAccount[] customerBankAccounts) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBankAccounts = customerBankAccounts;
	}
	public void displayCustomerDetails() {
		System.out.println("Customer Details:");
		System.out.println("--------------");
		System.out.println("Customer Id: "+customerId);
		System.out.println("Customer Name: "+customerName);
		
		System.out.println(" Customer Bank Account Details: ");
		System.out.println("--------------");
		
		
		for(BankAccount account : customerBankAccounts) {
			account.displayAccountDetails();
			System.out.println("--------------");
		}
			
	}

}
