package CommonCodes;

public class rotateArrayByKth {

    public static void main(String[] args) {
        int a[] = {2,4,1,6,3,8,9,34,21};
        int k = 7;
        System.out.println("Array before Sorting:- ");
        printArray(a);
        rotateByKth(a,k);
        System.out.println();
        System.out.println("Array after Sorting:- ");
        printArray(a);
    }

    private static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
    }

    private static void rotateByKth(int[] a, int k) {
        int n = a.length;
        if(a==null || k==n) return;

        if(k>n){
            k = k % n;
        }

        swap(a,0,n-1);
        swap(a,0,k-1);
        swap(a,k,n-1);
    }

    private static void swap(int[] a, int x, int y) {
        int t;
        while(x<y) {
            t = a[x];
            a[x] = a[y];
            a[y] = t;
            x++; y--;
        }
    }
}
