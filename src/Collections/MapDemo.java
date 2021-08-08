package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {


    static void print(Map<Integer, Integer> map) {

        System.out.println("Elements printed using Without Iterator:- ");

        // print Both Keys and Values
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        // Print only Keys
//        for(Integer key: map.keySet()){
//            System.out.print(key+" ");
//        }
//       System.out.println();

        // Print Only Values
//        for(Integer value: map.values()){
//            System.out.print(value+" ");
//        }
//        System.out.println();

    }

    static void printUsingIterator(Map<Integer, Integer> map) {

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        System.out.println("Elements printed using Iterator:- ");

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Map is a Interface
        // HashMap is a class
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 50);
        map.put(2, 510);
        map.put(3, 890);
        map.put(4, 9560);
        map.put(5, 586);
//        print(map);

// Add map in other map
//        Map<Integer,Integer> map2 = new HashMap<>();
//        map2.putAll(map);
//        print(map2);

//        Map<Integer,Integer> map3 = new HashMap<>(map);
//        print(map3);

//        Map<Integer,Integer> map4 = new HashMap<Integer, Integer>(){{
//            put(10,20);
//            put(30,79);
//            put(10,50); // key will replace previous same key value
//            put(30,909); // key will replace previous same key value
//        }};
//        print(map4);

        // Changing map elements
        map.put(2, 650);
        print(map);

        // Remove map elements using KEY
//        map.remove(4);
//        print(map);

        map.remove(new Integer(9560));
        print(map);
    }
}
