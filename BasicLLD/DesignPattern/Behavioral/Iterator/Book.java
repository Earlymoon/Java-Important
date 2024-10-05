package BasicLLD.DesignPattern.Behavioral.Iterator;

public class Book {
    private String name;
    private int bookPrice;

    public Book(String name, int bookPrice) {
        this.name = name;
        this.bookPrice = bookPrice;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
}
