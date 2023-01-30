package StriverRecursion;

import java.util.ArrayList;

public class PrintAllSubSequences {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int arraySize = a.length;

        ArrayList<Integer> subSequences = new ArrayList<>();
        prSub(0,subSequences,a,arraySize);
    }

    private static void printSubSequences(ArrayList<Integer> subSequences) {
        for(int ele : subSequences){
            System.out.print(ele);
        }
        System.out.println();
    }

    private static void prSub(int i, ArrayList<Integer> subSequences, int[] a, int arraySize) {
        if(i>=arraySize){
            printSubSequences(subSequences);
            return;
        }
        subSequences.add(a[i]); // pick
        prSub(i+1, subSequences, a, arraySize);
        subSequences.remove(subSequences.size()-1); // // here, we are removing last added element from arraylist
        prSub(i+1, subSequences, a, arraySize); // Not pick
    }
}
