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

        int[] arr = {5, 24, 3, 12, 1};
        int n = arr.length;
//        bubbleSort(arr,n);
//        print(arr);
        selectionSort(arr, n);
        print(arr);
//        insertionSort(arr, n);
//        print(arr);
    }

    private static void insertionSort(int[] arr, int n) {
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

        we got 3nd max ele at the 3nd last pos
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
