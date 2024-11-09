package pack1;

// Default Scope
public class Calc {
	static final double PI_VALUE = 3.14;
	
	// Accessible Anywhere Within Package (pack1) or Outside the Package (pack2)
	public static final double MAX_VALUE = 10;
	
	// Accessible Only Within Class is Calc
	private int length = 5;
	
	protected int size = 15;
	// Accessible Only Within Package is Pack1
	int findsquare(int num) {
		return num*num;
	}
	
	// Accessible Anywhere Within Package (pack1) or Outside the Package (pack2)
		public int findCube(int num) {
			return num*num*num;
		}
		
		// Accessible only within class (Calc)
		private int findTotal(int a, int b) {
			return a+b;
		}
		
		protected int doubleIt(int num) {
			return num+num;
		}
}
