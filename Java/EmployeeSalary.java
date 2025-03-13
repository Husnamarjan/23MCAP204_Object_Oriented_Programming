import java.util.Scanner;

public class EmployeeSalary {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store base salary and bonus
        double baseSalary = 0, bonusPercentage = 0;

        // Input: Job role
        System.out.println("Enter job role (1-Manager, 2-Developer, 3-Intern): ");
        int jobRole = scanner.nextInt();

        // Switch statement to determine base salary based on job role
        switch (jobRole) {
            case 1: // Manager
                baseSalary = 70000;
                break;
            case 2: // Developer
                baseSalary = 50000;
                break;
            case 3: // Intern
                baseSalary = 30000;
                break;
            default:
                System.out.println("Invalid job role! Exiting program.");
                return;
        }

        // Input: Years of experience
        System.out.println("Enter years of experience: ");
        int experience = scanner.nextInt();

        // If-else to determine bonus percentage based on experience
        if (experience >= 0 && experience <= 2) {
            bonusPercentage = 0;
        } else if (experience >= 3 && experience <= 5) {
            bonusPercentage = 10;
        } else if (experience > 5) {
            bonusPercentage = 20;
        } else {
            System.out.println("Invalid experience input! Exiting program.");
            return;
        }

        // Calculate final salary
        double bonus = (baseSalary * bonusPercentage) / 100;
        double finalSalary = baseSalary + bonus;

        // Display final salary
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Final Salary: $" + finalSalary);

        scanner.close();
    }
}
