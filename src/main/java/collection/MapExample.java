package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {

        System.out.println("-------------------------------↓↓↓ HashMap ↓↓↓--------------------------");

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("가", 100);
        hashMap.put("다", 80);
        hashMap.put("나", 150);

        System.out.println(hashMap.keySet());   // [가, 다, 나]
        System.out.println(hashMap.values());   // [100, 80, 150]

        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }

        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }

        System.out.println(hashMap.remove("가"));    // 100

        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " // " + hashMap.get(key));
        }

        System.out.println(hashMap.size());

        System.out.println("-------------------------------↑↑↑ HashMap ↑↑↑--------------------------");

        System.out.println("-------------------------------↓↓↓ TreeMap ↓↓↓--------------------------");

        TreeMap<String, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());

        treeMap.put("가", 100);
        treeMap.put("다", 80);
        treeMap.put("나", 150);

        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

        System.out.println("-------------------------------↑↑↑ TreeMap ↑↑↑--------------------------");

        System.out.println("-------------------------------↓↓↓ Hashtable ↓↓↓--------------------------");

        System.out.println("-------------------------------↑↑↑ Hashtable ↑↑↑--------------------------");

    }
}
