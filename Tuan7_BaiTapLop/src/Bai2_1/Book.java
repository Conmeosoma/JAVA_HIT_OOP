// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai2_1;

public class Book {

    private String tiltle;
    private String author;

    public Book(String tiltle, String author) {
        this.tiltle = tiltle;
        this.author = author;
    }

    public String getTiltle() {
        return tiltle;
    }

    public void setTiltle(String tiltle) {
        this.tiltle = tiltle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void out() {
        System.out.println("Tiltle " + tiltle);
        System.out.println("author" + author);
    }

}
