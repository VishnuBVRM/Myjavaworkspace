class Phone{
	public void voiceCall() {
		System.out.println("Voice calling with phone");
	}
}
class SmartPhone extends Phone{
	public void videoCall() {
		System.out.println("Video Calling With Smart Phone");
	}
}
class Communication{
	//Overloaded methods
	public void call (Phone p) {
		p.voiceCall();
	}
	public void call(SmartPhone sm) {
		sm.videoCall();
	}
}
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		Phone p = new SmartPhone();
		Communication comm = new Communication();
		comm.call(p);
	}

}
