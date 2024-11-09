
public class AtmService {

	public static int balance = 1000000000; 
	
	public int balance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	public void Withdraw(int amount) {
		balance = balance - amount;
	}

}
