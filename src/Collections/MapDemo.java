package Collections;

import java.util.*;

/*
A HashMap is implemented as a Hash table, a TreeMap is implemented as a Red-Black Tree,
and LinkedHashMap is implemented as a doubly-linked list buckets in Java.
 */

// https://www.techiedelight.com/difference-between-hashmap-treemap-linkedhashmap-java/
// https://www.geeksforgeeks.org/differences-treemap-hashmap-linkedhashmap-java/

/*
Assuming the hash method disperses the elements properly among the buckets,
 HashMap and LinkedHashMap offers O(1) time performance for the basic operations such as get,
  put, containsKey, remove, etc., On the other hand, TreeMap guarantees O(log(n))
   time cost for these operations.

Please note that due to the added expense of maintaining the doubly-linked list,
 LinkedHashMap‘s performance is slightly lower than that of HashMap.
  So if performance is an issue, HashMap is preferred.
 */


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
        // HashMap, LinkedHashMap, TreeMap is a class
        Map<Integer, Integer> map;

        //HashMap
        /* HashMap makes no guarantees on the iteration order of the map.
        Also, the addition and removal of any element might change its iteration order.
         */
        map = new HashMap<>();

        // LinkedHashMap
        /* LinkedHashMap maintains a doubly-linked list through all of its entries.
         This linked list defines the iteration order, which is the order in which keys were inserted into the map.
         */
//        map = new LinkedHashMap<>();

      //TreeMap
      /*
      TreeMap, on the other hand, is iterated according to the natural ordering
       of its keys or according to the Comparator specified at the map’s creation time.
       */

//        map = new TreeMap<>();


        map.put(3, 890);
        map.put(2, 9560);
        map.put(5, 586);
        map.put(4, 9560);
        map.put(1, 50);
        map.put(6, 9560);

        print(map);

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
//        map.put(2, 650);
//        print(map);

        // Remove map elements using KEY
//        map.remove(4);
//        print(map);

        //Remove map element using [first found ***value***]
//        map.values().remove(9560); // IMPORTANT
//        print(map);

        //Remove map element using All found value
//        while(map.values().remove(9560)); // IMPORTANT
//        print(map);

        // It may have one null key and multiple null values. [null allowed for HashMap and LinkedHashMap
        // but TreeMap doesn't allow it.
//        map.put(null,null);
//        map.put(1,null);
//        map.put(2,null);
//        System.out.println(map.get(2));

        // Check if map contains given key
//        System.out.println(map.containsKey(4));

        // Check if map contains given value
//        System.out.println(map.containsValue(9560));

        // returns maximum element value present in map
//        System.out.println(Collections.max(map.values()));

        /*
        Collections.max(abc.values())
        Collections.min(abc.values())
        Collections.max(abc.keys())
        Collections.max(abc.keys())
         */

        // Check if map contains any element or not
//        System.out.println(map.isEmpty());

        // to remove every element from map
//        map.clear();
    }
}
