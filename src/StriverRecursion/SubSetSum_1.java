package StriverRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubSetSum_1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>(Arrays.asList(5, 2, 1));
        ArrayList<Integer> list = new ArrayList<>();
        findSubsetSum(0,a,0,list);
        Collections.sort(list);
//        printArrayList(list);
        System.out.println(list);
    }
    private static void printArrayList(List<Integer> list) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    static void findSubsetSum(int i, ArrayList<Integer> arr, int sum, ArrayList<Integer> list){
        if(i>=arr.size()) {
            list.add(sum);
            return;
        }

        sum = sum + arr.get(i);
        findSubsetSum(i+1, arr, sum, list); // pick element
        sum = sum - arr.get(i);
        findSubsetSum(i+1, arr, sum, list); // non-pick element

    }
}
