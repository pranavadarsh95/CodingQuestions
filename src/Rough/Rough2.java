package Rough;

class RoughParent {
    public void fun() {
        System.out.println("This is from Parent class");
    }
}

class Rough2Child extends RoughParent {
    public void fun() {
        System.out.println("This is from child class");
        super.fun();
    }
}

public class Rough2 {
    public static void main(String[] args) {

        RoughParent rp = new Rough2Child();
        rp.fun();
    }
}


