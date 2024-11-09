
public class MultiLevelInheritanceDemo {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.call();
		iphone.sms();
		iphone.videoCall();
		iphone.browse();
		iphone.camera();
	}
}
