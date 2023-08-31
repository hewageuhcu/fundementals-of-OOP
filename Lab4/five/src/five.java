import java.util.Scanner;
public class five{
    public static void main (String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("enter number");
        int num = a.nextInt();
        System.out.println("num>>2="+(num>>2));
        System.out.println("num<<1="+(num<<1));
    }
}