package StriverRecursion;

import java.util.ArrayList;

public class SubSequenceWithGivenSum {
    public static void main(String[] args) {
        int a[] = {2,3,2,5,1,4};
        int sum = 5;
        int arraySize = a.length;

        ArrayList<Integer> subSequences = new ArrayList<>();

        printSubSequenceWithSum(0,sum,0,a,arraySize,subSequences);
    }

    private static void printSubSequenceWithSum(int i, int sum,int mySum, int[] a, int arraySize, ArrayList<Integer> subSequences) {
        if(i>=arraySize || mySum>sum){
            if(mySum==sum){
                printSubSequences(subSequences);
            }
            return;
        }

        subSequences.add(a[i]);
        mySum = mySum+a[i];
        printSubSequenceWithSum(i+1,sum,mySum, a, arraySize, subSequences);
        subSequences.remove(subSequences.size()-1);
        mySum = mySum-a[i];
        printSubSequenceWithSum(i+1,sum,mySum, a, arraySize, subSequences);
    }

    private static void printSubSequences(ArrayList<Integer> subSequences) {
            for (int ele : subSequences) {
                System.out.print(ele);
            }
            System.out.println();
    }
}
