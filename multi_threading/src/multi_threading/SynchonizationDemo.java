package multi_threading;

//Synchronized method
//Only one thread is allowed to access
//Thread requires object level lock
class MyMath{
	public synchronized void printMulTable(int num) {
		for(int i =1; i<=10; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

//static synchronized method
// Require class level lock
public static synchronized void printSquare(int num) {
	for(int i = 1; i<=num; i++) {
		System.out.println(i*i);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}

class NTR extends Thread{
	MyMath m;
	
	public NTR(MyMath m) {
		this.m = m;
	}
	@Override
	public void run() {
		m.printMulTable(10);
	}
}
class Ram extends Thread{
	MyMath m;
	
	public Ram(MyMath m) {
		this.m= m;
	}
	@Override
	public void run() {
		m.printMulTable(11);
	}
}
class Arjun extends Thread{
	MyMath m;
	
	public Arjun(MyMath m) {
		this.m = m;
	}
	@Override
	public void run() {
		m.printSquare(12);
	}
}

// Instance method
public class SynchonizationDemo {
	
	public static void main(String[] args) {
		MyMath m = new MyMath ();
		
		NTR ntr = new NTR(m);
		Ram ram = new Ram(m);
		Arjun arjun = new Arjun(m);
		
		ntr.start();
		ram.start();
		arjun.start();
	}
}

