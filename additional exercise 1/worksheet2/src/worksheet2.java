class book{
    String title;
    String genre;
    double rating;
    void read(){
        System.out.println("this is a must read book.");

    }

}
public class worksheet2{
    public static void main (String args[]) {
        book one = new book();
        one.title = "the notebook";
        one.genre = "adventure";
        one.rating = 4.5;

        book two = new book();
        two.title = "our class is a family";
        two.genre = "child";
        two.rating = 4.0;
        two.read();
    }

    }
