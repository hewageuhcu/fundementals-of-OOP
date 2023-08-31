import java.util.Scanner;
public class three{
    public static void main (String args[]){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number of days");
        int i = num.nextInt();
        int year=i/365;
        int month=(i-year*365)/30;
        int day=i-year*365-month*30;
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}