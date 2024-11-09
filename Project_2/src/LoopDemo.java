
public class LoopDemo {
	
	public static void printJavaVersions() {
		int i = 1;
		while(i <= 23)
		{
			System.out.println("java-"+i);
			i++;
			
		}
	}

	public static void printCapitalAlphabets() {
		int i = 65;
		while(i <= 90) {
			char c = (char)i;
			System.out.println(c+"");
			i++;
		
	}
		System.out.println();
	}
	public static void printSmallAlphabets() {
		int i = 97;
		while(i <= 122) {
			char c = (char)i;
			System.out.println(c+"");
			i++;
		
	}
		System.out.println();
	}
	public static void printMulTable(int num) {
		for(int i=1; i<=10; i++) {
			//10*1=10
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void InfiniteLoop() {
		for(;;) {
			System.out.println("java");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//printCapitalAlphabets();
		//printSmallAlphabets();
		printJavaVersions();
		//printMulTable(11);
		//InfiniteLoop();
	}
 
}
