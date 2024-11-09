package exception_handling;

class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		super();
	}
	public InvalidAgeException(String message) {
		super(message);
	}
}
//check Exception
class InvalidIncomeException extends Exception {
	public static final long serialVersionUID = 1L;
	
	public InvalidIncomeException() {
		super();
	}
	public InvalidIncomeException(String message) {
		super(message);
	}
}

public class CustomizedExceptionDemo {
	public static void checkVoterAge(int age) {
		if(age >= 18) {
			System.out.println("Congrats! You are Eligible to Vote");
		}else {
			throw new InvalidAgeException ("Not Eligible to Vote");
		}
	}
	public static void checkIncome(int income) throws InvalidIncomeException {
		if(income <= 800000) {
			System.out.println("Eligible for Admission");
		}else {
			throw new InvalidIncomeException("Not Eligible for Admission");
		}
	}
	public static void main(String[] args)throws InvalidIncomeException {
		try {
			checkVoterAge(17);
		}catch (InvalidAgeException e){
			System.out.println(e);
		}
		try {
			checkIncome(900000);
		}catch (InvalidIncomeException e) {
			System.out.println(e);
		}
		checkIncome(500000);
	}
}
