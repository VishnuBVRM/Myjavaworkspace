
public class InheritanceDemo {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.call();
		m.sms();
		
		System.out.println("- - - - - - - - - - - -");
		
		SmartMobile sm = new SmartMobile();
		sm.call();
		sm.sms();
		sm.videoCall();
		sm.browse();
		
		

	}

}
