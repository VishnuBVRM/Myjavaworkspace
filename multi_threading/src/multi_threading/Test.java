package multi_threading;

//1. Using thread class
class JavaThread extends Thread{
	
	@Override
	public void run() {
		for(int i= 1; i<= 10; i++) {
			System.out.println("Java");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//2. using Runnable interface
class PythonThread implements Runnable {
	@Override
	public void run() {
		for(int i= 1; i<= 10; i++) {
			System.out.println("Python");
		}
		
	}
}

class AngularThread extends Thread{
	@Override
	public void run() {
		for(int i= 1; i<= 10; i++) {
			System.out.println("Angular");
		}
	}
}
public class Test {
	public static void main(String[] args) throws InterruptedException {
		JavaThread j = new JavaThread();
		//to begin user-defined thread.
		j.start();
		j.join();
		
		//j.start;//java.lang.IllegalThreadStateException
		
		//new thread won't be created. exception like a normal method.
		//j.run();
		
		PythonThread p = new PythonThread();
		//p.start(); // compilation error
		Thread t = new Thread(p);
		t.start();
		t.join();
		
		AngularThread a = new AngularThread();
		a.start();
		
		//main thread
		/*for(int i=1; i<=10; i++) {
			System.out.println("main");	
		}*/
    }
}
