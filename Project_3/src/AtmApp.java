import java.util.Scanner;

public class AtmApp {
	public static void main(String[] args) {
		AtmService service = new AtmService ();
		Scanner in = new Scanner (System.in);
		int option = 0;
		do {
			System.out.println("XYZ ATM");
			System.out.println("_ _ _ _ _ _ _");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("0. Exit");
			System.out.println("Please choose option:");
			option = in.nextInt();
			
			switch (option) {
			case 1:
				System.out.println(" Enter Deposit Amount");
				int depositAmount = in.nextInt();
				service.deposit (depositAmount);
				System.out.println("Deposit is Successfull!!!");
				break;
				
			case 2:
				System.out.println(" Enter Withdraw Amount");
				int WithdrawAmount = in.nextInt();
				service.Withdraw(WithdrawAmount);
				if (WithdrawAmount > service.balance()) {
					System.out.println("Insufficient Balance");	
				}else if (WithdrawAmount < 100) {
					System.out.println("Minimum Withdraw Amount is Rs.100");
				}else {
					System.out.println("Withdraw processing... ");
					try {
					Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					service.Withdraw(WithdrawAmount);
					System.out.println ("Withdraw is successfull!!!");
				}
				break;
				
			case 3:
				int balance = service.balance();
				System.out.println("Balance: " + balance);
				break;
				
			case 0:
				System.out.println("Bye!!!");
				System.exit(0);// shutdown jvm
				
				default:
					System.out.println("Invalid Option!");
					break;
			}
		} while (option != 0);
	}

}
