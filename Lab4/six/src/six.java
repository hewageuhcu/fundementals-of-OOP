import java.util.Scanner;
public class six{
    public static void main (String args[]){
        Scanner i = new Scanner(System.in);
        System.out.println("Enter number");
        int num = i.nextInt();
        String result = (num%2==0)?"even":"odd";
        System.out.println(result);
    }
}