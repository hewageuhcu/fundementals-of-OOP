public class four{
    public static void main (String args[]){
        int x=17, y, z;
        y = x++;
        z = ++x;
        System.out.println("x="+x+" y= "+y);
        System.out.println("x="+x+" z= "+z);
        y = x--;
        z = --x;
        System.out.println("x="+x+" y= "+y);
        System.out.println("x="+x+" z= "+z);
    }
}
