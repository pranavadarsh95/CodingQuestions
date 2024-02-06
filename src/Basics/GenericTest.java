package Basics;

import java.util.Iterator;

// T is a placeholder
class OurGenericList<T> implements Iterable<T>{

    private T[] items;
    private int size;

    public OurGenericList(){
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }

    public static void main(String[] args) {

    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T>{
        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}

public class GenericTest{
    public static void main(String[] args) {
        OurGenericList<Integer> ourList = new OurGenericList<>();

        ourList.add(1);
        ourList.add(2);
        ourList.add(3);

        Iterator<Integer> iterator = ourList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
