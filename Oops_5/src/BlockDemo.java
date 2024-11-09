
public class BlockDemo {
	static int x;
	static {
		x=10;
		System.out.println("static block");
	}
	{
		System.out.println("Instance Block");
	}
	public BlockDemo() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main()");
		System.out.println(x);
		
		new BlockDemo();
		new BlockDemo();
		
	}
}
