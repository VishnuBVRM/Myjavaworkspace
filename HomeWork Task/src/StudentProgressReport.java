import java.util.Scanner;

	public class StudentProgressReport {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] marks = new int[6];
	        int totalMarks = 0;
	        int highestMarks = Integer.MIN_VALUE;
	        int lowestMarks = Integer.MAX_VALUE;

	        System.out.println("Enter marks for 6 subjects:");

	        for (int i = 0; i < 6; i++) {
	            switch (i) {
	                case 0:
	                    System.out.print("Telugu: ");
	                    break;
	                case 1:
	                    System.out.print("Hindi: ");
	                    break;
	                case 2:
	                    System.out.print("Engish: ");
	                    break;
	                case 3:
	                    System.out.print("Math: ");
	                    break;
	                case 4:
	                    System.out.print("Science: ");
	                    break;
	                case 5:
	                    System.out.print("Social: ");
	                    break;
	            }

	            marks[i] = scanner.nextInt();

	            totalMarks += marks[i];

	            if (marks[i] > highestMarks) {
	                highestMarks = marks[i];
	            }
	            if (marks[i] < lowestMarks) {
	                lowestMarks = marks[i];
	            }
	        }

	        double averageMarks = (double) totalMarks / 6;

	        System.out.println("\nStudent Progress Report:");
	        System.out.println("------------------------");
	        System.out.println("Subject\tMarks");
	        System.out.println("------------------------");

	        for (int i = 0; i < 6; i++) {
	            switch (i) {
	                case 0:
	                    System.out.println("Telugu\t: " + marks[i]);
	                    break;
	                case 1:
	                    System.out.println("Hindi\t: " + marks[i]);
	                    break;
	                case 2:
	                    System.out.println("Engilsh\t: " + marks[i]);
	                    break;
	                case 3:
	                    System.out.println("Math\t: " + marks[i]);
	                    break;
	                case 4:
	                    System.out.println("Science\t: " + marks[i]);
	                    break;
	                case 5:
	                    System.out.println("Social\t: " + marks[i]);
	                    break;
	            }
	        }

	        System.out.println("------------------------");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Marks: " + averageMarks);
	        System.out.println("Highest Marks: " + highestMarks);
	        System.out.println("Lowest Marks: " + lowestMarks);
	    }
	}