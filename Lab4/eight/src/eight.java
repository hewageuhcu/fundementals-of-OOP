import java.util.Scanner;
public class eight{
    public static void main (String args[]){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your input");
        int year = num.nextInt();
        if(year==0||year==1) {
            String result = (year == 0) ? "29 Days" : "28 Days";
            System.out.println(result);
        }
    }
}