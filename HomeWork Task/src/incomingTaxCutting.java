import java.util.Scanner;

public class incomingTaxCutting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for income
        System.out.print("Enter your Salary income: ");
        double incomeTax = scanner.nextDouble();

        // Calculate tax based on tax slabs
        double taxCutting = 0;
        if (incomeTax <= 300000) {
            taxCutting = 0;
        } else if (incomeTax <= 700000) {
            taxCutting = (incomeTax - 300000) * 0.05;
        } else if (incomeTax <= 1000000) {
            taxCutting = 20000 + (incomeTax - 700000) * 0.1;
        } else if (incomeTax <= 1200000) {
            taxCutting = 50000 + (incomeTax - 1000000) * 0.15;
        } else if (incomeTax <= 1500000) {
            taxCutting = 70000 + (incomeTax - 1200000) * 0.2;
        } else {
            taxCutting = 100000 + (incomeTax - 1500000) * 0.3;
        }

        // Display the calculated tax cutting
        System.out.println("Your total tax cutting is: " + taxCutting);

        scanner.close();
    }
}