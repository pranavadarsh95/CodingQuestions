package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreListInsideMapBasedOnIndex {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        int a[] = {1,2,3,4,5,6,7,8};

        for(int i=0; i<a.length; i++){
            if(a[i]%3 == 0){
                if(!map.containsKey(0)) map.put(0,new ArrayList<>());
                map.get(0).add(a[i]);
            }
            else if(a[i]%3 == 1){
                if(!map.containsKey(1)) map.put(1,new ArrayList<>());
                map.get(1).add(a[i]);
            }
            else {
                if(!map.containsKey(2)) map.put(2,new ArrayList<>());
                map.get(2).add(a[i]);
            }
        }

        System.out.println(map);
    }
}
