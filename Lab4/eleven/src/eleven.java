public class eleven{
    public static void main (String args[]){
        int x=8;
        int y=10;
        x = ( y > 3 ) ? ( x < y ) ? y : x + 10 : ( y < 0 ) ? -y : y + 10;
        System.out.println(x);
    }
}