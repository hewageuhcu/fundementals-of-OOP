import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        char letter;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        letter = scanner.next().charAt(0);

        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
            if (letter >= 'a' && letter <= 'z') {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("The character is not an alphabet");
        }

        scanner.close();
    }
}
