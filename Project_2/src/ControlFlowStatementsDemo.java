
public class ControlFlowStatementsDemo {

	public static boolean isEven(int num) {
		boolean status = false;
		
		if (num %2 == 0) {
			status = true;
		}
		
		return status;
		
	}
	
	public static void findEvenOrOdd(int num) {
		if (isEven(num))
		{
			System.out.println(num+ " is even");
		}else {
			System.out.println(num+ " is odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findEvenOrOdd(10);
		findEvenOrOdd(15);

	}

}
