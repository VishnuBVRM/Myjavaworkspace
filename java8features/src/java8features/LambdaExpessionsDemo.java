package java8features;

@FunctionalInterface
interface MyFunctionalInterface1{

	void wish();
}

class Hello implements MyFunctionalInterface1{
	
	@Override
	public void wish() {
		System.out.println("Hello...everybody!");
		
	}	
}

@FunctionalInterface
interface MyFunctionalInterface2{
	int findSquare(int num);
}
@FunctionalInterface
interface MyFunctionalInterface3{
	int findTotal(int num1, int num2);
}

@FunctionalInterface
interface MyFunctionalInterface4{
	Boolean isEven(int num);
}

public class LambdaExpessionsDemo {
	public static void main(String[] args) {
		MyFunctionalInterface4 myfun4 = (num) -> num%2 ==0;
		System.out.println(myfun4.isEven(10));
		
		MyFunctionalInterface3 myfun3 = (x,y) -> x+y;
		System.out.println(myfun3.findTotal(10, 20));
		
		MyFunctionalInterface2 myfun2 = (num) -> num*num;
		int square = myfun2.findSquare(10);
		System.out.println(square);
		
		MyFunctionalInterface1 myfun1 = new Hello();
		myfun1.wish();
		
		MyFunctionalInterface1 myfun = () -> System.out.println("Hai...");
		myfun.wish();
	}
}
