import java.util.Scanner;
public class tCode{
    public static void main(String[] args) {
        System.out.println("enter telephone code\n");
        Scanner scan=new Scanner(System.in);
        int code=scan.nextInt();
        switch (code){
            case 11:
                System.out.println("Delhi");
                break;
            case 22:
                System.out.println("Mumbai");
                break;
            case 33:
                System.out.println("Kolkata");
                break;
            case 40:
                System.out.println("Chennai");
                break;
            default:
                System.out.println("area code is not recognized");
        }
    }
}