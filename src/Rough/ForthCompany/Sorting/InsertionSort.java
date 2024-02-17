package Rough.ForthCompany.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {10, 34, 23, 89, 39, 31, 7, 54, 41, 98, 47, 3, 8, 92};
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void insertionSort(int a[]){
        int j, pos;
        int n = a.length;
        for(int i = 1 ; i < n; i++){
            pos = a[i];
            j = i-1;

            while(j >= 0 && a[j] >= pos){
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = pos;
        }
    }
}
