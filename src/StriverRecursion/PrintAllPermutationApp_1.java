package StriverRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllPermutationApp_1 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        List<List<Integer>> list = new ArrayList<>();

        boolean b[] = new boolean[a.length];

        findPermute(a, list, b, new ArrayList<>());
//        printArrayList(list);
        System.out.println(list);
    }
    private static void printArrayList(List<List<Integer>> list) {
        for (List<Integer> integerList : list) {
            for (int i : integerList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void findPermute(int[] nums, List<List<Integer>> list, boolean b[], List<Integer> ds){
        if(ds.size()==nums.length){
            list.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(b[i]==false){
                ds.add(nums[i]);
                b[i] = true;
                findPermute(nums,list,b,ds);
                b[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}
