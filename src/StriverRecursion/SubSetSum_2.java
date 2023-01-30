package StriverRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubSetSum_2 {
    public static void main(String[] args) {
        int a[] = {1,2,2};
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);
        findSubset(0, a, list, new ArrayList<>());
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

   static void findSubset(int i, int[] nums, List<List<Integer>> list, List<Integer> ds){
        // No need of below statement due to loop which will not go beyond nums.length for method call
        // if(i>nums.length) return;

        list.add(new ArrayList<>(ds));

        for(int index = i; i<nums.length; i++){
            if(index!=i && nums[i-1]==nums[i]) continue;
            ds.add(nums[i]);
            findSubset(i+1,nums,list,ds);
            ds.remove(ds.size()-1);
        }
    }
}
