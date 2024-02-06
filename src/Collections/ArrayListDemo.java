package Collections;

import java.util.*;

// Note:- storing set into list
// List<?> list = new ArrayList<>(set);
public class  ArrayListDemo {

    static void print(ArrayList<Integer> arrayList) {

        System.out.println("Elements printed using Without Iterator:- ");

        for (int a : arrayList) {
            System.out.print(a + " ");
        }

        System.out.println();

//        for(int i=0;i<arrayList.size();i++){
//            System.out.print(arrayList.get(i)+" ");
//        }
//       System.out.println();
    }

    static void printUsingIterator(ArrayList<Integer> arrayList) {
        Iterator<Integer> iterator = arrayList.iterator();
//        ListIterator<Integer> iterator1 = arrayList.listIterator();

        System.out.println("Elements printed using Iterator:- ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //using ListIterator
     /*   while(iterator1.hasNext()){
            System.out.println("Next element "+iterator1.next());
            if(iterator1.hasPrevious())
                System.out.println("Previous element "+iterator1.previous());
        }*/
    }

    public static void main(String[] args) {
        //ADD y default ity holds 16 element and when it reaches at 75% (means at 12 it doubles the last value i.e 16*2 = 32)
        ArrayList<Integer> arrayList1 = new ArrayList<>(5);
        arrayList1.add(34);
        arrayList1.add(4);
        arrayList1.add(7);
        arrayList1.add(94);
        arrayList1.add(31);
//        print(arrayList1);
        printUsingIterator(arrayList1);

//        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5}));
//        print(arrayList2);

//        Integer a[] ={1,2,3,4,5};
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        Collections.addAll(arrayList,a);
//        print(arrayList);

//        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(11,12,13,14,15));
//        print(arrayList3);

        //SET
        arrayList1.set(2,78);// .set(position,value);
        print(arrayList1);

        //ADD At SPECIFIC POSITION
        arrayList1.add(3,53);
        print(arrayList1);

        //Removing element
//        arrayList1.remove(Integer.valueOf(94));
//        print(arrayList1);

        // Removing index based element
//        arrayList1.remove(2);
//        print(arrayList1);

//        int element = 48;
//
//        if(arrayList1.contains(element)){
//            System.out.println("Element "+element+" "+"found");
//        } else {
//            System.out.println("Element "+element+" "+"Not Found");
//        }

        //Remove all elements but arrayList will exist with 0 elements
        arrayList1.clear();
//
        System.out.println("Size of Arraylist "+arrayList1.size());

        //Array of ArrayList
//        ArrayofArrayList arrayofArrayList = new ArrayofArrayList(3);
//        arrayofArrayList.setArrayofArrayList();
//        arrayofArrayList.initialiseArrayofArrayList();
//        arrayofArrayList.printArrayofArrayList();

        //ArrayList of ArrayList
//        ArrayListOfArrayList arrayListOfArrayList = new ArrayListOfArrayList();
//        arrayListOfArrayList.setArrayListOfArrayList();
//        arrayListOfArrayList.initialiseArrayListOfArrayList();
//        arrayListOfArrayList.printArrayListOfArrayList();
    }
}


class ArrayofArrayList {
    int n;
    ArrayList<Integer> myArrayList[];

    ArrayofArrayList(int n) {
        this.n = n;
    }

    void setArrayofArrayList() {
        myArrayList = new ArrayList[n];

//        for (int i = 0; i < n; i++) {
//            myArrayList[i] = new ArrayList<>();
//        }

    }

    void initialiseArrayofArrayList(/*int i, int value*/ /*For Dynamic Initilization*/) {
//        myArrayList[i] = new ArrayList<>(); // we can also do like this if we would have not defined memory using for loop
        myArrayList[0].addAll(Arrays.asList(56, 45, 34, 23, 12));
        myArrayList[1].addAll(Arrays.asList(6, 5, 134, 37, 2));
        myArrayList[2].addAll(Arrays.asList(572, 95, 374, 293, 892));
//        myArrayList[i].add(value); // For Dynamic Initilization
    }

    ArrayList<Integer>[] getArrayofArrayList() {
        return myArrayList;
    }

    void printArrayofArrayList() {
        for (int i = 0; i < myArrayList.length; i++) {

            System.out.println((i + 1) + " Arraylist elements are as:- ");

            for (int j = 0; j < myArrayList[i].size(); j++) {
                System.out.print(myArrayList[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}

class ArrayListOfArrayList {

    ArrayList<ArrayList<Integer>> arrayListArrayList;

    void setArrayListOfArrayList() {
        arrayListArrayList = new ArrayList<>();
    }

    void initialiseArrayListOfArrayList() {
//        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
//        arrayList1.addAll(Arrays.asList(134, 437, 84, 3, 9812));
//        or,
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(134, 437, 84, 3, 9812));

//        Integer a[] = {1,2,3,45};
//        ArrayList<Integer> abcd = new ArrayList<>();
//        abcd.addAll(Arrays.asList(a));

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.addAll(Arrays.asList(564, 7, 634, 903, 172));


        arrayListArrayList.addAll(Arrays.asList(arrayList1, arrayList2)); // arrayListArrayList accepts ArrayList of ArrayList
        /*
           Note:- Here we can't write arrayListArrayList.addAll(arrayList1, arrayList2);
           because, addAll() method accepts *** LIST *** of type ArrayList
            but, we are passing arraylists so, we need to convert it into LIST.

            Example:- ArrayList<Integer> a = new ArrayList<>();
            a.addAll(1,2,3,43,5); // WRONG
            a.addAll(Arrays.asList(1,2,3,43,5)); // a accepts List of Integers
         */
    }


    void printArrayListOfArrayList() {


//        for(int i=0;i<arrayListArrayList.size();i++){
//            System.out.println((i + 1) + " Arraylist elements are as:- ");
//            for(int j=0;j<arrayListArrayList.get(i).size();j++){
//                System.out.print(arrayListArrayList.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }


        for (ArrayList<Integer> arrayList : arrayListArrayList) {

            System.out.println(" Arraylist elements are as:- ");
            for (int a : arrayList) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
