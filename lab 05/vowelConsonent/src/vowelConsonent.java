import java.util.Scanner;
public class vowelConsonent{
    public static void main(String[] args) {
        System.out.println("enter character");
        Scanner scan=new Scanner(System.in);
       char letter= scan.next().charAt(0);
       switch (letter){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'A':
           case 'E':
           case 'I':
           case 'O':
           case 'U':
               System.out.println("this is a vowel");
               break;
               default:
               System.out.println("this is a consonent");
        }
    }
}