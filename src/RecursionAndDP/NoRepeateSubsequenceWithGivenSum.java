package RecursionAndDP;

import java.util.ArrayList;
import java.util.List;

public class NoRepeateSubsequenceWithGivenSum {
    public static void main(String[] args) {
        int a[] ={1,1,1,2,2};
        int target = 4;

        int n = a.length;
        List<List<Integer>> finalList = new ArrayList<>();
        int ind = 0;

        finalList = countSubsequenceWithoutRepetition(ind, a, target, n, finalList, new ArrayList<Integer>());
        printArrayList(finalList);
    }

    private static List<List<Integer>> countSubsequenceWithoutRepetition(int ind, int[] a, int target, int n, List<List<Integer>> finalList, ArrayList<Integer> tempList) {
        if(ind>n) return null;
        if(target == 0) {
         finalList.add(new ArrayList<>(tempList));
         return finalList;
      }
      for(int i = ind; i<n; i++){
          if(i>ind && a[i]==a[i-1]) continue;
          if(a[i]>target) break;
              tempList.add(a[i]);
              countSubsequenceWithoutRepetition(i+1,a,target-a[i],n,finalList,tempList);
              tempList.remove(tempList.size()-1);
      }
      return finalList;
    }

    private static void printArrayList(List<List<Integer>> list) {
        for(List<Integer> integerList : list){
            for (int i : integerList){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
