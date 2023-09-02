import java.util.Scanner;
public class bookClub{
    public static void main(String[] args) {
        System.out.println("do you have membership? if yes, enter 1 or else enter 0");
        Scanner scan=new Scanner(System.in);
            int num=scan.nextInt();
        System.out.println("enter your bill");
        Scanner scanbill=new Scanner(System.in);
        int bill=scanbill.nextInt();
            if(num==1){
                if(bill>5000){
                    double discount1=15/100;
                    double totalPay1=(double)bill*85/100;
                    System.out.println("your payment is"+totalPay1);
                }
                else{
                    double discount2=10/100;
                    double totalPay2=(double)bill*90/100;
                    System.out.println("your payment is"+totalPay2);
                }
            }
            if(num==0){
                if(bill>5000){
                    double discount3=7/100;
                    double totalPay3=(double)bill*93/100;
                    System.out.println("your payment is"+totalPay3);
                }
                else{
                    System.out.println("sorry, you don't have a discount");
                }
            }

    }
}