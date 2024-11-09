package singleton;

public class PrinterUtils {
	private static PrinterUtils instance;
	
	private PrinterUtils() {}
	
	public static PrinterUtils getInstance() {
		if (instance == null) {
			instance = new PrinterUtils();
		}
		return instance;
	}
	public void printJob() {
		System.out.println("Print...");
	}
}
