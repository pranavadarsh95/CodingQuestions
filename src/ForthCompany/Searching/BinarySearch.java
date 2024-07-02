package Rough.ForthCompany.Searching;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 112, 114, 180, 225, 450};
        int key = 112;
        int index = binarySearchWithRecursion(a, 0, a.length-1, key);
//        int index = binarySearchWitCoutRecursion(a, 0, a.length-1, key);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("Not found");
        }
    }

    private static int binarySearchWitCoutRecursion(int[] a, int start, int end, int key) {
        while (start <= end){
            int mid = end + (start - end) / 2;

            if(a[mid] == key){
                return mid;
            } else if(a[mid] > key){
               end = mid-1;
            } else{
               start = mid+1;
            }
        }
            return -1;
    }

    private static int binarySearchWithRecursion(int[] a, int start, int end, int key) {
        if (start <= end){
            int mid = end + (start - end) / 2;

            if(a[mid] == key){
                return mid;
            } else if(a[mid] > key){
                return binarySearchWithRecursion(a, start, mid-1, key);
            } else{
                return binarySearchWithRecursion(a, mid+1, end, key);
            }
        }
            return -1;
    }
}
