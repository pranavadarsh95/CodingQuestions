package Rough.ForthCompany.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {10, 34, 23, 89, 39, 31, 7, 54, 41, 98, 47, 3, 8, 92, 105};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));

    }

    static void selectionSort(int[] a){
        int n = a.length;
        int minPos;

        for(int i = 0; i < n-1; i++){
            minPos = i;
            for(int j = i+1; j < n; j++){
                if(a[minPos] > a[j]){
                    minPos = j;
                }
            }
            swap(a, minPos, i);
        }
    }

    static void swap(int a[], int x, int y){
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }
}
