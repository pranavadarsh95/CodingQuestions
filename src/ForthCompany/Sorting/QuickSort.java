package Rough.ForthCompany.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 4, 23, 12, 6, 890, 3, 25, 9};

        System.out.println(Arrays.toString(a));
        quick(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    static void quick(int a[], int start, int end){
        if(start < end){
            int pivot = quickSort(a, start, end);
            System.out.println(" pivot value as "+ pivot+" "+a[pivot]);
            quick(a, start, pivot - 1);
            quick(a, pivot + 1, end);
        }
    }

    private static int quickSort(int[] a, int start, int end) {

        int pivot = end;
        int j = start - 1;
        for(int i = start; i < end; i++){
            if(a[i] <= a[pivot]){
                ++j;
                swap(a, i, j);
            }
        }

        swap(a, pivot, ++j);

        return j;
    }

    private static void swap(int a[], int x, int y){
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
}
