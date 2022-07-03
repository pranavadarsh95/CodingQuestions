package Sorting;

public class MergeSort {


    private static void mergefun(int[] a, int x, int mid, int y) {

        int fSize = mid-x+1;
        int sSize = y - mid;
        int first[] = new int[fSize];
        int second[] = new int[sSize];
        int k=0;

        for(int i=x;i<=mid;i++){
            first[k++] = a[i];
        }
        k=0;

        for(int i=mid+1;i<=y;i++){
            second[k++] = a[i];
        }

        int i=0,j=0;
        k=x;

        while(i<fSize && j<sSize){
            if(first[i]<second[j]){
                a[k++]=first[i];
                ++i;
            }
            else{
                a[k++]=second[j];
                ++j;
            }
        }

        if(i<fSize){
            while(i<fSize) {
                a[k++] = first[i];
                ++i;
            }
        }

        if(j<sSize){
            while(j<sSize) {
                a[k++] = second[j];
                ++j;
            }
        }
    }

    static void merge(int[] a,int x,int y){
        if(x<y){
            int mid = x+(y-x)/2;

            merge(a,x,mid);
            merge(a,mid+1,y);
            mergefun(a,x,mid,y);
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
        System.out.println("After Performing Merge Sort");

        merge(a,0,a.length-1);

        print(a);
    }
}
