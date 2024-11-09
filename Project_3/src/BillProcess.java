
public class BillProcess {

	public static void displayFinalBill(int totalBillAmount) {
		DiscountCalc calc = new DiscountCalc();
		double discount = calc.findDiscount(totalBillAmount);
		
		System.out.println("Bill Amount: " + totalBillAmount);
		System.out.println("Discount: " + discount);
		System.out.println("Final Bill Amount: " + (totalBillAmount - discount));

	}

}
