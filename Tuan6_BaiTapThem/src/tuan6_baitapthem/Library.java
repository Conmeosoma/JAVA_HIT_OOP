package tuan6_baitapthem;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> ds = new ArrayList<>();

    public void addBook(Book book) {
        ds.add(book);
    }

    public void displayAllBooks(boolean showPublisher) {
        if (ds.isEmpty()) {
            System.out.println("Thu vien hien dang rong!");
            return;
        }
        for (Book sach : ds) {
            sach.displayInfo(showPublisher);
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book sach : ds) {
            if (sach.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                sach.displayInfo(true);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sach co tac gia: " + author);
        }
    }

    public void removeBookById(int bookId) {
        boolean removed = ds.removeIf(sach -> sach.getBookId() == bookId);
        if (removed) {
            System.out.println("Da xoa sach co ID = " + bookId);
        } else {
            System.out.println("Khong tim thay sach co ID = " + bookId);
        }
    }
}
