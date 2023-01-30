package StriverRecursion;

import java.util.*;

public class CombinationSum_2 {
    public static void main(String[] args) {
        int a[] = {2, 3, 6, 7};
        int target = 9;
//        Solution 1 which uses pick and non-pick technique its complexity is very high and throws TLE error
/*
        HashSet<List<Integer>> set = new HashSet<>();
        findCombination1(0, a, target, set, new ArrayList<Integer>());

        Iterator<List<Integer>> iterator = set.iterator();
        List<List<Integer>> list = new ArrayList<>();

        while(iterator.hasNext()){
            list.add(iterator.next());
        }

        printArrayList(list);*/

        // Solution 2
        List<List<Integer>> list = new ArrayList<>();
        int n = a.length;
        Arrays.sort(a);
        findCombination2(0, a, target, list, new ArrayList<Integer>(),n);
        printArrayList(list);
    }

    private static void printArrayList(List<List<Integer>> list) {
        for (List<Integer> integerList : list) {
            for (int i : integerList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

   static void findCombination1(int index, int[] a, int target, HashSet<List<Integer>> set, List<Integer> ds) {

        if (target == 0) {
            List<Integer> temp = new ArrayList<>(ds);
            Collections.sort(temp);
            set.add(new ArrayList<Integer>(temp));
            return;
        }
        if (index >= a.length) {
            return;
        }

        if (target >= a[index]) {
            ds.add(a[index]);
            findCombination1(index + 1, a, target - a[index], set, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination1(index + 1, a, target, set, ds);
    }
    static void findCombination2(int index, int[] candidates, int target, List<List<Integer>> list, List<Integer> ds, int n){
        if(index==n || target==0){
            if(target==0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }

        for(int i=index; i<n; i++){
            if(target>=candidates[i]){
                if( i!=index && candidates[i-1]==candidates[i]){
                    continue;
                }
                ds.add(candidates[i]);
                findCombination2(i+1, candidates, target-candidates[i], list, ds, n);
                ds.remove(ds.size()-1);
            }
        }
    }

}

