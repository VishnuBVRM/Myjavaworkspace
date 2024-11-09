//tightly encapsulated class
public class Student {
	private int studentId;
	private String studentName;
	private String studentEmial;
	private long studentMobile;
	
	public Student() {
		super();
	}
	public Student(int studentId, String studentName, String studentEmial, long studentMobile) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmial = studentEmial;
		this.studentMobile = studentMobile;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmial() {
		return studentEmial;
	}
	public void setStudentEmial(String studentEmial) {
		this.studentEmial = studentEmial;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	//setter and getter methods
	
	


}