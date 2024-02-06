package Collections;

import java.util.ArrayList;
import java.util.List;

public class StoreArrayListOfArraylistBasedOnIndex {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        int a[] = {1,2,3,4,5,6,7,8};

        for(int i=0;i<3;i++){
            list.add(i,new ArrayList<Integer>());
        }

        for(int i=0; i<a.length; i++){
            if(a[i]%3 == 0){
                list.get(0).add(a[i]);
            }
            else if(a[i]%3 == 1){
                list.get(1).add(a[i]);
            }
            else {
                list.get(2).add(a[i]);
            }
        }

        System.out.println(list);
    }
}
