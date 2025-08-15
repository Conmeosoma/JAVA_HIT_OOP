package tuan6_baitapthem;

public class Book {

    private static int nextId = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = nextId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {
        this(title, author, price, new Publisher("Unknown", "Unknown"));
    }

    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void displayInfo() {
        System.out.println("Book Id: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void displayInfo(boolean showPublisher) {
        displayInfo();
        if (showPublisher) {
            System.out.println("Publisher Name: " + publisher.getName());
            System.out.println("Publisher Address: " + publisher.getAddress());
        } else {
            System.out.println("Publisher: Unknown");
        }
        System.out.println("----------------------");
    }
}
