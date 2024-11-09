public class EncapsulationDemo {
	public static void main(String[]args) {
		Student s1 = new Student(4111, "Vishnu", "vishnugmail.com", 889933444555L);
		//s1.setStudentEmial("krish@gamil.com");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentEmial());
		System.out.println(s1.getStudentMobile());
		
		System.out.println("---------");
		
		Student s2= new Student();
		s2.setStudentId(401);
		s2.setStudentName("psycho");
		s2.setStudentEmial("psycho@gmail.com");
		s2.setStudentMobile(823445665644L);
		System.out.println(s2.getStudentId());
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentEmial());
		System.out.println(s2.getStudentMobile());

		
		
		
	}

}