class Parent{
	public void study() {
		System.out.println("Medicine");
	}
	public void property() {
		System.out.println("100Acre land + 100kg gold + 100cr cash");
	}
	public void marry(){
		System.out.println("Arranged marriage");
	}
}

class Child extends Parent{
	@ Override
	public void marry(){
		super.marry(); //calling Parent class
		System.out.println("Love marriage");
	}
	public void study() {
		System.out.println("Acting");
	}

}
public class OveridingDemo {
	public static void main(String[] args) {
		Parent p = new Parent ();
		p.study();
		p.property();
		p.marry();
		System.out.println("-----------------------------");
		Child c = new Child ();
		c.study();
		c.property();
		c.marry();
	}
}
