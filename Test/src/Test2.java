class Test2 {

	public static void main(String[] args) {
		int X=0;
		System.out.println(X);
		try {
		System.out.println(10/0);	
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide a number by 0");
		}
		System.out.println("hello");
	}

}
