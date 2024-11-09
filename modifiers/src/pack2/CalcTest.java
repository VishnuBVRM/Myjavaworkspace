package pack2;

import pack1.Calc;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		//System.out.println(c.findsquare(10));
		//System.out.println();
		
		System.out.println(c.findCube(10));
		System.out.println(Calc.MAX_VALUE);
	}
}
