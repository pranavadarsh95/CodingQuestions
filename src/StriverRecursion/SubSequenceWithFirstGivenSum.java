package StriverRecursion;

import java.util.ArrayList;

public class SubSequenceWithFirstGivenSum {
    public static void main(String[] args) {
        int a[] = {2,3,2,5,1,4};
        int sum = 18;
        int arraySize = a.length;

       boolean result =  printSubSequenceWithSum(0,sum,0,a,arraySize);

       if(result == true)
           System.out.println("SubSequence found");
       else
           System.out.println("Subsequence Not Found");
       }

    private static boolean printSubSequenceWithSum(int i, int sum,int mySum, int[] a, int arraySize) {
        if(i>=arraySize || mySum>sum){
            if(mySum==sum){
               return true;
            }
            return false;
        }

        mySum = mySum+a[i];
       if(printSubSequenceWithSum(i+1,sum,mySum, a, arraySize) == true)
           return true;

        mySum = mySum-a[i];

        if(printSubSequenceWithSum(i+1,sum,mySum, a, arraySize) == true)
            return true;

        return false;
    }
}
