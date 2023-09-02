import java.util.Scanner;
public class cal{
public static void main(String args[]){
    System.out.println("Please enter 2 numbers to do operations\n");
    Scanner scan1=new Scanner(System.in);
    int num1=scan1.nextInt();
    Scanner scan2=new Scanner(System.in);
    int num2=scan2.nextInt();
    System.out.println("Enter operand");
    Scanner scan3=new Scanner(System.in);
    char char1=scan3.next().charAt(0);

    switch (char1){
        case '+':
            int result1=num1+num2;
            System.out.println(result1);
            break;
        case '-':
            int result2=num1-num2;
            System.out.println(result2);
            break;
        case '*':
            int result3=num1*num2;
            System.out.println(result3);
            break;
        case '/':
            int result4=num1/num2;
            System.out.println(result4);
            break;
            default:
            System.out.println("invalid operation");
    }
}
}