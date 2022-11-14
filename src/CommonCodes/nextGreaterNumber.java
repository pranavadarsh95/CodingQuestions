package CommonCodes;

//Input:  n = "218765"
//Output: "251678"
//
//Input:  n = "1234"
//Output: "1243"
//
//Input: n = "4321"
//Output: "Not Possible"
//
//Input: n = "534976"
//Output: "536479"

// https://www.geeksforgeeks.org/find-next-greater-number-set-digits/

// practice:- https://practice.geeksforgeeks.org/problems/next-permutation/0

import java.util.ArrayList;
import java.util.List;

public class nextGreaterNumber {
    static List<Integer> nextPermutation(int N, int arr[]){

        int n = arr.length;
        int i;

        for(i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                swapWithMinValue(arr,i,arr[i-1]);
                break;
            }
        }

        reverse(arr,i,n-1);

        List<Integer> list = new ArrayList<>();

        for(i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        return list;
    }

    static void swapWithMinValue(int arr[], int index, int value){
        int n = arr.length;
        int i;

        for(i=n-1;i>=index;i--){
            if(arr[i]>value)
                break;
        }

        swap(arr,i,index-1);
    }

    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;--j;
        }
    }
}
