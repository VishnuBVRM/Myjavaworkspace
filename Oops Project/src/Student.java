
public class Student {
	// Instance Variable
		int studentId;
		String studentName;
		double studentMarkes;
		
		// Static Variable
		static String studentBatchCode = "2024-2025";
		
		// Constructor 
		public Student(int studentId, String studentName, double studentMarkes ) {
			System.out.println("Constructor...");
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentMarkes = studentMarkes;
			
		}
		
		// Instance Method
		public void studentResult() {
			if(studentMarkes > 40) {
				System.out.println("Student Result: pass");
			}else {
				System.out.println("Student Result: Fail");
			}
		}
		
		// Instance Method
		public void displayStudentDetails() {
		
		System.out.println("STUDENT BATCH CODE:"+studentBatchCode);
		System.out.println("STUDENT ID: "+studentId);
		System.out.println("STUDENT NAME: "+studentName);
		System.out.println("STUDENT MARKES: "+studentMarkes);

	}

}
