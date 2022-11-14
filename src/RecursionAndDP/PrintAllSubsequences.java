package RecursionAndDP;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        int a[] = {3,2,1};
        List<Integer> list = new ArrayList<>();
        printSubsequence(0,a,list,a.length);
    }

    private static void printSubsequence(int i, int[] a, List<Integer> list, int n) {
        if(i>=n){
            printList(list);
            return;
        }
        list.add(a[i]);
        printSubsequence(i+1, a, list, n);
        list.remove(list.size()-1); // here, we are removing last added element from arraylist
        printSubsequence(i+1, a, list, n);
    }

    private static void printList(List<Integer> list) {
        if(list.isEmpty())
            System.out.println("{}");
        else {
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
