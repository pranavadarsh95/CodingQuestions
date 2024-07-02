package Rough.ForthCompany.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {10, 34, 23, 89, 39, 31, 7, 54, 41, 98, 47, 3, 8, 92};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));

    }

    static void bubbleSort(int[] a){
        int n = a.length;
        boolean turn = true;

        for(int i = 0; turn && i < n; i++){
            turn = false;
            for(int j = 0; j < n-1-i; j++){
                if(a[j] > a[j+1]){
                    turn = true;
                    swap(a, j, j+1);
                }
            }
        }
    }

   static void swap(int a[], int x, int y){
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
   }
}
