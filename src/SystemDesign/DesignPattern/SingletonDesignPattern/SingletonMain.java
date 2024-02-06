package SystemDesign.DesignPattern.SingletonDesignPattern;

// https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/

public class SingletonMain {
    public static void main(String[] args) {
//        AnyClass anyClass = new AnyClass(); // we can't create object of AnyClass because it is private access Modifier
        AnyClass obj1 = AnyClass.getInstance();
        AnyClass obj2 = AnyClass.getInstance();

        System.out.println(obj1+" "+obj2); // Both have same object
    }
}
