package StriverRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllPermutationApp_2 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();

        findPermute(0, a, list);
//        printArrayList(list);
        System.out.println(list);
    }
    private static void printArrayList(List<List<Integer>> list) {
        for (List<Integer> integerList : list) {
            for (int i : integerList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void findPermute(int i, int [] a, List<List<Integer>> list){
     if(i>=a.length){
         List<Integer> ds = new ArrayList<>();
         for(int value:a){
             ds.add(value);
         }
         list.add(new ArrayList<>(ds));
         return;
     }

     for(int index=i; i<a.length; i++){
         swap(i, index, a);
         findPermute(index+1, a,list);
         swap(i, index, a);
     }
    }

    private static void swap(int i, int index, int[] a) {
        int temp = a[i];
        a[i] = a[index];
        a[index] = temp;
    }
}