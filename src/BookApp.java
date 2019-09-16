import java.util.Scanner;

public class BookApp {
    public static void main(String []args) {
        // public Book(String title, String author, String description, double price, boolean isInStock) {
        //
        Book one = new Book("Got This", "John Doe", "Yellow Book", 3.02, true);
        //one.getDisplayText();
        System.out.println("");
        System.out.println(one.getDisplayText());

        Book two = new Book();
        two.setAuthor("Sue");
        two.setDescription("testing");
        two.setInStock(false);
        two.setPrice(5.00);
        two.setTitle("Yeah!");
        System.out.println(two.getDisplayText());
        System.out.println("Price of book, two, is " + two.getPrice());
/*

Five books at $20.00 should return $100, if they are in stock.
If they are not in stock, that should be handled appropriately (hint - you decide).
 */
        System.out.println("Enter a number of books");
        Scanner sc = new Scanner(System.in);
        int noBooks = sc.nextInt();
        sc.nextLine();

        double total = one.displayCost(noBooks);
        System.out.println("Total is " + total);

        System.out.println("Enter a number of book Two");
        noBooks = sc.nextInt();
        sc.nextLine();
        total = two.displayCost(noBooks);
        System.out.println("Total is " + total);

    }
}
