
public class Employee {
	
	public static void main(String[] args) {
	 // Using Literal Syntax
     String s1 = "Employee";

     // Using new operator
     String s2 = new String ("New Employee");

     String s3 = "Employee";

     System.out.println(s1);
     System.out.println(s2);

     System.out.println(s1==s3);
     System.out.println(s2==s3);

     System.out.println(s1.equals(s3));
     System.out.println(s2.equals(s3));
     
     }
 }