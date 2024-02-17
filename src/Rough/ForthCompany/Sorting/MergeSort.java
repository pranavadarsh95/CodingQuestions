package Rough.ForthCompany.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {10,2,4,67,89,56,890,34,23,63};
        System.out.println(Arrays.toString(a));

         merge(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }

    static void merge(int a[], int start, int end){
       if(start < end){
           int mid = start + ((end - start) / 2);
           merge(a, start, mid);
           merge(a, mid+1, end);

           mergeSort(a, start, mid, end);
       }


    }

    private static void mergeSort(int[] a, int start, int mid, int end) {
        List<Integer> list = new ArrayList<>();
        int x = start;
        int y = mid+1;

        while(x <= mid && y <=end){
            if(a[x] < a[y]){
                list.add(a[x++]);
            } else if (a[x] > a[y]) {
                 list.add(a[y++]);
            } else{
                list.add(a[x++]);
                list.add(a[y++]);
            }
        }

        while(x <= mid){
            list.add(a[x++]);
        }

        while(y <= end){
            list.add(a[y++]);
        }

        for(int i = start ; i<=end ; i++){
            a[i] = list.get(i-start);
        }
    }
}
