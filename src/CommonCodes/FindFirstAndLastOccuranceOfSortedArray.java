package CommonCodes;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastOccuranceOfSortedArray {
  static  ArrayList<Long> find(long a[], int n, int x)
    {
        int left, right;
        left = bs(a,0,n-1,x);
        while(left!=-1 && left>0 && a[left-1]==x)
            left = bs(a,0,left-1,x);
        right = bs(a,0,n-1,x);
        while(right!=-1 && right<n-1 && a[right+1]==x)
            right = bs(a,right+1,n-1,x);
        return new ArrayList<Long>(Arrays.asList((long)left,(long)right));
    }

    static int bs(long a[], int l, int h, int x){

        while(l<=h){
            int m = l+(h-l)/2;

            if(a[m]==x) return m;
            else if(a[m]>x){
                h = m-1;
            } else {
                l = m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long arr[] = { 1L, 2L, 2L, 2L, 2L, 3L, 4L, 7L, 8L, 8L };
        int x = 2;
        ArrayList<Long> arrayList = find(arr,arr.length, x);
        System.out.println("First occurance of element "+arrayList.get(0)+" "+"Last occurance of element "+arrayList.get(1));
    }
}
