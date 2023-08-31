import java.util.Scanner;
public class ten{
    public static void main (String args[]){
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter sum of money");
        int money = sum.nextInt();
        int a=money/1000;
        int b=(money-a*1000)/500;
        int c=(money-a*1000-b*500)/200;
        int d=(money-a*1000-b*500-c*200)/100;
        int e=(money-a*1000-b*500-c*200-d*100)/50;
        int f=(money-a*1000-b*500-c*200-d*100-e*50)/20;
        int g=(money-a*1000-b*500-c*200-d*100-e*50-f*20)/10;
        int h=(money-a*1000-b*500-c*200-d*100-e*50-f*20-g*10)/5;
        int i=(money-a*1000-b*500-c*200-d*100-e*50-f*20-g*10-h*5)/2;
        int j=(money-a*1000-b*500-c*200-d*100-e*50-f*20-g*10-h*5-i*2);
        System.out.println("Your exchange is ");
        System.out.println("1000 notes :"+(a)+"  500 notes :"+(b)+"  200 notes :"+(c)+"  100 notes :"+(d)+"  50 notes :"+(e)+ "  20 notes :"+(f)+"  10 notes :"+(g)+"  5 coins :"+(h)+"  2 coins :"+(i)+"  1 coins :"+(j));
    }
}