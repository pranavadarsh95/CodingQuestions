package CommonCodes;

public class KthLargestElement {

    private static int partition(int[] a, int l, int h) {
        int pivot = a[h];
        int j = l-1;

        for(int i=l;i<h;i++){
            if(a[i]>pivot){
                ++j;
                swap(a,j,i);
            }
        }
        swap(a,j+1,h);
        return j+1;
    }

    private static int kthLargestElement(int[] a, int l, int h, int k) {
        int pos = partition(a,l,h);

        if(pos==k-1) return a[pos];
        else if(pos>k-1){
            return  kthLargestElement(a,l,pos-1,k);
        }
        else{
            return  kthLargestElement(a,pos+1,h,k);
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
        System.out.println("Kth Largest element is as:- ");
        int k = 8;
        int element = kthLargestElement(a,0,a.length-1,k);

        System.out.print(element);
    }
}
