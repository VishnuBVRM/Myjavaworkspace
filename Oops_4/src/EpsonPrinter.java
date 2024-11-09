public class EpsonPrinter implements Printer{

	@Override
	public void printJob() {
		System.out.println("print job using EpsonScanner");
		
		
	}
	@Override
	public void scanJob() {
		System.out.println("print job using EpsonPrinter");
		
		
	}
	public void tShirtPrintJob() {
		System.out.println("T-Shirt Printing job overriden");
		
		
	}
	public void CofeeCupPrintJob() {
		System.out.println("Cofee Cup Printing job overriden");
		
		
	}
}