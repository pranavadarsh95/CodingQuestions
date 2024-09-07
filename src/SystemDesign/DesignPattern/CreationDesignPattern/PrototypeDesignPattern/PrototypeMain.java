package SystemDesign.DesignPattern.PrototypeDesignPattern;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Below example is of Shallow copying
       /* BookStore bs1 = new BookStore();
        bs1.setShopName("Aggarwal books");
        bs1.loadBooks();

        BookStore bs2 = (BookStore) bs1.clone();

        bs1.getBooks().remove(2);
        System.out.println(bs1);
        System.out.println(bs2); // both objects gets affected*/

        // Below example is of deep copying
        BookStore bs1 = new BookStore();
        bs1.setShopName("Aggarwal books");
        bs1.loadBooks();

        BookStore bs2 = (BookStore) bs1.clone();

        bs1.getBooks().remove(2);
//        bs1.setShopName("default");
        System.out.println(bs1);
        System.out.println(bs2);
    }
}
