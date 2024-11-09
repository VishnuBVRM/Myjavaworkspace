package multi_threading;

class BahubaliThread extends Thread{
	int total = 0;
	@Override
	public void run() {
		System.out.println("2. Bahubali thread begins calculation... ");
		for(int i= 1; i<=100; i++) {
			total +=i;
		}
		System.out.println("3. BahubaliThread begin notification... ");
		synchronized(this) {
			//this.notify();
			this.notifyAll();
		}
		//connecting network of database connection
	}
}
public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		BahubaliThread b = new BahubaliThread();
		b.start();
		
		//main thread
		Thread.sleep(10000);
		//b.join();
		System.out.println("1. main thread calling wait()");
		synchronized(b) {
			//b.wait();
			//b.wait(10000);
			b.wait(10000, 500);
		}
		System.out.println("4. main thread gets notification... ");
		System.out.println(b.total);
	}
}
