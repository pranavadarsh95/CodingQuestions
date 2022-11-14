package RecursionAndDP;

import java.util.ArrayList;
import java.util.List;

public class subsequenceWithGivenSum {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,1};
        int target = 5;

//        In this we are using same elements with different combinations
//        int a[] ={1,1,1,2,2};
//        int target = 4;
//        That's why, getting output as below ones
//        1 1 2
//        1 1 2
//        1 1 2
//        1 1 2
//        1 1 2
//        1 1 2
//        2 2
        int sum = 0;
        int i = 0, n = a.length;
        List<Integer> list = new ArrayList<>();

        funPrint(a, target, sum, i, n, list);
    }

    private static void funPrint(int[] a, int target, int sum, int i, int n, List<Integer> list) {
        if(i>=n){
            if(sum == target){
                printList(list);
            }
            return;
        }

        list.add(a[i]);
        sum += a[i];
        funPrint(a,target,sum,i+1,n,list);

        sum -= a[i];
        list.remove(list.size()-1);
        funPrint(a,target,sum,i+1,n,list);
    }

    private static void printList(List<Integer> list) {
        if(list.isEmpty())
            System.out.println("{}");
        else {
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
