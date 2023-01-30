package CommonCodes;

public class KthSmallestElement {

    /*
     * Important Points
     * As we want Kth Smallest element means we need numbers in Increasing order (smaller to larger) ex:- 8,9,10 so on...
     * j which points before l(starting of array) at the start
     * before j or equal to it elements would be smaller than pivot
     * so, i will stop for swap only when it finds element smaller or equal than pivot otherwise it will keep moving
     *
     * Note:- Time Complexity: O(N2) in worst case and O(N) on average
     * */

    private static int partition(int[] a, int l, int h) {
        int pivot = a[h];
        int j = l-1;

        for(int i=l;i<h;i++){
            if(a[i]<=pivot){
                ++j;
                swap(a,j,i);
            }
        }
        swap(a,j+1,h);
        return j+1;
    }

    private static int kthSmallestElement(int[] a, int l, int h, int k) {
        int pos = partition(a,l,h);

        if(pos==k-1) return a[pos];
        else if(pos>k-1){
           return  kthSmallestElement(a,l,pos-1,k);
        }
        else{
           return  kthSmallestElement(a,pos+1,h,k);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void print(int a[]){
        System.out.println("Below are the elements:- ");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {76,89,23,45,12,90,34,87,3,5,1,90,345,27};
        print(a);
        System.out.println("Kth Smallest element is as:- ");
        int k = 5;
        int element = kthSmallestElement(a,0,a.length-1,k);

        System.out.print(element);
    }
}
