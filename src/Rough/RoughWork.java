package Rough;

 abstract class Writer {
    public abstract void writer();
}

class Pen extends Writer {
    public void writer() {
        System.out.println("Pen class");
    }
}

class Pencil extends Writer {
    public void writer() {
        System.out.println("Pencil class");
    }
}

class Kit  {
    public void doSomething(Writer p) {
        System.out.println("doSomething class");
        p.writer();
    }
}

public class RoughWork {
    public static void main(String[] args) {
       Kit k = new Kit();
        Writer pen = new Pen();
        Writer pencil = new Pencil();
        k.doSomething(pen);
        k.doSomething(pencil);

    }
}
