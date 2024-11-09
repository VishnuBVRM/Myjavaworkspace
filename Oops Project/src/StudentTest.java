
public class StudentTest {

	public static void main(String[] args) {
		// Object Creation or Object Instantiation
		Student s1 = new Student(290407, "Vishnu", 89.0 );
		s1.displayStudentDetails();
		s1.studentResult();
		
		System.out.println("- - - - - - - - - - - -");
		
		Student s2 = new Student(290704, "Devi", 98.0);
		s2.displayStudentDetails();
		s2.studentResult();
		
		System.out.println("- - - - - - - - - - - -");

		Student s3 = new Student(2904, "Potti", 36.0);
		s3.displayStudentDetails();
		s3.studentResult();
		
		System.out.println("- - - - - - - - - - - -");

		Student s4 = new Student(2907, "pysco", 35.0);
		s4.displayStudentDetails();
		s4.studentResult();

	}

}
