
public interface Printer {
	//public static final String VERSION_NO = "v1.0.0";
	String VERSION_NO = "v1.0.0";
	//public abstract void printJob();
	void printJob();
	void scanJob();
	
	default void tShirtPrintJob() {
		System.out.println("T-Shirt Printing");
	}
	default void CofeeCupPrintJob() {
		System.out.println("Cofee-Cup");
	}
	
	static void threeDPrintJob() {
		System.out.println("3D Printing Job");
	}
	

}
