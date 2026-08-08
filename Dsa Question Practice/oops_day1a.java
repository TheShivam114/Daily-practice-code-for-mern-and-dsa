/*Problem: Book Information System
You are given the task to design a simple system to store and display information about a book.

Requirements:
Create a class Book with the following attributes:
String title
String author
int price
The class must contain:
A parameterized constructor to initialize all three attributes.
A method printDetails() that prints the book information in the format:

Title: <title>
Author: <author>
Price: <price>

Input Format (for competitive style):

First line: title

Second line: author

Third line: price

Output Format:

Print the details using the printDetails() method.
 */
import java.util.*;
public class oops_day1a {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter title");
        String title = sc.nextLine();
        System.out.println("enter author");
        String author = sc.nextLine();
        System.out.println("enter price");
        int price = sc.nextInt();

        Book b = new Book(title, author, price);
        b.printDetails();
    }
}
class Book {
    String title;
    String author;
    int price;
    // Parameterized constructor
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

