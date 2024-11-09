
public class CustomerTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1281010029L, "Vishnu","SBI45678", "Bhimavaram");
		BankAccount account2 = new BankAccount(1235501002L, "Vardhan","UBIN45678", "Gutlapadu");
		
		BankAccount[] customerBankAccounts = {account1,account2};
		
		Customer customer = new Customer(111, "vishnu", customerBankAccounts);
		customer.displayCustomerDetails();
		
 
	}

}
