package StriverRecursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int a[] = {2,3,6,7};
        int target = 9;

        List<List<Integer>> list = new ArrayList<>();
        int n = a.length;

        combinationSum(a, 0, n, target, list, new ArrayList<Integer>());

        printArrayList(list);
    }

    private static void printArrayList(List<List<Integer>> list) {
        for(List<Integer> integerList : list){
            for (int i : integerList){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void combinationSum(int[] a, int i, int n, int target, List<List<Integer>> list, List addList) {
       if(i>=n) return;

            if(target == 0){
                list.add(new ArrayList<>(addList));
                return;
            }

        if(a[i]<=target){
            addList.add(a[i]);
            // we pick the element but don't move the index
            combinationSum(a,i,n,target-a[i],list,addList);
            addList.remove(addList.size()-1);
        }
        // we don't pick the element but move the index
        combinationSum(a,i+1,n,target,list,addList);
    }
}
