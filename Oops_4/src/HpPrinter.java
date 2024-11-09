
public class HpPrinter implements Printer{

	@Override
	public void printJob() {
		System.out.println("print job using HpPrinter");
				
	}
	@Override
	public void scanJob() {
		System.out.println("print job using HpPrinter");
				
	}
	public void tShirtPrintJob() {
		System.out.println("T-Shirt Printing job overriden");
		
		
	}
	public void CofeeCupPrintJob() {
		System.out.println("Cofee Cup Printing job overriden");
		
		
	}
}
