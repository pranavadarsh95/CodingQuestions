package SystemDesign.DesignPattern.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable{

    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks() {

        for(int i=0; i<5; i++){
            Book book = new Book();
            book.setBookId(i);
            book.setBookName("book_"+(i));
            books.add(book); // or getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone(); // used for shallow copying
        BookStore shop = new BookStore();
        for(Book book : this.getBooks())
        {
            shop.books.add(book);
        }
//        shop.books = getBooks(); // if we will do like this it means again reference pointer
        // of last object would be pointed from new created object so, change in old object would be reflected to new as well
        shop.shopName = shopName;

        return shop;
    }
}
