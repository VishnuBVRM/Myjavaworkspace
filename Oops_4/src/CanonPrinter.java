public class CanonPrinter implements Printer {

	@Override
	public void printJob() {
		System.out.println("print job using CanonPrinter");
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void scanJob() {
		System.out.println("print job using CanonPrinter");

}
	public void tShirtPrintJob() {
		System.out.println("T-Shirt Printing job overriden");
		
		
	}
	public void CofeeCupPrintJob() {
		System.out.println("Cofee Cup Printing job overriden");
		
		
	}

}