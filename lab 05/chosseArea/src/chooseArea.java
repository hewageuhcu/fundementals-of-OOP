import java.util.Scanner;
public class chooseArea{
    public static void main(String[] args) {
        System.out.println("enter your choise (1,2 or 3)");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num==1){
            System.out.println("circle\n");
            System.out.println("enter radius");
                    Scanner scan1=new Scanner(System.in);
            int scanR=scan1.nextInt();
double areaOfCircle=Math.PI*scanR*scanR;
            System.out.println("area of your circle is"+" "+areaOfCircle);
        }
        if(num==2){
            System.out.println("rectangle\n");
            System.out.println("enter width");
            Scanner scan2=new Scanner(System.in);
            int scanw=scan2.nextInt();
            System.out.println("enter high");
            Scanner scan3=new Scanner(System.in);
            int scanh=scan3.nextInt();
            int areaOfRectangle=scanh*scanw;
            System.out.println("area of your rectangle is"+" "+areaOfRectangle);
        }
        if(num==3){
            System.out.println("trangle\n");
            System.out.println("enter length");
            Scanner scan4=new Scanner(System.in);
            int scanl=scan4.nextInt();
            System.out.println("enter hight");
            Scanner scan5=new Scanner(System.in);
            int scanhi=scan5.nextInt();
            double areaOfTrangle=(scanl*scanhi)/2;
            System.out.println("area of your trangle is"+" "+areaOfTrangle);
        }
        else{
            System.out.println("please enter a valid number");
        }
    }
}