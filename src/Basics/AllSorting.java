package Basics;

// To format code => ctrl+alt+shift+L

public class AllSorting {
    public static void main(String[] args) {
        /*
        .bubble - best(o(n)) worst(o(n2))
        .selection - best(o(n2)) worst(o(n2))
        .insertion - best(o(n)) worst(o(n2))
        .merge - best(o(nlogn)) worst(o(nlogn))
        .quick - best(o(nlogn) worst(n2)
        .heap - best(o(nlogn)) worst(o(nlogn))
        */

        int[] arr = {5, 24, 3, 12, 1, 8};
        int n = arr.length;
//        bubbleSort(arr,n);
//        print(arr);
//        selectionSort(arr, n);
//        print(arr);
//          insertionSort(arr, n);
//          print(arr);
          mergesort(arr, 0 , n-1);
          print(arr);
          quicksor(arr, 0, n-1);
    }

    private static void quicksor(int[] arr, int l, int r) {
        if(l < r){
            int pivot = quick(arr, l, r);
            quicksor(arr, l, pivot-1);
            quicksor(arr, pivot+1, r);
        }
    }

    private static int quick(int[] arr, int l, int r) {
        int p = l-1;
        int pivot = arr[r];
        for(int q = l; q < r; q++){
            if(arr[q]<=pivot){
                ++p;
                swap(arr, p, q);
            }
        }
        swap(arr, p+1, r);
        return p+1;
    }

    private static void mergesort(int[] arr, int l, int r) {
        if(l<r){
            int mid = l + (r-l)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int leftS = mid - l + 1;
        int rightS = r - mid;

        int a[] = new int[leftS];
        int b[] = new int[rightS];

        int p=0;
        for(int i=l; i<=mid; i++){
            a[p++] = arr[i];
        }
        p=0;
        for(int i=mid+1; i<=r; i++){
            b[p++] = arr[i];
        }

       int i=0, j=0,k=l;
       while(i<leftS && j<rightS){
           if(a[i] < b[j]){
               arr[k++] = a[i];
               ++i;
           }
           else {
               arr[k++] = b[j];
               ++j;
           }
       }

       if(i<leftS) {
           while (i < leftS) {
               arr[k++] = a[i];
               ++i;
           }
       }

       if(j<rightS) {
           while (j < rightS) {
               arr[k++] = b[j];
               ++j;
           }
       }
    }

    private static void insertionSort(int[] arr, int n) {
        int j, key;
        for(int i=1; i<n; i++){
            j = i-1;
            key = arr[i];  // if we are not keeping iTh value in key then after arr[j+1] = arr[j], arr[i] value would be overright
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    private static void selectionSort(int[] arr, int n) {
        /* Selection Sort
         /*given => 5 24 3 12 1
        output => assending order 1 3 5 12 24  */


       /*  5 24 3 12 1
        i=0;
        take an variable p = i(by default) (storing index)
        1 => 5 24 3 12 1      p = i
        2 => 5 24 3 12 1      p = 2
        3 => 5 24 3 12 1      p = 2
        4 => 5 24 3 12 1      p = 4

        now we will swap(i,p)
        OutPut:- 1 24 3 12 5

        i = 1, p = i
        1 => 1 24 3 12 5    p = 2
        2 => 1 24 3 12 5    p = 2
        3 => 1 24 3 12 5    p = 2

        now we will swap(i,p)
        OutPut:- 1 3 24 12 5

        i = 2, p = i

        1 => 1 3 24 12 5    p = 3
        2 => 1 3 24 12 5    p = 4

        now we will swap(i,p)
        OutPut:- 1 3 5 12 24

        i = 3, p = i

        1=> 1 3 5 12 24 p = i

        no need to move forward or to swap         */
        int p;
        for(int i = 0; i < n-1; i++){
            p = i;
            for(int j = i + 1; j < n; j++){
                if(arr[p] > arr[j]) p = j;
            }
            swap(arr,i,p);
        }

//        Question:- when should we use selection sort? Ans:- when need less swap
//        Question:- why can't we reduce complexity to 0(n) from 0(n2) in best? Ans:- think for input 1 2 3 5 4
    }


    private static void bubbleSort(int[] arr, int n) {
        // bubble sort

        /*given => 5 24 3 12 1
        output => assending order 1 3 5 12 24  */


       /* 5 24 3 12 1
            we got max ele at the last
       1 =>  5 24 3 12 1
       2 =>  5 3 24 12 1
       3 =>  5 3 12 24 1
       4 =>  5 3 12 1 24

        we got 2nd max ele at the 2nd last pos
        1 => 3 5 12 1 24
        2 => 3 5 12 1 24
        3 => 3 5 1 12 24

        we got 3rd max ele at the 3rd last pos
        1 => 3 5 1 12 24
        2 => 3 1 5 12 24

            we got sorted elements in increasing order
        1 => 1 3 5 12 24

        n=5
        0,1,2,,,,,n-1(4)

*/


//        first approach
        boolean turn = true;

        for (int i = 0; turn && i < n - 1; i++) {
            turn = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    turn = true;
                }
            }
        }

// second approach

//        for(int i = n-2; i >= 0 ; i--){
//            int count = 0;
//            for(int j =0; j <= i; j++){
//                if(arr[j] > arr[j+1]){
//                    swap(arr,j,j+1);
//                    count++;
//                }
//            }
//            if(count == 0) break;
//        }

    }

    private static void print(int[] arr) {
        System.out.print("Printing array elements of size " + arr.length + " " + " => ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
