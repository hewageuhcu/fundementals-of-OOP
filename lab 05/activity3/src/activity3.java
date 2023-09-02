import java.util.Scanner;
public class activity3{
public static void main(String args[]){

Scanner scan=new Scanner(System.in);
    System.out.println("enter first number");
    int a=scan.nextInt();
    System.out.println("enter second number");
    int b=scan.nextInt();
    System.out.println("enter thrid number");
    int c=scan.nextInt();
    int largest=a;
    if(b>largest){
        System.out.println(b+"is the largest");
    }
    if(c>largest){
        System.out.println(c+"is the largest");
    }
}
}
