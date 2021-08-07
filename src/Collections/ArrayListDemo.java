package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

   static void print(ArrayList<Integer> arrayList){

       System.out.println("Elements printed using Without Iterator:- ");

        for(int a:arrayList){
            System.out.print(a+" ");
        }

        System.out.println();

//        for(int i=0;i<arrayList.size();i++){
//            System.out.print(arrayList.get(i)+" ");
//        }
//       System.out.println();
    }

    static void printUsingIterator(ArrayList<Integer> arrayList){
        Iterator<Integer> iterator = arrayList.iterator();

        System.out.println("Elements printed using Iterator:- ");

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       //ADD
        ArrayList<Integer> arrayList1 = new ArrayList<>(5);
        arrayList1.add(34); arrayList1.add(4); arrayList1.add(7); arrayList1.add(94); arrayList1.add(31);
//        print(arrayList1);
        printUsingIterator(arrayList1);
//        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5}));
//        print(arrayList2);
//        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(11,12,13,14,15));
//        print(arrayList3);

        //SET
//        arrayList1.set(2,78);
//        print(arrayList1);

        //ADD At SPECIFIC POSITION
//        arrayList1.add(3,53);
//        print(arrayList1);

        //Remove
//        arrayList1.remove(Integer.valueOf(94));
//        print(arrayList1);

//        arrayList1.remove(2);
//        print(arrayList1);

//        int element = 48;
//
//        if(arrayList1.contains(element)){
//            System.out.println("Element "+element+" "+"found");
//        } else {
//            System.out.println("Element "+element+" "+"Not Fund");
//        }

//        arrayList1.clear();
//
//        System.out.println("Size of Arraylist "+arrayList1.size());

    }
}
