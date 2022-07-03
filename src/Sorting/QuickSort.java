package Sorting;

public class QuickSort {

    private static int findPivot(int[] a, int x, int y) {

        int pivot = a[y];

        int j=x-1;

//        Note:- the numbers between indices (j to i) would be greater than pivot element(a[y])
//        and j will always point to lesser than pivot or at index -1, so need to move 1 step forward and swap with
//        smaller value which is pointed by ith index

        for(int i=x;i<y;i++){
            if(a[i]<=pivot){
                ++j;
                swap(a,i,j);
            }
        }
        swap(a,j+1,y);
        return j+1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void quick(int[] a, int x, int y) {
        if(x<y){
            int pivot = findPivot(a,x,y);
//            System.out.println("Pivot value "+pivot);
            quick(a,x,pivot-1);
            quick(a,pivot+1,y);
        }
    }

    static void print(int a[]){
        System.out.println("Below are the elements:- ");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {89,76,89,23,45,12,90,34,87,23,3,5,1,90,345,27,89};
        print(a);
        System.out.println("After Performing Quick Sort");

        quick(a,0,a.length-1);

        print(a);
    }


}


