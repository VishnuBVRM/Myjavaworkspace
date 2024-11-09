
public class InterfaceDemo {

	public static void main(String[] args) {
		//object creation or instantiation is not allowed
		//printer p1 = new Printer(
;

	EpsonPrinter ep = new EpsonPrinter();
			ep.printJob();
			ep.scanJob();
			ep.tShirtPrintJob();
			ep.CofeeCupPrintJob();
			
			System.out.println("-------------------");
	CanonPrinter cp = new CanonPrinter();
			cp.printJob();
			cp.scanJob();
			cp.tShirtPrintJob();
			cp.CofeeCupPrintJob();
			System.out.println("-------------------");


	HpPrinter hp = new HpPrinter();
			hp.printJob();
			hp.scanJob();
			hp.tShirtPrintJob();
			hp.CofeeCupPrintJob();
			System.out.println("-------------------");

			
	//static methods
	Printer.threeDPrintJob();

}
}
