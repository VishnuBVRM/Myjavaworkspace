package multi_threading;

//1. Using thread class
class RedThread extends Thread{
	
	@Override
	public void run() {
		for(int i= 1; i<= 4; i++) {
			System.out.println("Red");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//2. using Runnable interface
class YellowThread implements Runnable {
	@Override
	public void run() {
		for(int i= 1; i<= 4; i++) {
			System.out.println("Yellow");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class BlueThread extends Thread{
	@Override
	public void run() {
		for(int i= 1; i<= 4; i++) {
			System.out.println("Blue");
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		while(true) {
		RedThread r = new RedThread();
		r.start();
		r.join();
		
		YellowThread y = new YellowThread();
		Thread t = new Thread(y);
		t.start();
		t.join();
		
		BlueThread b = new BlueThread();
		b.start();
		b.join();
		
		}
    }
}
