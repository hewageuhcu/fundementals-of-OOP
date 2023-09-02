import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int grade;
        System.out.print("Enter the basic salary: ");
        int bSalary = scanner.nextInt();

        System.out.print("Enter the grade (please enter ascii values of uppercase letters only) : ");
        int grade1 = scanner.nextInt();

        double hra = 0.20 * bSalary;
        double da = 0.50 * bSalary;
        double allow;

        switch (grade1) {
            case 'A':
                allow = 1700;
                break;
            case 'B':
                allow = 1500;
                break;
            default:
                allow = 1300;
        }

        double pf = 0.11 * bSalary;

        double tSalary = bSalary + hra + da + allow - pf;
        long roundedTSalary = Math.round(tSalary);

        System.out.println("Total Salary: " + roundedTSalary);


    }
}
