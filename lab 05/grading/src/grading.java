import java.util.Scanner;
public class grading{
    public static void main(String[] args) {
        System.out.println("Enter your character");
        Scanner scan =new Scanner(System.in);
        char letter=scan.next().charAt(0);
        switch (letter){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Well Done");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You pass");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}