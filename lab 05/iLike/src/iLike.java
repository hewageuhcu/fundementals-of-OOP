import java.util.Scanner;
public class iLike{
    public static void main(String[] args) {
        System.out.println("enter value of a");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
       if(a==20) {
           System.out.println("I like Ice Cream");
       }
            else if(a==30) {
           System.out.println("I like Chocolate");
       }
           else if(a==60) {
           System.out.println("I like apple");
       }
            else {
           System.out.println("I do not like anything");
       }
        }

    }
