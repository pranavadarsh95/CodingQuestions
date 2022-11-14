package RecursionAndDP;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceWithGivenSumAndReturnCount {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,1};
        int target = 5;
        int sum = 0;
        int i = 0, n = a.length;

        System.out.println("Total count "+ funCount(a, target, sum, i, n));
    }

    private static int funCount(int[] a, int target, int sum, int i, int n) {
        if(i>=n){
            if(sum == target){
               return 1;
            }
            return 0;
        }

        sum += a[i];
        int lf = funCount(a,target,sum,i+1,n);

        sum -= a[i];
       int rt = funCount(a,target,sum,i+1,n);

       return lf+rt;
    }
}
